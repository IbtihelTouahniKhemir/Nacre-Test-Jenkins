/*****************************************************************************
 * Copyright (c) 2021 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Ibtihel khemir (CEA LIST) ibtihel.khemir@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package fr.cea.nacre.ui.plus.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
//@! NEW CODE
//import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.uml.diagram.wizards.messages.Messages;
import org.eclipse.papyrus.uml.diagram.wizards.pages.PapyrusProjectCreationPage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectArchitectureContextPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;


public class NewProjectWizardNACRE extends NewModelWizardNACRE {
	private static final String DOT = "."; //$NON-NLS-1$

// @SuppressWarnings("unused")
//	private static final String SLASH = "/"; //$NON-NLS-1$



	/** The Constant WIZARD_ID. */
	public static final String WIZARD_ID = "org.eclipse.papyrus.nacre.wizard.createproject"; //$NON-NLS-1$

	/** The new project page. */
	private PapyrusProjectCreationPage myProjectPage;

	@Override
	public boolean isCreateProjectWizard() {
		return true;
	}



	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		String imagePath = "platform:/plugin/fr.cea.nacre.ui.plus/icons/naza.gif"; //$NON-NLS-1$
		setWindowTitle("New NACRE Project"); //$NON-NLS-1$
		setDefaultPageImageDescriptor(ImageDescriptor.createFromImage(NewModelWizardNACRE.ImageFromPath(imagePath)));
		setMyProjectPage(new PapyrusProjectCreationPage(Messages.NewPapyrusProjectWizard_0));
		getMyProjectPage().setDescription(Messages.NewPapyrusProjectWizard_1);
	}

	/**
	 * Adds the pages.
	 *
	 * {@inheritDoc}
	 */
	@Override
	public void addPages() {
		// Gives the CreateModelWizard the newProjectPage to display it after the selectDiagramCategoryPage
		setNewProjectPage(getMyProjectPage());

		selectArchitectureContextPage = new SelectArchitectureContextPage();

		super.addPages();
	}

	/**
	 * Perform finish.
	 *
	 * @return true, if successful {@inheritDoc}
	 */
	@Override
	public boolean performFinish() {
		IProject newProjectHandle;
		try {
			newProjectHandle = createNewProject();
		} catch (CoreException e) {
			System.out.println(Messages.NewPapyrusProjectWizard_exception_on_opening + e);
			return false;
		}
		if (newProjectHandle == null) {
			return false;
		}

		return super.performFinish();
	}

	@SuppressWarnings("deprecation")
	protected IProject createNewProject() throws CoreException {
		// get a project handle
		final IProject project = getMyProjectPage().getProjectHandle();

		// get a project descriptor
		java.net.URI projectLocationURI = null;
		if (!getMyProjectPage().useDefaults()) {
			projectLocationURI = getMyProjectPage().getLocationURI();
		}

		IProjectDescription projectDescription = null;
		NullProgressMonitor progressMonitor = new NullProgressMonitor();
		if (!project.exists()) {
			projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription(project.getName());
			if (projectLocationURI != null) {
				projectDescription.setLocationURI(projectLocationURI);
			}
			project.create(projectDescription, new SubProgressMonitor(progressMonitor, 1));
			project.open(new SubProgressMonitor(progressMonitor, 1));
// @! NEW CODE
//			project.create(projectDescription, SubMonitor.convert(progressMonitor, 1));
//			project.open(SubMonitor.convert(progressMonitor, 1));

			// IFolder models = project.getFolder("AAS Models"); //$NON-NLS-1$
			// models.create(true, true, null);
			// String id = SelectViewPointPage.getSelectedID();
		} else {
			// projectDescription = project.getDescription();
			project.open(new SubProgressMonitor(progressMonitor, 1));
// @! NEW CODE
//			project.open(SubMonitor.convert(progressMonitor, 1));
		}

		return project;
	}

	@Override
	protected URI createNewModelURI(String categoryId) {
		// handle extension
		String extension = getExtension();
		// String id = SelectViewPointPage.getSelectedID();
//		String folder = "NACRE"; //$NON-NLS-1$
		IPath newFilePath = getMyProjectPage().getProjectHandle().getFullPath().append(getMyProjectPage().getFileName() + DOT + extension); //$NON-NLS-1$
		return URI.createPlatformResourceURI(newFilePath.toString(), true);
	}

	public PapyrusProjectCreationPage getMyProjectPage() {
		return myProjectPage;
	}

	public void setMyProjectPage(PapyrusProjectCreationPage myProjectPage) {
		this.myProjectPage = myProjectPage;
	}

	protected WizardNewProjectCreationPage createNewProjectCreationPage() {
		return this.myProjectPage;
	}


}
