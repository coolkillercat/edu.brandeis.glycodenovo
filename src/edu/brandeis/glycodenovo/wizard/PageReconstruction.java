<<<<<<< .mine
/**
 * @author Wangshu Hong
 * The second wizard page
 * Set necessary parameters for analysis
 */

package edu.brandeis.glycodenovo.wizard;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.grits.toolbox.core.dataShare.PropertyHandler;
import org.grits.toolbox.core.datamodel.Entry;
import org.grits.toolbox.core.datamodel.property.ProjectProperty;
import org.grits.toolbox.core.datamodel.util.DataModelSearch;
import org.grits.toolbox.entry.ms.property.MassSpecProperty;
import org.grits.toolbox.entry.ms.property.datamodel.MSPropertyDataFile;
import org.grits.toolbox.ms.file.MSFile;

import edu.brandeis.glycodenovo.core.CGlycoDeNovo;
import edu.brandeis.glycodenovo.core.CSpectrum;
import edu.brandeis.glycodenovo.datamodel.Save;
import edu.brandeis.glycodenovo.datamodel.SettingForm;

public class PageReconstruction extends WizardPage {
	private Composite 		mContainer;
	private SettingForm 	mForm;
	private Entry 			mAnnotationEntry;
	
	private CGlycoDeNovo	mGlycoDeNovo;
	private static final Logger logger = Logger.getLogger(PageReconstruction.class);

	protected PageReconstruction(String pageName, SettingForm form) {
		super(pageName);
		setTitle("Topology Reconstruction");
		this.mForm = form;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite a_parent) {
		// TODO Auto-generated method stub
		mContainer = new Composite(a_parent, SWT.NONE);
		
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		gridLayout.makeColumnsEqualWidth = true;
		mContainer.setLayout(gridLayout);
		
		GridData gdRecon = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gdRecon.horizontalSpan = 3;
		gdRecon.grabExcessHorizontalSpace = true;

		Label header = new Label(this.mContainer, SWT.NONE);
		header.setText("Set reconstruction parameters:");
		header.setLayoutData(gdRecon);
		
		Button check2H = new Button(mContainer, SWT.CHECK);
		check2H.setText("Check 2H");
		check2H.addSelectionListener ( new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent a_e) {
				Button btn = (Button) a_e.getSource();
				mForm.setCheck2H(btn.getSelection());
				getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent a_e) {
				// TODO Auto-generated method stub
			}
		} );

		Button checkGap = new Button(mContainer, SWT.CHECK);
		checkGap.setText("Check Gap");
		checkGap.addSelectionListener( new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent a_e) {
				Button btn = (Button) a_e.getSource();
				mForm.setCheckGap(btn.getSelection());
				getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent a_e) {
				// TODO Auto-generated method stub
			}
		} );
		checkGap.setLayoutData(gdRecon);

		createSetReconstructionPPM();

		Label labelEmpty = new Label( this.mContainer, SWT.NONE);
		labelEmpty.setLayoutData(gdRecon);

		createReconstructionButton();
		
		getContainer().updateButtons();

		setControl(mContainer);
	}

	/**
	 * Let the user type in ppm
	 */
	private void createSetReconstructionPPM() {
		new Label(mContainer, SWT.NONE).setText("Resolution (ppm):");

		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 1;

		Text text = new Text(mContainer, SWT.BORDER);
		text.setMessage("resolution");
		text.setLayoutData(gridData);
		
		text.setText("5"); // set the default value
		updateReconstructionPPM(text.getText());

		text.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent a_e) {
				updateReconstructionPPM(text.getText());
				getContainer().updateButtons();
			}
		});
	}

	private void updateReconstructionPPM(String input) {
		if (input.length() != 0) {
			try {
				double ppm = Double.parseDouble(input);
				if ( ppm != mForm.getReconstructionPPM() )
					mForm.setReconstructionPPM(ppm);
			} catch (NumberFormatException e) {
				mForm.setReconstructionPPM(-1);
				MessageDialog.openError(mContainer.getShell(), "Error", "Only numerical value is supported for ppm");
			}
		} else {
			mForm.setReconstructionPPM(-1);
		}
	}

	/**
	 * Create GUI component and call other method to process data
	 */
	private void createReconstructionButton() {
		Button process = new Button(mContainer, SWT.PUSH);
		process.setText("Reconstruct Topolopies");
		
		process.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				reconstruct();
				mForm.setReconstructed();
				String filename = mForm.getOptionalResName();
				if ( filename != null )
					mForm.getSpectrum().outputTXT(filename, mForm.getCheck2H(), mForm.getCheckGap());
				getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
			}
			
		});
	}

	private void reconstruct() {
		CSpectrum spec = this.mForm.getSpectrum();
		spec.specProcessing();
		
		mGlycoDeNovo = new CGlycoDeNovo( this.mForm.getReconstructionPPM(), this.mForm.getCheck2H(), this.mForm.getCheckGap() );
		mGlycoDeNovo.interpretPeaks(spec);
		mGlycoDeNovo.reconstructFormulas();
	}

	
	public SettingForm getForm() {
		return mForm;
	}

	@Override
	public boolean canFlipToNextPage() {
		return this.mForm.isReconstructed();
	}
	
	@Override
	/**
	 * Finishing
	 */
	public IWizardPage getNextPage() {
		/* Modified by Hong @ 8/1/2019
		IWizard wizard = getWizard();
		IWizardPage page = wizard.getNextPage(this);
		try {
			ExportPage exportPage = (ExportPage)page;
			// exportPage.saveTxt();
			return exportPage;
		} catch (ClassCastException e) {
			setErrorMessage("Internal Error");
			logger.error("GlycoDeNovo: at ProcessPage, Downcasting Error");
		}
		*/
		return null;
	}
	
	/**
	 * This method supposed to create archives that could be read by Grits GUI components
	 * Copied from the save() function in ExportPage.java, which was added by Sena.
	 * ExportPage was retired.
	 */
	public void save() {
		Entry msEntry = mForm.getEntry();
		final MassSpecProperty prop = (MassSpecProperty) msEntry.getProperty();
		MSPropertyDataFile dataFile = mForm.getDataFile();
		String workspaceLocation = PropertyHandler.getVariable("workspace_location");
		String projectName = DataModelSearch.findParentByType(msEntry, ProjectProperty.TYPE).getDisplayName();
		String pathToFile = workspaceLocation + projectName + File.separator + MassSpecProperty.getFoldername();
		MSFile msFile = dataFile.getMSFileWithReader(pathToFile, prop.getMassSpecMetaData().getMsExperimentType());
		mForm.updateResultName();
		Save save = new Save(mForm, msFile);
		this.mAnnotationEntry = save.save();
	}
	
	
	public Entry[] getResult() {
		return new Entry[]{mForm.getEntry(), this.mAnnotationEntry};
	}
}
||||||| .r3587
/**
 * @author Wangshu Hong
 * The second wizard page
 * Set necessary parameters for analysis
 */

