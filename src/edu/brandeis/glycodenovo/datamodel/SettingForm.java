<<<<<<< .mine
/**
 * @author Wangshu Hong
 * 
 * This class stores the information regarding settings for the entire
 * algorithm, including the file path for mzXML files, 
 * some critical settings for the algorithm and 
 * some parameters of the equipment used for experiment. 
 * 
 */

package edu.brandeis.glycodenovo.datamodel;

import org.grits.toolbox.core.datamodel.Entry;
import org.grits.toolbox.entry.ms.property.datamodel.MSPropertyDataFile;
import org.grits.toolbox.ms.om.data.Method;

import edu.brandeis.glycodenovo.core.CSpectrum;

public class SettingForm {	
	private boolean		isBrandeisFormat = true; // true if data file format is in Brandeis format.
	private String		mPath = null;
	private String		mFileName = null;
	private String		mOptionalResultFileName = null;
	
	private CSpectrum 	mSpectrum = null;
	private String		mMetal = null;
	private String		mExperimentType = Method.MS_TYPE_INFUSION;
	private String		mDerivationMethod = null;
	private String		mReducingEnd = null;
	private boolean 	mPermethylated;
	private String 		mDescription = null;
	
	private boolean 	mReconstructionCheck2H;
	private boolean 	mReconstructionCheckGap;
	private double		mReconstructionPPM = -1;
	
	private int			mCheck2H_previous = 0;
	private int			mCheckGap_previous = 0;
	private double		mPPM_previous = -1;
	
	//private final String[] legal_reducing_ends = { "Deuterium", "Aminopyridine", "O18", "PRAGS", "Reduced" };
	//private final String[] metals = { "Lithium", "Sodium", "Cesium", "H" };
	//private final String[] legal_exp_type = { Method.MS_TYPE_INFUSION, Method.MS_TYPE_LC };
	private final String[] legal_exp_type = { Method.MS_TYPE_INFUSION };
	
	private String				mResultFileName;
	private Entry				mEntry;
	private MSPropertyDataFile	mDataFile;

	/**
	 * Changed the format of input on July 5, 2018
	 * @param isTxt is the input a text file
	 */
	public SettingForm(boolean BrandeisFormat) {
		this.isBrandeisFormat = BrandeisFormat;
	}
	
	public void setSpectrum(CSpectrum spectrum) {
		this.mSpectrum = spectrum;
		this.mDerivationMethod = spectrum.getDerivationMethod();
		this.mMetal = spectrum.getMetal();
		this.mPermethylated = spectrum.getPermethyldated();
		this.mReducingEnd = spectrum.getReducingEndMode();
		if ( mReconstructionPPM < 0 )
			this.mReconstructionPPM = spectrum.getMassAccuracyPPM();
		
		this.mDescription = "Metal: " + spectrum.getMetal() + 
						"\nPrecursor: " + spectrum.getPrecursorRawMZ();
		String temp = null;
		temp = spectrum.getDerivationMethod();
		if ( temp != null )
			this.mDescription += "\n" + "Derivation: " + temp;
		temp = spectrum.getReducingEndMode();
		if ( temp != null )
			this.mDescription += "\n" + "Reducing end mode: " + temp;

		Double massAccu = -1.0;
		massAccu = spectrum.getMassAccuracyPPM();
		if ( massAccu > 0 )
			this.mDescription += "\nMass accuracy (PPM): " + massAccu;
		
	}
	
	public CSpectrum getSpectrum() {
		return this.mSpectrum;
	}
	
	public void setFilePath(String path, String file) {
		this.mPath = path;
		this.mFileName = file;
	}

	public String getFilePath() {
		return mPath + System.getProperty("file.separator") + mFileName;
	}

	public String getPath() {
		return mPath;
	}
	
	public boolean isPathValid() {
		return mPath != null && mFileName != null && this.mEntry != null;
	}

	public String getDerivationMethod() {
		return this.mDerivationMethod;
	}
	public void setDerivationMethod(String derivation) {
		this.mDerivationMethod = derivation;
	}
	
	public void setExperimentType(String type) {
		this.mExperimentType = type;
	}

