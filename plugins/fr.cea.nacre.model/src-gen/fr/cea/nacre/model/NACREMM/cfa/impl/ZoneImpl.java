/**
 */
package fr.cea.nacre.model.NACREMM.cfa.impl;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;
import fr.cea.nacre.model.NACREMM.cfa.Controller;
import fr.cea.nacre.model.NACREMM.cfa.Substation;
import fr.cea.nacre.model.NACREMM.cfa.Zone;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.ZoneImpl#getSubstations <em>Substations</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.ZoneImpl#getZonalController <em>Zonal Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneImpl extends UIDElementImpl implements Zone {
	/**
	 * The cached value of the '{@link #getSubstations() <em>Substations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstations()
	 * @generated
	 * @ordered
	 */
	protected EList<Substation> substations;

	/**
	 * The cached value of the '{@link #getZonalController() <em>Zonal Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonalController()
	 * @generated
	 * @ordered
	 */
	protected Controller zonalController;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CfaPackage.Literals.ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Substation> getSubstations() {
		if (substations == null) {
			substations = new EObjectContainmentEList<Substation>(Substation.class, this, CfaPackage.ZONE__SUBSTATIONS);
		}
		return substations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller getZonalController() {
		return zonalController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZonalController(Controller newZonalController, NotificationChain msgs) {
		Controller oldZonalController = zonalController;
		zonalController = newZonalController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfaPackage.ZONE__ZONAL_CONTROLLER, oldZonalController, newZonalController);
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
	public void setZonalController(Controller newZonalController) {
		if (newZonalController != zonalController) {
			NotificationChain msgs = null;
			if (zonalController != null)
				msgs = ((InternalEObject)zonalController).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfaPackage.ZONE__ZONAL_CONTROLLER, null, msgs);
			if (newZonalController != null)
				msgs = ((InternalEObject)newZonalController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfaPackage.ZONE__ZONAL_CONTROLLER, null, msgs);
			msgs = basicSetZonalController(newZonalController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.ZONE__ZONAL_CONTROLLER, newZonalController, newZonalController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfaPackage.ZONE__SUBSTATIONS:
				return ((InternalEList<?>)getSubstations()).basicRemove(otherEnd, msgs);
			case CfaPackage.ZONE__ZONAL_CONTROLLER:
				return basicSetZonalController(null, msgs);
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
			case CfaPackage.ZONE__SUBSTATIONS:
				return getSubstations();
			case CfaPackage.ZONE__ZONAL_CONTROLLER:
				return getZonalController();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CfaPackage.ZONE__SUBSTATIONS:
				getSubstations().clear();
				getSubstations().addAll((Collection<? extends Substation>)newValue);
				return;
			case CfaPackage.ZONE__ZONAL_CONTROLLER:
				setZonalController((Controller)newValue);
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
			case CfaPackage.ZONE__SUBSTATIONS:
				getSubstations().clear();
				return;
			case CfaPackage.ZONE__ZONAL_CONTROLLER:
				setZonalController((Controller)null);
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
			case CfaPackage.ZONE__SUBSTATIONS:
				return substations != null && !substations.isEmpty();
			case CfaPackage.ZONE__ZONAL_CONTROLLER:
				return zonalController != null;
		}
		return super.eIsSet(featureID);
	}

} //ZoneImpl
