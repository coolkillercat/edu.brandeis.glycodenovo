package edu.brandeis.glycodenovo.core;

import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffLoader;
import weka.classifiers.Classifier;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.*;
import edu.brandeis.glycodenovo.core.*;


public class CIonclassifier {
	
	public static final double massAccuracyPPM = 5;
	public static final double mergePeaksTreshold = 0.001;
	
    static ArrayList<Double> mMassFeatures = new ArrayList<>(); //store loaded mass features
    static HashMap<String, MyClassifier> mMyClassifier = new HashMap<>(); //store loaded random forest
    public static ArrayList<Double> mMassBound = new ArrayList<>(); //0 - lower bound 1 - upper bound default: (CMass.H * 1.5, 105.0)
	//static HashMap<String, Classifier> mClassifier = new HashMap<>(); store loaded Weka classifier never used
	//static HashMap<String, Instances> mDataset = new HashMap<>(); store Weka training data, never used
   
    public static boolean mUseOriginalPeaks = false; // true - Use original peak
    public static boolean mEnableX15 = false; // true - Enable X15
	//public static boolean mUseComplementFlag = false;  true - Use complement, never used
    
    public static double mMassAccuracy = 0.005; //the range to consider a context as a mass feature
    public static double mKeep_percentage = 0.9; // keep percentage in robust SD calculation
    //public static int mBoostNum = 100; training parameter, never used
    //public static double mHoldOut = 0.2; training parameter, never used
    
    public static final String mClassifierPath = "C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff"; //the path you store classifier
    public static final String mMassfeaturesPath = "C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff"; //the path you store mass features
    
    //save the score for each classifier
    public static final boolean saveRandomForestScore = false; 
    public static final String randomForestScorePath = "C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\save\\CTreescore.txt";
    public static final boolean saveIonScoreMap = true;
    public static final String ionScoreMapPath = "C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\save";

