/**
 */
package fr.cea.nacre.model.NACREMM.cra.impl;

import fr.cea.nacre.model.NACREMM.CommonType.CommonTypePackage;

import fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypePackageImpl;

import fr.cea.nacre.model.NACREMM.Hazard.HazardPackage;

import fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl;
import fr.cea.nacre.model.NACREMM.UID.UIDPackage;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDPackageImpl;

import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;

import fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl;

import fr.cea.nacre.model.NACREMM.cfra.CfraPackage;

import fr.cea.nacre.model.NACREMM.cfra.impl.CfraPackageImpl;

import fr.cea.nacre.model.NACREMM.cra.CommunicationMedia;
import fr.cea.nacre.model.NACREMM.cra.ComputingResource;
import fr.cea.nacre.model.NACREMM.cra.Cra;
import fr.cea.nacre.model.NACREMM.cra.CraFactory;
import fr.cea.nacre.model.NACREMM.cra.CraPackage;
import fr.cea.nacre.model.NACREMM.cra.RedundancyCluster;
import fr.cea.nacre.model.NACREMM.cra.RedundancyKind;
import fr.cea.nacre.model.NACREMM.cra.SoftwareResource;
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
public class CraPackageImpl extends EPackageImpl implements CraPackage {
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
	private EClass communicationMediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareResourceEClass = null;

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
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CraPackageImpl() {
		super(eNS_URI, CraFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CraPackage init() {
		if (isInited) return (CraPackage)EPackage.Registry.INSTANCE.getEPackage(CraPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCraPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CraPackageImpl theCraPackage = registeredCraPackage instanceof CraPackageImpl ? (CraPackageImpl)registeredCraPackage : new CraPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UIDPackage.eNS_URI);
		UIDPackageImpl theUIDPackage = (UIDPackageImpl)(registeredPackage instanceof UIDPackageImpl ? registeredPackage : UIDPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonTypePackage.eNS_URI);
		CommonTypePackageImpl theCommonTypePackage = (CommonTypePackageImpl)(registeredPackage instanceof CommonTypePackageImpl ? registeredPackage : CommonTypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CfraPackage.eNS_URI);
		CfraPackageImpl theCfraPackage = (CfraPackageImpl)(registeredPackage instanceof CfraPackageImpl ? registeredPackage : CfraPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HazardPackage.eNS_URI);
		HazardPackageImpl theHazardPackage = (HazardPackageImpl)(registeredPackage instanceof HazardPackageImpl ? registeredPackage : HazardPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CfaPackage.eNS_URI);
		CfaPackageImpl theCfaPackage = (CfaPackageImpl)(registeredPackage instanceof CfaPackageImpl ? registeredPackage : CfaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StudyPackage.eNS_URI);
		StudyPackageImpl theStudyPackage = (StudyPackageImpl)(registeredPackage instanceof StudyPackageImpl ? registeredPackage : StudyPackage.eINSTANCE);

		// Create package meta-data objects
		theCraPackage.createPackageContents();
		theUIDPackage.createPackageContents();
		theCommonTypePackage.createPackageContents();
		theCfraPackage.createPackageContents();
		theHazardPackage.createPackageContents();
		theCfaPackage.createPackageContents();
		theStudyPackage.createPackageContents();

		// Initialize created meta-data
		theCraPackage.initializePackageContents();
		theUIDPackage.initializePackageContents();
		theCommonTypePackage.initializePackageContents();
		theCfraPackage.initializePackageContents();
		theHazardPackage.initializePackageContents();
		theCfaPackage.initializePackageContents();
		theStudyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCraPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CraPackage.eNS_URI, theCraPackage);
		return theCraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCra() {
		return craEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCra_CommunicationMedias() {
		return (EReference)craEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCra_ComputingResources() {
		return (EReference)craEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCra_SoftwareResources() {
		return (EReference)craEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCra_RedundancyClusters() {
		return (EReference)craEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationMedia() {
		return communicationMediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationMedia_Latency() {
		return (EReference)communicationMediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationMedia_Capacity() {
		return (EReference)communicationMediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationMedia_CommunicationMedias() {
		return (EAttribute)communicationMediaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputingResource() {
		return computingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputingResource_CommunicationMedias() {
		return (EAttribute)computingResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoftwareResource() {
		return softwareResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftwareResource_ComputingResources() {
		return (EAttribute)softwareResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftwareResource_Period() {
		return (EReference)softwareResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftwareResource_ExecutionTime() {
		return (EReference)softwareResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRedundancyCluster() {
		return redundancyClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRedundancyCluster_Runtime() {
		return (EAttribute)redundancyClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRedundancyCluster_Active() {
		return (EAttribute)redundancyClusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRedundancyCluster_Passive() {
		return (EAttribute)redundancyClusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRedundancyCluster_Hypervisor() {
		return (EAttribute)redundancyClusterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRedundancyKind() {
		return redundancyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CraFactory getCraFactory() {
		return (CraFactory)getEFactoryInstance();
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
		craEClass = createEClass(CRA);
		createEReference(craEClass, CRA__COMMUNICATION_MEDIAS);
		createEReference(craEClass, CRA__COMPUTING_RESOURCES);
		createEReference(craEClass, CRA__SOFTWARE_RESOURCES);
		createEReference(craEClass, CRA__REDUNDANCY_CLUSTERS);

		communicationMediaEClass = createEClass(COMMUNICATION_MEDIA);
		createEReference(communicationMediaEClass, COMMUNICATION_MEDIA__LATENCY);
		createEReference(communicationMediaEClass, COMMUNICATION_MEDIA__CAPACITY);
		createEAttribute(communicationMediaEClass, COMMUNICATION_MEDIA__COMMUNICATION_MEDIAS);

		computingResourceEClass = createEClass(COMPUTING_RESOURCE);
		createEAttribute(computingResourceEClass, COMPUTING_RESOURCE__COMMUNICATION_MEDIAS);

		softwareResourceEClass = createEClass(SOFTWARE_RESOURCE);
		createEAttribute(softwareResourceEClass, SOFTWARE_RESOURCE__COMPUTING_RESOURCES);
		createEReference(softwareResourceEClass, SOFTWARE_RESOURCE__PERIOD);
		createEReference(softwareResourceEClass, SOFTWARE_RESOURCE__EXECUTION_TIME);

		redundancyClusterEClass = createEClass(REDUNDANCY_CLUSTER);
		createEAttribute(redundancyClusterEClass, REDUNDANCY_CLUSTER__RUNTIME);
		createEAttribute(redundancyClusterEClass, REDUNDANCY_CLUSTER__ACTIVE);
		createEAttribute(redundancyClusterEClass, REDUNDANCY_CLUSTER__PASSIVE);
		createEAttribute(redundancyClusterEClass, REDUNDANCY_CLUSTER__HYPERVISOR);

		// Create enums
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
		UIDPackage theUIDPackage = (UIDPackage)EPackage.Registry.INSTANCE.getEPackage(UIDPackage.eNS_URI);
		CommonTypePackage theCommonTypePackage = (CommonTypePackage)EPackage.Registry.INSTANCE.getEPackage(CommonTypePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		craEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		communicationMediaEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		computingResourceEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		softwareResourceEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		redundancyClusterEClass.getESuperTypes().add(theUIDPackage.getUIDElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(craEClass, Cra.class, "Cra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCra_CommunicationMedias(), this.getCommunicationMedia(), null, "communicationMedias", null, 0, -1, Cra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCra_ComputingResources(), this.getComputingResource(), null, "computingResources", null, 0, -1, Cra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCra_SoftwareResources(), this.getSoftwareResource(), null, "softwareResources", null, 0, -1, Cra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCra_RedundancyClusters(), this.getRedundancyCluster(), null, "redundancyClusters", null, 0, -1, Cra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(communicationMediaEClass, CommunicationMedia.class, "CommunicationMedia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationMedia_Latency(), theCommonTypePackage.getCommonType(), null, "latency", null, 0, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCommunicationMedia_Capacity(), theCommonTypePackage.getCommonType(), null, "capacity", null, 0, 1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCommunicationMedia_CommunicationMedias(), theTypesPackage.getString(), "communicationMedias", null, 0, -1, CommunicationMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(computingResourceEClass, ComputingResource.class, "ComputingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputingResource_CommunicationMedias(), theTypesPackage.getString(), "communicationMedias", null, 0, -1, ComputingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(softwareResourceEClass, SoftwareResource.class, "SoftwareResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareResource_ComputingResources(), theTypesPackage.getString(), "computingResources", null, 0, -1, SoftwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSoftwareResource_Period(), theCommonTypePackage.getPeriodType(), null, "period", null, 0, 1, SoftwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSoftwareResource_ExecutionTime(), theCommonTypePackage.getCommonType(), null, "executionTime", null, 0, 1, SoftwareResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(redundancyClusterEClass, RedundancyCluster.class, "RedundancyCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRedundancyCluster_Runtime(), this.getRedundancyKind(), "runtime", null, 1, 1, RedundancyCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRedundancyCluster_Active(), theTypesPackage.getString(), "active", null, 1, -1, RedundancyCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRedundancyCluster_Passive(), theTypesPackage.getString(), "passive", null, 0, -1, RedundancyCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRedundancyCluster_Hypervisor(), theTypesPackage.getString(), "hypervisor", null, 0, 1, RedundancyCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(redundancyKindEEnum, RedundancyKind.class, "RedundancyKind");
		addEEnumLiteral(redundancyKindEEnum, RedundancyKind.CONSENSUS);
		addEEnumLiteral(redundancyKindEEnum, RedundancyKind.HYPERVISOR);
		addEEnumLiteral(redundancyKindEEnum, RedundancyKind.ACTIVE_STANDBY);

		// Create resource
		createResource(eNS_URI);
	}

} //CraPackageImpl
