/**
 */
package fr.cea.nacre.model.NACREMM.Hazard.impl;

import fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard;
import fr.cea.nacre.model.NACREMM.Hazard.CraHazard;
import fr.cea.nacre.model.NACREMM.Hazard.HazardPackage;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

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
 * An implementation of the model object '<em><b>Cra Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.impl.CraHazardImpl#getCra <em>Cra</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.impl.CraHazardImpl#getCommunicationHazards <em>Communication Hazards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CraHazardImpl extends UIDElementImpl implements CraHazard {
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
	 * The cached value of the '{@link #getCommunicationHazards() <em>Communication Hazards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationHazard> communicationHazards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CraHazardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HazardPackage.Literals.CRA_HAZARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.CRA_HAZARD__CRA, oldCra, cra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationHazard> getCommunicationHazards() {
		if (communicationHazards == null) {
			communicationHazards = new EObjectContainmentEList<CommunicationHazard>(CommunicationHazard.class, this, HazardPackage.CRA_HAZARD__COMMUNICATION_HAZARDS);
		}
		return communicationHazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HazardPackage.CRA_HAZARD__COMMUNICATION_HAZARDS:
				return ((InternalEList<?>)getCommunicationHazards()).basicRemove(otherEnd, msgs);
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
			case HazardPackage.CRA_HAZARD__CRA:
				return getCra();
			case HazardPackage.CRA_HAZARD__COMMUNICATION_HAZARDS:
				return getCommunicationHazards();
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
			case HazardPackage.CRA_HAZARD__CRA:
				setCra((String)newValue);
				return;
			case HazardPackage.CRA_HAZARD__COMMUNICATION_HAZARDS:
				getCommunicationHazards().clear();
				getCommunicationHazards().addAll((Collection<? extends CommunicationHazard>)newValue);
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
			case HazardPackage.CRA_HAZARD__CRA:
				setCra(CRA_EDEFAULT);
				return;
			case HazardPackage.CRA_HAZARD__COMMUNICATION_HAZARDS:
				getCommunicationHazards().clear();
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
			case HazardPackage.CRA_HAZARD__CRA:
				return CRA_EDEFAULT == null ? cra != null : !CRA_EDEFAULT.equals(cra);
			case HazardPackage.CRA_HAZARD__COMMUNICATION_HAZARDS:
				return communicationHazards != null && !communicationHazards.isEmpty();
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

} //CraHazardImpl
