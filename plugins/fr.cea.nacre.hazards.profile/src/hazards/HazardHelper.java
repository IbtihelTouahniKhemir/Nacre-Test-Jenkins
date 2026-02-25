package hazards;

import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Alloc.Allocate;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

import nacre.Connect;
import nacre.Line;
import nacre.Link;

public class HazardHelper {

	public static void completeInformation(AbstractHazard hazard) {

		NamedElement namedElement = null;

		if (hazard instanceof CommunicationHazard) {
			CommunicationHazard comHazard = (CommunicationHazard) hazard;
			namedElement = comHazard.getBase_Class();
			String elementKind = null;
			String source_target = null;
			if (namedElement == null) {
				namedElement = comHazard.getBase_Abstraction();
			}

			if (namedElement == null) {
				namedElement = comHazard.getBase_Association();
			}
			if (namedElement == null) {
				namedElement = comHazard.getBase_Property();
			}
			if (namedElement != null) {
				if (UMLUtil.getStereotypeApplication(namedElement, CommunicationMedia.class) != null) {
					elementKind = "CommunicationMedia ";
				}
				if (UMLUtil.getStereotypeApplication(namedElement, ComputingResource.class) != null) {
					elementKind = "ComputingResource ";
				}
				if (UMLUtil.getStereotypeApplication(namedElement, SwSchedulableResource.class) != null) {
					elementKind = "SoftwareResource ";
				}
				if (UMLUtil.getStereotypeApplication(namedElement, Allocate.class) != null
						|| UMLUtil.getStereotypeApplication(namedElement, Connect.class) != null
						|| UMLUtil.getStereotypeApplication(namedElement, Link.class) != null) {
					Abstraction abstraction = (Abstraction) namedElement;
					if (abstraction.getSuppliers().get(0) != null && abstraction.getClients().get(0) != null)
						source_target = abstraction.getSuppliers().get(0).getName() + " and "
								+ abstraction.getClients().get(0).getName();
				}

				comHazard.setName("Failure" + namedElement.getName());

				if (elementKind != null) {
					if (comHazard.getPercent() == 100.0) {
						comHazard.setDescription("Total Failure applied on " + elementKind + namedElement.getName());
					} else {
						comHazard.setDescription("Intermittent Failure (" + comHazard.getPercent() + "%) applied on "
								+ elementKind + namedElement.getName());
					}
				} else if (source_target != null) {
					if (comHazard.getPercent() == 100.0) {
						comHazard.setDescription("Total Failure applied on the link between " + source_target);
					} else {
						comHazard.setDescription("Intermittent Failure (" + comHazard.getPercent()
						+ "%) applied on the link between " + source_target);
					}

				}

				if (comHazard.getPeriod() != null) {
					comHazard.setDescription(hazard.getDescription() + " from " + comHazard.getPeriod().getStart()
							+ " to " + comHazard.getPeriod().getEnd());
				}
			}
		} else if (hazard instanceof LineHazard) {
			LineHazard lineHazard = (LineHazard) hazard;

			namedElement = lineHazard.getBase_Class();
			if( namedElement!=null) {
				lineHazard.setName("Failure" + namedElement.getName());
				lineHazard.setDescription("Total Failure applied on Line " +namedElement.getName());
			}
		}
		if (hazard instanceof GeneratorHazard) {
			GeneratorHazard genHazard = (GeneratorHazard) hazard;

			namedElement = genHazard.getBase_Property();
			if( namedElement!=null) {
				genHazard.setName("Failure" + namedElement.getName());
				genHazard.setDescription("Total Failure applied on Generator " +namedElement.getName());
			}
		}
		
	}
}
