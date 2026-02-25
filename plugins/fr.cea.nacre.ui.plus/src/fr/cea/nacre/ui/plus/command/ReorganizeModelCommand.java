package fr.cea.nacre.ui.plus.command;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Alloc.Allocate;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREModelHelper;
import nacre.CentralController;
import nacre.Connect;
import nacre.Control;
import nacre.Link;
import nacre.LocalController;
import nacre.ZonalController;


/**
 * this command is used to create a variation group
 *
 */
public class ReorganizeModelCommand extends RecordingCommand {

	protected EObject owner;
	protected TransactionalEditingDomain domain;

	/**
	 * use to create a constraint stereotyped  variation group
	 * @param domain the domain to execute a transaction
	 * @param variant the use case
	 * @param architectureElement
	 */
	public ReorganizeModelCommand(TransactionalEditingDomain domain, EObject owner){
		super(domain,"createBinding");
		this.owner = owner;
		this.domain = domain;
	}

	@Override
	protected void doExecute() {
		if(owner instanceof Element) {
			Model root = ((Element)owner).getModel();
			NACREModelHelper helper = new NACREModelHelper();
			Package cFAPackage = helper.getorCreateCFA(root);
			Package controllers = helper.getorCreateControllers(cFAPackage);

			ArrayList<PackageableElement> controllersElement = new ArrayList<PackageableElement>();
			for (Iterator<EObject> iterator = root.eAllContents(); iterator.hasNext();) {
				EObject object = iterator.next();
				if(object instanceof PackageableElement) {
					PackageableElement UMLElement = (PackageableElement)object;
					if( UMLUtil.getStereotypeApplication(UMLElement, CentralController.class) != null) {
						controllersElement.add(UMLElement);
					}
					if( UMLUtil.getStereotypeApplication(UMLElement, ZonalController.class) != null) {
						controllersElement.add(UMLElement);
					}
					if( UMLUtil.getStereotypeApplication(UMLElement, LocalController.class) != null) {
						controllersElement.add(UMLElement);
					}
					if( UMLUtil.getStereotypeApplication(UMLElement, Control.class) != null) {
						controllersElement.add(UMLElement);
					}
				}

			}
			for(PackageableElement element:controllersElement) {
				controllers.getPackagedElements().add(element);
			}
// @SuppressWarnings("unused")
//			Package CRASPackage = helper.getorCreateCRAS(root);
			ArrayList<Package> pelement = helper.getorCreateCRA(root);
			for (Package package1 : pelement) {
				Package CMP = helper.getorCreateCommunicationMedias(package1);
				Package CRP = helper.getorCreateComputingResources(package1);
				Package SRP = helper.getorCreateSoftwareResources(package1);

				ArrayList<PackageableElement> cmCollection = new ArrayList<PackageableElement>();
				ArrayList<PackageableElement> crCollection = new ArrayList<PackageableElement>();
				ArrayList<PackageableElement> ruCollection = new ArrayList<PackageableElement>();
				for (Iterator<EObject> iterator = package1.eAllContents(); iterator.hasNext();) {
					EObject object = iterator.next();
					if(object instanceof PackageableElement) {
						PackageableElement UMLElement = (PackageableElement)object;
						if( UMLUtil.getStereotypeApplication(UMLElement, CommunicationMedia.class) != null) {
							cmCollection.add(UMLElement);
						}
						if( UMLUtil.getStereotypeApplication(UMLElement, Link.class) != null) {
							cmCollection.add(UMLElement);
						}
						if( UMLUtil.getStereotypeApplication(UMLElement, ComputingResource.class) != null) {
							crCollection.add(UMLElement);
						}
						if( UMLUtil.getStereotypeApplication(UMLElement, Connect.class) != null) {
							ruCollection.add(UMLElement);
						}
						if( UMLUtil.getStereotypeApplication(UMLElement, ResourceUsage.class) != null) {
							ruCollection.add(UMLElement);
						}
						if( UMLUtil.getStereotypeApplication(UMLElement, Allocate.class) != null) {
							ruCollection.add(UMLElement);
						}
					}

				}
				for(PackageableElement element:cmCollection) {
					CMP.getPackagedElements().add(element);
				}
				for(PackageableElement element:crCollection) {
					CRP.getPackagedElements().add(element);
				}
				for(PackageableElement element:ruCollection) {
					SRP.getPackagedElements().add(element);
				}

			}
// @SuppressWarnings("unused")s
//			Package CFRASPackage = helper.getorCreateCFRAS(root);
//			ArrayList<Package> cfraelement = helper.getorCreateCFRA(root);
		}

	}








}