package edu.brandeis.glycodenovo.wizard;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.grits.toolbox.core.dataShare.PropertyHandler;
import org.grits.toolbox.core.datamodel.Entry;
import org.grits.toolbox.core.datamodel.property.ProjectProperty;
import org.grits.toolbox.core.datamodel.util.DataModelSearch;
import org.grits.toolbox.entry.ms.property.MassSpecProperty;
import org.grits.toolbox.entry.ms.property.datamodel.MSPropertyDataFile;
import org.grits.toolbox.ms.file.MSFile;

import edu.brandeis.glycodenovo.core.CGlycoDeNovo;
import edu.brandeis.glycodenovo.core.CSpectrum;
import edu.brandeis.glycodenovo.datamodel.Save;
import edu.brandeis.glycodenovo.datamodel.SettingForm;

public class PageReconstruction extends WizardPage {
	private Composite 		mContainer;
	private SettingForm 	mForm;
	private Entry 			mAnnotationEntry;
	
	private CGlycoDeNovo	mGlycoDeNovo;
	private static final Logger logger = Logger.getLogger(PageReconstruction.class);

	protected PageReconstruction(String pageName, SettingForm form) {
		super(pageName);
		setTitle("Topology Reconstruction");
		this.mForm = form;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite a_parent) {
		// TODO Auto-generated method stub
		mContainer = new Composite(a_parent, SWT.NONE);
		
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		gridLayout.makeColumnsEqualWidth = true;
		mContainer.setLayout(gridLayout);
		
		GridData gdRecon = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gdRecon.horizontalSpan = 3;
		gdRecon.grabExcessHorizontalSpace = true;

		Label header = new Label(this.mContainer, SWT.NONE);
		header.setText("Set reconstruction parameters:");
		header.setLayoutData(gdRecon);
		
		Button check2H = new Button(mContainer, SWT.CHECK);
		check2H.setText("Check 2H");
		check2H.addSelectionListener ( new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent a_e) {
				Button btn = (Button) a_e.getSource();
				mForm.setCheck2H(btn.getSelection());
				getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent a_e) {
				// TODO Auto-generated method stub
			}
		} );

		Button checkGap = new Button(mContainer, SWT.CHECK);
		checkGap.setText("Check Gap");
		checkGap.addSelectionListener( new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent a_e) {
				Button btn = (Button) a_e.getSource();
				mForm.setCheckGap(btn.getSelection());
				getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent a_e) {
				// TODO Auto-generated method stub
			}
		} );
		checkGap.setLayoutData(gdRecon);

		createSetReconstructionPPM();

		Label labelEmpty = new Label( this.mContainer, SWT.NONE);
		labelEmpty.setLayoutData(gdRecon);

		createReconstructionButton();
		
		getContainer().updateButtons();

		setControl(mContainer);
	}

	/**
	 * Let the user type in ppm
	 */
	private void createSetReconstructionPPM() {
		new Label(mContainer, SWT.NONE).setText("Resolution (ppm):");

		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 1;

		Text text = new Text(mContainer, SWT.BORDER);
		text.setMessage("resolution");
		text.setLayoutData(gridData);
		
		text.setText("5"); // set the default value
		updateReconstructionPPM(text.getText());

		text.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent a_e) {
				updateReconstructionPPM(text.getText());
				getContainer().updateButtons();
			}
		});
	}

	private void updateReconstructionPPM(String input) {
		if (input.length() != 0) {
			try {
				double ppm = Double.parseDouble(input);
				if ( ppm != mForm.getReconstructionPPM() )
					mForm.setReconstructionPPM(ppm);
			} catch (NumberFormatException e) {
				mForm.setReconstructionPPM(-1);
				MessageDialog.openError(mContainer.getShell(), "Error", "Only numerical value is supported for ppm");
			}
		} else {
			mForm.setReconstructionPPM(-1);
		}
	}

	/**
	 * Create GUI component and call other method to process data
	 */
	private void createReconstructionButton() {
		Button process = new Button(mContainer, SWT.PUSH);
		process.setText("Reconstruct Topolopies");
		
		process.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				reconstruct();
				mForm.setReconstructed();
				String filename = mForm.getOptionalResName();
				if ( filename != null )
					mForm.getSpectrum().outputTXT(filename, mForm.getCheck2H(), mForm.getCheckGap());
				getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
			}
			
		});
	}

	private void reconstruct() {
		CSpectrum spec = this.mForm.getSpectrum();
		spec.specProcessing();
		
		mGlycoDeNovo = new CGlycoDeNovo( this.mForm.getReconstructionPPM(), this.mForm.getCheck2H(), this.mForm.getCheckGap() );
		mGlycoDeNovo.interpretPeaks(spec);
		mGlycoDeNovo.reconstructFormulas();
	}

	
	public SettingForm getForm() {
		return mForm;
	}

	@Override
	public boolean canFlipToNextPage() {
		return this.mForm.isReconstructed();
	}
	
	@Override
	/**
	 * Finishing
	 */
	public IWizardPage getNextPage() {
		/* Modified by Hong @ 8/1/2019
		IWizard wizard = getWizard();
		IWizardPage page = wizard.getNextPage(this);
		try {
			ExportPage exportPage = (ExportPage)page;
			// exportPage.saveTxt();
			return exportPage;
		} catch (ClassCastException e) {
			setErrorMessage("Internal Error");
			logger.error("GlycoDeNovo: at ProcessPage, Downcasting Error");
		}
		*/
		return null;
	}
	
	/**
	 * This method supposed to create archives that could be read by Grits GUI components
	 * Copied from the save() function in ExportPage.java, which was added by Sena.
	 * ExportPage was retired.
	 */
	public void save() {
		Entry msEntry = mForm.getEntry();
		final MassSpecProperty prop = (MassSpecProperty) msEntry.getProperty();
		MSPropertyDataFile dataFile = mForm.getDataFile();
		String workspaceLocation = PropertyHandler.getVariable("workspace_location");
		String projectName = DataModelSearch.findParentByType(msEntry, ProjectProperty.TYPE).getDisplayName();
		String pathToFile = workspaceLocation + projectName + File.separator + MassSpecProperty.getFoldername();
		MSFile msFile = dataFile.getMSFileWithReader(pathToFile, prop.getMassSpecMetaData().getMsExperimentType());
		mForm.updateResultName();
		Save save = new Save(mForm, msFile);
		this.mAnnotationEntry = save.save();
	}
	
	
	public Entry[] getResult() {
		return new Entry[]{mForm.getEntry(), this.mAnnotationEntry};
	}
}
=======
/**
 * @author Wangshu Hong
 * The second wizard page
 * Set necessary parameters for analysis
 */

