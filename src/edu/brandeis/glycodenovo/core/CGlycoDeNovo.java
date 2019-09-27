<<<<<<< .mine
package edu.brandeis.glycodenovo.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.InvalidParameterException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Copyright [2018] [Pengyu Hong at Brandeis University] Licensed under the
 * Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

/*
 * This is the main part of algorithm some important note on params correspond
 * with algorithm in the paper
 * 
 * Cpeak / Cpeak.mInferredSuperSets : candidate for a certain peak
 * mTopologySuperSets : Candidate pool TopologySuperSet: Candidate TopologySet :
 * Reconstruction (Important : it's not the same as the definition in Topology)
 * Topology : Topology
 * 
 * Documentation on different parts of this Class CGlycoDeNovo --- constructor
 * 1. interpretPeaks --- algorithm 1
 * 
 * generate all possible candidates (Cpeak.mInferredSuperSets()) including find
 * whether C-ion can be interpreted as a former B-ion interpretApeak --
 * interpret current peak (algorithm 1 step 4 - 5) here only consider 2 branch
 * testAndAddTopologySet --- step 6 in algorithm 1 insertIntoCurrentTSS --- step
 * 7 in algorithm 1 -- insert all possible TSS to candidate and pool
 * (Cpeak.mInferredSuperSets() and Cpeak.mInferredSuperSets()) (including B-ion
 * and C-ion) appendNLinkedRoot --- finally add some missing part to the root
 * 
 * 2. reconstructFormulas --- algorithm 2 call function for final peak 1.find
 * all unique TopologySuperSet that can be interpreted related to final peak
 * 2.from small to large --- reconstruct final peak (step 4 - 19) call function
 * TSS.reconstructformular() to reconstruct all TSS
 * 
 */

public class CGlycoDeNovo {
	// All cMonosaccharideClasses
	static String[] cMonosaccharideClasses = { "Xyl", "Fuc", "Hex", "HexA", "HexNAc", "Kdo", "NeuAc", "NeuGc" };
	private CMonosaccharide[] cMonosaccharideArrays = new CMonosaccharide[cMonosaccharideClasses.length];
	// All possible bonds
	// Will be used in reconstruction part
	static boolean[][] cLegalGlycosidicBonds = { { true, true, true, true, true, true, true, true },
			{ true, false, true, true, true, true, true, true }, { false, false, true, true, true, true, true, true },
			{ false, false, true, true, true, true, true, true }, { false, false, true, true, true, true, true, true },
			{ false, false, true, true, true, true, true, true }, { false, false, true, true, true, true, true, true },
			{ false, false, true, true, true, true, true, true } };

	double 	mMassAccuracyPPM = 5; // ppm = 1000000*mass_error/exact_mass; mass_error = mMassAccuracyPPM*exact_mass/1000000;
	double	mMassAccuracyPP = 0.0000005; // ppm / 1000000
	double	mMassAccuracyDalton = 0.005; // Da
	int		mMaxBranchingNum = 2; // default bi-branching
	double	mIonMass = 0; // mass of the metal Ion
	String	mIonMetal; // type of mIonMetal
	double	mIntensityThreshold = 0; // Lowest Threshold for peak Intensity
	boolean	mNLinked = false; // whether is Nlinked
	boolean	mPermethylated = false; // Permethylated means attach CH2 on molecular
	String	mReducingEndMode;
	double	mReducingEndCompensation = 0;
	double	mFinalPeakCompensation = 0;
	int[]	mCompositionCountThreshold = new int[8];
	boolean mCheckMinus2H = false;
	boolean mCheckGap = false;
	String mComment;
	
	ArrayList<CPeak> mPeaks;
	ArrayList<CTopologySuperSet> mTopologySuperSets;

	ArrayList<String> mPossibleMonosaccharideClasses = null;
	// Mass Compensation for Specific experiment condition
	private Delta mDelta;
	private Delta2 mDelta2;
	private int mNumPeaks = 0;
	
	private CPeak mCurrentPeak = null;
	private int mCurrentPeakIdx = -1; 
	private boolean mFinalPeak = false;
	private double mCurrentTargetMass = 0;
	private double mCurrentTargetMassLow = 0;
	private double mCurrentTargetMassHigh = 0;
	private int mCurrentTPSuperSetSize = 0;
	private boolean mTryCIon = false;
	private boolean mLeafPeak = false;
	// TSSB TSSC is for no Check2H // TSSB2 TSSC2 for check2H
	private CTopologySuperSet mCurrentTopologySuperSetB;
	private CTopologySuperSet mCurrentTopologySuperSetB2;
	private CTopologySuperSet mCurrentTopologySuperSetC;
	private CTopologySuperSet mCurrentTopologySuperSetC2;
	private CTopologySuperSet[] mCurrentBranches; // TSS Branches
	// initialize

	//@TODO: haven't finished
	public CGlycoDeNovo (String fileName) {
		mPeaks = new ArrayList<>();
		Scanner sc = null;
		File specFile = new File(fileName);
		try {
			sc = new Scanner(specFile);
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException("No such file");
		}
		String currentLine = sc.nextLine().trim();
		while(currentLine.startsWith("#")) {
			Pattern p1 = Pattern.compile("Check -2H");
			Pattern p2 = Pattern.compile("Allow gap");
			Matcher m1 = p1.matcher(currentLine);
			Matcher m2 = p2.matcher(currentLine);
			if (m1.find()) {
				mCheckMinus2H = currentLine.charAt(currentLine.length() - 1) != 0 ? true : false;
			} else if (m2.find()) {
				mCheckGap = currentLine.charAt(currentLine.length() - 1) != 0 ? true : false;
			} else {
				mComment = currentLine;
			}
			currentLine = sc.nextLine().trim();
		}
		while (sc.hasNextLine()) {
			String currLine = sc.nextLine().trim();
			//System.out.println("Current Line: " + currLine);
			Scanner lineSc = new Scanner(currLine);
			if (!lineSc.hasNext()) {
				continue;
			}
			String head = lineSc.next();
			if (head.equals("@")) {
				int peakid = 0, complement = 0, rawZ = 0;
				double mass = 0, rawMZ = 0, intensity = 0;
				while (lineSc.hasNext()) {
					String read = lineSc.next();
					if (read.equals("Peak")) {
						peakid = lineSc.nextInt() - 1;
					} else if (read.equals("complement")) {
						complement = lineSc.nextInt();
					} else if (read.equals("mass")) {
						mass = lineSc.nextDouble();
					} else if (read.equals("rawMZ")) {
						rawMZ = lineSc.nextDouble();
					} else if (read.equals("rawZ")) {
						rawZ = lineSc.nextInt();
					} else if (read.equals("intensity")) {
						intensity = lineSc.nextDouble();
					}
				}
				//@Todo: add CSpectrum and mComplement for these peaks later.
				//@Todo: which is original?
				mPeaks.add(new CPeak(peakid, complement, mass, rawMZ, rawZ, intensity));
				//System.out.println("peakid " + peakid + " complement " + complement + " mass " + mass +
				//		" rawMZ " + rawMZ + " rawZ " + rawZ + " intensity " + intensity); 
			}
			if (head.equals("**")) {
				int peakid = 0;
				String type = "", formula = "";
				Set<CPeak> peaks = new HashSet<>();
				double score = 0;
				while (lineSc.hasNext()) {
					String read = lineSc.next();
					if (read.equals("Peak")) {
						peakid = lineSc.nextInt() - 1;
					} else if (read.equals("type")) {
						type = lineSc.next();
					} else if (read.equals("Formula")) {
						String rread = lineSc.next();
						while (!rread.equals("\\Formula")) {
							formula = formula + " " + rread;
							rread = lineSc.next();
						}
					} else if (read.equals("Peaks")) {
						while (lineSc.hasNextInt()) {
							peaks.add(mPeaks.get(lineSc.nextInt() - 1));
						}
						lineSc.next();
					} else if (read.equals("Scores")) {
						lineSc.next();
						score = lineSc.nextDouble();
					}
				}
				//@Todo: build a TSS with the topologies?
				//System.out.println("Peak " + peakid + " type " + type + " formula " + formula + 
				//		" peaks " + peaks.toString() + " scores " + score);
			}
		}
	}
	public CGlycoDeNovo(double massAccuracyPPM) {
		mMassAccuracyPPM = massAccuracyPPM;
		mMassAccuracyPP = mMassAccuracyPPM / 1000000;
		Arrays.fill(mCompositionCountThreshold, 8000);
	}

	public CGlycoDeNovo(double massAccuracyPPM, boolean checkMinus2H, boolean checkGap) {
		mCheckMinus2H = checkMinus2H;
		mCheckGap = checkGap;
		mMassAccuracyPPM = massAccuracyPPM;
		mMassAccuracyPP = mMassAccuracyPPM / 1000000;
		Arrays.fill(mCompositionCountThreshold, 8000);
	}

	public void setMaxBranchNum( int num )
	{
		if ( num > 1 && num < 5 )
			this.mMaxBranchingNum = num;
	}
	
    private boolean acceptable_monosaccharide( String monoClass ) {
    	if ( this.mPossibleMonosaccharideClasses == null || this.mPossibleMonosaccharideClasses.size() == 0 )
    		return true;
    	if ( this.mPossibleMonosaccharideClasses.indexOf( monoClass ) >= 0 )
    		return true;
    	return false;
    }
    
    // Algorithm part 1: Intepret ALl Peaks
	public void interpretPeaks(CSpectrum spec) {
		// initialize all params related to spec
		if ( spec.isProtonated() ) {
			mIonMetal = "Proton";
			mIonMass = CMass.Proton;
		} else {
			mIonMetal = spec.getMetal();
			switch ( mIonMetal ) {
			case "Lithium":
				mIonMass = CMass.Lithium - CMass.Electron;

			case "Na":
			case "Sodium":
				mIonMass = CMass.Sodium - CMass.Electron;
				break;
			default:
				throw new InvalidParameterException("ionMetal not found");
			}
		}
		// default params
		mMassAccuracyDalton = spec.getPrecursorMZ() * mMassAccuracyPP;
		mPermethylated = spec.isPermethylated();
		mNLinked = spec.isNLinked();
		mReducingEndMode = spec.getReducingEndMode();
		if (mReducingEndMode != null)
			mReducingEndCompensation = CMass.reducingEndMassCompensation(mReducingEndMode, mPermethylated);
		if ( mPermethylated )
			mFinalPeakCompensation = mReducingEndCompensation + CMass.CH2 + CMass.H2O;
		else
			mFinalPeakCompensation = mReducingEndCompensation;
		for (int i = 0; i < cMonosaccharideClasses.length; i++) {
			cMonosaccharideArrays[i] = new CMonosaccharide(cMonosaccharideClasses[i], mPermethylated);
		}
		mDelta = new Delta(cMonosaccharideClasses.length, this.mPermethylated);
		mDelta2 = new Delta2(cMonosaccharideClasses.length, this.mPermethylated);
		// clear all existing inferences.
		spec.clearInferred();
		mPeaks = spec.getPeaks( 0 );
		mNumPeaks = mPeaks.size();
		mCurrentPeakIdx = -1;
		// step 1 - default candidate pool
		mTopologySuperSets = new ArrayList<>();
		mFinalPeak = false;

		spec.updatePeakIDs();
		for (int k = 0; k < mPeaks.size(); k++) { // step 2
			// step 3 initialize the candidate set / mass
			mCurrentPeak = mPeaks.get(k);
			if (mCurrentPeak.getIntensity() < mIntensityThreshold)
				continue;
			mCurrentTargetMass = mCurrentPeak.getMass();
			
			// Ignore peaks whose mass is too small (less than a single monosaccharide).
			if (mPermethylated) {
				if (mCurrentTargetMass < 175)
					continue;
			} else if (mCurrentTargetMass < 131)
				continue;

			// Initialize parameters that store intermediate results or make access easier.
			mCurrentPeakIdx = k; 
			mCurrentTargetMassLow = mCurrentPeak.getMassLowBound();
			mCurrentTargetMassHigh = mCurrentPeak.getMassHighBound();
			mCurrentTopologySuperSetB = null;
			mCurrentTopologySuperSetB2 = null;
			mCurrentTopologySuperSetC = null;
			mCurrentTopologySuperSetC2 = null;
			mCurrentTPSuperSetSize = mTopologySuperSets.size();
			mCurrentBranches = new CTopologySuperSet[4]; // empty branches

			// If the current peak is the precursor peak, we do not need to try to interpret it as a C-ion, 
			// and hence should set mTryCIon = false and mFinalPeak = true.
			if (mCurrentPeakIdx == mNumPeaks - 1) {
				mTryCIon = false;
				mFinalPeak = true;
			} else {
				mTryCIon = true;
				// This can save computational time: Try to find existing B-ion interpretation of this C-ion (B-Ion = C-Ion - H2O)
				// If such a B-ion exists, we don't need to try C-ions in the following calculation (save time).
				double bIonMassLow = mCurrentTargetMassLow - CMass.H2O;
				double bIonMassHigh = mCurrentTargetMassHigh - CMass.H2O;
				for (int m = mCurrentTPSuperSetSize - 1; m >= 0; m--) {
					CTopologySuperSet ctss = mTopologySuperSets.get(m);
					if ( ctss.mType.equals("C") ) continue;	// Skip if ctss is of a C ion
					
					/* Modified by Hong 8/3/3019
					double avgMass = (ctss.mMassLow + ctss.mMassHigh) / 2;
					// search for avgMass in BionMass - 0.01 ~ BionMass + 0.01
					if (bIonMass > avgMass + 0.01) // 0.01 is the mass accuracy,
													// should be changed to PPM
													// based.
						break;
					else if (bIonMass >= avgMass - 0.01) {
						// Interpret as C ion of previous candidate
						ctss.addPeak(mCurrentPeakIdx, 2);
						mCurrentPeak.getInferredSuperSets().add(ctss);
						mTryCIon = false;
						break;
					}
					*/
					if ( bIonMassLow < ctss.mMassLow || bIonMassHigh > ctss.mMassHigh ) // replace the block above
						continue;
				}
			}
			// step 4 ~ 5
			//System.out.println( "Peak ID: " + k );
			interpretAPeak();

			if (mFinalPeak && mCurrentTopologySuperSetB == null && mCurrentTopologySuperSetC == null )
				appendNLinkedRoot(); // If failed to interpret the final peak, try adding the Nlink root.
			
			addCurrentTSSToPool(); // add CurrentTSS to Pool
		}
		System.out.println("CGlycoDeNovo::interpretPeaks() done!");
	}

	// Add NLinkedRoot part for Final Peak
	private void appendNLinkedRoot() {
		double mass_error = mMassAccuracyPP * mPeaks.get(mPeaks.size() - 1).getMass();
		double targetMLow = mPeaks.get(mPeaks.size() - 1).getMass() - mass_error;
		double targetMHigh = mPeaks.get(mPeaks.size() - 1).getMass() + mass_error;
		double dMassBIonNoFuc = CMonosaccharideSet.GlcNAc.sacPermethylated.mass * 2
				- (CMass.CH2 * 2 * (this.mPermethylated? 1 : 0) + CMass.H2O) * 2 + mFinalPeakCompensation;
		// % check if there is a ion corresponding to Fuc
		CTopologySuperSet ssFuc = null;
		for (CTopologySuperSet mTSS : mTopologySuperSets) {
			for (CTopologySet cs : mTSS.mTopologySets) {
				if (cs.mRootMono.mClassID == 2 && cs.mBranches[0] == null) {
					ssFuc = mTSS;
					break;
				}
			}
			if (ssFuc != null)
				break;
		}
		double dMassBIonWithFuc = 0;
		if (ssFuc != null) {
			dMassBIonWithFuc = dMassBIonNoFuc + CMonosaccharideSet.dHex.sacPermethylated.mass
					- (CMass.CH2 * 2 * (this.mPermethylated? 1 : 0) + CMass.H2O);
		}

		for (int cidx = mTopologySuperSets.size() - 1; cidx >= 0; cidx--) {
			CTopologySuperSet mTSS = mTopologySuperSets.get(cidx);
			double tMassLow = mTSS.mMassLow + dMassBIonNoFuc;
			double tMassHigh = mTSS.mMassHigh + dMassBIonNoFuc;

			if (tMassHigh < targetMLow - 2 && ssFuc == null) // % too light, no
																// need to
																// continue.
				break;
			if (targetMHigh > tMassLow && targetMLow < tMassHigh) {
				insertIntoCurrentTSS(new CTopologySet("T", mCurrentTargetMass, tMassLow, tMassHigh, mDelta.B2B.unit[4],
						mDelta.B2B.unit[4], new CTopologySuperSet[] { mTSS, null, null, null }, this));
			}

			if (ssFuc != null) {
				tMassLow = mTSS.mMassLow + dMassBIonWithFuc;
				tMassHigh = mTSS.mMassHigh + dMassBIonWithFuc;

				if (targetMHigh > tMassLow && targetMLow < tMassHigh) {
					insertIntoCurrentTSS(
							new CTopologySet("T", mCurrentTargetMass, tMassLow, tMassHigh, mDelta.B2B.unit[4],
									mDelta.B2B.unit[4], new CTopologySuperSet[] { ssFuc, mTSS, null, null }, this));
					insertIntoCurrentTSS(
							new CTopologySet("T", mCurrentTargetMass, tMassLow, tMassHigh, mDelta.B2B.unit[4],
									mDelta.B2B.unit[4], 1, new CTopologySuperSet[] { ssFuc, mTSS, null, null }, this));
				}
			}
		}
	}

