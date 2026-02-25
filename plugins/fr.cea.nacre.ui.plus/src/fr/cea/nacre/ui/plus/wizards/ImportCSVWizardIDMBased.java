/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *
 *		 Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package fr.cea.nacre.ui.plus.wizards;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.infra.widgets.util.FileUtil;
import org.eclipse.papyrus.infra.widgets.util.ImageConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;

import fr.cea.nacre.ui.plus.Activator;
import fr.cea.nacre.ui.plus.handlers.CSV2UMLMMBased;

/**
 *
 * This wizard allows to import a table in the Papyrus nattable editor
 *
 */
public class ImportCSVWizardIDMBased extends Wizard {

	/**
	 * the import page
	 */
	private ImportIIDM_Filter_FilesPage importPage;

	/**
	 * Boolean to determinate if the dialog must be opened during the process.
	 */
	private boolean openDialog = true;

	private Class selectedElement;

	/**
	 *
	 * Constructor.
	 * 
	 * @param classifier
	 *
	 */
	public ImportCSVWizardIDMBased(Class selection) {
		this.selectedElement = selection;
		setWindowTitle(Messages.Import_IIDM_File);
		String pluginId = Activator.PLUGIN_ID;
		String path = "icons/zone.png"; //$NON-NLS-1$
		ImageDescriptor desc = org.eclipse.papyrus.infra.widgets.Activator.getDefault().getImageDescriptor(pluginId,
				path);
		setDefaultPageImageDescriptor(desc);
	}

	/**
	 *
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 *
	 */
	@Override
	public void addPages() {
		super.addPages();
		final String pageTitle = Messages.ImportFileWizard_ImportIDDMFile;
		final ImageDescriptor desc = null;
		this.importPage = new ImportIIDM_Filter_FilesPage(pageTitle, pageTitle, desc);
		addPage(this.importPage);
		//this.setNeedsProgressMonitor(true);
	}

	/**
	 *
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 *
	 * @return
	 */
	@Override
	public boolean performFinish() {
		// the import file
		String iidmImportedFilePath = null;
		String filterImportedFilePath = null;

		File file = FileUtil.getFile(this.importPage.getIidmFilePath());
		iidmImportedFilePath = file.getPath();
		File fiterfile = FileUtil.getFile(this.importPage.getFilterFilePath());
		filterImportedFilePath = fiterfile.getPath();

		System.out.println(iidmImportedFilePath);
		System.out.println(filterImportedFilePath);

		File premodel = executePythonScript(iidmImportedFilePath, filterImportedFilePath);
		if (premodel != null) {
			String importedpremodelFilePath = premodel.getPath();

			CSV2UMLMMBased importer = new CSV2UMLMMBased(getContainer(), importedpremodelFilePath, selectedElement);
			try {
				importer.execute();
				if (premodel != null)
					premodel.delete();
				
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.importPage.dispose();
		// TODO : do something with the status ?
		return true;
	}

	private File executePythonScript(String iidmImportedFilePath, String filterImportedFilePath) {

		String result = "";
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		URI uri = this.selectedElement.eResource().getURI();
		IProject project = root.getProject(uri.segment(1));
		String outputFilePath = project.getLocation().toOSString();
		URL installURL = Platform.getInstallLocation().getURL();
		String path = installURL.getPath().replace("/", "\\");
		String pythonScriptPath = path.concat("third-tools\\iidm_mpc_pytools\\iidm_to_gcm\\iidm_to_gcm_premodel.py")
				.substring(1);
		Process process = null;

		try {
			ProcessBuilder processBuilder = new ProcessBuilder("python", pythonScriptPath, "-i", iidmImportedFilePath,
					"-f", filterImportedFilePath, "-o", outputFilePath);
			process = processBuilder.start();
			int exitCode = process.waitFor(); // Wait for the script to finish
			OutputStream flux = process.getOutputStream();
			OutputStreamWriter writer = new OutputStreamWriter(flux);
			BufferedWriter br = new BufferedWriter(writer);
			br.newLine();

			BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
			BufferedReader err = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			String line;
			BufferedReader reader;
			if (exitCode != 0) {
				reader = err;
			} else {
				reader = in;
			}
			while ((line = reader.readLine()) != null) {
				result = result + line;
			}
			System.out.println("Python script executed successfully. Output will be in " + outputFilePath);

		} catch (IOException | InterruptedException e) {
			System.err.println("Error executing Python script: " + e.getMessage());
		}
		File premodelFile = null;
		try {
			project.refreshLocal(getPageCount(), null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		IFile premodel = getZonePremodel(project, filterImportedFilePath);
		if (premodel != null) {
			premodelFile = new File(premodel.getLocationURI());
			process.destroy();
			return premodelFile;

		}
		process.destroy();
		return null;
	}

	private IFile getZonePremodel(IProject project, String filterPathName) {
		IFile returnedfile = null;

		IResource[] iResources;
		try {
			iResources = project.members();
			for (IResource iR : iResources) {
				if (iR instanceof IFile) {
					if ("json".equalsIgnoreCase(((IFile) iR).getFileExtension())) {
						String name = iR.getName();
						String[] splittedName = name.split("\\.");
						if (splittedName != null && splittedName.length > 0) {
							String namewithoutExt = splittedName[0];
							if (filterPathName.contains(namewithoutExt))

								returnedfile = (IFile) iR;
						}

					}
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return returnedfile;

	}

	/**
	 * This allows to create the reader and returns it.
	 *
	 * @param file The file to read.
	 * @return a new reader
	 */
	protected Reader createReader(final File file) {
		FileReader reader = null;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {

		}
		return reader;
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#createPageControls(org.eclipse.swt.widgets.Composite)
	 *
	 * @param pageContainer
	 */
	@Override
	public void createPageControls(Composite pageContainer) {
		super.createPageControls(pageContainer);
		getShell().setImage(
				org.eclipse.papyrus.infra.widgets.Activator.getDefault().getImage(ImageConstants.PAPYRUS_ICON_PATH));
	}

	/**
	 *
	 * @return the selected file
	 */
	public Class getSelectedElement() {
		return this.selectedElement;
	}

	/**
	 *
	 * @param filePath find the file from the filePath and set it
	 */
	public void setSelectedElement(final Class selection) {
		this.selectedElement = selection;
	}
}
