/**
 */
package fr.cea.nacre.model.NACREMM.CommonType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see fr.cea.nacre.model.NACREMM.CommonType.CommonTypeFactory
 * @model kind="package"
 * @generated
 */
public interface CommonTypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CommonType";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///NACREMM/CommonType.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NACREMM.CommonType";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonTypePackage eINSTANCE = fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.CommonType.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.CommonType.impl.PeriodImpl
	 * @see fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypePackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 0;

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
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__UNIT = 2;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.CommonType.impl.PeriodTypeImpl <em>Period Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.CommonType.impl.PeriodTypeImpl
	 * @see fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypePackageImpl#getPeriodType()
	 * @generated
	 */
	int PERIOD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_TYPE__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Period Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Period Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypeImpl <em>Common Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypeImpl
	 * @see fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypePackageImpl#getCommonType()
	 * @generated
	 */
	int COMMON_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_TYPE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Common Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Common Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.CommonType.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see fr.cea.nacre.model.NACREMM.CommonType.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.CommonType.Period#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see fr.cea.nacre.model.NACREMM.CommonType.Period#getStart()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Start();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.CommonType.Period#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see fr.cea.nacre.model.NACREMM.CommonType.Period#getEnd()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_End();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.CommonType.Period#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see fr.cea.nacre.model.NACREMM.CommonType.Period#getUnit()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Unit();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.CommonType.PeriodType <em>Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period Type</em>'.
	 * @see fr.cea.nacre.model.NACREMM.CommonType.PeriodType
	 * @generated
	 */
	EClass getPeriodType();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.CommonType.PeriodType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see fr.cea.nacre.model.NACREMM.CommonType.PeriodType#getUnit()
	 * @see #getPeriodType()
	 * @generated
	 */
	EAttribute getPeriodType_Unit();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.CommonType.PeriodType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.cea.nacre.model.NACREMM.CommonType.PeriodType#getValue()
	 * @see #getPeriodType()
	 * @generated
	 */
	EAttribute getPeriodType_Value();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.CommonType.CommonType <em>Common Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Type</em>'.
	 * @see fr.cea.nacre.model.NACREMM.CommonType.CommonType
	 * @generated
	 */
	EClass getCommonType();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.CommonType.CommonType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.cea.nacre.model.NACREMM.CommonType.CommonType#getValue()
	 * @see #getCommonType()
	 * @generated
	 */
	EAttribute getCommonType_Value();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.CommonType.CommonType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see fr.cea.nacre.model.NACREMM.CommonType.CommonType#getUnit()
	 * @see #getCommonType()
	 * @generated
	 */
	EAttribute getCommonType_Unit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonTypeFactory getCommonTypeFactory();

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
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.CommonType.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.CommonType.impl.PeriodImpl
		 * @see fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypePackageImpl#getPeriod()
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
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__UNIT = eINSTANCE.getPeriod_Unit();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.CommonType.impl.PeriodTypeImpl <em>Period Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.CommonType.impl.PeriodTypeImpl
		 * @see fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypePackageImpl#getPeriodType()
		 * @generated
		 */
		EClass PERIOD_TYPE = eINSTANCE.getPeriodType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD_TYPE__UNIT = eINSTANCE.getPeriodType_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD_TYPE__VALUE = eINSTANCE.getPeriodType_Value();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypeImpl <em>Common Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypeImpl
		 * @see fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypePackageImpl#getCommonType()
		 * @generated
		 */
		EClass COMMON_TYPE = eINSTANCE.getCommonType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_TYPE__VALUE = eINSTANCE.getCommonType_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_TYPE__UNIT = eINSTANCE.getCommonType_Unit();

	}

} //CommonTypePackage
