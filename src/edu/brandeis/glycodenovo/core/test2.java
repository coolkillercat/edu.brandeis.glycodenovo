package edu.brandeis.glycodenovo.core;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
	public static void main(String[] args) throws Exception {
		CIonclassifier classifier = new CIonclassifier(CIonclassifier.mClassifierPath, CIonclassifier.mMassfeaturesPath);
		ArrayList<CSpectrum> specSet = new ArrayList<>();
		String dataset[] = {"annotation_20200612", "annotation_b202006"};
		String savepath = "C:\\Users\\nxy\\Desktop\\Brandeis\\data\\annotation\\save1.txt";
		ArrayList<CPeak> linkPeaks = new ArrayList<>();
		for (int k = 0; k < dataset.length; k++) {
			String datapath = "C:\\Users\\nxy\\Desktop\\Brandeis\\data" + File.separator + dataset[k] + File.separator;
			File dir = new File(datapath);
			File[] files = dir.listFiles(new FilenameFilter( ) {
				@Override
				public boolean accept(File dir, String name) {
					return name.endsWith(".ann");
				}
			});
			for (int i = 0; i < files.length; i++) {
				String filename = datapath + files[i].getName();
				System.out.println("Loading " + filename);
				CSpectrum spec = new CSpectrum(filename, "ann");
				specSet.add(spec);
				CGlycoDeNovo glyco = new CGlycoDeNovo(CIonclassifier.massAccuracyPPM);
				ArrayList<CSpectrum> spectra = new ArrayList<>();
				spectra.add(spec);
				
			}
			System.out.println("Done loading raw data ...");
		}
		File savefile = new File(savepath);
		if (!savefile.exists()) {
			savefile.createNewFile();
		}
		try (PrintWriter output = new PrintWriter(savefile);) {
			output.println("m/z\tz\tintensity\tpeaktype\tion-type\tRE\tNRE\tlinkage\tion-formula");
			for (CSpectrum spectra : specSet) {
				for (CPeak peak : spectra.mPeaks) {
					if (!peak.linkage.isEmpty()) {
						linkPeaks.add(peak);
						String complement = "";
						if (peak.mIsComplement) {
							complement = "com";
						}
						output.println(peak.getRawMZ()+"\t"+peak.getRawZ()+"\t"+ peak.getIntensity() +"\t"+complement+"\t"+ peak.ionType+"\t"+ peak.RE+"\t"+ peak.NRE+"\t"+ peak.linkage+"\t"+ peak.ionformula);
					}
				}
			}
			output.close();
		}
		System.out.println("Done");
	}
}
