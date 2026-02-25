package fr.cea.nacre.ui.plus.queries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.AbstractionRegistry;
import hazards.CommunicationHazard;
import hazards.GeneratorHazard;
import hazards.LineHazard;
import nacre.Battery;
import nacre.Bus;
import nacre.Generator;
import nacre.Line;
import nacre.Link;
import nacre.MainGrid;
import nacre.RTE_Installation;
import nacre.Substation;
import nacre.Zone;

public class HazardDetector {

	@SuppressWarnings("unlikely-arg-type")
	public boolean isLinkedToHazard(Element element) {
		if( UMLUtil.getStereotypeApplication(element, CommunicationHazard.class)!=null){
			return true;
		}
		if( element instanceof Abstraction) {
			if( UMLUtil.getStereotypeApplication(element, Link.class)==null) {
				if(((Abstraction)element).getSources().size()==1) {
					if( isLinkedToHazard(((Abstraction)element).getSources().get(0))) {
						return true;
					}
				}
			}
		}

		//maingrid
		{
			MainGrid stereotypeAppMainGrid = UMLUtil.getStereotypeApplication(element, MainGrid.class);
			if( stereotypeAppMainGrid!=null) {
				for (Zone stereotypeAppZone : stereotypeAppMainGrid.getZone()) {
					if( isLinkedToHazard(stereotypeAppZone.getBase_Class())) {
						return true;
					}
				}
				for (Substation stereotypeAppSubStation : stereotypeAppMainGrid.getSubstation()) {
					if( isLinkedToHazard(stereotypeAppSubStation.getBase_Class())) {
						return true;
					}
				}
				for (Line stereotypeAppLine : stereotypeAppMainGrid.getLines()) {
					if( isLinkedToHazard(stereotypeAppLine.getBase_Class())) {
						return true;
					}
				}
				if (stereotypeAppMainGrid.getCentralcontroler()!=null) {
					if(isLinkedToHazard(stereotypeAppMainGrid.getCentralcontroler().getBase_Class())){
						return true;
					}
				}
			}
		}

		//zone
		{
			Zone stereotypeAppZone = UMLUtil.getStereotypeApplication(element, Zone.class);
			if( stereotypeAppZone!=null) {
				for (Substation stereotypeAppSubstation : stereotypeAppZone.getSubstation()) {
					if( isLinkedToHazard(stereotypeAppSubstation.getBase_Class())) {
						return true;
					}
				}
				if (stereotypeAppZone.getZonalcontroller()!=null) {
					if(isLinkedToHazard(stereotypeAppZone.getZonalcontroller().getBase_Class())){
						return true;
					}
				}
			}
		}
		//line
				{
					Line stereotypeAppLine = UMLUtil.getStereotypeApplication(element, Line.class);
					if( stereotypeAppLine!=null) {
						if (UMLUtil.getStereotypeApplication(element, LineHazard.class)!=null) {
							return true;
						}
						}
					}
	   //
		{
			Substation stereotypeAppSubstation = UMLUtil.getStereotypeApplication(element, Substation.class);
			if( stereotypeAppSubstation!=null) {
				for (Bus stereotypeAppBus : stereotypeAppSubstation.getBus()) {
					if( isLinkedToHazard(stereotypeAppBus.getBase_Class())) {
						return true;
					}
				}
			}
		}
		{
			Bus bus = UMLUtil.getStereotypeApplication(element, Bus.class);
			if( bus!=null) {
				for (Property UMLproperty : bus.getBase_Class().getOwnedAttributes()) {
					if( isLinkedToHazard(UMLproperty)) {
						return true;
					}
				}
			}
		}
		{
			RTE_Installation rteInstallation = UMLUtil.getStereotypeApplication(element, RTE_Installation.class);
			if( rteInstallation!=null) {
				if(rteInstallation.getLocalcontroller()!=null) {
					if( UMLUtil.getStereotypeApplication(rteInstallation.getLocalcontroller().getBase_Class(), CommunicationHazard.class)!=null) {
						return true;
					}
					else {return isLinkedToHazard(rteInstallation.getLocalcontroller().getBase_Class());}
				}
			}
		}
		{
			Battery battery = UMLUtil.getStereotypeApplication(element, Battery.class);
			if( battery!=null) {
				if(battery.getLocalcontroller()!=null) {
					if( UMLUtil.getStereotypeApplication(battery.getLocalcontroller().getBase_Class(), CommunicationHazard.class)!=null) {
						return true;
					}
					else {return isLinkedToHazard(battery.getLocalcontroller().getBase_Class());}
				}
			}
		}
		Generator generator = UMLUtil.getStereotypeApplication(element, Generator.class);
		if( generator!=null) {
			if(generator.getLocalcontroller()!=null) {
				if( (UMLUtil.getStereotypeApplication(generator.getLocalcontroller().getBase_Class(), CommunicationHazard.class)!=null)||
				(UMLUtil.getStereotypeApplication(element, GeneratorHazard.class)!=null)) {
					return true;
				}
				else {return isLinkedToHazard(generator.getLocalcontroller().getBase_Class());}
			}
		}

		if(AbstractionRegistry.getInstance().incomingAbstraction.get(element)!=null) {
			for (Abstraction allocation : AbstractionRegistry.getInstance().incomingAbstraction.get(element)) {
				if( isLinkedToHazard(allocation)) {
					return true;
				}
			}
		}
		return false;
	}

}
