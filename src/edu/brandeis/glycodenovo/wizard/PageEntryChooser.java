/**
 * @author Wangshu Hong
 * 
 * The first wizard page in GlycoDeNovo
 * Allow user to select MS Entry and the
 * raw data file
 */

package edu.brandeis.glycodenovo.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * This wizard page allows user to select the input txt file
 */

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.grits.toolbox.core.dataShare.PropertyHandler;
import org.grits.toolbox.core.datamodel.Entry;
import org.grits.toolbox.core.datamodel.dialog.ProjectExplorerDialog;
import org.grits.toolbox.core.datamodel.property.Property;
import org.grits.toolbox.core.utilShare.ListenerFactory;
import org.grits.toolbox.entry.ms.mycustom.property.datamodel.MyCustomMassSpecProperty;
import org.grits.toolbox.entry.ms.property.MassSpecProperty;
import org.grits.toolbox.entry.ms.property.datamodel.MSPropertyDataFile;

import edu.brandeis.glycodenovo.core.CSpectrum;
import edu.brandeis.glycodenovo.datamodel.SettingForm;
import edu.brandeis.glycodenovo.datamodel.TableView;

public class PageEntryChooser extends WizardPage {
	private Composite 					mContainer;
	private SettingForm 				mForm;
	private Text 						mDescriptionText;
	private List<MSPropertyDataFile> 	mAnnotationFiles;

	protected PageEntryChooser(String pageName, SettingForm form) {
		super(pageName);
		setTitle("GlycoDeNovo: Reconstruct Topologies.");
		this.mForm = form;
	}

	@Override
	public boolean canFlipToNextPage() {
		return mForm.isPathValid();
	}