    /**
     * This method takes the reconstructed CPeaks and transfers them to DataVectors which can be easily classified. 
     * @param spectra - The reconstructed data.
     * @param massFeatures - External information generated from training set
     * @param massBound - Ignore mass outside this bound. Lower bound with subscript 0, upper bound with subscript 1.
     * @param massAccuracy - If difference between context and certain mass feature is lower than mass accuracy, then the peak has that mass feature.
     * @param useOriginalPeak - Use original peak flag
     * @param includeREM - Include REM flag
     * @return A size of 2 ArrayList. Subscript 0 - DataVector, subscript 1 - DataSignal
     * @see DataVectors @see DataSignals
     */
	public static List<Object> extract_data (ArrayList<CSpectrum> spectra, ArrayList<Double> massFeatures,
		ArrayList<Double> massBound, double massAccuracy, boolean useOriginalPeak, boolean includeREM) {
		HashSet<String> allREM = new HashSet<String>();
		allREM.add("");
		allREM.add("O18");
		allREM.add("Deuterium");
		allREM.add("Reduced");
		allREM.add("Aminopyridine");
		allREM.add("PRAGS");
		DataSignals dataSignals = new DataSignals();
		if (massBound == null || massBound.isEmpty()) {
			massBound = new ArrayList<Double>();
			massBound.add(CMass.H * 1.5);
			massBound.add(105.0);
		}
		for (int s = 0; s < spectra.size(); s++) {
			CSpectrum specU = spectra.get(s);
			ArrayList<CPeak> peaklist = (ArrayList<CPeak>) specU.getPeakList();
			if (peaklist.get(peaklist.size() - 1).getInferredSuperSets().isEmpty()) {
				continue;
			}
			boolean hasRequestREM = allREM.contains(specU.getReducingEndMode());
			ArrayList<Double> peakMasses = new ArrayList<>();
			ArrayList<Boolean> peakComplements = new ArrayList<>();
			ArrayList<Boolean> peakAvailable = new ArrayList<>(peaklist.size());
			for (int p = 0; p < peaklist.size(); p++) {
				peakAvailable.add(false);
			}
			for (CPeak peak : peaklist) {
				peakMasses.add(peak.getMass());
				peakComplements.add(peak.getComplementPeak() == null);
			}
			//A peak is available if it has formula.
			for (int p = 0; p < peaklist.size() - 1; p++) {
				if (! (peaklist.get(p).getInferredFormulas() == null || peaklist.get(p).getInferredFormulas().isEmpty())) {
					peakAvailable.set(p, true);
					if (useOriginalPeak && peaklist.get(p).getComplementPeak() == null) {
						peakAvailable.set(p, false);
						//@TODO: haven't tested this
						int index = peaklist.indexOf(peaklist.get(p).getOriginalPeak());
						peakAvailable.set(index, true);
					}
				}
			}
			int availablenum = 0;
			ArrayList<Integer> peakAvailableIDs = new ArrayList<>();
			for (int i = 0; i < peakAvailable.size(); i++) {
				if (peakAvailable.get(i)) {
					peakAvailableIDs.add(i);
					availablenum++;
				}
			}
			//System.out.println("availablenum: " + availablenum);
			//Only calculate the available peaks to save time.
			ArrayList<Object> peakIntensities = CIonclassifier.standardize_intensity(peaklist, "log", peakAvailableIDs);
			for (int k = 0; k < peaklist.size(); k++) {
				if (peaklist.get(k).getInferredFormulas() == null || peaklist.get(k).getInferredFormulas().isEmpty()) {
					continue;
				}
				for (CTopologySuperSet TSS : peaklist.get(k).getInferredSuperSets()) {
					if (TSS.mTopologies.isEmpty()) {
						 continue;
					}
					HashMap<Integer, Integer> mTargetPeaks = (HashMap<Integer, Integer>) TSS.mTargetPeaks;
					//@TODO: Should pMass add H or H2?
					double pMass = peakMasses.get(k);
					int type = mTargetPeaks.get(k);
					char iontype = 'B';
					switch (type) {
						case 1:
							iontype = 'B'; break;
						case 2:
							iontype = 'C';break;
					}
					ArrayList<Double> temp = new ArrayList<>();
					for (double peakMass : peakMasses) {
						temp.add(Math.abs(peakMass - pMass));
					}
					ArrayList<Integer> idx = new ArrayList<>();
					for (int i = 0; i < temp.size(); i++) {
						if (temp.get(i) < massBound.get(1) && temp.get(i) > massBound.get(0) && i != k) {
							idx.add(i);
						}
					}
					ArrayList<Double> c1 = new ArrayList<>();
					ArrayList<Double> c2 = new ArrayList<>();
					ArrayList<Double> c3 = new ArrayList<>();
					for (int i : idx) {
						c1.add(peakMasses.get(i) - pMass);
						c2.add(((ArrayList<Double>)peakIntensities.get(0)).get(i));
						c3.add((peakComplements.get(i)) ? (double)1 : (double)0);
					}
					ArrayList<ArrayList<Double>> context = new ArrayList<>();
					//System.out.println("dataSignals iontype: " + iontype + " k: " + k);
					context.add(c1); context.add(c2); context.add(c3);
					//save data signals
					dataSignals.addlast(iontype, pMass, k, peaklist.get(k).getComplementPeak(), ((ArrayList<Double>)peakIntensities.get(0)).get(k),
					context, s,	specU.getPrecursorMZ(), hasRequestREM, specU);
				}
			}
		}
		//save data vectors
		System.out.println("Converting into feature vectors ...");
		DataVectors testVectors = new DataVectors();
		int numFeatures = massFeatures.size();
		System.out.println("numFeatures: "+numFeatures);
		for (char iontype : "BC".toCharArray()) {
			int num = dataSignals.get(iontype).size();
			System.out.println(iontype + ": " + num);
			testVectors.setDataVectors(iontype, num, numFeatures);
			for (int k = 0; k < num; k++) {
				ArrayList<Double> dataVector = testVectors.getVector(iontype, k);
				dataVector.set(numFeatures * 2, dataSignals.getMass(iontype, k));
				dataVector.set(numFeatures * 2 + 1, dataSignals.getGlycanMass(iontype, k));
				dataVector.set(numFeatures * 2 + 2, (double)(dataSignals.getREM(iontype, k)?1:0));
				for (int m = 0; m < dataSignals.getContext(iontype, k).get(0).size(); m++) {
					double d, idx;
					double[] ans;
					//System.out.print("iontype: " + iontype + " k " + k + " m " + m + " ");
					ans = min(massFeatures, dataSignals.getContext(iontype, k).get(0).get(m));
					d = ans[0];
					idx = ans[1];
					if (d < massAccuracy + 0.001) {
						//System.out.println("Step in");
						testVectors.getVector(iontype, k).set((int)idx, 1.0);
                        testVectors.getVector(iontype, k).set((int)idx + numFeatures, dataSignals.getContext(iontype, k).get(1).get(m));
					}
				}
			}
			if (!includeREM) {
                ArrayList<ArrayList<Double>> map = testVectors.getMap(iontype);
                for (ArrayList<Double> vector : map) {
                    vector.remove(vector.size() - 1);
                }
            }
		}
		testVectors.setMassFeatures(massFeatures);
		ArrayList<Object> ans = new ArrayList<>();
		ans.add(testVectors);
		ans.add(dataSignals);
		//System.out.println("numFeatures: " + numFeatures);
		/*for (double value : testVectors.getVector('B', 0)) {
			System.out.println(value);
		}*/
        System.out.println("CIonClassifier.extract_data() Done");
        return ans;
	}

