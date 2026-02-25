/**
 */
package fr.cea.nacre.model.NACREMM.cfa.impl;

import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;
import fr.cea.nacre.model.NACREMM.cfa.Generator;

import fr.cea.nacre.model.NACREMM.cfa.PowerType;
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
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.GeneratorImpl#getMinPowerGeneration <em>Min Power Generation</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.GeneratorImpl#getMaxPowerGeneration <em>Max Power Generation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorImpl extends EquipmentImpl implements Generator {
	/**
	 * The cached value of the '{@link #getMinPowerGeneration() <em>Min Power Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPowerGeneration()
	 * @generated
	 * @ordered
	 */
	protected PowerType minPowerGeneration;
	/**
	 * The cached value of the '{@link #getMaxPowerGeneration() <em>Max Power Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPowerGeneration()
	 * @generated
	 * @ordered
	 */
	protected PowerType maxPowerGeneration;

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
		return CfaPackage.Literals.GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerType getMinPowerGeneration() {
		return minPowerGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinPowerGeneration(PowerType newMinPowerGeneration, NotificationChain msgs) {
		PowerType oldMinPowerGeneration = minPowerGeneration;
		minPowerGeneration = newMinPowerGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfaPackage.GENERATOR__MIN_POWER_GENERATION, oldMinPowerGeneration, newMinPowerGeneration);
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
	public void setMinPowerGeneration(PowerType newMinPowerGeneration) {
		if (newMinPowerGeneration != minPowerGeneration) {
			NotificationChain msgs = null;
			if (minPowerGeneration != null)
				msgs = ((InternalEObject)minPowerGeneration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfaPackage.GENERATOR__MIN_POWER_GENERATION, null, msgs);
			if (newMinPowerGeneration != null)
				msgs = ((InternalEObject)newMinPowerGeneration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfaPackage.GENERATOR__MIN_POWER_GENERATION, null, msgs);
			msgs = basicSetMinPowerGeneration(newMinPowerGeneration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.GENERATOR__MIN_POWER_GENERATION, newMinPowerGeneration, newMinPowerGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerType getMaxPowerGeneration() {
		return maxPowerGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxPowerGeneration(PowerType newMaxPowerGeneration, NotificationChain msgs) {
		PowerType oldMaxPowerGeneration = maxPowerGeneration;
		maxPowerGeneration = newMaxPowerGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfaPackage.GENERATOR__MAX_POWER_GENERATION, oldMaxPowerGeneration, newMaxPowerGeneration);
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
	public void setMaxPowerGeneration(PowerType newMaxPowerGeneration) {
		if (newMaxPowerGeneration != maxPowerGeneration) {
			NotificationChain msgs = null;
			if (maxPowerGeneration != null)
				msgs = ((InternalEObject)maxPowerGeneration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfaPackage.GENERATOR__MAX_POWER_GENERATION, null, msgs);
			if (newMaxPowerGeneration != null)
				msgs = ((InternalEObject)newMaxPowerGeneration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfaPackage.GENERATOR__MAX_POWER_GENERATION, null, msgs);
			msgs = basicSetMaxPowerGeneration(newMaxPowerGeneration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.GENERATOR__MAX_POWER_GENERATION, newMaxPowerGeneration, newMaxPowerGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfaPackage.GENERATOR__MIN_POWER_GENERATION:
				return basicSetMinPowerGeneration(null, msgs);
			case CfaPackage.GENERATOR__MAX_POWER_GENERATION:
				return basicSetMaxPowerGeneration(null, msgs);
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
			case CfaPackage.GENERATOR__MIN_POWER_GENERATION:
				return getMinPowerGeneration();
			case CfaPackage.GENERATOR__MAX_POWER_GENERATION:
				return getMaxPowerGeneration();
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
			case CfaPackage.GENERATOR__MIN_POWER_GENERATION:
				setMinPowerGeneration((PowerType)newValue);
				return;
			case CfaPackage.GENERATOR__MAX_POWER_GENERATION:
				setMaxPowerGeneration((PowerType)newValue);
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
			case CfaPackage.GENERATOR__MIN_POWER_GENERATION:
				setMinPowerGeneration((PowerType)null);
				return;
			case CfaPackage.GENERATOR__MAX_POWER_GENERATION:
				setMaxPowerGeneration((PowerType)null);
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
			case CfaPackage.GENERATOR__MIN_POWER_GENERATION:
				return minPowerGeneration != null;
			case CfaPackage.GENERATOR__MAX_POWER_GENERATION:
				return maxPowerGeneration != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneratorImpl
