package fr.cea.nacre.ui.plus.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREModelHelper;
import nacre.CFRA;
import nacre.CRA;


/**
 * this command is used to copy a CRA package with the corresponding CFRA
 *
 */
public class CopyCRACommand extends RecordingCommand {

	protected EObject eObject;
	protected TransactionalEditingDomain domain;

	/**
	 * use to create a constraint stereotyped  variation group
	 * @param domain the domain to execute a transaction
	 * @param variant the use case
	 * @param architectureElement
	 */
	public CopyCRACommand(TransactionalEditingDomain domain, EObject eObject){
		super(domain,"Copy CRA");
		this.eObject=eObject;
		this.domain= domain;
	}

	@Override
	protected void doExecute() {
		if(eObject instanceof Package) {
			if ((UMLUtil.getStereotypeApplication(((Package)eObject),CRA.class))!=null){

				CRA CRA_stereotypeApplication= UMLUtil.getStereotypeApplication(((Package)eObject),CRA.class);
				NACREModelHelper helper= new NACREModelHelper();

				//look for containers
				Package UML_CRASPackage=helper.getCRAS(CRA_stereotypeApplication.getBase_Package().getModel());
				Package UML_CFRASPackage=helper.getCFRAS(CRA_stereotypeApplication.getBase_Package().getModel());
				//no container it is impossible to know where we put copy
				if( UML_CRASPackage==null||UML_CFRASPackage==null) {
					return;
				}

				ArrayList<EObject> collectionToCopy= new ArrayList<EObject>();
				//copy CRA package
				collectionToCopy.add(CRA_stereotypeApplication.getBase_Package());
				copyStereotypeApplication(collectionToCopy, CRA_stereotypeApplication.getBase_Package());
				//it exist a CFRA package?
				Package UMLCFRA=helper.getCFRAFromCRA(CRA_stereotypeApplication.getBase_Package().getModel(), CRA_stereotypeApplication);
				if( UMLCFRA!=null) {
					collectionToCopy.add(UMLCFRA);
					copyStereotypeApplication(collectionToCopy, UMLCFRA);
				}

				Collection<EObject> CopiedElement=EcoreUtil.copyAll(collectionToCopy);



				//set the element a the good place
				if(UML_CRASPackage!=null) {
					for (Iterator<EObject> iterator = CopiedElement.iterator(); iterator.hasNext();) {
						EObject eObject = iterator.next();
						if(eObject instanceof PackageableElement) {
							//System.out.println("this a instance of metaclass");
							if((eObject.eContainer())==null) {
								UML_CRASPackage.getPackagedElements().add((PackageableElement)eObject);
							}
						}
						else {
							//System.out.println("this a a stereotype application");
							CRA_stereotypeApplication.eResource().getContents().add(eObject);
						}

					}
					//change name of copy package
					for (Iterator<EObject> iterator = CopiedElement.iterator(); iterator.hasNext();) {
						EObject eObject = iterator.next();
						if(eObject instanceof PackageableElement) {
							if( UMLUtil.getStereotypeApplication(((Package)eObject),CRA.class)!=null) {
								((Package)eObject).setName(((Package)eObject).getName()+"_copy");
							}

							if( UMLUtil.getStereotypeApplication(((Package)eObject),CFRA.class)!=null) {
								((Package)eObject).setName(((Package)eObject).getName()+"_copy");
								UML_CFRASPackage.getPackagedElements().add(((Package)eObject));
							}
							}
						}

				}
			}
		}

		System.out.println("Copy CRA Done !");
	}

	public void copyStereotypeApplication(ArrayList<EObject> collectionToCopy, Element element ) {
		for (Iterator<EObject> iterator = element.getStereotypeApplications().iterator(); iterator.hasNext();) {
			EObject stereotypeApplication =  iterator.next();
			collectionToCopy.add(stereotypeApplication);
		}
		EClass eClass = element.eClass();
		for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i)
		{
			EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
			if ((eStructuralFeature instanceof EReference)) {
				if (((EReference)eStructuralFeature).isContainment()) {
					Object feature = element.eGet(eStructuralFeature);
					if (feature instanceof Element) {
						copyStereotypeApplication(collectionToCopy,(Element) feature);
					} else if (feature instanceof EList) {
						@SuppressWarnings("unchecked")
						EList<Element> featureList = (EList<Element>)feature;
						for (int indexFeatureList = 0; indexFeatureList < featureList.size(); indexFeatureList++){
							copyStereotypeApplication(collectionToCopy, featureList.get(indexFeatureList));
						}

					}
				}
			}
		}
	}

}
