/**
 */
package nacre.util;

import nacre.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see nacre.NacrePackage
 * @generated
 */
public class NacreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NacrePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NacreSwitch() {
		if (modelPackage == null) {
			modelPackage = NacrePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NacrePackage.CONTROLLERS: {
				Controllers controllers = (Controllers)theEObject;
				T result = caseControllers(controllers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.COMMUNICATION_MEDIAS: {
				CommunicationMedias communicationMedias = (CommunicationMedias)theEObject;
				T result = caseCommunicationMedias(communicationMedias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.COMPUTING_RESOURCES: {
				ComputingResources computingResources = (ComputingResources)theEObject;
				T result = caseComputingResources(computingResources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.SOFTWARE_RESOURCES: {
				SoftwareResources softwareResources = (SoftwareResources)theEObject;
				T result = caseSoftwareResources(softwareResources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.CFRA: {
				CFRA cfra = (CFRA)theEObject;
				T result = caseCFRA(cfra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.CRA: {
				CRA cra = (CRA)theEObject;
				T result = caseCRA(cra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.MAIN_GRID: {
				MainGrid mainGrid = (MainGrid)theEObject;
				T result = caseMainGrid(mainGrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.ZONE: {
				Zone zone = (Zone)theEObject;
				T result = caseZone(zone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.SUBSTATION: {
				Substation substation = (Substation)theEObject;
				T result = caseSubstation(substation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.BUS: {
				Bus bus = (Bus)theEObject;
				T result = caseBus(bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.EQUIPEMENT: {
				Equipement equipement = (Equipement)theEObject;
				T result = caseEquipement(equipement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.NFP_POWER: {
				NFP_Power nfP_Power = (NFP_Power)theEObject;
				T result = caseNFP_Power(nfP_Power);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.LOCAL_CONTROLLER: {
				LocalController localController = (LocalController)theEObject;
				T result = caseLocalController(localController);
				if (result == null) result = caseController(localController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				T result = caseController(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.ZONAL_CONTROLLER: {
				ZonalController zonalController = (ZonalController)theEObject;
				T result = caseZonalController(zonalController);
				if (result == null) result = caseController(zonalController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.CENTRAL_CONTROLLER: {
				CentralController centralController = (CentralController)theEObject;
				T result = caseCentralController(centralController);
				if (result == null) result = caseController(centralController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.GENERATOR: {
				Generator generator = (Generator)theEObject;
				T result = caseGenerator(generator);
				if (result == null) result = caseEquipement(generator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.NFP_VOLTAGE: {
				NFP_Voltage nfP_Voltage = (NFP_Voltage)theEObject;
				T result = caseNFP_Voltage(nfP_Voltage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.NFP_ENERGY: {
				NFP_Energy nfP_Energy = (NFP_Energy)theEObject;
				T result = caseNFP_Energy(nfP_Energy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.RTE_INSTALLATION: {
				RTE_Installation rtE_Installation = (RTE_Installation)theEObject;
				T result = caseRTE_Installation(rtE_Installation);
				if (result == null) result = caseEquipement(rtE_Installation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.NFP_IST: {
				NFP_IST nfP_IST = (NFP_IST)theEObject;
				T result = caseNFP_IST(nfP_IST);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.BATTERY: {
				Battery battery = (Battery)theEObject;
				T result = caseBattery(battery);
				if (result == null) result = caseEquipement(battery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.NFP_VAR: {
				NFP_VAR nfP_VAR = (NFP_VAR)theEObject;
				T result = caseNFP_VAR(nfP_VAR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.CONNECT: {
				Connect connect = (Connect)theEObject;
				T result = caseConnect(connect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.CONTROL: {
				Control control = (Control)theEObject;
				T result = caseControl(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.CFA: {
				CFA cfa = (CFA)theEObject;
				T result = caseCFA(cfa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.CRAS: {
				CRAS cras = (CRAS)theEObject;
				T result = caseCRAS(cras);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.CFRAS: {
				CFRAS cfras = (CFRAS)theEObject;
				T result = caseCFRAS(cfras);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.REDUNDANCY_CLUSTER: {
				RedundancyCluster redundancyCluster = (RedundancyCluster)theEObject;
				T result = caseRedundancyCluster(redundancyCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NacrePackage.LOAD: {
				Load load = (Load)theEObject;
				T result = caseLoad(load);
				if (result == null) result = caseEquipement(load);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controllers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controllers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllers(Controllers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Medias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Medias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationMedias(CommunicationMedias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputingResources(ComputingResources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareResources(SoftwareResources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CFRA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CFRA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCFRA(CFRA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CRA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CRA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCRA(CRA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainGrid(MainGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZone(Zone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstation(Substation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBus(Bus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipement(Equipement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Power</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Power(NFP_Power object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalController(LocalController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zonal Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zonal Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZonalController(ZonalController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Central Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Central Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCentralController(CentralController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerator(Generator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Voltage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Voltage(NFP_Voltage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Energy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Energy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Energy(NFP_Energy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTE Installation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTE Installation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTE_Installation(RTE_Installation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP IST</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP IST</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_IST(NFP_IST object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBattery(Battery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP VAR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP VAR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_VAR(NFP_VAR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnect(Connect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CFA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CFA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCFA(CFA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CRAS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CRAS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCRAS(CRAS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CFRAS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CFRAS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCFRAS(CFRAS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redundancy Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redundancy Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedundancyCluster(RedundancyCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoad(Load object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NacreSwitch
