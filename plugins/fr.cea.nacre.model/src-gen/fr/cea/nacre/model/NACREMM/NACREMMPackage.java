/**
 */
package fr.cea.nacre.model.NACREMM;

import fr.cea.nacre.model.NACREMM.UID.UIDPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.cea.nacre.model.NACREMM.NACREMMFactory
 * @model kind="package"
 * @generated
 */
public interface NACREMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "NACREMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///NACREMM.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NACREMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NACREMMPackage eINSTANCE = fr.cea.nacre.model.NACREMM.impl.NACREMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.impl.RedundancyClusterImpl <em>Redundancy Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.impl.RedundancyClusterImpl
	 * @see fr.cea.nacre.model.NACREMM.impl.NACREMMPackageImpl#getRedundancyCluster()
	 * @generated
	 */
	int REDUNDANCY_CLUSTER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER__RUNTIME = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER__ACTIVE = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Passive</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER__PASSIVE = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hypervisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER__HYPERVISOR = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Redundancy Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Redundancy Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANCY_CLUSTER_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.RedundancyKind <em>Redundancy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.RedundancyKind
	 * @see fr.cea.nacre.model.NACREMM.impl.NACREMMPackageImpl#getRedundancyKind()
	 * @generated
	 */
	int REDUNDANCY_KIND = 1;


	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.RedundancyCluster <em>Redundancy Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redundancy Cluster</em>'.
	 * @see fr.cea.nacre.model.NACREMM.RedundancyCluster
	 * @generated
	 */
	EClass getRedundancyCluster();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.RedundancyCluster#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime</em>'.
	 * @see fr.cea.nacre.model.NACREMM.RedundancyCluster#getRuntime()
	 * @see #getRedundancyCluster()
	 * @generated
	 */
	EAttribute getRedundancyCluster_Runtime();

	/**
	 * Returns the meta object for the attribute list '{@link fr.cea.nacre.model.NACREMM.RedundancyCluster#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Active</em>'.
	 * @see fr.cea.nacre.model.NACREMM.RedundancyCluster#getActive()
	 * @see #getRedundancyCluster()
	 * @generated
	 */
	EAttribute getRedundancyCluster_Active();

	/**
	 * Returns the meta object for the attribute list '{@link fr.cea.nacre.model.NACREMM.RedundancyCluster#getPassive <em>Passive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Passive</em>'.
	 * @see fr.cea.nacre.model.NACREMM.RedundancyCluster#getPassive()
	 * @see #getRedundancyCluster()
	 * @generated
	 */
	EAttribute getRedundancyCluster_Passive();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.RedundancyCluster#getHypervisor <em>Hypervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hypervisor</em>'.
	 * @see fr.cea.nacre.model.NACREMM.RedundancyCluster#getHypervisor()
	 * @see #getRedundancyCluster()
	 * @generated
	 */
	EAttribute getRedundancyCluster_Hypervisor();

	/**
	 * Returns the meta object for enum '{@link fr.cea.nacre.model.NACREMM.RedundancyKind <em>Redundancy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Redundancy Kind</em>'.
	 * @see fr.cea.nacre.model.NACREMM.RedundancyKind
	 * @generated
	 */
	EEnum getRedundancyKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NACREMMFactory getNACREMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.impl.RedundancyClusterImpl <em>Redundancy Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.impl.RedundancyClusterImpl
		 * @see fr.cea.nacre.model.NACREMM.impl.NACREMMPackageImpl#getRedundancyCluster()
		 * @generated
		 */
		EClass REDUNDANCY_CLUSTER = eINSTANCE.getRedundancyCluster();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUNDANCY_CLUSTER__RUNTIME = eINSTANCE.getRedundancyCluster_Runtime();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUNDANCY_CLUSTER__ACTIVE = eINSTANCE.getRedundancyCluster_Active();

		/**
		 * The meta object literal for the '<em><b>Passive</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUNDANCY_CLUSTER__PASSIVE = eINSTANCE.getRedundancyCluster_Passive();

		/**
		 * The meta object literal for the '<em><b>Hypervisor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUNDANCY_CLUSTER__HYPERVISOR = eINSTANCE.getRedundancyCluster_Hypervisor();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.RedundancyKind <em>Redundancy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.RedundancyKind
		 * @see fr.cea.nacre.model.NACREMM.impl.NACREMMPackageImpl#getRedundancyKind()
		 * @generated
		 */
		EEnum REDUNDANCY_KIND = eINSTANCE.getRedundancyKind();

	}

} //NACREMMPackage
