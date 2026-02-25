/**
 */
package fr.cea.nacre.model.NACREMM.cra;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.ComputingResource#getCommunicationMedias <em>Communication Medias</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getComputingResource()
 * @model
 * @generated
 */
public interface ComputingResource extends UIDElement {
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
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getComputingResource_CommunicationMedias()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getCommunicationMedias();

} // ComputingResource
