/**
 */
package fr.cea.nacre.model.NACREMM.cfra.impl;

import fr.cea.nacre.model.NACREMM.CommonType.CommonTypePackage;

import fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypePackageImpl;

import fr.cea.nacre.model.NACREMM.Hazard.HazardPackage;

import fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl;
import fr.cea.nacre.model.NACREMM.UID.UIDPackage;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDPackageImpl;

import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;

import fr.cea.nacre.model.NACREMM.cfa.impl.CfaPackageImpl;

import fr.cea.nacre.model.NACREMM.cfra.Abstraction;
import fr.cea.nacre.model.NACREMM.cfra.Cfra;
import fr.cea.nacre.model.NACREMM.cfra.CfraFactory;
import fr.cea.nacre.model.NACREMM.cfra.CfraPackage;

import fr.cea.nacre.model.NACREMM.cra.CraPackage;

import fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl;
import fr.cea.nacre.model.NACREMM.study.StudyPackage;

import fr.cea.nacre.model.NACREMM.study.impl.StudyPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class CfraPackageImpl extends EPackageImpl implements CfraPackage {
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
	private EClass abstractionEClass = null;

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
	 * @see fr.cea.nacre.model.NACREMM.cfra.CfraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CfraPackageImpl() {
		super(eNS_URI, CfraFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CfraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CfraPackage init() {
		if (isInited) return (CfraPackage)EPackage.Registry.INSTANCE.getEPackage(CfraPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCfraPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CfraPackageImpl theCfraPackage = registeredCfraPackage instanceof CfraPackageImpl ? (CfraPackageImpl)registeredCfraPackage : new CfraPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HazardPackage.eNS_URI);
		HazardPackageImpl theHazardPackage = (HazardPackageImpl)(registeredPackage instanceof HazardPackageImpl ? registeredPackage : HazardPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CfaPackage.eNS_URI);
		CfaPackageImpl theCfaPackage = (CfaPackageImpl)(registeredPackage instanceof CfaPackageImpl ? registeredPackage : CfaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StudyPackage.eNS_URI);
		StudyPackageImpl theStudyPackage = (StudyPackageImpl)(registeredPackage instanceof StudyPackageImpl ? registeredPackage : StudyPackage.eINSTANCE);

		// Create package meta-data objects
		theCfraPackage.createPackageContents();
		theCraPackage.createPackageContents();
		theUIDPackage.createPackageContents();
		theCommonTypePackage.createPackageContents();
		theHazardPackage.createPackageContents();
		theCfaPackage.createPackageContents();
		theStudyPackage.createPackageContents();

		// Initialize created meta-data
		theCfraPackage.initializePackageContents();
		theCraPackage.initializePackageContents();
		theUIDPackage.initializePackageContents();
		theCommonTypePackage.initializePackageContents();
		theHazardPackage.initializePackageContents();
		theCfaPackage.initializePackageContents();
		theStudyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCfraPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CfraPackage.eNS_URI, theCfraPackage);
		return theCfraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCfra() {
		return cfraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCfra_Abstractions() {
		return (EReference)cfraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCfra_Cra() {
		return (EAttribute)cfraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstraction() {
		return abstractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstraction_Function() {
		return (EAttribute)abstractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstraction_Resource() {
		return (EAttribute)abstractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CfraFactory getCfraFactory() {
		return (CfraFactory)getEFactoryInstance();
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
		cfraEClass = createEClass(CFRA);
		createEReference(cfraEClass, CFRA__ABSTRACTIONS);
		createEAttribute(cfraEClass, CFRA__CRA);

		abstractionEClass = createEClass(ABSTRACTION);
		createEAttribute(abstractionEClass, ABSTRACTION__FUNCTION);
		createEAttribute(abstractionEClass, ABSTRACTION__RESOURCE);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cfraEClass.getESuperTypes().add(theUIDPackage.getUIDElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(cfraEClass, Cfra.class, "Cfra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCfra_Abstractions(), this.getAbstraction(), null, "abstractions", null, 0, -1, Cfra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCfra_Cra(), theTypesPackage.getString(), "cra", null, 1, 1, Cfra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(abstractionEClass, Abstraction.class, "Abstraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstraction_Function(), theTypesPackage.getString(), "function", null, 1, 1, Abstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstraction_Resource(), theTypesPackage.getString(), "resource", null, 1, 1, Abstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CfraPackageImpl
