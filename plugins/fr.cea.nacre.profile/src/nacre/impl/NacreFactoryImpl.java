/**
 */
package nacre.impl;

import nacre.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NacreFactoryImpl extends EFactoryImpl implements NacreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NacreFactory init() {
		try {
			NacreFactory theNacreFactory = (NacreFactory)EPackage.Registry.INSTANCE.getEFactory(NacrePackage.eNS_URI);
			if (theNacreFactory != null) {
				return theNacreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NacreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NacreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NacrePackage.CONTROLLERS: return createControllers();
			case NacrePackage.COMMUNICATION_MEDIAS: return createCommunicationMedias();
			case NacrePackage.COMPUTING_RESOURCES: return createComputingResources();
			case NacrePackage.SOFTWARE_RESOURCES: return createSoftwareResources();
			case NacrePackage.CFRA: return createCFRA();
			case NacrePackage.CRA: return createCRA();
			case NacrePackage.MAIN_GRID: return createMainGrid();
			case NacrePackage.ZONE: return createZone();
			case NacrePackage.SUBSTATION: return createSubstation();
			case NacrePackage.BUS: return createBus();
			case NacrePackage.NFP_POWER: return createNFP_Power();
			case NacrePackage.LOCAL_CONTROLLER: return createLocalController();
			case NacrePackage.ZONAL_CONTROLLER: return createZonalController();
			case NacrePackage.LINE: return createLine();
			case NacrePackage.CENTRAL_CONTROLLER: return createCentralController();
			case NacrePackage.GENERATOR: return createGenerator();
			case NacrePackage.NFP_VOLTAGE: return createNFP_Voltage();
			case NacrePackage.NFP_ENERGY: return createNFP_Energy();
			case NacrePackage.RTE_INSTALLATION: return createRTE_Installation();
			case NacrePackage.NFP_IST: return createNFP_IST();
			case NacrePackage.BATTERY: return createBattery();
			case NacrePackage.NFP_VAR: return createNFP_VAR();
			case NacrePackage.CONNECT: return createConnect();
			case NacrePackage.CONTROL: return createControl();
			case NacrePackage.LINK: return createLink();
			case NacrePackage.CFA: return createCFA();
			case NacrePackage.CRAS: return createCRAS();
			case NacrePackage.CFRAS: return createCFRAS();
			case NacrePackage.REDUNDANCY_CLUSTER: return createRedundancyCluster();
			case NacrePackage.LOAD: return createLoad();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NacrePackage.VOLTAGE_LEVEL:
				return createVoltageLevelFromString(eDataType, initialValue);
			case NacrePackage.POWER_UNIT_KIND:
				return createPowerUnitKindFromString(eDataType, initialValue);
			case NacrePackage.CONTROL_TYPE:
				return createControlTypeFromString(eDataType, initialValue);
			case NacrePackage.VOLTAGE_UNIT_KIND:
				return createVoltageUnitKindFromString(eDataType, initialValue);
			case NacrePackage.ENERGY_UNIT_KIND:
				return createEnergyUnitKindFromString(eDataType, initialValue);
			case NacrePackage.IST_UNIT_KIND:
				return createIstUnitKindFromString(eDataType, initialValue);
			case NacrePackage.REACTIVE_POWER_UNIT_KIND:
				return createReactivePowerUnitKindFromString(eDataType, initialValue);
			case NacrePackage.REDUNDANCY_KIND:
				return createRedundancyKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NacrePackage.VOLTAGE_LEVEL:
				return convertVoltageLevelToString(eDataType, instanceValue);
			case NacrePackage.POWER_UNIT_KIND:
				return convertPowerUnitKindToString(eDataType, instanceValue);
			case NacrePackage.CONTROL_TYPE:
				return convertControlTypeToString(eDataType, instanceValue);
			case NacrePackage.VOLTAGE_UNIT_KIND:
				return convertVoltageUnitKindToString(eDataType, instanceValue);
			case NacrePackage.ENERGY_UNIT_KIND:
				return convertEnergyUnitKindToString(eDataType, instanceValue);
			case NacrePackage.IST_UNIT_KIND:
				return convertIstUnitKindToString(eDataType, instanceValue);
			case NacrePackage.REACTIVE_POWER_UNIT_KIND:
				return convertReactivePowerUnitKindToString(eDataType, instanceValue);
			case NacrePackage.REDUNDANCY_KIND:
				return convertRedundancyKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controllers createControllers() {
		ControllersImpl controllers = new ControllersImpl();
		return controllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMedias createCommunicationMedias() {
		CommunicationMediasImpl communicationMedias = new CommunicationMediasImpl();
		return communicationMedias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingResources createComputingResources() {
		ComputingResourcesImpl computingResources = new ComputingResourcesImpl();
		return computingResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareResources createSoftwareResources() {
		SoftwareResourcesImpl softwareResources = new SoftwareResourcesImpl();
		return softwareResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFRA createCFRA() {
		CFRAImpl cfra = new CFRAImpl();
		return cfra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRA createCRA() {
		CRAImpl cra = new CRAImpl();
		return cra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainGrid createMainGrid() {
		MainGridImpl mainGrid = new MainGridImpl();
		return mainGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone createZone() {
		ZoneImpl zone = new ZoneImpl();
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation createSubstation() {
		SubstationImpl substation = new SubstationImpl();
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Power createNFP_Power() {
		NFP_PowerImpl nfP_Power = new NFP_PowerImpl();
		return nfP_Power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalController createLocalController() {
		LocalControllerImpl localController = new LocalControllerImpl();
		return localController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonalController createZonalController() {
		ZonalControllerImpl zonalController = new ZonalControllerImpl();
		return zonalController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentralController createCentralController() {
		CentralControllerImpl centralController = new CentralControllerImpl();
		return centralController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator createGenerator() {
		GeneratorImpl generator = new GeneratorImpl();
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Voltage createNFP_Voltage() {
		NFP_VoltageImpl nfP_Voltage = new NFP_VoltageImpl();
		return nfP_Voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Energy createNFP_Energy() {
		NFP_EnergyImpl nfP_Energy = new NFP_EnergyImpl();
		return nfP_Energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTE_Installation createRTE_Installation() {
		RTE_InstallationImpl rtE_Installation = new RTE_InstallationImpl();
		return rtE_Installation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_IST createNFP_IST() {
		NFP_ISTImpl nfP_IST = new NFP_ISTImpl();
		return nfP_IST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Battery createBattery() {
		BatteryImpl battery = new BatteryImpl();
		return battery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_VAR createNFP_VAR() {
		NFP_VARImpl nfP_VAR = new NFP_VARImpl();
		return nfP_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connect createConnect() {
		ConnectImpl connect = new ConnectImpl();
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFA createCFA() {
		CFAImpl cfa = new CFAImpl();
		return cfa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRAS createCRAS() {
		CRASImpl cras = new CRASImpl();
		return cras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFRAS createCFRAS() {
		CFRASImpl cfras = new CFRASImpl();
		return cfras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedundancyCluster createRedundancyCluster() {
		RedundancyClusterImpl redundancyCluster = new RedundancyClusterImpl();
		return redundancyCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load createLoad() {
		LoadImpl load = new LoadImpl();
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLevel createVoltageLevelFromString(EDataType eDataType, String initialValue) {
		VoltageLevel result = VoltageLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoltageLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerUnitKind createPowerUnitKindFromString(EDataType eDataType, String initialValue) {
		PowerUnitKind result = PowerUnitKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPowerUnitKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType createControlTypeFromString(EDataType eDataType, String initialValue) {
		ControlType result = ControlType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageUnitKind createVoltageUnitKindFromString(EDataType eDataType, String initialValue) {
		VoltageUnitKind result = VoltageUnitKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoltageUnitKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyUnitKind createEnergyUnitKindFromString(EDataType eDataType, String initialValue) {
		EnergyUnitKind result = EnergyUnitKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnergyUnitKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstUnitKind createIstUnitKindFromString(EDataType eDataType, String initialValue) {
		IstUnitKind result = IstUnitKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIstUnitKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactivePowerUnitKind createReactivePowerUnitKindFromString(EDataType eDataType, String initialValue) {
		ReactivePowerUnitKind result = ReactivePowerUnitKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReactivePowerUnitKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedundancyKind createRedundancyKindFromString(EDataType eDataType, String initialValue) {
		RedundancyKind result = RedundancyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRedundancyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NacrePackage getNacrePackage() {
		return (NacrePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NacrePackage getPackage() {
		return NacrePackage.eINSTANCE;
	}

} //NacreFactoryImpl
