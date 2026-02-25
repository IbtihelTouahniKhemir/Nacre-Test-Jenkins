/**
 */
package fr.cea.nacre.model.NACREMM.cfa.impl;

import fr.cea.nacre.model.NACREMM.CommonType.CommonTypePackage;

import fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypePackageImpl;

import fr.cea.nacre.model.NACREMM.Hazard.HazardPackage;

import fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl;
import fr.cea.nacre.model.NACREMM.UID.UIDPackage;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDPackageImpl;

import fr.cea.nacre.model.NACREMM.cfa.Battery;
import fr.cea.nacre.model.NACREMM.cfa.Bus;
import fr.cea.nacre.model.NACREMM.cfa.Cfa;
import fr.cea.nacre.model.NACREMM.cfa.CfaFactory;
import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;
import fr.cea.nacre.model.NACREMM.cfa.Controller;
import fr.cea.nacre.model.NACREMM.cfa.Equipment;
import fr.cea.nacre.model.NACREMM.cfa.Generator;
import fr.cea.nacre.model.NACREMM.cfa.Line;
import fr.cea.nacre.model.NACREMM.cfa.Load;
import fr.cea.nacre.model.NACREMM.cfa.MainGrid;
import fr.cea.nacre.model.NACREMM.cfa.PowerType;
import fr.cea.nacre.model.NACREMM.cfa.PowerUnitKind;
import fr.cea.nacre.model.NACREMM.cfa.RteInstallation;
import fr.cea.nacre.model.NACREMM.cfa.Substation;
import fr.cea.nacre.model.NACREMM.cfa.Zone;

import fr.cea.nacre.model.NACREMM.cfra.CfraPackage;

import fr.cea.nacre.model.NACREMM.cfra.impl.CfraPackageImpl;

import fr.cea.nacre.model.NACREMM.cra.CraPackage;

import fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl;
import fr.cea.nacre.model.NACREMM.study.StudyPackage;

