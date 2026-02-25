/**
 */
package fr.cea.nacre.model.NACREMM.cfa;

import fr.cea.nacre.model.NACREMM.UID.UIDPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.cea.nacre.model.NACREMM.cfa.CfaFactory
 * @model kind="package"
 * @generated
 */
public interface CfaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cfa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///NACREMM/cfa.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NACREMM.cfa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CfaPackage eINSTANCE = fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.CfaImpl <em>Cfa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaImpl
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getCfa()
	 * @generated
	 */
	int CFA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Maingrid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA__MAINGRID = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cfa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cfa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.MainGridImpl <em>Main Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.MainGridImpl
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getMainGrid()
	 * @generated
	 */
	int MAIN_GRID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Zones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID__ZONES = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Substations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID__SUBSTATIONS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Central Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID__CENTRAL_CONTROLLER = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID__LINES = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Main Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Main Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.ZoneImpl
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Substations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__SUBSTATIONS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Zonal Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ZONAL_CONTROLLER = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.SubstationImpl <em>Substation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.SubstationImpl
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getSubstation()
	 * @generated
	 */
	int SUBSTATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__BUS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Substation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Substation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.BusImpl
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Nominal Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NOMINAL_LEVEL = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CONNECTED = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__GENERATORS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Batteries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BATTERIES = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rte Installations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__RTE_INSTALLATIONS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__LOADS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.EquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.EquipmentImpl
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getEquipment()
	 * @generated
	 */
	int EQUIPMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__CONNECTED = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__LOCAL_CONTROLLER = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__ACTIVABLE = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.GeneratorImpl
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__NAME = EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__UID = EQUIPMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__QUALIFIED_NAME = EQUIPMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CONNECTED = EQUIPMENT__CONNECTED;

	/**
	 * The feature id for the '<em><b>Local Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__LOCAL_CONTROLLER = EQUIPMENT__LOCAL_CONTROLLER;

	/**
	 * The feature id for the '<em><b>Activable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ACTIVABLE = EQUIPMENT__ACTIVABLE;

	/**
	 * The feature id for the '<em><b>Min Power Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__MIN_POWER_GENERATION = EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Power Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__MAX_POWER_GENERATION = EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.PowerTypeImpl <em>Power Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.PowerTypeImpl
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getPowerType()
	 * @generated
	 */
	int POWER_TYPE = 8;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.ControllerImpl
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Control Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CONTROL_BEHAVIOR = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TYPE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Power Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Power Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.BatteryImpl <em>Battery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.BatteryImpl
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getBattery()
	 * @generated
	 */
	int BATTERY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__NAME = EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__UID = EQUIPMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__QUALIFIED_NAME = EQUIPMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__CONNECTED = EQUIPMENT__CONNECTED;

	/**
	 * The feature id for the '<em><b>Local Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__LOCAL_CONTROLLER = EQUIPMENT__LOCAL_CONTROLLER;

	/**
	 * The feature id for the '<em><b>Activable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__ACTIVABLE = EQUIPMENT__ACTIVABLE;

	/**
	 * The feature id for the '<em><b>Max Power Injection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__MAX_POWER_INJECTION = EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Power Injection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__MIN_POWER_INJECTION = EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_OPERATION_COUNT = EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.RteInstallationImpl <em>Rte Installation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.RteInstallationImpl
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getRteInstallation()
	 * @generated
	 */
	int RTE_INSTALLATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__BRANCH = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__CONNECTED = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__ACTIVABLE = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Local Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__LOCAL_CONTROLLER = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__END = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__SIDE = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__IST = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Line Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__LINE_REF = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Rte Installation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Rte Installation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.LoadImpl
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__NAME = EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__UID = EQUIPMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__QUALIFIED_NAME = EQUIPMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__CONNECTED = EQUIPMENT__CONNECTED;

	/**
	 * The feature id for the '<em><b>Local Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__LOCAL_CONTROLLER = EQUIPMENT__LOCAL_CONTROLLER;

	/**
	 * The feature id for the '<em><b>Activable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ACTIVABLE = EQUIPMENT__ACTIVABLE;

	/**
	 * The number of structural features of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_OPERATION_COUNT = EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.LineImpl
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfa.PowerUnitKind <em>Power Unit Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfa.PowerUnitKind
	 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getPowerUnitKind()
	 * @generated
	 */
	int POWER_UNIT_KIND = 13;


	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfa.Cfa <em>Cfa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cfa</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Cfa
	 * @generated
	 */
	EClass getCfa();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cfa.Cfa#getMaingrid <em>Maingrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maingrid</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Cfa#getMaingrid()
	 * @see #getCfa()
	 * @generated
	 */
	EReference getCfa_Maingrid();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfa.MainGrid <em>Main Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Grid</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.MainGrid
	 * @generated
	 */
	EClass getMainGrid();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.cfa.MainGrid#getZones <em>Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zones</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.MainGrid#getZones()
	 * @see #getMainGrid()
	 * @generated
	 */
	EReference getMainGrid_Zones();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.cfa.MainGrid#getSubstations <em>Substations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substations</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.MainGrid#getSubstations()
	 * @see #getMainGrid()
	 * @generated
	 */
	EReference getMainGrid_Substations();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cfa.MainGrid#getCentralController <em>Central Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Central Controller</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.MainGrid#getCentralController()
	 * @see #getMainGrid()
	 * @generated
	 */
	EReference getMainGrid_CentralController();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.cfa.MainGrid#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.MainGrid#getLines()
	 * @see #getMainGrid()
	 * @generated
	 */
	EReference getMainGrid_Lines();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfa.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.cfa.Zone#getSubstations <em>Substations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substations</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Zone#getSubstations()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Substations();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cfa.Zone#getZonalController <em>Zonal Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zonal Controller</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Zone#getZonalController()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_ZonalController();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfa.Substation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substation</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Substation
	 * @generated
	 */
	EClass getSubstation();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.cfa.Substation#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Substation#getBus()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Bus();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfa.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cfa.Bus#getNominalLevel <em>Nominal Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nominal Level</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Bus#getNominalLevel()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_NominalLevel();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfa.Bus#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Bus#isConnected()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_Connected();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.cfa.Bus#getGenerators <em>Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generators</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Bus#getGenerators()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Generators();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.cfa.Bus#getBatteries <em>Batteries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Batteries</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Bus#getBatteries()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Batteries();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.cfa.Bus#getRteInstallations <em>Rte Installations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte Installations</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Bus#getRteInstallations()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_RteInstallations();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.cfa.Bus#getLoads <em>Loads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loads</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Bus#getLoads()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Loads();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfa.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Generator
	 * @generated
	 */
	EClass getGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cfa.Generator#getMinPowerGeneration <em>Min Power Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Power Generation</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Generator#getMinPowerGeneration()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_MinPowerGeneration();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cfa.Generator#getMaxPowerGeneration <em>Max Power Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Power Generation</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Generator#getMaxPowerGeneration()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_MaxPowerGeneration();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfa.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Equipment
	 * @generated
	 */
	EClass getEquipment();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfa.Equipment#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Equipment#isConnected()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_Connected();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cfa.Equipment#getLocalController <em>Local Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Controller</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Equipment#getLocalController()
	 * @see #getEquipment()
	 * @generated
	 */
	EReference getEquipment_LocalController();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfa.Equipment#isActivable <em>Activable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activable</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Equipment#isActivable()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_Activable();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfa.PowerType <em>Power Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Type</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.PowerType
	 * @generated
	 */
	EClass getPowerType();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfa.PowerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.PowerType#getValue()
	 * @see #getPowerType()
	 * @generated
	 */
	EAttribute getPowerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfa.PowerType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.PowerType#getUnit()
	 * @see #getPowerType()
	 * @generated
	 */
	EAttribute getPowerType_Unit();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfa.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfa.Controller#getControlBehavior <em>Control Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Behavior</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Controller#getControlBehavior()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_ControlBehavior();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfa.Battery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Battery
	 * @generated
	 */
	EClass getBattery();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cfa.Battery#getMaxPowerInjection <em>Max Power Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Power Injection</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Battery#getMaxPowerInjection()
	 * @see #getBattery()
	 * @generated
	 */
	EReference getBattery_MaxPowerInjection();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cfa.Battery#getMinPowerInjection <em>Min Power Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Power Injection</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Battery#getMinPowerInjection()
	 * @see #getBattery()
	 * @generated
	 */
	EReference getBattery_MinPowerInjection();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation <em>Rte Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Installation</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.RteInstallation
	 * @generated
	 */
	EClass getRteInstallation();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getBranch()
	 * @see #getRteInstallation()
	 * @generated
	 */
	EAttribute getRteInstallation_Branch();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.RteInstallation#isConnected()
	 * @see #getRteInstallation()
	 * @generated
	 */
	EAttribute getRteInstallation_Connected();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#isActivable <em>Activable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activable</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.RteInstallation#isActivable()
	 * @see #getRteInstallation()
	 * @generated
	 */
	EAttribute getRteInstallation_Activable();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getLocalController <em>Local Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Controller</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getLocalController()
	 * @see #getRteInstallation()
	 * @generated
	 */
	EReference getRteInstallation_LocalController();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getEnd()
	 * @see #getRteInstallation()
	 * @generated
	 */
	EAttribute getRteInstallation_End();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getSide()
	 * @see #getRteInstallation()
	 * @generated
	 */
	EAttribute getRteInstallation_Side();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getIst <em>Ist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ist</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getIst()
	 * @see #getRteInstallation()
	 * @generated
	 */
	EReference getRteInstallation_Ist();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getLineRef <em>Line Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Ref</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getLineRef()
	 * @see #getRteInstallation()
	 * @generated
	 */
	EAttribute getRteInstallation_LineRef();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfa.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Load
	 * @generated
	 */
	EClass getLoad();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfa.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for enum '{@link fr.cea.nacre.model.NACREMM.cfa.PowerUnitKind <em>Power Unit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Power Unit Kind</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfa.PowerUnitKind
	 * @generated
	 */
	EEnum getPowerUnitKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CfaFactory getCfaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.CfaImpl <em>Cfa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaImpl
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getCfa()
		 * @generated
		 */
		EClass CFA = eINSTANCE.getCfa();

		/**
		 * The meta object literal for the '<em><b>Maingrid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFA__MAINGRID = eINSTANCE.getCfa_Maingrid();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.MainGridImpl <em>Main Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.MainGridImpl
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getMainGrid()
		 * @generated
		 */
		EClass MAIN_GRID = eINSTANCE.getMainGrid();

		/**
		 * The meta object literal for the '<em><b>Zones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_GRID__ZONES = eINSTANCE.getMainGrid_Zones();

		/**
		 * The meta object literal for the '<em><b>Substations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_GRID__SUBSTATIONS = eINSTANCE.getMainGrid_Substations();

		/**
		 * The meta object literal for the '<em><b>Central Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_GRID__CENTRAL_CONTROLLER = eINSTANCE.getMainGrid_CentralController();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_GRID__LINES = eINSTANCE.getMainGrid_Lines();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.ZoneImpl <em>Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.ZoneImpl
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getZone()
		 * @generated
		 */
		EClass ZONE = eINSTANCE.getZone();

		/**
		 * The meta object literal for the '<em><b>Substations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__SUBSTATIONS = eINSTANCE.getZone_Substations();

		/**
		 * The meta object literal for the '<em><b>Zonal Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__ZONAL_CONTROLLER = eINSTANCE.getZone_ZonalController();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.SubstationImpl <em>Substation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.SubstationImpl
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getSubstation()
		 * @generated
		 */
		EClass SUBSTATION = eINSTANCE.getSubstation();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__BUS = eINSTANCE.getSubstation_Bus();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.BusImpl
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Nominal Level</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__NOMINAL_LEVEL = eINSTANCE.getBus_NominalLevel();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__CONNECTED = eINSTANCE.getBus_Connected();

		/**
		 * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__GENERATORS = eINSTANCE.getBus_Generators();

		/**
		 * The meta object literal for the '<em><b>Batteries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__BATTERIES = eINSTANCE.getBus_Batteries();

		/**
		 * The meta object literal for the '<em><b>Rte Installations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__RTE_INSTALLATIONS = eINSTANCE.getBus_RteInstallations();

		/**
		 * The meta object literal for the '<em><b>Loads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__LOADS = eINSTANCE.getBus_Loads();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.GeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.GeneratorImpl
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getGenerator()
		 * @generated
		 */
		EClass GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '<em><b>Min Power Generation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__MIN_POWER_GENERATION = eINSTANCE.getGenerator_MinPowerGeneration();

		/**
		 * The meta object literal for the '<em><b>Max Power Generation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__MAX_POWER_GENERATION = eINSTANCE.getGenerator_MaxPowerGeneration();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.EquipmentImpl <em>Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.EquipmentImpl
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getEquipment()
		 * @generated
		 */
		EClass EQUIPMENT = eINSTANCE.getEquipment();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__CONNECTED = eINSTANCE.getEquipment_Connected();

		/**
		 * The meta object literal for the '<em><b>Local Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT__LOCAL_CONTROLLER = eINSTANCE.getEquipment_LocalController();

		/**
		 * The meta object literal for the '<em><b>Activable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__ACTIVABLE = eINSTANCE.getEquipment_Activable();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.PowerTypeImpl <em>Power Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.PowerTypeImpl
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getPowerType()
		 * @generated
		 */
		EClass POWER_TYPE = eINSTANCE.getPowerType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_TYPE__VALUE = eINSTANCE.getPowerType_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_TYPE__UNIT = eINSTANCE.getPowerType_Unit();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.ControllerImpl
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Control Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__CONTROL_BEHAVIOR = eINSTANCE.getController_ControlBehavior();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.BatteryImpl <em>Battery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.BatteryImpl
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getBattery()
		 * @generated
		 */
		EClass BATTERY = eINSTANCE.getBattery();

		/**
		 * The meta object literal for the '<em><b>Max Power Injection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATTERY__MAX_POWER_INJECTION = eINSTANCE.getBattery_MaxPowerInjection();

		/**
		 * The meta object literal for the '<em><b>Min Power Injection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATTERY__MIN_POWER_INJECTION = eINSTANCE.getBattery_MinPowerInjection();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.RteInstallationImpl <em>Rte Installation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.RteInstallationImpl
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getRteInstallation()
		 * @generated
		 */
		EClass RTE_INSTALLATION = eINSTANCE.getRteInstallation();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_INSTALLATION__BRANCH = eINSTANCE.getRteInstallation_Branch();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_INSTALLATION__CONNECTED = eINSTANCE.getRteInstallation_Connected();

		/**
		 * The meta object literal for the '<em><b>Activable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_INSTALLATION__ACTIVABLE = eINSTANCE.getRteInstallation_Activable();

		/**
		 * The meta object literal for the '<em><b>Local Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_INSTALLATION__LOCAL_CONTROLLER = eINSTANCE.getRteInstallation_LocalController();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_INSTALLATION__END = eINSTANCE.getRteInstallation_End();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_INSTALLATION__SIDE = eINSTANCE.getRteInstallation_Side();

		/**
		 * The meta object literal for the '<em><b>Ist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_INSTALLATION__IST = eINSTANCE.getRteInstallation_Ist();

		/**
		 * The meta object literal for the '<em><b>Line Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_INSTALLATION__LINE_REF = eINSTANCE.getRteInstallation_LineRef();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.LoadImpl <em>Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.LoadImpl
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getLoad()
		 * @generated
		 */
		EClass LOAD = eINSTANCE.getLoad();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfa.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.LineImpl
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfa.PowerUnitKind <em>Power Unit Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfa.PowerUnitKind
		 * @see fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl#getPowerUnitKind()
		 * @generated
		 */
		EEnum POWER_UNIT_KIND = eINSTANCE.getPowerUnitKind();

	}

} //CfaPackage
