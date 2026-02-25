package fr.cea.nacre.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.Line;
import nacre.RTE_Installation;

public class LineRegistry extends EContentAdapter{

	private  final ResourceSet resourceSet = null;
	public HashMap<Line, ArrayList<RTE_Installation>> lineRTE = new HashMap<Line, ArrayList<RTE_Installation>>();
	
	private Resource eResource;
	public Resource getResource() {
		return eResource;
	}

	private static LineRegistry instance=null;
	public static LineRegistry getInstance() {
		if( instance==null) {
			instance= new LineRegistry();
		}
		return instance;
	}
	public void setResource(Resource eResouce) {
		this.eResource=eResouce;

	}
	public void updateRegistry() {
		lineRTE.clear();

		for (Iterator<EObject> iteratorObject = eResource.getAllContents(); iteratorObject.hasNext();) {
			EObject ownedElement = (EObject) iteratorObject.next();
			if( ownedElement instanceof  Port) {
				Port port=(Port) ownedElement;
				RTE_Installation rteinsInstallation=UMLUtil.getStereotypeApplication(port, RTE_Installation.class);
				//fill incomings
				if(rteinsInstallation!=null) {
					if( rteinsInstallation.getLine()!=null) {
						ArrayList<RTE_Installation> collection=lineRTE.get(rteinsInstallation.getLine());
						if(collection==null) {
							lineRTE.put(rteinsInstallation.getLine(), new ArrayList<>());
							collection=lineRTE.get(rteinsInstallation.getLine());
						}
						collection.add(rteinsInstallation);
					}
				}
				
		}
	}
}

@Override
public void notifyChanged(Notification notification) {
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
