package edu.brandeis.glycodenovo.core;

import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

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

// Topology <mass, representation,supports>
/**
 * mass --- mMass representation --- mFormula supports --- mSupportPeaks
 */

public class CTopology implements Comparable<CTopology> {
	protected String 						mType;
	protected double 						mMass;
	protected int 							mRootMonoClassID;
	protected String 						mFormula;
	protected String 						mGWAFormula;
	protected double 						mScore; // It is initialized as the size of mSupportPeaks. Call IonClassifier to assign a more meaningful score.
	protected int[]							mCopositionCount = new int[8];
	protected int 							mMinusH = 0; // 0, 1 or 2
	protected ArrayList<CPeak> 				mSupportPeaks = null; // support peaks of this topology
	protected HLightArrayList<CTopology>	mChildrenTopologies = null;

	public CTopology(String formula, String gwaFormula, int ClassID, Set<CPeak> peaks, double size, double mass,
			String type, int[] compositionCountMerged) {
		mFormula = formula;
		mGWAFormula = gwaFormula;
		mRootMonoClassID = ClassID;
		mSupportPeaks = new ArrayList<>(peaks);
		Collections.sort(mSupportPeaks);
		mScore = size;
		mMass = mass;
		mType = type;
		mCopositionCount = compositionCountMerged;
		mMinusH = 0;
	}

	public String getFormula() {
		return this.mFormula;
	}

	public String getGWAFormula() {
		return this.mGWAFormula;
	}
	
	public String getType() {
		return this.mType;
	}
	
	public void addSupportPeak(CPeak peak)
	{
		if ( peak == null ) return;
		
		if ( this.mSupportPeaks == null ) {
			this.mSupportPeaks = new ArrayList<CPeak>();
			this.mSupportPeaks.add( peak );
		}
		else if ( this.mSupportPeaks.indexOf( peak ) < 0 )
			this.mSupportPeaks.add( peak );
	}
	
	public void addSupportPeaks(ArrayList<CPeak> peaks)
	{
		if (peaks == null ) return;
		
		if ( this.mSupportPeaks == null )
			this.mSupportPeaks = new ArrayList<CPeak>();
		
		for (CPeak peak : peaks) {
			if ( this.mSupportPeaks.indexOf( peak ) < 0 )
				this.mSupportPeaks.add( peak );
		}
	}
	
	public int numberOfSupportPeaks()
	{
		if ( this.mSupportPeaks == null ) return 0;
		return this.mSupportPeaks.size();
	}

	public CTopology addChild(CTopology c) {
		if (this.mChildrenTopologies == null)
			this.mChildrenTopologies = new HLightArrayList<CTopology>(true, true);
		return this.mChildrenTopologies.addOne( c );
	}
	
	public void getDescendantGWAFormula(HLightArrayList<String> descendant) {
		descendant.add(this.mGWAFormula);
		if ( this.mChildrenTopologies != null )
			for ( CTopology ctp : this.mChildrenTopologies )
				ctp.getDescendantGWAFormula(descendant);
	}
	
	public ArrayList<CPeak> getSupportPeaks() {
		return mSupportPeaks;
	}
	
	@Override
	public int compareTo( CTopology o ) {
		int temp = this.mType.compareTo( o.mType );
		if ( temp == 0 )
		{
			int result = mFormula.compareTo(o.mFormula);
			if ( result == 0 )
				return -Double.compare(mScore, o.mScore);
			return result;
		}
		return temp;	
	}
}
