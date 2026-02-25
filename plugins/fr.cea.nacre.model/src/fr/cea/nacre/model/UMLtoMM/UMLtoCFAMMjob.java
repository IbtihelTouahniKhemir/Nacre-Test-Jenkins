package fr.cea.nacre.model.UMLtoMM;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREMM.CommonType.CommonTypeFactory;
import fr.cea.nacre.model.NACREMM.UID.UIDElement;
import fr.cea.nacre.model.NACREMM.cfa.Cfa;
import fr.cea.nacre.model.NACREMM.cfa.CfaFactory;
import fr.cea.nacre.model.NACREMM.study.Study;
import fr.cea.nacre.model.factory.GCMFactory2;
import nacre.CentralController;
import nacre.Load;
import nacre.LocalController;
import nacre.MainGrid;
import nacre.NFP_IST;
import nacre.NFP_Power;
import nacre.Substation;
import nacre.ZonalController;

/** the purpose is to transform a UML model to CFA Nacre MM Instance
 *
 */
public class UMLtoCFAMMjob extends AbstractUMLtoNACRE{
	//rules:
	// all target elements of are prefixed by the metamodel by "gcm_"
	// all UML native element are prefixed by "UML
	// all stereotype application are prefixed by "StereotypeApp"

	private static final String KV_UNIT = "kV";
	private Cfa gcm_cfa;
	private org.eclipse.uml2.uml.Package UML_cfa_package;
	private Class UML_mainGrid ;
	private GCMFactory2 gcmFactory;
	private Study gcm_study;

	public UMLtoCFAMMjob(org.eclipse.uml2.uml.Package UML_cfa_package,
			Class UML_maingrid, GCMFactory2 gcmFactory, Study study) {
		this.UML_cfa_package=UML_cfa_package;
		this.UML_mainGrid=UML_maingrid;
		this.gcmFactory=gcmFactory;
		this.gcm_study = study;
	}
	@Override
	public Cfa getElement() {
		return gcm_cfa;
	}

	@Override
	public EObject construct() {
		//create CFA
		gcm_cfa = createCfa(this.gcm_study, UML_cfa_package.getName(), UML_cfa_package.getQualifiedName());

		// MainGrid & CentralController
		fr.cea.nacre.model.NACREMM.cfa.MainGrid gcm_mainGrid;

		MainGrid stereotypeAppMainGrid = UMLUtil.getStereotypeApplication(UML_mainGrid, MainGrid.class);

		CentralController stereotypeAppCentralController = stereotypeAppMainGrid.getCentralcontroler();
		if (stereotypeAppCentralController != null) {
			// MainGrid With CentralController
			

			gcm_mainGrid = createMainGrid(gcm_cfa, this.UML_mainGrid.getName(),this.UML_mainGrid.getQualifiedName(),
					stereotypeAppCentralController.getBase_Class().getName(),stereotypeAppCentralController.getBase_Class().getQualifiedName(), stereotypeAppCentralController.getControlBehavior().getLiteral());

			gcmFactory.cfaMap.put(stereotypeAppCentralController, gcm_mainGrid.getCentralController());
		}
		else {
			// MainGrid Without CentralController
			gcm_mainGrid = createMainGrid(gcm_cfa, this.UML_mainGrid.getName(),this.UML_mainGrid.getQualifiedName(), null, null,null);
		}

		// create substations of the MainGrid
		createMMSubstation(gcm_mainGrid, stereotypeAppMainGrid.getSubstation());

		//  create zones
		EList<Classifier> UML_nestedClassifiers =  UML_mainGrid.getNestedClassifiers();
		//get all UML zones
		List<nacre.Zone> zones = getZones(UML_nestedClassifiers);
		for (nacre.Zone applystereotypezone : zones) {
			if (applystereotypezone != null) {
				String zoneName = applystereotypezone.getBase_Class().getName();
				String zoneQName = applystereotypezone.getBase_Class().getQualifiedName();

				ZonalController stereotypeAppZC = applystereotypezone.getZonalcontroller();
				String zcName     = stereotypeAppZC.getBase_Class().getName();
				String zcQName     = stereotypeAppZC.getBase_Class().getQualifiedName();
				String zcBehavior = stereotypeAppZC.getControlBehavior().getLiteral();

				// Zone with ZonalController
				fr.cea.nacre.model.NACREMM.cfa.Zone gcm_zone =
						createZone(gcm_mainGrid, zoneName,zoneQName, zcName,zcQName, zcBehavior);

				gcmFactory.cfaMap.put(stereotypeAppZC, gcm_zone);

				// create substations of the Zone
				createMMSubstation(gcm_zone, applystereotypezone.getSubstation());
				
				
			}
		}
		// create lines in maingrid
//		List<nacre.Line> lines = getLines(UML_nestedClassifiers);
//		for (nacre.Line applystereotypeline : lines) {
//			if (applystereotypeline != null) {
//				String lineName = applystereotypeline.getBase_Class().getName();
//				String lineQName = applystereotypeline.getBase_Class().getQualifiedName();	
//			}
//		}

		return gcm_cfa;
	}

