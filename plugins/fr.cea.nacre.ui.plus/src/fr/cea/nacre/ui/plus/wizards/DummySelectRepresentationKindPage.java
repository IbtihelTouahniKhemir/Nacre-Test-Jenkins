/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Ansgar Radermacher, CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package fr.cea.nacre.ui.plus.wizards;

import java.util.Collections;
import java.util.List;
//import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.papyrus.commands.ICreationCommandRegistry;
import org.eclipse.papyrus.infra.core.architecture.RepresentationKind;
import org.eclipse.papyrus.infra.widgets.providers.UnsetObject;
import org.eclipse.papyrus.uml.diagram.wizards.pages.SelectRepresentationKindPage;
import org.eclipse.papyrus.uml.diagram.wizards.template.ModelTemplateDescription;
import org.eclipse.papyrus.uml.diagram.wizards.template.ModelTemplatesContentProvider;

/**
 * A dummy page overloading the standard Papyrus representation kind page Even
 * if not shown, it returns suitable values that are evaluated by the Papyrus
 * NewWizard. The selectTemplate operation needs to be called after
 * instantiation.
 */
public class DummySelectRepresentationKindPage extends SelectRepresentationKindPage {

	ModelTemplateDescription templateDescription;

	public DummySelectRepresentationKindPage(boolean allowTemplates, ContextProvider contextProvider,
			ICreationCommandRegistry creationCommandRegistry) {
		super(allowTemplates, contextProvider, creationCommandRegistry);
	}

	public DummySelectRepresentationKindPage(ContextProvider contextProvider) {
		super(contextProvider);
		// setShowTemplateChooser(false);
		setShowTemplateChooser(true);
		setShowProfileChooser(false);
		setShowRepresentationKinds(false);
	}

	public void selectTemplate(String viewpointId) {
		// use viewpoint ID instead of architecture context as language
		String language[] = { viewpointId };
		Object elements[] = new ModelTemplatesContentProvider().getElements(language);
		for (Object element : elements) {
			if (element instanceof ModelTemplateDescription && element != UnsetObject.instance) {
				templateDescription = (ModelTemplateDescription) element;
				return;
			}
		}
	}

	/*
	 * @Override public String getTemplatePath() { return templateDescription !=
	 * null ? templateDescription.getUml_path() : null; }
	 *
	 *//**
		 * Gets the notation model template path.
		 *
		 * @return the notation template path
		 *//*
			 *
			 * @Override public String getNotationTemplatePath() { return
			 * templateDescription != null ? templateDescription.getNotation_path() : null;
			 * }
			 */

	/**
	 * Gets the di model template path.
	 *
	 * @return the di template path
	 */

	/*
	 * @Override public String getDiTemplatePath() { return templateDescription !=
	 * null ? templateDescription.getDi_path() : null; }
	 *
	 * @Override public String getTemplatePluginId() { return templateDescription !=
	 * null ? templateDescription.getPluginId() : null; }
	 */

	/**
	 * This an following functions overload superclass to return empty list, i.e.
	 * nothing new should be done - only load the template
	 *
	 * @see org.eclipse.papyrus.uml.diagram.wizards.pages.SelectRepresentationKindPage#getDiagramName()
	 */
	@Override
	public List<String> getDiagramName() {
		return Collections.emptyList();
	}

	@Override
	public List<String> getProfilesURI() {
		return Collections.emptyList();
	}

	@Override
	public IStatus getProfileDefinitionStatus() {
		return Status.OK_STATUS;
	}

	@Override
	public List<ModelTemplateDescription> getTemplateTransfo() {
		return Collections.emptyList();
	}

	@Override
	public List<RepresentationKind> getSelectedRepresentationKinds(String contextId) {
		return Collections.emptyList();
	}

	@Override
	public String getRootElementName() {
		return getDefaultModelName().getValue();
	}

}
