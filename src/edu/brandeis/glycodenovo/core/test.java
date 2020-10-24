package edu.brandeis.glycodenovo.core;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class test {
	public static void main(String[] args) throws Exception {
		String dataset = "20200618";
		String datapath = "C:\\Users\\nxy\\Desktop\\Brandeis\\data" + dataset + File.separator;
		File dir = new File(datapath);
		File[] files = dir.listFiles(new FilenameFilter( ) {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
		CSpectrum[] specSet = new CSpectrum[files.length];
		for (int i = 0; i < files.length; i++) {
			String filename = datapath + files[i].getName();
			System.out.println("Loading " + filename);
			specSet[i] = new CSpectrum(filename);
		}
		System.out.println("Done loading raw data ...");
		//activate mass2composition
		CMass2Composition m2c = new CMass2Composition();
		//TODO: load mat file
		m2c.load("m2c.mat");
		m2c.mCheckMinus2H = true;
		//reconstruct topology
		boolean debugMatchedSpectrum = true;
		for (int i = 0; i < files.length; i++) {
			System.out.println(">>");
			System.out.println(">>" + specSet[i].mFilename);
			CSpectrum aSpec = new CSpectrum(datapath + files[i].getName());
			aSpec.protonate();
			//Begin - 1: This is for copy_reconstruction and training ionclassifier
			aSpec.addComplementaryIons();
			aSpec.mergePeaks(0.0025);
			//End - 1
			if (aSpec.mMassAccuracyPPM <= 0) {
				m2c.mMassAccuracyPPM = 5;
			} else {
				m2c.mMassAccuracyPPM = aSpec.mMassAccuracyPPM;
			}
			m2c.set_reducing_end_modification(aSpec.mReducingEndMode);
			m2c.set_permethylation(aSpec.mPermethylated);
			ArrayList<CSpectrum> hypoSpecs = m2c.correct_spectrum(aSpec);
			int trialNum = hypoSpecs.size();
			for (int s = 0; s < trialNum; s++) {
				System.out.println(">>>Try" + s);
				CGlycoDeNovo reconstructor = new CGlycoDeNovo(5, false, false);
				int[] composition = hypoSpecs.get(s).mComposition;
				for (int k = 0; k < CMonosaccharideSet.cNumberMonosaccharideClasses; k++) {
					if (composition[k] > 0) {
						if (reconstructor.mPossibleMonosaccharideClasses == null) {
							reconstructor.mPossibleMonosaccharideClasses = new ArrayList<>(8);
						}
						if (reconstructor.mPossibleMonosaccharideClassIDs == null) {
							reconstructor.mPossibleMonosaccharideClassIDs = new ArrayList<>(8);
						}
						reconstructor.mPossibleMonosaccharideClasses.add(CGlycoDeNovo.cMonosaccharideClasses[k]);
						reconstructor.mPossibleMonosaccharideClassIDs.add(k);
					}
				}
				reconstructor.mCheckMinus2H = false;
				reconstructor.mMaxBranchingNum = 2;
				reconstructor.mPermethylated = aSpec.mPermethylated;
				reconstructor.mCompositionConstraint = hypoSpecs.get(s).mComposition;
				reconstructor.set_reducing_end_modification(hypoSpecs.get(s).mReducingEndMode);
				reconstructor.interpretPeaks(hypoSpecs.get(s));
				reconstructor.reconstructFormulas();
				String name;
				if (trialNum == 1) {
					name = files[i].getName().replace(".txt", ".grec");
				} else {
					name = files[i].getName().replace(".txt", "." + s + ".grec");
				}
				String resultfile = datapath+ "results" + File.separator + name;
				ArrayList<CPeak> mPeaks = hypoSpecs.get(s).mPeaks;
				if (mPeaks.get(mPeaks.size() - 1).mInferredFormulas.isEmpty()) {
					System.out.println(">>> Failed, try -2H");
					reconstructor.mCheckMinus2H = true;
					reconstructor.interpretPeaks( hypoSpecs.get(s) );
					reconstructor.reconstructFormulas();
					mPeaks = hypoSpecs.get(s).mPeaks;
					if (mPeaks.get(mPeaks.size() - 1).mInferredFormulas.isEmpty()) {
						System.out.println("Debug Reconstruction");
						//TODO: debug_reconstruction, CGlycan.m
					} else {
						System.out.println(">>> Save reconstruction results in " + resultfile);
						//TODO: save_reconstruction() in CSpectrum
					}
					reconstructor.mCheckMinus2H = false;
				} else {
					System.out.println(">>> Save reconstruction results in " + resultfile);
					//TODO: save reconstruction
				}
				//TODO: copy_reconstruction( hypoSpecs(s), aSpec )
			}
			//TODO: save(aSpec) save .mat data
			System.out.println(">>> Finished" + specSet[i].mFilename);
		}
		System.out.println("Finished all");
		
		// CLASSIFIER
		ArrayList<CSpectrum> trainSpec = CSpectrum.load_saved_spectra( "20190116_FTMS" ); //TODO: load_saved_spectra load .mat data
		ArrayList<CSpectrum> allSpec = CSpectrum.load_saved_spectra( "20200618" );
		CIonclassifier ionClassifier = new CIonclassifier(CIonclassifier.mClassifierPath, CIonclassifier.mMassfeaturesPath); //TODO: ionClassifier should be CIonclassifier2, what's the difference?
		ionClassifier.mMassAccuracy = 0.01;																					//TODO: ionClassifier in java can't train models
		System.out.println("IonClassifier working...");
		for (int k = 0; k < allSpec.size(); k++) {
			CSpectrum aSpec = allSpec.get(k);
			ArrayList<CSpectrum> spec = new ArrayList<>();
			spec.add(aSpec);
			if (!aSpec.mPeaks.get(aSpec.mPeaks.size() - 1).mInferredFormulas.isEmpty()) {
				String filename = aSpec.mFilename.replace(".mat", ".IC");
				System.out.println(filename);
				ArrayList<ArrayList<ArrayList<ArrayList<Double>>>> result = ionClassifier.rank_candidates(spec); //TODO: should be score_candidates here
				//TODO: aSpec.sort_topologies_by_score();
		        //TODO: aSpec.save_reconstruction( filename, [] );
			}
		}
		System.out.println("Done");
	}
}
