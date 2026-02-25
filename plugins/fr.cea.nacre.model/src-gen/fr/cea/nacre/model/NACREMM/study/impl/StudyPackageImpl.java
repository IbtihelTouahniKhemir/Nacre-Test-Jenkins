/**
 */
package fr.cea.nacre.model.NACREMM.study.impl;

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
import fr.cea.nacre.model.NACREMM.study.Manifest;
import fr.cea.nacre.model.NACREMM.study.Study;
import fr.cea.nacre.model.NACREMM.study.StudyFactory;
import fr.cea.nacre.model.NACREMM.study.StudyPackage;
import fr.cea.nacre.model.NACREMM.study.UsingDirectives;

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
public class StudyPackageImpl extends EPackageImpl implements StudyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usingDirectivesEClass = null;

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
	 * @see fr.cea.nacre.model.NACREMM.study.StudyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StudyPackageImpl() {
		super(eNS_URI, StudyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StudyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StudyPackage init() {
		if (isInited) return (StudyPackage)EPackage.Registry.INSTANCE.getEPackage(StudyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStudyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StudyPackageImpl theStudyPackage = registeredStudyPackage instanceof StudyPackageImpl ? (StudyPackageImpl)registeredStudyPackage : new StudyPackageImpl();

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

		// Create package meta-data objects
		theStudyPackage.createPackageContents();
		theCraPackage.createPackageContents();
		theUIDPackage.createPackageContents();
		theCommonTypePackage.createPackageContents();
		theCfraPackage.createPackageContents();
		theHazardPackage.createPackageContents();
		theCfaPackage.createPackageContents();

		// Initialize created meta-data
		theStudyPackage.initializePackageContents();
		theCraPackage.initializePackageContents();
		theUIDPackage.initializePackageContents();
		theCommonTypePackage.initializePackageContents();
		theCfraPackage.initializePackageContents();
		theHazardPackage.initializePackageContents();
		theCfaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStudyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StudyPackage.eNS_URI, theStudyPackage);
		return theStudyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStudy() {
		return studyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudy_Cfa() {
		return (EReference)studyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudy_Cras() {
		return (EReference)studyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudy_Cfras() {
		return (EReference)studyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudy_Hazards() {
		return (EReference)studyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManifest() {
		return manifestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManifest_Version() {
		return (EAttribute)manifestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManifest_Description() {
		return (EAttribute)manifestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManifest_Service() {
		return (EAttribute)manifestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManifest_Type() {
		return (EAttribute)manifestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsingDirectives() {
		return usingDirectivesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsingDirectives_Iidm() {
		return (EAttribute)usingDirectivesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsingDirectives_Filter() {
		return (EAttribute)usingDirectivesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyFactory getStudyFactory() {
		return (StudyFactory)getEFactoryInstance();
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
		studyEClass = createEClass(STUDY);
		createEReference(studyEClass, STUDY__CFA);
		createEReference(studyEClass, STUDY__CRAS);
		createEReference(studyEClass, STUDY__CFRAS);
		createEReference(studyEClass, STUDY__HAZARDS);

		manifestEClass = createEClass(MANIFEST);
		createEAttribute(manifestEClass, MANIFEST__VERSION);
		createEAttribute(manifestEClass, MANIFEST__DESCRIPTION);
		createEAttribute(manifestEClass, MANIFEST__SERVICE);
		createEAttribute(manifestEClass, MANIFEST__TYPE);

		usingDirectivesEClass = createEClass(USING_DIRECTIVES);
		createEAttribute(usingDirectivesEClass, USING_DIRECTIVES__IIDM);
		createEAttribute(usingDirectivesEClass, USING_DIRECTIVES__FILTER);
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
		CfaPackage theCfaPackage = (CfaPackage)EPackage.Registry.INSTANCE.getEPackage(CfaPackage.eNS_URI);
		CraPackage theCraPackage = (CraPackage)EPackage.Registry.INSTANCE.getEPackage(CraPackage.eNS_URI);
		CfraPackage theCfraPackage = (CfraPackage)EPackage.Registry.INSTANCE.getEPackage(CfraPackage.eNS_URI);
		HazardPackage theHazardPackage = (HazardPackage)EPackage.Registry.INSTANCE.getEPackage(HazardPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		studyEClass.getESuperTypes().add(theUIDPackage.getUIDElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(studyEClass, Study.class, "Study", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudy_Cfa(), theCfaPackage.getCfa(), null, "cfa", null, 0, 1, Study.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStudy_Cras(), theCraPackage.getCra(), null, "cras", null, 0, -1, Study.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStudy_Cfras(), theCfraPackage.getCfra(), null, "cfras", null, 0, -1, Study.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStudy_Hazards(), theHazardPackage.getNACREHazard(), null, "hazards", null, 1, 1, Study.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(manifestEClass, Manifest.class, "Manifest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManifest_Version(), theTypesPackage.getInteger(), "version", null, 1, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getManifest_Description(), theTypesPackage.getString(), "description", null, 1, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getManifest_Service(), theTypesPackage.getString(), "service", null, 1, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getManifest_Type(), theTypesPackage.getString(), "type", null, 1, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(usingDirectivesEClass, UsingDirectives.class, "UsingDirectives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsingDirectives_Iidm(), theTypesPackage.getString(), "iidm", null, 1, 1, UsingDirectives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsingDirectives_Filter(), theTypesPackage.getString(), "filter", null, 1, 1, UsingDirectives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StudyPackageImpl
