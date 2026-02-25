/**
 */
package fr.cea.nacre.model.NACREMM.cra;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.Cra#getCommunicationMedias <em>Communication Medias</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.Cra#getComputingResources <em>Computing Resources</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.Cra#getSoftwareResources <em>Software Resources</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.Cra#getRedundancyClusters <em>Redundancy Clusters</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getCra()
 * @model
 * @generated
 */
public interface Cra extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Communication Medias</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cra.CommunicationMedia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Medias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Medias</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getCra_CommunicationMedias()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CommunicationMedia> getCommunicationMedias();

	/**
	 * Returns the value of the '<em><b>Computing Resources</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cra.ComputingResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computing Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computing Resources</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getCra_ComputingResources()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ComputingResource> getComputingResources();

	/**
	 * Returns the value of the '<em><b>Software Resources</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cra.SoftwareResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Resources</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getCra_SoftwareResources()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SoftwareResource> getSoftwareResources();

	/**
	 * Returns the value of the '<em><b>Redundancy Clusters</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cra.RedundancyCluster}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redundancy Clusters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redundancy Clusters</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getCra_RedundancyClusters()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RedundancyCluster> getRedundancyClusters();

} // Cra
