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
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.uml2.uml.Element;

/** isAVariableElement */
public class GetBackgroundColor implements  IJavaQuery2<EObject, IColor> {
	@Override
	public IColor evaluate(final EObject context, final IParameterValueList2 parameterValues, final IFacetManager facetManager){
		if( context instanceof Element){
			HazardDetector hazardDetector= new HazardDetector();
			if(hazardDetector.isLinkedToHazard((Element) context)) {
				return new Color(188,255,188);
			}
		}
		return new Color(255,255,255);
	}
}
