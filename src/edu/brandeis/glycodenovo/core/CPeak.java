package edu.brandeis.glycodenovo.core;

import java.io.Serializable;
import java.util.ArrayList;
import org.grits.toolbox.ms.om.data.Peak;

// Copyright [2018] [Pengyu Hong at Brandeis University]
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//     http://www.apache.org/licenses/LICENSE-2.0
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/*
Corresponding to the peak in the paper
Cpeak.InferredSuperSets is all possible candidates for this peak ---(interpret as different ion)
 */

public class CPeak extends Peak implements Serializable {
	protected CSpectrum	mSpectrum;
	protected int		mID = -1;
	
	double 		mMass = -1; // Protonated mass
	double 		mMassLowBound = -1; // Protonated mass
	double 		mMassHighBound = -1; // Protonated mass
	double 		mRawMZ = -1;
	int 		mRawZ = -1;
	double 		mIntensity = -1; // will be normalized to sum up to 1 in a spectrum.
	int			mType;
	String		peakType, ionType, RE, NRE, linkage, ionformula; //data for annotation
	
	// The peak whose protonated mass is complement to this object.
	CPeak 		mComplementPeak = null;
	boolean		mIsComplement = false;

	// The original peaks that this object is derived from by protonation or merging peaks.  
	ArrayList<CPeak> 		mOriginalPeaks = null;
	
	// Reconstruction set for this peak
	ArrayList<CTopologySuperSet> 	mInferredSuperSets = new ArrayList<>(); 
	ArrayList<String> 				mInferredFormulas;
	ArrayList<CTopology> 			mInferredTopologies;
	ArrayList<String> 				mInferredGWAFormulas;
	ArrayList<Double> 				mInferredMasses;
	ArrayList<Integer> 				mInferredScores;
	ArrayList<Double>				mInferredDoubleScores;

	// This constructor doesn't fully construct CPeak. Have to set mSpectrum and mOriginal/mComplementPeak later.
	// @TODO: finish this if want to reconstruct
	public CPeak () {
		
	}
	
	public CPeak (int peakid, int complement, double mass, double rawMZ, int rawZ, double intensity) {
		mID = peakid;
		mMass = mass;
		mRawMZ = rawMZ;
		mRawZ = rawZ;
		mIntensity = intensity;
	}
	
	public CPeak(CSpectrum spectrum, double intensity, double rawMZ, int rawZ, String peakType, String ionType, String RE, String NRE, String linkage, String ionformula) {
		this.mSpectrum = spectrum;
		this.mRawMZ = rawMZ;
		this.mRawZ = rawZ;
		this.mIntensity = intensity;
		this.peakType = peakType;
		if (peakType.indexOf("com") >=0) {
			this.mIsComplement = true;
		}
		this.ionType = ionType;
		this.RE = RE;
		this.NRE = NRE;
		this.linkage = linkage;
		this.ionformula = ionformula;
		super.setCharge(rawZ);
		super.setIntensity(intensity);
		super.setMz(rawMZ);
		
	}
	
	public CPeak(CSpectrum spectrum, double intensity, double rawMZ, int rawZ) {
		this.mSpectrum = spectrum;
		this.mRawMZ = rawMZ;
		this.mRawZ = rawZ;
		this.mIntensity = intensity;
		super.setCharge(rawZ);
		super.setIntensity(intensity);
		super.setMz(rawMZ);
	}

	public CPeak(CSpectrum spectrum, double mass, double intensity, double rawMZ, int rawZ) {
		this(spectrum, intensity, rawMZ, rawZ);
		this.mMass = mass;
	}

	// add mMassLow / mMassHigh
	public CPeak(CSpectrum spectrum, double mass, double intensity, double rawMZ, int rawZ, double massHigh,
			double massLow) {
		this(spectrum, intensity, rawMZ, rawZ);
		this.mMass = mass;
		this.mMassLowBound = massLow;
		this.mMassHighBound = massHigh;
	}

	public CPeak(CSpectrum spectrum, double mass, double intensity, CPeak complement, double massHigh, double massLow) {
		this.mSpectrum = spectrum;
		this.mMass = mass;
		this.mMassLowBound = massLow;
		this.mMassHighBound = massHigh;
		this.mComplementPeak = complement;
		this.mIntensity = intensity;
		super.setIntensity(intensity);
		super.setCharge(1);
		super.setMz( mass );
	}
	
	public void setID(int id) {
		super.setId(id);
	}

	/**
	 * If mMass is given, compare mMass, otherwise compare mRawMZ.
	 * 
	 * @param peak
	 * @return -1 (), 0 (equal), 1 (
	 */
	@Override
	public int compareTo(Peak peak) {
		if (peak.getClass().equals(this.getClass())) {
			double thisMass = this.getMass();
			if ( thisMass > 0 )
			{
				double otherMass = ((CPeak) peak).getMass();
				if ( otherMass > 0 )
					return Double.compare( thisMass, otherMass );
			}
			return Double.compare(this.getRawMZ(), ((CPeak)peak).getRawMZ());
		}
		return Double.compare(this.getMz(), peak.getMz());
	}