	public String[] getLegalExperimentType() {
		return legal_exp_type;
	}

	public String getExperimentType() {
		return this.mExperimentType;
	}

	public void setReconstructionPPM(double ppm) {
		this.mReconstructionPPM = ppm;
	}

	public double getReconstructionPPM() {
		return this.mReconstructionPPM;
	}

	public void setCheck2H(boolean check_2H) {
		this.mReconstructionCheck2H = check_2H;
	}

	public boolean getCheck2H() {
		return mReconstructionCheck2H;
	}

	public void setCheckGap(boolean check_gap) {
		this.mReconstructionCheckGap = check_gap;
	}

	public boolean getCheckGap() {
		return mReconstructionCheckGap;
	}

	public void setReducingEnd(String reducing_end) {
		this.mReducingEnd = reducing_end;
	}

	public String getReducingEnd() {
		return this.mReducingEnd;
	}

	public void setMetal(String metal) {
		this.mMetal = metal;
	}

	public String getMetal() {
		return this.mMetal;
	}

	public void setPermethylated(boolean permethylated) {
		this.mPermethylated = permethylated;
	}

	public boolean getPermethylated() {
		return this.mPermethylated;
	}

	public void setResName(String name) {
		mResultFileName = name;
	}
	
	public String getResName() {
		return mResultFileName;
	}
	
	public void setOptionalResName(String name) {
		this.mOptionalResultFileName = name;
	}
	
	public String getOptionalResName() {
		return mOptionalResultFileName;
	}

	public void setEntry(Entry entry) {
		this.mEntry = entry;
	}
	
	public Entry getEntry() {
		return mEntry;
	}
	
	public void setDescription(String description) {
		this.mDescription = description;
	}
	
	public String getDescription() {
		return mDescription;
	}

	public MSPropertyDataFile getDataFile() {
		return mDataFile;
	}
	
	public void setDataFile(MSPropertyDataFile dataFile) {
		this.mDataFile = dataFile;
	}

	public boolean isReconstructed() {
		if ( this.mCheck2H_previous == 0 || this.mCheckGap_previous == 0 || this.mPPM_previous == -1 )
			return false;
		else {
			int c2h = this.mReconstructionCheck2H ? 1 : -1; 
			int cgh = this.mReconstructionCheckGap ? 1 : -1; 
			if ( ( c2h == this.mCheck2H_previous ) && ( cgh == this.mCheckGap_previous ) && 
				 ( this.mPPM_previous == this.mReconstructionPPM ) )
				return true;
		}
		return false;
	}
	
	public void setReconstructed()
	{
		this.mCheck2H_previous = this.mReconstructionCheck2H ? 1 : -1;
		this.mCheckGap_previous = this.mReconstructionCheckGap? 1 : -1;
		this.mPPM_previous = this.mReconstructionPPM;
	}
	
	/**
	 * This function is called only by PageReconstruction.save() at GlycoDeNovoWizard.performFinishing()
	 */
	public void updateResultName()
	{
		mResultFileName += ".PPM" + Integer.toString((int)this.mReconstructionPPM);
		if ( this.mReconstructionCheck2H )
			mResultFileName += ".2H"; 
		if ( this.mReconstructionCheckGap )
			mResultFileName += ".Gap"; 
	}
	
	/**
	 * Check whether this setting form is valid or not
	 * If the input is text file, just check ppm
	 * @return
	 */
	public boolean isValid() {
		if (isBrandeisFormat) {
			return this.mReconstructionPPM > 0;
		} 
		return this.mExperimentType != null && this.mReducingEnd != null && this.mMetal != null && this.mReconstructionPPM > 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Parameter Setting {");
		sb.append("\n\tAbsoulte Path: " + getFilePath());
		sb.append("\n\tExperiment Type: " + this.mExperimentType );
		sb.append("\n\tDerivation method: " + this.mDerivationMethod );
		sb.append("\n\tPPM: " + this.mReconstructionPPM );
		sb.append("\n\tMetal: " + this.mMetal );
		sb.append("\n\tReducing End Method: " + this.mReducingEnd );
		sb.append("\n}");
		return sb.toString();
	}
}
||||||| .r3587
/**
 * @author Wangshu Hong
 * 
 * This class stores the information regarding settings for the entire
 * algorithm, including the file path for mzXML files, 
 * some critical settings for the algorithm and 
 * some parameters of the equipment used for experiment. 
 * 
 */

package edu.brandeis.glycodenovo.datamodel;

import org.grits.toolbox.core.datamodel.Entry;
import org.grits.toolbox.entry.ms.property.datamodel.MSPropertyDataFile;
import org.grits.toolbox.ms.om.data.Method;

import edu.brandeis.glycodenovo.core.CSpectrum;

public class SettingForm {	
	private boolean		isBrandeisFormat = true; // true if data file format is in Brandeis format.
	private String		mPath = null;
	private String		mFileName = null;
	private String		mOptionalResultFileName = null;
	
