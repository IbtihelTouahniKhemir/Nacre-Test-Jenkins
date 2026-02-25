package fr.cea.nacre.viewpoint;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.diagram.common.commands.ModelCreationCommandBase;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.emf.common.util.URI;



public class CreateNacreModelCommand extends ModelCreationCommandBase{
	
	public static final String PROFILES_PATHMAP = "pathmap://NACRE_PROFILE/"; //$NON-NLS-1$



	public static final String NACRE_PROFILE_URI = PROFILES_PATHMAP + "nacre.profile.uml"; //$NON-NLS-1$


	@Override
	protected EObject createRootElement() {
		return UMLFactory.eINSTANCE.createModel();
	}
	
	@Override
	 protected void initializeModel(EObject owner) {
	   super.initializeModel(owner);
	   Profile nacreProfile = (Profile) PackageUtil.loadPackage(URI.createURI(NACRE_PROFILE_URI), owner.eResource().getResourceSet());
	   if (nacreProfile != null) {
	     PackageUtil.applyProfile((Package) owner, nacreProfile, true);
	   }
	   Package packageOwner = (Package) owner;
	   
	   
	   		// Retrieve MARTE profile and apply it
			Profile marte = (Profile) PackageUtil.loadPackage(URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml"), owner.eResource().getResourceSet());
			if (marte != null) {
				PackageUtil.applyProfile(packageOwner, marte, true);
			}
			// Retrieve Hazards profile and apply it
			Profile hazards = (Profile) PackageUtil.loadPackage(URI.createURI("pathmap://HAZARDS_PROFILE/hazards.profile.uml"), owner.eResource().getResourceSet());
			if (hazards != null) {
				PackageUtil.applyProfile(packageOwner, hazards, true);
			}

			Package umlPrimitiveTypes = PackageUtil.loadPackage(URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI), owner.eResource().getResourceSet());
			if (umlPrimitiveTypes != null) {
				PackageImport pi = UMLFactory.eINSTANCE.createPackageImport();
				pi.setImportedPackage(umlPrimitiveTypes);
				packageOwner.getPackageImports().add(pi);
			}
	 }

}
