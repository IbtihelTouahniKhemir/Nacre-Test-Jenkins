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

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.papyrus.infra.widgets.editors.AbstractEditor;
import org.eclipse.papyrus.infra.widgets.editors.ICommitListener;
import org.eclipse.papyrus.infra.widgets.editors.StringFileSelector;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 *
 * Import page
 *
 */
public class ImportIIDM_Filter_FilesPage extends WizardPage {

	/**
	 * allowed file to import 
	 */
	private static final String[] iidmAllowedFile = new String[] {"*.xml" }; //$NON-NLS-1$
	
	private static final String[] filterAllowedFiles = new String[] {"*.json"}; //$NON-NLS-1$

	/**
	 * the selected file path
	 */
	private String iidmselectedFilePath;
	private String filterselectedFilePath;

	
	/**
	 *
	 * Constructor.
	 *
	 * @param pageName
	 *            the name of the import page
	 * @param title
	 *            the title of the page
	 * @param titleImage
	 *            the image for this page
	 * @param tableManager
	 *            the table manager where the import will be done
	 */
	public ImportIIDM_Filter_FilesPage(final String pageName, final String title, final ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
		setDescription(Messages.ImportFilePage_SelectTheFileToImport);
		
		this.iidmselectedFilePath = null;
		this.filterselectedFilePath=null;
	}

	/**
	 *
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 *
	 * @param parent
	 */
	@Override
	public void createControl(final Composite parent) {
		final Composite localComposite = new Composite(parent, SWT.NONE);
		setControl(localComposite);
		
		Composite localParent = new Composite(localComposite, SWT.NONE);

		localParent.setLayout(new GridLayout(2, true));

		final CLabel label = new CLabel(localParent, SWT.LEFT);
		label.setText("Please select an IIDM file:");
		final StringFileSelector iidmselector = new StringFileSelector(localComposite, SWT.NONE);
		iidmselector.setToolTipText("Please select an IIDM file:");
		
		iidmselector.setAllowFileSystem(true);
		
		iidmselector.setFilterExtensions(iidmAllowedFile);

		localComposite.setLayout(new GridLayout(1, true));
		iidmselector.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		iidmselector.getText().setEditable(false);
	
		
		iidmselector.setFont(parent.getFont());
		
		iidmselector.addCommitListener(new ICommitListener() {
			@Override
			public void commit(final AbstractEditor editor) {
				final Object value = iidmselector.getValue();
				if (value instanceof String && ((String) value).length() > 0) {
					setIidmFilePath((String) value);
					setPageComplete(isPageComplete());
				}
			}
		});
		
		
		final CLabel filterlabel = new CLabel(localComposite, SWT.LEFT);
		filterlabel.setText("Please select a zone filter file: ");
		iidmselector.setToolTipText("Please select a zone filter file: ");
		
		final StringFileSelector filterselector = new StringFileSelector(localComposite, SWT.NONE);
		filterselector.setAllowFileSystem(true);
		
		filterselector.setFilterExtensions(filterAllowedFiles);

		filterselector.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		filterselector.getText().setEditable(false);
		filterselector.addCommitListener(new ICommitListener() {
			@Override
			public void commit(final AbstractEditor editor) {
				final Object value = filterselector.getValue();
				if (value instanceof String && ((String) value).length() > 0) {
					setFilterFilePath((String) value);
					setPageComplete(isPageComplete());
				}
			}
		});
	}

	

	/**
	 *
	 * @see org.eclipse.jface.wizard.WizardPage#isPageComplete()
	 *
	 * @return
	 */
	@Override
	public boolean isPageComplete() {
		return (getIidmFilePath() != null && getFilterFilePath()!=null);
	}


	/**
	 *
	 * @return
	 *         the selected file
	 */
	public String getIidmFilePath() {
		return this.iidmselectedFilePath;
	}

	/**
	 *
	 * @param filePath
	 *            find the file from the filePath and set it
	 */
	public void setIidmFilePath(final String filePath) {
		if (filePath == null || filePath.length() == 0) {
			this.iidmselectedFilePath = null;
		} else {
			this.iidmselectedFilePath = filePath;
		}

	}
	
	
	/**
	 *
	 * @return
	 *         the selected file
	 */
	public String getFilterFilePath() {
		return this.filterselectedFilePath;
	}

	/**
	 *
	 * @param filePath
	 *            find the file from the filePath and set it
	 */
	public void setFilterFilePath(final String filePath) {
		if (filePath == null || filePath.length() == 0) {
			this.filterselectedFilePath = null;
		} else {
			this.filterselectedFilePath = filePath;
		}

	}

}
