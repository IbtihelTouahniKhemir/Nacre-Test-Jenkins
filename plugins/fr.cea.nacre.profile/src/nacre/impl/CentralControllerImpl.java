/**
 */
package nacre.impl;

import nacre.CentralController;
import nacre.MainGrid;
import nacre.NacrePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Central Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nacre.impl.CentralControllerImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link nacre.impl.CentralControllerImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link nacre.impl.CentralControllerImpl#getMaingrid <em>Maingrid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CentralControllerImpl extends ControllerImpl implements CentralController {
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
	 * The cached value of the '{@link #getMaingrid() <em>Maingrid</em>}' reference.
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
	protected CentralControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NacrePackage.Literals.CENTRAL_CONTROLLER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.CENTRAL_CONTROLLER__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.CENTRAL_CONTROLLER__BASE_CLASS, oldBase_Class, base_Class));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.CENTRAL_CONTROLLER__BASE_PROPERTY, oldBase_Property, base_Property));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.CENTRAL_CONTROLLER__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainGrid getMaingrid() {
		if (maingrid != null && maingrid.eIsProxy()) {
			InternalEObject oldMaingrid = (InternalEObject)maingrid;
			maingrid = (MainGrid)eResolveProxy(oldMaingrid);
			if (maingrid != oldMaingrid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.CENTRAL_CONTROLLER__MAINGRID, oldMaingrid, maingrid));
			}
		}
		return maingrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainGrid basicGetMaingrid() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.CENTRAL_CONTROLLER__MAINGRID, oldMaingrid, newMaingrid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaingrid(MainGrid newMaingrid) {
		if (newMaingrid != maingrid) {
			NotificationChain msgs = null;
			if (maingrid != null)
				msgs = ((InternalEObject)maingrid).eInverseRemove(this, NacrePackage.MAIN_GRID__CENTRALCONTROLER, MainGrid.class, msgs);
			if (newMaingrid != null)
				msgs = ((InternalEObject)newMaingrid).eInverseAdd(this, NacrePackage.MAIN_GRID__CENTRALCONTROLER, MainGrid.class, msgs);
			msgs = basicSetMaingrid(newMaingrid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.CENTRAL_CONTROLLER__MAINGRID, newMaingrid, newMaingrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NacrePackage.CENTRAL_CONTROLLER__MAINGRID:
				if (maingrid != null)
					msgs = ((InternalEObject)maingrid).eInverseRemove(this, NacrePackage.MAIN_GRID__CENTRALCONTROLER, MainGrid.class, msgs);
				return basicSetMaingrid((MainGrid)otherEnd, msgs);
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
			case NacrePackage.CENTRAL_CONTROLLER__MAINGRID:
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
			case NacrePackage.CENTRAL_CONTROLLER__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case NacrePackage.CENTRAL_CONTROLLER__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case NacrePackage.CENTRAL_CONTROLLER__MAINGRID:
				if (resolve) return getMaingrid();
				return basicGetMaingrid();
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
			case NacrePackage.CENTRAL_CONTROLLER__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case NacrePackage.CENTRAL_CONTROLLER__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case NacrePackage.CENTRAL_CONTROLLER__MAINGRID:
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
			case NacrePackage.CENTRAL_CONTROLLER__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case NacrePackage.CENTRAL_CONTROLLER__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case NacrePackage.CENTRAL_CONTROLLER__MAINGRID:
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
			case NacrePackage.CENTRAL_CONTROLLER__BASE_CLASS:
				return base_Class != null;
			case NacrePackage.CENTRAL_CONTROLLER__BASE_PROPERTY:
				return base_Property != null;
			case NacrePackage.CENTRAL_CONTROLLER__MAINGRID:
				return maingrid != null;
		}
		return super.eIsSet(featureID);
	}

} //CentralControllerImpl
