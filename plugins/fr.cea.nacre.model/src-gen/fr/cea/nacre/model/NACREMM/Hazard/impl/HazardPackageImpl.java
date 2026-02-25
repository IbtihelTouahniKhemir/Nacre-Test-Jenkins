/**
 */
package fr.cea.nacre.model.NACREMM.Hazard.impl;

import fr.cea.nacre.model.NACREMM.CommonType.CommonTypePackage;

import fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypePackageImpl;

import fr.cea.nacre.model.NACREMM.Hazard.AbstractHazard;
import fr.cea.nacre.model.NACREMM.Hazard.CfaHazard;
import fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard;
import fr.cea.nacre.model.NACREMM.Hazard.CraHazard;
import fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard;
import fr.cea.nacre.model.NACREMM.Hazard.HazardFactory;
import fr.cea.nacre.model.NACREMM.Hazard.HazardPackage;
import fr.cea.nacre.model.NACREMM.Hazard.LineHazard;
import fr.cea.nacre.model.NACREMM.Hazard.NACREHazard;
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
public class HazardPackageImpl extends EPackageImpl implements HazardPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationHazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractHazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass craHazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nacreHazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cfaHazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineHazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorHazardEClass = null;

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
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HazardPackageImpl() {
		super(eNS_URI, HazardFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HazardPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HazardPackage init() {
		if (isInited) return (HazardPackage)EPackage.Registry.INSTANCE.getEPackage(HazardPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHazardPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HazardPackageImpl theHazardPackage = registeredHazardPackage instanceof HazardPackageImpl ? (HazardPackageImpl)registeredHazardPackage : new HazardPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CfaPackage.eNS_URI);
		CfaPackageImpl theCfaPackage = (CfaPackageImpl)(registeredPackage instanceof CfaPackageImpl ? registeredPackage : CfaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StudyPackage.eNS_URI);
		StudyPackageImpl theStudyPackage = (StudyPackageImpl)(registeredPackage instanceof StudyPackageImpl ? registeredPackage : StudyPackage.eINSTANCE);

		// Create package meta-data objects
		theHazardPackage.createPackageContents();
		theCraPackage.createPackageContents();
		theUIDPackage.createPackageContents();
		theCommonTypePackage.createPackageContents();
		theCfraPackage.createPackageContents();
		theCfaPackage.createPackageContents();
		theStudyPackage.createPackageContents();

		// Initialize created meta-data
		theHazardPackage.initializePackageContents();
		theCraPackage.initializePackageContents();
		theUIDPackage.initializePackageContents();
		theCommonTypePackage.initializePackageContents();
		theCfraPackage.initializePackageContents();
		theCfaPackage.initializePackageContents();
		theStudyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHazardPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HazardPackage.eNS_URI, theHazardPackage);
		return theHazardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationHazard() {
		return communicationHazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationHazard_Component() {
		return (EAttribute)communicationHazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationHazard_From() {
		return (EAttribute)communicationHazardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationHazard_To() {
		return (EAttribute)communicationHazardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationHazard_Period() {
		return (EReference)communicationHazardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationHazard_Percent() {
		return (EAttribute)communicationHazardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractHazard() {
		return abstractHazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractHazard_Description() {
		return (EAttribute)abstractHazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractHazard_Justification() {
		return (EAttribute)abstractHazardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCraHazard() {
		return craHazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCraHazard_Cra() {
		return (EAttribute)craHazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCraHazard_CommunicationHazards() {
		return (EReference)craHazardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNACREHazard() {
		return nacreHazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNACREHazard_CraHazards() {
		return (EReference)nacreHazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNACREHazard_CfaHazards() {
		return (EReference)nacreHazardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCfaHazard() {
		return cfaHazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCfaHazard_LineHazards() {
		return (EReference)cfaHazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCfaHazard_Cfa() {
		return (EAttribute)cfaHazardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCfaHazard_Generatorhazard() {
		return (EReference)cfaHazardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineHazard() {
		return lineHazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineHazard_Line() {
		return (EAttribute)lineHazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineHazard_Start() {
		return (EReference)lineHazardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneratorHazard() {
		return generatorHazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneratorHazard_Start() {
		return (EReference)generatorHazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneratorHazard_Generator() {
		return (EAttribute)generatorHazardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HazardFactory getHazardFactory() {
		return (HazardFactory)getEFactoryInstance();
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
		communicationHazardEClass = createEClass(COMMUNICATION_HAZARD);
		createEAttribute(communicationHazardEClass, COMMUNICATION_HAZARD__COMPONENT);
		createEAttribute(communicationHazardEClass, COMMUNICATION_HAZARD__FROM);
		createEAttribute(communicationHazardEClass, COMMUNICATION_HAZARD__TO);
		createEReference(communicationHazardEClass, COMMUNICATION_HAZARD__PERIOD);
		createEAttribute(communicationHazardEClass, COMMUNICATION_HAZARD__PERCENT);

		abstractHazardEClass = createEClass(ABSTRACT_HAZARD);
		createEAttribute(abstractHazardEClass, ABSTRACT_HAZARD__DESCRIPTION);
		createEAttribute(abstractHazardEClass, ABSTRACT_HAZARD__JUSTIFICATION);

		craHazardEClass = createEClass(CRA_HAZARD);
		createEAttribute(craHazardEClass, CRA_HAZARD__CRA);
		createEReference(craHazardEClass, CRA_HAZARD__COMMUNICATION_HAZARDS);

		nacreHazardEClass = createEClass(NACRE_HAZARD);
		createEReference(nacreHazardEClass, NACRE_HAZARD__CRA_HAZARDS);
		createEReference(nacreHazardEClass, NACRE_HAZARD__CFA_HAZARDS);

		cfaHazardEClass = createEClass(CFA_HAZARD);
		createEReference(cfaHazardEClass, CFA_HAZARD__LINE_HAZARDS);
		createEAttribute(cfaHazardEClass, CFA_HAZARD__CFA);
		createEReference(cfaHazardEClass, CFA_HAZARD__GENERATORHAZARD);

		lineHazardEClass = createEClass(LINE_HAZARD);
		createEAttribute(lineHazardEClass, LINE_HAZARD__LINE);
		createEReference(lineHazardEClass, LINE_HAZARD__START);

		generatorHazardEClass = createEClass(GENERATOR_HAZARD);
		createEReference(generatorHazardEClass, GENERATOR_HAZARD__START);
		createEAttribute(generatorHazardEClass, GENERATOR_HAZARD__GENERATOR);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		CommonTypePackage theCommonTypePackage = (CommonTypePackage)EPackage.Registry.INSTANCE.getEPackage(CommonTypePackage.eNS_URI);
		UIDPackage theUIDPackage = (UIDPackage)EPackage.Registry.INSTANCE.getEPackage(UIDPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		communicationHazardEClass.getESuperTypes().add(this.getAbstractHazard());
		abstractHazardEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		craHazardEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		nacreHazardEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		cfaHazardEClass.getESuperTypes().add(theUIDPackage.getUIDElement());
		lineHazardEClass.getESuperTypes().add(this.getAbstractHazard());
		generatorHazardEClass.getESuperTypes().add(this.getAbstractHazard());

		// Initialize classes, features, and operations; add parameters
		initEClass(communicationHazardEClass, CommunicationHazard.class, "CommunicationHazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationHazard_Component(), theTypesPackage.getString(), "component", null, 1, 1, CommunicationHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCommunicationHazard_From(), theTypesPackage.getString(), "from", null, 1, 1, CommunicationHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCommunicationHazard_To(), theTypesPackage.getString(), "to", null, 1, 1, CommunicationHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCommunicationHazard_Period(), theCommonTypePackage.getPeriod(), null, "period", null, 1, 1, CommunicationHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCommunicationHazard_Percent(), ecorePackage.getEDouble(), "percent", null, 1, 1, CommunicationHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(abstractHazardEClass, AbstractHazard.class, "AbstractHazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractHazard_Description(), theTypesPackage.getString(), "description", null, 1, 1, AbstractHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractHazard_Justification(), theTypesPackage.getString(), "justification", null, 1, 1, AbstractHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(craHazardEClass, CraHazard.class, "CraHazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCraHazard_Cra(), theTypesPackage.getString(), "cra", null, 1, 1, CraHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCraHazard_CommunicationHazards(), this.getCommunicationHazard(), null, "communicationHazards", null, 0, -1, CraHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nacreHazardEClass, NACREHazard.class, "NACREHazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNACREHazard_CraHazards(), this.getCraHazard(), null, "craHazards", null, 0, -1, NACREHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNACREHazard_CfaHazards(), this.getCfaHazard(), null, "cfaHazards", null, 0, -1, NACREHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cfaHazardEClass, CfaHazard.class, "CfaHazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCfaHazard_LineHazards(), this.getLineHazard(), null, "lineHazards", null, 0, -1, CfaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCfaHazard_Cfa(), theTypesPackage.getString(), "cfa", null, 1, 1, CfaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCfaHazard_Generatorhazard(), this.getGeneratorHazard(), null, "generatorhazard", null, 0, -1, CfaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lineHazardEClass, LineHazard.class, "LineHazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineHazard_Line(), theTypesPackage.getString(), "line", null, 1, 1, LineHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLineHazard_Start(), theCommonTypePackage.getPeriodType(), null, "start", null, 1, 1, LineHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generatorHazardEClass, GeneratorHazard.class, "GeneratorHazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorHazard_Start(), theCommonTypePackage.getPeriodType(), null, "start", null, 1, 1, GeneratorHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneratorHazard_Generator(), theTypesPackage.getString(), "generator", null, 1, 1, GeneratorHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HazardPackageImpl
