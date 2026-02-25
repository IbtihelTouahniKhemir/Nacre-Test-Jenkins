/**
 */
package fr.cea.nacre.model.NACREMM.cfa.impl;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import fr.cea.nacre.model.NACREMM.cfa.Cfa;
import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;
import fr.cea.nacre.model.NACREMM.cfa.MainGrid;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cfa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.CfaImpl#getMaingrid <em>Maingrid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CfaImpl extends UIDElementImpl implements Cfa {
	/**
	 * The cached value of the '{@link #getMaingrid() <em>Maingrid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaingrid()
	 * @generated
	 * @ordered
	 */
	protected MainGrid maingrid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CfaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CfaPackage.Literals.CFA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainGrid getMaingrid() {
		return maingrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaingrid(MainGrid newMaingrid, NotificationChain msgs) {
		MainGrid oldMaingrid = maingrid;
		maingrid = newMaingrid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfaPackage.CFA__MAINGRID, oldMaingrid, newMaingrid);
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
	public void setMaingrid(MainGrid newMaingrid) {
		if (newMaingrid != maingrid) {
			NotificationChain msgs = null;
			if (maingrid != null)
				msgs = ((InternalEObject)maingrid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfaPackage.CFA__MAINGRID, null, msgs);
			if (newMaingrid != null)
				msgs = ((InternalEObject)newMaingrid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfaPackage.CFA__MAINGRID, null, msgs);
			msgs = basicSetMaingrid(newMaingrid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.CFA__MAINGRID, newMaingrid, newMaingrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfaPackage.CFA__MAINGRID:
				return basicSetMaingrid(null, msgs);
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
			case CfaPackage.CFA__MAINGRID:
				return getMaingrid();
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
			case CfaPackage.CFA__MAINGRID:
				setMaingrid((MainGrid)newValue);
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
			case CfaPackage.CFA__MAINGRID:
				setMaingrid((MainGrid)null);
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
			case CfaPackage.CFA__MAINGRID:
				return maingrid != null;
		}
		return super.eIsSet(featureID);
	}

} //CfaImpl
