/**
 */
package fr.cea.nacre.model.NACREMM.Hazard;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cra Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.CraHazard#getCra <em>Cra</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.CraHazard#getCommunicationHazards <em>Communication Hazards</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getCraHazard()
 * @model
 * @generated
 */
public interface CraHazard extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Cra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cra</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cra</em>' attribute.
	 * @see #setCra(String)
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getCraHazard_Cra()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCra();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.Hazard.CraHazard#getCra <em>Cra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cra</em>' attribute.
	 * @see #getCra()
	 * @generated
	 */
	void setCra(String value);

	/**
	 * Returns the value of the '<em><b>Communication Hazards</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Hazards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Hazards</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getCraHazard_CommunicationHazards()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CommunicationHazard> getCommunicationHazards();

} // CraHazard
