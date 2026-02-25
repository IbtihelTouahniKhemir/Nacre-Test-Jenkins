package fr.cea.nacre.ui.plus.queries;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.LineRegistry;
import nacre.Line;
import nacre.MainGrid;
import nacre.RTE_Installation;
import nacre.Zone;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;

public class NacreLineQuery implements IJavaQuery2<NamedElement, Collection<EObject>> {
	public Collection<EObject> evaluate(final NamedElement context, 
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager)
					throws DerivedTypedElementException {
		ArrayList<EObject> result= new ArrayList<EObject>();

		if( UMLUtil.getStereotypeApplication(context, Zone.class)!=null ) {
			Zone zoneApp=UMLUtil.getStereotypeApplication(context, Zone.class);			
			for (Line aline : zoneApp.getLines()) {
				result.add(aline.getBase_Class());
			}
			return result;
			
		}
		if( UMLUtil.getStereotypeApplication(context, MainGrid.class)!=null ) {
			MainGrid maingridAppl=UMLUtil.getStereotypeApplication(context, MainGrid.class);
			for (Line aline : maingridAppl.getLines()) {
				result.add(aline.getBase_Class());
			}
			return result;
		}
		return result;
	}
}
