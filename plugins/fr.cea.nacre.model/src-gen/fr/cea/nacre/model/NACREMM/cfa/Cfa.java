/**
 */
package fr.cea.nacre.model.NACREMM.cfa;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cfa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Cfa#getMaingrid <em>Maingrid</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getCfa()
 * @model
 * @generated
 */
public interface Cfa extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Maingrid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maingrid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maingrid</em>' containment reference.
	 * @see #setMaingrid(MainGrid)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getCfa_Maingrid()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MainGrid getMaingrid();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.Cfa#getMaingrid <em>Maingrid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maingrid</em>' containment reference.
	 * @see #getMaingrid()
	 * @generated
	 */
	void setMaingrid(MainGrid value);

} // Cfa
