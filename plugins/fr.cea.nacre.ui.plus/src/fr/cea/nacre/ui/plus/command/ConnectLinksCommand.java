package fr.cea.nacre.ui.plus.command;




import java.util.Collection;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.INACREStereotype;

/**
 * Creates a "Satisfy" link between a requirement and a namedElement
 *
 */
public class ConnectLinksCommand extends RecordingCommand {
	private NamedElement communicationMedia;
	private Object[] computingResources;

	
	public ConnectLinksCommand(TransactionalEditingDomain domain, NamedElement communicationMedia, Object[] computingResources) {
		super(domain, "Create an Connect links");
		this.communicationMedia = communicationMedia;
		this.computingResources = computingResources;
	}

	@Override
	protected void doExecute() {
		for (int i = 0; i < computingResources.length; i++) {
			if( computingResources[i]!=null) {
				if(computingResources[i] instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class computingResource_BaseClass= (org.eclipse.uml2.uml.Class)computingResources[i];
				if (UMLUtil.getStereotypeApplication(computingResource_BaseClass, ComputingResource.class)!=null) {
					Abstraction theAbstraction = UMLFactory.eINSTANCE.createAbstraction();
					computingResource_BaseClass.getNearestPackage().getPackagedElements().add(theAbstraction);
					theAbstraction.getSuppliers().add(this.communicationMedia);
					theAbstraction.getClients().add(computingResource_BaseClass);
					theAbstraction.setName("Connect_"+computingResource_BaseClass.getLabel() +"_to_" + this.communicationMedia.getLabel());
					Stereotype satisfyStereotype = theAbstraction.getApplicableStereotype(INACREStereotype.CONNECT_STEREOTYPE);
					theAbstraction.applyStereotype(satisfyStereotype);
				}
					
				}
			}
			
			
		}
		
		
	}

}
