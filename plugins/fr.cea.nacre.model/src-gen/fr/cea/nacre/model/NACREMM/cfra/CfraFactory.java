/**
 */
package fr.cea.nacre.model.NACREMM.cfra;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.cea.nacre.model.NACREMM.cfra.CfraPackage
 * @generated
 */
public interface CfraFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CfraFactory eINSTANCE = fr.cea.nacre.model.NACREMM.cfra.impl.CfraFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cfra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cfra</em>'.
	 * @generated
	 */
	Cfra createCfra();

	/**
	 * Returns a new object of class '<em>Abstraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstraction</em>'.
	 * @generated
	 */
	Abstraction createAbstraction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CfraPackage getCfraPackage();

} //CfraFactory
