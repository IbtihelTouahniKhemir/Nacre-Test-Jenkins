/**
 */
package nacre.impl;

import nacre.Bus;
import nacre.Equipement;
import nacre.LocalController;
import nacre.NFP_Power;
import nacre.NacrePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nacre.impl.EquipementImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link nacre.impl.EquipementImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link nacre.impl.EquipementImpl#isConnected <em>Connected</em>}</li>
 *   <li>{@link nacre.impl.EquipementImpl#isActivable <em>Activable</em>}</li>
 *   <li>{@link nacre.impl.EquipementImpl#getP <em>P</em>}</li>
 *   <li>{@link nacre.impl.EquipementImpl#getQ <em>Q</em>}</li>
 *   <li>{@link nacre.impl.EquipementImpl#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link nacre.impl.EquipementImpl#getLocalcontroller <em>Localcontroller</em>}</li>
 *   <li>{@link nacre.impl.EquipementImpl#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EquipementImpl extends MinimalEObjectImpl.Container implements Equipement {
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
	 * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTED_EDEFAULT = true;

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
	 * The default value of the '{@link #isActivable() <em>Activable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVABLE_EDEFAULT = true;

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
	 * The cached value of the '{@link #getP() <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected NFP_Power p;

	/**
	 * The cached value of the '{@link #getQ() <em>Q</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected NFP_Power q;

	/**
	 * The cached value of the '{@link #getBase_Port() <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Port()
	 * @generated
	 * @ordered
	 */
	protected Port base_Port;

	/**
	 * The cached value of the '{@link #getLocalcontroller() <em>Localcontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalcontroller()
	 * @generated
	 * @ordered
	 */
	protected LocalController localcontroller;

	/**
	 * The cached value of the '{@link #getBus() <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected Bus bus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquipementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NacrePackage.Literals.EQUIPEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.EQUIPEMENT__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.EQUIPEMENT__BASE_CLASS, oldBase_Class, base_Class));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.EQUIPEMENT__BASE_PROPERTY, oldBase_Property, base_Property));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.EQUIPEMENT__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnected(boolean newConnected) {
		boolean oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.EQUIPEMENT__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActivable() {
		return activable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivable(boolean newActivable) {
		boolean oldActivable = activable;
		activable = newActivable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.EQUIPEMENT__ACTIVABLE, oldActivable, activable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Power getP() {
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetP(NFP_Power newP, NotificationChain msgs) {
		NFP_Power oldP = p;
		p = newP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.EQUIPEMENT__P, oldP, newP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP(NFP_Power newP) {
		if (newP != p) {
			NotificationChain msgs = null;
			if (p != null)
				msgs = ((InternalEObject)p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NacrePackage.EQUIPEMENT__P, null, msgs);
			if (newP != null)
				msgs = ((InternalEObject)newP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NacrePackage.EQUIPEMENT__P, null, msgs);
			msgs = basicSetP(newP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.EQUIPEMENT__P, newP, newP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Power getQ() {
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQ(NFP_Power newQ, NotificationChain msgs) {
		NFP_Power oldQ = q;
		q = newQ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.EQUIPEMENT__Q, oldQ, newQ);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQ(NFP_Power newQ) {
		if (newQ != q) {
			NotificationChain msgs = null;
			if (q != null)
				msgs = ((InternalEObject)q).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NacrePackage.EQUIPEMENT__Q, null, msgs);
			if (newQ != null)
				msgs = ((InternalEObject)newQ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NacrePackage.EQUIPEMENT__Q, null, msgs);
			msgs = basicSetQ(newQ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.EQUIPEMENT__Q, newQ, newQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getBase_Port() {
		if (base_Port != null && base_Port.eIsProxy()) {
			InternalEObject oldBase_Port = (InternalEObject)base_Port;
			base_Port = (Port)eResolveProxy(oldBase_Port);
			if (base_Port != oldBase_Port) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.EQUIPEMENT__BASE_PORT, oldBase_Port, base_Port));
			}
		}
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetBase_Port() {
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Port(Port newBase_Port) {
		Port oldBase_Port = base_Port;
		base_Port = newBase_Port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.EQUIPEMENT__BASE_PORT, oldBase_Port, base_Port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalController getLocalcontroller() {
		if (localcontroller != null && localcontroller.eIsProxy()) {
			InternalEObject oldLocalcontroller = (InternalEObject)localcontroller;
			localcontroller = (LocalController)eResolveProxy(oldLocalcontroller);
			if (localcontroller != oldLocalcontroller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.EQUIPEMENT__LOCALCONTROLLER, oldLocalcontroller, localcontroller));
			}
		}
		return localcontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalController basicGetLocalcontroller() {
		return localcontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalcontroller(LocalController newLocalcontroller, NotificationChain msgs) {
		LocalController oldLocalcontroller = localcontroller;
		localcontroller = newLocalcontroller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.EQUIPEMENT__LOCALCONTROLLER, oldLocalcontroller, newLocalcontroller);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalcontroller(LocalController newLocalcontroller) {
		if (newLocalcontroller != localcontroller) {
			NotificationChain msgs = null;
			if (localcontroller != null)
				msgs = ((InternalEObject)localcontroller).eInverseRemove(this, NacrePackage.LOCAL_CONTROLLER__EQUIPEMENT, LocalController.class, msgs);
			if (newLocalcontroller != null)
				msgs = ((InternalEObject)newLocalcontroller).eInverseAdd(this, NacrePackage.LOCAL_CONTROLLER__EQUIPEMENT, LocalController.class, msgs);
			msgs = basicSetLocalcontroller(newLocalcontroller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.EQUIPEMENT__LOCALCONTROLLER, newLocalcontroller, newLocalcontroller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus getBus() {
		if (bus != null && bus.eIsProxy()) {
			InternalEObject oldBus = (InternalEObject)bus;
			bus = (Bus)eResolveProxy(oldBus);
			if (bus != oldBus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.EQUIPEMENT__BUS, oldBus, bus));
			}
		}
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus basicGetBus() {
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBus(Bus newBus, NotificationChain msgs) {
		Bus oldBus = bus;
		bus = newBus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.EQUIPEMENT__BUS, oldBus, newBus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBus(Bus newBus) {
		if (newBus != bus) {
			NotificationChain msgs = null;
			if (bus != null)
				msgs = ((InternalEObject)bus).eInverseRemove(this, NacrePackage.BUS__EQUIPEMENT, Bus.class, msgs);
			if (newBus != null)
				msgs = ((InternalEObject)newBus).eInverseAdd(this, NacrePackage.BUS__EQUIPEMENT, Bus.class, msgs);
			msgs = basicSetBus(newBus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.EQUIPEMENT__BUS, newBus, newBus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NacrePackage.EQUIPEMENT__LOCALCONTROLLER:
				if (localcontroller != null)
					msgs = ((InternalEObject)localcontroller).eInverseRemove(this, NacrePackage.LOCAL_CONTROLLER__EQUIPEMENT, LocalController.class, msgs);
				return basicSetLocalcontroller((LocalController)otherEnd, msgs);
			case NacrePackage.EQUIPEMENT__BUS:
				if (bus != null)
					msgs = ((InternalEObject)bus).eInverseRemove(this, NacrePackage.BUS__EQUIPEMENT, Bus.class, msgs);
				return basicSetBus((Bus)otherEnd, msgs);
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
			case NacrePackage.EQUIPEMENT__P:
				return basicSetP(null, msgs);
			case NacrePackage.EQUIPEMENT__Q:
				return basicSetQ(null, msgs);
			case NacrePackage.EQUIPEMENT__LOCALCONTROLLER:
				return basicSetLocalcontroller(null, msgs);
			case NacrePackage.EQUIPEMENT__BUS:
				return basicSetBus(null, msgs);
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
			case NacrePackage.EQUIPEMENT__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case NacrePackage.EQUIPEMENT__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case NacrePackage.EQUIPEMENT__CONNECTED:
				return isConnected();
			case NacrePackage.EQUIPEMENT__ACTIVABLE:
				return isActivable();
			case NacrePackage.EQUIPEMENT__P:
				return getP();
			case NacrePackage.EQUIPEMENT__Q:
				return getQ();
			case NacrePackage.EQUIPEMENT__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
			case NacrePackage.EQUIPEMENT__LOCALCONTROLLER:
				if (resolve) return getLocalcontroller();
				return basicGetLocalcontroller();
			case NacrePackage.EQUIPEMENT__BUS:
				if (resolve) return getBus();
				return basicGetBus();
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
			case NacrePackage.EQUIPEMENT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case NacrePackage.EQUIPEMENT__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case NacrePackage.EQUIPEMENT__CONNECTED:
				setConnected((Boolean)newValue);
				return;
			case NacrePackage.EQUIPEMENT__ACTIVABLE:
				setActivable((Boolean)newValue);
				return;
			case NacrePackage.EQUIPEMENT__P:
				setP((NFP_Power)newValue);
				return;
			case NacrePackage.EQUIPEMENT__Q:
				setQ((NFP_Power)newValue);
				return;
			case NacrePackage.EQUIPEMENT__BASE_PORT:
				setBase_Port((Port)newValue);
				return;
			case NacrePackage.EQUIPEMENT__LOCALCONTROLLER:
				setLocalcontroller((LocalController)newValue);
				return;
			case NacrePackage.EQUIPEMENT__BUS:
				setBus((Bus)newValue);
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
			case NacrePackage.EQUIPEMENT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case NacrePackage.EQUIPEMENT__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case NacrePackage.EQUIPEMENT__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
				return;
			case NacrePackage.EQUIPEMENT__ACTIVABLE:
				setActivable(ACTIVABLE_EDEFAULT);
				return;
			case NacrePackage.EQUIPEMENT__P:
				setP((NFP_Power)null);
				return;
			case NacrePackage.EQUIPEMENT__Q:
				setQ((NFP_Power)null);
				return;
			case NacrePackage.EQUIPEMENT__BASE_PORT:
				setBase_Port((Port)null);
				return;
			case NacrePackage.EQUIPEMENT__LOCALCONTROLLER:
				setLocalcontroller((LocalController)null);
				return;
			case NacrePackage.EQUIPEMENT__BUS:
				setBus((Bus)null);
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
			case NacrePackage.EQUIPEMENT__BASE_CLASS:
				return base_Class != null;
			case NacrePackage.EQUIPEMENT__BASE_PROPERTY:
				return base_Property != null;
			case NacrePackage.EQUIPEMENT__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
			case NacrePackage.EQUIPEMENT__ACTIVABLE:
				return activable != ACTIVABLE_EDEFAULT;
			case NacrePackage.EQUIPEMENT__P:
				return p != null;
			case NacrePackage.EQUIPEMENT__Q:
				return q != null;
			case NacrePackage.EQUIPEMENT__BASE_PORT:
				return base_Port != null;
			case NacrePackage.EQUIPEMENT__LOCALCONTROLLER:
				return localcontroller != null;
			case NacrePackage.EQUIPEMENT__BUS:
				return bus != null;
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

} //EquipementImpl
