/**
 */
package fr.cea.nacre.model.NACREMM.cra;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage
 * @generated
 */
public interface CraFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CraFactory eINSTANCE = fr.cea.nacre.model.NACREMM.cra.impl.CraFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cra</em>'.
	 * @generated
	 */
	Cra createCra();

	/**
	 * Returns a new object of class '<em>Communication Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Media</em>'.
	 * @generated
	 */
	CommunicationMedia createCommunicationMedia();

	/**
	 * Returns a new object of class '<em>Computing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing Resource</em>'.
	 * @generated
	 */
	ComputingResource createComputingResource();

	/**
	 * Returns a new object of class '<em>Software Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Resource</em>'.
	 * @generated
	 */
	SoftwareResource createSoftwareResource();

	/**
	 * Returns a new object of class '<em>Redundancy Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redundancy Cluster</em>'.
	 * @generated
	 */
	RedundancyCluster createRedundancyCluster();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CraPackage getCraPackage();

} //CraFactory
