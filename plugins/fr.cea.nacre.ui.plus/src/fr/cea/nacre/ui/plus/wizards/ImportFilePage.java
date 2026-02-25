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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 *
 * Import page
 *
 */
public class ImportFilePage extends WizardPage {

	/**
	 * allowed file to import table
	 */
	private static final String[] allowedFiles = new String[] { "*.json", "*.gcm" }; //$NON-NLS-1$

	/**
	 * the selected file path
	 */
	private String selectedFilePath;

	
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
	public ImportFilePage(final String pageName, final String title, final ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
		setDescription(Messages.ImportFilePage_SelectTheFileToImport);
		
		this.selectedFilePath = null;
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
		final StringFileSelector selector = new StringFileSelector(localComposite, SWT.NONE);
		selector.setAllowFileSystem(true);
		
		selector.setFilterExtensions(allowedFiles);

		localComposite.setLayout(new GridLayout(1, true));
		selector.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		selector.getText().setEditable(false);
		selector.addCommitListener(new ICommitListener() {
			@Override
			public void commit(final AbstractEditor editor) {
				final Object value = selector.getValue();
				if (value instanceof String && ((String) value).length() > 0) {
					setFilePath((String) value);
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
		return getFilePath() != null;
	}


	/**
	 *
	 * @return
	 *         the selected file
	 */
	public String getFilePath() {
		return this.selectedFilePath;
	}

	/**
	 *
	 * @param filePath
	 *            find the file from the filePath and set it
	 */
	public void setFilePath(final String filePath) {
		if (filePath == null || filePath.length() == 0) {
			this.selectedFilePath = null;
		} else {
			this.selectedFilePath = filePath;
		}

	}

}
