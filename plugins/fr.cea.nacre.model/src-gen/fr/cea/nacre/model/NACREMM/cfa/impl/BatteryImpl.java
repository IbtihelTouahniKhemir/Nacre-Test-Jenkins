/**
 */
package fr.cea.nacre.model.NACREMM.cfa.impl;

import fr.cea.nacre.model.NACREMM.cfa.Battery;
import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;

import fr.cea.nacre.model.NACREMM.cfa.PowerType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.BatteryImpl#getMaxPowerInjection <em>Max Power Injection</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.BatteryImpl#getMinPowerInjection <em>Min Power Injection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryImpl extends EquipmentImpl implements Battery {
	/**
	 * The cached value of the '{@link #getMaxPowerInjection() <em>Max Power Injection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPowerInjection()
	 * @generated
	 * @ordered
	 */
	protected PowerType maxPowerInjection;
	/**
	 * The cached value of the '{@link #getMinPowerInjection() <em>Min Power Injection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPowerInjection()
	 * @generated
	 * @ordered
	 */
	protected PowerType minPowerInjection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatteryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CfaPackage.Literals.BATTERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerType getMaxPowerInjection() {
		return maxPowerInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxPowerInjection(PowerType newMaxPowerInjection, NotificationChain msgs) {
		PowerType oldMaxPowerInjection = maxPowerInjection;
		maxPowerInjection = newMaxPowerInjection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfaPackage.BATTERY__MAX_POWER_INJECTION, oldMaxPowerInjection, newMaxPowerInjection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxPowerInjection(PowerType newMaxPowerInjection) {
		if (newMaxPowerInjection != maxPowerInjection) {
			NotificationChain msgs = null;
			if (maxPowerInjection != null)
				msgs = ((InternalEObject)maxPowerInjection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfaPackage.BATTERY__MAX_POWER_INJECTION, null, msgs);
			if (newMaxPowerInjection != null)
				msgs = ((InternalEObject)newMaxPowerInjection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfaPackage.BATTERY__MAX_POWER_INJECTION, null, msgs);
			msgs = basicSetMaxPowerInjection(newMaxPowerInjection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.BATTERY__MAX_POWER_INJECTION, newMaxPowerInjection, newMaxPowerInjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerType getMinPowerInjection() {
		return minPowerInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinPowerInjection(PowerType newMinPowerInjection, NotificationChain msgs) {
		PowerType oldMinPowerInjection = minPowerInjection;
		minPowerInjection = newMinPowerInjection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfaPackage.BATTERY__MIN_POWER_INJECTION, oldMinPowerInjection, newMinPowerInjection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinPowerInjection(PowerType newMinPowerInjection) {
		if (newMinPowerInjection != minPowerInjection) {
			NotificationChain msgs = null;
			if (minPowerInjection != null)
				msgs = ((InternalEObject)minPowerInjection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfaPackage.BATTERY__MIN_POWER_INJECTION, null, msgs);
			if (newMinPowerInjection != null)
				msgs = ((InternalEObject)newMinPowerInjection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfaPackage.BATTERY__MIN_POWER_INJECTION, null, msgs);
			msgs = basicSetMinPowerInjection(newMinPowerInjection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.BATTERY__MIN_POWER_INJECTION, newMinPowerInjection, newMinPowerInjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfaPackage.BATTERY__MAX_POWER_INJECTION:
				return basicSetMaxPowerInjection(null, msgs);
			case CfaPackage.BATTERY__MIN_POWER_INJECTION:
				return basicSetMinPowerInjection(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CfaPackage.BATTERY__MAX_POWER_INJECTION:
				return getMaxPowerInjection();
			case CfaPackage.BATTERY__MIN_POWER_INJECTION:
				return getMinPowerInjection();
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
			case CfaPackage.BATTERY__MAX_POWER_INJECTION:
				setMaxPowerInjection((PowerType)newValue);
				return;
			case CfaPackage.BATTERY__MIN_POWER_INJECTION:
				setMinPowerInjection((PowerType)newValue);
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
			case CfaPackage.BATTERY__MAX_POWER_INJECTION:
				setMaxPowerInjection((PowerType)null);
				return;
			case CfaPackage.BATTERY__MIN_POWER_INJECTION:
				setMinPowerInjection((PowerType)null);
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
			case CfaPackage.BATTERY__MAX_POWER_INJECTION:
				return maxPowerInjection != null;
			case CfaPackage.BATTERY__MIN_POWER_INJECTION:
				return minPowerInjection != null;
		}
		return super.eIsSet(featureID);
	}

} //BatteryImpl