	@Override
	public void createControl(Composite parent) {
		mContainer = new Composite(parent, SWT.NONE);
		mContainer.setLayout(new GridLayout(3, false));

		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 2;
		
		Button btnSelectEntry = new Button(mContainer, SWT.NONE);
		btnSelectEntry.setText("Select an Entry");
		Label empty = new Label(mContainer, SWT.NONE); // allows the btnSelectEntry button to occupy the whole row.
		empty.setLayoutData(gridData);

		Label entry_name_label = new Label(mContainer, SWT.NONE);
		entry_name_label.setText("Entry Name");
		Text entry_name = new Text(mContainer, SWT.READ_ONLY );
		entry_name.setLayoutData(gridData);

		Label res_label = new Label(mContainer, SWT.NONE);
		res_label.setText("Result Name (defaut)");
		Text res_name = new Text(mContainer, SWT.READ_ONLY );
		res_name.setLayoutData(gridData);
		
		Button button_OptionalResultFile = new Button(mContainer, SWT.NONE);
		button_OptionalResultFile.setText("Set an Optional Result File");
		Text optional_res_name = new Text(mContainer, SWT.READ_ONLY );
		optional_res_name.setLayoutData(gridData);
		button_OptionalResultFile.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fileDlg = new FileDialog(mContainer.getShell(), SWT.SAVE);
				fileDlg.setText("Select the location that you want to save result of GlycoDeNovo");
				String filename = fileDlg.open();
				System.out.println(filename);
				if (filename != null) {
					mForm.setOptionalResName(filename);
					optional_res_name.setText(filename);
				}
				getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
			}
		});

		new Label(mContainer, SWT.NONE).setText("Select the original data file:");
		Combo combo = new Combo(mContainer, SWT.SINGLE | SWT.READ_ONLY);
		combo.setLayoutData(gridData);		
		combo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent a_e) {
				selectMSProperty(combo);
				getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent a_e) {
				// TODO Auto-generated method stub
			}
		});

		btnSelectEntry.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				Entry entry = selectEntry();
				mForm.setEntry(entry);
				getContainer().updateButtons();
				updateSelection(entry_name, res_name, combo);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
			}
		});	
		

		setPageComplete(false);

		createDescription(mContainer);
		
		createButtonReviewData();

		setControl(mContainer);
	}

	/**
	 * Create a read only text box to show the data information
	 */
	private void createDescription(Composite parent) {
		GridData descriptionData = new GridData();
		Label descriptionLabel = new Label(parent, SWT.NONE);
		descriptionData.grabExcessHorizontalSpace = true;
		descriptionData.horizontalSpan = 7;
		descriptionLabel.setText("Data file description");
		descriptionLabel.setLayoutData(descriptionData);

		GridData descriptionTextData = new GridData(GridData.FILL_BOTH);
		descriptionTextData.minimumHeight = 70;
		descriptionTextData.grabExcessHorizontalSpace = true;
		descriptionTextData.horizontalSpan = 7;
		mDescriptionText = new Text(parent, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER | SWT.READ_ONLY );
		mDescriptionText.setLayoutData(descriptionTextData);
		mDescriptionText.addTraverseListener(ListenerFactory.getTabTraverseListener());
		mDescriptionText.addKeyListener(ListenerFactory.getCTRLAListener());
	}
	
	private void showDataInformation() {
		String description = this.mForm.getDescription();
		if ( description != null )
			this.mDescriptionText.setText( description );
		else
			this.mDescriptionText.setText("");
	}
	
	private void updateSelection(Text entry_name, Text res_name, Combo combo) {
		if (mForm.getEntry() != null) {
			entry_name.setText(mForm.getEntry().getDisplayName());
			res_name.setText(mForm.getEntry().getDisplayName() + ".GlycoDeNovo");
			mForm.setResName(res_name.getText());
			updateMSProperty(combo);
		} else {
			entry_name.setText("");
			res_name.setText("");
			mForm.setResName(null);
		}
	}

	/**
	 * Open a new dialog for selecting an entry
	 */
	private Entry selectEntry() {
		Shell newShell = new Shell(mContainer.getShell(), SWT.PRIMARY_MODAL | SWT.SHEET);
		ProjectExplorerDialog dlg = new ProjectExplorerDialog(newShell);
		//dlg.addFilter(MassSpecProperty.TYPE);
		dlg.addFilter(MyCustomMassSpecProperty.TYPE);
		dlg.setTitle("Select an MS entry");
		dlg.setMessage( "Choose an MS experiment" );
		dlg.open();
		return dlg.getEntry();
	}

	private void getAnnotationFilesForEntry() {
		mAnnotationFiles = new ArrayList<>();
		if (mForm.getEntry() != null) {
			Property prop = mForm.getEntry().getProperty();
			if (prop instanceof MassSpecProperty) {
				List<MSPropertyDataFile> files = ((MassSpecProperty) prop).getMassSpecMetaData().getAnnotationFiles();
				for (MSPropertyDataFile propertyDataFile : files) {
					mAnnotationFiles.add(propertyDataFile);
				}
			}
		}
	}
	
	private void selectMSProperty(Combo combo) {
		MSPropertyDataFile selected = mAnnotationFiles.get(combo.getSelectionIndex());
		mForm.setDataFile(selected);
		String workspace = PropertyHandler.getVariable("workspace_location");
		
		String path = workspace + findProjectName() + File.separator + "ms" + File.separator + selected.getName();
		int index = path.lastIndexOf(File.separator) + 1;
		String file = path.substring(index);
		path = path.substring(0, index - 1);
		mForm.setFilePath(path, file);
		System.out.println(mForm.getFilePath());
		
		CSpectrum spec = new CSpectrum(mForm.getFilePath());
		mForm.setSpectrum(spec);
		showDataInformation();
	}
	
	private String findProjectName() {
		String s = "";
		Entry entry = mForm.getEntry();
		while (entry != null && entry.getParent() != null && !entry.getParent().getDisplayName().equals("workspace")) {
			entry = entry.getParent();
			s = entry.getDisplayName();
			// System.out.println(s);
		}
		return s;
	}
	
	private void updateMSProperty(Combo combo) {
		if (mForm.getEntry() == null) {
			MessageDialog.openError(getContainer().getShell(), "Error", "Please select entry first");
		} else {
			combo.removeAll();
			//combo.deselectAll();
			getAnnotationFilesForEntry();
			for (MSPropertyDataFile file: mAnnotationFiles) {
				String fileName = file.getName().substring(file.getName().lastIndexOf(File.separator) + 1);
				System.out.println(fileName);
				combo.add(fileName);
			}
			combo.select(0);
			selectMSProperty(combo);
			getContainer().updateButtons();
		}
	}
	
	/**
	 * Create a button, onClick to view the raw data
	 */
	private void createButtonReviewData() {
		Button review = new Button(mContainer, SWT.PUSH | SWT.BORDER );
		review.setText("review your data");
		
		review.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent a_e) {
				TableView table = new TableView(mContainer, mForm.getSpectrum());
				table.open();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent a_e) {
			}

		});
	}
}
