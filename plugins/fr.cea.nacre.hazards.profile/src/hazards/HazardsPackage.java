/**
 */
package hazards;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see hazards.HazardsFactory
 * @model kind="package"
 * @generated
 */
public interface HazardsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hazards";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/Hazards";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hazards";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HazardsPackage eINSTANCE = hazards.impl.HazardsPackageImpl.init();

	/**
	 * The meta object id for the '{@link hazards.impl.AbstractHazardImpl <em>Abstract Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazards.impl.AbstractHazardImpl
	 * @see hazards.impl.HazardsPackageImpl#getAbstractHazard()
	 * @generated
	 */
	int ABSTRACT_HAZARD = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HAZARD__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HAZARD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HAZARD__JUSTIFICATION = 2;

	/**
	 * The number of structural features of the '<em>Abstract Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HAZARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HAZARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hazards.impl.CommunicationHazardImpl <em>Communication Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazards.impl.CommunicationHazardImpl
	 * @see hazards.impl.HazardsPackageImpl#getCommunicationHazard()
	 * @generated
	 */
	int COMMUNICATION_HAZARD = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__DESCRIPTION = ABSTRACT_HAZARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__NAME = ABSTRACT_HAZARD__NAME;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__JUSTIFICATION = ABSTRACT_HAZARD__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__BASE_CLASS = ABSTRACT_HAZARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__PERIOD = ABSTRACT_HAZARD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__PERCENT = ABSTRACT_HAZARD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__BASE_PROPERTY = ABSTRACT_HAZARD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__BASE_ASSOCIATION = ABSTRACT_HAZARD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__BASE_ABSTRACTION = ABSTRACT_HAZARD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Communication Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD_FEATURE_COUNT = ABSTRACT_HAZARD_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Communication Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD_OPERATION_COUNT = ABSTRACT_HAZARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hazards.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazards.impl.PeriodImpl
	 * @see hazards.impl.HazardsPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__END = 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link hazards.impl.LineHazardImpl <em>Line Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazards.impl.LineHazardImpl
	 * @see hazards.impl.HazardsPackageImpl#getLineHazard()
	 * @generated
	 */
	int LINE_HAZARD = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD__DESCRIPTION = ABSTRACT_HAZARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD__NAME = ABSTRACT_HAZARD__NAME;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD__JUSTIFICATION = ABSTRACT_HAZARD__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD__START = ABSTRACT_HAZARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD__BASE_CLASS = ABSTRACT_HAZARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Line Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD_FEATURE_COUNT = ABSTRACT_HAZARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Line Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD_OPERATION_COUNT = ABSTRACT_HAZARD_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link hazards.impl.GeneratorHazardImpl <em>Generator Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazards.impl.GeneratorHazardImpl
	 * @see hazards.impl.HazardsPackageImpl#getGeneratorHazard()
	 * @generated
	 */
	int GENERATOR_HAZARD = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD__DESCRIPTION = ABSTRACT_HAZARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD__NAME = ABSTRACT_HAZARD__NAME;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD__JUSTIFICATION = ABSTRACT_HAZARD__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD__BASE_CLASS = ABSTRACT_HAZARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD__START = ABSTRACT_HAZARD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD__BASE_PROPERTY = ABSTRACT_HAZARD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generator Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD_FEATURE_COUNT = ABSTRACT_HAZARD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Generator Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD_OPERATION_COUNT = ABSTRACT_HAZARD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hazards.CommunicationHazard <em>Communication Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Hazard</em>'.
	 * @see hazards.CommunicationHazard
	 * @generated
	 */
	EClass getCommunicationHazard();

	/**
	 * Returns the meta object for the reference '{@link hazards.CommunicationHazard#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see hazards.CommunicationHazard#getBase_Class()
	 * @see #getCommunicationHazard()
	 * @generated
	 */
	EReference getCommunicationHazard_Base_Class();

	/**
	 * Returns the meta object for the containment reference '{@link hazards.CommunicationHazard#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see hazards.CommunicationHazard#getPeriod()
	 * @see #getCommunicationHazard()
	 * @generated
	 */
	EReference getCommunicationHazard_Period();

	/**
	 * Returns the meta object for the attribute '{@link hazards.CommunicationHazard#getPercent <em>Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent</em>'.
	 * @see hazards.CommunicationHazard#getPercent()
	 * @see #getCommunicationHazard()
	 * @generated
	 */
	EAttribute getCommunicationHazard_Percent();

	/**
	 * Returns the meta object for the reference '{@link hazards.CommunicationHazard#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see hazards.CommunicationHazard#getBase_Property()
	 * @see #getCommunicationHazard()
	 * @generated
	 */
	EReference getCommunicationHazard_Base_Property();

	/**
	 * Returns the meta object for the reference '{@link hazards.CommunicationHazard#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see hazards.CommunicationHazard#getBase_Association()
	 * @see #getCommunicationHazard()
	 * @generated
	 */
	EReference getCommunicationHazard_Base_Association();

	/**
	 * Returns the meta object for the reference '{@link hazards.CommunicationHazard#getBase_Abstraction <em>Base Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Abstraction</em>'.
	 * @see hazards.CommunicationHazard#getBase_Abstraction()
	 * @see #getCommunicationHazard()
	 * @generated
	 */
	EReference getCommunicationHazard_Base_Abstraction();

	/**
	 * Returns the meta object for class '{@link hazards.AbstractHazard <em>Abstract Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Hazard</em>'.
	 * @see hazards.AbstractHazard
	 * @generated
	 */
	EClass getAbstractHazard();

	/**
	 * Returns the meta object for the attribute '{@link hazards.AbstractHazard#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see hazards.AbstractHazard#getDescription()
	 * @see #getAbstractHazard()
	 * @generated
	 */
	EAttribute getAbstractHazard_Description();

	/**
	 * Returns the meta object for the attribute '{@link hazards.AbstractHazard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hazards.AbstractHazard#getName()
	 * @see #getAbstractHazard()
	 * @generated
	 */
	EAttribute getAbstractHazard_Name();

	/**
	 * Returns the meta object for the attribute '{@link hazards.AbstractHazard#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification</em>'.
	 * @see hazards.AbstractHazard#getJustification()
	 * @see #getAbstractHazard()
	 * @generated
	 */
	EAttribute getAbstractHazard_Justification();

	/**
	 * Returns the meta object for class '{@link hazards.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see hazards.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the attribute '{@link hazards.Period#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see hazards.Period#getStart()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Start();

	/**
	 * Returns the meta object for the attribute '{@link hazards.Period#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see hazards.Period#getEnd()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_End();

	/**
	 * Returns the meta object for class '{@link hazards.LineHazard <em>Line Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Hazard</em>'.
	 * @see hazards.LineHazard
	 * @generated
	 */
	EClass getLineHazard();

	/**
	 * Returns the meta object for the attribute '{@link hazards.LineHazard#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see hazards.LineHazard#getStart()
	 * @see #getLineHazard()
	 * @generated
	 */
	EAttribute getLineHazard_Start();

	/**
	 * Returns the meta object for the reference '{@link hazards.LineHazard#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see hazards.LineHazard#getBase_Class()
	 * @see #getLineHazard()
	 * @generated
	 */
	EReference getLineHazard_Base_Class();

	/**
	 * Returns the meta object for class '{@link hazards.GeneratorHazard <em>Generator Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Hazard</em>'.
	 * @see hazards.GeneratorHazard
	 * @generated
	 */
	EClass getGeneratorHazard();

	/**
	 * Returns the meta object for the reference '{@link hazards.GeneratorHazard#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see hazards.GeneratorHazard#getBase_Class()
	 * @see #getGeneratorHazard()
	 * @generated
	 */
	EReference getGeneratorHazard_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link hazards.GeneratorHazard#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see hazards.GeneratorHazard#getStart()
	 * @see #getGeneratorHazard()
	 * @generated
	 */
	EAttribute getGeneratorHazard_Start();

	/**
	 * Returns the meta object for the reference '{@link hazards.GeneratorHazard#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see hazards.GeneratorHazard#getBase_Property()
	 * @see #getGeneratorHazard()
	 * @generated
	 */
	EReference getGeneratorHazard_Base_Property();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HazardsFactory getHazardsFactory();

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
		 * The meta object literal for the '{@link hazards.impl.CommunicationHazardImpl <em>Communication Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazards.impl.CommunicationHazardImpl
		 * @see hazards.impl.HazardsPackageImpl#getCommunicationHazard()
		 * @generated
		 */
		EClass COMMUNICATION_HAZARD = eINSTANCE.getCommunicationHazard();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_HAZARD__BASE_CLASS = eINSTANCE.getCommunicationHazard_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_HAZARD__PERIOD = eINSTANCE.getCommunicationHazard_Period();

		/**
		 * The meta object literal for the '<em><b>Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_HAZARD__PERCENT = eINSTANCE.getCommunicationHazard_Percent();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_HAZARD__BASE_PROPERTY = eINSTANCE.getCommunicationHazard_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_HAZARD__BASE_ASSOCIATION = eINSTANCE.getCommunicationHazard_Base_Association();

		/**
		 * The meta object literal for the '<em><b>Base Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_HAZARD__BASE_ABSTRACTION = eINSTANCE.getCommunicationHazard_Base_Abstraction();

		/**
		 * The meta object literal for the '{@link hazards.impl.AbstractHazardImpl <em>Abstract Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazards.impl.AbstractHazardImpl
		 * @see hazards.impl.HazardsPackageImpl#getAbstractHazard()
		 * @generated
		 */
		EClass ABSTRACT_HAZARD = eINSTANCE.getAbstractHazard();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_HAZARD__DESCRIPTION = eINSTANCE.getAbstractHazard_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_HAZARD__NAME = eINSTANCE.getAbstractHazard_Name();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_HAZARD__JUSTIFICATION = eINSTANCE.getAbstractHazard_Justification();

		/**
		 * The meta object literal for the '{@link hazards.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazards.impl.PeriodImpl
		 * @see hazards.impl.HazardsPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__START = eINSTANCE.getPeriod_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__END = eINSTANCE.getPeriod_End();

		/**
		 * The meta object literal for the '{@link hazards.impl.LineHazardImpl <em>Line Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazards.impl.LineHazardImpl
		 * @see hazards.impl.HazardsPackageImpl#getLineHazard()
		 * @generated
		 */
		EClass LINE_HAZARD = eINSTANCE.getLineHazard();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_HAZARD__START = eINSTANCE.getLineHazard_Start();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_HAZARD__BASE_CLASS = eINSTANCE.getLineHazard_Base_Class();

		/**
		 * The meta object literal for the '{@link hazards.impl.GeneratorHazardImpl <em>Generator Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazards.impl.GeneratorHazardImpl
		 * @see hazards.impl.HazardsPackageImpl#getGeneratorHazard()
		 * @generated
		 */
		EClass GENERATOR_HAZARD = eINSTANCE.getGeneratorHazard();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_HAZARD__BASE_CLASS = eINSTANCE.getGeneratorHazard_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_HAZARD__START = eINSTANCE.getGeneratorHazard_Start();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_HAZARD__BASE_PROPERTY = eINSTANCE.getGeneratorHazard_Base_Property();

	}

} //HazardsPackage
