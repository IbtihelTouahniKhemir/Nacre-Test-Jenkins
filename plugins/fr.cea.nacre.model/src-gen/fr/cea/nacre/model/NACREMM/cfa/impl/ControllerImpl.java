/**
 */
package fr.cea.nacre.model.NACREMM.cfa.impl;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;
import fr.cea.nacre.model.NACREMM.cfa.Controller;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.ControllerImpl#getControlBehavior <em>Control Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends UIDElementImpl implements Controller {
	/**
	 * The default value of the '{@link #getControlBehavior() <em>Control Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlBehavior() <em>Control Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlBehavior()
	 * @generated
	 * @ordered
	 */
	protected String controlBehavior = CONTROL_BEHAVIOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CfaPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getControlBehavior() {
		return controlBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControlBehavior(String newControlBehavior) {
		String oldControlBehavior = controlBehavior;
		controlBehavior = newControlBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.CONTROLLER__CONTROL_BEHAVIOR, oldControlBehavior, controlBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CfaPackage.CONTROLLER__CONTROL_BEHAVIOR:
				return getControlBehavior();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CfaPackage.CONTROLLER__CONTROL_BEHAVIOR:
				setControlBehavior((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CfaPackage.CONTROLLER__CONTROL_BEHAVIOR:
				setControlBehavior(CONTROL_BEHAVIOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CfaPackage.CONTROLLER__CONTROL_BEHAVIOR:
				return CONTROL_BEHAVIOR_EDEFAULT == null ? controlBehavior != null : !CONTROL_BEHAVIOR_EDEFAULT.equals(controlBehavior);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (controlBehavior: ");
		result.append(controlBehavior);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl
