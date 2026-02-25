/**
 */
package nacre.impl;

import nacre.Equipement;
import nacre.LocalController;
import nacre.NacrePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nacre.impl.LocalControllerImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link nacre.impl.LocalControllerImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link nacre.impl.LocalControllerImpl#getEquipement <em>Equipement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalControllerImpl extends ControllerImpl implements LocalController {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * The cached value of the '{@link #getEquipement() <em>Equipement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipement()
	 * @generated
	 * @ordered
	 */
	protected Equipement equipement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NacrePackage.Literals.LOCAL_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.LOCAL_CONTROLLER__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.LOCAL_CONTROLLER__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.LOCAL_CONTROLLER__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.LOCAL_CONTROLLER__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipement getEquipement() {
		if (equipement != null && equipement.eIsProxy()) {
			InternalEObject oldEquipement = (InternalEObject)equipement;
			equipement = (Equipement)eResolveProxy(oldEquipement);
			if (equipement != oldEquipement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.LOCAL_CONTROLLER__EQUIPEMENT, oldEquipement, equipement));
			}
		}
		return equipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipement basicGetEquipement() {
		return equipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquipement(Equipement newEquipement, NotificationChain msgs) {
		Equipement oldEquipement = equipement;
		equipement = newEquipement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.LOCAL_CONTROLLER__EQUIPEMENT, oldEquipement, newEquipement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipement(Equipement newEquipement) {
		if (newEquipement != equipement) {
			NotificationChain msgs = null;
			if (equipement != null)
				msgs = ((InternalEObject)equipement).eInverseRemove(this, NacrePackage.EQUIPEMENT__LOCALCONTROLLER, Equipement.class, msgs);
			if (newEquipement != null)
				msgs = ((InternalEObject)newEquipement).eInverseAdd(this, NacrePackage.EQUIPEMENT__LOCALCONTROLLER, Equipement.class, msgs);
			msgs = basicSetEquipement(newEquipement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.LOCAL_CONTROLLER__EQUIPEMENT, newEquipement, newEquipement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NacrePackage.LOCAL_CONTROLLER__EQUIPEMENT:
				if (equipement != null)
					msgs = ((InternalEObject)equipement).eInverseRemove(this, NacrePackage.EQUIPEMENT__LOCALCONTROLLER, Equipement.class, msgs);
				return basicSetEquipement((Equipement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NacrePackage.LOCAL_CONTROLLER__EQUIPEMENT:
				return basicSetEquipement(null, msgs);
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
			case NacrePackage.LOCAL_CONTROLLER__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case NacrePackage.LOCAL_CONTROLLER__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case NacrePackage.LOCAL_CONTROLLER__EQUIPEMENT:
				if (resolve) return getEquipement();
				return basicGetEquipement();
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
			case NacrePackage.LOCAL_CONTROLLER__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case NacrePackage.LOCAL_CONTROLLER__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case NacrePackage.LOCAL_CONTROLLER__EQUIPEMENT:
				setEquipement((Equipement)newValue);
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
			case NacrePackage.LOCAL_CONTROLLER__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case NacrePackage.LOCAL_CONTROLLER__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case NacrePackage.LOCAL_CONTROLLER__EQUIPEMENT:
				setEquipement((Equipement)null);
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
			case NacrePackage.LOCAL_CONTROLLER__BASE_CLASS:
				return base_Class != null;
			case NacrePackage.LOCAL_CONTROLLER__BASE_PROPERTY:
				return base_Property != null;
			case NacrePackage.LOCAL_CONTROLLER__EQUIPEMENT:
				return equipement != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalControllerImpl
