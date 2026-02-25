package fr.cea.nacre.types.utils;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Model;

import fr.cea.nacre.model.GcmConstants;

public class PackageUtils {

	/** we should stereotype packages rather than comparing names */
	public static org.eclipse.uml2.uml.Package getSpecificElementPackage(Model model, GcmConstants.Element element) {
		EList<org.eclipse.uml2.uml.Package> packages = model.getNestedPackages();
		if (packages != null && !packages.isEmpty()) {
			for (org.eclipse.uml2.uml.Package p : packages) {
				if (p.getName().equals(element.label())) {
					return p;

				}
			}
		}
		return null;
	}

}