	public void createMMSubstation(UIDElement container, List<Substation> stereotypeAPPsubstations) {
		for (Substation StereotypeAPPSubstation : stereotypeAPPsubstations) {
			if (StereotypeAPPSubstation != null) {
				String substationName = StereotypeAPPSubstation.getBase_Class().getName();
				String substationQName = StereotypeAPPSubstation.getBase_Class().getQualifiedName();
				if (substationName != null) {
					fr.cea.nacre.model.NACREMM.cfa.Substation gcm_sub =
							createSubstation(container, substationName,substationQName);
					gcmFactory.cfaMap.put(StereotypeAPPSubstation, gcm_sub);
					// create equipements
					// create Bus
					constructBuses(gcm_sub, StereotypeAPPSubstation.getBus());
				}
			}
		}
	}

	/** return the list aof stereotype aapplication taht represents zone
	 * @param nestedClassifiers list of nested classifier that can be a NACRE zone
	 * **/
	private List<nacre.Zone> getZones(EList<Classifier> nestedClassifiers) {
		List<nacre.Zone> zones = new ArrayList<nacre.Zone>();
		for (Classifier classifier : nestedClassifiers) {
			nacre.Zone zone = UMLUtil.getStereotypeApplication(classifier, nacre.Zone.class);
			if (zone != null)
				zones.add(zone);
		}
		return zones;
	}
	
	/** return the list aof stereotype aapplication taht represents line
	 * @param nestedClassifiers list of nested classifier that can be a NACRE Line
	 * **/
	private List<nacre.Line> getLines(EList<Classifier> nestedClassifiers) {
		List<nacre.Line> lines = new ArrayList<nacre.Line>();
		for (Classifier classifier : nestedClassifiers) {
			nacre.Line line = UMLUtil.getStereotypeApplication(classifier, nacre.Line.class);
			if (line != null)
				lines.add(line);
		}
		return lines;
	}


	/**
	 * create list of bus
	 * @param listofbus the list of stererotype application of Bus
	 * @return the list of MM bus with equipments
	 */
	private void constructBuses(fr.cea.nacre.model.NACREMM.cfa.Substation gcm_sub, List<nacre.Bus> listofbus) {
		for (nacre.Bus stereotypeAppBus : listofbus) {
			String busName = stereotypeAppBus.getBase_Class().getName();
			String busQName = stereotypeAppBus.getBase_Class().getQualifiedName();
			boolean connected = stereotypeAppBus.isConnected();
			fr.cea.nacre.model.NACREMM.CommonType.CommonType nominalLevel =
					getNominalLevel(stereotypeAppBus);

			fr.cea.nacre.model.NACREMM.cfa.Bus gcm_bus =
					createBus(gcm_sub, busName,busQName, connected, nominalLevel);

			// look for a Equipments in the bus
			for (nacre.Equipement stereotypeAppEquipement : stereotypeAppBus.getEquipement()) {

				// look for generators in the bus
				if (stereotypeAppEquipement instanceof nacre.Generator) {
					createMMGenerator(gcm_bus, stereotypeAppEquipement);
				}

				// look for a battery in the bus
				if (stereotypeAppEquipement instanceof nacre.Battery) {
					createMMBattery(gcm_bus, stereotypeAppEquipement);
				}
				// look for loads in the bus
				if (stereotypeAppEquipement instanceof nacre.Load) {
					createMMLoads(gcm_bus, stereotypeAppEquipement);
				}
				// look for RTE installations in the bus
				if (stereotypeAppEquipement instanceof nacre.RTE_Installation) {
					createMMRteInstallation(gcm_bus, stereotypeAppEquipement);
				}
			}
		}
	}

