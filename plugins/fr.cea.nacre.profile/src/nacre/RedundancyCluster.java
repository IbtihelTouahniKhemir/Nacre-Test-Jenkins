/**
 */
package nacre;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redundancy Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.RedundancyCluster#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link nacre.RedundancyCluster#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link nacre.RedundancyCluster#getActive <em>Active</em>}</li>
 *   <li>{@link nacre.RedundancyCluster#getPassive <em>Passive</em>}</li>
 *   <li>{@link nacre.RedundancyCluster#getHypervisor <em>Hypervisor</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getRedundancyCluster()
 * @model
 * @generated
 */
public interface RedundancyCluster extends EObject {
	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * The default value is <code>"active_standby"</code>.
	 * The literals are from the enumeration {@link nacre.RedundancyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see nacre.RedundancyKind
	 * @see #setRuntime(RedundancyKind)
	 * @see nacre.NacrePackage#getRedundancyCluster_Runtime()
	 * @model default="active_standby" required="true" ordered="false"
	 * @generated
	 */
	RedundancyKind getRuntime();

	/**
	 * Sets the value of the '{@link nacre.RedundancyCluster#getRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' attribute.
	 * @see nacre.RedundancyKind
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(RedundancyKind value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see nacre.NacrePackage#getRedundancyCluster_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link nacre.RedundancyCluster#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' reference list.
	 * @see nacre.NacrePackage#getRedundancyCluster_Active()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<SwSchedulableResource> getActive();

	/**
	 * Returns the value of the '<em><b>Passive</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passive</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passive</em>' reference list.
	 * @see nacre.NacrePackage#getRedundancyCluster_Passive()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SwSchedulableResource> getPassive();

	/**
	 * Returns the value of the '<em><b>Hypervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypervisor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypervisor</em>' reference.
	 * @see #setHypervisor(SwSchedulableResource)
	 * @see nacre.NacrePackage#getRedundancyCluster_Hypervisor()
	 * @model ordered="false"
	 * @generated
	 */
	SwSchedulableResource getHypervisor();

	/**
	 * Sets the value of the '{@link nacre.RedundancyCluster#getHypervisor <em>Hypervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hypervisor</em>' reference.
	 * @see #getHypervisor()
	 * @generated
	 */
	void setHypervisor(SwSchedulableResource value);

} // RedundancyCluster
