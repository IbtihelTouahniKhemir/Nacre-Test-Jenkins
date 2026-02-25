/**
 */
package fr.cea.nacre.model.NACREMM.study;

import fr.cea.nacre.model.NACREMM.Hazard.NACREHazard;
import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import fr.cea.nacre.model.NACREMM.cfa.Cfa;

import fr.cea.nacre.model.NACREMM.cfra.Cfra;

import fr.cea.nacre.model.NACREMM.cra.Cra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.study.Study#getCfa <em>Cfa</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.study.Study#getCras <em>Cras</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.study.Study#getCfras <em>Cfras</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.study.Study#getHazards <em>Hazards</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.study.StudyPackage#getStudy()
 * @model
 * @generated
 */
public interface Study extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Cfa</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfa</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfa</em>' containment reference.
	 * @see #setCfa(Cfa)
	 * @see fr.cea.nacre.model.NACREMM.study.StudyPackage#getStudy_Cfa()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Cfa getCfa();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.study.Study#getCfa <em>Cfa</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfa</em>' containment reference.
	 * @see #getCfa()
	 * @generated
	 */
	void setCfa(Cfa value);

	/**
	 * Returns the value of the '<em><b>Cras</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cra.Cra}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cras</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cras</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.study.StudyPackage#getStudy_Cras()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Cra> getCras();

	/**
	 * Returns the value of the '<em><b>Cfras</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cfra.Cfra}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfras</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfras</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.study.StudyPackage#getStudy_Cfras()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Cfra> getCfras();

	/**
	 * Returns the value of the '<em><b>Hazards</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazards</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazards</em>' containment reference.
	 * @see #setHazards(NACREHazard)
	 * @see fr.cea.nacre.model.NACREMM.study.StudyPackage#getStudy_Hazards()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NACREHazard getHazards();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.study.Study#getHazards <em>Hazards</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazards</em>' containment reference.
	 * @see #getHazards()
	 * @generated
	 */
	void setHazards(NACREHazard value);

} // Study
