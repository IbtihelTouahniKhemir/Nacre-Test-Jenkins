/**
 */
package fr.cea.nacre.model.NACREMM.cfa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Generator#getMinPowerGeneration <em>Min Power Generation</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Generator#getMaxPowerGeneration <em>Max Power Generation</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getGenerator()
 * @model
 * @generated
 */
public interface Generator extends Equipment {

	/**
	 * Returns the value of the '<em><b>Min Power Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Power Generation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Power Generation</em>' containment reference.
	 * @see #setMinPowerGeneration(PowerType)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getGenerator_MinPowerGeneration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PowerType getMinPowerGeneration();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.Generator#getMinPowerGeneration <em>Min Power Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Power Generation</em>' containment reference.
	 * @see #getMinPowerGeneration()
	 * @generated
	 */
	void setMinPowerGeneration(PowerType value);

	/**
	 * Returns the value of the '<em><b>Max Power Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Power Generation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Power Generation</em>' containment reference.
	 * @see #setMaxPowerGeneration(PowerType)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getGenerator_MaxPowerGeneration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PowerType getMaxPowerGeneration();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.Generator#getMaxPowerGeneration <em>Max Power Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Power Generation</em>' containment reference.
	 * @see #getMaxPowerGeneration()
	 * @generated
	 */
	void setMaxPowerGeneration(PowerType value);
} // Generator
