package fr.cea.nacre.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.resource.UMLResource;

public class AbstractionRegistry extends EContentAdapter{

	private  final ResourceSet resourceSet = null;
	public HashMap<NamedElement, ArrayList<Abstraction>> incomingAbstraction = new HashMap<NamedElement, ArrayList<Abstraction>>();
	public HashMap<NamedElement, ArrayList<Abstraction>> outgoingAbstraction = new HashMap<NamedElement, ArrayList<Abstraction>>();
	private Resource eResource;
	public Resource getResource() {
		return eResource;
	}

	private static AbstractionRegistry instance=null;
	public static AbstractionRegistry getInstance() {
		if( instance==null) {
			instance= new AbstractionRegistry();
		}
		return instance;
	}
	public void setResource(Resource eResouce) {
		this.eResource=eResouce;

	}
	public void updateRegistry() {
		incomingAbstraction.clear();
		outgoingAbstraction.clear();

		for (Iterator<EObject> iteratorObject = eResource.getAllContents(); iteratorObject.hasNext();) {
			EObject ownedElement = (EObject) iteratorObject.next();
			if( ownedElement instanceof  Abstraction) {
				Abstraction abstraction=(Abstraction) ownedElement;
				//fill incomings
				if(abstraction.getSuppliers().size()>0){
					if (incomingAbstraction.get(abstraction.getSuppliers().get(0))==null) {
						ArrayList<Abstraction> collec= new ArrayList<Abstraction>();
						incomingAbstraction.put(abstraction.getSuppliers().get(0), collec);
					}
					incomingAbstraction.get(abstraction.getSuppliers().get(0)).add(abstraction);
				}
			
			//fill outgoing
			if(abstraction.getSources().size()>0){
				if (outgoingAbstraction.get(abstraction.getSources().get(0))==null) {
					ArrayList<Abstraction> collec= new ArrayList<Abstraction>();
					outgoingAbstraction.put((NamedElement) abstraction.getSources().get(0), collec);
				}
				outgoingAbstraction.get(abstraction.getSources().get(0)).add(abstraction);
			}
		}
	}
}

@Override
public void notifyChanged(Notification notification) {
	// TODO Auto-generated method stub
	super.notifyChanged(notification);
	if(Notification.SET==notification.getEventType()  && notification.getNotifier() instanceof Abstraction) {
		System.err.println("SET!");

		updateRegistry();
	}
	if(Notification.ADD==notification.getEventType()  && notification.getNotifier() instanceof Abstraction) {
		System.err.println("ADD!");

		updateRegistry();
	}
	if(Notification.REMOVE==notification.getEventType()  && notification.getNotifier() instanceof Abstraction) {
		System.err.println("Remove!");

		updateRegistry();
	}
}	

}
