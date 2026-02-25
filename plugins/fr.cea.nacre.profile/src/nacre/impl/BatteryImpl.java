/**
 */
package nacre.impl;

import nacre.Battery;
import nacre.NFP_Energy;
import nacre.NFP_Power;
import nacre.NacrePackage;

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
 *   <li>{@link nacre.impl.BatteryImpl#getMaxPowerInjection <em>Max Power Injection</em>}</li>
 *   <li>{@link nacre.impl.BatteryImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link nacre.impl.BatteryImpl#getProducedEnergy <em>Produced Energy</em>}</li>
 *   <li>{@link nacre.impl.BatteryImpl#getConsumedEnergy <em>Consumed Energy</em>}</li>
 *   <li>{@link nacre.impl.BatteryImpl#getMinPowerInjection <em>Min Power Injection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryImpl extends EquipementImpl implements Battery {
	/**
	 * The cached value of the '{@link #getMaxPowerInjection() <em>Max Power Injection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPowerInjection()
	 * @generated
	 * @ordered
	 */
	protected NFP_Power maxPowerInjection;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected NFP_Energy capacity;

	/**
	 * The cached value of the '{@link #getProducedEnergy() <em>Produced Energy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedEnergy()
	 * @generated
	 * @ordered
	 */
	protected NFP_Energy producedEnergy;

	/**
	 * The cached value of the '{@link #getConsumedEnergy() <em>Consumed Energy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedEnergy()
	 * @generated
	 * @ordered
	 */
	protected NFP_Energy consumedEnergy;

	/**
	 * The cached value of the '{@link #getMinPowerInjection() <em>Min Power Injection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPowerInjection()
	 * @generated
	 * @ordered
	 */
	protected NFP_Power minPowerInjection;

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
		return NacrePackage.Literals.BATTERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Power getMaxPowerInjection() {
		return maxPowerInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxPowerInjection(NFP_Power newMaxPowerInjection, NotificationChain msgs) {
		NFP_Power oldMaxPowerInjection = maxPowerInjection;
		maxPowerInjection = newMaxPowerInjection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.BATTERY__MAX_POWER_INJECTION, oldMaxPowerInjection, newMaxPowerInjection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPowerInjection(NFP_Power newMaxPowerInjection) {
		if (newMaxPowerInjection != maxPowerInjection) {
			NotificationChain msgs = null;
			if (maxPowerInjection != null)
				msgs = ((InternalEObject)maxPowerInjection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NacrePackage.BATTERY__MAX_POWER_INJECTION, null, msgs);
			if (newMaxPowerInjection != null)
				msgs = ((InternalEObject)newMaxPowerInjection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NacrePackage.BATTERY__MAX_POWER_INJECTION, null, msgs);
			msgs = basicSetMaxPowerInjection(newMaxPowerInjection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.BATTERY__MAX_POWER_INJECTION, newMaxPowerInjection, newMaxPowerInjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Energy getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacity(NFP_Energy newCapacity, NotificationChain msgs) {
		NFP_Energy oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.BATTERY__CAPACITY, oldCapacity, newCapacity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(NFP_Energy newCapacity) {
		if (newCapacity != capacity) {
			NotificationChain msgs = null;
			if (capacity != null)
				msgs = ((InternalEObject)capacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NacrePackage.BATTERY__CAPACITY, null, msgs);
			if (newCapacity != null)
				msgs = ((InternalEObject)newCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NacrePackage.BATTERY__CAPACITY, null, msgs);
			msgs = basicSetCapacity(newCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.BATTERY__CAPACITY, newCapacity, newCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Energy getProducedEnergy() {
		return producedEnergy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProducedEnergy(NFP_Energy newProducedEnergy, NotificationChain msgs) {
		NFP_Energy oldProducedEnergy = producedEnergy;
		producedEnergy = newProducedEnergy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.BATTERY__PRODUCED_ENERGY, oldProducedEnergy, newProducedEnergy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducedEnergy(NFP_Energy newProducedEnergy) {
		if (newProducedEnergy != producedEnergy) {
			NotificationChain msgs = null;
			if (producedEnergy != null)
				msgs = ((InternalEObject)producedEnergy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NacrePackage.BATTERY__PRODUCED_ENERGY, null, msgs);
			if (newProducedEnergy != null)
				msgs = ((InternalEObject)newProducedEnergy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NacrePackage.BATTERY__PRODUCED_ENERGY, null, msgs);
			msgs = basicSetProducedEnergy(newProducedEnergy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.BATTERY__PRODUCED_ENERGY, newProducedEnergy, newProducedEnergy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Energy getConsumedEnergy() {
		return consumedEnergy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsumedEnergy(NFP_Energy newConsumedEnergy, NotificationChain msgs) {
		NFP_Energy oldConsumedEnergy = consumedEnergy;
		consumedEnergy = newConsumedEnergy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.BATTERY__CONSUMED_ENERGY, oldConsumedEnergy, newConsumedEnergy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumedEnergy(NFP_Energy newConsumedEnergy) {
		if (newConsumedEnergy != consumedEnergy) {
			NotificationChain msgs = null;
			if (consumedEnergy != null)
				msgs = ((InternalEObject)consumedEnergy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NacrePackage.BATTERY__CONSUMED_ENERGY, null, msgs);
			if (newConsumedEnergy != null)
				msgs = ((InternalEObject)newConsumedEnergy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NacrePackage.BATTERY__CONSUMED_ENERGY, null, msgs);
			msgs = basicSetConsumedEnergy(newConsumedEnergy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.BATTERY__CONSUMED_ENERGY, newConsumedEnergy, newConsumedEnergy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Power getMinPowerInjection() {
		return minPowerInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinPowerInjection(NFP_Power newMinPowerInjection, NotificationChain msgs) {
		NFP_Power oldMinPowerInjection = minPowerInjection;
		minPowerInjection = newMinPowerInjection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.BATTERY__MIN_POWER_INJECTION, oldMinPowerInjection, newMinPowerInjection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinPowerInjection(NFP_Power newMinPowerInjection) {
		if (newMinPowerInjection != minPowerInjection) {
			NotificationChain msgs = null;
			if (minPowerInjection != null)
				msgs = ((InternalEObject)minPowerInjection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NacrePackage.BATTERY__MIN_POWER_INJECTION, null, msgs);
			if (newMinPowerInjection != null)
				msgs = ((InternalEObject)newMinPowerInjection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NacrePackage.BATTERY__MIN_POWER_INJECTION, null, msgs);
			msgs = basicSetMinPowerInjection(newMinPowerInjection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.BATTERY__MIN_POWER_INJECTION, newMinPowerInjection, newMinPowerInjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NacrePackage.BATTERY__MAX_POWER_INJECTION:
				return basicSetMaxPowerInjection(null, msgs);
			case NacrePackage.BATTERY__CAPACITY:
				return basicSetCapacity(null, msgs);
			case NacrePackage.BATTERY__PRODUCED_ENERGY:
				return basicSetProducedEnergy(null, msgs);
			case NacrePackage.BATTERY__CONSUMED_ENERGY:
				return basicSetConsumedEnergy(null, msgs);
			case NacrePackage.BATTERY__MIN_POWER_INJECTION:
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
			case NacrePackage.BATTERY__MAX_POWER_INJECTION:
				return getMaxPowerInjection();
			case NacrePackage.BATTERY__CAPACITY:
				return getCapacity();
			case NacrePackage.BATTERY__PRODUCED_ENERGY:
				return getProducedEnergy();
			case NacrePackage.BATTERY__CONSUMED_ENERGY:
				return getConsumedEnergy();
			case NacrePackage.BATTERY__MIN_POWER_INJECTION:
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
			case NacrePackage.BATTERY__MAX_POWER_INJECTION:
				setMaxPowerInjection((NFP_Power)newValue);
				return;
			case NacrePackage.BATTERY__CAPACITY:
				setCapacity((NFP_Energy)newValue);
				return;
			case NacrePackage.BATTERY__PRODUCED_ENERGY:
				setProducedEnergy((NFP_Energy)newValue);
				return;
			case NacrePackage.BATTERY__CONSUMED_ENERGY:
				setConsumedEnergy((NFP_Energy)newValue);
				return;
			case NacrePackage.BATTERY__MIN_POWER_INJECTION:
				setMinPowerInjection((NFP_Power)newValue);
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
			case NacrePackage.BATTERY__MAX_POWER_INJECTION:
				setMaxPowerInjection((NFP_Power)null);
				return;
			case NacrePackage.BATTERY__CAPACITY:
				setCapacity((NFP_Energy)null);
				return;
			case NacrePackage.BATTERY__PRODUCED_ENERGY:
				setProducedEnergy((NFP_Energy)null);
				return;
			case NacrePackage.BATTERY__CONSUMED_ENERGY:
				setConsumedEnergy((NFP_Energy)null);
				return;
			case NacrePackage.BATTERY__MIN_POWER_INJECTION:
				setMinPowerInjection((NFP_Power)null);
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
			case NacrePackage.BATTERY__MAX_POWER_INJECTION:
				return maxPowerInjection != null;
			case NacrePackage.BATTERY__CAPACITY:
				return capacity != null;
			case NacrePackage.BATTERY__PRODUCED_ENERGY:
				return producedEnergy != null;
			case NacrePackage.BATTERY__CONSUMED_ENERGY:
				return consumedEnergy != null;
			case NacrePackage.BATTERY__MIN_POWER_INJECTION:
				return minPowerInjection != null;
		}
		return super.eIsSet(featureID);
	}

} //BatteryImpl
