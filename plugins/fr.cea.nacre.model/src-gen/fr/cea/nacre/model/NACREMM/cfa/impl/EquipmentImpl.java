/**
 */
package fr.cea.nacre.model.NACREMM.cfa.impl;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;
import fr.cea.nacre.model.NACREMM.cfa.Controller;
import fr.cea.nacre.model.NACREMM.cfa.Equipment;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.EquipmentImpl#isConnected <em>Connected</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.EquipmentImpl#getLocalController <em>Local Controller</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.EquipmentImpl#isActivable <em>Activable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquipmentImpl extends UIDElementImpl implements Equipment {
	/**
	 * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean connected = CONNECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocalController() <em>Local Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalController()
	 * @generated
	 * @ordered
	 */
	protected Controller localController;

	/**
	 * The default value of the '{@link #isActivable() <em>Activable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActivable() <em>Activable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivable()
	 * @generated
	 * @ordered
	 */
	protected boolean activable = ACTIVABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CfaPackage.Literals.EQUIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConnected() {
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnected(boolean newConnected) {
		boolean oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.EQUIPMENT__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller getLocalController() {
		return localController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalController(Controller newLocalController, NotificationChain msgs) {
		Controller oldLocalController = localController;
		localController = newLocalController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfaPackage.EQUIPMENT__LOCAL_CONTROLLER, oldLocalController, newLocalController);
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
	public void setLocalController(Controller newLocalController) {
		if (newLocalController != localController) {
			NotificationChain msgs = null;
			if (localController != null)
				msgs = ((InternalEObject)localController).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfaPackage.EQUIPMENT__LOCAL_CONTROLLER, null, msgs);
			if (newLocalController != null)
				msgs = ((InternalEObject)newLocalController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfaPackage.EQUIPMENT__LOCAL_CONTROLLER, null, msgs);
			msgs = basicSetLocalController(newLocalController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.EQUIPMENT__LOCAL_CONTROLLER, newLocalController, newLocalController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActivable() {
		return activable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivable(boolean newActivable) {
		boolean oldActivable = activable;
		activable = newActivable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.EQUIPMENT__ACTIVABLE, oldActivable, activable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfaPackage.EQUIPMENT__LOCAL_CONTROLLER:
				return basicSetLocalController(null, msgs);
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
			case CfaPackage.EQUIPMENT__CONNECTED:
				return isConnected();
			case CfaPackage.EQUIPMENT__LOCAL_CONTROLLER:
				return getLocalController();
			case CfaPackage.EQUIPMENT__ACTIVABLE:
				return isActivable();
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
			case CfaPackage.EQUIPMENT__CONNECTED:
				setConnected((Boolean)newValue);
				return;
			case CfaPackage.EQUIPMENT__LOCAL_CONTROLLER:
				setLocalController((Controller)newValue);
				return;
			case CfaPackage.EQUIPMENT__ACTIVABLE:
				setActivable((Boolean)newValue);
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
			case CfaPackage.EQUIPMENT__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
				return;
			case CfaPackage.EQUIPMENT__LOCAL_CONTROLLER:
				setLocalController((Controller)null);
				return;
			case CfaPackage.EQUIPMENT__ACTIVABLE:
				setActivable(ACTIVABLE_EDEFAULT);
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
			case CfaPackage.EQUIPMENT__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
			case CfaPackage.EQUIPMENT__LOCAL_CONTROLLER:
				return localController != null;
			case CfaPackage.EQUIPMENT__ACTIVABLE:
				return activable != ACTIVABLE_EDEFAULT;
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
		result.append(" (connected: ");
		result.append(connected);
		result.append(", activable: ");
		result.append(activable);
		result.append(')');
		return result.toString();
	}

} //EquipmentImpl
