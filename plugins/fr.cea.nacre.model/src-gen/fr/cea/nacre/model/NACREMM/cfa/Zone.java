/**
 */
package fr.cea.nacre.model.NACREMM.cfa;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Zone#getSubstations <em>Substations</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Zone#getZonalController <em>Zonal Controller</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getZone()
 * @model
 * @generated
 */
public interface Zone extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Substations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cfa.Substation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substations</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getZone_Substations()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Substation> getSubstations();

	/**
	 * Returns the value of the '<em><b>Zonal Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zonal Controller</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zonal Controller</em>' containment reference.
	 * @see #setZonalController(Controller)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getZone_ZonalController()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Controller getZonalController();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.Zone#getZonalController <em>Zonal Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zonal Controller</em>' containment reference.
	 * @see #getZonalController()
	 * @generated
	 */
	void setZonalController(Controller value);

} // Zone
