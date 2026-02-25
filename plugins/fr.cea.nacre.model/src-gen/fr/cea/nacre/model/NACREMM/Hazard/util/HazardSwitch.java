/**
 */
package fr.cea.nacre.model.NACREMM.Hazard.util;

import fr.cea.nacre.model.NACREMM.Hazard.*;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

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
 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage
 * @generated
 */
public class HazardSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HazardPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardSwitch() {
		if (modelPackage == null) {
			modelPackage = HazardPackage.eINSTANCE;
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
			case HazardPackage.COMMUNICATION_HAZARD: {
				CommunicationHazard communicationHazard = (CommunicationHazard)theEObject;
				T result = caseCommunicationHazard(communicationHazard);
				if (result == null) result = caseAbstractHazard(communicationHazard);
				if (result == null) result = caseUIDElement(communicationHazard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HazardPackage.ABSTRACT_HAZARD: {
				AbstractHazard abstractHazard = (AbstractHazard)theEObject;
				T result = caseAbstractHazard(abstractHazard);
				if (result == null) result = caseUIDElement(abstractHazard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HazardPackage.CRA_HAZARD: {
				CraHazard craHazard = (CraHazard)theEObject;
				T result = caseCraHazard(craHazard);
				if (result == null) result = caseUIDElement(craHazard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HazardPackage.NACRE_HAZARD: {
				NACREHazard nacreHazard = (NACREHazard)theEObject;
				T result = caseNACREHazard(nacreHazard);
				if (result == null) result = caseUIDElement(nacreHazard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HazardPackage.CFA_HAZARD: {
				CfaHazard cfaHazard = (CfaHazard)theEObject;
				T result = caseCfaHazard(cfaHazard);
				if (result == null) result = caseUIDElement(cfaHazard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HazardPackage.LINE_HAZARD: {
				LineHazard lineHazard = (LineHazard)theEObject;
				T result = caseLineHazard(lineHazard);
				if (result == null) result = caseAbstractHazard(lineHazard);
				if (result == null) result = caseUIDElement(lineHazard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HazardPackage.GENERATOR_HAZARD: {
				GeneratorHazard generatorHazard = (GeneratorHazard)theEObject;
				T result = caseGeneratorHazard(generatorHazard);
				if (result == null) result = caseAbstractHazard(generatorHazard);
				if (result == null) result = caseUIDElement(generatorHazard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Hazard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationHazard(CommunicationHazard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Hazard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractHazard(AbstractHazard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cra Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cra Hazard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCraHazard(CraHazard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NACRE Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NACRE Hazard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNACREHazard(NACREHazard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cfa Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cfa Hazard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCfaHazard(CfaHazard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Hazard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineHazard(LineHazard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Hazard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratorHazard(GeneratorHazard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIDElement(UIDElement object) {
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

} //HazardSwitch
