/**
 */
package fr.cea.nacre.model.NACREMM.cra;

import fr.cea.nacre.model.NACREMM.CommonType.CommonType;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.CommunicationMedia#getLatency <em>Latency</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.CommunicationMedia#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.CommunicationMedia#getCommunicationMedias <em>Communication Medias</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getCommunicationMedia()
 * @model
 * @generated
 */
public interface CommunicationMedia extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' containment reference.
	 * @see #setLatency(CommonType)
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getCommunicationMedia_Latency()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CommonType getLatency();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cra.CommunicationMedia#getLatency <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' containment reference.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(CommonType value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' containment reference.
	 * @see #setCapacity(CommonType)
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getCommunicationMedia_Capacity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CommonType getCapacity();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cra.CommunicationMedia#getCapacity <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' containment reference.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(CommonType value);

	/**
	 * Returns the value of the '<em><b>Communication Medias</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Medias</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Medias</em>' attribute list.
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getCommunicationMedia_CommunicationMedias()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getCommunicationMedias();

} // CommunicationMedia
