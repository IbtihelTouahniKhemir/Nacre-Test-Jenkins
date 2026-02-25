/**
 */
package fr.cea.nacre.model.NACREMM.impl;

import fr.cea.nacre.model.NACREMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class NACREMMFactoryImpl extends EFactoryImpl implements NACREMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NACREMMFactory init() {
		try {
			NACREMMFactory theNACREMMFactory = (NACREMMFactory)EPackage.Registry.INSTANCE.getEFactory(NACREMMPackage.eNS_URI);
			if (theNACREMMFactory != null) {
				return theNACREMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NACREMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NACREMMFactoryImpl() {
		super();
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NACREMMPackage getNACREMMPackage() {
		return (NACREMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NACREMMPackage getPackage() {
		return NACREMMPackage.eINSTANCE;
	}

} //NACREMMFactoryImpl
