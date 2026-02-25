/**
 */
package nacre;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.Generator#getV <em>V</em>}</li>
 *   <li>{@link nacre.Generator#getMaxPowerGeneration <em>Max Power Generation</em>}</li>
 *   <li>{@link nacre.Generator#getProducedEnergy <em>Produced Energy</em>}</li>
 *   <li>{@link nacre.Generator#getMinPowerGeneration <em>Min Power Generation</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getGenerator()
 * @model
 * @generated
 */
public interface Generator extends Equipement {
	/**
	 * Returns the value of the '<em><b>V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V</em>' containment reference.
	 * @see #setV(NFP_Voltage)
	 * @see nacre.NacrePackage#getGenerator_V()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NFP_Voltage getV();

	/**
	 * Sets the value of the '{@link nacre.Generator#getV <em>V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V</em>' containment reference.
	 * @see #getV()
	 * @generated
	 */
	void setV(NFP_Voltage value);

	/**
	 * Returns the value of the '<em><b>Max Power Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Power Generation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Power Generation</em>' containment reference.
	 * @see #setMaxPowerGeneration(NFP_Power)
	 * @see nacre.NacrePackage#getGenerator_MaxPowerGeneration()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NFP_Power getMaxPowerGeneration();

	/**
	 * Sets the value of the '{@link nacre.Generator#getMaxPowerGeneration <em>Max Power Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Power Generation</em>' containment reference.
	 * @see #getMaxPowerGeneration()
	 * @generated
	 */
	void setMaxPowerGeneration(NFP_Power value);

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
	 * @see nacre.NacrePackage#getGenerator_ProducedEnergy()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NFP_Energy getProducedEnergy();

	/**
	 * Sets the value of the '{@link nacre.Generator#getProducedEnergy <em>Produced Energy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produced Energy</em>' containment reference.
	 * @see #getProducedEnergy()
	 * @generated
	 */
	void setProducedEnergy(NFP_Energy value);

	/**
	 * Returns the value of the '<em><b>Min Power Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Power Generation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Power Generation</em>' containment reference.
	 * @see #setMinPowerGeneration(NFP_Power)
	 * @see nacre.NacrePackage#getGenerator_MinPowerGeneration()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NFP_Power getMinPowerGeneration();

	/**
	 * Sets the value of the '{@link nacre.Generator#getMinPowerGeneration <em>Min Power Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Power Generation</em>' containment reference.
	 * @see #getMinPowerGeneration()
	 * @generated
	 */
	void setMinPowerGeneration(NFP_Power value);

} // Generator