	private static double[] min (ArrayList<Double> massFeatures, Double contextM) {
		double d = 0x7fffffff, idx = 0, i = 0;
		for (double massFeature : massFeatures) {
			double n = Math.abs(massFeature - contextM);
			if (n < d) {
				d = n;
				idx = i;
			}
			i++;
		}
		double[] ans = {d, idx};
		//System.out.println("context: " + contextM + " d " + d + " massfeature " + massFeatures.get((int)idx));
		return ans;
	}

	private double min (double[] array) {
		double ans = 0x7fffffff;
		for (double i : array) {
			ans = (ans>i) ? i : ans;
		}
		return ans;
	}

	/**
	 * This method takes DataVectors and DataSignals generated from extract_data and use classifier to calculate scores for each peak.
	 * The score is saved in a IonScoreMap object.
	 * @param testVectors - contains the information for classification
	 * @param testData - contains the information between DestVectors and CPeaks
	 * @return an IonScoreMap object which stores the score of each peak
	 * @throws Exception
	 * @see DataVectors @see DataSignals @see IonScoreMap
	 */
	public IonScoreMap predict_ions(DataVectors testVectors, DataSignals testData) throws Exception {
		ArrayList<Integer> idxX15_B = new ArrayList<>();
		ArrayList<Integer> idxX15_C = new ArrayList<>();
		String vs_BC, vs_Y, vs_Z, vs_O;
		IonScoreMap ionScoreMap = new IonScoreMap();
		for (int i = 0; i < mMassFeatures.size(); i++) {
			if (Math.abs(mMassFeatures.get(i) - (-27.9949)) < 0.005) {
				idxX15_B.add(i);
			}
			if (Math.abs(mMassFeatures.get(i) - (-27.9949 - CMass.H2O)) < 0.005) {
				idxX15_C.add(i);
			}
		}
		for (char ion : "BC".toCharArray()) {
			if (ion == 'B') {
				vs_BC = "B_v_C";
			} else {
				vs_BC = "C_v_B";
			}
			vs_Y = ion + "_v_Y";
			vs_Z = ion + "_v_Z";
			vs_O = ion + "_v_O";
			for (int k = 0; k < testData.get(ion).size(); k++) {
				//System.out.println("predicting " + ion + (k+1) + " total " + testData.get(ion).size());
				int key = testData.getSpectrumID(ion, k) * 10000 + testData.getPeakID(ion, k);
				double[] ws = {0, 0, 0, 0};
				double[] b;
				//b = mClassifier.get(vs_BC).distributionForInstance(testVectors.toInstance(ion, k)); classifier from Weka
				//Perform binary classification with other 4 ions. Save the lowest score as the final score.
				b = mMyClassifier.get(vs_BC).getScore(testVectors.getVector(ion, k));
				ws[0] = b[1];
				b = mMyClassifier.get(vs_Y).getScore(testVectors.getVector(ion, k));
				ws[1] = b[1];
				b = mMyClassifier.get(vs_Z).getScore(testVectors.getVector(ion, k));
				ws[2] = b[1];
				b = mMyClassifier.get(vs_O).getScore(testVectors.getVector(ion, k));
				ws[3] = b[1];
				ionScoreMap.setScore(ion, key, min(ws));
				/*
				System.out.println("ws: " + ws[0] + " "+ ws[1] + " "+ ws[2] + " "+ ws[3]);
				System.out.println("ion: " + ion + " key: " + key);
				System.out.println("score: " + min(ws));
				*/
				if (mEnableX15) {
					if (ion == 'B') {
						for (int  i : idxX15_B) {
							if (testVectors.getVector(ion, k).get(i) != 0) {
								ionScoreMap.setScore(ion, key, ionScoreMap.getScore(ion, key) + 5);
								break;
							}
						}
					} else if (ion == 'C') {
						for (int  i : idxX15_C) {
							if (testVectors.getVector(ion, k).get(i) != 0) {
								ionScoreMap.setScore(ion, key, ionScoreMap.getScore(ion, key) + 5);
								break;
							}
						}
					}
				}
			}
		}
		//save score for each classifier 
		if (saveRandomForestScore) {
			File filer = new File(randomForestScorePath);
			FileWriter filewriter = new FileWriter(filer);
			for (char ion : "BC".toCharArray()) {
				if (ion == 'B') {
					vs_BC = "B_v_C";
				} else {
					vs_BC = "C_v_B";
				}
				vs_Y = ion + "_v_Y";
				vs_Z = ion + "_v_Z";
				vs_O = ion + "_v_O";
				for (int k = 0; k < testData.get(ion).size(); k++) {
					int key = testData.getSpectrumID(ion, k) * 10000 + testData.getPeakID(ion, k);
					double[] ws = {0, 0, 0, 0};
					double[] b;
					//b = mClassifier.get(vs_BC).distributionForInstance(testVectors.toInstance(ion, k));
					for (int m = 0; m < 100 ; m++) {
						b = mMyClassifier.get(vs_BC).getTree(m).getScore(testVectors.getVector(ion, k));
						ws[0] = b[1];
						b = mMyClassifier.get(vs_Y).getTree(m).getScore(testVectors.getVector(ion, k));
						ws[1] = b[1];
						b = mMyClassifier.get(vs_Z).getTree(m).getScore(testVectors.getVector(ion, k));
						ws[2] = b[1];
						b = mMyClassifier.get(vs_O).getTree(m).getScore(testVectors.getVector(ion, k));
						ws[3] = b[1];
				
						filewriter.write("model: " + m + " ion: " + ion + " k: " + k + " key: " + key + "\n");
						filewriter.write(vs_BC + ":\n");
						filewriter.write("ws: " + ws[0] + "\n");
						filewriter.write("vector value: " + testVectors.getVector(ion, k).get(mMyClassifier.get(vs_BC).getTree(m).rootCutVar()) + "\n");
						mMyClassifier.get(vs_BC).getTree(m).printTree(filewriter);
						filewriter.write(vs_Y + ":\n");
						filewriter.write("ws: " + ws[1] +"\n");
						filewriter.write("vector value: " + testVectors.getVector(ion, k).get(mMyClassifier.get(vs_Y).getTree(m).rootCutVar()) + "\n");
						mMyClassifier.get(vs_Y).getTree(m).printTree(filewriter);
						filewriter.write(vs_Z + ":\n");
						filewriter.write("ws: " + ws[2]  +"\n");
						filewriter.write("vector value: " + testVectors.getVector(ion, k).get(mMyClassifier.get(vs_Z).getTree(m).rootCutVar()) + "\n");
						mMyClassifier.get(vs_Z).getTree(m).printTree(filewriter);
						filewriter.write(vs_O + ":\n");
						filewriter.write("ws: " + ws[3]  +"\n");
						filewriter.write("vector value: " + testVectors.getVector(ion, k).get(mMyClassifier.get(vs_O).getTree(m).rootCutVar()) + "\n");
						mMyClassifier.get(vs_O).getTree(m).printTree(filewriter);
						filewriter.write("score: " + min(ws) + "\n");
					}
					if (mEnableX15) {
						if (ion == 'B') {
							for (int  i : idxX15_B) {
								if (testVectors.getVector(ion, k).get(i) != 0) {
									ionScoreMap.setScore(ion, key, ionScoreMap.getScore(ion, key) + 5);
									break;
								}
							}
						} else if (ion == 'C') {
							for (int  i : idxX15_C) {
								if (testVectors.getVector(ion, k).get(i) != 0) {
									ionScoreMap.setScore(ion, key, ionScoreMap.getScore(ion, key) + 5);
									break;
								}
							}
						}
					}
				}
			}
			filewriter.close();
		}
		System.out.println("predict_ions done");
		return ionScoreMap;
	}

