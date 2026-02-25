/**
 */
package fr.cea.nacre.model.NACREMM.cfa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Battery#getMaxPowerInjection <em>Max Power Injection</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Battery#getMinPowerInjection <em>Min Power Injection</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getBattery()
 * @model
 * @generated
 */
public interface Battery extends Equipment {

	/**
	 * Returns the value of the '<em><b>Max Power Injection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Power Injection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Power Injection</em>' containment reference.
	 * @see #setMaxPowerInjection(PowerType)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getBattery_MaxPowerInjection()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PowerType getMaxPowerInjection();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.Battery#getMaxPowerInjection <em>Max Power Injection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Power Injection</em>' containment reference.
	 * @see #getMaxPowerInjection()
	 * @generated
	 */
	void setMaxPowerInjection(PowerType value);

	/**
	 * Returns the value of the '<em><b>Min Power Injection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Power Injection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Power Injection</em>' containment reference.
	 * @see #setMinPowerInjection(PowerType)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getBattery_MinPowerInjection()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PowerType getMinPowerInjection();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.Battery#getMinPowerInjection <em>Min Power Injection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Power Injection</em>' containment reference.
	 * @see #getMinPowerInjection()
	 * @generated
	 */
	void setMinPowerInjection(PowerType value);
} // Battery
