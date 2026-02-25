/**
 */
package nacre;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.Controller#getControlBehavior <em>Control Behavior</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getController()
 * @model abstract="true"
 * @generated
 */
public interface Controller extends EObject {
	/**
	 * Returns the value of the '<em><b>Control Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link nacre.ControlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Behavior</em>' attribute.
	 * @see nacre.ControlType
	 * @see #setControlBehavior(ControlType)
	 * @see nacre.NacrePackage#getController_ControlBehavior()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ControlType getControlBehavior();

	/**
	 * Sets the value of the '{@link nacre.Controller#getControlBehavior <em>Control Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Behavior</em>' attribute.
	 * @see nacre.ControlType
	 * @see #getControlBehavior()
	 * @generated
	 */
	void setControlBehavior(ControlType value);

} // Controller
