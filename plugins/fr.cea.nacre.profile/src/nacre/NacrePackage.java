/**
 */
package nacre;

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
 * @see nacre.NacreFactory
 * @model kind="package"
 * @generated
 */
public interface NacrePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nacre";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/nacre";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nacre";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NacrePackage eINSTANCE = nacre.impl.NacrePackageImpl.init();

	/**
	 * The meta object id for the '{@link nacre.impl.ControllersImpl <em>Controllers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.ControllersImpl
	 * @see nacre.impl.NacrePackageImpl#getControllers()
	 * @generated
	 */
	int CONTROLLERS = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Controllers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Controllers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nacre.impl.CommunicationMediasImpl <em>Communication Medias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.CommunicationMediasImpl
	 * @see nacre.impl.NacrePackageImpl#getCommunicationMedias()
	 * @generated
	 */
	int COMMUNICATION_MEDIAS = 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIAS__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Communication Medias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIAS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Communication Medias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nacre.impl.ComputingResourcesImpl <em>Computing Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.ComputingResourcesImpl
	 * @see nacre.impl.NacrePackageImpl#getComputingResources()
	 * @generated
	 */
	int COMPUTING_RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCES__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Computing Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Computing Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nacre.impl.SoftwareResourcesImpl <em>Software Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.SoftwareResourcesImpl
	 * @see nacre.impl.NacrePackageImpl#getSoftwareResources()
	 * @generated
	 */
	int SOFTWARE_RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCES__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Software Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Software Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nacre.impl.CFRAImpl <em>CFRA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.CFRAImpl
	 * @see nacre.impl.NacrePackageImpl#getCFRA()
	 * @generated
	 */
	int CFRA = 4;

	/**
	 * The feature id for the '<em><b>Cra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFRA__CRA = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFRA__BASE_PACKAGE = 1;

	/**
	 * The number of structural features of the '<em>CFRA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFRA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CFRA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFRA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nacre.impl.CRAImpl <em>CRA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.CRAImpl
	 * @see nacre.impl.NacrePackageImpl#getCRA()
	 * @generated
	 */
	int CRA = 5;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>CRA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CRA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nacre.impl.MainGridImpl <em>Main Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.MainGridImpl
	 * @see nacre.impl.NacrePackageImpl#getMainGrid()
	 * @generated
	 */
	int MAIN_GRID = 6;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID__ZONE = 1;

	/**
	 * The feature id for the '<em><b>Substation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID__SUBSTATION = 2;

	/**
	 * The feature id for the '<em><b>Centralcontroler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID__CENTRALCONTROLER = 3;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID__LINES = 4;

	/**
	 * The number of structural features of the '<em>Main Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Main Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_GRID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nacre.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.ZoneImpl
	 * @see nacre.impl.NacrePackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 7;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__BASE_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Substation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__SUBSTATION = 2;

	/**
	 * The feature id for the '<em><b>Zonalcontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ZONALCONTROLLER = 3;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__LINES = 4;

	/**
	 * The feature id for the '<em><b>Maingrid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__MAINGRID = 5;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nacre.impl.SubstationImpl <em>Substation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.SubstationImpl
	 * @see nacre.impl.NacrePackageImpl#getSubstation()
	 * @generated
	 */
	int SUBSTATION = 8;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__BASE_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__BUS = 2;

	/**
	 * The feature id for the '<em><b>Maingrid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__MAINGRID = 3;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION__ZONE = 4;

	/**
	 * The number of structural features of the '<em>Substation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Substation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nacre.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.BusImpl
	 * @see nacre.impl.NacrePackageImpl#getBus()
	 * @generated
	 */
	int BUS = 9;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BASE_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Nominal Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NOMINAL_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CONNECTED = 3;

	/**
	 * The feature id for the '<em><b>Equipement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__EQUIPEMENT = 4;

	/**
	 * The feature id for the '<em><b>Substation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__SUBSTATION = 5;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nacre.impl.EquipementImpl <em>Equipement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.EquipementImpl
	 * @see nacre.impl.NacrePackageImpl#getEquipement()
	 * @generated
	 */
	int EQUIPEMENT = 10;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT__BASE_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT__CONNECTED = 2;

	/**
	 * The feature id for the '<em><b>Activable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT__ACTIVABLE = 3;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT__P = 4;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT__Q = 5;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT__BASE_PORT = 6;

	/**
	 * The feature id for the '<em><b>Localcontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT__LOCALCONTROLLER = 7;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT__BUS = 8;

	/**
	 * The number of structural features of the '<em>Equipement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Equipement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nacre.impl.NFP_PowerImpl <em>NFP Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.NFP_PowerImpl
	 * @see nacre.impl.NacrePackageImpl#getNFP_Power()
	 * @generated
	 */
	int NFP_POWER = 11;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POWER__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POWER__PRECISION = 1;

	/**
	 * The number of structural features of the '<em>NFP Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POWER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>NFP Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POWER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nacre.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.ControllerImpl
	 * @see nacre.impl.NacrePackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 13;

	/**
	 * The feature id for the '<em><b>Control Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CONTROL_BEHAVIOR = 0;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nacre.impl.LocalControllerImpl <em>Local Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.LocalControllerImpl
	 * @see nacre.impl.NacrePackageImpl#getLocalController()
	 * @generated
	 */
	int LOCAL_CONTROLLER = 12;

	/**
	 * The feature id for the '<em><b>Control Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTROLLER__CONTROL_BEHAVIOR = CONTROLLER__CONTROL_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTROLLER__BASE_CLASS = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTROLLER__BASE_PROPERTY = CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Equipement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTROLLER__EQUIPEMENT = CONTROLLER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Local Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTROLLER_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Local Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTROLLER_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nacre.impl.ZonalControllerImpl <em>Zonal Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.ZonalControllerImpl
	 * @see nacre.impl.NacrePackageImpl#getZonalController()
	 * @generated
	 */
	int ZONAL_CONTROLLER = 14;

	/**
	 * The feature id for the '<em><b>Control Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONAL_CONTROLLER__CONTROL_BEHAVIOR = CONTROLLER__CONTROL_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONAL_CONTROLLER__BASE_CLASS = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONAL_CONTROLLER__BASE_PROPERTY = CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONAL_CONTROLLER__ZONE = CONTROLLER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Zonal Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONAL_CONTROLLER_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Zonal Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONAL_CONTROLLER_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nacre.impl.CentralControllerImpl <em>Central Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.CentralControllerImpl
	 * @see nacre.impl.NacrePackageImpl#getCentralController()
	 * @generated
	 */
	int CENTRAL_CONTROLLER = 16;

	/**
	 * The meta object id for the '{@link nacre.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.GeneratorImpl
	 * @see nacre.impl.NacrePackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 17;

	/**
	 * The meta object id for the '{@link nacre.impl.NFP_VoltageImpl <em>NFP Voltage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.NFP_VoltageImpl
	 * @see nacre.impl.NacrePackageImpl#getNFP_Voltage()
	 * @generated
	 */
	int NFP_VOLTAGE = 18;

	/**
	 * The meta object id for the '{@link nacre.impl.NFP_EnergyImpl <em>NFP Energy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.NFP_EnergyImpl
	 * @see nacre.impl.NacrePackageImpl#getNFP_Energy()
	 * @generated
	 */
	int NFP_ENERGY = 19;

	/**
	 * The meta object id for the '{@link nacre.impl.RTE_InstallationImpl <em>RTE Installation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.RTE_InstallationImpl
	 * @see nacre.impl.NacrePackageImpl#getRTE_Installation()
	 * @generated
	 */
	int RTE_INSTALLATION = 20;

	/**
	 * The meta object id for the '{@link nacre.impl.NFP_ISTImpl <em>NFP IST</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.NFP_ISTImpl
	 * @see nacre.impl.NacrePackageImpl#getNFP_IST()
	 * @generated
	 */
	int NFP_IST = 21;

	/**
	 * The meta object id for the '{@link nacre.impl.BatteryImpl <em>Battery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.BatteryImpl
	 * @see nacre.impl.NacrePackageImpl#getBattery()
	 * @generated
	 */
	int BATTERY = 22;

	/**
	 * The meta object id for the '{@link nacre.impl.NFP_VARImpl <em>NFP VAR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.NFP_VARImpl
	 * @see nacre.impl.NacrePackageImpl#getNFP_VAR()
	 * @generated
	 */
	int NFP_VAR = 23;

	/**
	 * The meta object id for the '{@link nacre.impl.ConnectImpl <em>Connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.ConnectImpl
	 * @see nacre.impl.NacrePackageImpl#getConnect()
	 * @generated
	 */
	int CONNECT = 24;

	/**
	 * The meta object id for the '{@link nacre.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.ControlImpl
	 * @see nacre.impl.NacrePackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 25;

	/**
	 * The meta object id for the '{@link nacre.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.LinkImpl
	 * @see nacre.impl.NacrePackageImpl#getLink()
	 * @generated
	 */
	int LINK = 26;

	/**
	 * The meta object id for the '{@link nacre.impl.CFAImpl <em>CFA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.CFAImpl
	 * @see nacre.impl.NacrePackageImpl#getCFA()
	 * @generated
	 */
	int CFA = 27;

	/**
	 * The meta object id for the '{@link nacre.impl.CRASImpl <em>CRAS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.CRASImpl
	 * @see nacre.impl.NacrePackageImpl#getCRAS()
	 * @generated
	 */
	int CRAS = 28;

	/**
	 * The meta object id for the '{@link nacre.impl.CFRASImpl <em>CFRAS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.CFRASImpl
	 * @see nacre.impl.NacrePackageImpl#getCFRAS()
	 * @generated
	 */
	int CFRAS = 29;

	/**
	 * The meta object id for the '{@link nacre.impl.RedundancyClusterImpl <em>Redundancy Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.RedundancyClusterImpl
	 * @see nacre.impl.NacrePackageImpl#getRedundancyCluster()
	 * @generated
	 */
	int REDUNDANCY_CLUSTER = 30;

	/**
	 * The meta object id for the '{@link nacre.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.LineImpl
	 * @see nacre.impl.NacrePackageImpl#getLine()
	 * @generated
	 */
	int LINE = 15;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Control Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_CONTROLLER__CONTROL_BEHAVIOR = CONTROLLER__CONTROL_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_CONTROLLER__BASE_CLASS = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_CONTROLLER__BASE_PROPERTY = CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maingrid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_CONTROLLER__MAINGRID = CONTROLLER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Central Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_CONTROLLER_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Central Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_CONTROLLER_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__BASE_CLASS = EQUIPEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__BASE_PROPERTY = EQUIPEMENT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CONNECTED = EQUIPEMENT__CONNECTED;

	/**
	 * The feature id for the '<em><b>Activable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ACTIVABLE = EQUIPEMENT__ACTIVABLE;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__P = EQUIPEMENT__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__Q = EQUIPEMENT__Q;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__BASE_PORT = EQUIPEMENT__BASE_PORT;

	/**
	 * The feature id for the '<em><b>Localcontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__LOCALCONTROLLER = EQUIPEMENT__LOCALCONTROLLER;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__BUS = EQUIPEMENT__BUS;

	/**
	 * The feature id for the '<em><b>V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__V = EQUIPEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Power Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__MAX_POWER_GENERATION = EQUIPEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Produced Energy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__PRODUCED_ENERGY = EQUIPEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Power Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__MIN_POWER_GENERATION = EQUIPEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = EQUIPEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = EQUIPEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_VOLTAGE__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_VOLTAGE__PRECISION = 1;

	/**
	 * The number of structural features of the '<em>NFP Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_VOLTAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>NFP Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_VOLTAGE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ENERGY__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ENERGY__PRECISION = 1;

	/**
	 * The number of structural features of the '<em>NFP Energy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ENERGY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>NFP Energy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ENERGY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__BASE_CLASS = EQUIPEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__BASE_PROPERTY = EQUIPEMENT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__CONNECTED = EQUIPEMENT__CONNECTED;

	/**
	 * The feature id for the '<em><b>Activable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__ACTIVABLE = EQUIPEMENT__ACTIVABLE;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__P = EQUIPEMENT__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__Q = EQUIPEMENT__Q;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__BASE_PORT = EQUIPEMENT__BASE_PORT;

	/**
	 * The feature id for the '<em><b>Localcontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__LOCALCONTROLLER = EQUIPEMENT__LOCALCONTROLLER;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__BUS = EQUIPEMENT__BUS;

	/**
	 * The feature id for the '<em><b>V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__V = EQUIPEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__END = EQUIPEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__BRANCH = EQUIPEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__SIDE = EQUIPEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__IST = EQUIPEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION__LINE = EQUIPEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>RTE Installation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION_FEATURE_COUNT = EQUIPEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>RTE Installation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_INSTALLATION_OPERATION_COUNT = EQUIPEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_IST__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_IST__PRECISION = 1;

	/**
	 * The number of structural features of the '<em>NFP IST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_IST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>NFP IST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_IST_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__BASE_CLASS = EQUIPEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__BASE_PROPERTY = EQUIPEMENT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__CONNECTED = EQUIPEMENT__CONNECTED;

	/**
	 * The feature id for the '<em><b>Activable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__ACTIVABLE = EQUIPEMENT__ACTIVABLE;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__P = EQUIPEMENT__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__Q = EQUIPEMENT__Q;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__BASE_PORT = EQUIPEMENT__BASE_PORT;

	/**
	 * The feature id for the '<em><b>Localcontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__LOCALCONTROLLER = EQUIPEMENT__LOCALCONTROLLER;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__BUS = EQUIPEMENT__BUS;

	/**
	 * The feature id for the '<em><b>Max Power Injection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__MAX_POWER_INJECTION = EQUIPEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__CAPACITY = EQUIPEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Produced Energy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__PRODUCED_ENERGY = EQUIPEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Consumed Energy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__CONSUMED_ENERGY = EQUIPEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Power Injection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__MIN_POWER_INJECTION = EQUIPEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_FEATURE_COUNT = EQUIPEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_OPERATION_COUNT = EQUIPEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_VAR__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_VAR__PRECISION = 1;

	/**
	 * The number of structural features of the '<em>NFP VAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_VAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>NFP VAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_VAR_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__BASE_ABSTRACTION = 0;

	/**
	 * The number of structural features of the '<em>Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__BASE_ABSTRACTION = 0;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__BASE_ABSTRACTION = 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>CFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRAS__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>CRAS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRAS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CRAS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRAS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFRAS__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>CFRAS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFRAS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CFRAS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFRAS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER__RUNTIME = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER__BASE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER__ACTIVE = 2;

	/**
	 * The feature id for the '<em><b>Passive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER__PASSIVE = 3;

	/**
	 * The feature id for the '<em><b>Hypervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER__HYPERVISOR = 4;

	/**
	 * The number of structural features of the '<em>Redundancy Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Redundancy Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nacre.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.impl.LoadImpl
	 * @see nacre.impl.NacrePackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 31;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__BASE_CLASS = EQUIPEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__BASE_PROPERTY = EQUIPEMENT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__CONNECTED = EQUIPEMENT__CONNECTED;

	/**
	 * The feature id for the '<em><b>Activable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ACTIVABLE = EQUIPEMENT__ACTIVABLE;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__P = EQUIPEMENT__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__Q = EQUIPEMENT__Q;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__BASE_PORT = EQUIPEMENT__BASE_PORT;

	/**
	 * The feature id for the '<em><b>Localcontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__LOCALCONTROLLER = EQUIPEMENT__LOCALCONTROLLER;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__BUS = EQUIPEMENT__BUS;

	/**
	 * The number of structural features of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FEATURE_COUNT = EQUIPEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_OPERATION_COUNT = EQUIPEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nacre.VoltageLevel <em>Voltage Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.VoltageLevel
	 * @see nacre.impl.NacrePackageImpl#getVoltageLevel()
	 * @generated
	 */
	int VOLTAGE_LEVEL = 32;

	/**
	 * The meta object id for the '{@link nacre.PowerUnitKind <em>Power Unit Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.PowerUnitKind
	 * @see nacre.impl.NacrePackageImpl#getPowerUnitKind()
	 * @generated
	 */
	int POWER_UNIT_KIND = 33;

	/**
	 * The meta object id for the '{@link nacre.ControlType <em>Control Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.ControlType
	 * @see nacre.impl.NacrePackageImpl#getControlType()
	 * @generated
	 */
	int CONTROL_TYPE = 34;

	/**
	 * The meta object id for the '{@link nacre.VoltageUnitKind <em>Voltage Unit Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.VoltageUnitKind
	 * @see nacre.impl.NacrePackageImpl#getVoltageUnitKind()
	 * @generated
	 */
	int VOLTAGE_UNIT_KIND = 35;

	/**
	 * The meta object id for the '{@link nacre.EnergyUnitKind <em>Energy Unit Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.EnergyUnitKind
	 * @see nacre.impl.NacrePackageImpl#getEnergyUnitKind()
	 * @generated
	 */
	int ENERGY_UNIT_KIND = 36;

	/**
	 * The meta object id for the '{@link nacre.IstUnitKind <em>Ist Unit Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.IstUnitKind
	 * @see nacre.impl.NacrePackageImpl#getIstUnitKind()
	 * @generated
	 */
	int IST_UNIT_KIND = 37;

	/**
	 * The meta object id for the '{@link nacre.ReactivePowerUnitKind <em>Reactive Power Unit Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.ReactivePowerUnitKind
	 * @see nacre.impl.NacrePackageImpl#getReactivePowerUnitKind()
	 * @generated
	 */
	int REACTIVE_POWER_UNIT_KIND = 38;


	/**
	 * The meta object id for the '{@link nacre.RedundancyKind <em>Redundancy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nacre.RedundancyKind
	 * @see nacre.impl.NacrePackageImpl#getRedundancyKind()
	 * @generated
	 */
	int REDUNDANCY_KIND = 39;


	/**
	 * Returns the meta object for class '{@link nacre.Controllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controllers</em>'.
	 * @see nacre.Controllers
	 * @generated
	 */
	EClass getControllers();

	/**
	 * Returns the meta object for the reference '{@link nacre.Controllers#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see nacre.Controllers#getBase_Package()
	 * @see #getControllers()
	 * @generated
	 */
	EReference getControllers_Base_Package();

	/**
	 * Returns the meta object for class '{@link nacre.CommunicationMedias <em>Communication Medias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Medias</em>'.
	 * @see nacre.CommunicationMedias
	 * @generated
	 */
	EClass getCommunicationMedias();

	/**
	 * Returns the meta object for the reference '{@link nacre.CommunicationMedias#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see nacre.CommunicationMedias#getBase_Package()
	 * @see #getCommunicationMedias()
	 * @generated
	 */
	EReference getCommunicationMedias_Base_Package();

	/**
	 * Returns the meta object for class '{@link nacre.ComputingResources <em>Computing Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Resources</em>'.
	 * @see nacre.ComputingResources
	 * @generated
	 */
	EClass getComputingResources();

	/**
	 * Returns the meta object for the reference '{@link nacre.ComputingResources#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see nacre.ComputingResources#getBase_Package()
	 * @see #getComputingResources()
	 * @generated
	 */
	EReference getComputingResources_Base_Package();

	/**
	 * Returns the meta object for class '{@link nacre.SoftwareResources <em>Software Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Resources</em>'.
	 * @see nacre.SoftwareResources
	 * @generated
	 */
	EClass getSoftwareResources();

	/**
	 * Returns the meta object for the reference '{@link nacre.SoftwareResources#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see nacre.SoftwareResources#getBase_Package()
	 * @see #getSoftwareResources()
	 * @generated
	 */
	EReference getSoftwareResources_Base_Package();

	/**
	 * Returns the meta object for class '{@link nacre.CFRA <em>CFRA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CFRA</em>'.
	 * @see nacre.CFRA
	 * @generated
	 */
	EClass getCFRA();

	/**
	 * Returns the meta object for the reference '{@link nacre.CFRA#getCra <em>Cra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cra</em>'.
	 * @see nacre.CFRA#getCra()
	 * @see #getCFRA()
	 * @generated
	 */
	EReference getCFRA_Cra();

	/**
	 * Returns the meta object for the reference '{@link nacre.CFRA#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see nacre.CFRA#getBase_Package()
	 * @see #getCFRA()
	 * @generated
	 */
	EReference getCFRA_Base_Package();

	/**
	 * Returns the meta object for class '{@link nacre.CRA <em>CRA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRA</em>'.
	 * @see nacre.CRA
	 * @generated
	 */
	EClass getCRA();

	/**
	 * Returns the meta object for the reference '{@link nacre.CRA#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see nacre.CRA#getBase_Package()
	 * @see #getCRA()
	 * @generated
	 */
	EReference getCRA_Base_Package();

	/**
	 * Returns the meta object for class '{@link nacre.MainGrid <em>Main Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Grid</em>'.
	 * @see nacre.MainGrid
	 * @generated
	 */
	EClass getMainGrid();

	/**
	 * Returns the meta object for the reference '{@link nacre.MainGrid#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see nacre.MainGrid#getBase_Class()
	 * @see #getMainGrid()
	 * @generated
	 */
	EReference getMainGrid_Base_Class();

	/**
	 * Returns the meta object for the reference list '{@link nacre.MainGrid#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Zone</em>'.
	 * @see nacre.MainGrid#getZone()
	 * @see #getMainGrid()
	 * @generated
	 */
	EReference getMainGrid_Zone();

	/**
	 * Returns the meta object for the reference list '{@link nacre.MainGrid#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substation</em>'.
	 * @see nacre.MainGrid#getSubstation()
	 * @see #getMainGrid()
	 * @generated
	 */
	EReference getMainGrid_Substation();

	/**
	 * Returns the meta object for the reference '{@link nacre.MainGrid#getCentralcontroler <em>Centralcontroler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Centralcontroler</em>'.
	 * @see nacre.MainGrid#getCentralcontroler()
	 * @see #getMainGrid()
	 * @generated
	 */
	EReference getMainGrid_Centralcontroler();

	/**
	 * Returns the meta object for the reference list '{@link nacre.MainGrid#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lines</em>'.
	 * @see nacre.MainGrid#getLines()
	 * @see #getMainGrid()
	 * @generated
	 */
	EReference getMainGrid_Lines();

	/**
	 * Returns the meta object for class '{@link nacre.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see nacre.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the reference '{@link nacre.Zone#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see nacre.Zone#getBase_Class()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link nacre.Zone#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see nacre.Zone#getBase_Property()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Base_Property();

	/**
	 * Returns the meta object for the reference list '{@link nacre.Zone#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substation</em>'.
	 * @see nacre.Zone#getSubstation()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Substation();

	/**
	 * Returns the meta object for the reference '{@link nacre.Zone#getZonalcontroller <em>Zonalcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zonalcontroller</em>'.
	 * @see nacre.Zone#getZonalcontroller()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Zonalcontroller();

	/**
	 * Returns the meta object for the reference list '{@link nacre.Zone#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lines</em>'.
	 * @see nacre.Zone#getLines()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Lines();

	/**
	 * Returns the meta object for the reference '{@link nacre.Zone#getMaingrid <em>Maingrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maingrid</em>'.
	 * @see nacre.Zone#getMaingrid()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Maingrid();

	/**
	 * Returns the meta object for class '{@link nacre.Substation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substation</em>'.
	 * @see nacre.Substation
	 * @generated
	 */
	EClass getSubstation();

	/**
	 * Returns the meta object for the reference '{@link nacre.Substation#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see nacre.Substation#getBase_Class()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link nacre.Substation#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see nacre.Substation#getBase_Property()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Base_Property();

	/**
	 * Returns the meta object for the reference list '{@link nacre.Substation#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bus</em>'.
	 * @see nacre.Substation#getBus()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Bus();

	/**
	 * Returns the meta object for the reference '{@link nacre.Substation#getMaingrid <em>Maingrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maingrid</em>'.
	 * @see nacre.Substation#getMaingrid()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Maingrid();

	/**
	 * Returns the meta object for the reference '{@link nacre.Substation#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zone</em>'.
	 * @see nacre.Substation#getZone()
	 * @see #getSubstation()
	 * @generated
	 */
	EReference getSubstation_Zone();

	/**
	 * Returns the meta object for class '{@link nacre.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see nacre.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the reference '{@link nacre.Bus#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see nacre.Bus#getBase_Class()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link nacre.Bus#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see nacre.Bus#getBase_Property()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link nacre.Bus#getNominalLevel <em>Nominal Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Level</em>'.
	 * @see nacre.Bus#getNominalLevel()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_NominalLevel();

	/**
	 * Returns the meta object for the attribute '{@link nacre.Bus#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see nacre.Bus#isConnected()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_Connected();

	/**
	 * Returns the meta object for the reference list '{@link nacre.Bus#getEquipement <em>Equipement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equipement</em>'.
	 * @see nacre.Bus#getEquipement()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Equipement();

	/**
	 * Returns the meta object for the reference '{@link nacre.Bus#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Substation</em>'.
	 * @see nacre.Bus#getSubstation()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Substation();

	/**
	 * Returns the meta object for class '{@link nacre.Equipement <em>Equipement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipement</em>'.
	 * @see nacre.Equipement
	 * @generated
	 */
	EClass getEquipement();

	/**
	 * Returns the meta object for the reference '{@link nacre.Equipement#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see nacre.Equipement#getBase_Class()
	 * @see #getEquipement()
	 * @generated
	 */
	EReference getEquipement_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link nacre.Equipement#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see nacre.Equipement#getBase_Property()
	 * @see #getEquipement()
	 * @generated
	 */
	EReference getEquipement_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link nacre.Equipement#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see nacre.Equipement#isConnected()
	 * @see #getEquipement()
	 * @generated
	 */
	EAttribute getEquipement_Connected();

	/**
	 * Returns the meta object for the attribute '{@link nacre.Equipement#isActivable <em>Activable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activable</em>'.
	 * @see nacre.Equipement#isActivable()
	 * @see #getEquipement()
	 * @generated
	 */
	EAttribute getEquipement_Activable();

	/**
	 * Returns the meta object for the containment reference '{@link nacre.Equipement#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see nacre.Equipement#getP()
	 * @see #getEquipement()
	 * @generated
	 */
	EReference getEquipement_P();

	/**
	 * Returns the meta object for the containment reference '{@link nacre.Equipement#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see nacre.Equipement#getQ()
	 * @see #getEquipement()
	 * @generated
	 */
	EReference getEquipement_Q();

	/**
	 * Returns the meta object for the reference '{@link nacre.Equipement#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see nacre.Equipement#getBase_Port()
	 * @see #getEquipement()
	 * @generated
	 */
	EReference getEquipement_Base_Port();

	/**
	 * Returns the meta object for the reference '{@link nacre.Equipement#getLocalcontroller <em>Localcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Localcontroller</em>'.
	 * @see nacre.Equipement#getLocalcontroller()
	 * @see #getEquipement()
	 * @generated
	 */
	EReference getEquipement_Localcontroller();

	/**
	 * Returns the meta object for the reference '{@link nacre.Equipement#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus</em>'.
	 * @see nacre.Equipement#getBus()
	 * @see #getEquipement()
	 * @generated
	 */
	EReference getEquipement_Bus();

	/**
	 * Returns the meta object for class '{@link nacre.NFP_Power <em>NFP Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Power</em>'.
	 * @see nacre.NFP_Power
	 * @generated
	 */
	EClass getNFP_Power();

	/**
	 * Returns the meta object for the attribute '{@link nacre.NFP_Power#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see nacre.NFP_Power#getUnit()
	 * @see #getNFP_Power()
	 * @generated
	 */
	EAttribute getNFP_Power_Unit();

	/**
	 * Returns the meta object for the attribute '{@link nacre.NFP_Power#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see nacre.NFP_Power#getPrecision()
	 * @see #getNFP_Power()
	 * @generated
	 */
	EAttribute getNFP_Power_Precision();

	/**
	 * Returns the meta object for class '{@link nacre.LocalController <em>Local Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Controller</em>'.
	 * @see nacre.LocalController
	 * @generated
	 */
	EClass getLocalController();

	/**
	 * Returns the meta object for the reference '{@link nacre.LocalController#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see nacre.LocalController#getBase_Class()
	 * @see #getLocalController()
	 * @generated
	 */
	EReference getLocalController_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link nacre.LocalController#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see nacre.LocalController#getBase_Property()
	 * @see #getLocalController()
	 * @generated
	 */
	EReference getLocalController_Base_Property();

	/**
	 * Returns the meta object for the reference '{@link nacre.LocalController#getEquipement <em>Equipement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equipement</em>'.
	 * @see nacre.LocalController#getEquipement()
	 * @see #getLocalController()
	 * @generated
	 */
	EReference getLocalController_Equipement();

	/**
	 * Returns the meta object for class '{@link nacre.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see nacre.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the attribute '{@link nacre.Controller#getControlBehavior <em>Control Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Behavior</em>'.
	 * @see nacre.Controller#getControlBehavior()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_ControlBehavior();

	/**
	 * Returns the meta object for class '{@link nacre.ZonalController <em>Zonal Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zonal Controller</em>'.
	 * @see nacre.ZonalController
	 * @generated
	 */
	EClass getZonalController();

	/**
	 * Returns the meta object for the reference '{@link nacre.ZonalController#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see nacre.ZonalController#getBase_Class()
	 * @see #getZonalController()
	 * @generated
	 */
	EReference getZonalController_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link nacre.ZonalController#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see nacre.ZonalController#getBase_Property()
	 * @see #getZonalController()
	 * @generated
	 */
	EReference getZonalController_Base_Property();

	/**
	 * Returns the meta object for the reference '{@link nacre.ZonalController#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zone</em>'.
	 * @see nacre.ZonalController#getZone()
	 * @see #getZonalController()
	 * @generated
	 */
	EReference getZonalController_Zone();

	/**
	 * Returns the meta object for class '{@link nacre.CentralController <em>Central Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Central Controller</em>'.
	 * @see nacre.CentralController
	 * @generated
	 */
	EClass getCentralController();

	/**
	 * Returns the meta object for the reference '{@link nacre.CentralController#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see nacre.CentralController#getBase_Class()
	 * @see #getCentralController()
	 * @generated
	 */
	EReference getCentralController_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link nacre.CentralController#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see nacre.CentralController#getBase_Property()
	 * @see #getCentralController()
	 * @generated
	 */
	EReference getCentralController_Base_Property();

	/**
	 * Returns the meta object for the reference '{@link nacre.CentralController#getMaingrid <em>Maingrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maingrid</em>'.
	 * @see nacre.CentralController#getMaingrid()
	 * @see #getCentralController()
	 * @generated
	 */
	EReference getCentralController_Maingrid();

	/**
	 * Returns the meta object for class '{@link nacre.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see nacre.Generator
	 * @generated
	 */
	EClass getGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link nacre.Generator#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>V</em>'.
	 * @see nacre.Generator#getV()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_V();

	/**
	 * Returns the meta object for the containment reference '{@link nacre.Generator#getMaxPowerGeneration <em>Max Power Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Power Generation</em>'.
	 * @see nacre.Generator#getMaxPowerGeneration()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_MaxPowerGeneration();

	/**
	 * Returns the meta object for the containment reference '{@link nacre.Generator#getProducedEnergy <em>Produced Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Produced Energy</em>'.
	 * @see nacre.Generator#getProducedEnergy()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_ProducedEnergy();

	/**
	 * Returns the meta object for the containment reference '{@link nacre.Generator#getMinPowerGeneration <em>Min Power Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Power Generation</em>'.
	 * @see nacre.Generator#getMinPowerGeneration()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_MinPowerGeneration();

	/**
	 * Returns the meta object for class '{@link nacre.NFP_Voltage <em>NFP Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Voltage</em>'.
	 * @see nacre.NFP_Voltage
	 * @generated
	 */
	EClass getNFP_Voltage();

	/**
	 * Returns the meta object for the attribute '{@link nacre.NFP_Voltage#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see nacre.NFP_Voltage#getUnit()
	 * @see #getNFP_Voltage()
	 * @generated
	 */
	EAttribute getNFP_Voltage_Unit();

	/**
	 * Returns the meta object for the attribute '{@link nacre.NFP_Voltage#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see nacre.NFP_Voltage#getPrecision()
	 * @see #getNFP_Voltage()
	 * @generated
	 */
	EAttribute getNFP_Voltage_Precision();

	/**
	 * Returns the meta object for class '{@link nacre.NFP_Energy <em>NFP Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Energy</em>'.
	 * @see nacre.NFP_Energy
	 * @generated
	 */
	EClass getNFP_Energy();

	/**
	 * Returns the meta object for the attribute '{@link nacre.NFP_Energy#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see nacre.NFP_Energy#getUnit()
	 * @see #getNFP_Energy()
	 * @generated
	 */
	EAttribute getNFP_Energy_Unit();

	/**
	 * Returns the meta object for the attribute '{@link nacre.NFP_Energy#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see nacre.NFP_Energy#getPrecision()
	 * @see #getNFP_Energy()
	 * @generated
	 */
	EAttribute getNFP_Energy_Precision();

	/**
	 * Returns the meta object for class '{@link nacre.RTE_Installation <em>RTE Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTE Installation</em>'.
	 * @see nacre.RTE_Installation
	 * @generated
	 */
	EClass getRTE_Installation();

	/**
	 * Returns the meta object for the containment reference '{@link nacre.RTE_Installation#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>V</em>'.
	 * @see nacre.RTE_Installation#getV()
	 * @see #getRTE_Installation()
	 * @generated
	 */
	EReference getRTE_Installation_V();

	/**
	 * Returns the meta object for the attribute '{@link nacre.RTE_Installation#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see nacre.RTE_Installation#getEnd()
	 * @see #getRTE_Installation()
	 * @generated
	 */
	EAttribute getRTE_Installation_End();

	/**
	 * Returns the meta object for the attribute '{@link nacre.RTE_Installation#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch</em>'.
	 * @see nacre.RTE_Installation#getBranch()
	 * @see #getRTE_Installation()
	 * @generated
	 */
	EAttribute getRTE_Installation_Branch();

	/**
	 * Returns the meta object for the attribute '{@link nacre.RTE_Installation#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see nacre.RTE_Installation#getSide()
	 * @see #getRTE_Installation()
	 * @generated
	 */
	EAttribute getRTE_Installation_Side();

	/**
	 * Returns the meta object for the containment reference '{@link nacre.RTE_Installation#getIst <em>Ist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ist</em>'.
	 * @see nacre.RTE_Installation#getIst()
	 * @see #getRTE_Installation()
	 * @generated
	 */
	EReference getRTE_Installation_Ist();

	/**
	 * Returns the meta object for the reference '{@link nacre.RTE_Installation#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line</em>'.
	 * @see nacre.RTE_Installation#getLine()
	 * @see #getRTE_Installation()
	 * @generated
	 */
	EReference getRTE_Installation_Line();

	/**
	 * Returns the meta object for class '{@link nacre.NFP_IST <em>NFP IST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP IST</em>'.
	 * @see nacre.NFP_IST
	 * @generated
	 */
	EClass getNFP_IST();

	/**
	 * Returns the meta object for the attribute '{@link nacre.NFP_IST#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see nacre.NFP_IST#getUnit()
	 * @see #getNFP_IST()
	 * @generated
	 */
	EAttribute getNFP_IST_Unit();

	/**
	 * Returns the meta object for the attribute '{@link nacre.NFP_IST#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see nacre.NFP_IST#getPrecision()
	 * @see #getNFP_IST()
	 * @generated
	 */
	EAttribute getNFP_IST_Precision();

	/**
	 * Returns the meta object for class '{@link nacre.Battery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery</em>'.
	 * @see nacre.Battery
	 * @generated
	 */
	EClass getBattery();

	/**
	 * Returns the meta object for the containment reference '{@link nacre.Battery#getMaxPowerInjection <em>Max Power Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Power Injection</em>'.
	 * @see nacre.Battery#getMaxPowerInjection()
	 * @see #getBattery()
	 * @generated
	 */
	EReference getBattery_MaxPowerInjection();

	/**
	 * Returns the meta object for the containment reference '{@link nacre.Battery#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capacity</em>'.
	 * @see nacre.Battery#getCapacity()
	 * @see #getBattery()
	 * @generated
	 */
	EReference getBattery_Capacity();

	/**
	 * Returns the meta object for the containment reference '{@link nacre.Battery#getProducedEnergy <em>Produced Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Produced Energy</em>'.
	 * @see nacre.Battery#getProducedEnergy()
	 * @see #getBattery()
	 * @generated
	 */
	EReference getBattery_ProducedEnergy();

	/**
	 * Returns the meta object for the containment reference '{@link nacre.Battery#getConsumedEnergy <em>Consumed Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consumed Energy</em>'.
	 * @see nacre.Battery#getConsumedEnergy()
	 * @see #getBattery()
	 * @generated
	 */
	EReference getBattery_ConsumedEnergy();

	/**
	 * Returns the meta object for the containment reference '{@link nacre.Battery#getMinPowerInjection <em>Min Power Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Power Injection</em>'.
	 * @see nacre.Battery#getMinPowerInjection()
	 * @see #getBattery()
	 * @generated
	 */
	EReference getBattery_MinPowerInjection();

	/**
	 * Returns the meta object for class '{@link nacre.NFP_VAR <em>NFP VAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP VAR</em>'.
	 * @see nacre.NFP_VAR
	 * @generated
	 */
	EClass getNFP_VAR();

	/**
	 * Returns the meta object for the attribute '{@link nacre.NFP_VAR#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see nacre.NFP_VAR#getUnit()
	 * @see #getNFP_VAR()
	 * @generated
	 */
	EAttribute getNFP_VAR_Unit();

	/**
	 * Returns the meta object for the attribute '{@link nacre.NFP_VAR#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see nacre.NFP_VAR#getPrecision()
	 * @see #getNFP_VAR()
	 * @generated
	 */
	EAttribute getNFP_VAR_Precision();

	/**
	 * Returns the meta object for class '{@link nacre.Connect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connect</em>'.
	 * @see nacre.Connect
	 * @generated
	 */
	EClass getConnect();

	/**
	 * Returns the meta object for the reference '{@link nacre.Connect#getBase_Abstraction <em>Base Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Abstraction</em>'.
	 * @see nacre.Connect#getBase_Abstraction()
	 * @see #getConnect()
	 * @generated
	 */
	EReference getConnect_Base_Abstraction();

	/**
	 * Returns the meta object for class '{@link nacre.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see nacre.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the reference '{@link nacre.Control#getBase_Abstraction <em>Base Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Abstraction</em>'.
	 * @see nacre.Control#getBase_Abstraction()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Base_Abstraction();

	/**
	 * Returns the meta object for class '{@link nacre.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see nacre.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link nacre.Link#getBase_Abstraction <em>Base Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Abstraction</em>'.
	 * @see nacre.Link#getBase_Abstraction()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Base_Abstraction();

	/**
	 * Returns the meta object for class '{@link nacre.CFA <em>CFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CFA</em>'.
	 * @see nacre.CFA
	 * @generated
	 */
	EClass getCFA();

	/**
	 * Returns the meta object for the reference '{@link nacre.CFA#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see nacre.CFA#getBase_Package()
	 * @see #getCFA()
	 * @generated
	 */
	EReference getCFA_Base_Package();

	/**
	 * Returns the meta object for class '{@link nacre.CRAS <em>CRAS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRAS</em>'.
	 * @see nacre.CRAS
	 * @generated
	 */
	EClass getCRAS();

	/**
	 * Returns the meta object for the reference '{@link nacre.CRAS#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see nacre.CRAS#getBase_Package()
	 * @see #getCRAS()
	 * @generated
	 */
	EReference getCRAS_Base_Package();

	/**
	 * Returns the meta object for class '{@link nacre.CFRAS <em>CFRAS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CFRAS</em>'.
	 * @see nacre.CFRAS
	 * @generated
	 */
	EClass getCFRAS();

	/**
	 * Returns the meta object for the reference '{@link nacre.CFRAS#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see nacre.CFRAS#getBase_Package()
	 * @see #getCFRAS()
	 * @generated
	 */
	EReference getCFRAS_Base_Package();

	/**
	 * Returns the meta object for class '{@link nacre.RedundancyCluster <em>Redundancy Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redundancy Cluster</em>'.
	 * @see nacre.RedundancyCluster
	 * @generated
	 */
	EClass getRedundancyCluster();

	/**
	 * Returns the meta object for the attribute '{@link nacre.RedundancyCluster#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime</em>'.
	 * @see nacre.RedundancyCluster#getRuntime()
	 * @see #getRedundancyCluster()
	 * @generated
	 */
	EAttribute getRedundancyCluster_Runtime();

	/**
	 * Returns the meta object for the reference '{@link nacre.RedundancyCluster#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see nacre.RedundancyCluster#getBase_Class()
	 * @see #getRedundancyCluster()
	 * @generated
	 */
	EReference getRedundancyCluster_Base_Class();

	/**
	 * Returns the meta object for the reference list '{@link nacre.RedundancyCluster#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Active</em>'.
	 * @see nacre.RedundancyCluster#getActive()
	 * @see #getRedundancyCluster()
	 * @generated
	 */
	EReference getRedundancyCluster_Active();

	/**
	 * Returns the meta object for the reference list '{@link nacre.RedundancyCluster#getPassive <em>Passive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passive</em>'.
	 * @see nacre.RedundancyCluster#getPassive()
	 * @see #getRedundancyCluster()
	 * @generated
	 */
	EReference getRedundancyCluster_Passive();

	/**
	 * Returns the meta object for the reference '{@link nacre.RedundancyCluster#getHypervisor <em>Hypervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hypervisor</em>'.
	 * @see nacre.RedundancyCluster#getHypervisor()
	 * @see #getRedundancyCluster()
	 * @generated
	 */
	EReference getRedundancyCluster_Hypervisor();

	/**
	 * Returns the meta object for class '{@link nacre.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load</em>'.
	 * @see nacre.Load
	 * @generated
	 */
	EClass getLoad();

	/**
	 * Returns the meta object for class '{@link nacre.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see nacre.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the reference '{@link nacre.Line#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see nacre.Line#getBase_Class()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Base_Class();

	/**
	 * Returns the meta object for enum '{@link nacre.VoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Voltage Level</em>'.
	 * @see nacre.VoltageLevel
	 * @generated
	 */
	EEnum getVoltageLevel();

	/**
	 * Returns the meta object for enum '{@link nacre.PowerUnitKind <em>Power Unit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Power Unit Kind</em>'.
	 * @see nacre.PowerUnitKind
	 * @generated
	 */
	EEnum getPowerUnitKind();

	/**
	 * Returns the meta object for enum '{@link nacre.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Type</em>'.
	 * @see nacre.ControlType
	 * @generated
	 */
	EEnum getControlType();

	/**
	 * Returns the meta object for enum '{@link nacre.VoltageUnitKind <em>Voltage Unit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Voltage Unit Kind</em>'.
	 * @see nacre.VoltageUnitKind
	 * @generated
	 */
	EEnum getVoltageUnitKind();

	/**
	 * Returns the meta object for enum '{@link nacre.EnergyUnitKind <em>Energy Unit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Energy Unit Kind</em>'.
	 * @see nacre.EnergyUnitKind
	 * @generated
	 */
	EEnum getEnergyUnitKind();

	/**
	 * Returns the meta object for enum '{@link nacre.IstUnitKind <em>Ist Unit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ist Unit Kind</em>'.
	 * @see nacre.IstUnitKind
	 * @generated
	 */
	EEnum getIstUnitKind();

	/**
	 * Returns the meta object for enum '{@link nacre.ReactivePowerUnitKind <em>Reactive Power Unit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reactive Power Unit Kind</em>'.
	 * @see nacre.ReactivePowerUnitKind
	 * @generated
	 */
	EEnum getReactivePowerUnitKind();

	/**
	 * Returns the meta object for enum '{@link nacre.RedundancyKind <em>Redundancy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Redundancy Kind</em>'.
	 * @see nacre.RedundancyKind
	 * @generated
	 */
	EEnum getRedundancyKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NacreFactory getNacreFactory();

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
		 * The meta object literal for the '{@link nacre.impl.ControllersImpl <em>Controllers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.ControllersImpl
		 * @see nacre.impl.NacrePackageImpl#getControllers()
		 * @generated
		 */
		EClass CONTROLLERS = eINSTANCE.getControllers();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLERS__BASE_PACKAGE = eINSTANCE.getControllers_Base_Package();

		/**
		 * The meta object literal for the '{@link nacre.impl.CommunicationMediasImpl <em>Communication Medias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.CommunicationMediasImpl
		 * @see nacre.impl.NacrePackageImpl#getCommunicationMedias()
		 * @generated
		 */
		EClass COMMUNICATION_MEDIAS = eINSTANCE.getCommunicationMedias();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIAS__BASE_PACKAGE = eINSTANCE.getCommunicationMedias_Base_Package();

		/**
		 * The meta object literal for the '{@link nacre.impl.ComputingResourcesImpl <em>Computing Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.ComputingResourcesImpl
		 * @see nacre.impl.NacrePackageImpl#getComputingResources()
		 * @generated
		 */
		EClass COMPUTING_RESOURCES = eINSTANCE.getComputingResources();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_RESOURCES__BASE_PACKAGE = eINSTANCE.getComputingResources_Base_Package();

		/**
		 * The meta object literal for the '{@link nacre.impl.SoftwareResourcesImpl <em>Software Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.SoftwareResourcesImpl
		 * @see nacre.impl.NacrePackageImpl#getSoftwareResources()
		 * @generated
		 */
		EClass SOFTWARE_RESOURCES = eINSTANCE.getSoftwareResources();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_RESOURCES__BASE_PACKAGE = eINSTANCE.getSoftwareResources_Base_Package();

		/**
		 * The meta object literal for the '{@link nacre.impl.CFRAImpl <em>CFRA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.CFRAImpl
		 * @see nacre.impl.NacrePackageImpl#getCFRA()
		 * @generated
		 */
		EClass CFRA = eINSTANCE.getCFRA();

		/**
		 * The meta object literal for the '<em><b>Cra</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFRA__CRA = eINSTANCE.getCFRA_Cra();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFRA__BASE_PACKAGE = eINSTANCE.getCFRA_Base_Package();

		/**
		 * The meta object literal for the '{@link nacre.impl.CRAImpl <em>CRA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.CRAImpl
		 * @see nacre.impl.NacrePackageImpl#getCRA()
		 * @generated
		 */
		EClass CRA = eINSTANCE.getCRA();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRA__BASE_PACKAGE = eINSTANCE.getCRA_Base_Package();

		/**
		 * The meta object literal for the '{@link nacre.impl.MainGridImpl <em>Main Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.MainGridImpl
		 * @see nacre.impl.NacrePackageImpl#getMainGrid()
		 * @generated
		 */
		EClass MAIN_GRID = eINSTANCE.getMainGrid();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_GRID__BASE_CLASS = eINSTANCE.getMainGrid_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_GRID__ZONE = eINSTANCE.getMainGrid_Zone();

		/**
		 * The meta object literal for the '<em><b>Substation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_GRID__SUBSTATION = eINSTANCE.getMainGrid_Substation();

		/**
		 * The meta object literal for the '<em><b>Centralcontroler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_GRID__CENTRALCONTROLER = eINSTANCE.getMainGrid_Centralcontroler();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_GRID__LINES = eINSTANCE.getMainGrid_Lines();

		/**
		 * The meta object literal for the '{@link nacre.impl.ZoneImpl <em>Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.ZoneImpl
		 * @see nacre.impl.NacrePackageImpl#getZone()
		 * @generated
		 */
		EClass ZONE = eINSTANCE.getZone();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__BASE_CLASS = eINSTANCE.getZone_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__BASE_PROPERTY = eINSTANCE.getZone_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Substation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__SUBSTATION = eINSTANCE.getZone_Substation();

		/**
		 * The meta object literal for the '<em><b>Zonalcontroller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__ZONALCONTROLLER = eINSTANCE.getZone_Zonalcontroller();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__LINES = eINSTANCE.getZone_Lines();

		/**
		 * The meta object literal for the '<em><b>Maingrid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__MAINGRID = eINSTANCE.getZone_Maingrid();

		/**
		 * The meta object literal for the '{@link nacre.impl.SubstationImpl <em>Substation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.SubstationImpl
		 * @see nacre.impl.NacrePackageImpl#getSubstation()
		 * @generated
		 */
		EClass SUBSTATION = eINSTANCE.getSubstation();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__BASE_CLASS = eINSTANCE.getSubstation_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__BASE_PROPERTY = eINSTANCE.getSubstation_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__BUS = eINSTANCE.getSubstation_Bus();

		/**
		 * The meta object literal for the '<em><b>Maingrid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__MAINGRID = eINSTANCE.getSubstation_Maingrid();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTATION__ZONE = eINSTANCE.getSubstation_Zone();

		/**
		 * The meta object literal for the '{@link nacre.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.BusImpl
		 * @see nacre.impl.NacrePackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__BASE_CLASS = eINSTANCE.getBus_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__BASE_PROPERTY = eINSTANCE.getBus_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Nominal Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__NOMINAL_LEVEL = eINSTANCE.getBus_NominalLevel();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__CONNECTED = eINSTANCE.getBus_Connected();

		/**
		 * The meta object literal for the '<em><b>Equipement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__EQUIPEMENT = eINSTANCE.getBus_Equipement();

		/**
		 * The meta object literal for the '<em><b>Substation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__SUBSTATION = eINSTANCE.getBus_Substation();

		/**
		 * The meta object literal for the '{@link nacre.impl.EquipementImpl <em>Equipement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.EquipementImpl
		 * @see nacre.impl.NacrePackageImpl#getEquipement()
		 * @generated
		 */
		EClass EQUIPEMENT = eINSTANCE.getEquipement();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPEMENT__BASE_CLASS = eINSTANCE.getEquipement_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPEMENT__BASE_PROPERTY = eINSTANCE.getEquipement_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPEMENT__CONNECTED = eINSTANCE.getEquipement_Connected();

		/**
		 * The meta object literal for the '<em><b>Activable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPEMENT__ACTIVABLE = eINSTANCE.getEquipement_Activable();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPEMENT__P = eINSTANCE.getEquipement_P();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPEMENT__Q = eINSTANCE.getEquipement_Q();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPEMENT__BASE_PORT = eINSTANCE.getEquipement_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Localcontroller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPEMENT__LOCALCONTROLLER = eINSTANCE.getEquipement_Localcontroller();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPEMENT__BUS = eINSTANCE.getEquipement_Bus();

		/**
		 * The meta object literal for the '{@link nacre.impl.NFP_PowerImpl <em>NFP Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.NFP_PowerImpl
		 * @see nacre.impl.NacrePackageImpl#getNFP_Power()
		 * @generated
		 */
		EClass NFP_POWER = eINSTANCE.getNFP_Power();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_POWER__UNIT = eINSTANCE.getNFP_Power_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_POWER__PRECISION = eINSTANCE.getNFP_Power_Precision();

		/**
		 * The meta object literal for the '{@link nacre.impl.LocalControllerImpl <em>Local Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.LocalControllerImpl
		 * @see nacre.impl.NacrePackageImpl#getLocalController()
		 * @generated
		 */
		EClass LOCAL_CONTROLLER = eINSTANCE.getLocalController();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CONTROLLER__BASE_CLASS = eINSTANCE.getLocalController_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CONTROLLER__BASE_PROPERTY = eINSTANCE.getLocalController_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Equipement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CONTROLLER__EQUIPEMENT = eINSTANCE.getLocalController_Equipement();

		/**
		 * The meta object literal for the '{@link nacre.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.ControllerImpl
		 * @see nacre.impl.NacrePackageImpl#getController()
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
		 * The meta object literal for the '{@link nacre.impl.ZonalControllerImpl <em>Zonal Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.ZonalControllerImpl
		 * @see nacre.impl.NacrePackageImpl#getZonalController()
		 * @generated
		 */
		EClass ZONAL_CONTROLLER = eINSTANCE.getZonalController();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONAL_CONTROLLER__BASE_CLASS = eINSTANCE.getZonalController_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONAL_CONTROLLER__BASE_PROPERTY = eINSTANCE.getZonalController_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONAL_CONTROLLER__ZONE = eINSTANCE.getZonalController_Zone();

		/**
		 * The meta object literal for the '{@link nacre.impl.CentralControllerImpl <em>Central Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.CentralControllerImpl
		 * @see nacre.impl.NacrePackageImpl#getCentralController()
		 * @generated
		 */
		EClass CENTRAL_CONTROLLER = eINSTANCE.getCentralController();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTRAL_CONTROLLER__BASE_CLASS = eINSTANCE.getCentralController_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTRAL_CONTROLLER__BASE_PROPERTY = eINSTANCE.getCentralController_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Maingrid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTRAL_CONTROLLER__MAINGRID = eINSTANCE.getCentralController_Maingrid();

		/**
		 * The meta object literal for the '{@link nacre.impl.GeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.GeneratorImpl
		 * @see nacre.impl.NacrePackageImpl#getGenerator()
		 * @generated
		 */
		EClass GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__V = eINSTANCE.getGenerator_V();

		/**
		 * The meta object literal for the '<em><b>Max Power Generation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__MAX_POWER_GENERATION = eINSTANCE.getGenerator_MaxPowerGeneration();

		/**
		 * The meta object literal for the '<em><b>Produced Energy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__PRODUCED_ENERGY = eINSTANCE.getGenerator_ProducedEnergy();

		/**
		 * The meta object literal for the '<em><b>Min Power Generation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__MIN_POWER_GENERATION = eINSTANCE.getGenerator_MinPowerGeneration();

		/**
		 * The meta object literal for the '{@link nacre.impl.NFP_VoltageImpl <em>NFP Voltage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.NFP_VoltageImpl
		 * @see nacre.impl.NacrePackageImpl#getNFP_Voltage()
		 * @generated
		 */
		EClass NFP_VOLTAGE = eINSTANCE.getNFP_Voltage();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_VOLTAGE__UNIT = eINSTANCE.getNFP_Voltage_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_VOLTAGE__PRECISION = eINSTANCE.getNFP_Voltage_Precision();

		/**
		 * The meta object literal for the '{@link nacre.impl.NFP_EnergyImpl <em>NFP Energy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.NFP_EnergyImpl
		 * @see nacre.impl.NacrePackageImpl#getNFP_Energy()
		 * @generated
		 */
		EClass NFP_ENERGY = eINSTANCE.getNFP_Energy();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_ENERGY__UNIT = eINSTANCE.getNFP_Energy_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_ENERGY__PRECISION = eINSTANCE.getNFP_Energy_Precision();

		/**
		 * The meta object literal for the '{@link nacre.impl.RTE_InstallationImpl <em>RTE Installation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.RTE_InstallationImpl
		 * @see nacre.impl.NacrePackageImpl#getRTE_Installation()
		 * @generated
		 */
		EClass RTE_INSTALLATION = eINSTANCE.getRTE_Installation();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_INSTALLATION__V = eINSTANCE.getRTE_Installation_V();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_INSTALLATION__END = eINSTANCE.getRTE_Installation_End();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_INSTALLATION__BRANCH = eINSTANCE.getRTE_Installation_Branch();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_INSTALLATION__SIDE = eINSTANCE.getRTE_Installation_Side();

		/**
		 * The meta object literal for the '<em><b>Ist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_INSTALLATION__IST = eINSTANCE.getRTE_Installation_Ist();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_INSTALLATION__LINE = eINSTANCE.getRTE_Installation_Line();

		/**
		 * The meta object literal for the '{@link nacre.impl.NFP_ISTImpl <em>NFP IST</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.NFP_ISTImpl
		 * @see nacre.impl.NacrePackageImpl#getNFP_IST()
		 * @generated
		 */
		EClass NFP_IST = eINSTANCE.getNFP_IST();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_IST__UNIT = eINSTANCE.getNFP_IST_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_IST__PRECISION = eINSTANCE.getNFP_IST_Precision();

		/**
		 * The meta object literal for the '{@link nacre.impl.BatteryImpl <em>Battery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.BatteryImpl
		 * @see nacre.impl.NacrePackageImpl#getBattery()
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
		 * The meta object literal for the '<em><b>Capacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATTERY__CAPACITY = eINSTANCE.getBattery_Capacity();

		/**
		 * The meta object literal for the '<em><b>Produced Energy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATTERY__PRODUCED_ENERGY = eINSTANCE.getBattery_ProducedEnergy();

		/**
		 * The meta object literal for the '<em><b>Consumed Energy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATTERY__CONSUMED_ENERGY = eINSTANCE.getBattery_ConsumedEnergy();

		/**
		 * The meta object literal for the '<em><b>Min Power Injection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATTERY__MIN_POWER_INJECTION = eINSTANCE.getBattery_MinPowerInjection();

		/**
		 * The meta object literal for the '{@link nacre.impl.NFP_VARImpl <em>NFP VAR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.NFP_VARImpl
		 * @see nacre.impl.NacrePackageImpl#getNFP_VAR()
		 * @generated
		 */
		EClass NFP_VAR = eINSTANCE.getNFP_VAR();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_VAR__UNIT = eINSTANCE.getNFP_VAR_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_VAR__PRECISION = eINSTANCE.getNFP_VAR_Precision();

		/**
		 * The meta object literal for the '{@link nacre.impl.ConnectImpl <em>Connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.ConnectImpl
		 * @see nacre.impl.NacrePackageImpl#getConnect()
		 * @generated
		 */
		EClass CONNECT = eINSTANCE.getConnect();

		/**
		 * The meta object literal for the '<em><b>Base Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT__BASE_ABSTRACTION = eINSTANCE.getConnect_Base_Abstraction();

		/**
		 * The meta object literal for the '{@link nacre.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.ControlImpl
		 * @see nacre.impl.NacrePackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Base Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__BASE_ABSTRACTION = eINSTANCE.getControl_Base_Abstraction();

		/**
		 * The meta object literal for the '{@link nacre.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.LinkImpl
		 * @see nacre.impl.NacrePackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Base Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__BASE_ABSTRACTION = eINSTANCE.getLink_Base_Abstraction();

		/**
		 * The meta object literal for the '{@link nacre.impl.CFAImpl <em>CFA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.CFAImpl
		 * @see nacre.impl.NacrePackageImpl#getCFA()
		 * @generated
		 */
		EClass CFA = eINSTANCE.getCFA();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFA__BASE_PACKAGE = eINSTANCE.getCFA_Base_Package();

		/**
		 * The meta object literal for the '{@link nacre.impl.CRASImpl <em>CRAS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.CRASImpl
		 * @see nacre.impl.NacrePackageImpl#getCRAS()
		 * @generated
		 */
		EClass CRAS = eINSTANCE.getCRAS();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRAS__BASE_PACKAGE = eINSTANCE.getCRAS_Base_Package();

		/**
		 * The meta object literal for the '{@link nacre.impl.CFRASImpl <em>CFRAS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.CFRASImpl
		 * @see nacre.impl.NacrePackageImpl#getCFRAS()
		 * @generated
		 */
		EClass CFRAS = eINSTANCE.getCFRAS();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFRAS__BASE_PACKAGE = eINSTANCE.getCFRAS_Base_Package();

		/**
		 * The meta object literal for the '{@link nacre.impl.RedundancyClusterImpl <em>Redundancy Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.RedundancyClusterImpl
		 * @see nacre.impl.NacrePackageImpl#getRedundancyCluster()
		 * @generated
		 */
		EClass REDUNDANCY_CLUSTER = eINSTANCE.getRedundancyCluster();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUNDANCY_CLUSTER__RUNTIME = eINSTANCE.getRedundancyCluster_Runtime();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUNDANCY_CLUSTER__BASE_CLASS = eINSTANCE.getRedundancyCluster_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUNDANCY_CLUSTER__ACTIVE = eINSTANCE.getRedundancyCluster_Active();

		/**
		 * The meta object literal for the '<em><b>Passive</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUNDANCY_CLUSTER__PASSIVE = eINSTANCE.getRedundancyCluster_Passive();

		/**
		 * The meta object literal for the '<em><b>Hypervisor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUNDANCY_CLUSTER__HYPERVISOR = eINSTANCE.getRedundancyCluster_Hypervisor();

		/**
		 * The meta object literal for the '{@link nacre.impl.LoadImpl <em>Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.LoadImpl
		 * @see nacre.impl.NacrePackageImpl#getLoad()
		 * @generated
		 */
		EClass LOAD = eINSTANCE.getLoad();

		/**
		 * The meta object literal for the '{@link nacre.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.impl.LineImpl
		 * @see nacre.impl.NacrePackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__BASE_CLASS = eINSTANCE.getLine_Base_Class();

		/**
		 * The meta object literal for the '{@link nacre.VoltageLevel <em>Voltage Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.VoltageLevel
		 * @see nacre.impl.NacrePackageImpl#getVoltageLevel()
		 * @generated
		 */
		EEnum VOLTAGE_LEVEL = eINSTANCE.getVoltageLevel();

		/**
		 * The meta object literal for the '{@link nacre.PowerUnitKind <em>Power Unit Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.PowerUnitKind
		 * @see nacre.impl.NacrePackageImpl#getPowerUnitKind()
		 * @generated
		 */
		EEnum POWER_UNIT_KIND = eINSTANCE.getPowerUnitKind();

		/**
		 * The meta object literal for the '{@link nacre.ControlType <em>Control Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.ControlType
		 * @see nacre.impl.NacrePackageImpl#getControlType()
		 * @generated
		 */
		EEnum CONTROL_TYPE = eINSTANCE.getControlType();

		/**
		 * The meta object literal for the '{@link nacre.VoltageUnitKind <em>Voltage Unit Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.VoltageUnitKind
		 * @see nacre.impl.NacrePackageImpl#getVoltageUnitKind()
		 * @generated
		 */
		EEnum VOLTAGE_UNIT_KIND = eINSTANCE.getVoltageUnitKind();

		/**
		 * The meta object literal for the '{@link nacre.EnergyUnitKind <em>Energy Unit Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.EnergyUnitKind
		 * @see nacre.impl.NacrePackageImpl#getEnergyUnitKind()
		 * @generated
		 */
		EEnum ENERGY_UNIT_KIND = eINSTANCE.getEnergyUnitKind();

		/**
		 * The meta object literal for the '{@link nacre.IstUnitKind <em>Ist Unit Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.IstUnitKind
		 * @see nacre.impl.NacrePackageImpl#getIstUnitKind()
		 * @generated
		 */
		EEnum IST_UNIT_KIND = eINSTANCE.getIstUnitKind();

		/**
		 * The meta object literal for the '{@link nacre.ReactivePowerUnitKind <em>Reactive Power Unit Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.ReactivePowerUnitKind
		 * @see nacre.impl.NacrePackageImpl#getReactivePowerUnitKind()
		 * @generated
		 */
		EEnum REACTIVE_POWER_UNIT_KIND = eINSTANCE.getReactivePowerUnitKind();

		/**
		 * The meta object literal for the '{@link nacre.RedundancyKind <em>Redundancy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nacre.RedundancyKind
		 * @see nacre.impl.NacrePackageImpl#getRedundancyKind()
		 * @generated
		 */
		EEnum REDUNDANCY_KIND = eINSTANCE.getRedundancyKind();

	}

} //NacrePackage