	/**
	 * This method takes the reconstructed spectrum data and returns a (S��T��M��4) double ArrayList ICScores[s][t][m][x]
	 * S - num of spectrum, T - num of topology, M - num of supportpeaks given spectrum s and topology t
	 * Given spectrum ID s, topology ID t and supportPeak id m, the last dimension saves the following information:
	 * x = 0 - the peakID of the m-th supportPeak
	 * x = 1 - the complement peak of the m-th supportPeak
	 * x = 2 - the type of the m-th supportPeak, value 1 indicates a B-ion and value 2 indicates a C-ion
	 * x = 3 - the weight of the m-th supportPeak, i.e. the score of it
	 * 
	 * @param spectra 
	 * @return
	 * @throws Exception
	 */
	public ArrayList<ArrayList<ArrayList<ArrayList<Double>>>> rank_candidates(ArrayList<CSpectrum> spectra) throws Exception {
		ArrayList<Object> output = (ArrayList<Object>) extract_data(spectra, mMassFeatures, null, mMassAccuracy, mUseOriginalPeaks, false);
		DataVectors vectors = (DataVectors) output.get(0);
		DataSignals signals = (DataSignals) output.get(1);
		IonScoreMap ionScoreMap = predict_ions(vectors, signals);
		ArrayList<ArrayList<ArrayList<ArrayList<Double>>>> aaaalist = new ArrayList<>();
		// calculate scores for each topology and sort
		// spectrum loop
		for (int s = 0; s < spectra.size(); s++) {
			ArrayList<CPeak> peaklist = (ArrayList<CPeak>) spectra.get(s).getPeakList();
			if (peaklist.get(peaklist.size() - 1).getInferredSuperSets().isEmpty()) {
				continue;
			}
			for (CTopologySuperSet TSS : peaklist.get(peaklist.size() - 1).getInferredSuperSets()) {
				// topology loop
				for (int t = 0; t < TSS.mTopologies.size(); t++) {
					CTopology tp = TSS.mTopologies.get(t);
					tp.sortSupportPeaks();
					int len = tp.mSupportPeaks.size();
					double[] weights = new double[len - 1];
					int m = -1;
					// support peaks loop
					for (CPeak peak : tp.getSupportPeaks()) {
						m++;
						if (m == tp.getSupportPeaks().size() - 1) {
							break;
						}
						double peakID = peaklist.indexOf(peak);
						double type = 0;
						for (CTopologySuperSet peakTSS : peak.getInferredSuperSets()) {		
							if (peakTSS.mTopologies.isEmpty()) {
								continue;
							}
							type = peakTSS.mTargetPeaks.get((int)peakID);
							int key = s * 10000 + (int)peakID;
							if (type == 1 || type == -1) {
								weights[m] = ionScoreMap.getScore('B', key);
								ArrayList<Integer> score = new ArrayList<>();
								ArrayList<Double> doubleScore = new ArrayList<>();
								score.add(0); score.add(0); 
								doubleScore.add(0.0);doubleScore.add(0.0);
								score.set(0, (int)weights[m]);
								doubleScore.set(0, weights[m]);
								peak.setInferredScores(score);
								peak.setInferredDoubleScores(doubleScore);
								
							} else if (type == 2 || type == -2) {
								weights[m] = ionScoreMap.getScore('C', key);
								ArrayList<Integer> score = new ArrayList<>();
								ArrayList<Double> doubleScore = new ArrayList<>();
								score.add(0); score.add(0); 
								doubleScore.add(0.0);doubleScore.add(0.0);
								score.set(1, (int)weights[m]);
								doubleScore.set(1, weights[m]);
								peak.setInferredScores(score);
								peak.setInferredDoubleScores(doubleScore);
							}
						}
					}
					double sum = 0;
					for (double i : weights) {
						sum += i;
					}
					tp.mScore = sum;
				}
				Collections.sort(TSS.mTopologies, new Comparator<CTopology>() {
					   @Override
					   public int compare(CTopology t1, CTopology t2) {
						   double dscore = t1.mScore - t2.mScore;
						   return (int) -Math.signum(dscore);
					   }
				   });
			}
		}
		
		// spectrum loop
		for (int s = 0; s < spectra.size(); s++) {
			ArrayList<CPeak> peaklist = (ArrayList<CPeak>) spectra.get(s).getPeakList();
			ArrayList<ArrayList<ArrayList<Double>>> aaalist = new ArrayList<>();
			if (peaklist.get(peaklist.size() - 1).getInferredSuperSets().isEmpty()) {
				continue;
			}
			for (CTopologySuperSet TSS : peaklist.get(peaklist.size() - 1).getInferredSuperSets()) {
		
				for (int t = 0; t < TSS.mTopologies.size(); t++) {
					ArrayList<ArrayList<Double>> aalist = new ArrayList<>();
					CTopology tp = TSS.mTopologies.get(t);
					int m = -1;
					for (CPeak peak : tp.getSupportPeaks()) {
						ArrayList<Double> alist = new ArrayList<>();
						m++;
						if (m == tp.getSupportPeaks().size() - 1) {
							break;
						}
						double peakID = peaklist.indexOf(peak);
						alist.add(peakID);
						double type = 0;
						for (CTopologySuperSet peakTSS : peak.getInferredSuperSets()) {
							if (peakTSS.mTopologies.isEmpty()) {
								continue;
							}
							//@TODO: negative mComplement
							type = peakTSS.mTargetPeaks.get((int)peakID);
							alist.add((double)peaklist.indexOf(peak.getComplementPeak()));
							alist.add(type);
							int key = s * 10000 + (int)peakID;
							if (type == 1 || type == -1) {
								alist.add(peak.getInferredDoubleScores().get(0));
							} else if (type == 2 || type == -2) {
								alist.add(peak.getInferredDoubleScores().get(1));
							}
							aalist.add(alist);
						}
						
					}
					aaalist.add(aalist);
					
				}
				
			}
			aaaalist.add(aaalist);
		}
		System.out.println("rank_candidates done");
		//vectors.output("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff");
		return aaaalist;
	}