	// Add Current TSSB TSSC to the search pool
	private void addCurrentTSSToPool() {
		// Add mCurrentTopologySuperSetB/B1/B2/C/C1/C2 to the search pool, which will be used in 
		// interpreting the peaks followed

		CPeak curPeak = mPeaks.get(mCurrentPeakIdx);
		// add C2 to TSS if not null
		if (mCurrentTopologySuperSetC2 != null) {
			if (mTopologySuperSets.isEmpty() || mCurrentTopologySuperSetC2.mMassLow > mTopologySuperSets
					.get(mTopologySuperSets.size() - 1).mMassLow) {
				// add to end if pool empty or TSS mass is largest
				mTopologySuperSets.add(mCurrentTopologySuperSetC2);
				curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetC2);
			} else {
				// search for its correct position if mass is not largest
				for (int i = mTopologySuperSets.size() - 1; i >= 0; i--) {
					if (mTopologySuperSets.get(i).contains(mCurrentTopologySuperSetC2)) {
						curPeak.getInferredSuperSets().add(mTopologySuperSets.get(i));
						// type 22 is to indicate that this is a C-2H ion
						mTopologySuperSets.get(i).addPeak(mCurrentPeakIdx, 22);
						break;
					} else if (mCurrentTopologySuperSetC2.mMassLow > mTopologySuperSets.get(i).mMassLow) {
						mTopologySuperSets.add(i + 1, mCurrentTopologySuperSetC2);
						curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetC2);
						break;
					}
				}
			}
		}
		if (mCurrentTopologySuperSetC != null) {
			// add to end if pool empty or TSS mass is largest
			if (mTopologySuperSets.isEmpty() || mCurrentTopologySuperSetC.mMassLow > mTopologySuperSets
					.get(mTopologySuperSets.size() - 1).mMassLow) {
				mTopologySuperSets.add(mCurrentTopologySuperSetC);
				curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetC);
			} else {
				// search for its correct position if mass is not largest
				for (int i = mTopologySuperSets.size() - 1; i >= 0; i--) {
					if (mTopologySuperSets.get(i).contains(mCurrentTopologySuperSetC)) {
						curPeak.getInferredSuperSets().add(mTopologySuperSets.get(i));
						// type 2 means this is a C ion
						mTopologySuperSets.get(i).addPeak(mCurrentPeakIdx, 2);
						break;
					} else if (mCurrentTopologySuperSetC.mMassLow > mTopologySuperSets.get(i).mMassLow) {
						mTopologySuperSets.add(i + 1, mCurrentTopologySuperSetC);
						curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetC);
						break;
					}
				}
			}
		}

		if (mCurrentTopologySuperSetB2 != null) {
			// add to end if pool empty or TSS mass is largest

			if (mTopologySuperSets.isEmpty() || mCurrentTopologySuperSetB2.mMassLow > mTopologySuperSets
					.get(mTopologySuperSets.size() - 1).mMassLow) {
				mTopologySuperSets.add(mCurrentTopologySuperSetB2);
				curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetB2);
			} else {
				// search for its correct position
				for (int i = mTopologySuperSets.size() - 1; i >= 0; i--) {
					if (mTopologySuperSets.get(i).contains(mCurrentTopologySuperSetB2)) {
						curPeak.getInferredSuperSets().add(mTopologySuperSets.get(i));
						mTopologySuperSets.get(i).addPeak(mCurrentPeakIdx, 21);
						break;
					} else if (mCurrentTopologySuperSetB2.mMassLow > mTopologySuperSets.get(i).mMassLow) {
						mTopologySuperSets.add(i + 1, mCurrentTopologySuperSetB2);
						curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetB2);
						break;
					}
				}
			}
		}

		if (mCurrentTopologySuperSetB != null) {
			mTopologySuperSets.add(mCurrentTopologySuperSetB);
			curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetB);
		}
	}

	// step 4 - 5
	private void interpretAPeak() {
		if (mCurrentTargetMass < 438) { // try to interpret as a mono, hence should not be heavier than the heaviest mono
			double massCompensationLow = mIonMass; // use this as a temp to calculate both massCompensationHigh and massCompensationLow
			if (mPermethylated)
				massCompensationLow += CMass.CH2;
			if (mFinalPeak)
				massCompensationLow = massCompensationLow + mFinalPeakCompensation;
			double massCompensationHigh = massCompensationLow * (1 + mMassAccuracyPP);
			massCompensationLow = massCompensationLow * (1 - mMassAccuracyPP);
			mLeafPeak = true;
			if ( testAddTopologySet(massCompensationLow, massCompensationHigh) == -1 )
				return;
		}
		
		mLeafPeak = false;
		double[] branchMassesLow = new double[4];
		double[] branchMassesHigh = new double[4];
		int testAddResult = 0;
		
		// each branch causes a CH2 loss to the joint monosaccharide when permethylated && obj.mDelta only considers linear structure (i.e., one branch).
		double massD = mIonMass + (this.mPermethylated? 1 : 0) * CMass.CH2;

		for (int k = 0; k < mCurrentTPSuperSetSize; k++) { // 1st branch
			mCurrentBranches[0] = mTopologySuperSets.get(k);
			if (mFinalPeak) {
				branchMassesLow[0] = mCurrentBranches[0].mMassLow + mFinalPeakCompensation * (1 - mMassAccuracyPP);
				branchMassesHigh[0] = mCurrentBranches[0].mMassHigh + mFinalPeakCompensation * (1 + mMassAccuracyPP);
			} else {
				branchMassesLow[0] = mCurrentBranches[0].mMassLow;
				branchMassesHigh[0] = mCurrentBranches[0].mMassHigh;
			}
			if ( testAddTopologySet(branchMassesLow[0], branchMassesHigh[0]) == -1 )
				break;

			for (int kk = k; kk < mCurrentTPSuperSetSize; kk++) { // 2nd branch
				mCurrentBranches[1] = mTopologySuperSets.get(kk);
				branchMassesLow[1] = mCurrentBranches[1].mMassLow - massD;
				branchMassesHigh[1] = mCurrentBranches[1].mMassHigh - massD;
				// sum of low and high
				if ( testAddTopologySet(branchMassesLow[1] + branchMassesLow[0], branchMassesHigh[1] + branchMassesHigh[0]) == -1 )
					break;

				// Begin: 2-branch-with-gap code block 1
                if ( ( this.mMaxBranchingNum < 3 ) && !this.mCheckGap ) // maximum number of branches = 2
                    continue; 
                // End: 2-branch-with-gap code block 1
                
                for (int kkk = kk; kkk < mCurrentTPSuperSetSize; kkk ++ ) { // 3rd branch
                	mCurrentBranches[2] = mTopologySuperSets.get(kkk);
    				branchMassesLow[2] = mCurrentBranches[2].mMassLow - massD * (1 + mMassAccuracyPP);
    				branchMassesHigh[2] = mCurrentBranches[2].mMassHigh - massD * (1 - mMassAccuracyPP);
    				
    				//Begin: 2-branch-with-gap code block 2
    				if ( this.mCheckGap && (this.mMaxBranchingNum < 3) )
    					testAddResult = testAddTopologySet_2BranchWithGap( branchMassesLow[1] + branchMassesLow[0], branchMassesHigh[1] + branchMassesHigh[0] );
    				else
    					testAddResult = testAddTopologySet( branchMassesLow[2] + branchMassesLow[1] + branchMassesLow[0], 
    														branchMassesHigh[2] + branchMassesHigh[1] + branchMassesHigh[0] );
                    //End: 2-branch-with-gap code block 2
                        
                    if ( testAddResult == -1 ) // no need to try further because too heavy.
                    	break;
                        
                    if ( this.mMaxBranchingNum < 4 ) // maximum number of branches = 3
                    	continue;
                        
                    for (int kkkk = kkk; kkkk < mCurrentTPSuperSetSize; kkkk++) { // 4th branch
                    	mCurrentBranches[3] = mTopologySuperSets.get(kkkk);
        				branchMassesLow[3] = mCurrentBranches[3].mMassLow - massD * (1 - mMassAccuracyPP);
        				branchMassesHigh[3] = mCurrentBranches[3].mMassHigh - massD * (1 + mMassAccuracyPP);
    					testAddResult = testAddTopologySet( branchMassesLow[3] + branchMassesLow[2] + branchMassesLow[1] + branchMassesLow[0], 
    														branchMassesHigh[3] + branchMassesHigh[2] + branchMassesHigh[1] + branchMassesHigh[0] );
                        if ( testAddResult == -1 ) // no need to try further because too heavy.
                            break;
                    }
					mCurrentBranches[3] = null;
                    branchMassesLow[3] = 0;
                    branchMassesHigh[3] = 0;
                }
                mCurrentBranches[2] = null;
                branchMassesLow[2] = 0;
                branchMassesHigh[2] = 0;
			}
			mCurrentBranches[1] = null;
			// default second branch and go to set next first branch
			branchMassesLow[1] = 0;
			branchMassesHigh[1] = 0;
		}
		mCurrentBranches[0] = null;
		branchMassesLow[0] = 0;
		branchMassesHigh[0] = 0;
	}

	// algorithm 2 -- reconstruct last peak
	public void reconstructFormulas() {

		CPeak lastPeak = mPeaks.get(mPeaks.size() - 1);
		HashSet<CTopologySuperSet> frontier = new HashSet<>(lastPeak.getInferredSuperSets());
		// put the last candidate's InferredSuperSets in.....
		HashSet<CTopologySuperSet> buffer = new HashSet<>(frontier);

		while (!frontier.isEmpty()) {
			ArrayList<CTopologySuperSet> newFrontier = new ArrayList<>();
			for (CTopologySuperSet tss : frontier) {
				for (CTopologySet ts : tss.mTopologySets) {
					ts.mTargetPeaks = tss.mTargetPeaks;
					newFrontier.addAll(Arrays.asList(ts.mBranches));
				}
			}
			newFrontier.removeIf(Objects::isNull); // remove nulls
			frontier = new HashSet<>(newFrontier);
			buffer.addAll(frontier);
		}

		// find all unique TSS that relevant to last peak.
		List<CTopologySuperSet> sortedUniqueTSS = new ArrayList<>(buffer);
		Collections.sort(sortedUniqueTSS);

		// reconstruct all ts from small to large
		// begin algorithm 2 (CandidateSetReconstructor()) for last peak
		for (CTopologySuperSet ts : sortedUniqueTSS) {
			ts.reconstructFormulas();
		}

		System.out.println("CGlycoDeNovo::reconstruct_formulas done!");
		// link all valid formula of TSS to peak
		for (CPeak peak : mPeaks) {
			// get all valid peak
			peak.getInferredSuperSets().removeIf(e -> !e.mLegal);
			if (peak.getInferredSuperSets().isEmpty())
				continue;
			peak.getInferredSuperSets().forEach(e -> Collections.sort(e.mTopologies));
			// need to sort the mTopologies to make sure that all formula will
			// be in correct order (number of peak (large -> small), String
			// sorted order)
			Map<String, CTopology> formulaToTSS = new HashMap<>();
			// make sure there is only a unique result for each formula
			for (CTopologySuperSet superSet : peak.getInferredSuperSets()) {
				for (CTopology mTopology : superSet.mTopologies) {
					formulaToTSS.putIfAbsent(mTopology.mFormula, mTopology);
				}
			}

			peak.setInferredFormulas(new ArrayList<>(formulaToTSS.keySet()));
			peak.setInferredTopologies(new ArrayList<CTopology>(formulaToTSS.values()));
			int size = peak.getInferredFormulas().size();
			peak.setInferredMasses(new ArrayList<>(size));
			peak.setInferredScores(new ArrayList<>(size));
			peak.setInferredGWAFormulas(new ArrayList<>(size));

			for (String formula : peak.getInferredFormulas()) {
				peak.getInferredMasses().add(formulaToTSS.get(formula).mMass);
				peak.getInferredScores().add(formulaToTSS.get(formula).mSupportPeaks.size());
				//peak.getInferredGWAFormulas().add("freeEnd--?" + formulaToTSS.get(formula).mGWAFormula.substring(3));
				peak.getInferredGWAFormulas().add( formulaToTSS.get(formula).mGWAFormula );
			}
		}
		
		List<String> formula = mPeaks.get(mPeaks.size()-1).getInferredFormulas();
		if ( formula == null || formula.size() == 0 )
			System.out.println("Failed to reconstruct topologies.");
		else
		{
			System.out.printf("Reconstruct %d topologies.\n", formula.size());
			for ( String s : formula )
				System.out.println( s );
		}
	}

	// step 6 - 8
	private int testAddTopologySet(double massCompensationLow, double massCompensationHigh) {
		int result = 0;

		// Check if the branches together are already too heavy or still too light
		double temp = mCurrentTargetMass - massCompensationLow;
		if ( this.mPermethylated ) {
			if (temp < 160)
				return -1; // too light
			if (mCheckGap) {
				if (temp > 860) // max( permethylated this.mDelta2.B2C )
					return 0;
			} else if (temp > 420) // max( permethylated this.mDelta.B2C )
				return 0;
		} else {
			if (temp < 105)
				return -1; // too light
			if (mCheckGap) {
				if (temp > 660) // max( unpermethylated this.mDelta2.B2C )
					return 0;
			} else if (temp > 335) // max( unpermethylated this.mDelta.B2C )
				return 0;
		}

		// record unitIndexes and whether each is a minusH result
		ArrayList<Integer> unitIndexes = new ArrayList<Integer>();
		ArrayList<Integer> minusHCount = new ArrayList<Integer>();
		ArrayList<Double> lowMasses = new ArrayList<Double>();
		ArrayList<Double> highMasses = new ArrayList<Double>();
		double theoreticalMassLow, theoreticalMassHigh;
		CTopologySet newTS;
		CMonosaccharide newUnit;

		// B2B: try to interpret as a B-ion by adding one monosaccharide to a B-ion
		for (int k = 0; k < mDelta.B2B.mass.length; k++) {
			// Begin 2019/09/15. Move from "for (int a = 0; a < unitIndexes.size(); a++)" to here
			newUnit = mDelta.B2B.unit[k];
			if ( !this.acceptable_monosaccharide( newUnit.mClass ) || (newUnit.mClassID == 2 && !mLeafPeak) || 
					mCompositionCountThreshold[newUnit.mClassID - 1] < 1)
				continue;
			// End 2019/09/15. Move from "for (int a = 0; a < unitIndexes.size(); a++)" to here
			
			theoreticalMassLow = mDelta.B2B.mass[k] + massCompensationLow;
			theoreticalMassHigh = mDelta.B2B.mass[k] + massCompensationHigh;
			// Begin 2019/09/15. Replaced by the conditional check below.
			// if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh )
			// End 2019/09/15.
			if ( this.mCurrentTargetMassHigh > theoreticalMassLow && this.mCurrentTargetMassLow < theoreticalMassHigh ) {
				unitIndexes.add(k);
				minusHCount.add(0);
				lowMasses.add( theoreticalMassLow );
				highMasses.add( theoreticalMassHigh );
			}
			else if (mCheckMinus2H) { // 2019/09/15. Move from below to here
				if ( this.mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
					&& this.mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh ) {
					unitIndexes.add(k);
					minusHCount.add(2);
					lowMasses.add( theoreticalMassLow );
					highMasses.add( theoreticalMassHigh );
				}
			}
		}
		
		/* 2019/09/15. Moved to the above. See "else if (mCheckMinus2H) ..."
		// if allow to check "-2H", search for results of adding "2H" to the current peak
		if (mCheckMinus2H) {
			for (int k = 0; k < mDelta.B2B.mass.length; k++) {
				theoreticalMassLow = mDelta.B2B.mass[k] + massCompensationLow;
				theoreticalMassHigh = mDelta.B2B.mass[k] + massCompensationHigh;
				if ( mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
						&& mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh ) {
					unitIndexes.add(k);
					minusHCount.add(2);
				}
			}
		}
		*/
		
		int unitID, countH;
		String ionType;
		for (int a = 0; a < unitIndexes.size(); a++) {
			unitID = unitIndexes.get(a);
			countH = minusHCount.get(a);
			if (mFinalPeak)
				ionType = "T";
			else
				ionType = "B";
			newTS = new CTopologySet( ionType, mCurrentTargetMass, lowMasses.get(a), highMasses.get(a),
								mDelta.B2B.unit[unitID], mCurrentBranches, this, countH );
			insertIntoCurrentTSS( newTS );
			result = 1;
		}
		
		/* 2019/09/15. Simplified as the above.
		int unitID, countH;
		double massH = 0;
		String ionType;
		for (int a = 0; a < unitIndexes.size(); a++) {
			unitID = unitIndexes.get(a);
			newUnit = mDelta.B2B.unit[unitID];
			double tempMassLow = mDelta.B2B.mass[unitID] + massCompensationLow;
			double tempMassHigh = mDelta.B2B.mass[unitID] + massCompensationHigh;
			if ( !this.acceptable_monosaccharide( newUnit.mClass ) || (newUnit.mClassID == 2 && !mLeafPeak) || 
					mCompositionCountThreshold[newUnit.mClassID - 1] < 1)
				continue;
			
			countH = minusHCount.get(a);
            massH = countH * CMass.H;
			if (mFinalPeak)
				ionType = "T";
			else
				ionType = "B";
			newTS = new CTopologySet( ionType, mCurrentTargetMass,
								Math.max(tempMassLow, mCurrentTargetMassLow + massH),
								Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
								newUnit, mCurrentBranches, this, countH );
			insertIntoCurrentTSS( newTS );
			result = 1;
		}
		*/

		boolean failed = (unitIndexes.size() == 0);

		
		// B2C: try to interpret as a B-ion by adding one monosaccharide + H2O to a B-ion, search in mDelta.B2C.mass.
		if (mTryCIon) {
			unitIndexes.clear();
			minusHCount.clear();
			lowMasses.clear();
			highMasses.clear();
			
			for (int k = 0; k < mDelta.B2C.mass.length; k++) {
				// Begin 2019/09/15. Move from "for (int a = 0; a < unitIndexes.size(); a++)" to here
				newUnit = mDelta.B2C.unit[k];
				if ( !this.acceptable_monosaccharide( newUnit.mClass ) || (newUnit.mClassID == 2 && !mLeafPeak) || 
						mCompositionCountThreshold[newUnit.mClassID - 1] < 1)
					continue;
				// End 2019/09/15. Move from "for (int a = 0; a < unitIndexes.size(); a++)" to here

				theoreticalMassLow = mDelta.B2C.mass[k] + massCompensationLow;
				theoreticalMassHigh = mDelta.B2C.mass[k] + massCompensationHigh;
				if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh) {
					unitIndexes.add(k);
					minusHCount.add(0);
					lowMasses.add( theoreticalMassLow );
					highMasses.add( theoreticalMassHigh );
				}
				else if (mCheckMinus2H) { // 2019/09/15 Move from below to here
					if ( this.mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
						&& this.mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh ) {
						unitIndexes.add(k);
						minusHCount.add(2);
						lowMasses.add( theoreticalMassLow );
						highMasses.add( theoreticalMassHigh );
					}
				}
			}
			
			/* 2019/09/15. Moved to the above. See "else if (mCheckMinus2H) ..."
			// if allow to check "-2H", search for results of adding "2H" to the current peak
			if (mCheckMinus2H) {
				for (int k = 0; k < mDelta.B2B.mass.length; k++) {
					theoreticalMassLow = mDelta.B2C.mass[k] + massCompensationLow;
					theoreticalMassHigh = mDelta.B2C.mass[k] + massCompensationHigh;
					if ( mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
							&& mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh ) {
						unitIndexes.add(k);
						minusHCount.add(2);
					}
				}
			}
			*/

			for (int a = 0; a < unitIndexes.size(); a++) {
				unitID = unitIndexes.get(a);
				countH = minusHCount.get(a);
				newTS = new CTopologySet( "C", mCurrentTargetMass, 
									lowMasses.get(a) - CMass.H2O, highMasses.get(a) - CMass.H2O, // use its B-ion mass that help group topologysets and facilitate reconstruction.
									mDelta.B2C.unit[unitID], mCurrentBranches, this, countH );
				insertIntoCurrentTSS( newTS );
				result = 1;
			}
			
			/*
			double massH;
			for (int a = 0; a < unitIndexes.size(); a++) {
				unitID = unitIndexes.get(a);
				newUnit = mDelta.B2C.unit[unitID];
				double tempMassLow = mDelta.B2C.mass[unitID] + massCompensationLow;
				double tempMassHigh = mDelta.B2C.mass[unitID] + massCompensationHigh;
				if ( !this.acceptable_monosaccharide( newUnit.mClass ) || (newUnit.mClassID == 2 && !mLeafPeak) || 
						mCompositionCountThreshold[newUnit.mClassID - 1] < 1)
					continue;
				
				countH = minusHCount.get(a);
	            massH = countH * CMass.H;
				newTS = new CTopologySet( "C", mCurrentTargetMass,
									Math.max(tempMassLow, mCurrentTargetMassLow + massH) - CMass.H2O, // Although it is C-ion, we use its B-ion mass in interpreting peaks.
									Math.min(tempMassHigh, mCurrentTargetMassHigh + massH) - CMass.H2O, 
									newUnit, mCurrentBranches, this, countH );
				insertIntoCurrentTSS( newTS );
				result = 1;
			}
			*/
		}
		
		failed = failed && (unitIndexes.size() == 0);

		// if the above failed to obtain any interpretation and we allow "gap", 
		// find gap-mono, this part is almost the same as the above. 
		if (failed && mCheckGap) {
			if (mCurrentBranches[1] == null && mCurrentBranches[0] != null) {
				boolean possible = false;
				for (CTopologySet aTPS : mCurrentBranches[0].mTopologySets) {
					if (aTPS.mRootMono.mClassID != 2) {
						possible = true;
						break;
					}
				}
				if (!possible)
					return 0;
			}
			unitIndexes.clear();
			minusHCount.clear();
			lowMasses.clear();
			highMasses.clear();
			
			// B2B with gap
			for (int k = 0; k < mDelta2.B2B.len; k++) {
				theoreticalMassLow = mDelta2.B2B.mass[k] + massCompensationLow;
				theoreticalMassHigh = mDelta2.B2B.mass[k] + massCompensationHigh;
				if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh) {
					unitIndexes.add(k);
					minusHCount.add(0);
					lowMasses.add( theoreticalMassLow );
					highMasses.add( theoreticalMassHigh );
				}
				else if (mCheckMinus2H) {
					if (mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
						&& mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh) {
						unitIndexes.add(k);
						minusHCount.add(2);
						lowMasses.add( theoreticalMassLow );
						highMasses.add( theoreticalMassHigh );
					}
				}
			}
			
			/* 2019/09/15. Moved to the above. See "else if (mCheckMinus2H) ..."
			// if allow to check "-2H", search for results of adding "2H" to the current peak
			if (mCheckMinus2H) {
				for (int k = 0; k < mDelta2.B2B.len; k++) {
					theoreticalMassLow = mDelta2.B2B.mass[k] + massCompensationLow;
					theoreticalMassHigh = mDelta2.B2B.mass[k] + massCompensationHigh;
					if (mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
							&& mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh) {
						unitIndexes.add(k);
						minusHCount.add(2);
						lowMasses.add( theoreticalMassLow );
						highMasses.add( theoreticalMassHigh );
					}
				}
			}
			*/
			
			CMonosaccharide newUnit1, newUnit2;
			double massH;
			for (int a = 0; a < unitIndexes.size(); a++) {
				unitID = unitIndexes.get(a);
				newUnit1 = mDelta2.B2B.unit[unitID][0];
				if (newUnit1.mClassID == 2) // Rule: Fuc can only be a branch, not in a linear substructure.
					continue;
				newUnit2 = mDelta2.B2B.unit[unitID][1];
				
				//double tempMassLow = mDelta2.B2B.mass[unitID] + massCompensationLow;
				//double tempMassHigh = mDelta2.B2B.mass[unitID] + massCompensationHigh;

				countH = minusHCount.get(a);
	            massH = countH * CMass.H;
				if (mFinalPeak)
					ionType = "T";
				else
					ionType = "B";

				newTS = new CTopologySet( ionType, mCurrentTargetMass, 
										lowMasses.get(a), highMasses.get(a),
										newUnit2, newUnit1, mCurrentBranches, this, countH );
				
				/* 2019/09/16. Replaced by the above
				newTS = new CTopologySet( ionType, mCurrentTargetMass,
										Math.max(tempMassLow, mCurrentTargetMassLow + massH),
										Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
										newUnit2, newUnit1, mCurrentBranches, this, countH );
				*/
				
				insertIntoCurrentTSS(newTS);
				result = 1;
				
				// loop through mCurrentBranches and add the gap to each branch to create a new topologyset.
				for (int idxGapInBranch = 0; idxGapInBranch < 4; idxGapInBranch++) { // b indicate "gapInBranch"
					if (mCurrentBranches[idxGapInBranch] == null)
						break;
					
					newTS = new CTopologySet( ionType, mCurrentTargetMass, 
							lowMasses.get(a), highMasses.get(a),
							newUnit2, newUnit1, idxGapInBranch, mCurrentBranches, this, countH );
					/* 2019/09/16. Replaced by the above
					newTS = new CTopologySet( ionType, mCurrentTargetMass,
							Math.max(tempMassLow, mCurrentTargetMassLow + massH),
							Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
							newUnit2, newUnit1, idxGapInBranch, mCurrentBranches, this, countH );
					*/
					
					insertIntoCurrentTSS(newTS);
				}
			}
			
			// Try B2C, search in mDelta2.B2C.mass
			if (mTryCIon && !mFinalPeak) {
				unitIndexes.clear();
				minusHCount.clear();
				lowMasses.clear();
				highMasses.clear();

				for (int k = 0; k < mDelta2.B2C.len; k++) {
					theoreticalMassLow = mDelta2.B2C.mass[k] + massCompensationLow;
					theoreticalMassHigh = mDelta2.B2C.mass[k] + massCompensationHigh;
					if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh ) {
						unitIndexes.add(k);
						minusHCount.add(0);
						lowMasses.add( theoreticalMassLow );
						highMasses.add( theoreticalMassHigh );
					}
					else if (mCheckMinus2H) {
						if (mCurrentTargetMassHigh - CMass.H2 > theoreticalMassLow && mCurrentTargetMassLow - CMass.H2 < theoreticalMassHigh) {
							unitIndexes.add(k);
							minusHCount.add(2);
							lowMasses.add( theoreticalMassLow );
							highMasses.add( theoreticalMassHigh );
						}
					}
				}
				
				/* 2019/09/16. Moved to the above see "else if (mCheckMinus2H)"
				if (mCheckMinus2H) {
					for (int k = 0; k < mDelta2.B2C.len; k++) {
						theoreticalMassLow = mDelta2.B2C.mass[k] + massCompensationLow;
						theoreticalMassHigh = mDelta2.B2C.mass[k] + massCompensationHigh;
						if (mCurrentTargetMassHigh - CMass.H2 > theoreticalMassLow && mCurrentTargetMassLow - CMass.H2 < theoreticalMassHigh) {
							unitIndexes.add(k);
							minusHCount.add(2);
						}
					}
				}
				*/

				for (int a = 0; a < unitIndexes.size(); a++) {
					unitID = unitIndexes.get(a);
					newUnit1 = mDelta2.B2C.unit[unitID][0];
					if (newUnit1.mClassID == 2) // Rule: Fuc can only be a branch, not in a linear substructure.
						continue;

					newUnit2 = mDelta2.B2C.unit[unitID][1];
					
					/* 2019/09/16. Replaced by lowMasses and highMasses
					double tempMassLow = mDelta2.B2C.mass[unitID] + massCompensationLow;
					double tempMassHigh = mDelta2.B2C.mass[unitID] + massCompensationHigh;
					*/

					countH = minusHCount.get(a);
		            //massH = countH * CMass.H;
					newTS = new CTopologySet( "C", mCurrentTargetMass, 
							lowMasses.get(a) - CMass.H2O, highMasses.get(a) - CMass.H2O, // Although it is C-ion, we use its B-ion mass in interpreting peaks.
							newUnit2, newUnit1, mCurrentBranches, this, countH );
					/* 2019/09/16. Replaced by the above
					newTS = new CTopologySet("C", mCurrentTargetMass,
							Math.max(tempMassLow, mCurrentTargetMassLow + massH) - CMass.H2O, // Although it is C-ion, we use its B-ion mass in interpreting peaks.
							Math.min(tempMassHigh, mCurrentTargetMassHigh + massH) - CMass.H2O, 
							newUnit2, newUnit1, mCurrentBranches, this, countH);
					*/
					insertIntoCurrentTSS( newTS );
					result = 1;

					for (int idxGapInBranch = 0; idxGapInBranch < 4; idxGapInBranch++) {
						if (mCurrentBranches[idxGapInBranch] == null)
							break;
						newTS = new CTopologySet( "C", mCurrentTargetMass, 
								lowMasses.get(a) - CMass.H2O, highMasses.get(a) - CMass.H2O,
								newUnit2, newUnit1, idxGapInBranch, mCurrentBranches, this, countH );
						/* 2019/09/16. Replaced by the above
						newTS = new CTopologySet("C", mCurrentTargetMass,
								Math.max(tempMassLow, mCurrentTargetMassLow + massH) - CMass.H2O,
								Math.min(tempMassHigh, mCurrentTargetMassHigh + massH) - CMass.H2O, 
								newUnit2, newUnit1, idxGapInBranch, mCurrentBranches, this, countH );
						*/
						insertIntoCurrentTSS( newTS );
					}
				}
			}
		}

		return result;
	}
	
    private int testAddTopologySet_2BranchWithGap(double massCompensationLow, double massCompensationHigh) {
        int result = 0;
        double linkageMassLoss = CMass.H2O + 3 * (mPermethylated ? 1 : 0) * CMass.CH2;
        
        // Check if the branches together are already too heavy or still too light
        double temp = mCurrentTargetMass - massCompensationLow;
        if ( mPermethylated ) {
            if (temp < 160)
                return -1; // too heavy
            if ( mCheckGap ) {
                if ( temp > 860 ) // ~ two max( mDelta2.B2C )
                    return 0;
            }
            else if ( temp > 420 ) // max( obj.mDelta.B2C )
                return 0;
        }
        else {
            if ( temp < 105 )
                return -1;
            if ( mCheckGap ) {
                if ( temp > 660 ) // ~ two max( obj.mDelta2.B2C )
                    return 0;
            }
            else if ( temp > 335 ) // max( obj.mDelta.B2C )
                return 0;
        }
        
        // Allow 1 gap only when no-gap fails
        if ( mCheckGap ) {
            boolean possible = false;
            if ( (mCurrentBranches[2] == null) && (mCurrentBranches[1] != null) ) {
                for (CTopologySet aTS : mCurrentBranches[1].mTopologySets ) {
                    if ( aTS.mRootMono.mClassID != 2 ) {
                        possible = true;
                        break;
                    }
                }
            }
            if ( !possible )
            	return 0;
        }

        // record unitIndexes and whether each is a minusH result
        ArrayList<Integer> unitIndexes = new ArrayList<Integer>();
        ArrayList<Integer> minusHCount = new ArrayList<Integer>();
        ArrayList<Double> massLow = new ArrayList<Double>();
        ArrayList<Double> massHigh = new ArrayList<Double>();
        double theoreticalMassLow, theoreticalMassHigh;
        CTopologySet newTS;

        // B2B: try to interpret as a B-ion by adding one monosaccharide to a B-ion
        for (int k = 0; k < mDelta2.B2B.mass.length; k++) {
        	theoreticalMassLow = mDelta2.B2B.mass[k] + massCompensationLow;
        	theoreticalMassHigh = mDelta2.B2B.mass[k] + massCompensationHigh;
        	if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh) {
        		unitIndexes.add( k );
        		minusHCount.add( 0 );
        		massLow.add( theoreticalMassLow );
        		massHigh.add( theoreticalMassHigh );
        	}
        }

        // if allow to check "-2H", search for results of adding "2H" to the current peak
        if ( !mFinalPeak && mCheckMinus2H) {
        	for (int k = 0; k < mDelta.B2B.mass.length; k++) {
        		theoreticalMassLow = mDelta2.B2B.mass[k] + massCompensationLow;
        		theoreticalMassHigh = mDelta2.B2B.mass[k] + massCompensationHigh;
        		if ( mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
        			&& mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh ) {
        			unitIndexes.add( k );
        			minusHCount.add( 2 );
            		massLow.add( theoreticalMassLow );
            		massHigh.add( theoreticalMassHigh );
        		}
        	}
        }

        if ( unitIndexes.size() > 0 )
        	result = 1;
        
        int unitID, countH;
        double massH = 0;
		CMonosaccharide newUnit1, newUnit2;
        String ionType;
        
		for (int a = 0; a < unitIndexes.size(); a++) {
			unitID = unitIndexes.get(a);
			newUnit1 = mDelta2.B2B.unit[unitID][0];
			if (newUnit1.mClassID == 2) // Rule: Fuc can only be a branch, not in a linear substructure.
				continue;
			newUnit2 = mDelta2.B2B.unit[unitID][1];
			
			double tempMassLow = mDelta2.B2B.mass[unitID] + massCompensationLow;
			double tempMassHigh = mDelta2.B2B.mass[unitID] + massCompensationHigh;

			countH = minusHCount.get(a);
            massH = countH * CMass.H;
			if (mFinalPeak)
				ionType = "T";
			else
				ionType = "B";

			newTS = new CTopologySet( ionType, mCurrentTargetMass,
									Math.max(tempMassLow, mCurrentTargetMassLow + massH),
									Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
									newUnit2, newUnit1, mCurrentBranches, this, countH );
			insertIntoCurrentTSS(newTS);
			
			for (int b = 0; b < 4; b++) {
				if (mCurrentBranches[b] == null)
					break;
				newTS = new CTopologySet( ionType, mCurrentTargetMass,
						Math.max(tempMassLow, mCurrentTargetMassLow + massH),
						Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
						newUnit2, newUnit1, b, mCurrentBranches, this, countH );
				insertIntoCurrentTSS(newTS);
			}
		}
    	
   		CTopologySet gapTS;
   		CTopologySuperSet gapSS;
   		for (int a = 0; a < unitIndexes.size(); a++) {
   			unitID = unitIndexes.get(a);
   			newUnit1 = mDelta2.B2B.unit[unitID][0];
   			if (newUnit1.mClassID == 2)  // Rule: Fuc can only be a branch, not in a linear substructure.
   				continue;
   			newUnit2 = mDelta2.B2B.unit[unitID][1];

   			countH = minusHCount.get(a);
   			massH = countH * CMass.H;

   			double tempMassLow = Math.max(mDelta2.B2B.mass[unitID] + massCompensationLow, mCurrentTargetMassLow + massH);
   			double tempMassHigh = Math.min(mDelta2.B2B.mass[unitID] + massCompensationHigh, mCurrentTargetMassHigh + massH);

   			// Need to create a gapBranch. There are 3 branches in mCurrentBranches[].
   			// So there are 3 possiblities: (a) [[1 2]+gapMono 3], [[1 3]+gapMono 2], [[2 3]+gapMono 1]   			
   			
   			// Case [[1 2]+gapMono 3]:
   			gapTS = new CTopologySet("B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit1, mCurrentBranches, this, countH );   			
   			gapTS.mBranches[2] = null;
   			gapTS.mMassPeak -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[2].mMassPeak - CMass.Proton); // remove the mass of the 3rd branch.
   			gapTS.mMassLow -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[2].mMassLow - CMass.Proton); // remove the mass of the 3rd branch.
   			gapTS.mMassHigh -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[2].mMassHigh - CMass.Proton); // remove the mass of the 3rd branch.

            gapSS = new CTopologySuperSet("B", gapTS.mMassPeak, this, this.mCurrentPeakIdx);
            gapSS.mMassHigh = gapTS.mMassHigh;
            gapSS.mMassLow = gapTS.mMassLow;
            gapSS.mTopologySets.add( gapTS );
                
            newTS = new CTopologySet( "B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit2, this.mCurrentBranches, this, countH );
            newTS.mBranches[0] = gapSS;
            newTS.mBranches[1] = mCurrentBranches[2];
            newTS.mBranches[2] = null;
                
            if ( mFinalPeak ) {
            	newTS.mType = "T";
                newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 23);
            } else {
            	newTS.mType = "B";
            	newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 21);
            }
            this.insertIntoCurrentTSS( newTS );
            
            if ( this.mCurrentBranches[1] != this.mCurrentBranches[2] ) {
            	// Case [[1 3]+gapMono 2]:
            	gapTS = new CTopologySet("B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit1, mCurrentBranches, this, countH );   			
            	gapTS.mBranches[1] = mCurrentBranches[2];
            	gapTS.mBranches[2] = null;
            	gapTS.mMassPeak -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[1].mMassPeak - CMass.Proton); // remove the mass of the 3rd branch.
            	gapTS.mMassLow -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[1].mMassLow - CMass.Proton); // remove the mass of the 3rd branch.
            	gapTS.mMassHigh -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[1].mMassHigh - CMass.Proton); // remove the mass of the 3rd branch.

            	gapSS = new CTopologySuperSet("B", gapTS.mMassPeak, this, this.mCurrentPeakIdx);
            	gapSS.mMassHigh = gapTS.mMassHigh;
            	gapSS.mMassLow = gapTS.mMassLow;
            	gapSS.mTopologySets.add( gapTS );

            	newTS = new CTopologySet( "B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit2, this.mCurrentBranches, this, countH );
            	newTS.mBranches[0] = gapSS;
            	newTS.mBranches[1] = mCurrentBranches[1];
            	newTS.mBranches[2] = null;

            	if ( mFinalPeak ) {
            		newTS.mType = "T";
            		newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 23);
            	} else {
            		newTS.mType = "B";
            		newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 21);
            	}
            	this.insertIntoCurrentTSS( newTS );

            	if ( this.mCurrentBranches[0] != this.mCurrentBranches[1] ) {
            		// Case [[2 3]+gapMono 1]:
            		gapTS = new CTopologySet("B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit1, mCurrentBranches, this, countH );
            		gapTS.mBranches[0] = mCurrentBranches[1];
            		gapTS.mBranches[1] = mCurrentBranches[2];
            		gapTS.mBranches[2] = null;
            		gapTS.mMassPeak -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassPeak - CMass.Proton); // remove the mass of the 3rd branch.
            		gapTS.mMassLow -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassLow - CMass.Proton); // remove the mass of the 3rd branch.
            		gapTS.mMassHigh -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassHigh - CMass.Proton); // remove the mass of the 3rd branch.

            		gapSS = new CTopologySuperSet("B", gapTS.mMassPeak, this, this.mCurrentPeakIdx);
            		gapSS.mMassHigh = gapTS.mMassHigh;
            		gapSS.mMassLow = gapTS.mMassLow;
            		gapSS.mTopologySets.add( gapTS );

            		newTS = new CTopologySet( "B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit2, this.mCurrentBranches, this, countH );
            		newTS.mBranches[0] = gapSS;
            		newTS.mBranches[1] = mCurrentBranches[0];
            		newTS.mBranches[2] = null;

            		if ( mFinalPeak ) {
            			newTS.mType = "T";
            			newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 23);
            		} else {
            			newTS.mType = "B";
            			newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 21);
            		}
            		this.insertIntoCurrentTSS( newTS );
            	}
            }
            else if ( this.mCurrentBranches[0] != this.mCurrentBranches[1] ) { // Don't need [[1 3]+gapMono 2]:
            	// Case [[2 3]+gapMono 1]:
        		gapTS = new CTopologySet("B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit1, mCurrentBranches, this, countH );
        		gapTS.mBranches[0] = mCurrentBranches[1];
        		gapTS.mBranches[1] = mCurrentBranches[2];
        		gapTS.mBranches[2] = null;
        		gapTS.mMassPeak -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassPeak - CMass.Proton); // remove the mass of the 3rd branch.
        		gapTS.mMassLow -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassLow - CMass.Proton); // remove the mass of the 3rd branch.
        		gapTS.mMassHigh -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassHigh - CMass.Proton); // remove the mass of the 3rd branch.

        		gapSS = new CTopologySuperSet("B", gapTS.mMassPeak, this, this.mCurrentPeakIdx);
        		gapSS.mMassHigh = gapTS.mMassHigh;
        		gapSS.mMassLow = gapTS.mMassLow;
        		gapSS.mTopologySets.add( gapTS );

        		newTS = new CTopologySet( "B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit2, this.mCurrentBranches, this, countH );
        		newTS.mBranches[0] = gapSS;
        		newTS.mBranches[1] = mCurrentBranches[0];
        		newTS.mBranches[2] = null;

        		if ( mFinalPeak ) {
        			newTS.mType = "T";
        			newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 23);
        		} else {
        			newTS.mType = "B";
        			newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 21);
        		}
        		this.insertIntoCurrentTSS( newTS );
            }
   		}
   		
   		return result;
    }

	// step 11
	private void insertIntoCurrentTSS(CTopologySet newSet) {
		// Add a new CTopologySet newSet to a CTopologySuperSet of the same mass and same type in this.mTopologySuperSets. 
		// Create a new CTopologySuperSet if necessary.

		CTopologySuperSet tss = null;
		if (newSet.mType.equals("B") || newSet.mType.equals("T")) { // insert as B ions
			if (newSet.mMinusH == 0) {
				if (mCurrentTopologySuperSetB == null) 
					mCurrentTopologySuperSetB = new CTopologySuperSet(newSet.mType, mCurrentTargetMass, this, mCurrentPeakIdx);
				if ( newSet.mType.equals("B") )
					mCurrentTopologySuperSetB.mTargetPeaks.put(mCurrentPeakIdx, 1);
				else
					mCurrentTopologySuperSetB.mTargetPeaks.put(mCurrentPeakIdx, 3);
				tss = mCurrentTopologySuperSetB;
			} else if (newSet.mMinusH == 2) {
				// let ion type be 21 23 to indicate this ion is an ion with -2H
				if (mCurrentTopologySuperSetB2 == null) {
					mCurrentTopologySuperSetB2 = new CTopologySuperSet(newSet.mType, mCurrentTargetMass, this, mCurrentPeakIdx);
					if ( newSet.mType.equals("T") )
						mCurrentTopologySuperSetB2.mTargetPeaks.put(mCurrentPeakIdx, 23);
					else
						mCurrentTopologySuperSetB2.mTargetPeaks.put(mCurrentPeakIdx, 21);
				}
				tss = mCurrentTopologySuperSetB2;
			}
		} else if (newSet.mType.equals("C")) {
			// insert as C ion
			if (newSet.mMinusH == 0) {
				if (mCurrentTopologySuperSetC == null)
					mCurrentTopologySuperSetC = new CTopologySuperSet(newSet.mType, mCurrentTargetMass, this, mCurrentPeakIdx);
				mCurrentTopologySuperSetC.mTargetPeaks.put(mCurrentPeakIdx, 2);
				tss = mCurrentTopologySuperSetC;
			} else if (newSet.mMinusH == 2) {
				// let ion type be 22 to indicate -2H
				if (mCurrentTopologySuperSetC2 == null) {
					mCurrentTopologySuperSetC2 = new CTopologySuperSet(newSet.mType, mCurrentTargetMass, this, mCurrentPeakIdx);
					mCurrentTopologySuperSetC2.mTargetPeaks.put(mCurrentPeakIdx, 22);
				}
				tss = mCurrentTopologySuperSetC2;
			}
		} else
			throw new InvalidParameterException("wrong mtype");

		tss.addATopologySet(newSet);
	}

	// possible mass difference between two type of ion with gap
	class Delta2 {
		Link2 B2B;
		Link2 B2C;
		Link2 C2C;
		Link2 C2B;

		// numClass is cMonosaccharideClasses.length here
		private Delta2(int numClass, boolean permethylated) {
			double perMassLoss = 2 * (permethylated? 1 : 0) * CMass.CH2; // If not the root unit, lose two CH2s when permethylated
			double linkageMassLoss = CMass.H2O + perMassLoss;
			B2B = new Link2(numClass * numClass);
			B2C = new Link2(numClass * numClass);
			C2C = new Link2(numClass * numClass);
			C2B = new Link2(numClass * numClass);
			int index = 0;
			for (int i = 0; i < numClass; i++) {
				CMonosaccharide mono1 = cMonosaccharideArrays[i];
				for (int j = 0; j < numClass; j++) {
					CMonosaccharide mono2 = cMonosaccharideArrays[j];
					if (!cLegalGlycosidicBonds[i][j]) {
						continue;
					}
					// add 1 CGlycoDeNovo.cMonosaccharideClasses(k) to form a
					// B-ion
					B2B.mass[index] = mono1.mMass + mono2.mMass - 2 * linkageMassLoss;
					B2B.unit[index][0] = mono1; // mono.copy;
					B2B.unit[index][1] = mono2;

					// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a
					// C-ion
					B2C.mass[index] = mono1.mMass + mono2.mMass - linkageMassLoss + CMass.H2O;
					B2C.unit[index][0] = mono1; // mono.copy;
					B2C.unit[index][1] = mono2;

					// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a
					// B-ion
					C2B.mass[index] = mono1.mMass + mono2.mMass - CMass.H2O - 2 * linkageMassLoss;
					C2B.unit[index][0] = mono1; // mono.copy;
					C2B.unit[index][1] = mono2; // mono.copy;

					// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a
					// C-ion
					C2C.mass[index] = mono1.mMass - linkageMassLoss * 2;
					C2C.unit[index][0] = mono1; // mono.copy;
					C2C.unit[index][1] = mono2; // mono.copy;
					index++;
				}
				B2B.len = index;
				B2C.len = index;
				C2B.len = index;
				C2C.len = index;
			}
		}
	}
	// possible mass difference between two type of ion with no gap

	class Delta {
		Link B2B;
		Link B2C;
		Link C2C;
		Link C2B;

		// numClass is cMonosaccharideClasses.length here
		private Delta(int numClass, boolean permethylated) {
			double perMassLoss = 2 * (permethylated ? 1 : 0) * CMass.CH2; // If not the root unit, lose two CH2s when permethylated
			double linkageMassLoss = CMass.H2O + perMassLoss;
			B2B = new Link(numClass);
			B2C = new Link(numClass);
			C2C = new Link(numClass);
			C2B = new Link(numClass);
			for (int i = 0; i < numClass; i++) {
				CMonosaccharide mono = cMonosaccharideArrays[i];

				// add 1 CGlycoDeNovo.cMonosaccharideClasses(k) to form a B-ion
				B2B.mass[i] = mono.mMass - linkageMassLoss;
				B2B.unit[i] = mono; // mono.copy;

				// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a C-ion
				B2C.mass[i] = mono.mMass - perMassLoss;
				B2C.unit[i] = mono; // mono.copy;

				// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a B-ion
				C2B.mass[i] = mono.mMass - CMass.H2O - linkageMassLoss;
				C2B.unit[i] = mono; // mono.copy;

				// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a C-ion
				C2C.mass[i] = mono.mMass - CMass.H2O - perMassLoss;
				C2C.unit[i] = mono; // mono.copy;
			}
		}
	}

	// mass / Monosaccharide info of ion link for B C ion
	class Link {
		double[] mass;
		CMonosaccharide[] unit;

		private Link(int numClass) {
			mass = new double[numClass];
			unit = new CMonosaccharide[numClass];
		}
	}

	class Link2 {
		double[] mass;
		CMonosaccharide[][] unit;
		int len;

		private Link2(int numClass) {
			mass = new double[numClass];
			unit = new CMonosaccharide[numClass][2];
		}
	}
}
||||||| .r3587
package edu.brandeis.glycodenovo.core;

