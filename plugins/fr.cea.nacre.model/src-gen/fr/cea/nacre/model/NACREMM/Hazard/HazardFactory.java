/**
 */
package fr.cea.nacre.model.NACREMM.Hazard;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage
 * @generated
 */
public interface HazardFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HazardFactory eINSTANCE = fr.cea.nacre.model.NACREMM.Hazard.impl.HazardFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Communication Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Hazard</em>'.
	 * @generated
	 */
	CommunicationHazard createCommunicationHazard();

	/**
	 * Returns a new object of class '<em>Abstract Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Hazard</em>'.
	 * @generated
	 */
	AbstractHazard createAbstractHazard();

	/**
	 * Returns a new object of class '<em>Cra Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cra Hazard</em>'.
	 * @generated
	 */
	CraHazard createCraHazard();

	/**
	 * Returns a new object of class '<em>NACRE Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NACRE Hazard</em>'.
	 * @generated
	 */
	NACREHazard createNACREHazard();

	/**
	 * Returns a new object of class '<em>Cfa Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cfa Hazard</em>'.
	 * @generated
	 */
	CfaHazard createCfaHazard();

	/**
	 * Returns a new object of class '<em>Line Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Hazard</em>'.
	 * @generated
	 */
	LineHazard createLineHazard();

	/**
	 * Returns a new object of class '<em>Generator Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Hazard</em>'.
	 * @generated
	 */
	GeneratorHazard createGeneratorHazard();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HazardPackage getHazardPackage();

} //HazardFactory