	private CSpectrum 	mSpectrum = null;
	private String		mMetal = null;
	private String		mExperimentType = Method.MS_TYPE_INFUSION;
	private String		mDerivationMethod = null;
	private String		mReducingEnd = null;
	private boolean 	mPermethylated;
	private String 		mDescription = null;
	
	private boolean 	mReconstructionCheck2H;
	private boolean 	mReconstructionCheckGap;
	private double		mReconstructionPPM = -1;
	
	private int			mCheck2H_previous = 0;
	private int			mCheckGap_previous = 0;
	private double		mPPM_previous = -1;
	
	//private final String[] legal_reducing_ends = { "Deuterium", "Aminopyridine", "O18", "PRAGS", "Reduced" };
	//private final String[] metals = { "Lithium", "Sodium", "Cesium", "H" };
	//private final String[] legal_exp_type = { Method.MS_TYPE_INFUSION, Method.MS_TYPE_LC };
	private final String[] legal_exp_type = { Method.MS_TYPE_INFUSION };
	
	private String				mResultFileName;
	private Entry				mEntry;
	private MSPropertyDataFile	mDataFile;

	/**
	 * Changed the format of input on July 5, 2018
	 * @param isTxt is the input a text file
	 */
	public SettingForm(boolean BrandeisFormat) {
		this.isBrandeisFormat = BrandeisFormat;
	}
	
	public void setSpectrum(CSpectrum spectrum) {
		this.mSpectrum = spectrum;
		this.mDerivationMethod = spectrum.getDerivationMethod();
		this.mMetal = spectrum.getMetal();
		this.mPermethylated = spectrum.getPermethyldated();
		this.mReducingEnd = spectrum.getReducingEndMode();
		if ( mReconstructionPPM < 0 )
			this.mReconstructionPPM = spectrum.getMassAccuracyPPM();
		
		this.mDescription = "Metal: " + spectrum.getMetal() + 
						"\nPrecursor: " + spectrum.getPrecursorRawMZ();
		String temp = null;
		temp = spectrum.getDerivationMethod();
		if ( temp != null )
			this.mDescription += "\n" + "Derivation: " + temp;
		temp = spectrum.getReducingEndMode();
		if ( temp != null )
			this.mDescription += "\n" + "Reducing end mode: " + temp;

		Double massAccu = -1.0;
		massAccu = spectrum.getMassAccuracyPPM();
		if ( massAccu > 0 )
			this.mDescription += "\nMass accuracy (PPM): " + massAccu;
		
	}
	
	public CSpectrum getSpectrum() {
		return this.mSpectrum;
	}
	
	public void setFilePath(String path, String file) {
		this.mPath = path;
		this.mFileName = file;
	}

	public String getFilePath() {
		return mPath + System.getProperty("file.separator") + mFileName;
	}

	public String getPath() {
		return mPath;
	}
	
	public boolean isPathValid() {
		return mPath != null && mFileName != null && this.mEntry != null;
	}

	public String getDerivationMethod() {
		return this.mDerivationMethod;
	}
	public void setDerivationMethod(String derivation) {
		this.mDerivationMethod = derivation;
	}
	
	public void setExperimentType(String type) {
		this.mExperimentType = type;
	}

	public String[] getLegalExperimentType() {
		return legal_exp_type;
	}

	public String getExperimentType() {
		return this.mExperimentType;
	}