import java.security.InvalidParameterException;
import java.util.*;

/**
 * Copyright [2018] [Pengyu Hong at Brandeis University] Licensed under the
 * Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

/*
 * This is the main part of algorithm some important note on params correspond
 * with algorithm in the paper
 * 
 * Cpeak / Cpeak.mInferredSuperSets : candidate for a certain peak
 * mTopologySuperSets : Candidate pool TopologySuperSet: Candidate TopologySet :
 * Reconstruction (Important : it's not the same as the definition in Topology)
 * Topology : Topology
 * 
 * Documentation on different parts of this Class CGlycoDeNovo --- constructor
 * 1. interpretPeaks --- algorithm 1
 * 
 * generate all possible candidates (Cpeak.mInferredSuperSets()) including find
 * whether C-ion can be interpreted as a former B-ion interpretApeak --
 * interpret current peak (algorithm 1 step 4 - 5) here only consider 2 branch
 * testAndAddTopologySet --- step 6 in algorithm 1 insertIntoCurrentTSS --- step
 * 7 in algorithm 1 -- insert all possible TSS to candidate and pool
 * (Cpeak.mInferredSuperSets() and Cpeak.mInferredSuperSets()) (including B-ion
 * and C-ion) appendNLinkedRoot --- finally add some missing part to the root
 * 
 * 2. reconstructFormulas --- algorithm 2 call function for final peak 1.find
 * all unique TopologySuperSet that can be interpreted related to final peak
 * 2.from small to large --- reconstruct final peak (step 4 - 19) call function
 * TSS.reconstructformular() to reconstruct all TSS
 * 
 */

public class CGlycoDeNovo {
	// All cMonosaccharideClasses
	static String[] cMonosaccharideClasses = { "Xyl", "Fuc", "Hex", "HexA", "HexNAc", "Kdo", "NeuAc", "NeuGc" };
	private CMonosaccharide[] cMonosaccharideArrays = new CMonosaccharide[cMonosaccharideClasses.length];
	// All possible bonds
	// Will be used in reconstruction part
	static boolean[][] cLegalGlycosidicBonds = { { true, true, true, true, true, true, true, true },
			{ true, false, true, true, true, true, true, true }, { false, false, true, true, true, true, true, true },
			{ false, false, true, true, true, true, true, true }, { false, false, true, true, true, true, true, true },
			{ false, false, true, true, true, true, true, true }, { false, false, true, true, true, true, true, true },
			{ false, false, true, true, true, true, true, true } };

	double 	mMassAccuracyPPM = 5; // ppm = 1000000*mass_error/exact_mass; mass_error = mMassAccuracyPPM*exact_mass/1000000;
	double	mMassAccuracyPP = 0.0000005; // ppm / 1000000
	double	mMassAccuracyDalton = 0.005; // Da
	int		mMaxBranchingNum = 2; // default bi-branching
	double	mIonMass = 0; // mass of the metal Ion
	String	mIonMetal; // type of mIonMetal
	double	mIntensityThreshold = 0; // Lowest Threshold for peak Intensity
	boolean	mNLinked = false; // whether is Nlinked
	boolean	mPermethylated = false; // Permethylated means attach CH2 on molecular
	String	mReducingEndMode;
	double	mReducingEndCompensation = 0;
	double	mFinalPeakCompensation = 0;
	int[]	mCompositionCountThreshold = new int[8];
	boolean mCheckMinus2H = false;
	boolean mCheckGap = false;
	
