/**
 */
package fr.cea.nacre.model.NACREMM.cfra.impl;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import fr.cea.nacre.model.NACREMM.cfra.Abstraction;
import fr.cea.nacre.model.NACREMM.cfra.Cfra;
import fr.cea.nacre.model.NACREMM.cfra.CfraPackage;

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
 * An implementation of the model object '<em><b>Cfra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfra.impl.CfraImpl#getAbstractions <em>Abstractions</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfra.impl.CfraImpl#getCra <em>Cra</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CfraImpl extends UIDElementImpl implements Cfra {
	/**
	 * The cached value of the '{@link #getAbstractions() <em>Abstractions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractions()
	 * @generated
	 * @ordered
	 */
	protected EList<Abstraction> abstractions;

	/**
	 * The default value of the '{@link #getCra() <em>Cra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCra()
	 * @generated
	 * @ordered
	 */
	protected static final String CRA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCra() <em>Cra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCra()
	 * @generated
	 * @ordered
	 */
	protected String cra = CRA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CfraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CfraPackage.Literals.CFRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Abstraction> getAbstractions() {
		if (abstractions == null) {
			abstractions = new EObjectContainmentEList<Abstraction>(Abstraction.class, this, CfraPackage.CFRA__ABSTRACTIONS);
		}
		return abstractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCra() {
		return cra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCra(String newCra) {
		String oldCra = cra;
		cra = newCra;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfraPackage.CFRA__CRA, oldCra, cra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfraPackage.CFRA__ABSTRACTIONS:
				return ((InternalEList<?>)getAbstractions()).basicRemove(otherEnd, msgs);
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
			case CfraPackage.CFRA__ABSTRACTIONS:
				return getAbstractions();
			case CfraPackage.CFRA__CRA:
				return getCra();
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
			case CfraPackage.CFRA__ABSTRACTIONS:
				getAbstractions().clear();
				getAbstractions().addAll((Collection<? extends Abstraction>)newValue);
				return;
			case CfraPackage.CFRA__CRA:
				setCra((String)newValue);
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
			case CfraPackage.CFRA__ABSTRACTIONS:
				getAbstractions().clear();
				return;
			case CfraPackage.CFRA__CRA:
				setCra(CRA_EDEFAULT);
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
			case CfraPackage.CFRA__ABSTRACTIONS:
				return abstractions != null && !abstractions.isEmpty();
			case CfraPackage.CFRA__CRA:
				return CRA_EDEFAULT == null ? cra != null : !CRA_EDEFAULT.equals(cra);
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
		result.append(" (cra: ");
		result.append(cra);
		result.append(')');
		return result.toString();
	}

} //CfraImpl
