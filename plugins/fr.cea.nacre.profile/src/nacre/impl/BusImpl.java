/**
 */
package nacre.impl;

import java.util.Collection;

import nacre.Bus;
import nacre.Equipement;
import nacre.NacrePackage;
import nacre.Substation;
import nacre.VoltageLevel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nacre.impl.BusImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link nacre.impl.BusImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link nacre.impl.BusImpl#getNominalLevel <em>Nominal Level</em>}</li>
 *   <li>{@link nacre.impl.BusImpl#isConnected <em>Connected</em>}</li>
 *   <li>{@link nacre.impl.BusImpl#getEquipement <em>Equipement</em>}</li>
 *   <li>{@link nacre.impl.BusImpl#getSubstation <em>Substation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusImpl extends MinimalEObjectImpl.Container implements Bus {
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
	 * The default value of the '{@link #getNominalLevel() <em>Nominal Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalLevel()
	 * @generated
	 * @ordered
	 */
	protected static final VoltageLevel NOMINAL_LEVEL_EDEFAULT = VoltageLevel._63;

	/**
	 * The cached value of the '{@link #getNominalLevel() <em>Nominal Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalLevel()
	 * @generated
	 * @ordered
	 */
	protected VoltageLevel nominalLevel = NOMINAL_LEVEL_EDEFAULT;

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
	 * The cached value of the '{@link #getEquipement() <em>Equipement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipement()
	 * @generated
	 * @ordered
	 */
	protected EList<Equipement> equipement;

	/**
	 * The cached value of the '{@link #getSubstation() <em>Substation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstation()
	 * @generated
	 * @ordered
	 */
	protected Substation substation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NacrePackage.Literals.BUS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.BUS__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.BUS__BASE_CLASS, oldBase_Class, base_Class));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.BUS__BASE_PROPERTY, oldBase_Property, base_Property));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.BUS__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLevel getNominalLevel() {
		return nominalLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalLevel(VoltageLevel newNominalLevel) {
		VoltageLevel oldNominalLevel = nominalLevel;
		nominalLevel = newNominalLevel == null ? NOMINAL_LEVEL_EDEFAULT : newNominalLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.BUS__NOMINAL_LEVEL, oldNominalLevel, nominalLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.BUS__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Equipement> getEquipement() {
		if (equipement == null) {
			equipement = new EObjectWithInverseResolvingEList<Equipement>(Equipement.class, this, NacrePackage.BUS__EQUIPEMENT, NacrePackage.EQUIPEMENT__BUS);
		}
		return equipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation getSubstation() {
		if (substation != null && substation.eIsProxy()) {
			InternalEObject oldSubstation = (InternalEObject)substation;
			substation = (Substation)eResolveProxy(oldSubstation);
			if (substation != oldSubstation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.BUS__SUBSTATION, oldSubstation, substation));
			}
		}
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation basicGetSubstation() {
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstation(Substation newSubstation, NotificationChain msgs) {
		Substation oldSubstation = substation;
		substation = newSubstation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.BUS__SUBSTATION, oldSubstation, newSubstation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstation(Substation newSubstation) {
		if (newSubstation != substation) {
			NotificationChain msgs = null;
			if (substation != null)
				msgs = ((InternalEObject)substation).eInverseRemove(this, NacrePackage.SUBSTATION__BUS, Substation.class, msgs);
			if (newSubstation != null)
				msgs = ((InternalEObject)newSubstation).eInverseAdd(this, NacrePackage.SUBSTATION__BUS, Substation.class, msgs);
			msgs = basicSetSubstation(newSubstation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.BUS__SUBSTATION, newSubstation, newSubstation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NacrePackage.BUS__EQUIPEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquipement()).basicAdd(otherEnd, msgs);
			case NacrePackage.BUS__SUBSTATION:
				if (substation != null)
					msgs = ((InternalEObject)substation).eInverseRemove(this, NacrePackage.SUBSTATION__BUS, Substation.class, msgs);
				return basicSetSubstation((Substation)otherEnd, msgs);
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
			case NacrePackage.BUS__EQUIPEMENT:
				return ((InternalEList<?>)getEquipement()).basicRemove(otherEnd, msgs);
			case NacrePackage.BUS__SUBSTATION:
				return basicSetSubstation(null, msgs);
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
			case NacrePackage.BUS__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case NacrePackage.BUS__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case NacrePackage.BUS__NOMINAL_LEVEL:
				return getNominalLevel();
			case NacrePackage.BUS__CONNECTED:
				return isConnected();
			case NacrePackage.BUS__EQUIPEMENT:
				return getEquipement();
			case NacrePackage.BUS__SUBSTATION:
				if (resolve) return getSubstation();
				return basicGetSubstation();
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
			case NacrePackage.BUS__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case NacrePackage.BUS__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case NacrePackage.BUS__NOMINAL_LEVEL:
				setNominalLevel((VoltageLevel)newValue);
				return;
			case NacrePackage.BUS__CONNECTED:
				setConnected((Boolean)newValue);
				return;
			case NacrePackage.BUS__EQUIPEMENT:
				getEquipement().clear();
				getEquipement().addAll((Collection<? extends Equipement>)newValue);
				return;
			case NacrePackage.BUS__SUBSTATION:
				setSubstation((Substation)newValue);
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
			case NacrePackage.BUS__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case NacrePackage.BUS__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case NacrePackage.BUS__NOMINAL_LEVEL:
				setNominalLevel(NOMINAL_LEVEL_EDEFAULT);
				return;
			case NacrePackage.BUS__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
				return;
			case NacrePackage.BUS__EQUIPEMENT:
				getEquipement().clear();
				return;
			case NacrePackage.BUS__SUBSTATION:
				setSubstation((Substation)null);
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
			case NacrePackage.BUS__BASE_CLASS:
				return base_Class != null;
			case NacrePackage.BUS__BASE_PROPERTY:
				return base_Property != null;
			case NacrePackage.BUS__NOMINAL_LEVEL:
				return nominalLevel != NOMINAL_LEVEL_EDEFAULT;
			case NacrePackage.BUS__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
			case NacrePackage.BUS__EQUIPEMENT:
				return equipement != null && !equipement.isEmpty();
			case NacrePackage.BUS__SUBSTATION:
				return substation != null;
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
		result.append(" (nominalLevel: ");
		result.append(nominalLevel);
		result.append(", connected: ");
		result.append(connected);
		result.append(')');
		return result.toString();
	}

} //BusImpl