	ArrayList<CPeak> mPeaks;
	ArrayList<CTopologySuperSet> mTopologySuperSets;

	ArrayList<String> mPossibleMonosaccharideClasses = null;
	// Mass Compensation for Specific experiment condition
	private Delta mDelta;
	private Delta2 mDelta2;
	private int mNumPeaks = 0;
	
	private CPeak mCurrentPeak = null;
	private int mCurrentPeakIdx = -1; 
	private boolean mFinalPeak = false;
	private double mCurrentTargetMass = 0;
	private double mCurrentTargetMassLow = 0;
	private double mCurrentTargetMassHigh = 0;
	private int mCurrentTPSuperSetSize = 0;
	private boolean mTryCIon = false;
	private boolean mLeafPeak = false;
	// TSSB TSSC is for no Check2H // TSSB2 TSSC2 for check2H
	private CTopologySuperSet mCurrentTopologySuperSetB;
	private CTopologySuperSet mCurrentTopologySuperSetB2;
	private CTopologySuperSet mCurrentTopologySuperSetC;
	private CTopologySuperSet mCurrentTopologySuperSetC2;
	private CTopologySuperSet[] mCurrentBranches; // TSS Branches
	// initialize

	public CGlycoDeNovo(double massAccuracyPPM) {
		mMassAccuracyPPM = massAccuracyPPM;
		mMassAccuracyPP = mMassAccuracyPPM / 1000000;
		Arrays.fill(mCompositionCountThreshold, 8000);
	}

	public CGlycoDeNovo(double massAccuracyPPM, boolean checkMinus2H, boolean checkGap) {
		mCheckMinus2H = checkMinus2H;
		mCheckGap = checkGap;
		mMassAccuracyPPM = massAccuracyPPM;
		mMassAccuracyPP = mMassAccuracyPPM / 1000000;
		Arrays.fill(mCompositionCountThreshold, 8000);
	}

    private boolean acceptable_monosaccharide( String monoClass ) {
    	if ( this.mPossibleMonosaccharideClasses == null || this.mPossibleMonosaccharideClasses.size() == 0 )
    		return true;
    	if ( this.mPossibleMonosaccharideClasses.indexOf( monoClass ) >= 0 )
    		return true;
    	return false;
    }
    
    // Algorithm part 1: Intepret ALl Peaks
	public void interpretPeaks(CSpectrum spec) {
		// initialize all params related to spec
		if ( spec.isProtonated() ) {
			mIonMetal = "Proton";
			mIonMass = CMass.Proton;
		} else {
			mIonMetal = spec.getMetal();
			switch ( mIonMetal ) {
			case "Lithium":
				mIonMass = CMass.Lithium - CMass.Electron;

			case "Na":
			case "Sodium":
				mIonMass = CMass.Sodium - CMass.Electron;
				break;
			default:
				throw new InvalidParameterException("ionMetal not found");
			}
		}
		// default params
		mMassAccuracyDalton = spec.getPrecursorMZ() * mMassAccuracyPP;
		mPermethylated = spec.isPermethylated();
		mNLinked = spec.isNLinked();
		mReducingEndMode = spec.getReducingEndMode();
		if (mReducingEndMode != null)
			mReducingEndCompensation = CMass.reducingEndMassCompensation(mReducingEndMode, mPermethylated);
		if ( mPermethylated )
			mFinalPeakCompensation = mReducingEndCompensation + CMass.CH2 + CMass.H2O;
		else
			mFinalPeakCompensation = mReducingEndCompensation;
		for (int i = 0; i < cMonosaccharideClasses.length; i++) {
			cMonosaccharideArrays[i] = new CMonosaccharide(cMonosaccharideClasses[i], mPermethylated);
		}
		mDelta = new Delta(cMonosaccharideClasses.length, this.mPermethylated);
		mDelta2 = new Delta2(cMonosaccharideClasses.length, this.mPermethylated);
		// clear all existing inferences.
		spec.clearInferred();
		mPeaks = spec.getPeaks( 0 );
		mNumPeaks = mPeaks.size();
		mCurrentPeakIdx = -1;
		// step 1 - default candidate pool
		mTopologySuperSets = new ArrayList<>();
		mFinalPeak = false;

		spec.updatePeakIDs();
		for (int k = 0; k < mPeaks.size(); k++) { // step 2
			// step 3 initialize the candidate set / mass
			mCurrentPeak = mPeaks.get(k);
			if (mCurrentPeak.getIntensity() < mIntensityThreshold)
				continue;
			mCurrentTargetMass = mCurrentPeak.getMass();
			
			// Ignore peaks whose mass is too small (less than a single monosaccharide).
			if (mPermethylated) {
				if (mCurrentTargetMass < 175)
					continue;
			} else if (mCurrentTargetMass < 131)
				continue;

			// Initialize parameters that store intermediate results or make access easier.
			mCurrentPeakIdx = k; 
			mCurrentTargetMassLow = mCurrentPeak.getMassLowBound();
			mCurrentTargetMassHigh = mCurrentPeak.getMassHighBound();
			mCurrentTopologySuperSetB = null;
			mCurrentTopologySuperSetB2 = null;
			mCurrentTopologySuperSetC = null;
			mCurrentTopologySuperSetC2 = null;
			mCurrentTPSuperSetSize = mTopologySuperSets.size();
			mCurrentBranches = new CTopologySuperSet[4]; // empty branches

			// If the current peak is the precursor peak, we do not need to try to interpret it as a C-ion, 
			// and hence should set mTryCIon = false and mFinalPeak = true.
			if (mCurrentPeakIdx == mNumPeaks - 1) {
				mTryCIon = false;
				mFinalPeak = true;
			} else {
				mTryCIon = true;
				// This can save computational time: Try to find existing B-ion interpretation of this C-ion (B-Ion = C-Ion - H2O)
				// If such a B-ion exists, we don't need to try C-ions in the following calculation (save time).
				double bIonMassLow = mCurrentTargetMassLow - CMass.H2O;
				double bIonMassHigh = mCurrentTargetMassHigh - CMass.H2O;
				for (int m = mCurrentTPSuperSetSize - 1; m >= 0; m--) {
					CTopologySuperSet ctss = mTopologySuperSets.get(m);
					if ( ctss.mType.equals("C") ) continue;	// Skip if ctss is of a C ion
					
					/* Modified by Hong 8/3/3019
					double avgMass = (ctss.mMassLow + ctss.mMassHigh) / 2;
					// search for avgMass in BionMass - 0.01 ~ BionMass + 0.01
					if (bIonMass > avgMass + 0.01) // 0.01 is the mass accuracy,
													// should be changed to PPM
													// based.
						break;
					else if (bIonMass >= avgMass - 0.01) {
						// Interpret as C ion of previous candidate
						ctss.addPeak(mCurrentPeakIdx, 2);
						mCurrentPeak.getInferredSuperSets().add(ctss);
						mTryCIon = false;
						break;
					}
					*/
					if ( bIonMassLow < ctss.mMassLow || bIonMassHigh > ctss.mMassHigh ) // replace the block above
						continue;
				}
			}
			// step 4 ~ 5
			System.out.println( "Peak ID: " + k );
			interpretAPeak();

			if (mFinalPeak && mCurrentTopologySuperSetB == null && mCurrentTopologySuperSetC == null )
				appendNLinkedRoot(); // If failed to interpret the final peak, try adding the Nlink root.
			
			addCurrentTSSToPool(); // add CurrentTSS to Pool
		}
		System.out.println("CGlycoDeNovo::interpretPeaks() done!");
	}

	// Add NLinkedRoot part for Final Peak
	private void appendNLinkedRoot() {
		double mass_error = mMassAccuracyPP * mPeaks.get(mPeaks.size() - 1).getMass();
		double targetMLow = mPeaks.get(mPeaks.size() - 1).getMass() - mass_error;
		double targetMHigh = mPeaks.get(mPeaks.size() - 1).getMass() + mass_error;
		double dMassBIonNoFuc = CMonosaccharideSet.GlcNAc.sacPermethylated.mass * 2
				- (CMass.CH2 * 2 * (this.mPermethylated? 1 : 0) + CMass.H2O) * 2 + mFinalPeakCompensation;
		// % check if there is a ion corresponding to Fuc
		CTopologySuperSet ssFuc = null;
		for (CTopologySuperSet mTSS : mTopologySuperSets) {
			for (CTopologySet cs : mTSS.mTopologySets) {
				if (cs.mRootMono.mClassID == 2 && cs.mBranches[0] == null) {
					ssFuc = mTSS;
					break;
				}
			}
			if (ssFuc != null)
				break;
		}
		double dMassBIonWithFuc = 0;
		if (ssFuc != null) {
			dMassBIonWithFuc = dMassBIonNoFuc + CMonosaccharideSet.dHex.sacPermethylated.mass
					- (CMass.CH2 * 2 * (this.mPermethylated? 1 : 0) + CMass.H2O);
		}

		for (int cidx = mTopologySuperSets.size() - 1; cidx >= 0; cidx--) {
			CTopologySuperSet mTSS = mTopologySuperSets.get(cidx);
			double tMassLow = mTSS.mMassLow + dMassBIonNoFuc;
			double tMassHigh = mTSS.mMassHigh + dMassBIonNoFuc;

			if (tMassHigh < targetMLow - 2 && ssFuc == null) // % too light, no
																// need to
																// continue.
				break;
			if (targetMHigh > tMassLow && targetMLow < tMassHigh) {
				insertIntoCurrentTSS(new CTopologySet("T", mCurrentTargetMass, tMassLow, tMassHigh, mDelta.B2B.unit[4],
						mDelta.B2B.unit[4], new CTopologySuperSet[] { mTSS, null, null, null }, this));
			}

			if (ssFuc != null) {
				tMassLow = mTSS.mMassLow + dMassBIonWithFuc;
				tMassHigh = mTSS.mMassHigh + dMassBIonWithFuc;

				if (targetMHigh > tMassLow && targetMLow < tMassHigh) {
					insertIntoCurrentTSS(
							new CTopologySet("T", mCurrentTargetMass, tMassLow, tMassHigh, mDelta.B2B.unit[4],
									mDelta.B2B.unit[4], new CTopologySuperSet[] { ssFuc, mTSS, null, null }, this));
					insertIntoCurrentTSS(
							new CTopologySet("T", mCurrentTargetMass, tMassLow, tMassHigh, mDelta.B2B.unit[4],
									mDelta.B2B.unit[4], 1, new CTopologySuperSet[] { ssFuc, mTSS, null, null }, this));
				}
			}
		}
	}

