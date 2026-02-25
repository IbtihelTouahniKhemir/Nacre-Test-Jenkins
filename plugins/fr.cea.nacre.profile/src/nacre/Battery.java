/**
 */
package nacre;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.Battery#getMaxPowerInjection <em>Max Power Injection</em>}</li>
 *   <li>{@link nacre.Battery#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link nacre.Battery#getProducedEnergy <em>Produced Energy</em>}</li>
 *   <li>{@link nacre.Battery#getConsumedEnergy <em>Consumed Energy</em>}</li>
 *   <li>{@link nacre.Battery#getMinPowerInjection <em>Min Power Injection</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getBattery()
 * @model
 * @generated
 */
public interface Battery extends Equipement {
	/**
	 * Returns the value of the '<em><b>Max Power Injection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Power Injection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Power Injection</em>' containment reference.
	 * @see #setMaxPowerInjection(NFP_Power)
	 * @see nacre.NacrePackage#getBattery_MaxPowerInjection()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NFP_Power getMaxPowerInjection();

	/**
	 * Sets the value of the '{@link nacre.Battery#getMaxPowerInjection <em>Max Power Injection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Power Injection</em>' containment reference.
	 * @see #getMaxPowerInjection()
	 * @generated
	 */
	void setMaxPowerInjection(NFP_Power value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' containment reference.
	 * @see #setCapacity(NFP_Energy)
	 * @see nacre.NacrePackage#getBattery_Capacity()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NFP_Energy getCapacity();

	/**
	 * Sets the value of the '{@link nacre.Battery#getCapacity <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' containment reference.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(NFP_Energy value);

	/**
	 * Returns the value of the '<em><b>Produced Energy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced Energy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced Energy</em>' containment reference.
	 * @see #setProducedEnergy(NFP_Energy)
	 * @see nacre.NacrePackage#getBattery_ProducedEnergy()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NFP_Energy getProducedEnergy();

	/**
	 * Sets the value of the '{@link nacre.Battery#getProducedEnergy <em>Produced Energy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produced Energy</em>' containment reference.
	 * @see #getProducedEnergy()
	 * @generated
	 */
	void setProducedEnergy(NFP_Energy value);

	/**
	 * Returns the value of the '<em><b>Consumed Energy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumed Energy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed Energy</em>' containment reference.
	 * @see #setConsumedEnergy(NFP_Energy)
	 * @see nacre.NacrePackage#getBattery_ConsumedEnergy()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NFP_Energy getConsumedEnergy();

	/**
	 * Sets the value of the '{@link nacre.Battery#getConsumedEnergy <em>Consumed Energy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumed Energy</em>' containment reference.
	 * @see #getConsumedEnergy()
	 * @generated
	 */
	void setConsumedEnergy(NFP_Energy value);

	/**
	 * Returns the value of the '<em><b>Min Power Injection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Power Injection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Power Injection</em>' containment reference.
	 * @see #setMinPowerInjection(NFP_Power)
	 * @see nacre.NacrePackage#getBattery_MinPowerInjection()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NFP_Power getMinPowerInjection();

	/**
	 * Sets the value of the '{@link nacre.Battery#getMinPowerInjection <em>Min Power Injection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Power Injection</em>' containment reference.
	 * @see #getMinPowerInjection()
	 * @generated
	 */
	void setMinPowerInjection(NFP_Power value);

} // Battery