	public void setReconstructionPPM(double ppm) {
		this.mReconstructionPPM = ppm;
	}

	public double getReconstructionPPM() {
		return this.mReconstructionPPM;
	}

	public void setCheck2H(boolean check_2H) {
		this.mReconstructionCheck2H = check_2H;
	}

	public boolean getCheck2H() {
		return mReconstructionCheck2H;
	}

	public void setCheckGap(boolean check_gap) {
		this.mReconstructionCheckGap = check_gap;
	}

	public boolean getCheckGap() {
		return mReconstructionCheckGap;
	}

	public void setReducingEnd(String reducing_end) {
		this.mReducingEnd = reducing_end;
	}

	public String getReducingEnd() {
		return this.mReducingEnd;
	}

	public void setMetal(String metal) {
		this.mMetal = metal;
	}

	public String getMetal() {
		return this.mMetal;
	}

	public void setPermethylated(boolean permethylated) {
		this.mPermethylated = permethylated;
	}

	public boolean getPermethylated() {
		return this.mPermethylated;
	}

	public void setResName(String name) {
		mResultFileName = name;
	}
	
	public String getResName() {
		return mResultFileName;
	}
	
	public void setOptionalResName(String name) {
		this.mOptionalResultFileName = name;
	}
	
	public String getOptionalResName() {
		return mOptionalResultFileName;
	}

	public void setEntry(Entry entry) {
		this.mEntry = entry;
	}
	
	public Entry getEntry() {
		return mEntry;
	}
	
	public void setDescription(String description) {
		this.mDescription = description;
	}
	
	public String getDescription() {
		return mDescription;
	}

	public MSPropertyDataFile getDataFile() {
		return mDataFile;
	}
	
	public void setDataFile(MSPropertyDataFile dataFile) {
		this.mDataFile = dataFile;
	}

	public boolean isReconstructed() {
		if ( this.mCheck2H_previous == 0 || this.mCheckGap_previous == 0 || this.mPPM_previous == -1 )
			return false;
		else {
			int c2h = this.mReconstructionCheck2H ? 1 : -1; 
			int cgh = this.mReconstructionCheckGap ? 1 : -1; 
			if ( ( c2h == this.mCheck2H_previous ) && ( cgh == this.mCheckGap_previous ) && 
				 ( this.mPPM_previous == this.mReconstructionPPM ) )
				return true;
		}
		return false;
	}
	
	public void setReconstructed()
	{
		this.mCheck2H_previous = this.mReconstructionCheck2H ? 1 : -1;
		this.mCheckGap_previous = this.mReconstructionCheckGap? 1 : -1;
		this.mPPM_previous = this.mReconstructionPPM;
	}
	
	/**
	 * This function is called only by PageReconstruction.save() at GlycoDeNovoWizard.performFinishing()
	 */
	public void updateResultName()
	{
		mResultFileName += ".PPM" + Integer.toString((int)this.mReconstructionPPM);
		if ( this.mReconstructionCheck2H )
			mResultFileName += ".2H"; 
		if ( this.mReconstructionCheckGap )
			mResultFileName += ".Gap"; 
	}
	
	/**
	 * Check whether this setting form is valid or not
	 * If the input is text file, just check ppm
	 * @return
	 */
	public boolean isValid() {
		if (isBrandeisFormat) {
			return this.mReconstructionPPM > 0;
		} 
		return this.mExperimentType != null && this.mReducingEnd != null && this.mMetal != null && this.mReconstructionPPM > 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Parameter Setting {");
		sb.append("\n\tAbsoulte Path: " + getFilePath());
		sb.append("\n\tExperiment Type: " + this.mExperimentType );
		sb.append("\n\tDerivation method: " + this.mDerivationMethod );
		sb.append("\n\tPPM: " + this.mReconstructionPPM );
		sb.append("\n\tMetal: " + this.mMetal );
		sb.append("\n\tReducing End Method: " + this.mReducingEnd );
		sb.append("\n}");
		return sb.toString();
	}
}
=======
/**
 * @author Wangshu Hong
 * 
 * This class stores the information regarding settings for the entire
 * algorithm, including the file path for mzXML files, 
 * some critical settings for the algorithm and 
 * some parameters of the equipment used for experiment. 
 * 
 */

package edu.brandeis.glycodenovo.datamodel;

import org.grits.toolbox.core.datamodel.Entry;
import org.grits.toolbox.entry.ms.property.datamodel.MSPropertyDataFile;
import org.grits.toolbox.ms.om.data.Method;

import edu.brandeis.glycodenovo.core.CSpectrum;

public class SettingForm {	
	private boolean		isBrandeisFormat = true; // true if data file format is in Brandeis format.
	private String		mPath = null;
	private String		mFileName = null;
	private String		mOptionalResultFileName = null;
	