	// Add Current TSSB TSSC to the search pool
	private void addCurrentTSSToPool() {
		// Add mCurrentTopologySuperSetB/B1/B2/C/C1/C2 to the search pool, which will be used in 
		// interpreting the peaks followed

		CPeak curPeak = mPeaks.get(mCurrentPeakIdx);
		// add C2 to TSS if not null
		if (mCurrentTopologySuperSetC2 != null) {
			if (mTopologySuperSets.isEmpty() || mCurrentTopologySuperSetC2.mMassLow > mTopologySuperSets
					.get(mTopologySuperSets.size() - 1).mMassLow) {
				// add to end if pool empty or TSS mass is largest
				mTopologySuperSets.add(mCurrentTopologySuperSetC2);
				curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetC2);
			} else {
				// search for its correct position if mass is not largest
				for (int i = mTopologySuperSets.size() - 1; i >= 0; i--) {
					if (mTopologySuperSets.get(i).contains(mCurrentTopologySuperSetC2)) {
						curPeak.getInferredSuperSets().add(mTopologySuperSets.get(i));
						// type 22 is to indicate that this is a C-2H ion
						mTopologySuperSets.get(i).addPeak(mCurrentPeakIdx, 22);
						break;
					} else if (mCurrentTopologySuperSetC2.mMassLow > mTopologySuperSets.get(i).mMassLow) {
						mTopologySuperSets.add(i + 1, mCurrentTopologySuperSetC2);
						curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetC2);
						break;
					}
				}
			}
		}
		if (mCurrentTopologySuperSetC != null) {
			// add to end if pool empty or TSS mass is largest
			if (mTopologySuperSets.isEmpty() || mCurrentTopologySuperSetC.mMassLow > mTopologySuperSets
					.get(mTopologySuperSets.size() - 1).mMassLow) {
				mTopologySuperSets.add(mCurrentTopologySuperSetC);
				curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetC);
			} else {
				// search for its correct position if mass is not largest
				for (int i = mTopologySuperSets.size() - 1; i >= 0; i--) {
					if (mTopologySuperSets.get(i).contains(mCurrentTopologySuperSetC)) {
						curPeak.getInferredSuperSets().add(mTopologySuperSets.get(i));
						// type 2 means this is a C ion
						mTopologySuperSets.get(i).addPeak(mCurrentPeakIdx, 2);
						break;
					} else if (mCurrentTopologySuperSetC.mMassLow > mTopologySuperSets.get(i).mMassLow) {
						mTopologySuperSets.add(i + 1, mCurrentTopologySuperSetC);
						curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetC);
						break;
					}
				}
			}
		}

		if (mCurrentTopologySuperSetB2 != null) {
			// add to end if pool empty or TSS mass is largest

			if (mTopologySuperSets.isEmpty() || mCurrentTopologySuperSetB2.mMassLow > mTopologySuperSets
					.get(mTopologySuperSets.size() - 1).mMassLow) {
				mTopologySuperSets.add(mCurrentTopologySuperSetB2);
				curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetB2);
			} else {
				// search for its correct position
				for (int i = mTopologySuperSets.size() - 1; i >= 0; i--) {
					if (mTopologySuperSets.get(i).contains(mCurrentTopologySuperSetB2)) {
						curPeak.getInferredSuperSets().add(mTopologySuperSets.get(i));
						mTopologySuperSets.get(i).addPeak(mCurrentPeakIdx, 21);
						break;
					} else if (mCurrentTopologySuperSetB2.mMassLow > mTopologySuperSets.get(i).mMassLow) {
						mTopologySuperSets.add(i + 1, mCurrentTopologySuperSetB2);
						curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetB2);
						break;
					}
				}
			}
		}

		if (mCurrentTopologySuperSetB != null) {
			mTopologySuperSets.add(mCurrentTopologySuperSetB);
			curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetB);
		}
	}

	// step 4 - 5
	private void interpretAPeak() {
		if (mCurrentTargetMass < 438) { // try to interpret as a mono, hence should not be heavier than the heaviest mono
			double massCompensationLow = mIonMass; // use this as a temp to calculate both massCompensationHigh and massCompensationLow
			if (mPermethylated)
				massCompensationLow += CMass.CH2;
			if (mFinalPeak)
				massCompensationLow = massCompensationLow + mFinalPeakCompensation;
			double massCompensationHigh = massCompensationLow * (1 + mMassAccuracyPP);
			massCompensationLow = massCompensationLow * (1 - mMassAccuracyPP);
			mLeafPeak = true;
			if ( testAddTopologySet(massCompensationLow, massCompensationHigh) == -1 )
				return;
		}
		
		mLeafPeak = false;
		double[] branchMassesLow = new double[4];
		double[] branchMassesHigh = new double[4];
		int testAddResult = 0;
		
		// each branch causes a CH2 loss to the joint monosaccharide when permethylated && obj.mDelta only considers linear structure (i.e., one branch).
		double massD = mIonMass + (this.mPermethylated? 1 : 0) * CMass.CH2;

		for (int k = 0; k < mCurrentTPSuperSetSize; k++) { // 1st branch
			mCurrentBranches[0] = mTopologySuperSets.get(k);
			if (mFinalPeak) {
				branchMassesLow[0] = mCurrentBranches[0].mMassLow + mFinalPeakCompensation * (1 - mMassAccuracyPP);
				branchMassesHigh[0] = mCurrentBranches[0].mMassHigh + mFinalPeakCompensation * (1 + mMassAccuracyPP);
			} else {
				branchMassesLow[0] = mCurrentBranches[0].mMassLow;
				branchMassesHigh[0] = mCurrentBranches[0].mMassHigh;
			}
			if ( testAddTopologySet(branchMassesLow[0], branchMassesHigh[0]) == -1 )
				break;

			for (int kk = k; kk < mCurrentTPSuperSetSize; kk++) { // 2nd branch
				mCurrentBranches[1] = mTopologySuperSets.get(kk);
				branchMassesLow[1] = mCurrentBranches[1].mMassLow - massD;
				branchMassesHigh[1] = mCurrentBranches[1].mMassHigh - massD;
				// sum of low and high
				if ( testAddTopologySet(branchMassesLow[1] + branchMassesLow[0], branchMassesHigh[1] + branchMassesHigh[0]) == -1 )
					break;

				// Begin: 2-branch-with-gap code block 1
                if ( ( this.mMaxBranchingNum < 3 ) && !this.mCheckGap ) // maximum number of branches = 2
                    continue; 
                // End: 2-branch-with-gap code block 1
                
                for (int kkk = kk; kkk < mCurrentTPSuperSetSize; kkk ++ ) { // 3rd branch
                	mCurrentBranches[2] = mTopologySuperSets.get(kkk);
    				branchMassesLow[2] = mCurrentBranches[2].mMassLow - massD * (1 + mMassAccuracyPP);
    				branchMassesHigh[2] = mCurrentBranches[2].mMassHigh - massD * (1 - mMassAccuracyPP);
    				
    				//Begin: 2-branch-with-gap code block 2
    				if ( this.mCheckGap && (this.mMaxBranchingNum < 3) )
    					testAddResult = testAddTopologySet_2BranchWithGap( branchMassesLow[1] + branchMassesLow[0], branchMassesHigh[1] + branchMassesHigh[0] );
    				else
    					testAddResult = testAddTopologySet( branchMassesLow[2] + branchMassesLow[1] + branchMassesLow[0], 
    														branchMassesHigh[2] + branchMassesHigh[1] + branchMassesHigh[0] );
                    //End: 2-branch-with-gap code block 2
                        
                    if ( testAddResult == -1 ) // no need to try further because too heavy.
                    	break;
                        
                    if ( this.mMaxBranchingNum < 4 ) // maximum number of branches = 3
                    	continue;
                        
                    for (int kkkk = kkk; kkkk < mCurrentTPSuperSetSize; kkkk++) { // 4th branch
                    	mCurrentBranches[3] = mTopologySuperSets.get(kkkk);
        				branchMassesLow[3] = mCurrentBranches[3].mMassLow - massD * (1 - mMassAccuracyPP);
        				branchMassesHigh[3] = mCurrentBranches[3].mMassHigh - massD * (1 + mMassAccuracyPP);
    					testAddResult = testAddTopologySet( branchMassesLow[3] + branchMassesLow[2] + branchMassesLow[1] + branchMassesLow[0], 
    														branchMassesHigh[3] + branchMassesHigh[2] + branchMassesHigh[1] + branchMassesHigh[0] );
                        if ( testAddResult == -1 ) // no need to try further because too heavy.
                            break;
                    }
					mCurrentBranches[3] = null;
                    branchMassesLow[3] = 0;
                    branchMassesHigh[3] = 0;
                }
                mCurrentBranches[2] = null;
                branchMassesLow[2] = 0;
                branchMassesHigh[2] = 0;
			}
			mCurrentBranches[1] = null;
			// default second branch and go to set next first branch
			branchMassesLow[1] = 0;
			branchMassesHigh[1] = 0;
		}
		mCurrentBranches[0] = null;
		branchMassesLow[0] = 0;
		branchMassesHigh[0] = 0;
	}

	// algorithm 2 -- reconstruct last peak
	public void reconstructFormulas() {

		CPeak lastPeak = mPeaks.get(mPeaks.size() - 1);
		HashSet<CTopologySuperSet> frontier = new HashSet<>(lastPeak.getInferredSuperSets());
		// put the last candidate's InferredSuperSets in.....
		HashSet<CTopologySuperSet> buffer = new HashSet<>(frontier);

		while (!frontier.isEmpty()) {
			ArrayList<CTopologySuperSet> newFrontier = new ArrayList<>();
			for (CTopologySuperSet tss : frontier) {
				for (CTopologySet ts : tss.mTopologySets) {
					ts.mTargetPeaks = tss.mTargetPeaks;
					newFrontier.addAll(Arrays.asList(ts.mBranches));
				}
			}
			newFrontier.removeIf(Objects::isNull); // remove nulls
			frontier = new HashSet<>(newFrontier);
			buffer.addAll(frontier);
		}

		// find all unique TSS that relevant to last peak.
		List<CTopologySuperSet> sortedUniqueTSS = new ArrayList<>(buffer);
		Collections.sort(sortedUniqueTSS);

		// reconstruct all ts from small to large
		// begin algorithm 2 (CandidateSetReconstructor()) for last peak
		for (CTopologySuperSet ts : sortedUniqueTSS) {
			ts.reconstructFormulas();
		}

		System.out.println("CGlycoDeNovo::reconstruct_formulas done!");
		// link all valid formula of TSS to peak
		for (CPeak peak : mPeaks) {
			// get all valid peak
			peak.getInferredSuperSets().removeIf(e -> !e.mLegal);
			if (peak.getInferredSuperSets().isEmpty())
				continue;
			peak.getInferredSuperSets().forEach(e -> Collections.sort(e.mTopologies));
			// need to sort the mTopologies to make sure that all formula will
			// be in correct order (number of peak (large -> small), String
			// sorted order)
			Map<String, CTopology> formulaToTSS = new HashMap<>();
			// make sure there is only a unique result for each formula
			for (CTopologySuperSet superSet : peak.getInferredSuperSets()) {
				for (CTopology mTopology : superSet.mTopologies) {
					formulaToTSS.putIfAbsent(mTopology.mFormula, mTopology);
				}
			}

			peak.setInferredFormulas(new ArrayList<>(formulaToTSS.keySet()));
			peak.setInferredTopologies(new ArrayList<CTopology>(formulaToTSS.values()));
			int size = peak.getInferredFormulas().size();
			peak.setInferredMasses(new ArrayList<>(size));
			peak.setInferredScores(new ArrayList<>(size));
			peak.setInferredGWAFormulas(new ArrayList<>(size));

			for (String formula : peak.getInferredFormulas()) {
				peak.getInferredMasses().add(formulaToTSS.get(formula).mMass);
				peak.getInferredScores().add(formulaToTSS.get(formula).mSupportPeaks.size());
				//peak.getInferredGWAFormulas().add("freeEnd--?" + formulaToTSS.get(formula).mGWAFormula.substring(3));
				peak.getInferredGWAFormulas().add( formulaToTSS.get(formula).mGWAFormula );
			}
		}
		
		List<String> formula = mPeaks.get(mPeaks.size()-1).getInferredFormulas();
		if ( formula == null || formula.size() == 0 )
			System.out.println("Failed to reconstruct topologies.");
		else
		{
			System.out.printf("Reconstruct %d topologies.\n", formula.size());
			for ( String s : formula )
				System.out.println( s );
		}
	}

	// step 6 - 8
	private int testAddTopologySet(double massCompensationLow, double massCompensationHigh) {
		int result = 0;

		// Check if the branches together are already too heavy or still too light
		double temp = mCurrentTargetMass - massCompensationLow;
		if ( this.mPermethylated ) {
			if (temp < 160)
				return -1; // too light
			if (mCheckGap) {
				if (temp > 860) // max( permethylated this.mDelta2.B2C )
					return 0;
			} else if (temp > 420) // max( permethylated this.mDelta.B2C )
				return 0;
		} else {
			if (temp < 105)
				return -1; // too light
			if (mCheckGap) {
				if (temp > 660) // max( unpermethylated this.mDelta2.B2C )
					return 0;
			} else if (temp > 335) // max( unpermethylated this.mDelta.B2C )
				return 0;
		}

		// record unitIndexes and whether each is a minusH result
		ArrayList<Integer> unitIndexes = new ArrayList<Integer>();
		ArrayList<Integer> minusHCount = new ArrayList<Integer>();
		double theoreticalMassLow, theoreticalMassHigh;
		CTopologySet newTS;

		// B2B: try to interpret as a B-ion by adding one monosaccharide to a B-ion
		for (int k = 0; k < mDelta.B2B.mass.length; k++) {
			theoreticalMassLow = mDelta.B2B.mass[k] + massCompensationLow;
			theoreticalMassHigh = mDelta.B2B.mass[k] + massCompensationHigh;
			if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh) {
				unitIndexes.add(k);
				minusHCount.add(0);
			}
		}
		
		// if allow to check "-2H", search for results of adding "2H" to the current peak
		if (mCheckMinus2H) {
			for (int k = 0; k < mDelta.B2B.mass.length; k++) {
				theoreticalMassLow = mDelta.B2B.mass[k] + massCompensationLow;
				theoreticalMassHigh = mDelta.B2B.mass[k] + massCompensationHigh;
				if ( mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
						&& mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh ) {
					unitIndexes.add(k);
					minusHCount.add(2);
				}
			}
		}
		
		int unitID, countH;
		double massH = 0;
		String ionType;
		for (int a = 0; a < unitIndexes.size(); a++) {
			unitID = unitIndexes.get(a);
			CMonosaccharide newUnit = mDelta.B2B.unit[unitID];
			double tempMassLow = mDelta.B2B.mass[unitID] + massCompensationLow;
			double tempMassHigh = mDelta.B2B.mass[unitID] + massCompensationHigh;
			if ( !this.acceptable_monosaccharide( newUnit.mClass ) || (newUnit.mClassID == 2 && !mLeafPeak) || 
					mCompositionCountThreshold[newUnit.mClassID - 1] < 1)
				continue;
			
			countH = minusHCount.get(a);
            massH = countH * CMass.H;
			if (mFinalPeak)
				ionType = "T";
			else
				ionType = "B";
			newTS = new CTopologySet( ionType, mCurrentTargetMass,
								Math.max(tempMassLow, mCurrentTargetMassLow + massH),
								Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
								newUnit, mCurrentBranches, this, countH );
			insertIntoCurrentTSS( newTS );
			result = 1;
		}
		boolean failed = (unitIndexes.size() == 0);

		
		// B2C: try to interpret as a B-ion by adding one monosaccharide + H2O to a B-ion, search in mDelta.B2C.mass.
		if (mTryCIon) {
			unitIndexes.clear();
			minusHCount.clear();
			
			for (int k = 0; k < mDelta.B2C.mass.length; k++) {
				theoreticalMassLow = mDelta.B2C.mass[k] + massCompensationLow;
				theoreticalMassHigh = mDelta.B2C.mass[k] + massCompensationHigh;
				if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh) {
					unitIndexes.add(k);
					minusHCount.add(0);
				}
			}
			
			// if allow to check "-2H", search for results of adding "2H" to the current peak
			if (mCheckMinus2H) {
				for (int k = 0; k < mDelta.B2B.mass.length; k++) {
					theoreticalMassLow = mDelta.B2C.mass[k] + massCompensationLow;
					theoreticalMassHigh = mDelta.B2C.mass[k] + massCompensationHigh;
					if ( mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
							&& mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh ) {
						unitIndexes.add(k);
						minusHCount.add(2);
					}
				}
			}

			for (int a = 0; a < unitIndexes.size(); a++) {
				unitID = unitIndexes.get(a);
				CMonosaccharide newUnit = mDelta.B2C.unit[unitID];
				double tempMassLow = mDelta.B2C.mass[unitID] + massCompensationLow;
				double tempMassHigh = mDelta.B2C.mass[unitID] + massCompensationHigh;
				if ( !this.acceptable_monosaccharide( newUnit.mClass ) || (newUnit.mClassID == 2 && !mLeafPeak) || 
						mCompositionCountThreshold[newUnit.mClassID - 1] < 1)
					continue;
				
				countH = minusHCount.get(a);
	            massH = countH * CMass.H;
				newTS = new CTopologySet( "C", mCurrentTargetMass,
									Math.max(tempMassLow, mCurrentTargetMassLow + massH) - CMass.H2O, // Although it is C-ion, we use its B-ion mass in interpreting peaks.
									Math.min(tempMassHigh, mCurrentTargetMassHigh + massH) - CMass.H2O, 
									newUnit, mCurrentBranches, this, countH );
				insertIntoCurrentTSS( newTS );
				result = 1;
			}
		}
		
		failed = failed && (unitIndexes.size() == 0);

		// if the above failed to obtain any interpretation and we allow "gap", 
		// find gap-mono, this part is almost the same as the above. 
		if (failed && mCheckGap) {
			if (mCurrentBranches[1] == null && mCurrentBranches[0] != null) {
				boolean possible = false;
				for (CTopologySet aTPS : mCurrentBranches[0].mTopologySets) {
					if (aTPS.mRootMono.mClassID != 2) {
						possible = true;
						break;
					}
				}
				if (!possible)
					return 0;
			}
			unitIndexes.clear();
			minusHCount.clear();
			
			// B2B with gap
			for (int k = 0; k < mDelta2.B2B.len; k++) {
				theoreticalMassLow = mDelta2.B2B.mass[k] + massCompensationLow;
				theoreticalMassHigh = mDelta2.B2B.mass[k] + massCompensationHigh;
				if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh) {
					unitIndexes.add(k);
					minusHCount.add(0);
				}
			}
			
			// if allow to check "-2H", search for results of adding "2H" to the current peak
			if (mCheckMinus2H) {
				for (int k = 0; k < mDelta2.B2B.len; k++) {
					theoreticalMassLow = mDelta2.B2B.mass[k] + massCompensationLow;
					theoreticalMassHigh = mDelta2.B2B.mass[k] + massCompensationHigh;
					if (mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
							&& mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh) {
						unitIndexes.add(k);
						minusHCount.add(2);
					}
				}
			}
			
			CMonosaccharide newUnit1, newUnit2;
			for (int a = 0; a < unitIndexes.size(); a++) {
				unitID = unitIndexes.get(a);
				newUnit1 = mDelta2.B2B.unit[unitID][0];
				if (newUnit1.mClassID == 2) // Rule: Fuc can only be a branch, not in a linear substructure.
					continue;
				newUnit2 = mDelta2.B2B.unit[unitID][1];
				
				double tempMassLow = mDelta2.B2B.mass[unitID] + massCompensationLow;
				double tempMassHigh = mDelta2.B2B.mass[unitID] + massCompensationHigh;

				countH = minusHCount.get(a);
	            massH = countH * CMass.H;
				if (mFinalPeak)
					ionType = "T";
				else
					ionType = "B";

				newTS = new CTopologySet( ionType, mCurrentTargetMass,
										Math.max(tempMassLow, mCurrentTargetMassLow + massH),
										Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
										newUnit2, newUnit1, mCurrentBranches, this, countH );
				insertIntoCurrentTSS(newTS);
				result = 1;
				
				for (int b = 0; b < 4; b++) {
					if (mCurrentBranches[b] == null)
						break;
					newTS = new CTopologySet( ionType, mCurrentTargetMass,
							Math.max(tempMassLow, mCurrentTargetMassLow + massH),
							Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
							newUnit2, newUnit1, b, mCurrentBranches, this, countH );
					insertIntoCurrentTSS(newTS);
				}
			}
			
			// Try B2C, search in mDelta2.B2C.mass
			if (mTryCIon && !mFinalPeak) {
				unitIndexes.clear();
				minusHCount.clear();
				for (int k = 0; k < mDelta2.B2C.len; k++) {
					theoreticalMassLow = mDelta2.B2C.mass[k] + massCompensationLow;
					theoreticalMassHigh = mDelta2.B2C.mass[k] + massCompensationHigh;
					if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh ) {
						unitIndexes.add(k);
						minusHCount.add(0);
					}
				}
				if (mCheckMinus2H) {
					for (int k = 0; k < mDelta2.B2C.len; k++) {
						theoreticalMassLow = mDelta2.B2C.mass[k] + massCompensationLow;
						theoreticalMassHigh = mDelta2.B2C.mass[k] + massCompensationHigh;
						if (mCurrentTargetMassHigh - CMass.H2 > theoreticalMassLow && mCurrentTargetMassLow - CMass.H2 < theoreticalMassHigh) {
							unitIndexes.add(k);
							minusHCount.add(2);
						}
					}
				}

				for (int a = 0; a < unitIndexes.size(); a++) {
					unitID = unitIndexes.get(a);
					newUnit1 = mDelta2.B2C.unit[unitID][0];
					if (newUnit1.mClassID == 2) // Rule: Fuc can only be a branch, not in a linear substructure.
						continue;

					newUnit2 = mDelta2.B2C.unit[unitID][1];
					double tempMassLow = mDelta2.B2C.mass[unitID] + massCompensationLow;
					double tempMassHigh = mDelta2.B2C.mass[unitID] + massCompensationHigh;

					countH = minusHCount.get(a);
		            massH = countH * CMass.H;
					newTS = new CTopologySet("C", mCurrentTargetMass,
							Math.max(tempMassLow, mCurrentTargetMassLow + massH) - CMass.H2O, // Although it is C-ion, we use its B-ion mass in interpreting peaks.
							Math.min(tempMassHigh, mCurrentTargetMassHigh + massH) - CMass.H2O, 
							newUnit2, newUnit1, mCurrentBranches, this, countH);
					insertIntoCurrentTSS( newTS );
					result = 1;

					for (int idxGapInBranch = 0; idxGapInBranch < 4; idxGapInBranch++) {
						if (mCurrentBranches[idxGapInBranch] == null)
							break;
						newTS = new CTopologySet("C", mCurrentTargetMass,
								Math.max(tempMassLow, mCurrentTargetMassLow + massH) - CMass.H2O,
								Math.min(tempMassHigh, mCurrentTargetMassHigh + massH) - CMass.H2O, 
								newUnit2, newUnit1, idxGapInBranch, mCurrentBranches, this, countH );
						insertIntoCurrentTSS( newTS );
					}
				}
			}
		}

		return result;
	}
	
    private int testAddTopologySet_2BranchWithGap(double massCompensationLow, double massCompensationHigh) {
        int result = 0;
        double linkageMassLoss = CMass.H2O + 3 * (mPermethylated ? 1 : 0) * CMass.CH2;
        
        // Check if the branches together are already too heavy or still too light
        double temp = mCurrentTargetMass - massCompensationLow;
        if ( mPermethylated ) {
            if (temp < 160)
                return -1; // too heavy
            if ( mCheckGap ) {
                if ( temp > 860 ) // ~ two max( mDelta2.B2C )
                    return 0;
            }
            else if ( temp > 420 ) // max( obj.mDelta.B2C )
                return 0;
        }
        else {
            if ( temp < 105 )
                return -1;
            if ( mCheckGap ) {
                if ( temp > 660 ) // ~ two max( obj.mDelta2.B2C )
                    return 0;
            }
            else if ( temp > 335 ) // max( obj.mDelta.B2C )
                return 0;
        }
        
        // Allow 1 gap only when no-gap fails
        if ( mCheckGap ) {
            boolean possible = false;
            if ( (mCurrentBranches[2] == null) && (mCurrentBranches[1] != null) ) {
                for (CTopologySet aTS : mCurrentBranches[1].mTopologySets ) {
                    if ( aTS.mRootMono.mClassID != 2 ) {
                        possible = true;
                        break;
                    }
                }
            }
            if ( !possible )
            	return 0;
        }

        // record unitIndexes and whether each is a minusH result
        ArrayList<Integer> unitIndexes = new ArrayList<Integer>();
        ArrayList<Integer> minusHCount = new ArrayList<Integer>();
        ArrayList<Double> massLow = new ArrayList<Double>();
        ArrayList<Double> massHigh = new ArrayList<Double>();
        double theoreticalMassLow, theoreticalMassHigh;
        CTopologySet newTS;

        // B2B: try to interpret as a B-ion by adding one monosaccharide to a B-ion
        for (int k = 0; k < mDelta2.B2B.mass.length; k++) {
        	theoreticalMassLow = mDelta2.B2B.mass[k] + massCompensationLow;
        	theoreticalMassHigh = mDelta2.B2B.mass[k] + massCompensationHigh;
        	if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh) {
        		unitIndexes.add( k );
        		minusHCount.add( 0 );
        		massLow.add( theoreticalMassLow );
        		massHigh.add( theoreticalMassHigh );
        	}
        }

        // if allow to check "-2H", search for results of adding "2H" to the current peak
        if ( !mFinalPeak && mCheckMinus2H) {
        	for (int k = 0; k < mDelta.B2B.mass.length; k++) {
        		theoreticalMassLow = mDelta2.B2B.mass[k] + massCompensationLow;
        		theoreticalMassHigh = mDelta2.B2B.mass[k] + massCompensationHigh;
        		if ( mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
        			&& mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh ) {
        			unitIndexes.add( k );
        			minusHCount.add( 2 );
            		massLow.add( theoreticalMassLow );
            		massHigh.add( theoreticalMassHigh );
        		}
        	}
        }

        if ( unitIndexes.size() > 0 )
        	result = 1;
        
        int unitID, countH;
        double massH = 0;
		CMonosaccharide newUnit1, newUnit2;
        String ionType;
        
		for (int a = 0; a < unitIndexes.size(); a++) {
			unitID = unitIndexes.get(a);
			newUnit1 = mDelta2.B2B.unit[unitID][0];
			if (newUnit1.mClassID == 2) // Rule: Fuc can only be a branch, not in a linear substructure.
				continue;
			newUnit2 = mDelta2.B2B.unit[unitID][1];
			
			double tempMassLow = mDelta2.B2B.mass[unitID] + massCompensationLow;
			double tempMassHigh = mDelta2.B2B.mass[unitID] + massCompensationHigh;

			countH = minusHCount.get(a);
            massH = countH * CMass.H;
			if (mFinalPeak)
				ionType = "T";
			else
				ionType = "B";

			newTS = new CTopologySet( ionType, mCurrentTargetMass,
									Math.max(tempMassLow, mCurrentTargetMassLow + massH),
									Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
									newUnit2, newUnit1, mCurrentBranches, this, countH );
			insertIntoCurrentTSS(newTS);
			
			for (int b = 0; b < 4; b++) {
				if (mCurrentBranches[b] == null)
					break;
				newTS = new CTopologySet( ionType, mCurrentTargetMass,
						Math.max(tempMassLow, mCurrentTargetMassLow + massH),
						Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
						newUnit2, newUnit1, b, mCurrentBranches, this, countH );
				insertIntoCurrentTSS(newTS);
			}
		}
    	
   		CTopologySet gapTS;
   		CTopologySuperSet gapSS;
   		for (int a = 0; a < unitIndexes.size(); a++) {
   			unitID = unitIndexes.get(a);
   			newUnit1 = mDelta2.B2B.unit[unitID][0];
   			if (newUnit1.mClassID == 2)  // Rule: Fuc can only be a branch, not in a linear substructure.
   				continue;
   			newUnit2 = mDelta2.B2B.unit[unitID][1];

   			countH = minusHCount.get(a);
   			massH = countH * CMass.H;

   			double tempMassLow = Math.max(mDelta2.B2B.mass[unitID] + massCompensationLow, mCurrentTargetMassLow + massH);
   			double tempMassHigh = Math.min(mDelta2.B2B.mass[unitID] + massCompensationHigh, mCurrentTargetMassHigh + massH);

   			// Need to create a gapBranch. There are 3 branches in mCurrentBranches[].
   			// So there are 3 possiblities: (a) [[1 2]+gapMono 3], [[1 3]+gapMono 2], [[2 3]+gapMono 1]   			
   			
   			// Case [[1 2]+gapMono 3]:
   			gapTS = new CTopologySet("B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit1, mCurrentBranches, this, countH );   			
   			gapTS.mBranches[2] = null;
   			gapTS.mMassPeak -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[2].mMassPeak - CMass.Proton); // remove the mass of the 3rd branch.
   			gapTS.mMassLow -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[2].mMassLow - CMass.Proton); // remove the mass of the 3rd branch.
   			gapTS.mMassHigh -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[2].mMassHigh - CMass.Proton); // remove the mass of the 3rd branch.

            gapSS = new CTopologySuperSet("B", gapTS.mMassPeak, this, this.mCurrentPeakIdx);
            gapSS.mMassHigh = gapTS.mMassHigh;
            gapSS.mMassLow = gapTS.mMassLow;
            gapSS.mTopologySets.add( gapTS );
                
            newTS = new CTopologySet( "B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit2, this.mCurrentBranches, this, countH );
            newTS.mBranches[0] = gapSS;
            newTS.mBranches[1] = mCurrentBranches[2];
            newTS.mBranches[2] = null;
                
            if ( mFinalPeak ) {
            	newTS.mType = "T";
                newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 23);
            } else {
            	newTS.mType = "B";
            	newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 21);
            }
            this.insertIntoCurrentTSS( newTS );
            
            if ( this.mCurrentBranches[1] != this.mCurrentBranches[2] ) {
            	// Case [[1 3]+gapMono 2]:
            	gapTS = new CTopologySet("B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit1, mCurrentBranches, this, countH );   			
            	gapTS.mBranches[1] = mCurrentBranches[2];
            	gapTS.mBranches[2] = null;
            	gapTS.mMassPeak -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[1].mMassPeak - CMass.Proton); // remove the mass of the 3rd branch.
            	gapTS.mMassLow -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[1].mMassLow - CMass.Proton); // remove the mass of the 3rd branch.
            	gapTS.mMassHigh -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[1].mMassHigh - CMass.Proton); // remove the mass of the 3rd branch.

            	gapSS = new CTopologySuperSet("B", gapTS.mMassPeak, this, this.mCurrentPeakIdx);
            	gapSS.mMassHigh = gapTS.mMassHigh;
            	gapSS.mMassLow = gapTS.mMassLow;
            	gapSS.mTopologySets.add( gapTS );

            	newTS = new CTopologySet( "B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit2, this.mCurrentBranches, this, countH );
            	newTS.mBranches[0] = gapSS;
            	newTS.mBranches[1] = mCurrentBranches[1];
            	newTS.mBranches[2] = null;

            	if ( mFinalPeak ) {
            		newTS.mType = "T";
            		newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 23);
            	} else {
            		newTS.mType = "B";
            		newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 21);
            	}
            	this.insertIntoCurrentTSS( newTS );

            	if ( this.mCurrentBranches[0] != this.mCurrentBranches[1] ) {
            		// Case [[2 3]+gapMono 1]:
            		gapTS = new CTopologySet("B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit1, mCurrentBranches, this, countH );
            		gapTS.mBranches[0] = mCurrentBranches[1];
            		gapTS.mBranches[1] = mCurrentBranches[2];
            		gapTS.mBranches[2] = null;
            		gapTS.mMassPeak -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassPeak - CMass.Proton); // remove the mass of the 3rd branch.
            		gapTS.mMassLow -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassLow - CMass.Proton); // remove the mass of the 3rd branch.
            		gapTS.mMassHigh -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassHigh - CMass.Proton); // remove the mass of the 3rd branch.

            		gapSS = new CTopologySuperSet("B", gapTS.mMassPeak, this, this.mCurrentPeakIdx);
            		gapSS.mMassHigh = gapTS.mMassHigh;
            		gapSS.mMassLow = gapTS.mMassLow;
            		gapSS.mTopologySets.add( gapTS );

            		newTS = new CTopologySet( "B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit2, this.mCurrentBranches, this, countH );
            		newTS.mBranches[0] = gapSS;
            		newTS.mBranches[1] = mCurrentBranches[0];
            		newTS.mBranches[2] = null;

            		if ( mFinalPeak ) {
            			newTS.mType = "T";
            			newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 23);
            		} else {
            			newTS.mType = "B";
            			newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 21);
            		}
            		this.insertIntoCurrentTSS( newTS );
            	}
            }
            else if ( this.mCurrentBranches[0] != this.mCurrentBranches[1] ) { // Don't need [[1 3]+gapMono 2]:
            	// Case [[2 3]+gapMono 1]:
        		gapTS = new CTopologySet("B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit1, mCurrentBranches, this, countH );
        		gapTS.mBranches[0] = mCurrentBranches[1];
        		gapTS.mBranches[1] = mCurrentBranches[2];
        		gapTS.mBranches[2] = null;
        		gapTS.mMassPeak -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassPeak - CMass.Proton); // remove the mass of the 3rd branch.
        		gapTS.mMassLow -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassLow - CMass.Proton); // remove the mass of the 3rd branch.
        		gapTS.mMassHigh -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassHigh - CMass.Proton); // remove the mass of the 3rd branch.

        		gapSS = new CTopologySuperSet("B", gapTS.mMassPeak, this, this.mCurrentPeakIdx);
        		gapSS.mMassHigh = gapTS.mMassHigh;
        		gapSS.mMassLow = gapTS.mMassLow;
        		gapSS.mTopologySets.add( gapTS );

        		newTS = new CTopologySet( "B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit2, this.mCurrentBranches, this, countH );
        		newTS.mBranches[0] = gapSS;
        		newTS.mBranches[1] = mCurrentBranches[0];
        		newTS.mBranches[2] = null;

        		if ( mFinalPeak ) {
        			newTS.mType = "T";
        			newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 23);
        		} else {
        			newTS.mType = "B";
        			newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 21);
        		}
        		this.insertIntoCurrentTSS( newTS );
            }
   		}
   		
   		return result;
    }

	// step 11
	private void insertIntoCurrentTSS(CTopologySet newSet) {
		// Add a new CTopologySet newSet to a CTopologySuperSet of the same mass and same type in this.mTopologySuperSets. 
		// Create a new CTopologySuperSet if necessary.

		CTopologySuperSet tss = null;
		if (newSet.mType.equals("B") || newSet.mType.equals("T")) { // insert as B ions
			if (newSet.mMinusH == 0) {
				if (mCurrentTopologySuperSetB == null) 
					mCurrentTopologySuperSetB = new CTopologySuperSet(newSet.mType, mCurrentTargetMass, this, mCurrentPeakIdx);
				if ( newSet.mType.equals("B") )
					mCurrentTopologySuperSetB.mTargetPeaks.put(mCurrentPeakIdx, 1);
				else
					mCurrentTopologySuperSetB.mTargetPeaks.put(mCurrentPeakIdx, 3);
				tss = mCurrentTopologySuperSetB;
			} else if (newSet.mMinusH == 2) {
				// let ion type be 21 23 to indicate this ion is an ion with -2H
				if (mCurrentTopologySuperSetB2 == null) {
					mCurrentTopologySuperSetB2 = new CTopologySuperSet(newSet.mType, mCurrentTargetMass, this, mCurrentPeakIdx);
					if ( newSet.mType.equals("T") )
						mCurrentTopologySuperSetB2.mTargetPeaks.put(mCurrentPeakIdx, 23);
					else
						mCurrentTopologySuperSetB2.mTargetPeaks.put(mCurrentPeakIdx, 21);
				}
				tss = mCurrentTopologySuperSetB2;
			}
		} else if (newSet.mType.equals("C")) {
			// insert as C ion
			if (newSet.mMinusH == 0) {
				if (mCurrentTopologySuperSetC == null)
					mCurrentTopologySuperSetC = new CTopologySuperSet(newSet.mType, mCurrentTargetMass, this, mCurrentPeakIdx);
				mCurrentTopologySuperSetC.mTargetPeaks.put(mCurrentPeakIdx, 2);
				tss = mCurrentTopologySuperSetC;
			} else if (newSet.mMinusH == 2) {
				// let ion type be 22 to indicate -2H
				if (mCurrentTopologySuperSetC2 == null) {
					mCurrentTopologySuperSetC2 = new CTopologySuperSet(newSet.mType, mCurrentTargetMass, this, mCurrentPeakIdx);
					mCurrentTopologySuperSetC2.mTargetPeaks.put(mCurrentPeakIdx, 22);
				}
				tss = mCurrentTopologySuperSetC2;
			}
		} else
			throw new InvalidParameterException("wrong mtype");

		tss.addATopologySet(newSet);
	}

	// possible mass difference between two type of ion with gap
	class Delta2 {
		Link2 B2B;
		Link2 B2C;
		Link2 C2C;
		Link2 C2B;

		// numClass is cMonosaccharideClasses.length here
		private Delta2(int numClass, boolean permethylated) {
			double perMassLoss = 2 * (permethylated? 1 : 0) * CMass.CH2; // If not the root unit, lose two CH2s when permethylated
			double linkageMassLoss = CMass.H2O + perMassLoss;
			B2B = new Link2(numClass * numClass);
			B2C = new Link2(numClass * numClass);
			C2C = new Link2(numClass * numClass);
			C2B = new Link2(numClass * numClass);
			int index = 0;
			for (int i = 0; i < numClass; i++) {
				CMonosaccharide mono1 = cMonosaccharideArrays[i];
				for (int j = 0; j < numClass; j++) {
					CMonosaccharide mono2 = cMonosaccharideArrays[j];
					if (!cLegalGlycosidicBonds[i][j]) {
						continue;
					}
					// add 1 CGlycoDeNovo.cMonosaccharideClasses(k) to form a
					// B-ion
					B2B.mass[index] = mono1.mMass + mono2.mMass - 2 * linkageMassLoss;
					B2B.unit[index][0] = mono1; // mono.copy;
					B2B.unit[index][1] = mono2;

					// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a
					// C-ion
					B2C.mass[index] = mono1.mMass + mono2.mMass - linkageMassLoss + CMass.H2O;
					B2C.unit[index][0] = mono1; // mono.copy;
					B2C.unit[index][1] = mono2;

					// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a
					// B-ion
					C2B.mass[index] = mono1.mMass + mono2.mMass - CMass.H2O - 2 * linkageMassLoss;
					C2B.unit[index][0] = mono1; // mono.copy;
					C2B.unit[index][1] = mono2; // mono.copy;

					// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a
					// C-ion
					C2C.mass[index] = mono1.mMass - linkageMassLoss * 2;
					C2C.unit[index][0] = mono1; // mono.copy;
					C2C.unit[index][1] = mono2; // mono.copy;
					index++;
				}
				B2B.len = index;
				B2C.len = index;
				C2B.len = index;
				C2C.len = index;
			}
		}
	}
	// possible mass difference between two type of ion with no gap

	class Delta {
		Link B2B;
		Link B2C;
		Link C2C;
		Link C2B;

		// numClass is cMonosaccharideClasses.length here
		private Delta(int numClass, boolean permethylated) {
			double perMassLoss = 2 * (permethylated ? 1 : 0) * CMass.CH2; // If not the root unit, lose two CH2s when permethylated
			double linkageMassLoss = CMass.H2O + perMassLoss;
			B2B = new Link(numClass);
			B2C = new Link(numClass);
			C2C = new Link(numClass);
			C2B = new Link(numClass);
			for (int i = 0; i < numClass; i++) {
				CMonosaccharide mono = cMonosaccharideArrays[i];

				// add 1 CGlycoDeNovo.cMonosaccharideClasses(k) to form a B-ion
				B2B.mass[i] = mono.mMass - linkageMassLoss;
				B2B.unit[i] = mono; // mono.copy;

				// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a C-ion
				B2C.mass[i] = mono.mMass - perMassLoss;
				B2C.unit[i] = mono; // mono.copy;

				// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a B-ion
				C2B.mass[i] = mono.mMass - CMass.H2O - linkageMassLoss;
				C2B.unit[i] = mono; // mono.copy;

				// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a C-ion
				C2C.mass[i] = mono.mMass - CMass.H2O - perMassLoss;
				C2C.unit[i] = mono; // mono.copy;
			}
		}
	}

	// mass / Monosaccharide info of ion link for B C ion
	class Link {
		double[] mass;
		CMonosaccharide[] unit;

		private Link(int numClass) {
			mass = new double[numClass];
			unit = new CMonosaccharide[numClass];
		}
	}

	class Link2 {
		double[] mass;
		CMonosaccharide[][] unit;
		int len;

		private Link2(int numClass) {
			mass = new double[numClass];
			unit = new CMonosaccharide[numClass][2];
		}
	}
}
=======
package edu.brandeis.glycodenovo.core;

