/**
 */
package fr.cea.nacre.model.NACREMM.cra;

import fr.cea.nacre.model.NACREMM.UID.UIDPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see fr.cea.nacre.model.NACREMM.cra.CraFactory
 * @model kind="package"
 * @generated
 */
public interface CraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///NACREMM/cra.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NACREMM.cra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CraPackage eINSTANCE = fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cra.impl.CraImpl <em>Cra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cra.impl.CraImpl
	 * @see fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl#getCra()
	 * @generated
	 */
	int CRA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Communication Medias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA__COMMUNICATION_MEDIAS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Computing Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA__COMPUTING_RESOURCES = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Software Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA__SOFTWARE_RESOURCES = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Redundancy Clusters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA__REDUNDANCY_CLUSTERS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Cra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cra.impl.CommunicationMediaImpl <em>Communication Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cra.impl.CommunicationMediaImpl
	 * @see fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl#getCommunicationMedia()
	 * @generated
	 */
	int COMMUNICATION_MEDIA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__LATENCY = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__CAPACITY = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication Medias</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA__COMMUNICATION_MEDIAS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Communication Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Communication Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIA_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cra.impl.ComputingResourceImpl <em>Computing Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cra.impl.ComputingResourceImpl
	 * @see fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl#getComputingResource()
	 * @generated
	 */
	int COMPUTING_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Communication Medias</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE__COMMUNICATION_MEDIAS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Computing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RESOURCE_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cra.impl.SoftwareResourceImpl <em>Software Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cra.impl.SoftwareResourceImpl
	 * @see fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl#getSoftwareResource()
	 * @generated
	 */
	int SOFTWARE_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Computing Resources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__COMPUTING_RESOURCES = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__PERIOD = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE__EXECUTION_TIME = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Software Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Software Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_RESOURCE_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cra.impl.RedundancyClusterImpl <em>Redundancy Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cra.impl.RedundancyClusterImpl
	 * @see fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl#getRedundancyCluster()
	 * @generated
	 */
	int REDUNDANCY_CLUSTER = 4;

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
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cra.RedundancyKind <em>Redundancy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cra.RedundancyKind
	 * @see fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl#getRedundancyKind()
	 * @generated
	 */
	int REDUNDANCY_KIND = 5;


	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cra.Cra <em>Cra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cra</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.Cra
	 * @generated
	 */
	EClass getCra();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.cra.Cra#getCommunicationMedias <em>Communication Medias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Medias</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.Cra#getCommunicationMedias()
	 * @see #getCra()
	 * @generated
	 */
	EReference getCra_CommunicationMedias();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.cra.Cra#getComputingResources <em>Computing Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computing Resources</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.Cra#getComputingResources()
	 * @see #getCra()
	 * @generated
	 */
	EReference getCra_ComputingResources();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.cra.Cra#getSoftwareResources <em>Software Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Software Resources</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.Cra#getSoftwareResources()
	 * @see #getCra()
	 * @generated
	 */
	EReference getCra_SoftwareResources();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.cra.Cra#getRedundancyClusters <em>Redundancy Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Redundancy Clusters</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.Cra#getRedundancyClusters()
	 * @see #getCra()
	 * @generated
	 */
	EReference getCra_RedundancyClusters();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cra.CommunicationMedia <em>Communication Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Media</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.CommunicationMedia
	 * @generated
	 */
	EClass getCommunicationMedia();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cra.CommunicationMedia#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.CommunicationMedia#getLatency()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EReference getCommunicationMedia_Latency();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cra.CommunicationMedia#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capacity</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.CommunicationMedia#getCapacity()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EReference getCommunicationMedia_Capacity();

	/**
	 * Returns the meta object for the attribute list '{@link fr.cea.nacre.model.NACREMM.cra.CommunicationMedia#getCommunicationMedias <em>Communication Medias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Communication Medias</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.CommunicationMedia#getCommunicationMedias()
	 * @see #getCommunicationMedia()
	 * @generated
	 */
	EAttribute getCommunicationMedia_CommunicationMedias();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cra.ComputingResource <em>Computing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Resource</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.ComputingResource
	 * @generated
	 */
	EClass getComputingResource();

	/**
	 * Returns the meta object for the attribute list '{@link fr.cea.nacre.model.NACREMM.cra.ComputingResource#getCommunicationMedias <em>Communication Medias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Communication Medias</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.ComputingResource#getCommunicationMedias()
	 * @see #getComputingResource()
	 * @generated
	 */
	EAttribute getComputingResource_CommunicationMedias();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cra.SoftwareResource <em>Software Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Resource</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.SoftwareResource
	 * @generated
	 */
	EClass getSoftwareResource();

	/**
	 * Returns the meta object for the attribute list '{@link fr.cea.nacre.model.NACREMM.cra.SoftwareResource#getComputingResources <em>Computing Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Computing Resources</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.SoftwareResource#getComputingResources()
	 * @see #getSoftwareResource()
	 * @generated
	 */
	EAttribute getSoftwareResource_ComputingResources();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cra.SoftwareResource#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.SoftwareResource#getPeriod()
	 * @see #getSoftwareResource()
	 * @generated
	 */
	EReference getSoftwareResource_Period();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.cra.SoftwareResource#getExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Time</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.SoftwareResource#getExecutionTime()
	 * @see #getSoftwareResource()
	 * @generated
	 */
	EReference getSoftwareResource_ExecutionTime();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cra.RedundancyCluster <em>Redundancy Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redundancy Cluster</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.RedundancyCluster
	 * @generated
	 */
	EClass getRedundancyCluster();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cra.RedundancyCluster#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.RedundancyCluster#getRuntime()
	 * @see #getRedundancyCluster()
	 * @generated
	 */
	EAttribute getRedundancyCluster_Runtime();

	/**
	 * Returns the meta object for the attribute list '{@link fr.cea.nacre.model.NACREMM.cra.RedundancyCluster#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Active</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.RedundancyCluster#getActive()
	 * @see #getRedundancyCluster()
	 * @generated
	 */
	EAttribute getRedundancyCluster_Active();

	/**
	 * Returns the meta object for the attribute list '{@link fr.cea.nacre.model.NACREMM.cra.RedundancyCluster#getPassive <em>Passive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Passive</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.RedundancyCluster#getPassive()
	 * @see #getRedundancyCluster()
	 * @generated
	 */
	EAttribute getRedundancyCluster_Passive();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cra.RedundancyCluster#getHypervisor <em>Hypervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hypervisor</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.RedundancyCluster#getHypervisor()
	 * @see #getRedundancyCluster()
	 * @generated
	 */
	EAttribute getRedundancyCluster_Hypervisor();

	/**
	 * Returns the meta object for enum '{@link fr.cea.nacre.model.NACREMM.cra.RedundancyKind <em>Redundancy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Redundancy Kind</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cra.RedundancyKind
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
	CraFactory getCraFactory();

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
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cra.impl.CraImpl <em>Cra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cra.impl.CraImpl
		 * @see fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl#getCra()
		 * @generated
		 */
		EClass CRA = eINSTANCE.getCra();

		/**
		 * The meta object literal for the '<em><b>Communication Medias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRA__COMMUNICATION_MEDIAS = eINSTANCE.getCra_CommunicationMedias();

		/**
		 * The meta object literal for the '<em><b>Computing Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRA__COMPUTING_RESOURCES = eINSTANCE.getCra_ComputingResources();

		/**
		 * The meta object literal for the '<em><b>Software Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRA__SOFTWARE_RESOURCES = eINSTANCE.getCra_SoftwareResources();

		/**
		 * The meta object literal for the '<em><b>Redundancy Clusters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRA__REDUNDANCY_CLUSTERS = eINSTANCE.getCra_RedundancyClusters();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cra.impl.CommunicationMediaImpl <em>Communication Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cra.impl.CommunicationMediaImpl
		 * @see fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl#getCommunicationMedia()
		 * @generated
		 */
		EClass COMMUNICATION_MEDIA = eINSTANCE.getCommunicationMedia();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA__LATENCY = eINSTANCE.getCommunicationMedia_Latency();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEDIA__CAPACITY = eINSTANCE.getCommunicationMedia_Capacity();

		/**
		 * The meta object literal for the '<em><b>Communication Medias</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_MEDIA__COMMUNICATION_MEDIAS = eINSTANCE.getCommunicationMedia_CommunicationMedias();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cra.impl.ComputingResourceImpl <em>Computing Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cra.impl.ComputingResourceImpl
		 * @see fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl#getComputingResource()
		 * @generated
		 */
		EClass COMPUTING_RESOURCE = eINSTANCE.getComputingResource();

		/**
		 * The meta object literal for the '<em><b>Communication Medias</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_RESOURCE__COMMUNICATION_MEDIAS = eINSTANCE.getComputingResource_CommunicationMedias();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cra.impl.SoftwareResourceImpl <em>Software Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cra.impl.SoftwareResourceImpl
		 * @see fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl#getSoftwareResource()
		 * @generated
		 */
		EClass SOFTWARE_RESOURCE = eINSTANCE.getSoftwareResource();

		/**
		 * The meta object literal for the '<em><b>Computing Resources</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_RESOURCE__COMPUTING_RESOURCES = eINSTANCE.getSoftwareResource_ComputingResources();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_RESOURCE__PERIOD = eINSTANCE.getSoftwareResource_Period();

		/**
		 * The meta object literal for the '<em><b>Execution Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_RESOURCE__EXECUTION_TIME = eINSTANCE.getSoftwareResource_ExecutionTime();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cra.impl.RedundancyClusterImpl <em>Redundancy Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cra.impl.RedundancyClusterImpl
		 * @see fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl#getRedundancyCluster()
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
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cra.RedundancyKind <em>Redundancy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cra.RedundancyKind
		 * @see fr.cea.nacre.model.NACREMM.cra.impl.CraPackageImpl#getRedundancyKind()
		 * @generated
		 */
		EEnum REDUNDANCY_KIND = eINSTANCE.getRedundancyKind();

	}

} //CraPackage
