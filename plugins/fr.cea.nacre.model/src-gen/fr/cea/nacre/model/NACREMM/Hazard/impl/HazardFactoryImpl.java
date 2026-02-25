/**
 */
package fr.cea.nacre.model.NACREMM.Hazard.impl;

import fr.cea.nacre.model.NACREMM.Hazard.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HazardFactoryImpl extends EFactoryImpl implements HazardFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HazardFactory init() {
		try {
			HazardFactory theHazardFactory = (HazardFactory)EPackage.Registry.INSTANCE.getEFactory(HazardPackage.eNS_URI);
			if (theHazardFactory != null) {
				return theHazardFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HazardFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HazardPackage.COMMUNICATION_HAZARD: return createCommunicationHazard();
			case HazardPackage.ABSTRACT_HAZARD: return createAbstractHazard();
			case HazardPackage.CRA_HAZARD: return createCraHazard();
			case HazardPackage.NACRE_HAZARD: return createNACREHazard();
			case HazardPackage.CFA_HAZARD: return createCfaHazard();
			case HazardPackage.LINE_HAZARD: return createLineHazard();
			case HazardPackage.GENERATOR_HAZARD: return createGeneratorHazard();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationHazard createCommunicationHazard() {
		CommunicationHazardImpl communicationHazard = new CommunicationHazardImpl();
		return communicationHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractHazard createAbstractHazard() {
		AbstractHazardImpl abstractHazard = new AbstractHazardImpl();
		return abstractHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CraHazard createCraHazard() {
		CraHazardImpl craHazard = new CraHazardImpl();
		return craHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NACREHazard createNACREHazard() {
		NACREHazardImpl nacreHazard = new NACREHazardImpl();
		return nacreHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CfaHazard createCfaHazard() {
		CfaHazardImpl cfaHazard = new CfaHazardImpl();
		return cfaHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineHazard createLineHazard() {
		LineHazardImpl lineHazard = new LineHazardImpl();
		return lineHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneratorHazard createGeneratorHazard() {
		GeneratorHazardImpl generatorHazard = new GeneratorHazardImpl();
		return generatorHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HazardPackage getHazardPackage() {
		return (HazardPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HazardPackage getPackage() {
		return HazardPackage.eINSTANCE;
	}

} //HazardFactoryImpl
