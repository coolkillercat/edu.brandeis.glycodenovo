package edu.brandeis.glycodenovo.core;

import java.util.*;

// Copyright [2018] [Pengyu Hong at Brandeis University]
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

public class CTopologySuperSet implements Comparable<CTopologySuperSet> {
// CTopologySuperSet stores a set of topologies that are of the same type and the "same" mass.
// A peak can be reconstructed by multiple configurations, for example, peak_i + root_a or peak_m + root_b, and so on.
// Each configuration is stored in one TopologySet (topologies of the "same" mass and the same root and type). 
// All TopologySets of the same type and the "same" mass are stored in the CTopologySuperSet.

	// Candidate<peakID,cmass,lmass,hmass,topoReconstructionSet,topologySet>
	/*
	 * peakID ---- mTargetPeaks (possible for many peaks) cmass --- mMassPeak :
	 * Peak mass lmass --- mMassLow : Lower Bound of Mass hmass --- mMassHigh :
	 * Upper bound of Mass topoReconstructionSet --- mTopologySets topologySet
	 * --- mTopologies
	 */
	
	boolean 			mLegal; // true for a non empty mTopologies
	String 				mType; // Type of root of this TSS 'B' or 'C'
	double 				mMassPeak = 0; // Peak mass
	double 				mMassLow = Double.MAX_VALUE; // Lower Bound of Mass
	double 				mMassHigh = 0; // Upper bound of Mass
	CGlycoDeNovo 		mReconstructor; // Keep a copy here for easy access.
	
	// record the peak is linked to b ion or c ion...
	Map<Integer, Integer> 		mTargetPeaks = new HashMap<>(); // Map: peak index - peak type: 1=b, 2=c
	
	boolean 					mReconstructed = false;
	ArrayList<CTopologySet> 	mTopologySets = new ArrayList<CTopologySet>(); // Each CTolopogySet stores the results of one reconstruction configuration.
	HLightArrayList<CTopology> 	mTopologies; // All reconstructed topologies. Use HLightArrayList to store unique topologies

	public CTopologySuperSet(String mType, double mMassPeak, CGlycoDeNovo mReconstructor, int peakIndex) {
		this.mType = mType;
		this.mMassPeak = mMassPeak;
		this.mReconstructor = mReconstructor;
		if (mType.equals("B"))
			mTargetPeaks.put(peakIndex, 1);
		else if (mType.equals("C"))
			mTargetPeaks.put(peakIndex, 2);
		else if (mType.equals("T"))
			mTargetPeaks.put(peakIndex, 3);
	}

	void addPeak(int peakIndex, int peakType) {
		if (!mTargetPeaks.containsKey(peakIndex)) {
			mTargetPeaks.put(peakIndex, peakType);
		}
	}

	void addATopologySet(CTopologySet newSet) {
		if (!newSet.mType.equals(mType))
			return;
		mTopologySets.add(newSet);
		mMassLow = Math.min(newSet.mMassLow, mMassLow);
		mMassHigh = Math.max(newSet.mMassHigh, mMassHigh);

		newSet.mTargetPeaks = new HashMap<>(mTargetPeaks);// copy constructor of
															// hashmap
	}

	// judge that if tss is contains in this TSS
	boolean contains(CTopologySuperSet tss) {
		if (tss.mMassLow < mMassLow - 0.0000001 || tss.mMassHigh > mMassHigh + 0.0000001)
			return false;
		for (CTopologySet tssTS : tss.mTopologySets) {
			boolean notFound = true;
			for (CTopologySet mTS : mTopologySets) {
				if (mTS.equals(tssTS)) {
					notFound = false;
					break;
				}
			}
			if (notFound)
				return false;
		}
		return true;
	}

	@Override
	public int compareTo(CTopologySuperSet o) {
		return Double.compare(mMassPeak, o.mMassPeak);
	}

	// algorithm 2
	void reconstructFormulas() {
		// construct the formula of all TSS iteratively
		// step 1 ~ 3
		if (mReconstructed) return;
		
		// mTopologySets == TPReconstructionSet
		mTopologies = new HLightArrayList<CTopology>();
		
		// step 4 loop through all element in s.topoReconstructionSet
		Iterator<CTopologySet> iterTS = mTopologySets.iterator();
		while (iterTS.hasNext()) {
			CTopologySet mts = iterTS.next();
			// step 5 - 18
			mts.reconstructFormulas();
			if (mts.mTopologies.isEmpty())
				iterTS.remove();
			else
				// step 19
				mTopologies.addAll(mts.mTopologies);
		}

		mReconstructed = true;
		mLegal = !mTopologies.isEmpty();

		Map<String, CTopology> formulatoTp = new HashMap<>();
		Iterator<CTopology> iterTp = mTopologies.iterator();
		// remove same formula.. only save unique formula -- Topology
		while (iterTp.hasNext()) {
			CTopology mtp = iterTp.next();
			CTopology curr = formulatoTp.putIfAbsent(mtp.mFormula, mtp);
			if (curr != null) {
				curr.mSupportPeaks.addAll(mtp.mSupportPeaks);
				// need to get unique support peaks here to avoid duplicates in
				// results
				HashSet<CPeak> temp = new HashSet<>(curr.mSupportPeaks);
				ArrayList<CPeak> uniqueSupportPeaks = new ArrayList<>(temp);
				curr.mSupportPeaks = uniqueSupportPeaks;
				curr.mScore = (double) curr.mSupportPeaks.size();
				iterTp.remove();
			}
		}
	}
}