	private CSpectrum 	mSpectrum = null;
	private String		mMetal = null;
	private String		mExperimentType = Method.MS_TYPE_INFUSION;
	private String		mDerivationMethod = null;
	private String		mReducingEnd = null;
	private boolean 	mPermethylated;
	private String 		mDescription = null;
	
	private boolean 	mReconstructionCheck2H;
	private boolean 	mReconstructionCheckGap;
	private double		mReconstructionPPM = -1;
	private int			mReconstructionBranchNumber = 2;
	
	private int			mCheck2H_previous = 0;
	private int			mCheckGap_previous = 0;
	private double		mPPM_previous = -1;
	
	//private final String[] legal_reducing_ends = { "Deuterium", "Aminopyridine", "O18", "PRAGS", "Reduced" };
	//private final String[] metals = { "Lithium", "Sodium", "Cesium", "H" };
	//private final String[] legal_exp_type = { Method.MS_TYPE_INFUSION, Method.MS_TYPE_LC };
	private final String[] legal_exp_type = { Method.MS_TYPE_INFUSION };
	
	private String				mResultFileName;
	private Entry				mEntry;
	private MSPropertyDataFile	mDataFile;

	/**
	 * Changed the format of input on July 5, 2018
	 * @param isTxt is the input a text file
	 */
	public SettingForm(boolean BrandeisFormat) {
		this.isBrandeisFormat = BrandeisFormat;
	}
	
	public void setSpectrum(CSpectrum spectrum) {
		this.mSpectrum = spectrum;
		this.mDerivationMethod = spectrum.getDerivationMethod();
		this.mMetal = spectrum.getMetal();
		this.mPermethylated = spectrum.getPermethyldated();
		this.mReducingEnd = spectrum.getReducingEndMode();
		if ( mReconstructionPPM < 0 )
			this.mReconstructionPPM = spectrum.getMassAccuracyPPM();
		
		this.mDescription = "Metal: " + spectrum.getMetal() + 
						"\nPrecursor: " + spectrum.getPrecursorRawMZ();
		String temp = null;
		temp = spectrum.getDerivationMethod();
		if ( temp != null )
			this.mDescription += "\n" + "Derivation: " + temp;
		temp = spectrum.getReducingEndMode();
		if ( temp != null )
			this.mDescription += "\n" + "Reducing end mode: " + temp;

		Double massAccu = -1.0;
		massAccu = spectrum.getMassAccuracyPPM();
		if ( massAccu > 0 )
			this.mDescription += "\nMass accuracy (PPM): " + massAccu;
		
	}
	
	public CSpectrum getSpectrum() {
		return this.mSpectrum;
	}
	
	public void setFilePath(String path, String file) {
		this.mPath = path;
		this.mFileName = file;
	}

	public String getFilePath() {
		return mPath + System.getProperty("file.separator") + mFileName;
	}

	public String getPath() {
		return mPath;
	}
	
	public boolean isPathValid() {
		return mPath != null && mFileName != null && this.mEntry != null;
	}

	public String getDerivationMethod() {
		return this.mDerivationMethod;
	}
	public void setDerivationMethod(String derivation) {
		this.mDerivationMethod = derivation;
	}
	
	public void setExperimentType(String type) {
		this.mExperimentType = type;
	}

	public String[] getLegalExperimentType() {
		return legal_exp_type;
	}

	public String getExperimentType() {
		return this.mExperimentType;
	}

	public void setReconstructionPPM(double ppm) {
		this.mReconstructionPPM = ppm;
	}

