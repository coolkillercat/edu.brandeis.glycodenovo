package edu.brandeis.glycodenovo.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class CMass2Composition implements Serializable {
	static final int[] mMonoMaxNums= {4, 4, 9, 5, 8, 5, 7, 7};
	protected boolean mPermethylated;
	protected String mReducingEndModification;
	protected double mREMMassCompensation;
	boolean mCheckMinus2H;
	double mMassAccuracyPPM;
	double[] mMonoMasses;
	double mPrecursorMassTolerance;
	ArrayList<Double> mMasses;
	ArrayList<int[]> mCompositions;
	int[] limitCut;
	
	public CMass2Composition() {
		this.mCheckMinus2H = false;
		this.mPrecursorMassTolerance = 0.01;
		this.mMassAccuracyPPM = 5;
		this.mReducingEndModification = "";
		this.mREMMassCompensation = 0;
		this.mMasses = new ArrayList<>();;
		this.mMonoMasses = new double[CMonosaccharideSet.cNumberMonosaccharideClasses];
		this.mCompositions = new ArrayList<>();
		this.set_permethylation(true);
	}
	
	public void build_mass_2_composition() {
		this.build_mass_2_composition("");
	}

	public void build_mass_2_composition(String mapfile) {
		double maxMass;
		if (this.mPermethylated) maxMass = 3200;
		else maxMass = 2200;
		int n = 1;
		for (int i = 0; i < mMonoMaxNums.length; i++) n *= mMonoMaxNums[i];
		ArrayList<Double> masses = new ArrayList<>();
		ArrayList<int[]> compositions = new ArrayList<>();
		HashMap<Double, int[]> pair = new HashMap();
		for (int i = 0; i < n; i++) compositions.add(new int[CMonosaccharideSet.cNumberMonosaccharideClasses]);
		int idx = 0;
		for (int n1 = 0; n1 <= CMass2Composition.mMonoMaxNums[0]; n1++) {
			for (int n2 = 0; n2 <= CMass2Composition.mMonoMaxNums[1]; n2++) {
				for (int n3 = 0; n3 <= CMass2Composition.mMonoMaxNums[2]; n3++) {
					for (int n4 = 0; n4 <= CMass2Composition.mMonoMaxNums[3]; n4++) {
						for (int n5 = 0; n5 <= CMass2Composition.mMonoMaxNums[4]; n5++) {
							for (int n6 = 0; n6 <= CMass2Composition.mMonoMaxNums[5]; n6++) {
								for (int n7 = 0; n7 <= CMass2Composition.mMonoMaxNums[6]; n7++) {
									for (int n8 = 0; n8 <= CMass2Composition.mMonoMaxNums[7]; n8++) {
										int totalNum = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8;
										double totalMass = n1 * this.mMonoMasses[0] + n2 * this.mMonoMasses[1] + n3 * this.mMonoMasses[2] +
												n4 * this.mMonoMasses[3] + n5 * this.mMonoMasses[4] + n6 * this.mMonoMasses[5] +
												n7 * this.mMonoMasses[6] + n8 * this.mMonoMasses[7];
										if (totalNum < 3) continue;
										totalMass =  totalMass - (totalNum - 1) * CMass.H2O + CMass.Proton;
										if (this.mPermethylated) totalMass = totalMass - 2 * (totalNum - 1) * CMass.CH2;
										if (totalMass > maxMass) break;
										if (idx % 1000 == 0) {
											System.out.print(".");
											if (idx % 60000 == 0) System.out.println();
										}
										masses.add(totalMass);
										compositions.add(new int[]{n1, n2, n3, n4, n5, n6, n7, n8});
										pair.put(masses.get(idx), compositions.get(idx));
										idx = idx + 1;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println();
		this.mMasses = masses;
		Collections.sort(this.mMasses);
		for (Double mass : this.mMasses) {
			this.mCompositions.add(pair.get(mass));
		}
		if (!mapfile.isEmpty()) {
			save(mapfile);
		}
	}
	
	private double composition_to_mass(int[] composition) {
		int n = 0;
		for (int i = 0; i < composition.length; i++) {
			n += composition[i];
		}
		double ans = 0;
		ans += composition[0] * this.mMonoMasses[0] + composition[1] * this.mMonoMasses[1] + composition[2] * this.mMonoMasses[2] +
				composition[3] * this.mMonoMasses[3] + composition[4] * this.mMonoMasses[4] + composition[5] * this.mMonoMasses[5] +
				composition[6] * this.mMonoMasses[6] + composition[7] * this.mMonoMasses[7];
		ans = ans - (n - 1) * CMass.H2O - 2 * (n - 1) * CMass.CH2 + CMass.Proton;
		return ans;
	}
	
	ArrayList<CSpectrum> correct_spectrum(CSpectrum spectrum) {
		if (!spectrum.isProtonated()) spectrum.protonate();
		double massAccurange = this.mMassAccuracyPPM * 0.000001;
		set_reducing_end_modification(spectrum.getReducingEndMode());
		double precursorMZ = spectrum.getPrecursorMZ() - this.mREMMassCompensation; //getrawMZ or getMZ
		if (this.mReducingEndModification.indexOf("REM_M3_Bion_") == 0) {
			precursorMZ += CMass.H2O;
			if (this.mPermethylated) precursorMZ += CMass.CH2;
		}
		this.mPrecursorMassTolerance = spectrum.getPrecursorMZ() * massAccurange;
		ArrayList<Integer> idxes = new ArrayList<>();
		int idx = 0;
		for (Double mass : this.mMasses) {
			if (Math.abs(precursorMZ - mass) < this.mPrecursorMassTolerance) idxes.add(idx);
			idx++;
		}
		ArrayList<CSpectrum> spectra = new ArrayList<>(idx);
		for (int k = 0; k < idx; k++) {
			CSpectrum newS = new CSpectrum();
			spectra.add(newS);
			newS.mPrecursorMZ = this.mMasses.get(idxes.get(k)) + this.mREMMassCompensation;
			if (this.mReducingEndModification.indexOf("REM_M3_Bion_") == 0) {
				newS.mPrecursorMZ -= CMass.H2O;
				if (this.mPermethylated) newS.mPrecursorMZ -= CMass.CH2;
			}
			newS.mComposition = this.mCompositions.get(idxes.get(k));
			newS.mDerivationMethod = spectrum.mDerivationMethod;
			newS.mMetal = spectrum.mMetal;
			newS.mNLinked = spectrum.mNLinked;
			newS.mPermethylated = spectrum.mPermethylated;
			newS.mProtonated = spectrum.mProtonated;
			newS.mMassAccuracyPPM = spectrum.mMassAccuracyPPM;
			newS.mReducingEndMode = spectrum.mReducingEndMode;
			newS.mComment = spectrum.mComment;
			newS.mFilename = spectrum.mFilename;
			int totalN = 0;
			for (int i = 0; i < newS.mComposition.length; i++) totalN += newS.mComposition[i];
			limitCut = new int[totalN];
			limitCut[totalN - 1] = newS.mComposition[totalN - 1];
			for (int n = totalN - 2; n >= 0; n--) {
				limitCut[n] = limitCut[n + 1] + newS.mComposition[n];
			}
			for (int n = 0; n < totalN - 1; n++) {
				ArrayList<int[]> nreComposition = new ArrayList<>();
				combination(nreComposition, n, newS.mComposition);
				for (int m = 0; m < nreComposition.size(); m++) {
					double massB = 0;
					for (int i = 0; i < this.mMonoMasses.length; i++) {
						massB += this.mMonoMasses[i] * nreComposition.get(m)[i];
					}
					massB = massB - n * CMass.H2O + CMass.Proton;
					if (this.mPermethylated) massB = massB - (2 * n - 1) * CMass.CH2;
					double massC = massB + CMass.H2O;
					double massY = newS.getPrecursorMZ() - massB + CMass.Proton;
					double massZ = newS.getPrecursorMZ() - massC + CMass.Proton;
					ArrayList<CPeak> peaks = newS.find_peaks(massB, 0.0001);
					double sum = 0;
					if (peaks.isEmpty()) {
						peaks = spectrum.find_peaks(massB, massB * massAccurange);
						for (int i = 0; i < peaks.size(); i++) {
							sum += peaks.get(i).mIntensity;
						}
						if (!peaks.isEmpty()) {
							CPeak bPeak = new CPeak();
							bPeak.mSpectrum = newS;
							bPeak.mMass = massB;
							bPeak.mOriginalPeaks = peaks;
							bPeak.mIntensity = sum;
							bPeak.mMassLowBound = massB - 0.0001;
							bPeak.mMassHighBound = massB + 0.0001;
							bPeak.mType = CPeakType.B;
							newS.mPeaks.add(bPeak);
						} else {
							peaks = spectrum.find_peaks(massY, massY * massAccurange);
							if (!peaks.isEmpty()) {
								sum = 0;
								for (int i = 0; i < peaks.size(); i++) {
									sum += peaks.get(i).mIntensity;
								}
								CPeak bPeak = new CPeak();
								bPeak.mSpectrum = newS;
								bPeak.mMass = massB;
								bPeak.mOriginalPeaks = peaks;
								bPeak.mIntensity = sum;
								bPeak.mMassLowBound = massB - 0.0001;
								bPeak.mMassHighBound = massB + 0.0001;
								bPeak.mIsComplement = true;
								bPeak.mType = CPeakType.B;
								newS.mPeaks.add(bPeak);
							}
						}
					} else {
						for (int h = 0; h < peaks.size(); h++) {
							peaks.get(h).mType = CPeakType.combineType(peaks.get(h).mType, CPeakType.B);
						}
					}
					if (this.mCheckMinus2H) {
						massB = massB - CMass.H2;
						peaks = newS.find_peaks(massB, 0.0001);
						sum = 0;
						if (peaks.isEmpty()) {
							peaks = spectrum.find_peaks(massB, massB * massAccurange);
							for (int i = 0; i < peaks.size(); i++) {
								sum += peaks.get(i).mIntensity;
							}
							if (!peaks.isEmpty()) {
								CPeak bPeak = new CPeak();
								bPeak.mSpectrum = newS;
								bPeak.mMass = massB;
								bPeak.mOriginalPeaks = peaks;
								bPeak.mIntensity = sum;
								bPeak.mMassLowBound = massB - 0.0001;
								bPeak.mMassHighBound = massB + 0.0001;
								bPeak.mType = CPeakType.combineType(CPeakType.B, CPeakType.Minus2H);
								newS.mPeaks.add(bPeak);
							}	
						} else {
							for (int h = 0; h < peaks.size(); h++) {
								peaks.get(h).mType = CPeakType.combineType(peaks.get(h).mType, CPeakType.combineType(CPeakType.B, CPeakType.Minus2H));
							}
						}
					}
					
					peaks = newS.find_peaks(massC, 0.0001);
					if (peaks.isEmpty()) {
						peaks = spectrum.find_peaks(massC, massC * massAccurange);
						sum = 0;
						for (int i = 0; i < peaks.size(); i++) {
							sum += peaks.get(i).mIntensity;
						}
						if (!peaks.isEmpty()) {
							CPeak cPeak = new CPeak();
                            cPeak.mSpectrum = newS;
                            cPeak.mMass = massC;
                            cPeak.mOriginalPeaks = peaks;
                            cPeak.mIntensity = sum;
                            cPeak.mMassLowBound = massC - 0.0001;
                            cPeak.mMassHighBound = massC + 0.0001;
                            cPeak.mType = CPeakType.C;
                            newS.mPeaks.add(cPeak);
						} else {
							peaks = spectrum.find_peaks(massZ, massZ * massAccurange);
							if (!peaks.isEmpty()) {
								sum = 0;
								for (int i = 0; i < peaks.size(); i++) {
									sum += peaks.get(i).mIntensity;
								}
								CPeak cPeak = new CPeak();
								cPeak.mSpectrum = newS;
								cPeak.mMass = massC;
								cPeak.mOriginalPeaks = peaks;
								cPeak.mIntensity = sum;
								cPeak.mMassLowBound = massC - 0.0001;
								cPeak.mMassHighBound = massC + 0.0001;
								cPeak.mIsComplement = true;
								cPeak.mType = CPeakType.C;
								newS.mPeaks.add(cPeak);
							}
						}
					}
					if (this.mCheckMinus2H) {
						massC = massC - CMass.H2;
						peaks = newS.find_peaks(massC, 0.0001);
						if (peaks.isEmpty()) {
							peaks = spectrum.find_peaks(massC, massC * massAccurange);
							if (!peaks.isEmpty()) {
								for (int i = 0; i < peaks.size(); i++) {
									sum += peaks.get(i).mIntensity;
								}
								CPeak cPeak = new CPeak();
	                            cPeak.mSpectrum = newS;
	                            cPeak.mMass = massC;
	                            cPeak.mOriginalPeaks = peaks;
	                            cPeak.mIntensity = sum;
	                            cPeak.mMassLowBound = massC - 0.0001;
	                            cPeak.mMassHighBound = massC + 0.0001;
	                            cPeak.mType = CPeakType.combineType(CPeakType.C, CPeakType.Minus2H);
	                            newS.mPeaks.add(cPeak);
							}
						} else {
							for (int h = 0; h < peaks.size(); h++) {
								peaks.get(h).mType = CPeakType.combineType(peaks.get(h).mType, CPeakType.combineType(CPeakType.C, CPeakType.Minus2H));
							}
						}
					}
				}
			}
			int n = newS.mPeaks.size();
			for (int m = 0; m < n; m++) {
				CPeak aPeak = newS.mPeaks.get(m);
				if (CPeakType.isB(aPeak.mType) != 0 || CPeakType.isC(aPeak.mType) != 0) {
					if (aPeak.mComplementPeak != null) continue; 
					for (int c = m+1; c < n; c++) {
						if (Math.abs(aPeak.mMass + newS.mPeaks.get(c).mMass - newS.mPrecursorMZ - CMass.Proton) < 0.000001) {
							aPeak.mComplementPeak = newS.mPeaks.get(c);
							newS.mPeaks.get(c).mComplementPeak = aPeak;
						}
					}
				} else {
					double tempMass = newS.mPrecursorMZ - aPeak.mMass + CMass.Proton;
					if (tempMass < this.mMonoMasses[0] - CMass.CH2 - CMass.H2O) continue;
					ArrayList<CPeak> peaks = newS.find_peaks(tempMass, 0.0001);
					if (peaks.isEmpty()) {
						CPeak newPeak = new CPeak();
						newPeak.mSpectrum = newS;
                        newPeak.mOriginalPeaks = new ArrayList<>();
                        newPeak.mOriginalPeaks.add(aPeak);
                        newPeak.mMass = tempMass;
                        newPeak.mMassLowBound = tempMass - 0.0001;
                        newPeak.mMassHighBound = tempMass + 0.0001;
                        newPeak.mIsComplement = true;
                        newPeak.mComplementPeak = aPeak;
                        if (CPeakType.isY(aPeak.mType) != 0) newPeak.mType = CPeakType.B;
                        if (CPeakType.isZ(aPeak.mType) != 0) newPeak.mType = CPeakType.combineType( newPeak.mType, CPeakType.C );
                        newS.mPeaks.add(newPeak);
                        aPeak.mComplementPeak = newPeak;
                        }
				}
			}
			Collections.sort(newS.mPeaks);
			CPeak newPeak = new CPeak();
			newPeak.mSpectrum = newS;
			newPeak.mMass = newS.mPrecursorMZ;
			newPeak.mType = CPeakType.T;
			newPeak.mMassLowBound = newPeak.mMass - 0.0001;
			newPeak.mMassHighBound = newPeak.mMass + 0.0001;
			ArrayList<CPeak> oripeak = new ArrayList<>();
			oripeak.add(spectrum.mPeaks.get(spectrum.mPeaks.size() - 1));
			newPeak.mOriginalPeaks = oripeak;
			newS.mPeaks.add(newPeak);
		}
		return spectra;
	}
	
	private void combination(ArrayList<int[]> ans, int n, int[] composition) {
		combine(ans, new int[CMonosaccharideSet.cNumberMonosaccharideClasses], 0, n, composition);
	}
	
	private void combine(ArrayList<int[]> ans, int[] combine, int curr, int left, int[] composition) {
		if (curr == CMonosaccharideSet.cNumberMonosaccharideClasses-1 || left == 0) {
			int[] newcombine = Arrays.copyOf(combine,combine.length);
			newcombine[curr] = left;
			ans.add(newcombine);
			return;
		}
		for (int i = Math.min(composition[curr], left); i >= Math.max(0, left - limitCut[curr+1]); i--) {
			int[] newcombine = Arrays.copyOf(combine,combine.length);
			newcombine[curr] = i;
			combine(ans, newcombine, curr + 1, left - i, composition);
		}
	}
	
	void set_reducing_end_modification(String REM) {
		if (!this.mReducingEndModification.equals(REM)) {
			this.mReducingEndModification = REM;
			this.mREMMassCompensation = CMass.get_mass_compensation(REM, this.mPermethylated);
		}
	}
	
	public static CMass2Composition load(String datafile) {
		CMass2Composition read = new CMass2Composition();
		try {
			FileInputStream fileStream=new FileInputStream(datafile);
			ObjectInputStream iStream=new ObjectInputStream(fileStream);
			Object oneObject=iStream.readObject();
			read = (CMass2Composition) oneObject;
			iStream.close();
			fileStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return read;
	}
	
	public boolean get_permethylation() {
		return this.mPermethylated;
	}
	
	public void set_permethylation(boolean newPermethylated) {
		if (this.mPermethylated != newPermethylated) {
			this.mPermethylated = newPermethylated;
			for (int k = 0; k < CMonosaccharideSet.cNumberMonosaccharideClasses; k++) {
				this.mMonoMasses[k] = CMonosaccharideSet.get_mass(CMonosaccharideSet.cMonoClasses[k], newPermethylated);
			}
		}
	}
	
	private void save(String mapfile) {
		File file = new File(mapfile);
		FileOutputStream out;
		try {
            out = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(this);
            objOut.flush();
            objOut.close();
        } catch (IOException e) {
            System.out.println("write object failed");
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		ArrayList<int[]> alist = new ArrayList<>();
		CMass2Composition c = new CMass2Composition();
		int[] composition = new int[] {3,3,3,3,0,0,0,0};
		c.limitCut = new int[8];
		c.limitCut[8 - 1] = composition[8 - 1];
		for (int n = 8 - 2; n >= 0; n--) {
			c.limitCut[n] = c.limitCut[n + 1] + composition[n];
		}
		c.combination(alist,5,composition);
		for (int[] i : alist) {
			for (int j = 0; j < i.length; j++) {
				System.out.print(i[j] + " ");
			}
			System.out.println();
		}
	}
	
}
