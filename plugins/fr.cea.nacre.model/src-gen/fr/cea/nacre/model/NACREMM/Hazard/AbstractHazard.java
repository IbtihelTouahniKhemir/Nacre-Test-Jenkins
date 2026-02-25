/**
 */
package fr.cea.nacre.model.NACREMM.Hazard;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.AbstractHazard#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.AbstractHazard#getJustification <em>Justification</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getAbstractHazard()
 * @model
 * @generated
 */
public interface AbstractHazard extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getAbstractHazard_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.Hazard.AbstractHazard#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justification</em>' attribute.
	 * @see #setJustification(String)
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getAbstractHazard_Justification()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getJustification();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.Hazard.AbstractHazard#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(String value);

} // AbstractHazard
