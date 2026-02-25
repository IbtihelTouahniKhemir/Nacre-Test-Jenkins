/**
 */
package hazards;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hazards.HazardsPackage
 * @generated
 */
public interface HazardsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HazardsFactory eINSTANCE = hazards.impl.HazardsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Communication Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Hazard</em>'.
	 * @generated
	 */
	CommunicationHazard createCommunicationHazard();

	/**
	 * Returns a new object of class '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Period</em>'.
	 * @generated
	 */
	Period createPeriod();

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
	HazardsPackage getHazardsPackage();

} //HazardsFactory
