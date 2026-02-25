/**
 */
package nacre.util;

import nacre.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nacre.NacrePackage
 * @generated
 */
public class NacreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NacrePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NacreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NacrePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NacreSwitch<Adapter> modelSwitch =
		new NacreSwitch<Adapter>() {
			@Override
			public Adapter caseControllers(Controllers object) {
				return createControllersAdapter();
			}
			@Override
			public Adapter caseCommunicationMedias(CommunicationMedias object) {
				return createCommunicationMediasAdapter();
			}
			@Override
			public Adapter caseComputingResources(ComputingResources object) {
				return createComputingResourcesAdapter();
			}
			@Override
			public Adapter caseSoftwareResources(SoftwareResources object) {
				return createSoftwareResourcesAdapter();
			}
			@Override
			public Adapter caseCFRA(CFRA object) {
				return createCFRAAdapter();
			}
			@Override
			public Adapter caseCRA(CRA object) {
				return createCRAAdapter();
			}
			@Override
			public Adapter caseMainGrid(MainGrid object) {
				return createMainGridAdapter();
			}
			@Override
			public Adapter caseZone(Zone object) {
				return createZoneAdapter();
			}
			@Override
			public Adapter caseSubstation(Substation object) {
				return createSubstationAdapter();
			}
			@Override
			public Adapter caseBus(Bus object) {
				return createBusAdapter();
			}
			@Override
			public Adapter caseEquipement(Equipement object) {
				return createEquipementAdapter();
			}
			@Override
			public Adapter caseNFP_Power(NFP_Power object) {
				return createNFP_PowerAdapter();
			}
			@Override
			public Adapter caseLocalController(LocalController object) {
				return createLocalControllerAdapter();
			}
			@Override
			public Adapter caseController(Controller object) {
				return createControllerAdapter();
			}
			@Override
			public Adapter caseZonalController(ZonalController object) {
				return createZonalControllerAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter caseCentralController(CentralController object) {
				return createCentralControllerAdapter();
			}
			@Override
			public Adapter caseGenerator(Generator object) {
				return createGeneratorAdapter();
			}
			@Override
			public Adapter caseNFP_Voltage(NFP_Voltage object) {
				return createNFP_VoltageAdapter();
			}
			@Override
			public Adapter caseNFP_Energy(NFP_Energy object) {
				return createNFP_EnergyAdapter();
			}
			@Override
			public Adapter caseRTE_Installation(RTE_Installation object) {
				return createRTE_InstallationAdapter();
			}
			@Override
			public Adapter caseNFP_IST(NFP_IST object) {
				return createNFP_ISTAdapter();
			}
			@Override
			public Adapter caseBattery(Battery object) {
				return createBatteryAdapter();
			}
			@Override
			public Adapter caseNFP_VAR(NFP_VAR object) {
				return createNFP_VARAdapter();
			}
			@Override
			public Adapter caseConnect(Connect object) {
				return createConnectAdapter();
			}
			@Override
			public Adapter caseControl(Control object) {
				return createControlAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseCFA(CFA object) {
				return createCFAAdapter();
			}
			@Override
			public Adapter caseCRAS(CRAS object) {
				return createCRASAdapter();
			}
			@Override
			public Adapter caseCFRAS(CFRAS object) {
				return createCFRASAdapter();
			}
			@Override
			public Adapter caseRedundancyCluster(RedundancyCluster object) {
				return createRedundancyClusterAdapter();
			}
			@Override
			public Adapter caseLoad(Load object) {
				return createLoadAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link nacre.Controllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.Controllers
	 * @generated
	 */
	public Adapter createControllersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.CommunicationMedias <em>Communication Medias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.CommunicationMedias
	 * @generated
	 */
	public Adapter createCommunicationMediasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.ComputingResources <em>Computing Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.ComputingResources
	 * @generated
	 */
	public Adapter createComputingResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.SoftwareResources <em>Software Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.SoftwareResources
	 * @generated
	 */
	public Adapter createSoftwareResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.CFRA <em>CFRA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.CFRA
	 * @generated
	 */
	public Adapter createCFRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.CRA <em>CRA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.CRA
	 * @generated
	 */
	public Adapter createCRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.MainGrid <em>Main Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.MainGrid
	 * @generated
	 */
	public Adapter createMainGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.Zone
	 * @generated
	 */
	public Adapter createZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.Substation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.Substation
	 * @generated
	 */
	public Adapter createSubstationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.Bus
	 * @generated
	 */
	public Adapter createBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.Equipement <em>Equipement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.Equipement
	 * @generated
	 */
	public Adapter createEquipementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.NFP_Power <em>NFP Power</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.NFP_Power
	 * @generated
	 */
	public Adapter createNFP_PowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.LocalController <em>Local Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.LocalController
	 * @generated
	 */
	public Adapter createLocalControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.ZonalController <em>Zonal Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.ZonalController
	 * @generated
	 */
	public Adapter createZonalControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.CentralController <em>Central Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.CentralController
	 * @generated
	 */
	public Adapter createCentralControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.Generator
	 * @generated
	 */
	public Adapter createGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.NFP_Voltage <em>NFP Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.NFP_Voltage
	 * @generated
	 */
	public Adapter createNFP_VoltageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.NFP_Energy <em>NFP Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.NFP_Energy
	 * @generated
	 */
	public Adapter createNFP_EnergyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.RTE_Installation <em>RTE Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.RTE_Installation
	 * @generated
	 */
	public Adapter createRTE_InstallationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.NFP_IST <em>NFP IST</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.NFP_IST
	 * @generated
	 */
	public Adapter createNFP_ISTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.Battery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.Battery
	 * @generated
	 */
	public Adapter createBatteryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.NFP_VAR <em>NFP VAR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.NFP_VAR
	 * @generated
	 */
	public Adapter createNFP_VARAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.Connect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.Connect
	 * @generated
	 */
	public Adapter createConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.Control
	 * @generated
	 */
	public Adapter createControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.CFA <em>CFA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.CFA
	 * @generated
	 */
	public Adapter createCFAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.CRAS <em>CRAS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.CRAS
	 * @generated
	 */
	public Adapter createCRASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.CFRAS <em>CFRAS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.CFRAS
	 * @generated
	 */
	public Adapter createCFRASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.RedundancyCluster <em>Redundancy Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.RedundancyCluster
	 * @generated
	 */
	public Adapter createRedundancyClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.Load
	 * @generated
	 */
	public Adapter createLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nacre.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nacre.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NacreAdapterFactory
