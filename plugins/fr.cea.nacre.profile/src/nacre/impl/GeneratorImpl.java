/**
 */
package nacre.impl;

import nacre.Generator;
import nacre.NFP_Energy;
import nacre.NFP_Power;
import nacre.NFP_Voltage;
import nacre.NacrePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nacre.impl.GeneratorImpl#getV <em>V</em>}</li>
 *   <li>{@link nacre.impl.GeneratorImpl#getMaxPowerGeneration <em>Max Power Generation</em>}</li>
 *   <li>{@link nacre.impl.GeneratorImpl#getProducedEnergy <em>Produced Energy</em>}</li>
 *   <li>{@link nacre.impl.GeneratorImpl#getMinPowerGeneration <em>Min Power Generation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorImpl extends EquipementImpl implements Generator {
	/**
	 * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected NFP_Voltage v;

	/**
	 * The cached value of the '{@link #getMaxPowerGeneration() <em>Max Power Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPowerGeneration()
	 * @generated
	 * @ordered
	 */
	protected NFP_Power maxPowerGeneration;

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
	 * The cached value of the '{@link #getMinPowerGeneration() <em>Min Power Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPowerGeneration()
	 * @generated
	 * @ordered
	 */
	protected NFP_Power minPowerGeneration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NacrePackage.Literals.GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Voltage getV() {
		return v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetV(NFP_Voltage newV, NotificationChain msgs) {
		NFP_Voltage oldV = v;
		v = newV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.GENERATOR__V, oldV, newV);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV(NFP_Voltage newV) {
		if (newV != v) {
			NotificationChain msgs = null;
			if (v != null)
				msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NacrePackage.GENERATOR__V, null, msgs);
			if (newV != null)
				msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NacrePackage.GENERATOR__V, null, msgs);
			msgs = basicSetV(newV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.GENERATOR__V, newV, newV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Power getMaxPowerGeneration() {
		return maxPowerGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxPowerGeneration(NFP_Power newMaxPowerGeneration, NotificationChain msgs) {
		NFP_Power oldMaxPowerGeneration = maxPowerGeneration;
		maxPowerGeneration = newMaxPowerGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.GENERATOR__MAX_POWER_GENERATION, oldMaxPowerGeneration, newMaxPowerGeneration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPowerGeneration(NFP_Power newMaxPowerGeneration) {
		if (newMaxPowerGeneration != maxPowerGeneration) {
			NotificationChain msgs = null;
			if (maxPowerGeneration != null)
				msgs = ((InternalEObject)maxPowerGeneration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NacrePackage.GENERATOR__MAX_POWER_GENERATION, null, msgs);
			if (newMaxPowerGeneration != null)
				msgs = ((InternalEObject)newMaxPowerGeneration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NacrePackage.GENERATOR__MAX_POWER_GENERATION, null, msgs);
			msgs = basicSetMaxPowerGeneration(newMaxPowerGeneration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.GENERATOR__MAX_POWER_GENERATION, newMaxPowerGeneration, newMaxPowerGeneration));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.GENERATOR__PRODUCED_ENERGY, oldProducedEnergy, newProducedEnergy);
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
				msgs = ((InternalEObject)producedEnergy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NacrePackage.GENERATOR__PRODUCED_ENERGY, null, msgs);
			if (newProducedEnergy != null)
				msgs = ((InternalEObject)newProducedEnergy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NacrePackage.GENERATOR__PRODUCED_ENERGY, null, msgs);
			msgs = basicSetProducedEnergy(newProducedEnergy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.GENERATOR__PRODUCED_ENERGY, newProducedEnergy, newProducedEnergy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Power getMinPowerGeneration() {
		return minPowerGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinPowerGeneration(NFP_Power newMinPowerGeneration, NotificationChain msgs) {
		NFP_Power oldMinPowerGeneration = minPowerGeneration;
		minPowerGeneration = newMinPowerGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.GENERATOR__MIN_POWER_GENERATION, oldMinPowerGeneration, newMinPowerGeneration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinPowerGeneration(NFP_Power newMinPowerGeneration) {
		if (newMinPowerGeneration != minPowerGeneration) {
			NotificationChain msgs = null;
			if (minPowerGeneration != null)
				msgs = ((InternalEObject)minPowerGeneration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NacrePackage.GENERATOR__MIN_POWER_GENERATION, null, msgs);
			if (newMinPowerGeneration != null)
				msgs = ((InternalEObject)newMinPowerGeneration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NacrePackage.GENERATOR__MIN_POWER_GENERATION, null, msgs);
			msgs = basicSetMinPowerGeneration(newMinPowerGeneration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.GENERATOR__MIN_POWER_GENERATION, newMinPowerGeneration, newMinPowerGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NacrePackage.GENERATOR__V:
				return basicSetV(null, msgs);
			case NacrePackage.GENERATOR__MAX_POWER_GENERATION:
				return basicSetMaxPowerGeneration(null, msgs);
			case NacrePackage.GENERATOR__PRODUCED_ENERGY:
				return basicSetProducedEnergy(null, msgs);
			case NacrePackage.GENERATOR__MIN_POWER_GENERATION:
				return basicSetMinPowerGeneration(null, msgs);
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
			case NacrePackage.GENERATOR__V:
				return getV();
			case NacrePackage.GENERATOR__MAX_POWER_GENERATION:
				return getMaxPowerGeneration();
			case NacrePackage.GENERATOR__PRODUCED_ENERGY:
				return getProducedEnergy();
			case NacrePackage.GENERATOR__MIN_POWER_GENERATION:
				return getMinPowerGeneration();
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
			case NacrePackage.GENERATOR__V:
				setV((NFP_Voltage)newValue);
				return;
			case NacrePackage.GENERATOR__MAX_POWER_GENERATION:
				setMaxPowerGeneration((NFP_Power)newValue);
				return;
			case NacrePackage.GENERATOR__PRODUCED_ENERGY:
				setProducedEnergy((NFP_Energy)newValue);
				return;
			case NacrePackage.GENERATOR__MIN_POWER_GENERATION:
				setMinPowerGeneration((NFP_Power)newValue);
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
			case NacrePackage.GENERATOR__V:
				setV((NFP_Voltage)null);
				return;
			case NacrePackage.GENERATOR__MAX_POWER_GENERATION:
				setMaxPowerGeneration((NFP_Power)null);
				return;
			case NacrePackage.GENERATOR__PRODUCED_ENERGY:
				setProducedEnergy((NFP_Energy)null);
				return;
			case NacrePackage.GENERATOR__MIN_POWER_GENERATION:
				setMinPowerGeneration((NFP_Power)null);
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
			case NacrePackage.GENERATOR__V:
				return v != null;
			case NacrePackage.GENERATOR__MAX_POWER_GENERATION:
				return maxPowerGeneration != null;
			case NacrePackage.GENERATOR__PRODUCED_ENERGY:
				return producedEnergy != null;
			case NacrePackage.GENERATOR__MIN_POWER_GENERATION:
				return minPowerGeneration != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneratorImpl
