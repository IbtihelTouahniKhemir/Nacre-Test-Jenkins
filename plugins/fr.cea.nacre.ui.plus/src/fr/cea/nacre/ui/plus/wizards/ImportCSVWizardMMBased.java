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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.papyrus.infra.widgets.util.FileUtil;
import org.eclipse.papyrus.infra.widgets.util.ImageConstants;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.uml2.uml.Class;

import fr.cea.nacre.ui.plus.Activator;
import fr.cea.nacre.ui.plus.handlers.CSV2UMLMMBased;

/**
 *
 * This wizard allows to import a table in the Papyrus nattable editor
 *
 */
public class ImportCSVWizardMMBased extends Wizard  {

	/**
	 * the import page
	 */
	private ImportFilePage importPage;


	/**
	 * Boolean to determinate if the dialog must be opened during the process.
	 */
	private boolean openDialog = true;

	private Class selectedElement;


	/**
	 *
	 * Constructor.
	 * @param classifier
	 *
	 */
	public ImportCSVWizardMMBased(Class selection) {
		this.selectedElement = selection;
		setWindowTitle(Messages.Import_CSV_File);
		String pluginId = Activator.PLUGIN_ID;
		String path = "icons/importTablePapyrusWizban.png"; //$NON-NLS-1$
		ImageDescriptor desc = org.eclipse.papyrus.infra.widgets.Activator.getDefault().getImageDescriptor(pluginId, path);
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
		final String pageTitle = Messages.ImportFileWizard_ImportFile;
		final ImageDescriptor desc = null;
		this.importPage = new ImportFilePage(pageTitle, pageTitle, desc);
		addPage(this.importPage);
		this.setNeedsProgressMonitor(true);
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
		String importedFilePath = null;
		if (openDialog) {
			File file = FileUtil.getFile(this.importPage.getFilePath());
			importedFilePath = file.getPath();
		}
		System.out.println(importedFilePath);

		CSV2UMLMMBased importer = new CSV2UMLMMBased(
				getContainer(), importedFilePath, selectedElement);
		try {
			importer.execute();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		// TODO : do something with the status ?
		return true;
	}

	/**
	 * This allows to create the reader and returns it.
	 *
	 * @param file
	 *            The file to read.
	 * @return
	 * 		a new reader
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
		getShell().setImage(org.eclipse.papyrus.infra.widgets.Activator.getDefault().getImage(ImageConstants.PAPYRUS_ICON_PATH));
	}

	/**
	 *
	 * @return
	 *         the selected file
	 */
	public Class getSelectedElement() {
		return this.selectedElement;
	}

	/**
	 *
	 * @param filePath
	 *            find the file from the filePath and set it
	 */
	public void setSelectedElement(final Class selection) {
		this.selectedElement = selection;
	}
}
