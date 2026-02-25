/**
 */
package fr.cea.nacre.model.NACREMM.cra.impl;

import fr.cea.nacre.model.NACREMM.CommonType.CommonType;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import fr.cea.nacre.model.NACREMM.cra.CommunicationMedia;
import fr.cea.nacre.model.NACREMM.cra.CraPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.CommunicationMediaImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.CommunicationMediaImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.CommunicationMediaImpl#getCommunicationMedias <em>Communication Medias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationMediaImpl extends UIDElementImpl implements CommunicationMedia {
	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected CommonType latency;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected CommonType capacity;

	/**
	 * The cached value of the '{@link #getCommunicationMedias() <em>Communication Medias</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMedias()
	 * @generated
	 * @ordered
	 */
	protected EList<String> communicationMedias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationMediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CraPackage.Literals.COMMUNICATION_MEDIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonType getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatency(CommonType newLatency, NotificationChain msgs) {
		CommonType oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CraPackage.COMMUNICATION_MEDIA__LATENCY, oldLatency, newLatency);
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
	public void setLatency(CommonType newLatency) {
		if (newLatency != latency) {
			NotificationChain msgs = null;
			if (latency != null)
				msgs = ((InternalEObject)latency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CraPackage.COMMUNICATION_MEDIA__LATENCY, null, msgs);
			if (newLatency != null)
				msgs = ((InternalEObject)newLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CraPackage.COMMUNICATION_MEDIA__LATENCY, null, msgs);
			msgs = basicSetLatency(newLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CraPackage.COMMUNICATION_MEDIA__LATENCY, newLatency, newLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonType getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacity(CommonType newCapacity, NotificationChain msgs) {
		CommonType oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CraPackage.COMMUNICATION_MEDIA__CAPACITY, oldCapacity, newCapacity);
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
	public void setCapacity(CommonType newCapacity) {
		if (newCapacity != capacity) {
			NotificationChain msgs = null;
			if (capacity != null)
				msgs = ((InternalEObject)capacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CraPackage.COMMUNICATION_MEDIA__CAPACITY, null, msgs);
			if (newCapacity != null)
				msgs = ((InternalEObject)newCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CraPackage.COMMUNICATION_MEDIA__CAPACITY, null, msgs);
			msgs = basicSetCapacity(newCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CraPackage.COMMUNICATION_MEDIA__CAPACITY, newCapacity, newCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCommunicationMedias() {
		if (communicationMedias == null) {
			communicationMedias = new EDataTypeUniqueEList<String>(String.class, this, CraPackage.COMMUNICATION_MEDIA__COMMUNICATION_MEDIAS);
		}
		return communicationMedias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CraPackage.COMMUNICATION_MEDIA__LATENCY:
				return basicSetLatency(null, msgs);
			case CraPackage.COMMUNICATION_MEDIA__CAPACITY:
				return basicSetCapacity(null, msgs);
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
			case CraPackage.COMMUNICATION_MEDIA__LATENCY:
				return getLatency();
			case CraPackage.COMMUNICATION_MEDIA__CAPACITY:
				return getCapacity();
			case CraPackage.COMMUNICATION_MEDIA__COMMUNICATION_MEDIAS:
				return getCommunicationMedias();
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
			case CraPackage.COMMUNICATION_MEDIA__LATENCY:
				setLatency((CommonType)newValue);
				return;
			case CraPackage.COMMUNICATION_MEDIA__CAPACITY:
				setCapacity((CommonType)newValue);
				return;
			case CraPackage.COMMUNICATION_MEDIA__COMMUNICATION_MEDIAS:
				getCommunicationMedias().clear();
				getCommunicationMedias().addAll((Collection<? extends String>)newValue);
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
			case CraPackage.COMMUNICATION_MEDIA__LATENCY:
				setLatency((CommonType)null);
				return;
			case CraPackage.COMMUNICATION_MEDIA__CAPACITY:
				setCapacity((CommonType)null);
				return;
			case CraPackage.COMMUNICATION_MEDIA__COMMUNICATION_MEDIAS:
				getCommunicationMedias().clear();
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
			case CraPackage.COMMUNICATION_MEDIA__LATENCY:
				return latency != null;
			case CraPackage.COMMUNICATION_MEDIA__CAPACITY:
				return capacity != null;
			case CraPackage.COMMUNICATION_MEDIA__COMMUNICATION_MEDIAS:
				return communicationMedias != null && !communicationMedias.isEmpty();
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
		result.append(" (communicationMedias: ");
		result.append(communicationMedias);
		result.append(')');
		return result.toString();
	}

} //CommunicationMediaImpl
