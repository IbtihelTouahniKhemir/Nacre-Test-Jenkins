/**
 */
package fr.cea.nacre.model.NACREMM.cfa;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Substation#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getSubstation()
 * @model
 * @generated
 */
public interface Substation extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Bus</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cfa.Bus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getSubstation_Bus()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Bus> getBus();

} // Substation
