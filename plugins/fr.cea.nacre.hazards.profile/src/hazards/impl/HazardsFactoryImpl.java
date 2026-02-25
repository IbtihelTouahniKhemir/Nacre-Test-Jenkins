/**
 */
package hazards.impl;

import hazards.*;

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
public class HazardsFactoryImpl extends EFactoryImpl implements HazardsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HazardsFactory init() {
		try {
			HazardsFactory theHazardsFactory = (HazardsFactory)EPackage.Registry.INSTANCE.getEFactory(HazardsPackage.eNS_URI);
			if (theHazardsFactory != null) {
				return theHazardsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HazardsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardsFactoryImpl() {
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
			case HazardsPackage.COMMUNICATION_HAZARD: return createCommunicationHazard();
			case HazardsPackage.PERIOD: return createPeriod();
			case HazardsPackage.LINE_HAZARD: return createLineHazard();
			case HazardsPackage.GENERATOR_HAZARD: return createGeneratorHazard();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationHazard createCommunicationHazard() {
		CommunicationHazardImpl communicationHazard = new CommunicationHazardImpl();
		return communicationHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineHazard createLineHazard() {
		LineHazardImpl lineHazard = new LineHazardImpl();
		return lineHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorHazard createGeneratorHazard() {
		GeneratorHazardImpl generatorHazard = new GeneratorHazardImpl();
		return generatorHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardsPackage getHazardsPackage() {
		return (HazardsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HazardsPackage getPackage() {
		return HazardsPackage.eINSTANCE;
	}

} //HazardsFactoryImpl
