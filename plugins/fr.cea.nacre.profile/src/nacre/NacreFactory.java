/**
 */
package nacre;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nacre.NacrePackage
 * @generated
 */
public interface NacreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NacreFactory eINSTANCE = nacre.impl.NacreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Controllers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controllers</em>'.
	 * @generated
	 */
	Controllers createControllers();

	/**
	 * Returns a new object of class '<em>Communication Medias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Medias</em>'.
	 * @generated
	 */
	CommunicationMedias createCommunicationMedias();

	/**
	 * Returns a new object of class '<em>Computing Resources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing Resources</em>'.
	 * @generated
	 */
	ComputingResources createComputingResources();

	/**
	 * Returns a new object of class '<em>Software Resources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Resources</em>'.
	 * @generated
	 */
	SoftwareResources createSoftwareResources();

	/**
	 * Returns a new object of class '<em>CFRA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CFRA</em>'.
	 * @generated
	 */
	CFRA createCFRA();

	/**
	 * Returns a new object of class '<em>CRA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CRA</em>'.
	 * @generated
	 */
	CRA createCRA();

	/**
	 * Returns a new object of class '<em>Main Grid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Grid</em>'.
	 * @generated
	 */
	MainGrid createMainGrid();

	/**
	 * Returns a new object of class '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone</em>'.
	 * @generated
	 */
	Zone createZone();

	/**
	 * Returns a new object of class '<em>Substation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substation</em>'.
	 * @generated
	 */
	Substation createSubstation();

	/**
	 * Returns a new object of class '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus</em>'.
	 * @generated
	 */
	Bus createBus();

	/**
	 * Returns a new object of class '<em>NFP Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP Power</em>'.
	 * @generated
	 */
	NFP_Power createNFP_Power();

	/**
	 * Returns a new object of class '<em>Local Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Controller</em>'.
	 * @generated
	 */
	LocalController createLocalController();

	/**
	 * Returns a new object of class '<em>Zonal Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zonal Controller</em>'.
	 * @generated
	 */
	ZonalController createZonalController();

	/**
	 * Returns a new object of class '<em>Central Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Central Controller</em>'.
	 * @generated
	 */
	CentralController createCentralController();

	/**
	 * Returns a new object of class '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator</em>'.
	 * @generated
	 */
	Generator createGenerator();

	/**
	 * Returns a new object of class '<em>NFP Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP Voltage</em>'.
	 * @generated
	 */
	NFP_Voltage createNFP_Voltage();

	/**
	 * Returns a new object of class '<em>NFP Energy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP Energy</em>'.
	 * @generated
	 */
	NFP_Energy createNFP_Energy();

	/**
	 * Returns a new object of class '<em>RTE Installation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTE Installation</em>'.
	 * @generated
	 */
	RTE_Installation createRTE_Installation();

	/**
	 * Returns a new object of class '<em>NFP IST</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP IST</em>'.
	 * @generated
	 */
	NFP_IST createNFP_IST();

	/**
	 * Returns a new object of class '<em>Battery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery</em>'.
	 * @generated
	 */
	Battery createBattery();

	/**
	 * Returns a new object of class '<em>NFP VAR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP VAR</em>'.
	 * @generated
	 */
	NFP_VAR createNFP_VAR();

	/**
	 * Returns a new object of class '<em>Connect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connect</em>'.
	 * @generated
	 */
	Connect createConnect();

	/**
	 * Returns a new object of class '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control</em>'.
	 * @generated
	 */
	Control createControl();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>CFA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CFA</em>'.
	 * @generated
	 */
	CFA createCFA();

	/**
	 * Returns a new object of class '<em>CRAS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CRAS</em>'.
	 * @generated
	 */
	CRAS createCRAS();

	/**
	 * Returns a new object of class '<em>CFRAS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CFRAS</em>'.
	 * @generated
	 */
	CFRAS createCFRAS();

	/**
	 * Returns a new object of class '<em>Redundancy Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redundancy Cluster</em>'.
	 * @generated
	 */
	RedundancyCluster createRedundancyCluster();

	/**
	 * Returns a new object of class '<em>Load</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load</em>'.
	 * @generated
	 */
	Load createLoad();

	/**
	 * Returns a new object of class '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
	Line createLine();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NacrePackage getNacrePackage();

} //NacreFactory
