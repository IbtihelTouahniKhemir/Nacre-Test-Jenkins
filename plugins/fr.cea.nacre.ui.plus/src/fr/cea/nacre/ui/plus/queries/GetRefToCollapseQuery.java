package fr.cea.nacre.ui.plus.queries;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.efacet.metamodel.v0_2_0.efacet.ParameterValue;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.MainGrid;
import nacre.Zone;

public class GetRefToCollapseQuery implements IJavaQuery2<NamedElement, Boolean> {
	public Boolean evaluate(final NamedElement context, 
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager)
					throws DerivedTypedElementException {
		ParameterValue parameterValue = parameterValues.getParameterValueByName("eStructuralFeature"); //$NON-NLS-1$
		if (parameterValue.getValue() instanceof EReference) {
			String name=((EReference) parameterValue.getValue()).getName();
			if("lines".equals(name)) {
				if( UMLUtil.getStereotypeApplication(context, Zone.class)!=null ) {
					return false;
				}
				if( UMLUtil.getStereotypeApplication(context, MainGrid.class)!=null ) {
					return false;
				}
				return true;
			}
		}
		return true;
	}
}
