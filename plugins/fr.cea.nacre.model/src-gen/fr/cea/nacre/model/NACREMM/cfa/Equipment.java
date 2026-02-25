/**
 */
package fr.cea.nacre.model.NACREMM.cfa;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Equipment#isConnected <em>Connected</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Equipment#getLocalController <em>Local Controller</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Equipment#isActivable <em>Activable</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getEquipment()
 * @model
 * @generated
 */
public interface Equipment extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #setConnected(boolean)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getEquipment_Connected()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isConnected();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.Equipment#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isConnected()
	 * @generated
	 */
	void setConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Local Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Controller</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Controller</em>' containment reference.
	 * @see #setLocalController(Controller)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getEquipment_LocalController()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Controller getLocalController();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.Equipment#getLocalController <em>Local Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Controller</em>' containment reference.
	 * @see #getLocalController()
	 * @generated
	 */
	void setLocalController(Controller value);

	/**
	 * Returns the value of the '<em><b>Activable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activable</em>' attribute.
	 * @see #setActivable(boolean)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getEquipment_Activable()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isActivable();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.Equipment#isActivable <em>Activable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activable</em>' attribute.
	 * @see #isActivable()
	 * @generated
	 */
	void setActivable(boolean value);

} // Equipment
