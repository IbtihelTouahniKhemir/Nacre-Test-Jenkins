/*******************************************************************************
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved.
 * This code is the property of CEA LIST, this use is subject to specific 
 * agreement with the CEA LIST.
 * Contributors:
 *     CEA LIST. - initial API and implementation
 *******************************************************************************/
package fr.cea.nacre.ui.plus.queries;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.emf.facet.custom.metamodel.custompt.IColor;
import org.eclipse.papyrus.emf.facet.custom.ui.internal.custompt.Color;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

import hazards.CommunicationHazard;
import hazards.GeneratorHazard;
import hazards.LineHazard;

/** isAVariableElement */
public class GetForegroundColor implements  IJavaQuery2<EObject, IColor> {
	public IColor evaluate(final EObject context, final IParameterValueList2 parameterValues, final IFacetManager facetManager)
			throws DerivedTypedElementException {
		if( context instanceof Element){
			if ((UMLUtil.getStereotypeApplication(((Element)context), CommunicationHazard.class)!=null)||
			(UMLUtil.getStereotypeApplication(((Element)context), GeneratorHazard.class)!=null)||
			(UMLUtil.getStereotypeApplication(((Element)context), LineHazard.class)!=null))
			{
				return new Color(0,165,0);
			}
		}
		return new Color(0,0,0);
	}
}