	/**
	 * This method calculate the robust intensity mean and SD of the peak data.
	 * @param peaks - an ArrayList of peak list
	 * @param transform - a string indicates the method to transform peak intensity data: log, sqrt
	 * @param peakIDs - the list of the peak IDs you want to standardize
	 * @return A size 4 ArrayList of Objects. The subscript indicates:
	 * 1 - An ArrayList stores the z-score of each peak intensities.
	 * 2 - An ArrayList stores the transformed peak intensities.
	 * 3 - A Double stores the robust mean of the data.
	 * 4 - A Double stores the robust SD of the data.
	 */
	public static ArrayList<Object> standardize_intensity (ArrayList<CPeak> peaks, String transform, ArrayList<Integer> peakIDs) {
		ArrayList<Double> intensities = new ArrayList<>();
		for (CPeak peak : peaks) {
			intensities.add(peak.getIntensity());
		}
		if (transform.equals("log")) {
				for (int i = 0; i < intensities.size(); i++) {
					intensities.set(i, Math.log(intensities.get(i)));
				}
		} else if (transform.equals("sqrt")) {
				for (int i = 0; i < intensities.size(); i++) {
					intensities.set(i, Math.sqrt(intensities.get(i)));
				}
		}
		double m, s;
		ArrayList<Double> zscores = new ArrayList<>();
		if (peakIDs.isEmpty()) {
			ArrayList<Double> sub = (ArrayList<Double>) intensities.subList(1, intensities.size() - 1);
			double[] ans = robust_mean_std(sub);
			m = ans[0];
			s = ans[1];
			for (Double intensity : intensities) {
				zscores.add((intensity - m) / s);
			}
			//System.out.println("m: " + m + "s: "+ s);
		} else {
			ArrayList<Double> sub = new ArrayList<>();
			for (int i = 0; i < peakIDs.size(); i++) {
				sub.add(intensities.get(peakIDs.get(i)));
			}
			double[] ans = robust_mean_std(sub);
			m = ans[0];
			s = ans[1];
			for (Double intensity : intensities) {
				zscores.add((intensity - m) / s);
			}
			//System.out.println("m: " + m + "s: "+ s);
		}
		ArrayList<Object> list = new ArrayList<>();
		list.add(zscores);
		list.add(intensities);
		list.add(m);
		list.add(s);
		return list;
	}

	private static double mean (ArrayList<Double> data) {
		double sum = 0;
		for (Double sample : data) {
			sum += sample;
		}
		return sum/data.size();
	}

	private static double std (ArrayList<Double> data) {
		if (data.size() == 1) {
			return 0;
		}
		double square = 0, avg = mean(data);
		for (Double sample : data) {
			square += (sample - avg) * (sample - avg);
		}
		return Math.sqrt(square/(data.size() - 1));
	}
	
	private static double median (ArrayList<Double> data) {
		Collections.sort(data);
		if (data.size() % 2 == 1) return data.get(data.size() / 2);
		return (data.get(data.size() / 2) + data.get(data.size() / 2 - 1)) / 2;
	}
	
	private static double[] robust_mean_std(ArrayList<Double> data) {
		double keep_percentage = CIonclassifier.mKeep_percentage;
		int num = data.size();
		double m = median(data);
		ArrayList<Double> squareerr = new ArrayList<>();
		for (Double x : data) {
			squareerr.add((x - m) * (x - m));
		}
		double s = Math.sqrt(median(squareerr));
		double preM = m - 10000;
		double preS = s - 10000;
		ArrayList<Double> preSubSet = new ArrayList<>(data);
		while (Math.abs(preM - m) > Math.abs(preM * 0.01) || Math.abs(preS - s) > preS * 0.01) {
			ArrayList<Double> subSet = new ArrayList<>();
			for (Double x : preSubSet) {
				if (Math.abs(x - m) <= 3 * s) {
					subSet.add(x);
				}
			}
			if (subSet.size() <= num * keep_percentage) {
				break;
			}
			preM = m;
			preS = s;
			m = median(subSet);
			ArrayList<Double> y = new ArrayList<>();
			for (Double x : subSet) {
				y.add((x - m) * (x - m));
			}
		    s = Math.sqrt(median(y));
		    preSubSet = subSet;
		}
		double[] ans = new double[2];
		ans[0] = mean(preSubSet);
		ans[1] = std(preSubSet);
		return ans;
	}

	/**
	 * This method sets the path of your Weka model data.
	 * @param rootpath Root path of weka classifier
	 * @throws Exception
	 * never used
	 */
	/*
	public static void setClassifier(String rootpath) throws Exception {
		if (rootpath.charAt(rootpath.length() - 1) != '\\') {
			rootpath = rootpath + '\\';
		}
		char[] posSet = {'B', 'B', 'B', 'B', 'C', 'C', 'C', 'C'}; 
		char[] negSet = {'C', 'Y', 'Z', 'O', 'B', 'Y', 'Z', 'O'};
		for (int i = 0; i < 8; i++) {
			String path = rootpath + posSet[i] + "_v_" + negSet[i] + ".model";
			Classifier cls = (Classifier) weka.core.SerializationHelper.read(path);
			mClassifier.put(posSet[i] + "_v_" + negSet[i], cls);
		}
	}
	*/
	
	/**
	 * This method sets the path of your RandomForest Classifier data.
	 * @param rootpath
	 * @throws Exception
	 */
	public static void setMyClassifier(String rootpath) throws Exception {
		if (rootpath.charAt(rootpath.length() - 1) != '\\') {
			rootpath = rootpath + '\\';
		}
		char[] posSet = {'B', 'B', 'B', 'B', 'C', 'C', 'C', 'C'}; 
		char[] negSet = {'C', 'Y', 'Z', 'O', 'B', 'Y', 'Z', 'O'};
		for (int i = 0; i < 8; i++) {
			char pos = posSet[i], neg = negSet[i];
			//System.out.println("\nLoading " + pos + "_v_" + neg);
			mMyClassifier.put(pos + "_v_" + neg, new MyClassifier(rootpath, pos, neg));
		}
		System.out.println("Loaded Classifier");
	}
	
	public static void setMassFeatures (String filename) throws Exception {
		if (filename.charAt(filename.length() - 1) != '\\') {
			filename = filename + '\\';
		}
		filename = filename + "ionclassifier_massfeatures.txt";
		Scanner sc = null;
		File specFile = new File(filename);
		try {
			sc = new Scanner(specFile);
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException("No such file");
		}
		while(sc.hasNextDouble()) {
			double value = sc.nextDouble();
			mMassFeatures.add(value);
			//System.out.println(value);
		}
	}

	/**
	 * Change CIonclassifier.saveIonScoreMap and CIonclassifier.ionScoreMapPath
	 * This method save the 4D ArrayList into different text files. Each file represents a spectrum.
	 */
	public static void saveIonScoreMap(String rootpath, ArrayList<CSpectrum> speca, ArrayList<ArrayList<ArrayList<ArrayList<Double>>>> result) throws Exception {
		if (rootpath.charAt(rootpath.length() - 1) != '\\') {
			rootpath = rootpath + '\\';
		}
		rootpath = rootpath + "scoremap_";
		for (int i = 0; i < result.size(); i++) {
			   String scoreMapPath = rootpath + speca.get(i).getFilename() + ".txt";
			   File file = new File(scoreMapPath);
				if (!file.exists()) {
					file.createNewFile();
				}
				FileWriter filewriter = new FileWriter(file);
			   for (int j = 0; j < result.get(i).size(); j++) {
				   for (int k = 0; k < result.get(i).get(j).size(); k++) {
					   for (int l = 0; l < 4; l++) {
						   filewriter.write(result.get(i).get(j).get(k).get(l)+" ");
					   }
					   filewriter.write("\n");
				   }
				   ArrayList<CPeak> peaklist = (ArrayList<CPeak>) speca.get(i).getPeakList();
				   CTopologySuperSet TSS = peaklist.get(peaklist.size() - 1).getInferredSuperSets().get(0);
				   int p = 0, m = TSS.mTopologies.size(), y = 0;
				   while (j + 1 > m) {
					   y = m;
					   p++;
					   TSS = peaklist.get(peaklist.size() - 1).getInferredSuperSets().get(p);
					   m += TSS.mTopologies.size();
				   }
				   CTopology tp = TSS.mTopologies.get(j - y);
				   filewriter.write("topology score: " + tp.mScore + "\n");
				   filewriter.write("topology formula: " + tp.getFormula() + "\n");
				   filewriter.write("\n");
			   }
			   filewriter.close();
		   }
	}
	
