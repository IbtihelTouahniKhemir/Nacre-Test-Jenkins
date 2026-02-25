/*****************************************************************************
 * Copyright (c) 2021 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package fr.cea.nacre.types.utils;

import org.eclipse.gmf.runtime.emf.type.core.AbstractElementTypeEnumerator;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;

/**
 * Enumeration of UI-specific element types, such as the "creation element types"
 * that are not intended to match existing elements by are used to invoke edit-helper
 * behaviour for specific creation scenarios.
 */
public class NACREElementTypesEnumerator extends AbstractElementTypeEnumerator {

	public static final IHintedType MAINGRID = (IHintedType) getElementType("com.example.nacre.MainGrid");
	public static final IHintedType CC = (IHintedType) getElementType("com.example.nacre.CentralController_Class");
	public static final IHintedType ZC = (IHintedType) getElementType("com.example.nacre.ZonalController_Class");
	public static final IHintedType LC = (IHintedType) getElementType("com.example.nacre.LocalController_Class");
	public static final IHintedType Substation = (IHintedType) getElementType("com.example.nacre.Substation_Class");
	public static final IHintedType BUS = (IHintedType) getElementType("com.example.nacre.Bus_Class");
	public static final IHintedType Battery = (IHintedType) getElementType("com.example.nacre.Battery_Port");
	public static final IHintedType Generator = (IHintedType) getElementType("com.example.nacre.Generator_Port");
	public static final IHintedType Load = (IHintedType) getElementType("com.example.nacre.Load_Port");
	public static final IHintedType RTE_INSTALLATION = (IHintedType) getElementType("com.example.nacre.RTE_Installation_Port");
	public static final IHintedType LINK = (IHintedType) getElementType("com.example.nacre.Link");
	public static final IHintedType CONTROL = (IHintedType) getElementType("com.example.nacre.Control");
	public static final IHintedType CONNECT = (IHintedType) getElementType("com.example.nacre.Connect");
	
	
	public static final IHintedType COMPUTING_RESOURCE = (IHintedType) getElementType("com.example.mARTE.ComputingResource_Classifier");
	public static final IHintedType SOFTWARE_RESOURCE = (IHintedType) getElementType("com.example.mARTE.SwSchedulableResource_Classifier");
	public static final IHintedType COMMUNICATION_MEDIA = (IHintedType) getElementType("com.example.mARTE.CommunicationMedia_Classifier");
	public static final IHintedType ALLOCATE = (IHintedType) getElementType("com.example.mARTE.Allocate");
	public static final IHintedType ABSTRACTION_UI = (IHintedType) getElementType("org.eclipse.papyrus.umldi.Abstraction_Edge");
	



}