	private void createMMRteInstallation(
			fr.cea.nacre.model.NACREMM.cfa.Bus gcm_bus,
			nacre.Equipement stereotypeAppEquipement) {
		nacre.RTE_Installation stereotypeAppRteInstallation = (nacre.RTE_Installation) stereotypeAppEquipement;

		String localControllerName = null;
		String localControllerQName = null;
		LocalController stereotypeAppControler = stereotypeAppRteInstallation.getLocalcontroller();
		if (stereotypeAppControler != null && stereotypeAppControler.getBase_Class() != null) {
			localControllerName = stereotypeAppControler.getBase_Class().getName();
			localControllerQName = stereotypeAppControler.getBase_Class().getQualifiedName();
		}

		String branch = stereotypeAppRteInstallation.getBranch();
		String end = stereotypeAppRteInstallation.getEnd();
		int side = stereotypeAppRteInstallation.getSide();
		NFP_IST ist = stereotypeAppRteInstallation.getIst();
		fr.cea.nacre.model.NACREMM.cfa.PowerType newIst =null;
		if( ist!=null) {
			newIst= createPowerType(
					ist.getPrecision(), ist.getUnit().getLiteral());
		}

		createRteInstallation(gcm_bus,
				stereotypeAppRteInstallation.getBase_Port().getName(),
				stereotypeAppRteInstallation.getBase_Port().getQualifiedName(),
				stereotypeAppRteInstallation.isConnected(),
				branch, end, side, newIst, localControllerName, localControllerQName);
	}

	private void createMMBattery(
			fr.cea.nacre.model.NACREMM.cfa.Bus gcm_bus,
			nacre.Equipement stereotypeAppEquipement) {
		nacre.Battery stereotypeAppBattery = (nacre.Battery) stereotypeAppEquipement;

		String localControllerName = null;
		String localControllerQName = null;
		LocalController lc = stereotypeAppBattery.getLocalcontroller();
		if (lc != null) {
			localControllerName = lc.getBase_Class().getName();
			localControllerQName = lc.getBase_Class().getQualifiedName();
		}

		// MaxPowerInjection of type NFP_Power
		fr.cea.nacre.model.NACREMM.cfa.PowerType minPower = null;
		NFP_Power minPowerInjection = stereotypeAppBattery.getMinPowerInjection();
		if (minPowerInjection != null) {
			minPower = createPowerType(
					minPowerInjection.getPrecision(),
					minPowerInjection.getUnit().getLiteral());
		}
		fr.cea.nacre.model.NACREMM.cfa.PowerType maxPower = null;
		NFP_Power maxPowerInjection = stereotypeAppBattery.getMaxPowerInjection();
		if (maxPowerInjection != null) {
			maxPower = createPowerType(
					maxPowerInjection.getPrecision(),
					maxPowerInjection.getUnit().getLiteral());
		}

		createBattery(gcm_bus,
				stereotypeAppBattery.getBase_Port().getName(),
				stereotypeAppBattery.getBase_Port().getQualifiedName(),
				stereotypeAppBattery.isConnected(),
				stereotypeAppBattery.isActivable(),
				 minPower, maxPower, localControllerName, localControllerQName);
	}

