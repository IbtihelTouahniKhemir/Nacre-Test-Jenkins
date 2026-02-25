/**
 */
package fr.cea.nacre.model.NACREMM.cfa;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Controller#getControlBehavior <em>Control Behavior</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Control Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Behavior</em>' attribute.
	 * @see #setControlBehavior(String)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getController_ControlBehavior()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getControlBehavior();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.Controller#getControlBehavior <em>Control Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Behavior</em>' attribute.
	 * @see #getControlBehavior()
	 * @generated
	 */
	void setControlBehavior(String value);

} // Controller
