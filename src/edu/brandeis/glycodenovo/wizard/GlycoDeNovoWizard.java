/**
 * @author Wangshu Hong
 * Main part of this plug-in
 * Controls the work flow and contains relevent
 * data for GlycoDeNovo
 */

package edu.brandeis.glycodenovo.wizard;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.grits.toolbox.core.datamodel.Entry;

import edu.brandeis.glycodenovo.datamodel.SettingForm;

public class GlycoDeNovoWizard extends Wizard {
	//private MSFileChooser 		pageChooseMSData;
	private PageEntryChooser		pageEntryChooser;
	private PageReconstruction		pageReconstructionSetting;
	//private ExportPage 			exporter;
	private SettingForm 			mForm;

	public GlycoDeNovoWizard() {
		super();
		setWindowTitle("GlycoDeNovo");
		mForm = new SettingForm(true);
	}
	
	public SettingForm getSettingForm() {
		return mForm;
	}

	@Override
	public String getWindowTitle() {
		return "GlycoDeNovo";
	}

	@Override
	public void addPages() {
		//pageChooseMSData = new MSFileChooser("Select MS Data", mForm);
		pageEntryChooser = new PageEntryChooser("Select Entry", mForm);
		pageReconstructionSetting = new PageReconstruction("Set and Run Reconstruction", mForm);
		//exporter = new ExportPage("visualize", form);
		addPage(pageEntryChooser);
		addPage(pageReconstructionSetting);
		//addPage(exporter);
	}

	@Override
	public boolean canFinish() {
		// TODO: Check whether the program can finish
		return pageReconstructionSetting.canFlipToNextPage();
	}

	@Override
	public IWizardPage getNextPage(IWizardPage currentPage) {
		//if (currentPage == pageChooseMSData || currentPage == pageEntryChooser) {
		if (currentPage == pageEntryChooser) {
			System.out.println(mForm.getEntry().getDisplayName());
			return pageReconstructionSetting;
		//} else if (currentPage == pageReconstructionSetting) {
		//	return exporter;
		}
		return null;
	}
	
	public Entry[] getResult() {
		//return exporter.getResult();
		return pageReconstructionSetting.getResult();
	}

	@Override
	public boolean performFinish() {
		// Save the reconstruction result before finishing.
		this.pageReconstructionSetting.save();
		return true;
	}
}
