/**
 * I followed the documentation published on Grits website and methods
 * in org.grits.toolbox.importer.ms.annotation.glycan.simiansearch
 * 
 * See http://trac.grits-toolbox.org/wiki/CreatingAnnotion for details
 * 
 * TODO: Rewrite this class so that it is clear 
 */

package edu.brandeis.glycodenovo.wizard;

import java.io.File;
import java.io.IOException;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eurocarbdb.application.glycanbuilder.BuilderWorkspace;
import org.eurocarbdb.application.glycanbuilder.GlycanRendererAWT;
import org.grits.toolbox.core.dataShare.PropertyHandler;
import org.grits.toolbox.core.datamodel.Entry;
import org.grits.toolbox.core.datamodel.property.ProjectProperty;
import org.grits.toolbox.core.datamodel.util.DataModelSearch;
import org.grits.toolbox.entry.ms.property.MassSpecProperty;
import org.grits.toolbox.entry.ms.property.datamodel.MSPropertyDataFile;
import org.grits.toolbox.ms.file.MSFile;
import org.grits.toolbox.utils.data.CartoonOptions;
import org.grits.toolbox.utils.image.GlycanImageProvider;
import edu.brandeis.glycodenovo.datamodel.Save;
import edu.brandeis.glycodenovo.datamodel.SettingForm;

public class ExportPage extends WizardPage {
	private Composite container;
	private SettingForm form;
	private GlycanImageProvider imageProvider;
	private Entry msAnnotationEntry;
	private boolean saved = false;
	
	protected ExportPage(String pageName, SettingForm form) {
		super(pageName);
		this.form = form;
		// setTitle("Click the 'Finish' button to create result visualizations.");
		setTitle("Click the 'Save' button to save result");
		
		imageProvider = new GlycanImageProvider();
		CartoonOptions options = new CartoonOptions("Oxford", "Normal", 0.5, 0, true, false, true);
		imageProvider.setCartoonOptions(options);
		new BuilderWorkspace(new GlycanRendererAWT());
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.None);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		container.setLayout(layout);
		
		Button saveButton = new Button(container, SWT.NONE);
		saveButton.setText("Save");
		saveButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				saveTXT();
				getContainer().updateButtons();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
			}
		});	
		
		setControl(container);
	}
	
	/**
	 * Temporarily save as a txt file before we figure out how to create archives 
	 * that could be saved by Grits
	 */
	public void saveTXT() {
		DirectoryDialog wizardDialog = new DirectoryDialog(container.getShell(), SWT.SINGLE);
		wizardDialog.setMessage("Select the location that you want to save result of GlycoDeNovo");
		String path = wizardDialog.open();
		System.out.println(path);
		if (path != null) {
			path += File.separator;
			form.getSpectrum().outputTXT(path, form.getCheck2H(), form.getCheckGap());
			saved = true;
		}
	}

	/**
	 * This method supposed to create archives that could be read by Grits GUI components
	 * 
	 * @throws IOException
	 */
	public void save() {
		// added by Sena to utilize the selected dataFile (MSPropertyDataFile) for annotation
		Entry msEntry = form.getEntry();
		final MassSpecProperty prop = (MassSpecProperty) msEntry.getProperty();
		MSPropertyDataFile dataFile = form.getDataFile();
		String workspaceLocation = PropertyHandler.getVariable("workspace_location");
		String projectName = DataModelSearch.findParentByType(msEntry, ProjectProperty.TYPE).getDisplayName();
		String pathToFile = workspaceLocation + projectName + File.separator + MassSpecProperty.getFoldername();
		MSFile msFile = dataFile.getMSFileWithReader(pathToFile, prop.getMassSpecMetaData().getMsExperimentType());
		Save save = new Save(form, msFile);
		msAnnotationEntry = save.save();
	}
	
	
	public Entry[] getResult() {
		return new Entry[]{form.getEntry(), msAnnotationEntry};
	}
	
	@Override
	public boolean canFlipToNextPage() {
		return msAnnotationEntry != null || saved == true;
	}
}
