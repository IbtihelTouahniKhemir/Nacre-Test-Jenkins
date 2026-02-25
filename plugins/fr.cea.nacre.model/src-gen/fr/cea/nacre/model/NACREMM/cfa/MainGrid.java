/**
 */
package fr.cea.nacre.model.NACREMM.cfa;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.MainGrid#getZones <em>Zones</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.MainGrid#getSubstations <em>Substations</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.MainGrid#getCentralController <em>Central Controller</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.MainGrid#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getMainGrid()
 * @model
 * @generated
 */
public interface MainGrid extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Zones</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cfa.Zone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zones</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getMainGrid_Zones()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Zone> getZones();

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
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getMainGrid_Substations()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Substation> getSubstations();

	/**
	 * Returns the value of the '<em><b>Central Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Central Controller</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Central Controller</em>' containment reference.
	 * @see #setCentralController(Controller)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getMainGrid_CentralController()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Controller getCentralController();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.MainGrid#getCentralController <em>Central Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Central Controller</em>' containment reference.
	 * @see #getCentralController()
	 * @generated
	 */
	void setCentralController(Controller value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cfa.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getMainGrid_Lines()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Line> getLines();

} // MainGrid
