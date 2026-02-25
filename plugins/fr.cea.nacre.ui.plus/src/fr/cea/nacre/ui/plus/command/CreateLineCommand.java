package fr.cea.nacre.ui.plus.command;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREModelHelper;
import nacre.Bus;
import nacre.Equipement;
import nacre.INACREStereotype;
import nacre.Line;
import nacre.MainGrid;
import nacre.RTE_Installation;
import nacre.Substation;
import nacre.Zone;


/**
 * this command is used to create a line form RTE installation
 *
 */
public class CreateLineCommand extends RecordingCommand {

	protected EObject owner;
	protected TransactionalEditingDomain domain;
	protected Map<String, Line> lineIndexer= new HashMap<String, Line>();

	/**
	 * use to create a constraint stereotyped  variation group
	 * @param domain the domain to execute a transaction
	 * @param variant the use case
	 * @param architectureElement
	 */
	public CreateLineCommand(TransactionalEditingDomain domain, EObject owner){
		super(domain,"create lines");
		this.owner = owner;
		this.domain = domain;
	}

	@Override
	protected void doExecute() {
		if(owner instanceof Element) {
			Model root = ((Element)owner).getModel();
			NACREModelHelper helper = new NACREModelHelper();
			//look for maingrid
			MainGrid maingrid=helper.getMainGrid(root);
			//look for zone
			for (Zone azone : maingrid.getZone()) {
				//lookf for station
				for (Substation aSubstation : azone.getSubstation()) {
					//look for bus
					for (Bus abus : aSubstation.getBus()) {
						// look for equipment
						for (Equipement anEquipement : abus.getEquipement()) {
							if( anEquipement instanceof RTE_Installation) {
								RTE_Installation aRte_Installation= (RTE_Installation)anEquipement;
								String lineName=aRte_Installation.getBranch();
								if(lineIndexer.get(lineName)==null) {
									org.eclipse.uml2.uml.Class lineClass=(org.eclipse.uml2.uml.Class)maingrid.getBase_Class().createNestedClassifier(lineName, UMLPackage.eINSTANCE.getClass_());
									Stereotype lineStereotype = lineClass.getApplicableStereotype(INACREStereotype.LINE_STEREOTYPE);
									lineClass.applyStereotype(lineStereotype);
									Line lineApplStereotype= UMLUtil.getStereotypeApplication(lineClass, Line.class);
									lineIndexer.put(lineName, lineApplStereotype);
								}
								Line lineApplStereotype=lineIndexer.get(lineName);
								aRte_Installation.setLine(lineApplStereotype);
								if(!(azone.getLines().contains(lineApplStereotype))) {
									azone.getLines().add(lineApplStereotype);
								}
								if(!(maingrid.getLines().contains(lineApplStereotype))) {
									maingrid.getLines().add(lineApplStereotype);
								}
							}
						}
					}

				}

			}
		}
	}
}