	public double getReconstructionPPM() {
		return this.mReconstructionPPM;
	}

	public void setReconstructionBranchNumber(int num) {
		this.mReconstructionBranchNumber = num;
	}

	public int getReconstructionBranchNumber() {
		return this.mReconstructionBranchNumber;
	}

	public void setCheck2H(boolean check_2H) {
		this.mReconstructionCheck2H = check_2H;
	}

	public boolean getCheck2H() {
		return mReconstructionCheck2H;
	}

	public void setCheckGap(boolean check_gap) {
		this.mReconstructionCheckGap = check_gap;
	}

	public boolean getCheckGap() {
		return mReconstructionCheckGap;
	}

	public void setReducingEnd(String reducing_end) {
		this.mReducingEnd = reducing_end;
	}

	public String getReducingEnd() {
		return this.mReducingEnd;
	}

	public void setMetal(String metal) {
		this.mMetal = metal;
	}

	public String getMetal() {
		return this.mMetal;
	}

	public void setPermethylated(boolean permethylated) {
		this.mPermethylated = permethylated;
	}

	public boolean getPermethylated() {
		return this.mPermethylated;
	}

	public void setResName(String name) {
		mResultFileName = name;
	}
	
	public String getResName() {
		return mResultFileName;
	}
	
	public void setOptionalResName(String name) {
		this.mOptionalResultFileName = name;
	}
	
	public String getOptionalResName() {
		return mOptionalResultFileName;
	}

	public void setEntry(Entry entry) {
		this.mEntry = entry;
	}
	
	public Entry getEntry() {
		return mEntry;
	}
	
	public void setDescription(String description) {
		this.mDescription = description;
	}
	
	public String getDescription() {
		return mDescription;
	}

	public MSPropertyDataFile getDataFile() {
		return mDataFile;
	}
	
	public void setDataFile(MSPropertyDataFile dataFile) {
		this.mDataFile = dataFile;
	}

	public boolean isReconstructed() {
		if ( this.mCheck2H_previous == 0 || this.mCheckGap_previous == 0 || this.mPPM_previous == -1 )
			return false;
		else {
			int c2h = this.mReconstructionCheck2H ? 1 : -1; 
			int cgh = this.mReconstructionCheckGap ? 1 : -1; 
			if ( ( c2h == this.mCheck2H_previous ) && ( cgh == this.mCheckGap_previous ) && 
				 ( this.mPPM_previous == this.mReconstructionPPM ) )
				return true;
		}
		return false;
	}
	
	public void setReconstructed()
	{
		this.mCheck2H_previous = this.mReconstructionCheck2H ? 1 : -1;
		this.mCheckGap_previous = this.mReconstructionCheckGap? 1 : -1;
		this.mPPM_previous = this.mReconstructionPPM;
	}
	
	/**
	 * This function is called only by PageReconstruction.save() at GlycoDeNovoWizard.performFinishing()
	 */
	public void updateResultName()
	{
		mResultFileName += ".PPM" + Integer.toString((int)this.mReconstructionPPM);
		if ( this.mReconstructionCheck2H )
			mResultFileName += ".2H"; 
		if ( this.mReconstructionCheckGap )
			mResultFileName += ".Gap"; 
	}
	
	/**
	 * Check whether this setting form is valid or not
	 * If the input is text file, just check ppm
	 * @return
	 */
	public boolean isValid() {
		if (isBrandeisFormat) {
			return this.mReconstructionPPM > 0;
		} 
		return this.mExperimentType != null && this.mReducingEnd != null && this.mMetal != null && this.mReconstructionPPM > 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Parameter Setting {");
		sb.append("\n\tAbsoulte Path: " + getFilePath());
		sb.append("\n\tExperiment Type: " + this.mExperimentType );
		sb.append("\n\tDerivation method: " + this.mDerivationMethod );
		sb.append("\n\tPPM: " + this.mReconstructionPPM );
		sb.append("\n\tMetal: " + this.mMetal );
		sb.append("\n\tReducing End Method: " + this.mReducingEnd );
		sb.append("\n}");
		return sb.toString();
	}
}
>>>>>>> .r3632