	/**
	 * Do this before use rank_candidates
	 */
	public static void reconstructSpectrum (ArrayList<CSpectrum> speca, CGlycoDeNovo glyco) {
		for (CSpectrum spectrum : speca) {
			   spectrum.protonate();
			   spectrum.mergePeaks(mergePeaksTreshold);
			   spectrum.addComplementaryIons();
			   glyco.interpretPeaks(spectrum);
			   glyco.reconstructFormulas();
		   }
	}
	
	/**
	 * A demo about using CIonclassifier
	 */
	public static void main(String[] args) throws Exception {
		
	   // load classifier and massfeatures
	   //setClassifier(mClassifierPath);
	   setMyClassifier(mClassifierPath);
	   setMassFeatures(mMassfeaturesPath);
	   
	   // load spectrum data
	   CSpectrum spec;
	   ArrayList<CSpectrum> speca = new ArrayList<>();
	   //CGlycoDeNovo glyco = new CGlycoDeNovo("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\rec.LNFP V.full.txt");
	   //spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\spectrum1.txt");
	   //spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\spectrum2.txt");
	   //spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\Man4_Peak1_OLD.txt");  
	   //spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\Man4_Peak3_OLD.txt");
	   //speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\A2S2.txt");
	   speca.add(spec);
	   /*
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man5_Peak1.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man5_Peak2.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man5_Peak3.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man6_Peak1.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man6_Peak2.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man6_Peak3.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man7_Peak1.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man7_Peak2.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man7_Peak3.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man7_Peak4.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man7_Peak5.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man8_Peak1.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man8_Peak2.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man8_Peak3.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man9.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\Man5.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\Man6.txt");
	   speca.add(spec);	   
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\NA2F.txt");
	   speca.add(spec);	   
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\NG1A2F.txt");
	   speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\NGA2F.txt");
	   speca.add(spec);
	   */
	   // reconstruct spectrum
	   CIonclassifier c = new CIonclassifier();
	   CGlycoDeNovo glyco = new CGlycoDeNovo(massAccuracyPPM);
	   //long starTime=System.currentTimeMillis();
	   reconstructSpectrum(speca, glyco);
	   //spec.printmPeaks("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\");
	   
	   // rank candidates
	   ArrayList<ArrayList<ArrayList<ArrayList<Double>>>> result = c.rank_candidates(speca);
	   
	   // save IonScoreMap
	  if (saveIonScoreMap) {
		  saveIonScoreMap(ionScoreMapPath, speca, result);
	  }
	  
	  /*
	   for (int i = 0; i < result.size(); i++) {
		   ArrayList<CPeak> peaklist = (ArrayList<CPeak>) speca.get(i).getPeakList();
		   CTopologySuperSet TSS = peaklist.get(peaklist.size() - 1).getInferredSuperSets().get(0);
		   System.out.println("*" + speca.get(i).getFilename());
		   System.out.println(peaklist.get(peaklist.size() - 1).getInferredSuperSets().size());
		   for (int j = 0; j < result.get(i).size(); j++) {
			   CTopology tp = TSS.mTopologies.get(j);
			   System.out.println("topology score: " + tp.mScore);
			   System.out.println("topology formula: " + tp.getFormula());
			   System.out.print("support peaks: ");
			   for (CPeak peak : tp.getSupportPeaks()) {
				   System.out.print(peaklist.indexOf(peak) + " ");
			   }
			   System.out.println();
			   System.out.println("topology type: " + tp.mType);
			   System.out.println();
		   }
	   }	
	   */
	  System.out.println("Done");
	  }	 
	
}