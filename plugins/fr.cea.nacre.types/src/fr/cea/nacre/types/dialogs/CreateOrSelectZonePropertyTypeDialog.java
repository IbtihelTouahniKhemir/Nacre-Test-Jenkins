/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/ 
 * 
 *  SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *
 *		CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package fr.cea.nacre.types.dialogs;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;

import fr.cea.nacre.types.utils.NACREServiceTypeUtil;
import nacre.NacrePackage;

/**
 * Dialog for initialization of Part (Property) type (the type is either selected or created).
 */
public class CreateOrSelectZonePropertyTypeDialog extends CreateOrSelectTypeWithNameDialog {

	public CreateOrSelectZonePropertyTypeDialog(Shell shell, NamedElement owner, IElementType elementType) {
		super(shell, owner, ElementTypeRegistry.getInstance().getType(getSemanticElementType (elementType)), UMLPackage.eINSTANCE.getTypedElement_Type(), getEclass(getSemanticElementType(elementType)), UMLElementTypes.PACKAGE, UMLPackage.eINSTANCE.getPackage_PackagedElement(), null);
	}
	
public static EClass getEclass (String id)
{
	if (id== null)
		return null;
	if (id.equals(NACREServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_NACRE_GENERATOR))
		return NacrePackage.eINSTANCE.getGenerator();
	else if (id.equals(NACREServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_NACRE_Battery))
		return NacrePackage.eINSTANCE.getBattery();
	else if (id.equals(NACREServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_NACRE_RTEINSTALLATION))
		return NacrePackage.eINSTANCE.getRTE_Installation();
	else if (id.equals(NACREServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_NACRE_ZONE))
		return NacrePackage.eINSTANCE.getZone();
	else if (id.equals(NACREServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_NACRE_LOCALCONTROLER))
		return NacrePackage.eINSTANCE.getLocalController();
	

return null;
}

public static String getSemanticElementType (IElementType elementType)
{
	if (elementType== null)
		return null;
	if (elementType.getId().equals("com.example.nacre.Generator_Port_Shape"))
		return NACREServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_NACRE_GENERATOR;
	else if (elementType.getId().equals("com.example.nacre.Battery_Port_Shape"))
		return NACREServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_NACRE_Battery;
	else if (elementType.getId().equals("com.example.nacre.RTE_Installation_Port_Shape"))
		return NACREServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_NACRE_RTEINSTALLATION;
	else if (elementType.getId().equals("com.example.nacre.Zone_Property_Shape"))
		return NACREServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_NACRE_ZONE;
	else if (elementType.getId().equals("com.example.nacre.LocalController_Property_Shape"))
		return NACREServiceTypeUtil.ORG_ECLIPSE_PAPYRUS_NACRE_LOCALCONTROLER;
	

return null;
}

}