import java.security.InvalidParameterException;
import java.util.*;

/**
 * Copyright [2018] [Pengyu Hong at Brandeis University] Licensed under the
 * Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

/*
 * This is the main part of algorithm some important note on params correspond
 * with algorithm in the paper
 * 
 * Cpeak / Cpeak.mInferredSuperSets : candidate for a certain peak
 * mTopologySuperSets : Candidate pool TopologySuperSet: Candidate TopologySet :
 * Reconstruction (Important : it's not the same as the definition in Topology)
 * Topology : Topology
 * 
 * Documentation on different parts of this Class CGlycoDeNovo --- constructor
 * 1. interpretPeaks --- algorithm 1
 * 
 * generate all possible candidates (Cpeak.mInferredSuperSets()) including find
 * whether C-ion can be interpreted as a former B-ion interpretApeak --
 * interpret current peak (algorithm 1 step 4 - 5) here only consider 2 branch
 * testAndAddTopologySet --- step 6 in algorithm 1 insertIntoCurrentTSS --- step
 * 7 in algorithm 1 -- insert all possible TSS to candidate and pool
 * (Cpeak.mInferredSuperSets() and Cpeak.mInferredSuperSets()) (including B-ion
 * and C-ion) appendNLinkedRoot --- finally add some missing part to the root
 * 
 * 2. reconstructFormulas --- algorithm 2 call function for final peak 1.find
 * all unique TopologySuperSet that can be interpreted related to final peak
 * 2.from small to large --- reconstruct final peak (step 4 - 19) call function
 * TSS.reconstructformular() to reconstruct all TSS
 * 
 */

public class CGlycoDeNovo {
	// All cMonosaccharideClasses
	static String[] cMonosaccharideClasses = { "Xyl", "Fuc", "Hex", "HexA", "HexNAc", "Kdo", "NeuAc", "NeuGc" };
	private CMonosaccharide[] cMonosaccharideArrays = new CMonosaccharide[cMonosaccharideClasses.length];
	// All possible bonds
	// Will be used in reconstruction part
	static boolean[][] cLegalGlycosidicBonds = { { true, true, true, true, true, true, true, true },
			{ true, false, true, true, true, true, true, true }, { false, false, true, true, true, true, true, true },
			{ false, false, true, true, true, true, true, true }, { false, false, true, true, true, true, true, true },
			{ false, false, true, true, true, true, true, true }, { false, false, true, true, true, true, true, true },
			{ false, false, true, true, true, true, true, true } };

	double 	mMassAccuracyPPM = 5; // ppm = 1000000*mass_error/exact_mass; mass_error = mMassAccuracyPPM*exact_mass/1000000;
	double	mMassAccuracyPP = 0.0000005; // ppm / 1000000
	double	mMassAccuracyDalton = 0.005; // Da
	int		mMaxBranchingNum = 2; // default bi-branching
	double	mIonMass = 0; // mass of the metal Ion
	String	mIonMetal; // type of mIonMetal
	double	mIntensityThreshold = 0; // Lowest Threshold for peak Intensity
	boolean	mNLinked = false; // whether is Nlinked
	boolean	mPermethylated = false; // Permethylated means attach CH2 on molecular
	String	mReducingEndMode;
	double	mReducingEndCompensation = 0;
	double	mFinalPeakCompensation = 0;
	int[]	mCompositionCountThreshold = new int[8];
	boolean mCheckMinus2H = false;
	boolean mCheckGap = false;
	
	ArrayList<CPeak> mPeaks;
	ArrayList<CTopologySuperSet> mTopologySuperSets;

	ArrayList<String> mPossibleMonosaccharideClasses = null;
	// Mass Compensation for Specific experiment condition
	private Delta mDelta;
	private Delta2 mDelta2;
	private int mNumPeaks = 0;
	
	private CPeak mCurrentPeak = null;
	private int mCurrentPeakIdx = -1; 
	private boolean mFinalPeak = false;
	private double mCurrentTargetMass = 0;
	private double mCurrentTargetMassLow = 0;
	private double mCurrentTargetMassHigh = 0;
	private int mCurrentTPSuperSetSize = 0;
	private boolean mTryCIon = false;
	private boolean mLeafPeak = false;
	// TSSB TSSC is for no Check2H // TSSB2 TSSC2 for check2H
	private CTopologySuperSet mCurrentTopologySuperSetB;
	private CTopologySuperSet mCurrentTopologySuperSetB2;
	private CTopologySuperSet mCurrentTopologySuperSetC;
	private CTopologySuperSet mCurrentTopologySuperSetC2;
	private CTopologySuperSet[] mCurrentBranches; // TSS Branches
	// initialize

	public CGlycoDeNovo(double massAccuracyPPM) {
		mMassAccuracyPPM = massAccuracyPPM;
		mMassAccuracyPP = mMassAccuracyPPM / 1000000;
		Arrays.fill(mCompositionCountThreshold, 8000);
	}

	public CGlycoDeNovo(double massAccuracyPPM, boolean checkMinus2H, boolean checkGap) {
		mCheckMinus2H = checkMinus2H;
		mCheckGap = checkGap;
		mMassAccuracyPPM = massAccuracyPPM;
		mMassAccuracyPP = mMassAccuracyPPM / 1000000;
		Arrays.fill(mCompositionCountThreshold, 8000);
	}

	public void setMaxBranchNum( int num )
	{
		if ( num > 1 && num < 5 )
			this.mMaxBranchingNum = num;
	}
	
    private boolean acceptable_monosaccharide( String monoClass ) {
    	if ( this.mPossibleMonosaccharideClasses == null || this.mPossibleMonosaccharideClasses.size() == 0 )
    		return true;
    	if ( this.mPossibleMonosaccharideClasses.indexOf( monoClass ) >= 0 )
    		return true;
    	return false;
    }
    
    // Algorithm part 1: Intepret ALl Peaks
	public void interpretPeaks(CSpectrum spec) {
		// initialize all params related to spec
		if ( spec.isProtonated() ) {
			mIonMetal = "Proton";
			mIonMass = CMass.Proton;
		} else {
			mIonMetal = spec.getMetal();
			switch ( mIonMetal ) {
			case "Lithium":
				mIonMass = CMass.Lithium - CMass.Electron;

			case "Na":
			case "Sodium":
				mIonMass = CMass.Sodium - CMass.Electron;
				break;
			default:
				throw new InvalidParameterException("ionMetal not found");
			}
		}
		// default params
		mMassAccuracyDalton = spec.getPrecursorMZ() * mMassAccuracyPP;
		mPermethylated = spec.isPermethylated();
		mNLinked = spec.isNLinked();
		mReducingEndMode = spec.getReducingEndMode();
		if (mReducingEndMode != null)
			mReducingEndCompensation = CMass.reducingEndMassCompensation(mReducingEndMode, mPermethylated);
		if ( mPermethylated )
			mFinalPeakCompensation = mReducingEndCompensation + CMass.CH2 + CMass.H2O;
		else
			mFinalPeakCompensation = mReducingEndCompensation;
		for (int i = 0; i < cMonosaccharideClasses.length; i++) {
			cMonosaccharideArrays[i] = new CMonosaccharide(cMonosaccharideClasses[i], mPermethylated);
		}
		mDelta = new Delta(cMonosaccharideClasses.length, this.mPermethylated);
		mDelta2 = new Delta2(cMonosaccharideClasses.length, this.mPermethylated);
		// clear all existing inferences.
		spec.clearInferred();
		mPeaks = spec.getPeaks( 0 );
		mNumPeaks = mPeaks.size();
		mCurrentPeakIdx = -1;
		// step 1 - default candidate pool
		mTopologySuperSets = new ArrayList<>();
		mFinalPeak = false;

		spec.updatePeakIDs();
		for (int k = 0; k < mPeaks.size(); k++) { // step 2
			// step 3 initialize the candidate set / mass
			mCurrentPeak = mPeaks.get(k);
			if (mCurrentPeak.getIntensity() < mIntensityThreshold)
				continue;
			mCurrentTargetMass = mCurrentPeak.getMass();
			
			// Ignore peaks whose mass is too small (less than a single monosaccharide).
			if (mPermethylated) {
				if (mCurrentTargetMass < 175)
					continue;
			} else if (mCurrentTargetMass < 131)
				continue;

			// Initialize parameters that store intermediate results or make access easier.
			mCurrentPeakIdx = k; 
			mCurrentTargetMassLow = mCurrentPeak.getMassLowBound();
			mCurrentTargetMassHigh = mCurrentPeak.getMassHighBound();
			mCurrentTopologySuperSetB = null;
			mCurrentTopologySuperSetB2 = null;
			mCurrentTopologySuperSetC = null;
			mCurrentTopologySuperSetC2 = null;
			mCurrentTPSuperSetSize = mTopologySuperSets.size();
			mCurrentBranches = new CTopologySuperSet[4]; // empty branches

			// If the current peak is the precursor peak, we do not need to try to interpret it as a C-ion, 
			// and hence should set mTryCIon = false and mFinalPeak = true.
			if (mCurrentPeakIdx == mNumPeaks - 1) {
				mTryCIon = false;
				mFinalPeak = true;
			} else {
				mTryCIon = true;
				// This can save computational time: Try to find existing B-ion interpretation of this C-ion (B-Ion = C-Ion - H2O)
				// If such a B-ion exists, we don't need to try C-ions in the following calculation (save time).
				double bIonMassLow = mCurrentTargetMassLow - CMass.H2O;
				double bIonMassHigh = mCurrentTargetMassHigh - CMass.H2O;
				for (int m = mCurrentTPSuperSetSize - 1; m >= 0; m--) {
					CTopologySuperSet ctss = mTopologySuperSets.get(m);
					if ( ctss.mType.equals("C") ) continue;	// Skip if ctss is of a C ion
					
					/* Modified by Hong 8/3/3019
					double avgMass = (ctss.mMassLow + ctss.mMassHigh) / 2;
					// search for avgMass in BionMass - 0.01 ~ BionMass + 0.01
					if (bIonMass > avgMass + 0.01) // 0.01 is the mass accuracy,
													// should be changed to PPM
													// based.
						break;
					else if (bIonMass >= avgMass - 0.01) {
						// Interpret as C ion of previous candidate
						ctss.addPeak(mCurrentPeakIdx, 2);
						mCurrentPeak.getInferredSuperSets().add(ctss);
						mTryCIon = false;
						break;
					}
					*/
					if ( bIonMassLow < ctss.mMassLow || bIonMassHigh > ctss.mMassHigh ) // replace the block above
						continue;
				}
			}
			// step 4 ~ 5
			interpretAPeak();

			if (mFinalPeak && mCurrentTopologySuperSetB == null && mCurrentTopologySuperSetC == null )
				appendNLinkedRoot(); // If failed to interpret the final peak, try adding the Nlink root.
			
			addCurrentTSSToPool(); // add CurrentTSS to Pool
		}
		System.out.println("CGlycoDeNovo::interpretPeaks() done!");
	}

	// Add NLinkedRoot part for Final Peak
	private void appendNLinkedRoot() {
		double mass_error = mMassAccuracyPP * mPeaks.get(mPeaks.size() - 1).getMass();
		double targetMLow = mPeaks.get(mPeaks.size() - 1).getMass() - mass_error;
		double targetMHigh = mPeaks.get(mPeaks.size() - 1).getMass() + mass_error;
		double dMassBIonNoFuc = CMonosaccharideSet.GlcNAc.sacPermethylated.mass * 2
				- (CMass.CH2 * 2 * (this.mPermethylated? 1 : 0) + CMass.H2O) * 2 + mFinalPeakCompensation;
		// % check if there is a ion corresponding to Fuc
		CTopologySuperSet ssFuc = null;
		for (CTopologySuperSet mTSS : mTopologySuperSets) {
			for (CTopologySet cs : mTSS.mTopologySets) {
				if (cs.mRootMono.mClassID == 2 && cs.mBranches[0] == null) {
					ssFuc = mTSS;
					break;
				}
			}
			if (ssFuc != null)
				break;
		}
		double dMassBIonWithFuc = 0;
		if (ssFuc != null) {
			dMassBIonWithFuc = dMassBIonNoFuc + CMonosaccharideSet.dHex.sacPermethylated.mass
					- (CMass.CH2 * 2 * (this.mPermethylated? 1 : 0) + CMass.H2O);
		}

		for (int cidx = mTopologySuperSets.size() - 1; cidx >= 0; cidx--) {
			CTopologySuperSet mTSS = mTopologySuperSets.get(cidx);
			double tMassLow = mTSS.mMassLow + dMassBIonNoFuc;
			double tMassHigh = mTSS.mMassHigh + dMassBIonNoFuc;

			if (tMassHigh < targetMLow - 2 && ssFuc == null) // % too light, no
																// need to
																// continue.
				break;
			if (targetMHigh > tMassLow && targetMLow < tMassHigh) {
				insertIntoCurrentTSS(new CTopologySet("T", mCurrentTargetMass, tMassLow, tMassHigh, mDelta.B2B.unit[4],
						mDelta.B2B.unit[4], new CTopologySuperSet[] { mTSS, null, null, null }, this));
			}

			if (ssFuc != null) {
				tMassLow = mTSS.mMassLow + dMassBIonWithFuc;
				tMassHigh = mTSS.mMassHigh + dMassBIonWithFuc;

				if (targetMHigh > tMassLow && targetMLow < tMassHigh) {
					insertIntoCurrentTSS(
							new CTopologySet("T", mCurrentTargetMass, tMassLow, tMassHigh, mDelta.B2B.unit[4],
									mDelta.B2B.unit[4], new CTopologySuperSet[] { ssFuc, mTSS, null, null }, this));
					insertIntoCurrentTSS(
							new CTopologySet("T", mCurrentTargetMass, tMassLow, tMassHigh, mDelta.B2B.unit[4],
									mDelta.B2B.unit[4], 1, new CTopologySuperSet[] { ssFuc, mTSS, null, null }, this));
				}
			}
		}
	}