	public ArrayList<Double> protonate() {
		double rawMZ = this.mRawMZ * this.mRawZ; // mRawMZ*mRawZ;
		double metalMass = CMass.getAtomMass( mSpectrum.getMetal() );
		double metalMZ = -1;
		ArrayList<Double> protonatedMasses = new ArrayList<Double>();

		for (int i = 1; i <= this.mRawZ; i++) {
			metalMZ = rawMZ - i * (metalMass - CMass.Electron);
			protonatedMasses.add( metalMZ - (this.mRawZ - i) * CMass.Proton + CMass.Proton );
		}
		return protonatedMasses;
	}
	
	public Double getIntensity() {
		return mIntensity;
	}

	public double getRawMZ() {
		return this.mRawMZ;
	}

	public int getRawZ() {
		return this.mRawZ;
	}

	public double getMass() {
		return this.mMass;
	}
	
	public double getMassLowBound() {
		return this.mMassLowBound;
	}

	public double getMassHighBound() {
		return this.mMassHighBound;
	}

	public CSpectrum getSpectrum() {
		return this.mSpectrum;
	}
	
	public ArrayList<CTopologySuperSet> getInferredSuperSets() {
		return mInferredSuperSets;
	}
	
	public ArrayList<String> getInferredGWAFormulas() {
		return mInferredGWAFormulas;
	}
	
	public void setInferredGWAFormulas(ArrayList<String> formulas) {
		mInferredGWAFormulas = formulas;
	}
	
	public ArrayList<String> getInferredFormulas() {
		return mInferredFormulas;
	}
	
	public void setInferredFormulas(ArrayList<String> formulas) {
		mInferredFormulas = formulas;
	}
	
	public ArrayList<CTopology> getInferredTopologies() {
		return this.mInferredTopologies;
	}
	
	public void setInferredTopologies(ArrayList<CTopology> topologies) {
		this.mInferredTopologies = topologies;
	}

	public ArrayList<Double> getInferredMasses() {
		return mInferredMasses;
	}
	
	public void setInferredMasses(ArrayList<Double> masses) {
		mInferredMasses = masses;
	}
	
	public ArrayList<Integer> getInferredScores() {
		return mInferredScores;
	}
	
	public void setInferredScores(ArrayList<Integer> scores) {
		mInferredScores = scores;
	}
	
	public ArrayList<CPeak> getOriginalPeaks() {
		return this.mOriginalPeaks;
	}

	public void addOriginalPeak(CPeak ori) {
		if ( this.mOriginalPeaks == null )
		{
			this.mOriginalPeaks = new ArrayList<CPeak>();
			this.mOriginalPeaks.add( ori );
		}
		else
		{
			for ( CPeak a : this.mOriginalPeaks )
				if ( a == ori )
					return;
			this.mOriginalPeaks.add( ori );
		}
	}

	public void setOriginalPeaks(ArrayList<CPeak> oriPeaks) {
		this.mOriginalPeaks = oriPeaks;
	}
	
	public CPeak getComplementPeak() {
		return mComplementPeak;
	}
	
	public void setComplementPeak(CPeak complement) {
		mComplementPeak = complement;
	}
	
	public boolean isComplement() {
		if ( this.mRawMZ < 0 )
			return true;
		return false;
	}
	
	public boolean isProtonated() {
		if ( this.mMass < 0 ) return false;
		return true;
	}
	
	void clearInferred() {
		if (mInferredSuperSets != null )
			mInferredSuperSets.clear();
		if (mInferredFormulas != null )
			mInferredFormulas.clear();
		if (mInferredMasses != null )
			mInferredMasses.clear();
		if (mInferredScores != null )
			mInferredScores.clear();
	}
	
	public void setInferredDoubleScores(ArrayList<Double> x) {
		mInferredDoubleScores = x;
	}
	
	public ArrayList<Double> getInferredDoubleScores() {
		return mInferredDoubleScores;
	}

	public void addOriginalPeaks(ArrayList<CPeak> add) {
		if (this.mOriginalPeaks == null) 
			this.mOriginalPeaks = new ArrayList<>();
		this.mOriginalPeaks.addAll(add);
	}
	
	@Override
	public String toString() {
		String out = "mass: " + this.getMass() + ", m/z: " + this.getMz() + ", intensity: " + this.getIntensity() + ", charge: " + this.getCharge();
    		return out;
	}
	
	@Override
	public boolean equals(Object object) {
		if (this.getClass() != object.getClass()) return false;
		return Math.abs(this.getMz() - ((CPeak)object).getMz()) < 0.0001;
	}
}