	private void createMMGenerator(
			fr.cea.nacre.model.NACREMM.cfa.Bus gcm_bus,
			nacre.Equipement stereotypeAppEquipement) {
		nacre.Generator stereotypeAppGenerator = (nacre.Generator) stereotypeAppEquipement;

		String localControllerName = null;
		String localControllerQName = null;
		LocalController stereotypeLocalController = stereotypeAppGenerator.getLocalcontroller();
		if (stereotypeLocalController != null) {
			localControllerName = stereotypeLocalController.getBase_Class().getName();
			localControllerQName = stereotypeLocalController.getBase_Class().getQualifiedName();
		}

		// MaxPowerGeneration of type NFP_Power
		fr.cea.nacre.model.NACREMM.cfa.PowerType maxPower = null;
		NFP_Power maxPowerGeneration = stereotypeAppGenerator.getMaxPowerGeneration();
		if (maxPowerGeneration != null) {
			maxPower = createPowerType(
					maxPowerGeneration.getPrecision(),
					maxPowerGeneration.getUnit().getLiteral());
		}
		fr.cea.nacre.model.NACREMM.cfa.PowerType minPower = null;
		NFP_Power minPowerGeneration = stereotypeAppGenerator.getMinPowerGeneration();
		if (minPowerGeneration != null) {
			minPower = createPowerType(
					minPowerGeneration.getPrecision(),
					minPowerGeneration.getUnit().getLiteral());
		}

		createGenerator(gcm_bus,
				stereotypeAppGenerator.getBase_Port().getName(),
				stereotypeAppGenerator.getBase_Port().getQualifiedName(),
				stereotypeAppGenerator.isConnected(),
				stereotypeAppGenerator.isActivable(),
				minPower, maxPower, localControllerName, localControllerQName);
	}
/**************create MMLoads***********IK*/
	private void createMMLoads(
			fr.cea.nacre.model.NACREMM.cfa.Bus gcm_bus,
			nacre.Equipement stereotypeAppEquipement) {
		nacre.Load stereotypeAppLoads = (nacre.Load) stereotypeAppEquipement;

		String localControllerName = null;
		String localControllerQName = null;
		LocalController stereotypeLocalController = stereotypeAppLoads.getLocalcontroller();
		if (stereotypeLocalController != null) {
			localControllerName = stereotypeLocalController.getBase_Class().getName();
			localControllerQName = stereotypeLocalController.getBase_Class().getQualifiedName();
		}

		createLoad(gcm_bus,
				stereotypeAppLoads.getBase_Port().getName(),
				stereotypeAppLoads.getBase_Port().getQualifiedName(),
				stereotypeAppLoads.isConnected(),
				stereotypeAppLoads.isActivable(), localControllerName, localControllerQName);
	}

/******************************************/	
	/**
	 * construct a commonType that represent the nominallevel from a bus
	 * @param stereotypeAppBus the stereotypeAmmplication that represents the bus
	 * @return the commonType MM instance
	 */
	private fr.cea.nacre.model.NACREMM.CommonType.CommonType getNominalLevel(nacre.Bus stereotypeAppBus) {

		nacre.VoltageLevel nominal_level = stereotypeAppBus.getNominalLevel();
		if (nominal_level != null) {
			fr.cea.nacre.model.NACREMM.CommonType.CommonType gcm_nominalLevel=CommonTypeFactory.eINSTANCE.createCommonType();
			gcm_nominalLevel.setUnit(KV_UNIT);
			int voltage_level = nominal_level.getValue();
			gcm_nominalLevel.setValue(voltage_level);
			return gcm_nominalLevel;
		}

		fr.cea.nacre.model.NACREMM.CommonType.CommonType gcm_nominalLevel=CommonTypeFactory.eINSTANCE.createCommonType();
		gcm_nominalLevel.setUnit(KV_UNIT);
		gcm_nominalLevel.setValue(63);
		return gcm_nominalLevel;
	}


	/////////////////////////////////////
	// CFA FACTORY
	/////////////////////////////////////
	private final static CfaFactory CFA_FACTORY = CfaFactory.eINSTANCE;

	protected Cfa createCfa(Study study, String name,String qualifiedName) {
		Cfa cfa = CFA_FACTORY.createCfa();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		study.setCfa(cfa);

		cfa.setName(name);
		cfa.setQualifiedName(qualifiedName);

		return  cfa;
	}