package edu.brandeis.glycodenovo.wizard;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.grits.toolbox.core.dataShare.PropertyHandler;
import org.grits.toolbox.core.datamodel.Entry;
import org.grits.toolbox.core.datamodel.property.ProjectProperty;
import org.grits.toolbox.core.datamodel.util.DataModelSearch;
import org.grits.toolbox.entry.ms.property.MassSpecProperty;
import org.grits.toolbox.entry.ms.property.datamodel.MSPropertyDataFile;
import org.grits.toolbox.ms.file.MSFile;

import edu.brandeis.glycodenovo.core.CGlycoDeNovo;
import edu.brandeis.glycodenovo.core.CSpectrum;
import edu.brandeis.glycodenovo.datamodel.Save;
import edu.brandeis.glycodenovo.datamodel.SettingForm;

public class PageReconstruction extends WizardPage {
	private Composite 		mContainer;
	private SettingForm 	mForm;
	private Entry 			mAnnotationEntry;
	
	private CGlycoDeNovo	mGlycoDeNovo;
	private static final Logger logger = Logger.getLogger(PageReconstruction.class);

	protected PageReconstruction(String pageName, SettingForm form) {
		super(pageName);
		setTitle("Topology Reconstruction");
		this.mForm = form;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite a_parent) {
		// TODO Auto-generated method stub
		mContainer = new Composite(a_parent, SWT.NONE);
		
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		gridLayout.makeColumnsEqualWidth = true;
		mContainer.setLayout(gridLayout);
		
		GridData gdRecon = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gdRecon.horizontalSpan = 3;
		gdRecon.grabExcessHorizontalSpace = true;

		Label header = new Label(this.mContainer, SWT.NONE);
		header.setText("Set reconstruction parameters:");
		header.setLayoutData(gdRecon);
		
		Button check2H = new Button(mContainer, SWT.CHECK);
		check2H.setText("Check 2H");
		check2H.addSelectionListener ( new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent a_e) {
				Button btn = (Button) a_e.getSource();
				mForm.setCheck2H(btn.getSelection());
				getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent a_e) {
				// TODO Auto-generated method stub
			}
		} );

		Button checkGap = new Button(mContainer, SWT.CHECK);
		checkGap.setText("Check Gap");
		checkGap.addSelectionListener( new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent a_e) {
				Button btn = (Button) a_e.getSource();
				mForm.setCheckGap(btn.getSelection());
				getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent a_e) {
				// TODO Auto-generated method stub
			}
		} );
		checkGap.setLayoutData(gdRecon);

		createSetReconstructionPPM();

		createSetReconstructionBranchNumber();

		Label labelEmpty = new Label( this.mContainer, SWT.NONE);
		labelEmpty.setLayoutData(gdRecon);

		createReconstructionButton();
		
		getContainer().updateButtons();

		setControl(mContainer);
	}

	/**
	 * Let the user type in ppm
	 */
	private void createSetReconstructionPPM() {
		new Label(mContainer, SWT.NONE).setText("Resolution (ppm):");

		GridData gridData = new GridData( GridData.HORIZONTAL_ALIGN_BEGINNING );
		gridData.horizontalSpan = 2;
		gridData.minimumWidth = 50;

		Text text = new Text(mContainer, SWT.BORDER);
		text.setMessage("resolution");
		text.setLayoutData(gridData);
		
		text.setText("5"); // set the default value
		updateReconstructionPPM(text.getText());

		text.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent a_e) {
				updateReconstructionPPM(text.getText());
				getContainer().updateButtons();
			}
		});
	}

	private void updateReconstructionPPM(String input) {
		if (input.length() != 0) {
			try {
				double ppm = Double.parseDouble(input);
				if ( ppm != mForm.getReconstructionPPM() )
					mForm.setReconstructionPPM(ppm);
			} catch (NumberFormatException e) {
				mForm.setReconstructionPPM(-1);
				MessageDialog.openError(mContainer.getShell(), "Error", "Only numerical value is supported for ppm");
			}
		} else {
			mForm.setReconstructionPPM(-1);
		}
	}

	private void createSetReconstructionBranchNumber() {
		new Label(mContainer, SWT.NONE).setText("Branch number (2, 3, or 4):");

		GridData gridData = new GridData( GridData.HORIZONTAL_ALIGN_BEGINNING );
		gridData.horizontalSpan = 2;
		gridData.minimumWidth = 50;

		Text text = new Text(mContainer, SWT.BORDER);
		text.setMessage("Branch number");
		text.setLayoutData(gridData);
		
		text.setText( "2" ); // set the default value
		updateReconstructionBranchNumber( "2" );

		text.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent a_e) {
				updateReconstructionBranchNumber(text.getText());
				getContainer().updateButtons();
			}
		});
	}

	private void updateReconstructionBranchNumber(String input) {
		if (input.length() != 0) {
			try {
				int bn = Integer.parseInt( input );
				if ( bn < 2 || bn > 4 )
					MessageDialog.openError(mContainer.getShell(), "Error", "Branch number should be between 2 and 4!");
				else if ( bn != mForm.getReconstructionBranchNumber() )
					mForm.setReconstructionBranchNumber( bn );
			} catch (NumberFormatException e) {
				MessageDialog.openError(mContainer.getShell(), "Error", "Branch number should be between 2 and 4!");
			}
		} else {
			mForm.setReconstructionBranchNumber( 2 );
		}
	}

	/**
	 * Create GUI component and call other method to process data
	 */
	private void createReconstructionButton() {
		Button process = new Button(mContainer, SWT.PUSH);
		process.setText("Reconstruct Topolopies");
		
		process.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				reconstruct();
				mForm.setReconstructed();
				String filename = mForm.getOptionalResName();
				if ( filename != null )
					mForm.getSpectrum().outputTXT(filename, mForm.getCheck2H(), mForm.getCheckGap());
				getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
			}
			
		});
	}

	private void reconstruct() {
		CSpectrum spec = this.mForm.getSpectrum();
		spec.specProcessing();
		
		mGlycoDeNovo = new CGlycoDeNovo( this.mForm.getReconstructionPPM(), this.mForm.getCheck2H(), this.mForm.getCheckGap() );
		mGlycoDeNovo.setMaxBranchNum( this.mForm.getReconstructionBranchNumber() );
		mGlycoDeNovo.interpretPeaks(spec);
		mGlycoDeNovo.reconstructFormulas();
	}

	
	public SettingForm getForm() {
		return mForm;
	}

	@Override
	public boolean canFlipToNextPage() {
		return this.mForm.isReconstructed();
	}
	
	@Override
	/**
	 * Finishing
	 */
	public IWizardPage getNextPage() {
		/* Modified by Hong @ 8/1/2019
		IWizard wizard = getWizard();
		IWizardPage page = wizard.getNextPage(this);
		try {
			ExportPage exportPage = (ExportPage)page;
			// exportPage.saveTxt();
			return exportPage;
		} catch (ClassCastException e) {
			setErrorMessage("Internal Error");
			logger.error("GlycoDeNovo: at ProcessPage, Downcasting Error");
		}
		*/
		return null;
	}
	
	/**
	 * This method supposed to create archives that could be read by Grits GUI components
	 * Copied from the save() function in ExportPage.java, which was added by Sena.
	 * ExportPage was retired.
	 */
	public void save() {
		Entry msEntry = mForm.getEntry();
		final MassSpecProperty prop = (MassSpecProperty) msEntry.getProperty();
		MSPropertyDataFile dataFile = mForm.getDataFile();
		String workspaceLocation = PropertyHandler.getVariable("workspace_location");
		String projectName = DataModelSearch.findParentByType(msEntry, ProjectProperty.TYPE).getDisplayName();
		String pathToFile = workspaceLocation + projectName + File.separator + MassSpecProperty.getFoldername();
		MSFile msFile = dataFile.getMSFileWithReader(pathToFile, prop.getMassSpecMetaData().getMsExperimentType());
		mForm.updateResultName();
		Save save = new Save(mForm, msFile);
		this.mAnnotationEntry = save.save();
	}
	
	
	public Entry[] getResult() {
		return new Entry[]{mForm.getEntry(), this.mAnnotationEntry};
	}
}
>>>>>>> .r3632
