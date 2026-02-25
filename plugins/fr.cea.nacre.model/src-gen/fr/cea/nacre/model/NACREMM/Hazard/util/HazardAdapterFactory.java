/**
 */
package fr.cea.nacre.model.NACREMM.Hazard.util;

import fr.cea.nacre.model.NACREMM.Hazard.*;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage
 * @generated
 */
public class HazardAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HazardPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HazardPackage.eINSTANCE;
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
	protected HazardSwitch<Adapter> modelSwitch =
		new HazardSwitch<Adapter>() {
			@Override
			public Adapter caseCommunicationHazard(CommunicationHazard object) {
				return createCommunicationHazardAdapter();
			}
			@Override
			public Adapter caseAbstractHazard(AbstractHazard object) {
				return createAbstractHazardAdapter();
			}
			@Override
			public Adapter caseCraHazard(CraHazard object) {
				return createCraHazardAdapter();
			}
			@Override
			public Adapter caseNACREHazard(NACREHazard object) {
				return createNACREHazardAdapter();
			}
			@Override
			public Adapter caseCfaHazard(CfaHazard object) {
				return createCfaHazardAdapter();
			}
			@Override
			public Adapter caseLineHazard(LineHazard object) {
				return createLineHazardAdapter();
			}
			@Override
			public Adapter caseGeneratorHazard(GeneratorHazard object) {
				return createGeneratorHazardAdapter();
			}
			@Override
			public Adapter caseUIDElement(UIDElement object) {
				return createUIDElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard <em>Communication Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard
	 * @generated
	 */
	public Adapter createCommunicationHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nacre.model.NACREMM.Hazard.AbstractHazard <em>Abstract Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.AbstractHazard
	 * @generated
	 */
	public Adapter createAbstractHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nacre.model.NACREMM.Hazard.CraHazard <em>Cra Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CraHazard
	 * @generated
	 */
	public Adapter createCraHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nacre.model.NACREMM.Hazard.NACREHazard <em>NACRE Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.NACREHazard
	 * @generated
	 */
	public Adapter createNACREHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nacre.model.NACREMM.Hazard.CfaHazard <em>Cfa Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CfaHazard
	 * @generated
	 */
	public Adapter createCfaHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nacre.model.NACREMM.Hazard.LineHazard <em>Line Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.LineHazard
	 * @generated
	 */
	public Adapter createLineHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard <em>Generator Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard
	 * @generated
	 */
	public Adapter createGeneratorHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cea.nacre.model.NACREMM.UID.UIDElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cea.nacre.model.NACREMM.UID.UIDElement
	 * @generated
	 */
	public Adapter createUIDElementAdapter() {
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

} //HazardAdapterFactory