	protected fr.cea.nacre.model.NACREMM.cfa.MainGrid createMainGrid(
			Cfa cfa, String name,String qualifiedName, String centralControllerName,String centralControllerqualifiedName, String centralControllerBehavior) {
		fr.cea.nacre.model.NACREMM.cfa.MainGrid mainGrid = CFA_FACTORY.createMainGrid();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		cfa.setMaingrid(mainGrid);

		mainGrid.setName(name);
		mainGrid.setQualifiedName(qualifiedName);

		if( centralControllerName != null ) {
			fr.cea.nacre.model.NACREMM.cfa.Controller controller = CFA_FACTORY.createController();
			// Immediately set container for UID w.r.t. Qualified Name based calculation
			mainGrid.setCentralController(controller);

			controller.setName(centralControllerName);
			controller.setQualifiedName(centralControllerqualifiedName);
			controller.setControlBehavior(centralControllerBehavior);
		}

		return mainGrid;
	}


	protected fr.cea.nacre.model.NACREMM.cfa.Zone createZone(
			fr.cea.nacre.model.NACREMM.cfa.MainGrid mainGrid, String name,String qualifiedName,
			String zonalControllerName,String zonalControllerQualifiedName, String zonalControllerBehavior) {
		fr.cea.nacre.model.NACREMM.cfa.Zone zone = CFA_FACTORY.createZone();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		mainGrid.getZones().add(zone);

		zone.setName(name);
		zone.setQualifiedName(qualifiedName);

		if( zonalControllerName != null ) {
			fr.cea.nacre.model.NACREMM.cfa.Controller controller = CFA_FACTORY.createController();
			// Immediately set container for UID w.r.t. Qualified Name based calculation
			zone.setZonalController(controller);

			controller.setName(zonalControllerName);
			controller.setQualifiedName(zonalControllerQualifiedName);
			controller.setControlBehavior(zonalControllerBehavior);
		}

		return zone;
	}


	protected fr.cea.nacre.model.NACREMM.cfa.Substation createSubstation(UIDElement container , String name,String qualifiedName) {
		fr.cea.nacre.model.NACREMM.cfa.Substation substation = CFA_FACTORY.createSubstation();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		if( container instanceof fr.cea.nacre.model.NACREMM.cfa.Zone) {
			((fr.cea.nacre.model.NACREMM.cfa.Zone) container).getSubstations().add(substation);
		}
		else if( container instanceof fr.cea.nacre.model.NACREMM.cfa.MainGrid) {
			((fr.cea.nacre.model.NACREMM.cfa.MainGrid) container).getSubstations().add(substation);
		}
		else {
			System.err.println("Une expected container < " + container.getName() + " > for substations !");
		}

		substation.setName(name);
		substation.setQualifiedName(qualifiedName);

		return substation;
	}


	protected fr.cea.nacre.model.NACREMM.cfa.Bus createBus(
			fr.cea.nacre.model.NACREMM.cfa.Substation substation, String name,String qualifiedName,
			boolean connected, fr.cea.nacre.model.NACREMM.CommonType.CommonType nominalLevel) {
		fr.cea.nacre.model.NACREMM.cfa.Bus bus = CFA_FACTORY.createBus();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		substation.getBus().add(bus);

		bus.setName(name);
		bus.setQualifiedName(qualifiedName);
		bus.setNominalLevel(nominalLevel);
		bus.setConnected(connected);
		return bus;
	}


	protected fr.cea.nacre.model.NACREMM.cfa.Generator createGenerator(
			fr.cea.nacre.model.NACREMM.cfa.Bus bus, String name,String qualifiedName, boolean connected, boolean activable,
			fr.cea.nacre.model.NACREMM.cfa.PowerType minPowerGeneration,
			fr.cea.nacre.model.NACREMM.cfa.PowerType maxPowerGeneration,
			String localControllerName,String localControllerQualifiedName) {
		fr.cea.nacre.model.NACREMM.cfa.Generator generator = CFA_FACTORY.createGenerator();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		bus.getGenerators().add(generator);

		generator.setName(name);
		generator.setQualifiedName(qualifiedName);
		generator.setConnected(connected);
		generator.setActivable(activable);

		if( minPowerGeneration != null ) {
			generator.setMinPowerGeneration(minPowerGeneration);
		}

		if( maxPowerGeneration != null ) {
			generator.setMaxPowerGeneration(maxPowerGeneration);
		}

		if( localControllerName != null ) {
			fr.cea.nacre.model.NACREMM.cfa.Controller controller = CFA_FACTORY.createController();
			// Immediately set container for UID w.r.t. Qualified Name based calculation
			generator.setLocalController(controller);

			controller.setName(localControllerName);
			controller.setQualifiedName(localControllerQualifiedName);
		}

		return generator;
	}

