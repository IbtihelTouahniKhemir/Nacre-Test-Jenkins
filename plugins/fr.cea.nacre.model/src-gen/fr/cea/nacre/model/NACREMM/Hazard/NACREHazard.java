/**
 */
package fr.cea.nacre.model.NACREMM.Hazard;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NACRE Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.NACREHazard#getCraHazards <em>Cra Hazards</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.NACREHazard#getCfaHazards <em>Cfa Hazards</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getNACREHazard()
 * @model
 * @generated
 */
public interface NACREHazard extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Cra Hazards</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.Hazard.CraHazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cra Hazards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cra Hazards</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getNACREHazard_CraHazards()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CraHazard> getCraHazards();

	/**
	 * Returns the value of the '<em><b>Cfa Hazards</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.Hazard.CfaHazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfa Hazards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfa Hazards</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getNACREHazard_CfaHazards()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CfaHazard> getCfaHazards();

} // NACREHazard
