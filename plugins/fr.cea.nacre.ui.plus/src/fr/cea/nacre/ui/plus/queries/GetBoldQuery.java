package fr.cea.nacre.ui.plus.queries;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

import hazards.CommunicationHazard;
import hazards.GeneratorHazard;
import hazards.LineHazard;

public class GetBoldQuery implements IJavaQuery2<EObject, Boolean> {
	public Boolean evaluate(final EObject context, final IParameterValueList2 parameterValues,	final IFacetManager facetManager)
			throws DerivedTypedElementException {
		if( context  instanceof Element) {

			if ((UMLUtil.getStereotypeApplication(((Element)context), CommunicationHazard.class)!=null)||
					(UMLUtil.getStereotypeApplication(((Element)context), GeneratorHazard.class)!=null)||
					(UMLUtil.getStereotypeApplication(((Element)context), LineHazard.class)!=null))
            {
				return true;
			}
		}
		return false;
	}
}
