/**
 */
package nacre.impl;

import nacre.Battery;
import nacre.Bus;
import nacre.CentralController;
import nacre.CommunicationMedias;
import nacre.ComputingResources;
import nacre.Connect;
import nacre.Control;
import nacre.ControlType;
import nacre.Controller;
import nacre.Controllers;
import nacre.EnergyUnitKind;
import nacre.Equipement;
import nacre.Generator;
import nacre.IstUnitKind;
import nacre.Line;
import nacre.Link;
import nacre.Load;
import nacre.LocalController;
import nacre.MainGrid;
import nacre.NFP_Energy;
import nacre.NFP_Power;
import nacre.NFP_Voltage;
import nacre.NacreFactory;
import nacre.NacrePackage;
import nacre.PowerUnitKind;
import nacre.RTE_Installation;
import nacre.ReactivePowerUnitKind;
import nacre.RedundancyCluster;
import nacre.RedundancyKind;
import nacre.SoftwareResources;
import nacre.Substation;
import nacre.VoltageLevel;
import nacre.VoltageUnitKind;
import nacre.ZonalController;
import nacre.Zone;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.MARTE.MARTEPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage;
import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;
import org.eclipse.papyrus.MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;
import org.eclipse.papyrus.MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;
import org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;
import org.eclipse.papyrus.MARTE_Library.MeasurementUnits.MeasurementUnitsPackage;
import org.eclipse.papyrus.MARTE_Library.RS_Library.RS_LibraryPackage;
import org.eclipse.papyrus.MARTE_Library.TimeLibrary.TimeLibraryPackage;
import org.eclipse.papyrus.MARTE_Library.TimeTypesLibrary.TimeTypesLibraryPackage;
import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NacrePackageImpl extends EPackageImpl implements NacrePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationMediasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingResourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareResourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cfraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass craEClass = null;

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
	private EClass equipementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_PowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localControllerEClass = null;

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
	private EClass zonalControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centralControllerEClass = null;

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
	private EClass nfP_VoltageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_EnergyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtE_InstallationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_ISTEClass = null;

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
	private EClass nfP_VAREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

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
	private EClass crasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cfrasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redundancyClusterEClass = null;

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
	private EEnum voltageLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum powerUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum voltageUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum energyUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum istUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reactivePowerUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum redundancyKindEEnum = null;

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
	 * @see nacre.NacrePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NacrePackageImpl() {
		super(eNS_URI, NacreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NacrePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NacrePackage init() {
		if (isInited) return (NacrePackage)EPackage.Registry.INSTANCE.getEPackage(NacrePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNacrePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NacrePackageImpl theNacrePackage = registeredNacrePackage instanceof NacrePackageImpl ? (NacrePackageImpl)registeredNacrePackage : new NacrePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		MARTEPackage.eINSTANCE.eClass();
		MeasurementUnitsPackage.eINSTANCE.eClass();
		GRM_BasicTypesPackage.eINSTANCE.eClass();
		MARTE_DataTypesPackage.eINSTANCE.eClass();
		BasicNFP_TypesPackage.eINSTANCE.eClass();
		TimeTypesLibraryPackage.eINSTANCE.eClass();
		TimeLibraryPackage.eINSTANCE.eClass();
		RS_LibraryPackage.eINSTANCE.eClass();
		MARTE_PrimitivesTypesPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNacrePackage.createPackageContents();

		// Initialize created meta-data
		theNacrePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNacrePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NacrePackage.eNS_URI, theNacrePackage);
		return theNacrePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllers() {
		return controllersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllers_Base_Package() {
		return (EReference)controllersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationMedias() {
		return communicationMediasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMedias_Base_Package() {
		return (EReference)communicationMediasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputingResources() {
		return computingResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputingResources_Base_Package() {
		return (EReference)computingResourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareResources() {
		return softwareResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareResources_Base_Package() {
		return (EReference)softwareResourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCFRA() {
		return cfraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFRA_Cra() {
		return (EReference)cfraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFRA_Base_Package() {
		return (EReference)cfraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRA() {
		return craEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRA_Base_Package() {
		return (EReference)craEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainGrid() {
		return mainGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainGrid_Base_Class() {
		return (EReference)mainGridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainGrid_Zone() {
		return (EReference)mainGridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainGrid_Substation() {
		return (EReference)mainGridEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainGrid_Centralcontroler() {
		return (EReference)mainGridEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainGrid_Lines() {
		return (EReference)mainGridEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZone() {
		return zoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_Base_Class() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_Base_Property() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_Substation() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_Zonalcontroller() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_Lines() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_Maingrid() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstation() {
		return substationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstation_Base_Class() {
		return (EReference)substationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstation_Base_Property() {
		return (EReference)substationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstation_Bus() {
		return (EReference)substationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstation_Maingrid() {
		return (EReference)substationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstation_Zone() {
		return (EReference)substationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBus() {
		return busEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_Base_Class() {
		return (EReference)busEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_Base_Property() {
		return (EReference)busEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_NominalLevel() {
		return (EAttribute)busEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_Connected() {
		return (EAttribute)busEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_Equipement() {
		return (EReference)busEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_Substation() {
		return (EReference)busEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquipement() {
		return equipementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipement_Base_Class() {
		return (EReference)equipementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipement_Base_Property() {
		return (EReference)equipementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquipement_Connected() {
		return (EAttribute)equipementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquipement_Activable() {
		return (EAttribute)equipementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipement_P() {
		return (EReference)equipementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipement_Q() {
		return (EReference)equipementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipement_Base_Port() {
		return (EReference)equipementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipement_Localcontroller() {
		return (EReference)equipementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquipement_Bus() {
		return (EReference)equipementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Power() {
		return nfP_PowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Power_Unit() {
		return (EAttribute)nfP_PowerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Power_Precision() {
		return (EAttribute)nfP_PowerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalController() {
		return localControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalController_Base_Class() {
		return (EReference)localControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalController_Base_Property() {
		return (EReference)localControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalController_Equipement() {
		return (EReference)localControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_ControlBehavior() {
		return (EAttribute)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZonalController() {
		return zonalControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZonalController_Base_Class() {
		return (EReference)zonalControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZonalController_Base_Property() {
		return (EReference)zonalControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZonalController_Zone() {
		return (EReference)zonalControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCentralController() {
		return centralControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCentralController_Base_Class() {
		return (EReference)centralControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCentralController_Base_Property() {
		return (EReference)centralControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCentralController_Maingrid() {
		return (EReference)centralControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerator() {
		return generatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerator_V() {
		return (EReference)generatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerator_MaxPowerGeneration() {
		return (EReference)generatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerator_ProducedEnergy() {
		return (EReference)generatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerator_MinPowerGeneration() {
		return (EReference)generatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Voltage() {
		return nfP_VoltageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Voltage_Unit() {
		return (EAttribute)nfP_VoltageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Voltage_Precision() {
		return (EAttribute)nfP_VoltageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Energy() {
		return nfP_EnergyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Energy_Unit() {
		return (EAttribute)nfP_EnergyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Energy_Precision() {
		return (EAttribute)nfP_EnergyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTE_Installation() {
		return rtE_InstallationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTE_Installation_V() {
		return (EReference)rtE_InstallationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTE_Installation_End() {
		return (EAttribute)rtE_InstallationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTE_Installation_Branch() {
		return (EAttribute)rtE_InstallationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTE_Installation_Side() {
		return (EAttribute)rtE_InstallationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTE_Installation_Ist() {
		return (EReference)rtE_InstallationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTE_Installation_Line() {
		return (EReference)rtE_InstallationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_IST() {
		return nfP_ISTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_IST_Unit() {
		return (EAttribute)nfP_ISTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_IST_Precision() {
		return (EAttribute)nfP_ISTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBattery() {
		return batteryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBattery_MaxPowerInjection() {
		return (EReference)batteryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBattery_Capacity() {
		return (EReference)batteryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBattery_ProducedEnergy() {
		return (EReference)batteryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBattery_ConsumedEnergy() {
		return (EReference)batteryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBattery_MinPowerInjection() {
		return (EReference)batteryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_VAR() {
		return nfP_VAREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_VAR_Unit() {
		return (EAttribute)nfP_VAREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_VAR_Precision() {
		return (EAttribute)nfP_VAREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnect() {
		return connectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnect_Base_Abstraction() {
		return (EReference)connectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControl_Base_Abstraction() {
		return (EReference)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Base_Abstraction() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCFA() {
		return cfaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFA_Base_Package() {
		return (EReference)cfaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRAS() {
		return crasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRAS_Base_Package() {
		return (EReference)crasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCFRAS() {
		return cfrasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFRAS_Base_Package() {
		return (EReference)cfrasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedundancyCluster() {
		return redundancyClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedundancyCluster_Runtime() {
		return (EAttribute)redundancyClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedundancyCluster_Base_Class() {
		return (EReference)redundancyClusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedundancyCluster_Active() {
		return (EReference)redundancyClusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedundancyCluster_Passive() {
		return (EReference)redundancyClusterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedundancyCluster_Hypervisor() {
		return (EReference)redundancyClusterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoad() {
		return loadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Base_Class() {
		return (EReference)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVoltageLevel() {
		return voltageLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPowerUnitKind() {
		return powerUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlType() {
		return controlTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVoltageUnitKind() {
		return voltageUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnergyUnitKind() {
		return energyUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIstUnitKind() {
		return istUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReactivePowerUnitKind() {
		return reactivePowerUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRedundancyKind() {
		return redundancyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NacreFactory getNacreFactory() {
		return (NacreFactory)getEFactoryInstance();
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
		controllersEClass = createEClass(CONTROLLERS);
		createEReference(controllersEClass, CONTROLLERS__BASE_PACKAGE);

		communicationMediasEClass = createEClass(COMMUNICATION_MEDIAS);
		createEReference(communicationMediasEClass, COMMUNICATION_MEDIAS__BASE_PACKAGE);

		computingResourcesEClass = createEClass(COMPUTING_RESOURCES);
		createEReference(computingResourcesEClass, COMPUTING_RESOURCES__BASE_PACKAGE);

		softwareResourcesEClass = createEClass(SOFTWARE_RESOURCES);
		createEReference(softwareResourcesEClass, SOFTWARE_RESOURCES__BASE_PACKAGE);

		cfraEClass = createEClass(CFRA);
		createEReference(cfraEClass, CFRA__CRA);
		createEReference(cfraEClass, CFRA__BASE_PACKAGE);

		craEClass = createEClass(CRA);
		createEReference(craEClass, CRA__BASE_PACKAGE);

		mainGridEClass = createEClass(MAIN_GRID);
		createEReference(mainGridEClass, MAIN_GRID__BASE_CLASS);
		createEReference(mainGridEClass, MAIN_GRID__ZONE);
		createEReference(mainGridEClass, MAIN_GRID__SUBSTATION);
		createEReference(mainGridEClass, MAIN_GRID__CENTRALCONTROLER);
		createEReference(mainGridEClass, MAIN_GRID__LINES);

		zoneEClass = createEClass(ZONE);
		createEReference(zoneEClass, ZONE__BASE_CLASS);
		createEReference(zoneEClass, ZONE__BASE_PROPERTY);
		createEReference(zoneEClass, ZONE__SUBSTATION);
		createEReference(zoneEClass, ZONE__ZONALCONTROLLER);
		createEReference(zoneEClass, ZONE__LINES);
		createEReference(zoneEClass, ZONE__MAINGRID);

		substationEClass = createEClass(SUBSTATION);
		createEReference(substationEClass, SUBSTATION__BASE_CLASS);
		createEReference(substationEClass, SUBSTATION__BASE_PROPERTY);
		createEReference(substationEClass, SUBSTATION__BUS);
		createEReference(substationEClass, SUBSTATION__MAINGRID);
		createEReference(substationEClass, SUBSTATION__ZONE);

		busEClass = createEClass(BUS);
		createEReference(busEClass, BUS__BASE_CLASS);
		createEReference(busEClass, BUS__BASE_PROPERTY);
		createEAttribute(busEClass, BUS__NOMINAL_LEVEL);
		createEAttribute(busEClass, BUS__CONNECTED);
		createEReference(busEClass, BUS__EQUIPEMENT);
		createEReference(busEClass, BUS__SUBSTATION);

		equipementEClass = createEClass(EQUIPEMENT);
		createEReference(equipementEClass, EQUIPEMENT__BASE_CLASS);
		createEReference(equipementEClass, EQUIPEMENT__BASE_PROPERTY);
		createEAttribute(equipementEClass, EQUIPEMENT__CONNECTED);
		createEAttribute(equipementEClass, EQUIPEMENT__ACTIVABLE);
		createEReference(equipementEClass, EQUIPEMENT__P);
		createEReference(equipementEClass, EQUIPEMENT__Q);
		createEReference(equipementEClass, EQUIPEMENT__BASE_PORT);
		createEReference(equipementEClass, EQUIPEMENT__LOCALCONTROLLER);
		createEReference(equipementEClass, EQUIPEMENT__BUS);

		nfP_PowerEClass = createEClass(NFP_POWER);
		createEAttribute(nfP_PowerEClass, NFP_POWER__UNIT);
		createEAttribute(nfP_PowerEClass, NFP_POWER__PRECISION);

		localControllerEClass = createEClass(LOCAL_CONTROLLER);
		createEReference(localControllerEClass, LOCAL_CONTROLLER__BASE_CLASS);
		createEReference(localControllerEClass, LOCAL_CONTROLLER__BASE_PROPERTY);
		createEReference(localControllerEClass, LOCAL_CONTROLLER__EQUIPEMENT);

		controllerEClass = createEClass(CONTROLLER);
		createEAttribute(controllerEClass, CONTROLLER__CONTROL_BEHAVIOR);

		zonalControllerEClass = createEClass(ZONAL_CONTROLLER);
		createEReference(zonalControllerEClass, ZONAL_CONTROLLER__BASE_CLASS);
		createEReference(zonalControllerEClass, ZONAL_CONTROLLER__BASE_PROPERTY);
		createEReference(zonalControllerEClass, ZONAL_CONTROLLER__ZONE);

		lineEClass = createEClass(LINE);
		createEReference(lineEClass, LINE__BASE_CLASS);

		centralControllerEClass = createEClass(CENTRAL_CONTROLLER);
		createEReference(centralControllerEClass, CENTRAL_CONTROLLER__BASE_CLASS);
		createEReference(centralControllerEClass, CENTRAL_CONTROLLER__BASE_PROPERTY);
		createEReference(centralControllerEClass, CENTRAL_CONTROLLER__MAINGRID);

		generatorEClass = createEClass(GENERATOR);
		createEReference(generatorEClass, GENERATOR__V);
		createEReference(generatorEClass, GENERATOR__MAX_POWER_GENERATION);
		createEReference(generatorEClass, GENERATOR__PRODUCED_ENERGY);
		createEReference(generatorEClass, GENERATOR__MIN_POWER_GENERATION);

		nfP_VoltageEClass = createEClass(NFP_VOLTAGE);
		createEAttribute(nfP_VoltageEClass, NFP_VOLTAGE__UNIT);
		createEAttribute(nfP_VoltageEClass, NFP_VOLTAGE__PRECISION);

		nfP_EnergyEClass = createEClass(NFP_ENERGY);
		createEAttribute(nfP_EnergyEClass, NFP_ENERGY__UNIT);
		createEAttribute(nfP_EnergyEClass, NFP_ENERGY__PRECISION);

		rtE_InstallationEClass = createEClass(RTE_INSTALLATION);
		createEReference(rtE_InstallationEClass, RTE_INSTALLATION__V);
		createEAttribute(rtE_InstallationEClass, RTE_INSTALLATION__END);
		createEAttribute(rtE_InstallationEClass, RTE_INSTALLATION__BRANCH);
		createEAttribute(rtE_InstallationEClass, RTE_INSTALLATION__SIDE);
		createEReference(rtE_InstallationEClass, RTE_INSTALLATION__IST);
		createEReference(rtE_InstallationEClass, RTE_INSTALLATION__LINE);

		nfP_ISTEClass = createEClass(NFP_IST);
		createEAttribute(nfP_ISTEClass, NFP_IST__UNIT);
		createEAttribute(nfP_ISTEClass, NFP_IST__PRECISION);

		batteryEClass = createEClass(BATTERY);
		createEReference(batteryEClass, BATTERY__MAX_POWER_INJECTION);
		createEReference(batteryEClass, BATTERY__CAPACITY);
		createEReference(batteryEClass, BATTERY__PRODUCED_ENERGY);
		createEReference(batteryEClass, BATTERY__CONSUMED_ENERGY);
		createEReference(batteryEClass, BATTERY__MIN_POWER_INJECTION);

		nfP_VAREClass = createEClass(NFP_VAR);
		createEAttribute(nfP_VAREClass, NFP_VAR__UNIT);
		createEAttribute(nfP_VAREClass, NFP_VAR__PRECISION);

		connectEClass = createEClass(CONNECT);
		createEReference(connectEClass, CONNECT__BASE_ABSTRACTION);

		controlEClass = createEClass(CONTROL);
		createEReference(controlEClass, CONTROL__BASE_ABSTRACTION);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__BASE_ABSTRACTION);

		cfaEClass = createEClass(CFA);
		createEReference(cfaEClass, CFA__BASE_PACKAGE);

		crasEClass = createEClass(CRAS);
		createEReference(crasEClass, CRAS__BASE_PACKAGE);

		cfrasEClass = createEClass(CFRAS);
		createEReference(cfrasEClass, CFRAS__BASE_PACKAGE);

		redundancyClusterEClass = createEClass(REDUNDANCY_CLUSTER);
		createEAttribute(redundancyClusterEClass, REDUNDANCY_CLUSTER__RUNTIME);
		createEReference(redundancyClusterEClass, REDUNDANCY_CLUSTER__BASE_CLASS);
		createEReference(redundancyClusterEClass, REDUNDANCY_CLUSTER__ACTIVE);
		createEReference(redundancyClusterEClass, REDUNDANCY_CLUSTER__PASSIVE);
		createEReference(redundancyClusterEClass, REDUNDANCY_CLUSTER__HYPERVISOR);

		loadEClass = createEClass(LOAD);

		// Create enums
		voltageLevelEEnum = createEEnum(VOLTAGE_LEVEL);
		powerUnitKindEEnum = createEEnum(POWER_UNIT_KIND);
		controlTypeEEnum = createEEnum(CONTROL_TYPE);
		voltageUnitKindEEnum = createEEnum(VOLTAGE_UNIT_KIND);
		energyUnitKindEEnum = createEEnum(ENERGY_UNIT_KIND);
		istUnitKindEEnum = createEEnum(IST_UNIT_KIND);
		reactivePowerUnitKindEEnum = createEEnum(REACTIVE_POWER_UNIT_KIND);
		redundancyKindEEnum = createEEnum(REDUNDANCY_KIND);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		SW_ConcurrencyPackage theSW_ConcurrencyPackage = (SW_ConcurrencyPackage)EPackage.Registry.INSTANCE.getEPackage(SW_ConcurrencyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		localControllerEClass.getESuperTypes().add(this.getController());
		zonalControllerEClass.getESuperTypes().add(this.getController());
		centralControllerEClass.getESuperTypes().add(this.getController());
		generatorEClass.getESuperTypes().add(this.getEquipement());
		rtE_InstallationEClass.getESuperTypes().add(this.getEquipement());
		batteryEClass.getESuperTypes().add(this.getEquipement());
		loadEClass.getESuperTypes().add(this.getEquipement());

		// Initialize classes, features, and operations; add parameters
		initEClass(controllersEClass, Controllers.class, "Controllers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllers_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, Controllers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(communicationMediasEClass, CommunicationMedias.class, "CommunicationMedias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationMedias_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, CommunicationMedias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(computingResourcesEClass, ComputingResources.class, "ComputingResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputingResources_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, ComputingResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(softwareResourcesEClass, SoftwareResources.class, "SoftwareResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareResources_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, SoftwareResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cfraEClass, nacre.CFRA.class, "CFRA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCFRA_Cra(), this.getCRA(), null, "cra", null, 1, 1, nacre.CFRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCFRA_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, nacre.CFRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(craEClass, nacre.CRA.class, "CRA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCRA_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, nacre.CRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mainGridEClass, MainGrid.class, "MainGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainGrid_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, MainGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMainGrid_Zone(), this.getZone(), this.getZone_Maingrid(), "zone", null, 0, -1, MainGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMainGrid_Substation(), this.getSubstation(), this.getSubstation_Maingrid(), "substation", null, 0, -1, MainGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMainGrid_Centralcontroler(), this.getCentralController(), this.getCentralController_Maingrid(), "centralcontroler", null, 1, 1, MainGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMainGrid_Lines(), this.getLine(), null, "lines", null, 0, -1, MainGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(zoneEClass, Zone.class, "Zone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZone_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getZone_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getZone_Substation(), this.getSubstation(), this.getSubstation_Zone(), "substation", null, 0, -1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getZone_Zonalcontroller(), this.getZonalController(), this.getZonalController_Zone(), "zonalcontroller", null, 1, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getZone_Lines(), this.getLine(), null, "lines", null, 0, -1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getZone_Maingrid(), this.getMainGrid(), this.getMainGrid_Zone(), "maingrid", null, 1, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(substationEClass, Substation.class, "Substation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstation_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubstation_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubstation_Bus(), this.getBus(), this.getBus_Substation(), "bus", null, 0, -1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubstation_Maingrid(), this.getMainGrid(), this.getMainGrid_Substation(), "maingrid", null, 1, 1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubstation_Zone(), this.getZone(), this.getZone_Substation(), "zone", null, 1, 1, Substation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBus_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBus_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBus_NominalLevel(), this.getVoltageLevel(), "nominalLevel", null, 1, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBus_Connected(), theTypesPackage.getBoolean(), "connected", "true", 1, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBus_Equipement(), this.getEquipement(), this.getEquipement_Bus(), "equipement", null, 1, -1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBus_Substation(), this.getSubstation(), this.getSubstation_Bus(), "substation", null, 1, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(equipementEClass, Equipement.class, "Equipement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquipement_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Equipement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEquipement_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, Equipement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEquipement_Connected(), theTypesPackage.getBoolean(), "connected", "true", 1, 1, Equipement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEquipement_Activable(), theTypesPackage.getBoolean(), "activable", "true", 1, 1, Equipement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEquipement_P(), this.getNFP_Power(), null, "p", null, 1, 1, Equipement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEquipement_Q(), this.getNFP_Power(), null, "q", null, 1, 1, Equipement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEquipement_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, Equipement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEquipement_Localcontroller(), this.getLocalController(), this.getLocalController_Equipement(), "localcontroller", null, 1, 1, Equipement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEquipement_Bus(), this.getBus(), this.getBus_Equipement(), "bus", null, 1, 1, Equipement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_PowerEClass, NFP_Power.class, "NFP_Power", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Power_Unit(), this.getPowerUnitKind(), "unit", null, 0, 1, NFP_Power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_Power_Precision(), theTypesPackage.getReal(), "precision", null, 0, 1, NFP_Power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localControllerEClass, LocalController.class, "LocalController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalController_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, LocalController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalController_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, LocalController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalController_Equipement(), this.getEquipement(), this.getEquipement_Localcontroller(), "equipement", null, 1, 1, LocalController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getController_ControlBehavior(), this.getControlType(), "controlBehavior", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(zonalControllerEClass, ZonalController.class, "ZonalController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZonalController_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, ZonalController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getZonalController_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, ZonalController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getZonalController_Zone(), this.getZone(), this.getZone_Zonalcontroller(), "zone", null, 1, 1, ZonalController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLine_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(centralControllerEClass, CentralController.class, "CentralController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCentralController_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, CentralController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCentralController_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, CentralController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCentralController_Maingrid(), this.getMainGrid(), this.getMainGrid_Centralcontroler(), "maingrid", null, 1, 1, CentralController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generatorEClass, Generator.class, "Generator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenerator_V(), this.getNFP_Voltage(), null, "v", null, 1, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenerator_MaxPowerGeneration(), this.getNFP_Power(), null, "maxPowerGeneration", null, 1, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenerator_ProducedEnergy(), this.getNFP_Energy(), null, "producedEnergy", null, 1, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenerator_MinPowerGeneration(), this.getNFP_Power(), null, "minPowerGeneration", null, 1, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_VoltageEClass, NFP_Voltage.class, "NFP_Voltage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Voltage_Unit(), this.getVoltageUnitKind(), "unit", null, 0, 1, NFP_Voltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_Voltage_Precision(), theTypesPackage.getReal(), "precision", null, 0, 1, NFP_Voltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_EnergyEClass, NFP_Energy.class, "NFP_Energy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Energy_Unit(), this.getEnergyUnitKind(), "unit", null, 0, 1, NFP_Energy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_Energy_Precision(), theTypesPackage.getReal(), "precision", null, 0, 1, NFP_Energy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rtE_InstallationEClass, RTE_Installation.class, "RTE_Installation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRTE_Installation_V(), this.getNFP_Voltage(), null, "v", null, 1, 1, RTE_Installation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRTE_Installation_End(), theTypesPackage.getString(), "end", null, 1, 1, RTE_Installation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRTE_Installation_Branch(), theTypesPackage.getString(), "branch", null, 1, 1, RTE_Installation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRTE_Installation_Side(), theTypesPackage.getInteger(), "side", null, 1, 1, RTE_Installation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRTE_Installation_Ist(), this.getNFP_IST(), null, "ist", null, 1, 1, RTE_Installation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRTE_Installation_Line(), this.getLine(), null, "line", null, 0, 1, RTE_Installation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_ISTEClass, nacre.NFP_IST.class, "NFP_IST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_IST_Unit(), this.getIstUnitKind(), "unit", null, 0, 1, nacre.NFP_IST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_IST_Precision(), theTypesPackage.getReal(), "precision", null, 0, 1, nacre.NFP_IST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(batteryEClass, Battery.class, "Battery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBattery_MaxPowerInjection(), this.getNFP_Power(), null, "maxPowerInjection", null, 1, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBattery_Capacity(), this.getNFP_Energy(), null, "capacity", null, 1, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBattery_ProducedEnergy(), this.getNFP_Energy(), null, "producedEnergy", null, 1, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBattery_ConsumedEnergy(), this.getNFP_Energy(), null, "consumedEnergy", null, 1, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBattery_MinPowerInjection(), this.getNFP_Power(), null, "minPowerInjection", null, 1, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_VAREClass, nacre.NFP_VAR.class, "NFP_VAR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_VAR_Unit(), this.getReactivePowerUnitKind(), "unit", null, 0, 1, nacre.NFP_VAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_VAR_Precision(), theTypesPackage.getReal(), "precision", null, 0, 1, nacre.NFP_VAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(connectEClass, Connect.class, "Connect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnect_Base_Abstraction(), theUMLPackage.getAbstraction(), null, "base_Abstraction", null, 0, 1, Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControl_Base_Abstraction(), theUMLPackage.getAbstraction(), null, "base_Abstraction", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Base_Abstraction(), theUMLPackage.getAbstraction(), null, "base_Abstraction", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cfaEClass, nacre.CFA.class, "CFA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCFA_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, nacre.CFA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(crasEClass, nacre.CRAS.class, "CRAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCRAS_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, nacre.CRAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cfrasEClass, nacre.CFRAS.class, "CFRAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCFRAS_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, nacre.CFRAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(redundancyClusterEClass, RedundancyCluster.class, "RedundancyCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRedundancyCluster_Runtime(), this.getRedundancyKind(), "runtime", "active_standby", 1, 1, RedundancyCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedundancyCluster_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, RedundancyCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedundancyCluster_Active(), theSW_ConcurrencyPackage.getSwSchedulableResource(), null, "active", null, 1, -1, RedundancyCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedundancyCluster_Passive(), theSW_ConcurrencyPackage.getSwSchedulableResource(), null, "passive", null, 0, -1, RedundancyCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedundancyCluster_Hypervisor(), theSW_ConcurrencyPackage.getSwSchedulableResource(), null, "hypervisor", null, 0, 1, RedundancyCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(loadEClass, Load.class, "Load", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(voltageLevelEEnum, VoltageLevel.class, "VoltageLevel");
		addEEnumLiteral(voltageLevelEEnum, VoltageLevel._63);
		addEEnumLiteral(voltageLevelEEnum, VoltageLevel._20);
		addEEnumLiteral(voltageLevelEEnum, VoltageLevel._42);
		addEEnumLiteral(voltageLevelEEnum, VoltageLevel._90);
		addEEnumLiteral(voltageLevelEEnum, VoltageLevel._150);
		addEEnumLiteral(voltageLevelEEnum, VoltageLevel._225);
		addEEnumLiteral(voltageLevelEEnum, VoltageLevel._380);

		initEEnum(powerUnitKindEEnum, PowerUnitKind.class, "PowerUnitKind");
		addEEnumLiteral(powerUnitKindEEnum, PowerUnitKind.MW);
		addEEnumLiteral(powerUnitKindEEnum, PowerUnitKind.KW);
		addEEnumLiteral(powerUnitKindEEnum, PowerUnitKind.W);

		initEEnum(controlTypeEEnum, ControlType.class, "ControlType");
		addEEnumLiteral(controlTypeEEnum, ControlType.DEFAULT_CONTROL);
		addEEnumLiteral(controlTypeEEnum, ControlType.APPROXIMATE_LINEAR_MPC);
		addEEnumLiteral(controlTypeEEnum, ControlType.MIXED_LOGICAL_DYNAMICAL_MPC);
		addEEnumLiteral(controlTypeEEnum, ControlType.MPC_RTE);
		addEEnumLiteral(controlTypeEEnum, ControlType.LIMITER);
		addEEnumLiteral(controlTypeEEnum, ControlType.RELEASE_ALL);

		initEEnum(voltageUnitKindEEnum, VoltageUnitKind.class, "VoltageUnitKind");
		addEEnumLiteral(voltageUnitKindEEnum, VoltageUnitKind.V);
		addEEnumLiteral(voltageUnitKindEEnum, VoltageUnitKind.KV);
		addEEnumLiteral(voltageUnitKindEEnum, VoltageUnitKind.MV);

		initEEnum(energyUnitKindEEnum, EnergyUnitKind.class, "EnergyUnitKind");
		addEEnumLiteral(energyUnitKindEEnum, EnergyUnitKind.J);
		addEEnumLiteral(energyUnitKindEEnum, EnergyUnitKind.KJ);
		addEEnumLiteral(energyUnitKindEEnum, EnergyUnitKind.WH);
		addEEnumLiteral(energyUnitKindEEnum, EnergyUnitKind.KWH);
		addEEnumLiteral(energyUnitKindEEnum, EnergyUnitKind.MWH);

		initEEnum(istUnitKindEEnum, IstUnitKind.class, "IstUnitKind");
		addEEnumLiteral(istUnitKindEEnum, IstUnitKind.A);
		addEEnumLiteral(istUnitKindEEnum, IstUnitKind.MW);

		initEEnum(reactivePowerUnitKindEEnum, ReactivePowerUnitKind.class, "ReactivePowerUnitKind");
		addEEnumLiteral(reactivePowerUnitKindEEnum, ReactivePowerUnitKind.VAR);
		addEEnumLiteral(reactivePowerUnitKindEEnum, ReactivePowerUnitKind.KVAR);
		addEEnumLiteral(reactivePowerUnitKindEEnum, ReactivePowerUnitKind.MVAR);

		initEEnum(redundancyKindEEnum, RedundancyKind.class, "RedundancyKind");
		addEEnumLiteral(redundancyKindEEnum, RedundancyKind.CONSENSUS);
		addEEnumLiteral(redundancyKindEEnum, RedundancyKind.HYPERVISOR);
		addEEnumLiteral(redundancyKindEEnum, RedundancyKind.ACTIVE_STANDBY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (voltageLevelEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "originalName", "63"
		   });
		addAnnotation
		  (voltageLevelEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "originalName", "20"
		   });
		addAnnotation
		  (voltageLevelEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "originalName", "42"
		   });
		addAnnotation
		  (voltageLevelEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "originalName", "90"
		   });
		addAnnotation
		  (voltageLevelEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "originalName", "150"
		   });
		addAnnotation
		  (voltageLevelEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "originalName", "225"
		   });
		addAnnotation
		  (voltageLevelEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "originalName", "380"
		   });
	}

} //NacrePackageImpl
