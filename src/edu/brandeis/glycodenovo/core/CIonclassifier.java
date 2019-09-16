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
	public static int mBoostNum = 100;
    public static double mHoldOut = 0.2;

    static ArrayList<Double> mMassFeatures = new ArrayList<>();
    public static double mMassAccuracy = 0.005;
    public static ArrayList<Double> mMassBound = new ArrayList<>();
        
    static HashMap<String, Classifier> mClassifier = new HashMap<>();
    static HashMap<String, MyClassifier> mMyClassifier = new HashMap<>();
    static HashMap<String, Instances> mDataset = new HashMap<>();
    public static boolean mUseOriginalPeaks = false;
    public static boolean mUseComplementFlag = false;
    public static boolean mEnableX15 = false;

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
			for (int p = 0; p < peaklist.size() - 1; p++) {
				if (! (peaklist.get(p).getInferredFormulas() == null || peaklist.get(p).getInferredFormulas().isEmpty())) {
					peakAvailable.set(p, true);
					if (useOriginalPeak && peaklist.get(p).getComplementPeak() == null) {
						peakAvailable.set(p, false);
						//@TODO: can't do this since mComplement won't be negative
						//peakAvailable(-specU.mPeaks(p).mComplement) = 1;
						int index = peaklist.indexOf(peaklist.get(p).getComplementPeak());
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
			System.out.println("availablenum: " + availablenum);
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
					context.add(c1); context.add(c2); context.add(c3);
					dataSignals.addlast(iontype, pMass, k, peaklist.get(k).getComplementPeak(), ((ArrayList<Double>)peakIntensities.get(0)).get(k),
					context, s,	specU.getPrecursorMZ(), hasRequestREM, specU);
				}
			}
		}
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
					ans = min(massFeatures, dataSignals.getContext(iontype, k).get(0).get(m));
					d = ans[0];
					idx = ans[1];
					if (d < massAccuracy + 0.001) {
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
		System.out.println("numFeatures: " + numFeatures);
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
		return ans;
	}

	private double min (double[] array) {
		double ans = 0x7fffffff;
		for (double i : array) {
			ans = (ans>i) ? i : ans;
		}
		return ans;
	}

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
				System.out.println("predicting " + ion + (k+1) + " total " + testData.get(ion).size());
				int key = testData.getSpectrumID(ion, k) * 10000 + testData.getPeakID(ion, k);
				double[] ws = {0, 0, 0, 0};
				double[] b;
				//b = mClassifier.get(vs_BC).distributionForInstance(testVectors.toInstance(ion, k));
				b = mMyClassifier.get(vs_BC).getScore(testVectors.getVector(ion, k));
				ws[0] = b[1];
				b = mMyClassifier.get(vs_Y).getScore(testVectors.getVector(ion, k));
				ws[1] = b[1];
				b = mMyClassifier.get(vs_Z).getScore(testVectors.getVector(ion, k));
				ws[2] = b[1];
				b = mMyClassifier.get(vs_O).getScore(testVectors.getVector(ion, k));
				ws[3] = b[1];
				ionScoreMap.setScore(ion, key, min(ws));
				
				System.out.println("ws: " + ws[0] + " "+ ws[1] + " "+ ws[2] + " "+ ws[3]);
				System.out.println("ion: " + ion + " key: " + key);
				System.out.println("score: " + min(ws));
				
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
		File filer = new File("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\save\\CTreescore.txt");
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
		System.out.println("predict_ions done");
		return ionScoreMap;
	}

	public double[][][][] rank_candidates(ArrayList<CSpectrum> spectra) throws Exception {
		ArrayList<Object> output = (ArrayList<Object>) extract_data(spectra, mMassFeatures, null, 0.01, mUseOriginalPeaks, false);
		DataVectors vectors = (DataVectors) output.get(0);
		DataSignals signals = (DataSignals) output.get(1);
		IonScoreMap ionScoreMap = predict_ions(vectors, signals);
		double[][][][] ICScores = new double[spectra.size()][][][];
		for (int s = 0; s < spectra.size(); s++) {
			ArrayList<CPeak> peaklist = (ArrayList<CPeak>) spectra.get(s).getPeakList();
			if (peaklist.get(peaklist.size() - 1).getInferredSuperSets().isEmpty()) {
				continue;
			}
			for (CTopologySuperSet TSS : peaklist.get(peaklist.size() - 1).getInferredSuperSets()) {
				ICScores[s] = new double[TSS.mTopologies.size()][][];
				for (int t = 0; t < TSS.mTopologies.size(); t++) {
					CTopology tp = TSS.mTopologies.get(t);
					int len = tp.mSupportPeaks.size() - 1;
					ICScores[s][t] = new double[len][4];
					double[] weights = new double[len];
					for (int m = 0; m < len; m++) {
						double peakID = peaklist.indexOf(tp.mSupportPeaks.get(m));
						ICScores[s][t][m][0] = peakID;
						double type = 0;
						for (CTopologySuperSet peakTSS : peaklist.get((int)peakID).getInferredSuperSets()) {
							//@TODO: mFormulas issue
							if (peakTSS.mTopologies.isEmpty()) {
								continue;
							}
							//@TODO: negative mComplement
							type = peakTSS.mTargetPeaks.get((int)peakID);
						}
						ICScores[s][t][m][1] = peaklist.indexOf(peaklist.get((int)peakID).getComplementPeak());
						ICScores[s][t][m][2] = type;
						int key = s * 10000 + (int)peakID;
						if (type == 1 || type == -1) {
							weights[m] = ionScoreMap.getScore('B', key);
							ArrayList<Integer> score = new ArrayList<>();
							score.add(0); score.add(0);
							score.set(0, (int)weights[m]);
							peaklist.get((int)peakID).setInferredScores(score);
						} else if (type == 2 || type == -2) {
							weights[m] = ionScoreMap.getScore('C', key);
							ArrayList<Integer> score = new ArrayList<>();
							score.add(0); score.add(0);
							score.set(1, (int)weights[m]);
							peaklist.get((int)peakID).setInferredScores(score);
						}
						ICScores[s][t][m][3] = weights[m];
					}
					double sum = 0;
					for (double i : weights) {
						sum += i;
					}
					tp.mScore = sum;
				}
				//Collections.sort(TSS.mTopologies);
			}
		}
		/*for (double value : vectors.getVector('B', 0)) {
			System.out.println(value);
		}*/
		System.out.println("rank_candidates done");
		vectors.output("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff");
		return ICScores;
	}

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
			m = mean(sub);
			s = std(sub);
			for (Double intensity : intensities) {
				zscores.add((intensity - m) / s);
			}
			//System.out.println("m: " + m + "s: "+ s);
		} else {
			ArrayList<Double> sub = new ArrayList<>();
			for (int i = 0; i < peakIDs.size(); i++) {
				sub.add(intensities.get(peakIDs.get(i)));
			}
			m = mean(sub);
			s = std(sub);
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

	public static void setClassifier(String rootpath) throws Exception {
		char[] posSet = {'B', 'B', 'B', 'B', 'C', 'C', 'C', 'C'}; 
		char[] negSet = {'C', 'Y', 'Z', 'O', 'B', 'Y', 'Z', 'O'};
		for (int i = 0; i < 8; i++) {
			String path = rootpath + posSet[i] + "_v_" + negSet[i] + ".model";
			Classifier cls = (Classifier) weka.core.SerializationHelper.read(path);
			mClassifier.put(posSet[i] + "_v_" + negSet[i], cls);
		}
	}
	
	public static void setMyClassifier(String rootpath) throws Exception {
		char[] posSet = {'B', 'B', 'B', 'B', 'C', 'C', 'C', 'C'}; 
		char[] negSet = {'C', 'Y', 'Z', 'O', 'B', 'Y', 'Z', 'O'};
		for (int i = 0; i < 8; i++) {
			char pos = posSet[i], neg = negSet[i];
			System.out.println("\nLoading " + pos + "_v_" + neg);
			mMyClassifier.put(pos + "_v_" + neg, new MyClassifier(rootpath, pos, neg));
		}
		System.out.println("Loaded Classifier");
	}
	
	public static void setMassFeatures (String filename) throws Exception {
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

	public static void main(String[] args) throws Exception {
	   setClassifier("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\");
	   setMyClassifier("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\");
	   setMassFeatures("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\ionclassifier_massfeatures.txt");
	   CSpectrum spec;
	   ArrayList<CSpectrum> speca = new ArrayList<>();
	   //CGlycoDeNovo glyco = new CGlycoDeNovo("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\rec.LNFP V.full.txt");
	   //spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\spectrum1.txt");
	   //spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\spectrum2.txt");
	   //spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\Man4_Peak1_OLD.txt");  
	   //spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\Man4_Peak3_OLD.txt");
	  // speca.add(spec);
	   spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\SLeX.txt");
	   speca.add(spec);
	   
	   
	   CIonclassifier c = new CIonclassifier();
	   CGlycoDeNovo glyco = new CGlycoDeNovo(5);
	   long starTime=System.currentTimeMillis();
	   for (CSpectrum spectrum : speca) {
		   spectrum.protonate();
		   spectrum.mergePeaks(0.001);
		   spectrum.addComplementaryIons();
		   glyco.interpretPeaks(spectrum);
		   glyco.reconstructFormulas();
	   }
	   spec.printmPeaks("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\");
	   double[][][][] result = c.rank_candidates(speca);
	   for (int i = 0; i < result.length; i++) {
		   for (int j = 0; j < result[i].length; j++) {
			   for (int k = 0; k < result[i][j].length; k++) {
				   for (int l = 0; l < result[i][j][k].length; l++) {
					   System.out.print(result[i][j][k][l]+" ");
				   }
				   System.out.println();
			   }
			   ArrayList<CPeak> peaklist = (ArrayList<CPeak>) speca.get(i).getPeakList();
			   CTopologySuperSet TSS = peaklist.get(peaklist.size() - 1).getInferredSuperSets().get(0);
			   CTopology tp = TSS.mTopologies.get(j);
			   System.out.println("topology score: " + tp.mScore);
			   System.out.println("topology formula: " + tp.getFormula());
			   System.out.println();
		   }
		   System.out.println();
	   }
	    long endTime=System.currentTimeMillis();
		long Time=endTime-starTime;
		System.out.println("time: "+((double)Time/1000.0) + "s");
		
	  }	 
}