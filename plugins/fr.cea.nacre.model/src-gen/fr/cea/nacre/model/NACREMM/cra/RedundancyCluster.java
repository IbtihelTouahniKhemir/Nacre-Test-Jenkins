/**
 */
package fr.cea.nacre.model.NACREMM.cra;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redundancy Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.RedundancyCluster#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.RedundancyCluster#getActive <em>Active</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.RedundancyCluster#getPassive <em>Passive</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.RedundancyCluster#getHypervisor <em>Hypervisor</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getRedundancyCluster()
 * @model
 * @generated
 */
public interface RedundancyCluster extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.cea.nacre.model.NACREMM.cra.RedundancyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see fr.cea.nacre.model.NACREMM.cra.RedundancyKind
	 * @see #setRuntime(RedundancyKind)
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getRedundancyCluster_Runtime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RedundancyKind getRuntime();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cra.RedundancyCluster#getRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' attribute.
	 * @see fr.cea.nacre.model.NACREMM.cra.RedundancyKind
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(RedundancyKind value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute list.
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getRedundancyCluster_Active()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getActive();

	/**
	 * Returns the value of the '<em><b>Passive</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passive</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passive</em>' attribute list.
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getRedundancyCluster_Passive()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getPassive();

	/**
	 * Returns the value of the '<em><b>Hypervisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypervisor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypervisor</em>' attribute.
	 * @see #setHypervisor(String)
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getRedundancyCluster_Hypervisor()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getHypervisor();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cra.RedundancyCluster#getHypervisor <em>Hypervisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hypervisor</em>' attribute.
	 * @see #getHypervisor()
	 * @generated
	 */
	void setHypervisor(String value);

} // RedundancyCluster
