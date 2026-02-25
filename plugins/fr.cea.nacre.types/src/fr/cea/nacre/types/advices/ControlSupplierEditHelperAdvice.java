/*****************************************************************************
 * Copyright (c) 2019 CEA LIST, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package fr.cea.nacre.types.advices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.SpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.types.utils.NACREElementTypesEnumerator;
import nacre.Battery;
import nacre.CentralController;
import nacre.Equipement;
import nacre.Generator;
import nacre.LocalController;
import nacre.MainGrid;
import nacre.NacrePackage;
import nacre.RTE_Installation;
import nacre.ZonalController;
import nacre.Zone;

public class ControlSupplierEditHelperAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getAfterCreateRelationshipCommand(CreateRelationshipRequest request) {

		if (request.getElementType()!=null && !( request.getElementType() instanceof SpecializationType)) {
			return super.getAfterCreateRelationshipCommand(request);
		}

		else  if (isSpecializationof((SpecializationType) request.getElementType(),NACREElementTypesEnumerator.CONTROL))
		{

			EObject container = request.getContainer();

			if (container != null && container instanceof Element) {

				EObject target = request.getTarget();
				
				EObject source = request.getSource();
				Element element = (Element) container;

				CompositeCommand newCommand = new CompositeCommand(
						"set Stereotype Properties and rename the Abstraction");
				IElementEditService serviceEdit = ElementEditServiceUtils.getCommandProvider(element);

				if (UMLUtil.getStereotypeApplication((Element) source, ZonalController.class) != null
						&& UMLUtil.getStereotypeApplication((Element) target, Zone.class) != null) {
					ZonalController zonalController = UMLUtil.getStereotypeApplication((Element) source,
							ZonalController.class);
					Zone zone = UMLUtil.getStereotypeApplication((Element) target, Zone.class);
					SetRequest setzoneRequest = new SetRequest(zonalController,
							NacrePackage.eINSTANCE.getZonalController_Zone(), zone);
					ICommand setzoneCommand = serviceEdit.getEditCommand(setzoneRequest);
					newCommand.compose(setzoneCommand);

				}
				if (UMLUtil.getStereotypeApplication((Element) source, CentralController.class) != null
						&& UMLUtil.getStereotypeApplication((Element) target, MainGrid.class) != null) {
					CentralController centralController = UMLUtil.getStereotypeApplication((Element) source,
							CentralController.class);
					MainGrid maingrid = UMLUtil.getStereotypeApplication((Element) target, MainGrid.class);
					SetRequest setmainGridRequest = new SetRequest(centralController,
							NacrePackage.eINSTANCE.getCentralController_Maingrid(), maingrid);
					ICommand setmainGridCommand = serviceEdit.getEditCommand(setmainGridRequest);
					newCommand.compose(setmainGridCommand);
				}
				if (UMLUtil.getStereotypeApplication((Element) source, LocalController.class) != null
						&& (UMLUtil.getStereotypeApplication((Element) target, Generator.class) != null
								|| UMLUtil.getStereotypeApplication((Element) target, Battery.class) != null || UMLUtil
										.getStereotypeApplication((Element) target, RTE_Installation.class) != null)) {
					LocalController localController = UMLUtil.getStereotypeApplication((Element) source,
							LocalController.class);
					Equipement equipement = UMLUtil.getStereotypeApplication((Element) target, Equipement.class);
					SetRequest setequipementRequest = new SetRequest(localController,
							NacrePackage.eINSTANCE.getLocalController_Equipement(), equipement);
					ICommand setequipementGridCommand = serviceEdit.getEditCommand(setequipementRequest);
					newCommand.compose(setequipementGridCommand);
				}

				return newCommand;
			}
		} else if (request.getElementType().equals(NACREElementTypesEnumerator.ABSTRACTION_UI)) {
			Model model = ((Package) request.getContainer()).getModel();
			Package cfrapackage = getSpecificElementPackage(model, "CFRA1");
			if (cfrapackage != null)
				request.setContainer(cfrapackage);
		}
		return super.getAfterCreateRelationshipCommand(request);
	}

	/**
	 * Check if iSpecializationType is a specialization of elementTypeId
	 * 
	 * @param iSpecializationType
	 * @param elementTypeId
	 * @return
	 */
	// FIXME : this utility should be provided by the elementType API
	private boolean isSpecializationof(ISpecializationType iSpecializationType, IElementType elementType) {
		List<IElementType> elementTypesHierarchy = new ArrayList<>();
		elementTypesHierarchy.add(iSpecializationType);
		elementTypesHierarchy.addAll(Arrays.asList(iSpecializationType.getAllSuperTypes()));
		return elementTypesHierarchy.contains(elementType);
	}

	private static Package getSpecificElementPackage(Model model, String stereotypeName) {
		List<Element> packages = model.allOwnedElements().stream().filter(a -> a instanceof Package)
				.collect(Collectors.toList());
		if (packages != null && !packages.isEmpty()) {
			for (Element p : packages) {
				if (((Package) p).getName() != null && ((Package) p).getName().equals(stereotypeName)) {
					return (Package) p;

				}
			}
		}
		return null;
	}
}
