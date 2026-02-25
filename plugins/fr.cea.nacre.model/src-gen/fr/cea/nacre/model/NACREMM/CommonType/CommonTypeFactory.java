/**
 */
package fr.cea.nacre.model.NACREMM.CommonType;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.cea.nacre.model.NACREMM.CommonType.CommonTypePackage
 * @generated
 */
public interface CommonTypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonTypeFactory eINSTANCE = fr.cea.nacre.model.NACREMM.CommonType.impl.CommonTypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Period</em>'.
	 * @generated
	 */
	Period createPeriod();

	/**
	 * Returns a new object of class '<em>Period Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Period Type</em>'.
	 * @generated
	 */
	PeriodType createPeriodType();

	/**
	 * Returns a new object of class '<em>Common Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Common Type</em>'.
	 * @generated
	 */
	CommonType createCommonType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonTypePackage getCommonTypePackage();

} //CommonTypeFactory