import fr.cea.nacre.model.NACREMM.study.impl.StudyPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CfaPackageImpl extends EPackageImpl implements CfaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cfaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainGridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteInstallationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum powerUnitKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CfaPackageImpl() {
		super(eNS_URI, CfaFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CfaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CfaPackage init() {
		if (isInited) return (CfaPackage)EPackage.Registry.INSTANCE.getEPackage(CfaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCfaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CfaPackageImpl theCfaPackage = registeredCfaPackage instanceof CfaPackageImpl ? (CfaPackageImpl)registeredCfaPackage : new CfaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CraPackage.eNS_URI);
		CraPackageImpl theCraPackage = (CraPackageImpl)(registeredPackage instanceof CraPackageImpl ? registeredPackage : CraPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UIDPackage.eNS_URI);
		UIDPackageImpl theUIDPackage = (UIDPackageImpl)(registeredPackage instanceof UIDPackageImpl ? registeredPackage : UIDPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonTypePackage.eNS_URI);
		CommonTypePackageImpl theCommonTypePackage = (CommonTypePackageImpl)(registeredPackage instanceof CommonTypePackageImpl ? registeredPackage : CommonTypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CfraPackage.eNS_URI);
		CfraPackageImpl theCfraPackage = (CfraPackageImpl)(registeredPackage instanceof CfraPackageImpl ? registeredPackage : CfraPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HazardPackage.eNS_URI);
		HazardPackageImpl theHazardPackage = (HazardPackageImpl)(registeredPackage instanceof HazardPackageImpl ? registeredPackage : HazardPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StudyPackage.eNS_URI);
		StudyPackageImpl theStudyPackage = (StudyPackageImpl)(registeredPackage instanceof StudyPackageImpl ? registeredPackage : StudyPackage.eINSTANCE);

		// Create package meta-data objects
		theCfaPackage.createPackageContents();
		theCraPackage.createPackageContents();
		theUIDPackage.createPackageContents();
		theCommonTypePackage.createPackageContents();
		theCfraPackage.createPackageContents();
		theHazardPackage.createPackageContents();
		theStudyPackage.createPackageContents();

		// Initialize created meta-data
		theCfaPackage.initializePackageContents();
		theCraPackage.initializePackageContents();
		theUIDPackage.initializePackageContents();
		theCommonTypePackage.initializePackageContents();
		theCfraPackage.initializePackageContents();
		theHazardPackage.initializePackageContents();
		theStudyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCfaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CfaPackage.eNS_URI, theCfaPackage);
		return theCfaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCfa() {
		return cfaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCfa_Maingrid() {
		return (EReference)cfaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMainGrid() {
		return mainGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMainGrid_Zones() {
		return (EReference)mainGridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMainGrid_Substations() {
		return (EReference)mainGridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMainGrid_CentralController() {
		return (EReference)mainGridEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMainGrid_Lines() {
		return (EReference)mainGridEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZone() {
		return zoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZone_Substations() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZone_ZonalController() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubstation() {
		return substationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubstation_Bus() {
		return (EReference)substationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBus() {
		return busEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBus_NominalLevel() {
		return (EReference)busEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBus_Connected() {
		return (EAttribute)busEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBus_Generators() {
		return (EReference)busEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBus_Batteries() {
		return (EReference)busEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBus_RteInstallations() {
		return (EReference)busEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBus_Loads() {
		return (EReference)busEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenerator() {
		return generatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGenerator_MinPowerGeneration() {
		return (EReference)generatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGenerator_MaxPowerGeneration() {
		return (EReference)generatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEquipment() {
		return equipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquipment_Connected() {
		return (EAttribute)equipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEquipment_LocalController() {
		return (EReference)equipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquipment_Activable() {
		return (EAttribute)equipmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPowerType() {
		return powerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPowerType_Value() {
		return (EAttribute)powerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPowerType_Unit() {
		return (EAttribute)powerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getController_ControlBehavior() {
		return (EAttribute)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBattery() {
		return batteryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBattery_MaxPowerInjection() {
		return (EReference)batteryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBattery_MinPowerInjection() {
		return (EReference)batteryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRteInstallation() {
		return rteInstallationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRteInstallation_Branch() {
		return (EAttribute)rteInstallationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRteInstallation_Connected() {
		return (EAttribute)rteInstallationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRteInstallation_Activable() {
		return (EAttribute)rteInstallationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRteInstallation_LocalController() {
		return (EReference)rteInstallationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRteInstallation_End() {
		return (EAttribute)rteInstallationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRteInstallation_Side() {
		return (EAttribute)rteInstallationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRteInstallation_Ist() {
		return (EReference)rteInstallationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRteInstallation_LineRef() {
		return (EAttribute)rteInstallationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoad() {
		return loadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPowerUnitKind() {
		return powerUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CfaFactory getCfaFactory() {
		return (CfaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cfaEClass = createEClass(CFA);
		createEReference(cfaEClass, CFA__MAINGRID);

		mainGridEClass = createEClass(MAIN_GRID);
		createEReference(mainGridEClass, MAIN_GRID__ZONES);
		createEReference(mainGridEClass, MAIN_GRID__SUBSTATIONS);
		createEReference(mainGridEClass, MAIN_GRID__CENTRAL_CONTROLLER);
		createEReference(mainGridEClass, MAIN_GRID__LINES);

		zoneEClass = createEClass(ZONE);
		createEReference(zoneEClass, ZONE__SUBSTATIONS);
		createEReference(zoneEClass, ZONE__ZONAL_CONTROLLER);

		substationEClass = createEClass(SUBSTATION);
		createEReference(substationEClass, SUBSTATION__BUS);

		busEClass = createEClass(BUS);
		createEReference(busEClass, BUS__NOMINAL_LEVEL);
		createEAttribute(busEClass, BUS__CONNECTED);
		createEReference(busEClass, BUS__GENERATORS);
		createEReference(busEClass, BUS__BATTERIES);
		createEReference(busEClass, BUS__RTE_INSTALLATIONS);
		createEReference(busEClass, BUS__LOADS);

		generatorEClass = createEClass(GENERATOR);
		createEReference(generatorEClass, GENERATOR__MIN_POWER_GENERATION);
		createEReference(generatorEClass, GENERATOR__MAX_POWER_GENERATION);

		equipmentEClass = createEClass(EQUIPMENT);
		createEAttribute(equipmentEClass, EQUIPMENT__CONNECTED);
		createEReference(equipmentEClass, EQUIPMENT__LOCAL_CONTROLLER);
		createEAttribute(equipmentEClass, EQUIPMENT__ACTIVABLE);

		controllerEClass = createEClass(CONTROLLER);
		createEAttribute(controllerEClass, CONTROLLER__CONTROL_BEHAVIOR);

		powerTypeEClass = createEClass(POWER_TYPE);
		createEAttribute(powerTypeEClass, POWER_TYPE__VALUE);
		createEAttribute(powerTypeEClass, POWER_TYPE__UNIT);

		batteryEClass = createEClass(BATTERY);
		createEReference(batteryEClass, BATTERY__MAX_POWER_INJECTION);
		createEReference(batteryEClass, BATTERY__MIN_POWER_INJECTION);

		rteInstallationEClass = createEClass(RTE_INSTALLATION);
		createEAttribute(rteInstallationEClass, RTE_INSTALLATION__BRANCH);
		createEAttribute(rteInstallationEClass, RTE_INSTALLATION__CONNECTED);
		createEAttribute(rteInstallationEClass, RTE_INSTALLATION__ACTIVABLE);
		createEReference(rteInstallationEClass, RTE_INSTALLATION__LOCAL_CONTROLLER);
		createEAttribute(rteInstallationEClass, RTE_INSTALLATION__END);
		createEAttribute(rteInstallationEClass, RTE_INSTALLATION__SIDE);
		createEReference(rteInstallationEClass, RTE_INSTALLATION__IST);
		createEAttribute(rteInstallationEClass, RTE_INSTALLATION__LINE_REF);

		loadEClass = createEClass(LOAD);

		lineEClass = createEClass(LINE);

		// Create enums
		powerUnitKindEEnum = createEEnum(POWER_UNIT_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UIDPackage theUIDPackage = (UIDPackage)EPackage.Registry.INSTANCE.getEPackage(UIDPackage.eNS_URI);
		CommonTypePackage theCommonTypePackage = (CommonTypePackage)EPackage.Registry.INSTANCE.getEPackage(CommonTypePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cfaEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		mainGridEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		zoneEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		substationEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		busEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		generatorEClass.getESuperTypes().add(this.getEquipment());
		equipmentEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		controllerEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		batteryEClass.getESuperTypes().add(this.getEquipment());
		rteInstallationEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		loadEClass.getESuperTypes().add(this.getEquipment());
		lineEClass.getESuperTypes().add(theUIDPackage.getUIDElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(cfaEClass, Cfa.class, "Cfa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCfa_Maingrid(), this.getMainGrid(), null, "maingrid", null, 0, 1, Cfa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mainGridEClass, MainGrid.class, "MainGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainGrid_Zones(), this.getZone(), null, "zones", null, 0, -1, MainGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMainGrid_Substations(), this.getSubstation(), null, "substations", null, 1, -1, MainGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMainGrid_CentralController(), this.getController(), null, "centralController", null, 0, 1, MainGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMainGrid_Lines(), this.getLine(), null, "lines", null, 0, -1, MainGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(zoneEClass, Zone.class, "Zone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZone_Substations(), this.getSubstation(), null, "substations", null, 1, -1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getZone_ZonalController(), this.getController(), null, "zonalController", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(substationEClass, Substation.class, "Substation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstation_Bus(), this.getBus(), null, "bus", null, 0, -1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBus_NominalLevel(), theCommonTypePackage.getCommonType(), null, "nominalLevel", null, 0, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBus_Connected(), theTypesPackage.getBoolean(), "connected", null, 1, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBus_Generators(), this.getGenerator(), null, "generators", null, 0, -1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBus_Batteries(), this.getBattery(), null, "batteries", null, 0, -1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBus_RteInstallations(), this.getRteInstallation(), null, "rteInstallations", null, 0, -1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBus_Loads(), this.getLoad(), null, "loads", null, 0, -1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generatorEClass, Generator.class, "Generator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenerator_MinPowerGeneration(), this.getPowerType(), null, "minPowerGeneration", null, 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenerator_MaxPowerGeneration(), this.getPowerType(), null, "maxPowerGeneration", null, 0, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(equipmentEClass, Equipment.class, "Equipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquipment_Connected(), theTypesPackage.getBoolean(), "connected", null, 1, 1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEquipment_LocalController(), this.getController(), null, "localController", null, 0, 1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEquipment_Activable(), theTypesPackage.getBoolean(), "activable", null, 1, 1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getController_ControlBehavior(), theTypesPackage.getString(), "controlBehavior", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(powerTypeEClass, PowerType.class, "PowerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPowerType_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, PowerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPowerType_Unit(), theTypesPackage.getString(), "unit", null, 1, 1, PowerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(batteryEClass, Battery.class, "Battery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBattery_MaxPowerInjection(), this.getPowerType(), null, "maxPowerInjection", null, 0, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBattery_MinPowerInjection(), this.getPowerType(), null, "minPowerInjection", null, 0, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rteInstallationEClass, RteInstallation.class, "RteInstallation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRteInstallation_Branch(), theTypesPackage.getString(), "branch", null, 1, 1, RteInstallation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRteInstallation_Connected(), theTypesPackage.getBoolean(), "connected", null, 1, 1, RteInstallation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRteInstallation_Activable(), theTypesPackage.getBoolean(), "activable", null, 1, 1, RteInstallation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRteInstallation_LocalController(), this.getController(), null, "localController", null, 0, 1, RteInstallation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRteInstallation_End(), theTypesPackage.getString(), "end", null, 1, 1, RteInstallation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRteInstallation_Side(), theTypesPackage.getInteger(), "side", null, 1, 1, RteInstallation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRteInstallation_Ist(), this.getPowerType(), null, "ist", null, 0, 1, RteInstallation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRteInstallation_LineRef(), theTypesPackage.getString(), "lineRef", null, 1, 1, RteInstallation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(loadEClass, Load.class, "Load", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(powerUnitKindEEnum, PowerUnitKind.class, "PowerUnitKind");
		addEEnumLiteral(powerUnitKindEEnum, PowerUnitKind.MW);
		addEEnumLiteral(powerUnitKindEEnum, PowerUnitKind.KW);
		addEEnumLiteral(powerUnitKindEEnum, PowerUnitKind.W);

		// Create resource
		createResource(eNS_URI);
	}

} //CfaPackageImpl
