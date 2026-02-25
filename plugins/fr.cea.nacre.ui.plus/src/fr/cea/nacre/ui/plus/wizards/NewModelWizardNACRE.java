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

import java.net.MalformedURLException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.papyrus.infra.core.resource.BadArgumentExcetion;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.NotFoundException;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationModel;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.uml.diagram.wizards.pages.NewModelFilePage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectArchitectureContextPage;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectRepresentationKindPage;
import org.eclipse.papyrus.uml.diagram.wizards.wizards.CreateModelWizard;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import java.net.URL;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IWorkbench;
import org.osgi.framework.Bundle;

import fr.cea.nacre.ui.plus.Activator;


public class NewModelWizardNACRE extends CreateModelWizard {
	private static final String DOT_UML = ".uml"; //$NON-NLS-1$

	private static final String DOT_DI = ".di"; //$NON-NLS-1$

	public static final String MODEL_NAME_UC = "[modelNameUC]"; //$NON-NLS-1$

	/** The Constant WIZARD_ID. */
	public static final String WIZARD_ID = "org.eclipse.papyrus.nacre.wizard.createmodel"; //$NON-NLS-1$

	protected SelectViewPointPage selectViewPointPage;

	protected DummySelectRepresentationKindPage selectRepresentationKindPage;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		setWindowTitle("New NACRE Model"); //$NON-NLS-1$
		String imagePath = "platform:/plugin/fr.cea.nacre.ui.plus/icons/naza.gif"; //$NON-NLS-1$
		setWindowTitle("New NACRE Project"); //$NON-NLS-1$
		setDefaultPageImageDescriptor(ImageDescriptor.createFromImage(ImageFromPath(imagePath)));
	}

	@Override
	public void addPage(IWizardPage page) {

		  if (page instanceof SelectArchitectureContextPage) {
			  selectViewPointPage = new SelectViewPointPage();
			  // drop the page [1] that allowed us to choose the ViewPoint
			  // initialize the selectedId with "org.eclipse.papyrus.aas.viewpoint"
			  //super.addPage(selectViewPointPage);
		  }
		  else {

			super.addPage(page);
		}
	}

	@Override
	protected String[] getSelectedContexts() {
		return new String[] { WizardConstants.AAS_CONTEXT };
	}

	@Override
	protected String getRootElementName() {
		return (selectRepresentationKindPage.getRootElementName());
	}

	/**
	 * Gets the viewpoint ids.
	 */
	@Override
	protected String[] getSelectedViewpoints() {
		return selectViewPointPage.getSelectedIDs();
	}

	public void setViewpoint(String selectedId) {
		selectViewPointPage.setSelectedID(selectedId);

	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page instanceof SelectViewPointPage) {
			// superclass would go redirect to the standard architecture selection page
			// (and cause an NPE, since this page is not present in this wizard)
			IWizardPage modelPage = getPages()[1];
			updateExtension();
			return modelPage;
		}
		return super.getNextPage(page);
	}

	@Override
	protected SelectRepresentationKindPage doCreateSelectRepresentationKindPage() {
		selectRepresentationKindPage = new DummySelectRepresentationKindPage(createContextProvider());
		return selectRepresentationKindPage;
	}

	@Override
	protected void initDomainModel(ModelSet modelSet, String contextId, String[] viewpointIds) {
		super.initDomainModel(modelSet, contextId, viewpointIds);
		Resource umlR = UmlUtils.getUmlResource(modelSet);
		NotationModel notation = NotationUtils.getNotationModel(modelSet);
		Diagram diagram;
		try {
			diagram = notation.getDiagram(MODEL_NAME_UC);
			if (diagram != null) {
				final String newName = (selectRepresentationKindPage.getRootElementName()) +
						" diagram"; //$NON-NLS-1$
				getCommandStack(modelSet).execute(
						new RecordingCommand(modelSet.getTransactionalEditingDomain()) {

							@Override
							protected void doExecute() {
								diagram.setName(newName);
							}
						});
			}
		} catch (NotFoundException e) {
			// do nothing, will always happen, if no diagram with magic name is found
		} catch (BadArgumentExcetion e) {
			System.out.println(e);
		}
		Package root = (Package) umlR.getContents().get(0);

		NamedElement ne = root.getPackagedElement(MODEL_NAME_UC);
		if (ne != null) {
			// ne.add
			String ucFirst = (selectRepresentationKindPage.getRootElementName());
			SetRequest setRequest = new SetRequest(ne, UMLPackage.eINSTANCE.getNamedElement_Name(), ucFirst);
			ICommand setNameCmd = ElementEditServiceUtils.getCommandProvider(ne).getEditCommand(setRequest);

			if (setNameCmd.canExecute()) {
				getCommandStack(modelSet).execute(GMFtoEMFCommandWrapper.wrap(setNameCmd));
			}
		}
	}


	public String getExtension() {
		String extension = DOT_UML;

// @SuppressWarnings("unused")
//		String id = selectViewPointPage.getSelectedID();

		return extension.replace(DOT_UML, DOT_DI).substring(1);

	}

//	@Override
	@Override
	public boolean performFinish() {
		selectRepresentationKindPage.selectTemplate(selectViewPointPage.getSelectedID());
		updateExtension();
		final URI newURI = createNewModelURI(WizardConstants.AAS_CONTEXT);

		String[] viewpointIds = getSelectedViewpoints();
		createAndOpenPapyrusModel(newURI, WizardConstants.AAS_CONTEXT, viewpointIds);

		return true;
	}

	/**
	 * this function allowed the extraction of the Object(image) from a path.
	 *
	 * @param PathOfImage
	 * @return Image
	 */
	public static Image ImageFromPath(String PathOfImage) {
		Bundle bundl = Activator.getInstance().getBundle();
		URL url = FileLocator.find(bundl, new Path(PathOfImage), null);
		try {
			url = new URL(PathOfImage);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		ImageDescriptor Descriptor = ImageDescriptor.createFromURL(url);
		return Descriptor.createImage();
	}

	public void updateExtension() {
		String extension = getExtension();
		IWizardPage modelPage = getPages()[1];
		// TODO - will not work if another implementation of the interface
		// INewPapyrusModelPage is used (but we need to change extension)
		if (extension != null && modelPage instanceof NewModelFilePage) {
			((NewModelFilePage) modelPage).diagramExtensionChanged(extension);
		}
	}



}
