/**
 */
package fr.cea.nacre.model.NACREMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;

import fr.cea.nacre.model.NACREMM.NACREMMFactory;
import fr.cea.nacre.model.NACREMM.NACREMMPackage;
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
import fr.cea.nacre.model.NACREMM.cra.CraPackage;
import fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl;
import fr.cea.nacre.model.NACREMM.study.StudyPackage;
import fr.cea.nacre.model.NACREMM.study.impl.StudyPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NACREMMPackageImpl extends EPackageImpl implements NACREMMPackage {
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
	 * @see fr.cea.nacre.model.NACREMM.NACREMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NACREMMPackageImpl() {
		super(eNS_URI, NACREMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NACREMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NACREMMPackage init() {
		if (isInited) return (NACREMMPackage)EPackage.Registry.INSTANCE.getEPackage(NACREMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNACREMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NACREMMPackageImpl theNACREMMPackage = registeredNACREMMPackage instanceof NACREMMPackageImpl ? (NACREMMPackageImpl)registeredNACREMMPackage : new NACREMMPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CfaPackage.eNS_URI);
		CfaPackageImpl theCfaPackage = (CfaPackageImpl)(registeredPackage instanceof CfaPackageImpl ? registeredPackage : CfaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StudyPackage.eNS_URI);
		StudyPackageImpl theStudyPackage = (StudyPackageImpl)(registeredPackage instanceof StudyPackageImpl ? registeredPackage : StudyPackage.eINSTANCE);

		// Create package meta-data objects
		theNACREMMPackage.createPackageContents();
		theCraPackage.createPackageContents();
		theUIDPackage.createPackageContents();
		theCommonTypePackage.createPackageContents();
		theCfraPackage.createPackageContents();
		theHazardPackage.createPackageContents();
		theCfaPackage.createPackageContents();
		theStudyPackage.createPackageContents();

		// Initialize created meta-data
		theNACREMMPackage.initializePackageContents();
		theCraPackage.initializePackageContents();
		theUIDPackage.initializePackageContents();
		theCommonTypePackage.initializePackageContents();
		theCfraPackage.initializePackageContents();
		theHazardPackage.initializePackageContents();
		theCfaPackage.initializePackageContents();
		theStudyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNACREMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NACREMMPackage.eNS_URI, theNACREMMPackage);
		return theNACREMMPackage;
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
	public NACREMMFactory getNACREMMFactory() {
		return (NACREMMFactory)getEFactoryInstance();
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
		CraPackage theCraPackage = (CraPackage)EPackage.Registry.INSTANCE.getEPackage(CraPackage.eNS_URI);
		UIDPackage theUIDPackage = (UIDPackage)EPackage.Registry.INSTANCE.getEPackage(UIDPackage.eNS_URI);
		CommonTypePackage theCommonTypePackage = (CommonTypePackage)EPackage.Registry.INSTANCE.getEPackage(CommonTypePackage.eNS_URI);
		CfraPackage theCfraPackage = (CfraPackage)EPackage.Registry.INSTANCE.getEPackage(CfraPackage.eNS_URI);
		HazardPackage theHazardPackage = (HazardPackage)EPackage.Registry.INSTANCE.getEPackage(HazardPackage.eNS_URI);
		CfaPackage theCfaPackage = (CfaPackage)EPackage.Registry.INSTANCE.getEPackage(CfaPackage.eNS_URI);
		StudyPackage theStudyPackage = (StudyPackage)EPackage.Registry.INSTANCE.getEPackage(StudyPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCraPackage);
		getESubpackages().add(theUIDPackage);
		getESubpackages().add(theCommonTypePackage);
		getESubpackages().add(theCfraPackage);
		getESubpackages().add(theHazardPackage);
		getESubpackages().add(theCfaPackage);
		getESubpackages().add(theStudyPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		redundancyClusterEClass.getESuperTypes().add(theUIDPackage.getUIDElement());


		// Create resource
		createResource(eNS_URI);
	}

} //NACREMMPackageImpl