	// Add Current TSSB TSSC to the search pool
	private void addCurrentTSSToPool() {
		// Add mCurrentTopologySuperSetB/B1/B2/C/C1/C2 to the search pool, which will be used in 
		// interpreting the peaks followed

		CPeak curPeak = mPeaks.get(mCurrentPeakIdx);
		// add C2 to TSS if not null
		if (mCurrentTopologySuperSetC2 != null) {
			if (mTopologySuperSets.isEmpty() || mCurrentTopologySuperSetC2.mMassLow > mTopologySuperSets
					.get(mTopologySuperSets.size() - 1).mMassLow) {
				// add to end if pool empty or TSS mass is largest
				mTopologySuperSets.add(mCurrentTopologySuperSetC2);
				curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetC2);
			} else {
				// search for its correct position if mass is not largest
				for (int i = mTopologySuperSets.size() - 1; i >= 0; i--) {
					if (mTopologySuperSets.get(i).contains(mCurrentTopologySuperSetC2)) {
						curPeak.getInferredSuperSets().add(mTopologySuperSets.get(i));
						// type 22 is to indicate that this is a C-2H ion
						mTopologySuperSets.get(i).addPeak(mCurrentPeakIdx, 22);
						break;
					} else if (mCurrentTopologySuperSetC2.mMassLow > mTopologySuperSets.get(i).mMassLow) {
						mTopologySuperSets.add(i + 1, mCurrentTopologySuperSetC2);
						curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetC2);
						break;
					}
				}
			}
		}
		if (mCurrentTopologySuperSetC != null) {
			// add to end if pool empty or TSS mass is largest
			if (mTopologySuperSets.isEmpty() || mCurrentTopologySuperSetC.mMassLow > mTopologySuperSets
					.get(mTopologySuperSets.size() - 1).mMassLow) {
				mTopologySuperSets.add(mCurrentTopologySuperSetC);
				curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetC);
			} else {
				// search for its correct position if mass is not largest
				for (int i = mTopologySuperSets.size() - 1; i >= 0; i--) {
					if (mTopologySuperSets.get(i).contains(mCurrentTopologySuperSetC)) {
						curPeak.getInferredSuperSets().add(mTopologySuperSets.get(i));
						// type 2 means this is a C ion
						mTopologySuperSets.get(i).addPeak(mCurrentPeakIdx, 2);
						break;
					} else if (mCurrentTopologySuperSetC.mMassLow > mTopologySuperSets.get(i).mMassLow) {
						mTopologySuperSets.add(i + 1, mCurrentTopologySuperSetC);
						curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetC);
						break;
					}
				}
			}
		}

		if (mCurrentTopologySuperSetB2 != null) {
			// add to end if pool empty or TSS mass is largest

			if (mTopologySuperSets.isEmpty() || mCurrentTopologySuperSetB2.mMassLow > mTopologySuperSets
					.get(mTopologySuperSets.size() - 1).mMassLow) {
				mTopologySuperSets.add(mCurrentTopologySuperSetB2);
				curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetB2);
			} else {
				// search for its correct position
				for (int i = mTopologySuperSets.size() - 1; i >= 0; i--) {
					if (mTopologySuperSets.get(i).contains(mCurrentTopologySuperSetB2)) {
						curPeak.getInferredSuperSets().add(mTopologySuperSets.get(i));
						mTopologySuperSets.get(i).addPeak(mCurrentPeakIdx, 21);
						break;
					} else if (mCurrentTopologySuperSetB2.mMassLow > mTopologySuperSets.get(i).mMassLow) {
						mTopologySuperSets.add(i + 1, mCurrentTopologySuperSetB2);
						curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetB2);
						break;
					}
				}
			}
		}

		if (mCurrentTopologySuperSetB != null) {
			mTopologySuperSets.add(mCurrentTopologySuperSetB);
			curPeak.getInferredSuperSets().add(mCurrentTopologySuperSetB);
		}
	}

	// step 4 - 5
	private void interpretAPeak() {
		if (mCurrentTargetMass < 438) { // try to interpret as a mono, hence should not be heavier than the heaviest mono
			double massCompensationLow = mIonMass; // use this as a temp to calculate both massCompensationHigh and massCompensationLow
			if (mPermethylated)
				massCompensationLow += CMass.CH2;
			if (mFinalPeak)
				massCompensationLow = massCompensationLow + mFinalPeakCompensation;
			double massCompensationHigh = massCompensationLow * (1 + mMassAccuracyPP);
			massCompensationLow = massCompensationLow * (1 - mMassAccuracyPP);
			mLeafPeak = true;
			if ( testAddTopologySet(massCompensationLow, massCompensationHigh) == -1 )
				return;
		}
		
		mLeafPeak = false;
		double[] branchMassesLow = new double[4];
		double[] branchMassesHigh = new double[4];
		int testAddResult = 0;
		
		// each branch causes a CH2 loss to the joint monosaccharide when permethylated && obj.mDelta only considers linear structure (i.e., one branch).
		double massD = mIonMass + (this.mPermethylated? 1 : 0) * CMass.CH2;

		for (int k = 0; k < mCurrentTPSuperSetSize; k++) { // 1st branch
			mCurrentBranches[0] = mTopologySuperSets.get(k);
			if (mFinalPeak) {
				branchMassesLow[0] = mCurrentBranches[0].mMassLow + mFinalPeakCompensation * (1 - mMassAccuracyPP);
				branchMassesHigh[0] = mCurrentBranches[0].mMassHigh + mFinalPeakCompensation * (1 + mMassAccuracyPP);
			} else {
				branchMassesLow[0] = mCurrentBranches[0].mMassLow;
				branchMassesHigh[0] = mCurrentBranches[0].mMassHigh;
			}
			if ( testAddTopologySet(branchMassesLow[0], branchMassesHigh[0]) == -1 )
				break;

			for (int kk = k; kk < mCurrentTPSuperSetSize; kk++) { // 2nd branch
				mCurrentBranches[1] = mTopologySuperSets.get(kk);
				branchMassesLow[1] = mCurrentBranches[1].mMassLow - massD;
				branchMassesHigh[1] = mCurrentBranches[1].mMassHigh - massD;
				// sum of low and high
				if ( testAddTopologySet(branchMassesLow[1] + branchMassesLow[0], branchMassesHigh[1] + branchMassesHigh[0]) == -1 )
					break;

				// Begin: 2-branch-with-gap code block 1
                if ( ( this.mMaxBranchingNum < 3 ) && !this.mCheckGap ) // maximum number of branches = 2
                    continue; 
                // End: 2-branch-with-gap code block 1
                
                for (int kkk = kk; kkk < mCurrentTPSuperSetSize; kkk ++ ) { // 3rd branch
                	mCurrentBranches[2] = mTopologySuperSets.get(kkk);
    				branchMassesLow[2] = mCurrentBranches[2].mMassLow - massD * (1 + mMassAccuracyPP);
    				branchMassesHigh[2] = mCurrentBranches[2].mMassHigh - massD * (1 - mMassAccuracyPP);
    				
    				//Begin: 2-branch-with-gap code block 2
    				if ( this.mCheckGap && (this.mMaxBranchingNum < 3) )
    					testAddResult = testAddTopologySet_2BranchWithGap( branchMassesLow[1] + branchMassesLow[0], branchMassesHigh[1] + branchMassesHigh[0] );
    				else
    					testAddResult = testAddTopologySet( branchMassesLow[2] + branchMassesLow[1] + branchMassesLow[0], 
    														branchMassesHigh[2] + branchMassesHigh[1] + branchMassesHigh[0] );
                    //End: 2-branch-with-gap code block 2
                        
                    if ( testAddResult == -1 ) // no need to try further because too heavy.
                    	break;
                        
                    if ( this.mMaxBranchingNum < 4 ) // maximum number of branches = 3
                    	continue;
                        
                    for (int kkkk = kkk; kkkk < mCurrentTPSuperSetSize; kkkk++) { // 4th branch
                    	mCurrentBranches[3] = mTopologySuperSets.get(kkkk);
        				branchMassesLow[3] = mCurrentBranches[3].mMassLow - massD * (1 - mMassAccuracyPP);
        				branchMassesHigh[3] = mCurrentBranches[3].mMassHigh - massD * (1 + mMassAccuracyPP);
    					testAddResult = testAddTopologySet( branchMassesLow[3] + branchMassesLow[2] + branchMassesLow[1] + branchMassesLow[0], 
    														branchMassesHigh[3] + branchMassesHigh[2] + branchMassesHigh[1] + branchMassesHigh[0] );
                        if ( testAddResult == -1 ) // no need to try further because too heavy.
                            break;
                    }
					mCurrentBranches[3] = null;
                    branchMassesLow[3] = 0;
                    branchMassesHigh[3] = 0;
                }
                mCurrentBranches[2] = null;
                branchMassesLow[2] = 0;
                branchMassesHigh[2] = 0;
			}
			mCurrentBranches[1] = null;
			// default second branch and go to set next first branch
			branchMassesLow[1] = 0;
			branchMassesHigh[1] = 0;
		}
		mCurrentBranches[0] = null;
		branchMassesLow[0] = 0;
		branchMassesHigh[0] = 0;
	}

	// algorithm 2 -- reconstruct last peak
	public void reconstructFormulas() {

		CPeak lastPeak = mPeaks.get(mPeaks.size() - 1);
		HashSet<CTopologySuperSet> frontier = new HashSet<>(lastPeak.getInferredSuperSets());
		// put the last candidate's InferredSuperSets in.....
		HashSet<CTopologySuperSet> buffer = new HashSet<>(frontier);

		while (!frontier.isEmpty()) {
			ArrayList<CTopologySuperSet> newFrontier = new ArrayList<>();
			for (CTopologySuperSet tss : frontier) {
				for (CTopologySet ts : tss.mTopologySets) {
					ts.mTargetPeaks = tss.mTargetPeaks;
					newFrontier.addAll(Arrays.asList(ts.mBranches));
				}
			}
			newFrontier.removeIf(Objects::isNull); // remove nulls
			frontier = new HashSet<>(newFrontier);
			buffer.addAll(frontier);
		}

		// find all unique TSS that relevant to last peak.
		List<CTopologySuperSet> sortedUniqueTSS = new ArrayList<>(buffer);
		Collections.sort(sortedUniqueTSS);

		// reconstruct all ts from small to large
		// begin algorithm 2 (CandidateSetReconstructor()) for last peak
		for (CTopologySuperSet ts : sortedUniqueTSS) {
			ts.reconstructFormulas();
		}

		System.out.println("CGlycoDeNovo::reconstruct_formulas done!");
		// link all valid formula of TSS to peak
		for (CPeak peak : mPeaks) {
			// get all valid peak
			peak.getInferredSuperSets().removeIf(e -> !e.mLegal);
			if (peak.getInferredSuperSets().isEmpty())
				continue;
			peak.getInferredSuperSets().forEach(e -> Collections.sort(e.mTopologies));
			// need to sort the mTopologies to make sure that all formula will
			// be in correct order (number of peak (large -> small), String
			// sorted order)
			Map<String, CTopology> formulaToTSS = new HashMap<>();
			// make sure there is only a unique result for each formula
			for (CTopologySuperSet superSet : peak.getInferredSuperSets()) {
				for (CTopology mTopology : superSet.mTopologies) {
					formulaToTSS.putIfAbsent(mTopology.mFormula, mTopology);
				}
			}

			peak.setInferredFormulas(new ArrayList<>(formulaToTSS.keySet()));
			peak.setInferredTopologies(new ArrayList<CTopology>(formulaToTSS.values()));
			int size = peak.getInferredFormulas().size();
			peak.setInferredMasses(new ArrayList<>(size));
			peak.setInferredScores(new ArrayList<>(size));
			peak.setInferredGWAFormulas(new ArrayList<>(size));

			for (String formula : peak.getInferredFormulas()) {
				peak.getInferredMasses().add(formulaToTSS.get(formula).mMass);
				peak.getInferredScores().add(formulaToTSS.get(formula).mSupportPeaks.size());
				//peak.getInferredGWAFormulas().add("freeEnd--?" + formulaToTSS.get(formula).mGWAFormula.substring(3));
				peak.getInferredGWAFormulas().add( formulaToTSS.get(formula).mGWAFormula );
			}
		}
		
		List<String> formula = mPeaks.get(mPeaks.size()-1).getInferredFormulas();
		if ( formula == null || formula.size() == 0 )
			System.out.println("Failed to reconstruct topologies.");
		else
		{
			System.out.printf("Reconstruct %d topologies.\n", formula.size());
			for ( String s : formula )
				System.out.println( s );
		}
	}

	// step 6 - 8
	private int testAddTopologySet(double massCompensationLow, double massCompensationHigh) {
		int result = 0;

		// Check if the branches together are already too heavy or still too light
		double temp = mCurrentTargetMass - massCompensationLow;
		if ( this.mPermethylated ) {
			if (temp < 160)
				return -1; // too light
			if (mCheckGap) {
				if (temp > 860) // max( permethylated this.mDelta2.B2C )
					return 0;
			} else if (temp > 420) // max( permethylated this.mDelta.B2C )
				return 0;
		} else {
			if (temp < 105)
				return -1; // too light
			if (mCheckGap) {
				if (temp > 660) // max( unpermethylated this.mDelta2.B2C )
					return 0;
			} else if (temp > 335) // max( unpermethylated this.mDelta.B2C )
				return 0;
		}

		// record unitIndexes and whether each is a minusH result
		ArrayList<Integer> unitIndexes = new ArrayList<Integer>();
		ArrayList<Integer> minusHCount = new ArrayList<Integer>();
		ArrayList<Double> lowMasses = new ArrayList<Double>();
		ArrayList<Double> highMasses = new ArrayList<Double>();
		double theoreticalMassLow, theoreticalMassHigh;
		CTopologySet newTS;
		CMonosaccharide newUnit;

		// B2B: try to interpret as a B-ion by adding one monosaccharide to a B-ion
		for (int k = 0; k < mDelta.B2B.mass.length; k++) {
			// Begin 2019/09/15. Move from "for (int a = 0; a < unitIndexes.size(); a++)" to here
			newUnit = mDelta.B2B.unit[k];
			if ( !this.acceptable_monosaccharide( newUnit.mClass ) || (newUnit.mClassID == 2 && !mLeafPeak) || 
					mCompositionCountThreshold[newUnit.mClassID - 1] < 1)
				continue;
			// End 2019/09/15. Move from "for (int a = 0; a < unitIndexes.size(); a++)" to here
			
			theoreticalMassLow = mDelta.B2B.mass[k] + massCompensationLow;
			theoreticalMassHigh = mDelta.B2B.mass[k] + massCompensationHigh;
			// Begin 2019/09/15. Replaced by the conditional check below.
			// if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh )
			// End 2019/09/15.
			if ( this.mCurrentTargetMassHigh > theoreticalMassLow && this.mCurrentTargetMassLow < theoreticalMassHigh ) {
				unitIndexes.add(k);
				minusHCount.add(0);
				lowMasses.add( theoreticalMassLow );
				highMasses.add( theoreticalMassHigh );
			}
			else if (mCheckMinus2H) { // 2019/09/15. Move from below to here
				if ( this.mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
					&& this.mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh ) {
					unitIndexes.add(k);
					minusHCount.add(2);
					lowMasses.add( theoreticalMassLow );
					highMasses.add( theoreticalMassHigh );
				}
			}
		}
		
		/* 2019/09/15. Moved to the above. See "else if (mCheckMinus2H) ..."
		// if allow to check "-2H", search for results of adding "2H" to the current peak
		if (mCheckMinus2H) {
			for (int k = 0; k < mDelta.B2B.mass.length; k++) {
				theoreticalMassLow = mDelta.B2B.mass[k] + massCompensationLow;
				theoreticalMassHigh = mDelta.B2B.mass[k] + massCompensationHigh;
				if ( mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
						&& mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh ) {
					unitIndexes.add(k);
					minusHCount.add(2);
				}
			}
		}
		*/
		
		int unitID, countH;
		String ionType;
		for (int a = 0; a < unitIndexes.size(); a++) {
			unitID = unitIndexes.get(a);
			countH = minusHCount.get(a);
			if (mFinalPeak)
				ionType = "T";
			else
				ionType = "B";
			newTS = new CTopologySet( ionType, mCurrentTargetMass, lowMasses.get(a), highMasses.get(a),
								mDelta.B2B.unit[unitID], mCurrentBranches, this, countH );
			insertIntoCurrentTSS( newTS );
			result = 1;
		}
		
		/* 2019/09/15. Simplified as the above.
		int unitID, countH;
		double massH = 0;
		String ionType;
		for (int a = 0; a < unitIndexes.size(); a++) {
			unitID = unitIndexes.get(a);
			newUnit = mDelta.B2B.unit[unitID];
			double tempMassLow = mDelta.B2B.mass[unitID] + massCompensationLow;
			double tempMassHigh = mDelta.B2B.mass[unitID] + massCompensationHigh;
			if ( !this.acceptable_monosaccharide( newUnit.mClass ) || (newUnit.mClassID == 2 && !mLeafPeak) || 
					mCompositionCountThreshold[newUnit.mClassID - 1] < 1)
				continue;
			
			countH = minusHCount.get(a);
            massH = countH * CMass.H;
			if (mFinalPeak)
				ionType = "T";
			else
				ionType = "B";
			newTS = new CTopologySet( ionType, mCurrentTargetMass,
								Math.max(tempMassLow, mCurrentTargetMassLow + massH),
								Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
								newUnit, mCurrentBranches, this, countH );
			insertIntoCurrentTSS( newTS );
			result = 1;
		}
		*/

		boolean failed = (unitIndexes.size() == 0);

		
		// B2C: try to interpret as a B-ion by adding one monosaccharide + H2O to a B-ion, search in mDelta.B2C.mass.
		if (mTryCIon) {
			unitIndexes.clear();
			minusHCount.clear();
			lowMasses.clear();
			highMasses.clear();
			
			for (int k = 0; k < mDelta.B2C.mass.length; k++) {
				// Begin 2019/09/15. Move from "for (int a = 0; a < unitIndexes.size(); a++)" to here
				newUnit = mDelta.B2C.unit[k];
				if ( !this.acceptable_monosaccharide( newUnit.mClass ) || (newUnit.mClassID == 2 && !mLeafPeak) || 
						mCompositionCountThreshold[newUnit.mClassID - 1] < 1)
					continue;
				// End 2019/09/15. Move from "for (int a = 0; a < unitIndexes.size(); a++)" to here

				theoreticalMassLow = mDelta.B2C.mass[k] + massCompensationLow;
				theoreticalMassHigh = mDelta.B2C.mass[k] + massCompensationHigh;
				if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh) {
					unitIndexes.add(k);
					minusHCount.add(0);
					lowMasses.add( theoreticalMassLow );
					highMasses.add( theoreticalMassHigh );
				}
				else if (mCheckMinus2H) { // 2019/09/15 Move from below to here
					if ( this.mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
						&& this.mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh ) {
						unitIndexes.add(k);
						minusHCount.add(2);
						lowMasses.add( theoreticalMassLow );
						highMasses.add( theoreticalMassHigh );
					}
				}
			}
			
			/* 2019/09/15. Moved to the above. See "else if (mCheckMinus2H) ..."
			// if allow to check "-2H", search for results of adding "2H" to the current peak
			if (mCheckMinus2H) {
				for (int k = 0; k < mDelta.B2B.mass.length; k++) {
					theoreticalMassLow = mDelta.B2C.mass[k] + massCompensationLow;
					theoreticalMassHigh = mDelta.B2C.mass[k] + massCompensationHigh;
					if ( mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
							&& mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh ) {
						unitIndexes.add(k);
						minusHCount.add(2);
					}
				}
			}
			*/

			for (int a = 0; a < unitIndexes.size(); a++) {
				unitID = unitIndexes.get(a);
				countH = minusHCount.get(a);
				newTS = new CTopologySet( "C", mCurrentTargetMass, 
									lowMasses.get(a) - CMass.H2O, highMasses.get(a) - CMass.H2O, // use its B-ion mass that help group topologysets and facilitate reconstruction.
									mDelta.B2C.unit[unitID], mCurrentBranches, this, countH );
				insertIntoCurrentTSS( newTS );
				result = 1;
			}
			
			/*
			double massH;
			for (int a = 0; a < unitIndexes.size(); a++) {
				unitID = unitIndexes.get(a);
				newUnit = mDelta.B2C.unit[unitID];
				double tempMassLow = mDelta.B2C.mass[unitID] + massCompensationLow;
				double tempMassHigh = mDelta.B2C.mass[unitID] + massCompensationHigh;
				if ( !this.acceptable_monosaccharide( newUnit.mClass ) || (newUnit.mClassID == 2 && !mLeafPeak) || 
						mCompositionCountThreshold[newUnit.mClassID - 1] < 1)
					continue;
				
				countH = minusHCount.get(a);
	            massH = countH * CMass.H;
				newTS = new CTopologySet( "C", mCurrentTargetMass,
									Math.max(tempMassLow, mCurrentTargetMassLow + massH) - CMass.H2O, // Although it is C-ion, we use its B-ion mass in interpreting peaks.
									Math.min(tempMassHigh, mCurrentTargetMassHigh + massH) - CMass.H2O, 
									newUnit, mCurrentBranches, this, countH );
				insertIntoCurrentTSS( newTS );
				result = 1;
			}
			*/
		}
		
		failed = failed && (unitIndexes.size() == 0);

		// if the above failed to obtain any interpretation and we allow "gap", 
		// find gap-mono, this part is almost the same as the above. 
		if (failed && mCheckGap) {
			if (mCurrentBranches[1] == null && mCurrentBranches[0] != null) {
				boolean possible = false;
				for (CTopologySet aTPS : mCurrentBranches[0].mTopologySets) {
					if (aTPS.mRootMono.mClassID != 2) {
						possible = true;
						break;
					}
				}
				if (!possible)
					return 0;
			}
			unitIndexes.clear();
			minusHCount.clear();
			lowMasses.clear();
			highMasses.clear();
			
			// B2B with gap
			for (int k = 0; k < mDelta2.B2B.len; k++) {
				theoreticalMassLow = mDelta2.B2B.mass[k] + massCompensationLow;
				theoreticalMassHigh = mDelta2.B2B.mass[k] + massCompensationHigh;
				if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh) {
					unitIndexes.add(k);
					minusHCount.add(0);
					lowMasses.add( theoreticalMassLow );
					highMasses.add( theoreticalMassHigh );
				}
				else if (mCheckMinus2H) {
					if (mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
						&& mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh) {
						unitIndexes.add(k);
						minusHCount.add(2);
						lowMasses.add( theoreticalMassLow );
						highMasses.add( theoreticalMassHigh );
					}
				}
			}
			
			/* 2019/09/15. Moved to the above. See "else if (mCheckMinus2H) ..."
			// if allow to check "-2H", search for results of adding "2H" to the current peak
			if (mCheckMinus2H) {
				for (int k = 0; k < mDelta2.B2B.len; k++) {
					theoreticalMassLow = mDelta2.B2B.mass[k] + massCompensationLow;
					theoreticalMassHigh = mDelta2.B2B.mass[k] + massCompensationHigh;
					if (mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
							&& mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh) {
						unitIndexes.add(k);
						minusHCount.add(2);
						lowMasses.add( theoreticalMassLow );
						highMasses.add( theoreticalMassHigh );
					}
				}
			}
			*/
			
			CMonosaccharide newUnit1, newUnit2;
			double massH;
			for (int a = 0; a < unitIndexes.size(); a++) {
				unitID = unitIndexes.get(a);
				newUnit1 = mDelta2.B2B.unit[unitID][0];
				if (newUnit1.mClassID == 2) // Rule: Fuc can only be a branch, not in a linear substructure.
					continue;
				newUnit2 = mDelta2.B2B.unit[unitID][1];
				
				//double tempMassLow = mDelta2.B2B.mass[unitID] + massCompensationLow;
				//double tempMassHigh = mDelta2.B2B.mass[unitID] + massCompensationHigh;

				countH = minusHCount.get(a);
	            massH = countH * CMass.H;
				if (mFinalPeak)
					ionType = "T";
				else
					ionType = "B";

				newTS = new CTopologySet( ionType, mCurrentTargetMass, 
										lowMasses.get(a), highMasses.get(a),
										newUnit2, newUnit1, mCurrentBranches, this, countH );
				
				/* 2019/09/16. Replaced by the above
				newTS = new CTopologySet( ionType, mCurrentTargetMass,
										Math.max(tempMassLow, mCurrentTargetMassLow + massH),
										Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
										newUnit2, newUnit1, mCurrentBranches, this, countH );
				*/
				
				insertIntoCurrentTSS(newTS);
				result = 1;
				
				// loop through mCurrentBranches and add the gap to each branch to create a new topologyset.
				for (int idxGapInBranch = 0; idxGapInBranch < 4; idxGapInBranch++) { // b indicate "gapInBranch"
					if (mCurrentBranches[idxGapInBranch] == null)
						break;
					
					newTS = new CTopologySet( ionType, mCurrentTargetMass, 
							lowMasses.get(a), highMasses.get(a),
							newUnit2, newUnit1, idxGapInBranch, mCurrentBranches, this, countH );
					/* 2019/09/16. Replaced by the above
					newTS = new CTopologySet( ionType, mCurrentTargetMass,
							Math.max(tempMassLow, mCurrentTargetMassLow + massH),
							Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
							newUnit2, newUnit1, idxGapInBranch, mCurrentBranches, this, countH );
					*/
					
					insertIntoCurrentTSS(newTS);
				}
			}
			
			// Try B2C, search in mDelta2.B2C.mass
			if (mTryCIon && !mFinalPeak) {
				unitIndexes.clear();
				minusHCount.clear();
				lowMasses.clear();
				highMasses.clear();

				for (int k = 0; k < mDelta2.B2C.len; k++) {
					theoreticalMassLow = mDelta2.B2C.mass[k] + massCompensationLow;
					theoreticalMassHigh = mDelta2.B2C.mass[k] + massCompensationHigh;
					if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh ) {
						unitIndexes.add(k);
						minusHCount.add(0);
						lowMasses.add( theoreticalMassLow );
						highMasses.add( theoreticalMassHigh );
					}
					else if (mCheckMinus2H) {
						if (mCurrentTargetMassHigh - CMass.H2 > theoreticalMassLow && mCurrentTargetMassLow - CMass.H2 < theoreticalMassHigh) {
							unitIndexes.add(k);
							minusHCount.add(2);
							lowMasses.add( theoreticalMassLow );
							highMasses.add( theoreticalMassHigh );
						}
					}
				}
				
				/* 2019/09/16. Moved to the above see "else if (mCheckMinus2H)"
				if (mCheckMinus2H) {
					for (int k = 0; k < mDelta2.B2C.len; k++) {
						theoreticalMassLow = mDelta2.B2C.mass[k] + massCompensationLow;
						theoreticalMassHigh = mDelta2.B2C.mass[k] + massCompensationHigh;
						if (mCurrentTargetMassHigh - CMass.H2 > theoreticalMassLow && mCurrentTargetMassLow - CMass.H2 < theoreticalMassHigh) {
							unitIndexes.add(k);
							minusHCount.add(2);
						}
					}
				}
				*/

				for (int a = 0; a < unitIndexes.size(); a++) {
					unitID = unitIndexes.get(a);
					newUnit1 = mDelta2.B2C.unit[unitID][0];
					if (newUnit1.mClassID == 2) // Rule: Fuc can only be a branch, not in a linear substructure.
						continue;

					newUnit2 = mDelta2.B2C.unit[unitID][1];
					
					/* 2019/09/16. Replaced by lowMasses and highMasses
					double tempMassLow = mDelta2.B2C.mass[unitID] + massCompensationLow;
					double tempMassHigh = mDelta2.B2C.mass[unitID] + massCompensationHigh;
					*/

					countH = minusHCount.get(a);
		            //massH = countH * CMass.H;
					newTS = new CTopologySet( "C", mCurrentTargetMass, 
							lowMasses.get(a) - CMass.H2O, highMasses.get(a) - CMass.H2O, // Although it is C-ion, we use its B-ion mass in interpreting peaks.
							newUnit2, newUnit1, mCurrentBranches, this, countH );
					/* 2019/09/16. Replaced by the above
					newTS = new CTopologySet("C", mCurrentTargetMass,
							Math.max(tempMassLow, mCurrentTargetMassLow + massH) - CMass.H2O, // Although it is C-ion, we use its B-ion mass in interpreting peaks.
							Math.min(tempMassHigh, mCurrentTargetMassHigh + massH) - CMass.H2O, 
							newUnit2, newUnit1, mCurrentBranches, this, countH);
					*/
					insertIntoCurrentTSS( newTS );
					result = 1;

					for (int idxGapInBranch = 0; idxGapInBranch < 4; idxGapInBranch++) {
						if (mCurrentBranches[idxGapInBranch] == null)
							break;
						newTS = new CTopologySet( "C", mCurrentTargetMass, 
								lowMasses.get(a) - CMass.H2O, highMasses.get(a) - CMass.H2O,
								newUnit2, newUnit1, idxGapInBranch, mCurrentBranches, this, countH );
						/* 2019/09/16. Replaced by the above
						newTS = new CTopologySet("C", mCurrentTargetMass,
								Math.max(tempMassLow, mCurrentTargetMassLow + massH) - CMass.H2O,
								Math.min(tempMassHigh, mCurrentTargetMassHigh + massH) - CMass.H2O, 
								newUnit2, newUnit1, idxGapInBranch, mCurrentBranches, this, countH );
						*/
						insertIntoCurrentTSS( newTS );
					}
				}
			}
		}

		return result;
	}
	
    private int testAddTopologySet_2BranchWithGap(double massCompensationLow, double massCompensationHigh) {
        int result = 0;
        double linkageMassLoss = CMass.H2O + 3 * (mPermethylated ? 1 : 0) * CMass.CH2;
        
        // Check if the branches together are already too heavy or still too light
        double temp = mCurrentTargetMass - massCompensationLow;
        if ( mPermethylated ) {
            if (temp < 160)
                return -1; // too heavy
            if ( mCheckGap ) {
                if ( temp > 860 ) // ~ two max( mDelta2.B2C )
                    return 0;
            }
            else if ( temp > 420 ) // max( obj.mDelta.B2C )
                return 0;
        }
        else {
            if ( temp < 105 )
                return -1;
            if ( mCheckGap ) {
                if ( temp > 660 ) // ~ two max( obj.mDelta2.B2C )
                    return 0;
            }
            else if ( temp > 335 ) // max( obj.mDelta.B2C )
                return 0;
        }
        
        // Allow 1 gap only when no-gap fails
        if ( mCheckGap ) {
            boolean possible = false;
            if ( (mCurrentBranches[2] == null) && (mCurrentBranches[1] != null) ) {
                for (CTopologySet aTS : mCurrentBranches[1].mTopologySets ) {
                    if ( aTS.mRootMono.mClassID != 2 ) {
                        possible = true;
                        break;
                    }
                }
            }
            if ( !possible )
            	return 0;
        }

        // record unitIndexes and whether each is a minusH result
        ArrayList<Integer> unitIndexes = new ArrayList<Integer>();
        ArrayList<Integer> minusHCount = new ArrayList<Integer>();
        ArrayList<Double> massLow = new ArrayList<Double>();
        ArrayList<Double> massHigh = new ArrayList<Double>();
        double theoreticalMassLow, theoreticalMassHigh;
        CTopologySet newTS;

        // B2B: try to interpret as a B-ion by adding one monosaccharide to a B-ion
        for (int k = 0; k < mDelta2.B2B.mass.length; k++) {
        	theoreticalMassLow = mDelta2.B2B.mass[k] + massCompensationLow;
        	theoreticalMassHigh = mDelta2.B2B.mass[k] + massCompensationHigh;
        	if (mCurrentTargetMassHigh > theoreticalMassLow && mCurrentTargetMassLow < theoreticalMassHigh) {
        		unitIndexes.add( k );
        		minusHCount.add( 0 );
        		massLow.add( theoreticalMassLow );
        		massHigh.add( theoreticalMassHigh );
        	}
        }

        // if allow to check "-2H", search for results of adding "2H" to the current peak
        if ( !mFinalPeak && mCheckMinus2H) {
        	for (int k = 0; k < mDelta.B2B.mass.length; k++) {
        		theoreticalMassLow = mDelta2.B2B.mass[k] + massCompensationLow;
        		theoreticalMassHigh = mDelta2.B2B.mass[k] + massCompensationHigh;
        		if ( mCurrentTargetMassHigh + CMass.H2 > theoreticalMassLow
        			&& mCurrentTargetMassLow + CMass.H2 < theoreticalMassHigh ) {
        			unitIndexes.add( k );
        			minusHCount.add( 2 );
            		massLow.add( theoreticalMassLow );
            		massHigh.add( theoreticalMassHigh );
        		}
        	}
        }

        if ( unitIndexes.size() > 0 )
        	result = 1;
        
        int unitID, countH;
        double massH = 0;
		CMonosaccharide newUnit1, newUnit2;
        String ionType;
        
		for (int a = 0; a < unitIndexes.size(); a++) {
			unitID = unitIndexes.get(a);
			newUnit1 = mDelta2.B2B.unit[unitID][0];
			if (newUnit1.mClassID == 2) // Rule: Fuc can only be a branch, not in a linear substructure.
				continue;
			newUnit2 = mDelta2.B2B.unit[unitID][1];
			
			double tempMassLow = mDelta2.B2B.mass[unitID] + massCompensationLow;
			double tempMassHigh = mDelta2.B2B.mass[unitID] + massCompensationHigh;

			countH = minusHCount.get(a);
            massH = countH * CMass.H;
			if (mFinalPeak)
				ionType = "T";
			else
				ionType = "B";

			newTS = new CTopologySet( ionType, mCurrentTargetMass,
									Math.max(tempMassLow, mCurrentTargetMassLow + massH),
									Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
									newUnit2, newUnit1, mCurrentBranches, this, countH );
			insertIntoCurrentTSS(newTS);
			
			for (int b = 0; b < 4; b++) {
				if (mCurrentBranches[b] == null)
					break;
				newTS = new CTopologySet( ionType, mCurrentTargetMass,
						Math.max(tempMassLow, mCurrentTargetMassLow + massH),
						Math.min(tempMassHigh, mCurrentTargetMassHigh + massH), 
						newUnit2, newUnit1, b, mCurrentBranches, this, countH );
				insertIntoCurrentTSS(newTS);
			}
		}
    	
   		CTopologySet gapTS;
   		CTopologySuperSet gapSS;
   		for (int a = 0; a < unitIndexes.size(); a++) {
   			unitID = unitIndexes.get(a);
   			newUnit1 = mDelta2.B2B.unit[unitID][0];
   			if (newUnit1.mClassID == 2)  // Rule: Fuc can only be a branch, not in a linear substructure.
   				continue;
   			newUnit2 = mDelta2.B2B.unit[unitID][1];

   			countH = minusHCount.get(a);
   			massH = countH * CMass.H;

   			double tempMassLow = Math.max(mDelta2.B2B.mass[unitID] + massCompensationLow, mCurrentTargetMassLow + massH);
   			double tempMassHigh = Math.min(mDelta2.B2B.mass[unitID] + massCompensationHigh, mCurrentTargetMassHigh + massH);

   			// Need to create a gapBranch. There are 3 branches in mCurrentBranches[].
   			// So there are 3 possiblities: (a) [[1 2]+gapMono 3], [[1 3]+gapMono 2], [[2 3]+gapMono 1]   			
   			
   			// Case [[1 2]+gapMono 3]:
   			gapTS = new CTopologySet("B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit1, mCurrentBranches, this, countH );   			
   			gapTS.mBranches[2] = null;
   			gapTS.mMassPeak -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[2].mMassPeak - CMass.Proton); // remove the mass of the 3rd branch.
   			gapTS.mMassLow -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[2].mMassLow - CMass.Proton); // remove the mass of the 3rd branch.
   			gapTS.mMassHigh -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[2].mMassHigh - CMass.Proton); // remove the mass of the 3rd branch.

            gapSS = new CTopologySuperSet("B", gapTS.mMassPeak, this, this.mCurrentPeakIdx);
            gapSS.mMassHigh = gapTS.mMassHigh;
            gapSS.mMassLow = gapTS.mMassLow;
            gapSS.mTopologySets.add( gapTS );
                
            newTS = new CTopologySet( "B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit2, this.mCurrentBranches, this, countH );
            newTS.mBranches[0] = gapSS;
            newTS.mBranches[1] = mCurrentBranches[2];
            newTS.mBranches[2] = null;
                
            if ( mFinalPeak ) {
            	newTS.mType = "T";
                newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 23);
            } else {
            	newTS.mType = "B";
            	newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 21);
            }
            this.insertIntoCurrentTSS( newTS );
            
            if ( this.mCurrentBranches[1] != this.mCurrentBranches[2] ) {
            	// Case [[1 3]+gapMono 2]:
            	gapTS = new CTopologySet("B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit1, mCurrentBranches, this, countH );   			
            	gapTS.mBranches[1] = mCurrentBranches[2];
            	gapTS.mBranches[2] = null;
            	gapTS.mMassPeak -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[1].mMassPeak - CMass.Proton); // remove the mass of the 3rd branch.
            	gapTS.mMassLow -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[1].mMassLow - CMass.Proton); // remove the mass of the 3rd branch.
            	gapTS.mMassHigh -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[1].mMassHigh - CMass.Proton); // remove the mass of the 3rd branch.

            	gapSS = new CTopologySuperSet("B", gapTS.mMassPeak, this, this.mCurrentPeakIdx);
            	gapSS.mMassHigh = gapTS.mMassHigh;
            	gapSS.mMassLow = gapTS.mMassLow;
            	gapSS.mTopologySets.add( gapTS );

            	newTS = new CTopologySet( "B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit2, this.mCurrentBranches, this, countH );
            	newTS.mBranches[0] = gapSS;
            	newTS.mBranches[1] = mCurrentBranches[1];
            	newTS.mBranches[2] = null;

            	if ( mFinalPeak ) {
            		newTS.mType = "T";
            		newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 23);
            	} else {
            		newTS.mType = "B";
            		newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 21);
            	}
            	this.insertIntoCurrentTSS( newTS );

            	if ( this.mCurrentBranches[0] != this.mCurrentBranches[1] ) {
            		// Case [[2 3]+gapMono 1]:
            		gapTS = new CTopologySet("B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit1, mCurrentBranches, this, countH );
            		gapTS.mBranches[0] = mCurrentBranches[1];
            		gapTS.mBranches[1] = mCurrentBranches[2];
            		gapTS.mBranches[2] = null;
            		gapTS.mMassPeak -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassPeak - CMass.Proton); // remove the mass of the 3rd branch.
            		gapTS.mMassLow -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassLow - CMass.Proton); // remove the mass of the 3rd branch.
            		gapTS.mMassHigh -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassHigh - CMass.Proton); // remove the mass of the 3rd branch.

            		gapSS = new CTopologySuperSet("B", gapTS.mMassPeak, this, this.mCurrentPeakIdx);
            		gapSS.mMassHigh = gapTS.mMassHigh;
            		gapSS.mMassLow = gapTS.mMassLow;
            		gapSS.mTopologySets.add( gapTS );

            		newTS = new CTopologySet( "B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit2, this.mCurrentBranches, this, countH );
            		newTS.mBranches[0] = gapSS;
            		newTS.mBranches[1] = mCurrentBranches[0];
            		newTS.mBranches[2] = null;

            		if ( mFinalPeak ) {
            			newTS.mType = "T";
            			newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 23);
            		} else {
            			newTS.mType = "B";
            			newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 21);
            		}
            		this.insertIntoCurrentTSS( newTS );
            	}
            }
            else if ( this.mCurrentBranches[0] != this.mCurrentBranches[1] ) { // Don't need [[1 3]+gapMono 2]:
            	// Case [[2 3]+gapMono 1]:
        		gapTS = new CTopologySet("B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit1, mCurrentBranches, this, countH );
        		gapTS.mBranches[0] = mCurrentBranches[1];
        		gapTS.mBranches[1] = mCurrentBranches[2];
        		gapTS.mBranches[2] = null;
        		gapTS.mMassPeak -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassPeak - CMass.Proton); // remove the mass of the 3rd branch.
        		gapTS.mMassLow -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassLow - CMass.Proton); // remove the mass of the 3rd branch.
        		gapTS.mMassHigh -= (newUnit2.mMass - linkageMassLoss) - (mCurrentBranches[0].mMassHigh - CMass.Proton); // remove the mass of the 3rd branch.

        		gapSS = new CTopologySuperSet("B", gapTS.mMassPeak, this, this.mCurrentPeakIdx);
        		gapSS.mMassHigh = gapTS.mMassHigh;
        		gapSS.mMassLow = gapTS.mMassLow;
        		gapSS.mTopologySets.add( gapTS );

        		newTS = new CTopologySet( "B", mCurrentTargetMass, tempMassLow, tempMassHigh, newUnit2, this.mCurrentBranches, this, countH );
        		newTS.mBranches[0] = gapSS;
        		newTS.mBranches[1] = mCurrentBranches[0];
        		newTS.mBranches[2] = null;

        		if ( mFinalPeak ) {
        			newTS.mType = "T";
        			newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 23);
        		} else {
        			newTS.mType = "B";
        			newTS.mTargetPeaks.put(this.mCurrentPeakIdx, 21);
        		}
        		this.insertIntoCurrentTSS( newTS );
            }
   		}
   		
   		return result;
    }

	// step 11
	private void insertIntoCurrentTSS(CTopologySet newSet) {
		// Add a new CTopologySet newSet to a CTopologySuperSet of the same mass and same type in this.mTopologySuperSets. 
		// Create a new CTopologySuperSet if necessary.

		CTopologySuperSet tss = null;
		if (newSet.mType.equals("B") || newSet.mType.equals("T")) { // insert as B ions
			if (newSet.mMinusH == 0) {
				if (mCurrentTopologySuperSetB == null) 
					mCurrentTopologySuperSetB = new CTopologySuperSet(newSet.mType, mCurrentTargetMass, this, mCurrentPeakIdx);
				if ( newSet.mType.equals("B") )
					mCurrentTopologySuperSetB.mTargetPeaks.put(mCurrentPeakIdx, 1);
				else
					mCurrentTopologySuperSetB.mTargetPeaks.put(mCurrentPeakIdx, 3);
				tss = mCurrentTopologySuperSetB;
			} else if (newSet.mMinusH == 2) {
				// let ion type be 21 23 to indicate this ion is an ion with -2H
				if (mCurrentTopologySuperSetB2 == null) {
					mCurrentTopologySuperSetB2 = new CTopologySuperSet(newSet.mType, mCurrentTargetMass, this, mCurrentPeakIdx);
					if ( newSet.mType.equals("T") )
						mCurrentTopologySuperSetB2.mTargetPeaks.put(mCurrentPeakIdx, 23);
					else
						mCurrentTopologySuperSetB2.mTargetPeaks.put(mCurrentPeakIdx, 21);
				}
				tss = mCurrentTopologySuperSetB2;
			}
		} else if (newSet.mType.equals("C")) {
			// insert as C ion
			if (newSet.mMinusH == 0) {
				if (mCurrentTopologySuperSetC == null)
					mCurrentTopologySuperSetC = new CTopologySuperSet(newSet.mType, mCurrentTargetMass, this, mCurrentPeakIdx);
				mCurrentTopologySuperSetC.mTargetPeaks.put(mCurrentPeakIdx, 2);
				tss = mCurrentTopologySuperSetC;
			} else if (newSet.mMinusH == 2) {
				// let ion type be 22 to indicate -2H
				if (mCurrentTopologySuperSetC2 == null) {
					mCurrentTopologySuperSetC2 = new CTopologySuperSet(newSet.mType, mCurrentTargetMass, this, mCurrentPeakIdx);
					mCurrentTopologySuperSetC2.mTargetPeaks.put(mCurrentPeakIdx, 22);
				}
				tss = mCurrentTopologySuperSetC2;
			}
		} else
			throw new InvalidParameterException("wrong mtype");

		tss.addATopologySet(newSet);
	}

	// possible mass difference between two type of ion with gap
	class Delta2 {
		Link2 B2B;
		Link2 B2C;
		Link2 C2C;
		Link2 C2B;

		// numClass is cMonosaccharideClasses.length here
		private Delta2(int numClass, boolean permethylated) {
			double perMassLoss = 2 * (permethylated? 1 : 0) * CMass.CH2; // If not the root unit, lose two CH2s when permethylated
			double linkageMassLoss = CMass.H2O + perMassLoss;
			B2B = new Link2(numClass * numClass);
			B2C = new Link2(numClass * numClass);
			C2C = new Link2(numClass * numClass);
			C2B = new Link2(numClass * numClass);
			int index = 0;
			for (int i = 0; i < numClass; i++) {
				CMonosaccharide mono1 = cMonosaccharideArrays[i];
				for (int j = 0; j < numClass; j++) {
					CMonosaccharide mono2 = cMonosaccharideArrays[j];
					if (!cLegalGlycosidicBonds[i][j]) {
						continue;
					}
					// add 1 CGlycoDeNovo.cMonosaccharideClasses(k) to form a
					// B-ion
					B2B.mass[index] = mono1.mMass + mono2.mMass - 2 * linkageMassLoss;
					B2B.unit[index][0] = mono1; // mono.copy;
					B2B.unit[index][1] = mono2;

					// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a
					// C-ion
					B2C.mass[index] = mono1.mMass + mono2.mMass - linkageMassLoss + CMass.H2O;
					B2C.unit[index][0] = mono1; // mono.copy;
					B2C.unit[index][1] = mono2;

					// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a
					// B-ion
					C2B.mass[index] = mono1.mMass + mono2.mMass - CMass.H2O - 2 * linkageMassLoss;
					C2B.unit[index][0] = mono1; // mono.copy;
					C2B.unit[index][1] = mono2; // mono.copy;

					// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a
					// C-ion
					C2C.mass[index] = mono1.mMass - linkageMassLoss * 2;
					C2C.unit[index][0] = mono1; // mono.copy;
					C2C.unit[index][1] = mono2; // mono.copy;
					index++;
				}
				B2B.len = index;
				B2C.len = index;
				C2B.len = index;
				C2C.len = index;
			}
		}
	}
	// possible mass difference between two type of ion with no gap

	class Delta {
		Link B2B;
		Link B2C;
		Link C2C;
		Link C2B;

		// numClass is cMonosaccharideClasses.length here
		private Delta(int numClass, boolean permethylated) {
			double perMassLoss = 2 * (permethylated ? 1 : 0) * CMass.CH2; // If not the root unit, lose two CH2s when permethylated
			double linkageMassLoss = CMass.H2O + perMassLoss;
			B2B = new Link(numClass);
			B2C = new Link(numClass);
			C2C = new Link(numClass);
			C2B = new Link(numClass);
			for (int i = 0; i < numClass; i++) {
				CMonosaccharide mono = cMonosaccharideArrays[i];

				// add 1 CGlycoDeNovo.cMonosaccharideClasses(k) to form a B-ion
				B2B.mass[i] = mono.mMass - linkageMassLoss;
				B2B.unit[i] = mono; // mono.copy;

				// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a C-ion
				B2C.mass[i] = mono.mMass - perMassLoss;
				B2C.unit[i] = mono; // mono.copy;

				// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a B-ion
				C2B.mass[i] = mono.mMass - CMass.H2O - linkageMassLoss;
				C2B.unit[i] = mono; // mono.copy;

				// add 1 CGlycoDeNovo.cMonosaccharideClasses[k] to form a C-ion
				C2C.mass[i] = mono.mMass - CMass.H2O - perMassLoss;
				C2C.unit[i] = mono; // mono.copy;
			}
		}
	}

	// mass / Monosaccharide info of ion link for B C ion
	class Link {
		double[] mass;
		CMonosaccharide[] unit;

		private Link(int numClass) {
			mass = new double[numClass];
			unit = new CMonosaccharide[numClass];
		}
	}

	class Link2 {
		double[] mass;
		CMonosaccharide[][] unit;
		int len;

		private Link2(int numClass) {
			mass = new double[numClass];
			unit = new CMonosaccharide[numClass][2];
		}
	}
}
>>>>>>> .r3632