	protected fr.cea.nacre.model.NACREMM.cfa.PowerType createPowerType(double value, String unit) {
		fr.cea.nacre.model.NACREMM.cfa.PowerType powerType = CFA_FACTORY.createPowerType();
		powerType.setValue(value);
		powerType.setUnit(unit);

		return powerType;
	}

	protected fr.cea.nacre.model.NACREMM.cfa.Battery createBattery(
			fr.cea.nacre.model.NACREMM.cfa.Bus bus, String name,String qualifiedName, boolean connected, boolean isActivable,
			fr.cea.nacre.model.NACREMM.cfa.PowerType minPowerInjection,
			fr.cea.nacre.model.NACREMM.cfa.PowerType maxPowerInjection,
			String localControllerName,String localControllerQualifiedName) {
		fr.cea.nacre.model.NACREMM.cfa.Battery battery = CFA_FACTORY.createBattery();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		bus.getBatteries().add(battery);

		battery.setName(name);
		battery.setQualifiedName(qualifiedName);
		battery.setConnected(connected);
		battery.setActivable(isActivable);
		if( minPowerInjection != null ) {
			battery.setMinPowerInjection(minPowerInjection);
		}

		if( maxPowerInjection != null ) {
			battery.setMaxPowerInjection(maxPowerInjection);
		}

		if( localControllerName != null ) {
			fr.cea.nacre.model.NACREMM.cfa.Controller controller = CFA_FACTORY.createController();
			// Immediately set container for UID w.r.t. Qualified Name based calculation
			battery.setLocalController(controller);

			controller.setName(localControllerName);
			controller.setQualifiedName(localControllerQualifiedName);
		}

		return battery;
	}
/********** create Loads*******IK*/
	
	protected fr.cea.nacre.model.NACREMM.cfa.Load createLoad(
			fr.cea.nacre.model.NACREMM.cfa.Bus bus, String name,String qualifiedName, boolean connected, boolean activable,
			String localControllerName,String localControllerQualifiedName) {
		fr.cea.nacre.model.NACREMM.cfa.Load load = CFA_FACTORY.createLoad();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		bus.getLoads().add(load);

		load.setName(name);
		load.setQualifiedName(qualifiedName);
		load.setConnected(connected);
		load.setActivable(activable);

		if( localControllerName != null ) {
			fr.cea.nacre.model.NACREMM.cfa.Controller controller = CFA_FACTORY.createController();
			// Immediately set container for UID w.r.t. Qualified Name based calculation
			load.setLocalController(controller);

			controller.setName(localControllerName);
			controller.setQualifiedName(localControllerQualifiedName);
		}

		return load;
	}
	
/****************************/
	protected fr.cea.nacre.model.NACREMM.cfa.RteInstallation createRteInstallation(
			fr.cea.nacre.model.NACREMM.cfa.Bus bus, String name,String qualifiedName,
			boolean connected, String branch, String end, int side,
			fr.cea.nacre.model.NACREMM.cfa.PowerType ist, String localControllerName, String localControllerQualifiedName) {
		fr.cea.nacre.model.NACREMM.cfa.RteInstallation rteInstallation = CFA_FACTORY.createRteInstallation();
		// Immediately set container for UID w.r.t. Qualified Name based calculation
		bus.getRteInstallations().add(rteInstallation);

		rteInstallation.setName(name);
		rteInstallation.setQualifiedName(qualifiedName);
		rteInstallation.setConnected(connected);
		rteInstallation.setBranch(branch);
		rteInstallation.setEnd(end);
		rteInstallation.setSide(side);
		rteInstallation.setIst(ist);

		if( localControllerName != null ) {
			fr.cea.nacre.model.NACREMM.cfa.Controller controller = CFA_FACTORY.createController();
			// Immediately set container for UID w.r.t. Qualified Name based calculation
			rteInstallation.setLocalController(controller);

			controller.setName(localControllerName);
			controller.setQualifiedName(localControllerQualifiedName);
		}

		return rteInstallation;
	}

}
