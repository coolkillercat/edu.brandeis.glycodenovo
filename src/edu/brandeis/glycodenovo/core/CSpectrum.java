package edu.brandeis.glycodenovo.core;
//Copyright [2018] [Pengyu Hong at Brandeis University]
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//  http://www.apache.org/licenses/LICENSE-2.0
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import edu.brandeis.glycodenovo.clustering.*;
import edu.brandeis.glycodenovo.datamodel.SettingForm;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CSpectrum implements Serializable {
	ArrayList<CPeak> mPeaks;
	double		mPrecursorMZ = -1; // the protonated mz of the precursor
	double		mPrecursorRawMZ = -1; // the raw mz of the precursor
	double		mPrecursorRawZ = -1; // the raw z of the precursor
	int[]		mComposition;
	String 		mDerivationMethod;
	String 		mMetal;
	boolean 	mNLinked = false;
	boolean		mPermethylated = false;
	boolean		mProtonated = false;
	String 		mReducingEndMode;
	String 		mComment;
	String 		mFilename;
	double 		mMassAccuracyPPM = 5;
	ArrayList<CTopology> mTopologies = new ArrayList<>();
	private HashMap<Double, HashSet<CPeak>> mOriginalPeaksMap = new HashMap<>();
	// xinyi @ Nov. 1, 2019, test original peak
	private ArrayList<CPeak> originalPeaks = new ArrayList<>();

	public CSpectrum() {
	}

	/**
	 * load the spectrum from a text file.
	 * @param specFilename: pathname of the input file
	 */
	public CSpectrum(String specFilename) {
		Scanner sc = null;
		File specFile = new File(specFilename);
		try {
			sc = new Scanner(specFile);
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException("No such file");
		}
		this.mFilename = specFile.getName().substring(0, specFile.getName().lastIndexOf("."));
		String currentLine = sc.nextLine().trim();
		boolean firstLine = true;
		while (currentLine.startsWith("#") || currentLine.isEmpty()) {
			if (currentLine.startsWith("# Metal:")) {
				this.mMetal = currentLine.substring(9);
				if (this.mMetal.equals("H")) {
					this.mMetal = "Proton";
				}
			} else if (currentLine.startsWith("# Method:"))
				this.mDerivationMethod = currentLine.substring(10);
			else if (currentLine.startsWith("# Precursor:")) {
				// add some line here to get correct mPrecursorMZ
				String[] fields = currentLine.substring(13).split(";");
				String temp;
				if (this.mMetal.equals("Proton"))
					temp = "H+";
				else
					temp = mMetal + "+";
				for (String p : fields) {
					p = p.trim();
					int idx = p.indexOf(temp);
					this.mPrecursorRawZ = 1;
					if (idx != -1) {
						this.mPrecursorRawMZ = Double.valueOf(p.substring(idx + temp.length() + 1));
						if (idx != 0) {
							this.mPrecursorRawZ = Integer.valueOf(p.substring(0, idx));
						}
						mPrecursorMZ = this.mPrecursorRawZ * mPrecursorRawMZ
										- this.mPrecursorRawZ * (CMass.getAtomMass(this.mMetal) - CMass.Electron)
										+ CMass.Proton;
					}
				}
			} else if (firstLine) {
				mComment = currentLine.substring(2).trim();
				firstLine = false;
			} else if (currentLine.startsWith("# PPM:")) {
				mMassAccuracyPPM = Double.parseDouble(currentLine.substring(6));
			} else {
				switch (currentLine) {
				case "# O18":
				case "# Aminopyridine":
				case "# PRAGS":
				case "# Reduced":
				case "# Deuterium":
					mReducingEndMode = currentLine.substring(2);
					break;
				case "# PA":
					mReducingEndMode = "Aminopyridine";
					break;
				case "# Permethylated":
					mPermethylated = true;
					break;
				case "# NLinked":
					mNLinked = true;
					break;
				default:
					break;
				}
			}
			currentLine = sc.nextLine().trim();
		}

		mPeaks = new ArrayList<CPeak>();
		while (sc.hasNextLine()) {
			Scanner lineSc = new Scanner(sc.nextLine().trim());
			if (!lineSc.hasNext()) {
				continue;
			}
			double rawMZ = lineSc.nextDouble();
			int rawZ = Character.getNumericValue(lineSc.next().charAt(0));
			double intensity = lineSc.nextDouble();
			lineSc.close();
			mPeaks.add(new CPeak(this, intensity, rawMZ, rawZ));
			// xinyi @ Nov. 1, 2019, test original peak
			originalPeaks.add(new CPeak(this, intensity, rawMZ, rawZ));
			mOriginalPeaksMap.put(new CPeak(this, intensity, rawMZ, rawZ).getMz(), new HashSet<>());
		}
		sc.close();
		Collections.sort(mPeaks);
		// xinyi @ Nov. 1, 2019, test original peak
		Collections.sort(originalPeaks);
	}
	
	public CSpectrum(String specFilename, String FileType) {
		if (FileType != "ann") {
			Scanner sc = null;
			File specFile = new File(specFilename);
			try {
				sc = new Scanner(specFile);
			} catch (FileNotFoundException e) {
				throw new IllegalArgumentException("No such file");
			}
			this.mFilename = specFile.getName().substring(0, specFile.getName().lastIndexOf("."));
			String currentLine = sc.nextLine().trim();
			boolean firstLine = true;
			while (currentLine.startsWith("#") || currentLine.isEmpty()) {
				if (currentLine.startsWith("# Metal:")) {
					this.mMetal = currentLine.substring(9);
					if (this.mMetal.equals("H")) {
						this.mMetal = "Proton";
					}
				} else if (currentLine.startsWith("# Method:"))
					this.mDerivationMethod = currentLine.substring(10);
				else if (currentLine.startsWith("# Precursor:")) {
					// add some line here to get correct mPrecursorMZ
					String[] fields = currentLine.substring(13).split(";");
					String temp;
					if (this.mMetal.equals("Proton"))
						temp = "H+";
					else
						temp = mMetal + "+";
					for (String p : fields) {
						p = p.trim();
						int idx = p.indexOf(temp);
						this.mPrecursorRawZ = 1;
						if (idx != -1) {
							this.mPrecursorRawMZ = Double.valueOf(p.substring(idx + temp.length() + 1));
							if (idx != 0) {
								this.mPrecursorRawZ = Integer.valueOf(p.substring(0, idx));
							}
							mPrecursorMZ = this.mPrecursorRawZ * mPrecursorRawMZ
											- this.mPrecursorRawZ * (CMass.getAtomMass(this.mMetal) - CMass.Electron)
											+ CMass.Proton;
						}
					}
				} else if (firstLine) {
					mComment = currentLine.substring(2).trim();
					firstLine = false;
				} else if (currentLine.startsWith("# PPM:")) {
					mMassAccuracyPPM = Double.parseDouble(currentLine.substring(6));
				} else {
					switch (currentLine) {
					case "# O18":
					case "# Aminopyridine":
					case "# PRAGS":
					case "# Reduced":
					case "# Deuterium":
						mReducingEndMode = currentLine.substring(2);
						break;
					case "# PA":
						mReducingEndMode = "Aminopyridine";
						break;
					case "# Permethylated":
						mPermethylated = true;
						break;
					case "# NLinked":
						mNLinked = true;
						break;
					default:
						break;
					}
				}
				currentLine = sc.nextLine().trim();
			}

			mPeaks = new ArrayList<CPeak>();
			while (sc.hasNextLine()) {
				Scanner lineSc = new Scanner(sc.nextLine().trim());
				if (!lineSc.hasNext()) {
					continue;
				}
				double rawMZ = lineSc.nextDouble();
				int rawZ = Character.getNumericValue(lineSc.next().charAt(0));
				double intensity = lineSc.nextDouble();
				lineSc.close();
				mPeaks.add(new CPeak(this, intensity, rawMZ, rawZ));
				// xinyi @ Nov. 1, 2019, test original peak
				originalPeaks.add(new CPeak(this, intensity, rawMZ, rawZ));
				mOriginalPeaksMap.put(new CPeak(this, intensity, rawMZ, rawZ).getMz(), new HashSet<>());
			}
			sc.close();
			Collections.sort(mPeaks);
			// xinyi @ Nov. 1, 2019, test original peak
			Collections.sort(originalPeaks);
		} else {
			Scanner sc = null;
			File specFile = new File(specFilename);
			try {
				sc = new Scanner(specFile);
			} catch (FileNotFoundException e) {
				throw new IllegalArgumentException("No such file");
			}
			this.mFilename = specFile.getName().substring(0, specFile.getName().lastIndexOf("."));
			String currentLine = sc.nextLine().trim();
			boolean firstLine = true;
			while (currentLine.startsWith("#") || currentLine.isEmpty()) {
				if (currentLine.startsWith("# Metal:")) {
					this.mMetal = currentLine.substring(9);
					if (this.mMetal.equals("H")) {
						this.mMetal = "Proton";
					}
				} else if (currentLine.startsWith("# Method:"))
					this.mDerivationMethod = currentLine.substring(10);
				else if (currentLine.startsWith("# Precursor:")) {
					// add some line here to get correct mPrecursorMZ
					String[] fields = currentLine.substring(13).split(";");
					String temp;
					if (this.mMetal.equals("Proton"))
						temp = "H+";
					else
						temp = mMetal + "+";
					for (String p : fields) {
						p = p.trim();
						int idx = p.indexOf(temp);
						this.mPrecursorRawZ = 1;
						if (idx != -1) {
							this.mPrecursorRawMZ = Double.valueOf(p.substring(idx + temp.length() + 1));
							if (idx != 0) {
								this.mPrecursorRawZ = Integer.valueOf(p.substring(0, idx));
							}
							mPrecursorMZ = this.mPrecursorRawZ * mPrecursorRawMZ
											- this.mPrecursorRawZ * (CMass.getAtomMass(this.mMetal) - CMass.Electron)
											+ CMass.Proton;
						}
					}
				} else if (firstLine) {
					mComment = currentLine.substring(2).trim();
					firstLine = false;
				} else if (currentLine.startsWith("# PPM:")) {
					mMassAccuracyPPM = Double.parseDouble(currentLine.substring(6));
				} else {
					switch (currentLine) {
					case "# O18":
					case "# Aminopyridine":
					case "# PRAGS":
					case "# Reduced":
					case "# Deuterium":
						mReducingEndMode = currentLine.substring(2);
						break;
					case "# PA":
						mReducingEndMode = "Aminopyridine";
						break;
					case "# Permethylated":
						mPermethylated = true;
						break;
					case "# NLinked":
						mNLinked = true;
						break;
					default:
						break;
					}
				}
				currentLine = sc.nextLine().trim();
			}

			mPeaks = new ArrayList<CPeak>();
			while (sc.hasNextLine()) {
				Scanner lineSc = new Scanner(sc.nextLine().trim());
				lineSc.useDelimiter("\t"); 
				if (!lineSc.hasNext()) {
					continue;
				}
				double rawMZ;
				String r = "";
				if (lineSc.hasNext()) {
					r = lineSc.next();
				}
				rawMZ = Double.valueOf(r);
				int rawZ;
				if (lineSc.hasNext()) {
					r = lineSc.next();
				}
				rawZ = Integer.valueOf(r);
				r = lineSc.next();
				double intensity;
				if (r.indexOf("Inf") >= 0) {
					intensity = 0;
				} else {
					intensity = Double.valueOf(r);
				}
				String peakType = "", ionType = "", RE = "", NRE = "", linkage = "", ionformula = "";
				if (lineSc.hasNext()) {
					peakType = lineSc.next();
				}
				if (lineSc.hasNext()) {
					ionType = lineSc.next();
				}
				if (lineSc.hasNext()) {
					RE = lineSc.next();
				}
				if (lineSc.hasNext()) {
					NRE = lineSc.next();
				}
				if (lineSc.hasNext()) {
					linkage = lineSc.next();
				}
				if (lineSc.hasNext()) {
					ionformula = lineSc.next();
				}
				lineSc.close();
				mPeaks.add(new CPeak(this, intensity, rawMZ, rawZ, peakType, ionType, RE, NRE, linkage, ionformula));
				// xinyi @ Nov. 1, 2019, test original peak
				originalPeaks.add(new CPeak(this, intensity, rawMZ, rawZ));
				mOriginalPeaksMap.put(new CPeak(this, intensity, rawMZ, rawZ).getMz(), new HashSet<>());
			}
			sc.close();
			Collections.sort(mPeaks);
			// xinyi @ Nov. 1, 2019, test original peak
			Collections.sort(originalPeaks);
		}
		
	}

	/**
	 * Tried to use mzXML reader, but it does not work for now. Do not use this constructor
	 * @param form
	 */
	public CSpectrum(SettingForm form) {
		// set fields based on data obtained from SettingForm and Scan
		this.mDerivationMethod = form.getExperimentType();
		this.mMassAccuracyPPM = form.getReconstructionPPM();
		this.mMetal = form.getMetal();
		this.mFilename = form.getFilePath();
		this.mReducingEndMode = form.getReducingEnd();
		this.mPermethylated = form.getPermethylated();
	}
	
	public ArrayList<CPeak> getPeakList() {
		return this.mPeaks;
	}

	public boolean isValid() {
		if ( mPeaks == null || mPeaks.size() == 0)
			return false;
		return true;
	}

	// Derive the protonated m/z from the raw m/z. If the raw z is > 1, there are more than one protonated m/z. 
	public void protonate() {
		ArrayList<CPeak> protonatedPeaks = new ArrayList<CPeak>( mPeaks.size() );
		
		// Get the protonated MZ bound.
		double massAcc = mMassAccuracyPPM / 1000000;
		double precursorMassAccuracy = mPrecursorMZ * massAcc;
		double precursorMassBound = mPrecursorMZ + precursorMassAccuracy;
		
		for (CPeak aPeak : mPeaks) {
			ArrayList<Double> protonatedMasses = aPeak.protonate();
			for ( Double protonatedMass : protonatedMasses) {
				// ensure that mass is not larger than threshold
				if ( protonatedMass <= precursorMassBound ) {
					CPeak newPeak = new CPeak(this, protonatedMass, aPeak.getIntensity(), aPeak.getRawMZ(),
							aPeak.getCharge(), protonatedMass * (1 + massAcc),
							protonatedMass * (1 - massAcc));
					newPeak.addOriginalPeak( aPeak );
					protonatedPeaks.add( newPeak );
				}
			}
		}
		// update mPeaks
		mPeaks = protonatedPeaks;
		Collections.sort(mPeaks);
		mProtonated = true;
		//xinyi @ Nov. 1, 2019, test original peak
		ArrayList<CPeak> savedOriginalPeaks = new ArrayList<>();
		for (CPeak peak : mPeaks) {
			if (peak.getOriginalPeaks() == null || peak.getOriginalPeaks().isEmpty()) {
				savedOriginalPeaks.add(peak);
				if (Math.abs(peak.getMz() - 1330.6834)  < 0.001) {
					System.out.println("cpeak: " + peak);
				}
			} else {
				savedOriginalPeaks.addAll(peak.getOriginalPeaks());
				for (CPeak opeak : peak.getOriginalPeaks()) {
					//System.out.println("curr: " + opeak);
					if (Math.abs(opeak.getMz() - 1330.6834)  < 0.001) {
						System.out.println("cpeak: " + peak);
					}
				}
			}
		}
		Collections.sort(savedOriginalPeaks);
		boolean same = true;
		for (CPeak peak : this.originalPeaks) {
			if (!savedOriginalPeaks.contains(peak)) {
				System.out.println("missing: " + peak);
			}
		}
		System.out.println("end of protonate");
		//end xinyi @ Nov. 1, 2019, test original peak
	}

	public void mergePeaks(double threshold) {
		// This function is to merge the closest peaks by single-linkage clustering on mPeaks
		// Use a third party lib: https://github.com/lbehnke/hierarchical-clustering-java.
		int peakListSize = mPeaks.size();
		double[][] distances = new double[1][peakListSize * (peakListSize - 1) / 2];
		int distIdx = 0;
		for (int i = 0; i < peakListSize; i++) {
			CPeak peaki = mPeaks.get(i);
			for (int j = i + 1; j < peakListSize; j++) {
				CPeak peakj = mPeaks.get(j);
				distances[0][distIdx] = Math.abs(peaki.getMass() - peakj.getMass());
				distIdx++;
			}
		}
		String[] names = new String[peakListSize];
		for (int i = 0; i < peakListSize; i++) {
			names[i] = Integer.toString(i);
		}
		// DON'T USE DEFAULTCLUSTERINGALGO! LEAFNAMES NOT ADDED WHEN CREATING
		// CLUSTERS...
		List<Cluster> clusters = new PDistClusteringAlgorithm().performFlatClustering(distances, names,
				new SingleLinkageStrategy(), threshold);
		
		
		// assign mass and intensities and complements (if any) to merged peaks
		// from clusters generated above
		ArrayList<CPeak> clusteredPeaks = new ArrayList<CPeak>(clusters.size());
		ArrayList<CPeak> oriPeaks = new ArrayList<CPeak>();
		CPeak tempPeak, newPeak;
		double delta = mPrecursorMZ * mMassAccuracyPPM / 1000000; // Use mPrecursorMZ for complementary peaks.
		
		for (Cluster cluster : clusters) {
			List<String> leaves = cluster.getLeafNames();

			// Begin 2019/09/18. 
			if ( leaves.size() == 1 ) {
				int oriIdx = Integer.valueOf( leaves.get(0) );
				newPeak = mPeaks.get( oriIdx );
			}
			else {
				double massIntenSum = 0, intensitySum = 0;
				oriPeaks.clear();

				for (String leaf : leaves) {
					int idx = Integer.valueOf(leaf);
					tempPeak = mPeaks.get(idx);
					intensitySum += tempPeak.getIntensity();
					massIntenSum += tempPeak.getMass() * tempPeak.getIntensity();
					if ( !tempPeak.isComplement() )
						oriPeaks.add( tempPeak );
				}

				double newIntensity = intensitySum;
				double newMass = massIntenSum / intensitySum;
				CPeak oriPeak = null;
				double minD = Double.MAX_VALUE, d = 0;

				for ( CPeak aPeak : oriPeaks ) {
					d = Math.abs( aPeak.getMass() - newMass );
					if ( d < minD ) {
						oriPeak = aPeak;
						minD = d;
					}
				}

				if ( oriPeak == null ) {
					int middleIdx = cluster.getLeafNames().size() / 2;
					int idx = Integer.parseInt( leaves.get(middleIdx) );
					oriPeak = mPeaks.get( idx );
					newPeak = new CPeak( this, newMass, newIntensity, -1, -1, newMass + delta, newMass - delta );			
				}
				else
					newPeak = new CPeak( this, newMass, newIntensity, oriPeak.getRawMZ(),
							oriPeak.getRawZ(), newMass * (1 + mMassAccuracyPPM / 1000000),
							newMass * (1 - mMassAccuracyPPM / 1000000) );
				/*
				if ( oriPeak.getOriginalPeaks() != null )
					newPeak.setOriginalPeaks( oriPeak.getOriginalPeaks() );
				else
					newPeak.addOriginalPeak( oriPeak );
				*/
				for (CPeak oripeak : oriPeaks) {
					if (oripeak.getOriginalPeaks() != null)  {
						newPeak.addOriginalPeaks(oripeak.getOriginalPeaks());
						/*for (CPeak originalPeak : oripeak.getOriginalPeaks()) {
							mOriginalPeaksMap.get(originalPeak.getMz()).add(newPeak);
						}*/
					}
					else {
						newPeak.addOriginalPeak(oripeak);
						/*mOriginalPeaksMap.get(oripeak.getMz()).add(newPeak);*/
					}
				}
			}
			// End 2019/09/18
			
			clusteredPeaks.add( newPeak );
		}
		
		// Redirect complementary peaks
		double minD = Double.MAX_VALUE, d = 0, dThresh = mPrecursorMZ * mMassAccuracyPPM / 1000000;
		CPeak comPeak = null;
		for (CPeak clusteredPeak : clusteredPeaks) {
			comPeak = null;
			for (CPeak peak : clusteredPeaks) {
				if ( clusteredPeak == peak ) continue;
				d = Math.abs(peak.getMass() - clusteredPeak.getMass());
				if (d < dThresh && d < minD) {
					minD = d;
					comPeak = peak;
				}
			}
			if ( comPeak != null )
				clusteredPeak.setComplementPeak( comPeak );
		}
		
		/* 2019/09/18 Replaced by the above block.
		for (CPeak clusteredPeak : clusteredPeaks) {
			// redirect mComplement
			boolean complementFlag = false;
			for (CPeak peak : mPeaks) {
				if (Math.abs(peak.getMass() - clusteredPeak.getMass()) < threshold && peak.getComplementPeak() != null) {
					complementFlag = true;
					break;
				}
			}
			if (complementFlag) {
				double complementMass = mPrecursorMZ - clusteredPeak.getMass() + CMass.Proton;
				CPeak complement = findClosestPeak(complementMass, clusteredPeaks,
						mPrecursorMZ * mMassAccuracyPPM / 1000000);
				if (complement != null)
					clusteredPeak.setComplementPeak(complement);
			}
		}
		*/
		
		Collections.sort(clusteredPeaks);
		mPeaks = clusteredPeaks;
		//xinyi @ Nov. 1, 2019, test original peak
		ArrayList<CPeak> savedOriginalPeaks = new ArrayList<>();
		for (CPeak peak : mPeaks) {
			if (peak.getOriginalPeaks() == null || peak.getOriginalPeaks().isEmpty()) {
				savedOriginalPeaks.add(peak);
				mOriginalPeaksMap.get(peak.getMz()).add(peak);
			} else {
				savedOriginalPeaks.addAll(peak.getOriginalPeaks());
				for (CPeak oripeak : peak.getOriginalPeaks()) {
					mOriginalPeaksMap.get(oripeak.getMz()).add(peak);
				}
			}
		}
		Collections.sort(savedOriginalPeaks);
		boolean same = true;
		for (CPeak peak : this.originalPeaks) {
			if (!savedOriginalPeaks.contains(peak)) {
				System.out.println("missing:" + peak);
			}
		}
		System.out.println("end of merge peaks");
		//end xinyi @ Nov. 1, 2019, test original peak
	}

	// Find Closest Peak for a given target mass with threshold
	// Will be used in addComplementIon
	static private CPeak findClosestPeak(double mass, List<CPeak> peaks, double threshold) {
		// This function is to find the peak that is closest to a certain mass
		double minDiff = Double.MAX_VALUE;
		CPeak minDiffPeak = null;
		for (CPeak cPeak : peaks) {
			double diff = Math.abs(cPeak.getMass() - mass);
			if (diff < minDiff) {
				minDiff = diff;
				minDiffPeak = cPeak;
			}
		}
		// return the closest peak if the diff is less than threshold
		if (minDiff <= threshold)
			return minDiffPeak;
		else
			return null;
	}

	public ArrayList<CPeak> find_peaks(double mass, double massaccuracy) {
		ArrayList<CPeak> list = new ArrayList<>();
		for (CPeak peak : mPeaks) {
			double diff = Math.abs(peak.getMass() - mass);
			if (diff < massaccuracy) {
				list.add(peak);
			}
		}
		return list;
	}
	
	// find All complementaryIons for each peak and add it to CPeak
	public void addComplementaryIons() {
		double precursorMass = mPrecursorMZ > 100 ? mPrecursorMZ : mPeaks.get(mPeaks.size() - 1).getMass();
		double ionMass = CMass.Proton;
		double minMassThreshold = 100;
		boolean added = false;
		int prevSize = mPeaks.size();
		if ( !this.mPermethylated ) {
			minMassThreshold = Math.max(minMassThreshold, CMonosaccharideSet.Xyl.sacNative.mass - CMass.H2O);
		} else {
			minMassThreshold = Math.max(minMassThreshold,
					CMonosaccharideSet.Xyl.sacPermethylated.mass - CMass.CH2 - CMass.H2O);
		}
		List<CPeak> complements = new ArrayList<>();
		double delta = mPrecursorMZ * mMassAccuracyPPM / 1000000; // Use mPrecursorMZ because the precursor is used to compute the complement.
		for (int i = 0; i < prevSize; i++) {
			CPeak cPeak = mPeaks.get(i);
			double complementMass = precursorMass - cPeak.getMass() + ionMass;
			if (complementMass < minMassThreshold)
				continue;
			CPeak complement = findClosestPeak(complementMass, mPeaks, delta);

			if (complement == null) { // not in the list
				// add a new peak with mass = complementMass
				added = true;
				complements.add(new CPeak(cPeak.getSpectrum(), complementMass, cPeak.getIntensity(), cPeak,
						complementMass + delta, complementMass - delta));
				cPeak.setComplementPeak(complement);
			} else { // in the list, update the complement peaks of both
				complement.setComplementPeak(cPeak);
				cPeak.setComplementPeak(complement);
			}
		}
		// add all complement to mPeaks and sort
		mPeaks.addAll(complements);
		if (added) {
			Collections.sort(mPeaks);
		}
	}

	void clearInferred() {
		for (CPeak mPeak : mPeaks) {
			mPeak.clearInferred();
		}
	}

	public static CSpectrum specProcessing(String filePath) {
		CSpectrum spec = new CSpectrum(filePath); // input data and metadata
		spec.protonate();
		spec.mergePeaks(0.001); // merge peaks according to given
								// accuracy(interval)
		spec.addComplementaryIons();
		return spec;
	}
	
	/**
	 * Use OOP idea to process spectrum
	 */
	public void specProcessing() {
		protonate();
		mergePeaks(0.001);
		addComplementaryIons();
	}
	
	public String getDerivationMethod() {
		return this.mDerivationMethod;
	}
	
	public boolean getPermethyldated() {
		return this.mPermethylated;
	}
	
	public double getMassAccuracyPPM() {
		return this.mMassAccuracyPPM;
	}
	
	/*
	 * @param complementFlag: -1 -- complement peaks only; 0 -- all; 1 -- exclude complement peaks.
	 */
	public ArrayList<CPeak> getPeaks(int complementFlag) {
		if (complementFlag == 0)
			return this.mPeaks;
		else if ( complementFlag == 1 ) // complement peaks only
		{
			ArrayList<CPeak> result = new ArrayList<CPeak>();
			for (CPeak aPeak : this.mPeaks) {
				if ( aPeak.isComplement() )
					result.add(aPeak);
			}
			return result;
		}
		else // exlucde complement peaks
		{
			ArrayList<CPeak> result = new ArrayList<CPeak>();
			for (CPeak aPeak : this.mPeaks) {
				if ( !aPeak.isComplement() )
					result.add(aPeak);
			}
			return result;
		}	
	}
	
	public double getPrecursorMZ() {
		return this.mPrecursorMZ;
	}
	
	public double getPrecursorRawMZ() {
		return this.mPrecursorRawMZ;
	}

	public double getPrecursorRawZ() {
		return this.mPrecursorRawZ;
	}
	
	public String getReducingEndMode() {
		return this.mReducingEndMode;
	}

	public String getMetal() {
		return this.mMetal;
	}

	public boolean isNLinked() {
		return this.mNLinked;
	}
	
	public boolean isPermethylated() {
		return this.mPermethylated;
	}
	
	public boolean isProtonated() {
		return this.mProtonated;
	}
	
	public int indexOf (CPeak peak)
	{
		if ( peak == null )
			return -1;
		return this.mPeaks.indexOf(peak);
	}
	
	/*
	 * @param index is 0-based.
	 */
	public CPeak getPeak(int index)
	{
		if (index < 0 || this.mPeaks == null ) return null;
		int s = this.mPeaks.size();
		if ( s == 0 || s >= index ) return null;
		return this.mPeaks.get(index);
	}
	
	public int size()
	{
		if ( this.mPeaks == null ) return 0;
		return this.mPeaks.size();
	}
	
	public void updatePeakIDs()
	{
		if ( this.mPeaks != null )
		{
			for ( int k = 0; k < this.mPeaks.size(); k ++ )
			{
				this.mPeaks.get(k).mID = k;
			}
		}
	}
	
	public String getFilename() {
		return mFilename;
	}

	/**
	 * @param resultFilename
	 * @param check2H
	 * @param checkGap
	 */
	public void outputTXT(String resultFilename, boolean check2H, boolean checkGap) {
		// output file
		PrintStream ps = null;
		try {
			ps = new PrintStream(resultFilename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ps.println("# " + mComment);
		ps.println("# Check -2H = " + check2H);
		ps.println("# Allow gap = " + checkGap);
		ps.println();
		for (int k = 0; k < mPeaks.size(); k++) {
			CPeak peak = mPeaks.get(k);
			if (peak.getInferredFormulas() == null)
				continue;
			if (peak.getComplementPeak() != null)
				ps.println("@ Peak " + k + " (~ " + (mPeaks.indexOf(peak.getComplementPeak()) + 1) + ")" + ": mass "
						+ peak.getMass() + ", intensity " + peak.getIntensity());
			else
				ps.println("@ Peak " + k + ": mass " + peak.getMass() + ", intensity " + peak.getIntensity());

			for (CTopologySuperSet inferredSuperSet : peak.getInferredSuperSets()) {
				if (inferredSuperSet.mTargetPeaks.get(k) != null) {
					String type;
					int t = inferredSuperSet.mTargetPeaks.get(k);
					switch (t % 10) {
					case 1:
						type = "B";
						break;
					case 2:
						type = "C";
						break;
					default:
						type = "T";
					}
					// if this ion is an ion with minus 2H, we add -2H it here
					if (t > 10)
						type = type + "-2H";

					for (CTopology topology : inferredSuperSet.mTopologies) {
						ps.print("** " + type + ": " + topology.mFormula + " " + "[Peaks ("
								+ topology.mSupportPeaks.size() + ", " + topology.mScore + "):");
						for (CPeak supportPeak : topology.mSupportPeaks) {
							ps.print(" " + (mPeaks.indexOf(supportPeak) + 1));
						}
						ps.println("]");
					}
				}
			}
			ps.println();
		}
		ps.close();
		System.out.println(resultFilename + " saved!");
	}

	/**
	 * @deprecated, waiting to be updated
	 * @param resFolder
	 */
	public void outputGWA(String resFolder) {
		// GWA is a special XML file used by GlycoWorkBench
		String gwaFilename = "rec." + mFilename + ".gwa";
		try {
			// new XML object
			Document gwa = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

			// fill in format and content
			Element root = gwa.createElement("AnnotatedPeakList");
			gwa.appendChild(root);
			Element annos = gwa.createElement("Annotations");
			root.appendChild(annos);
			Element glycan = gwa.createElement("Glycan");
			glycan.setAttribute("structure", "");
			annos.appendChild(glycan);
			Element pac = gwa.createElement("PeakAnnotationCollection");
			annos.appendChild(pac);
			for (CPeak peak : mPeaks) {
				if (peak.getInferredFormulas() != null) {
					for (int i = 0; i < peak.getInferredFormulas().size(); i++) {
						Element currPa = gwa.createElement("PeakAnnotation");
						pac.appendChild(currPa);
						Element currP = gwa.createElement("Peak");
						currPa.appendChild(currP);
						currP.setAttribute("mz_ratio", String.valueOf(peak.getMass()));
						currP.setAttribute("intensity", String.valueOf(peak.getIntensity()));
						Element currA = gwa.createElement("Annotation");
						currPa.appendChild(currA);
						Element currFrag = gwa.createElement("FragmentEntry");
						currA.appendChild(currFrag);

						currFrag.setAttribute("fragment", peak.getInferredFormulas().get(i));
						currFrag.setAttribute("mass", String.valueOf(peak.getInferredMasses().get(i)));
						currFrag.setAttribute("mz_ratio", String.valueOf(peak.getInferredMasses().get(i)));
						currFrag.setAttribute("name", "");
						currFrag.setAttribute("score", String.valueOf(peak.getInferredScores().get(i)));
					}
				}
			}
			// write into XML file
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			// change line..
			transformer.transform(new DOMSource(gwa), new StreamResult(new File(resFolder + gwaFilename)));
			System.out.println(gwaFilename + " saved!");
		} catch (ParserConfigurationException | TransformerException e) {
			e.printStackTrace();
		}
	}
	
	public void printmPeaks  (String savePath) throws Exception {
		if (savePath.charAt(savePath.length() - 1) != '\\') {
			savePath = savePath + '\\';
		}
		savePath = savePath + "save\\peak.txt";
		File file = new File(savePath);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter filewriter = new FileWriter(file);
		for (int i = 0; i < mPeaks.size(); i++) {
			CPeak currPeak = mPeaks.get(i);
			filewriter.write("Peak: " + i + " complement " + mPeaks.indexOf(currPeak.getComplementPeak()) + " mass " + currPeak.getMass() + " type: ");
			for (CTopologySuperSet TSS : currPeak.getInferredSuperSets()) {
				filewriter.write(TSS.mType + " ");
			}
			filewriter.write("\n");
		}
		filewriter.close();
	}
	
	// xinyi @ Nov. 1, 2019, test original peak
	public ArrayList<CPeak> getOriginalPeaks() {
		return originalPeaks;
	}
	
	public HashMap<Double, HashSet<CPeak>> getOriginalPeaksMap() {
		return this.mOriginalPeaksMap;
	}
	
	// xinyi @ Oct. 17 2020
	public static ArrayList<CSpectrum> load_saved_spectra(String data) {
		//TODO
		return null;
	}
	
	public void sort_topologies_by_score() {
		int end = this.mPeaks.size() - 1;
		if (this.mPeaks.get(end).mInferredFormulas.isEmpty()) {
			return;
		}
		HashMap<Double, ArrayList<CTopology>> map = new HashMap<>();
		int i = 0;
		ArrayList<CTopology> tempTopologies = new ArrayList<>();
		this.mTopologies = new ArrayList<>();
		ArrayList<Double> scores = new ArrayList<>();
		for (CTopologySuperSet aTTS : this.mPeaks.get(end).mInferredSuperSets) {
			for (CTopology aTP : aTTS.mTopologies) {
				tempTopologies.add(aTP);
				scores.add(aTP.mScore);
				if (map.containsKey(aTP.mScore)) {
					map.get(aTP.mScore).add(aTP);
				} else {
					ArrayList<CTopology> list = new ArrayList<>();
					list.add(aTP);
					map.put(aTP.mScore, list);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		 CSpectrum spec;
		 ArrayList<CSpectrum> speca = new ArrayList<>();
		 spec = new CSpectrum("C:\\Users\\nxy\\Desktop\\Brandeis\\arff\\arff\\HighMan_PGC.Man5_Peak3.txt");
		 speca.add(spec);
		 CGlycoDeNovo glyco = new CGlycoDeNovo(5);
		 for (CSpectrum spectrum : speca) {
		   spectrum.protonate();
		   spectrum.mergePeaks(0.001);	
		   spectrum.addComplementaryIons();
		   glyco.interpretPeaks(spectrum);
		   glyco.reconstructFormulas();
		 }
		 CPeak test = spec.mPeaks.get(3);
		 System.out.println(test.getComplementPeak());
		 System.out.println(spec.getPrecursorMZ());
	}
}
