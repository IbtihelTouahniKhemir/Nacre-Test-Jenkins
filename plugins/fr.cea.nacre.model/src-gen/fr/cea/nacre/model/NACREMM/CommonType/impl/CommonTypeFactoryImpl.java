/**
 */
package fr.cea.nacre.model.NACREMM.CommonType.impl;

import fr.cea.nacre.model.NACREMM.CommonType.*;

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
public class CommonTypeFactoryImpl extends EFactoryImpl implements CommonTypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommonTypeFactory init() {
		try {
			CommonTypeFactory theCommonTypeFactory = (CommonTypeFactory)EPackage.Registry.INSTANCE.getEFactory(CommonTypePackage.eNS_URI);
			if (theCommonTypeFactory != null) {
				return theCommonTypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommonTypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonTypeFactoryImpl() {
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
			case CommonTypePackage.PERIOD: return createPeriod();
			case CommonTypePackage.PERIOD_TYPE: return createPeriodType();
			case CommonTypePackage.COMMON_TYPE: return createCommonType();
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
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeriodType createPeriodType() {
		PeriodTypeImpl periodType = new PeriodTypeImpl();
		return periodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonType createCommonType() {
		CommonTypeImpl commonType = new CommonTypeImpl();
		return commonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonTypePackage getCommonTypePackage() {
		return (CommonTypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommonTypePackage getPackage() {
		return CommonTypePackage.eINSTANCE;
	}

} //CommonTypeFactoryImpl
