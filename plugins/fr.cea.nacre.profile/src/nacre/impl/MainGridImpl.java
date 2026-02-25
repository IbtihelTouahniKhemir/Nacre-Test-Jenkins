/**
 */
package nacre.impl;

import java.util.Collection;

import nacre.CentralController;
import nacre.Line;
import nacre.MainGrid;
import nacre.NacrePackage;
import nacre.Substation;
import nacre.Zone;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nacre.impl.MainGridImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link nacre.impl.MainGridImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link nacre.impl.MainGridImpl#getSubstation <em>Substation</em>}</li>
 *   <li>{@link nacre.impl.MainGridImpl#getCentralcontroler <em>Centralcontroler</em>}</li>
 *   <li>{@link nacre.impl.MainGridImpl#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainGridImpl extends MinimalEObjectImpl.Container implements MainGrid {
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
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected EList<Zone> zone;

	/**
	 * The cached value of the '{@link #getSubstation() <em>Substation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstation()
	 * @generated
	 * @ordered
	 */
	protected EList<Substation> substation;

	/**
	 * The cached value of the '{@link #getCentralcontroler() <em>Centralcontroler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentralcontroler()
	 * @generated
	 * @ordered
	 */
	protected CentralController centralcontroler;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> lines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainGridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NacrePackage.Literals.MAIN_GRID;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.MAIN_GRID__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.MAIN_GRID__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Zone> getZone() {
		if (zone == null) {
			zone = new EObjectWithInverseResolvingEList<Zone>(Zone.class, this, NacrePackage.MAIN_GRID__ZONE, NacrePackage.ZONE__MAINGRID);
		}
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Substation> getSubstation() {
		if (substation == null) {
			substation = new EObjectWithInverseResolvingEList<Substation>(Substation.class, this, NacrePackage.MAIN_GRID__SUBSTATION, NacrePackage.SUBSTATION__MAINGRID);
		}
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentralController getCentralcontroler() {
		if (centralcontroler != null && centralcontroler.eIsProxy()) {
			InternalEObject oldCentralcontroler = (InternalEObject)centralcontroler;
			centralcontroler = (CentralController)eResolveProxy(oldCentralcontroler);
			if (centralcontroler != oldCentralcontroler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.MAIN_GRID__CENTRALCONTROLER, oldCentralcontroler, centralcontroler));
			}
		}
		return centralcontroler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentralController basicGetCentralcontroler() {
		return centralcontroler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCentralcontroler(CentralController newCentralcontroler, NotificationChain msgs) {
		CentralController oldCentralcontroler = centralcontroler;
		centralcontroler = newCentralcontroler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.MAIN_GRID__CENTRALCONTROLER, oldCentralcontroler, newCentralcontroler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentralcontroler(CentralController newCentralcontroler) {
		if (newCentralcontroler != centralcontroler) {
			NotificationChain msgs = null;
			if (centralcontroler != null)
				msgs = ((InternalEObject)centralcontroler).eInverseRemove(this, NacrePackage.CENTRAL_CONTROLLER__MAINGRID, CentralController.class, msgs);
			if (newCentralcontroler != null)
				msgs = ((InternalEObject)newCentralcontroler).eInverseAdd(this, NacrePackage.CENTRAL_CONTROLLER__MAINGRID, CentralController.class, msgs);
			msgs = basicSetCentralcontroler(newCentralcontroler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.MAIN_GRID__CENTRALCONTROLER, newCentralcontroler, newCentralcontroler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLines() {
		if (lines == null) {
			lines = new EObjectResolvingEList<Line>(Line.class, this, NacrePackage.MAIN_GRID__LINES);
		}
		return lines;
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
			case NacrePackage.MAIN_GRID__ZONE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getZone()).basicAdd(otherEnd, msgs);
			case NacrePackage.MAIN_GRID__SUBSTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstation()).basicAdd(otherEnd, msgs);
			case NacrePackage.MAIN_GRID__CENTRALCONTROLER:
				if (centralcontroler != null)
					msgs = ((InternalEObject)centralcontroler).eInverseRemove(this, NacrePackage.CENTRAL_CONTROLLER__MAINGRID, CentralController.class, msgs);
				return basicSetCentralcontroler((CentralController)otherEnd, msgs);
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
			case NacrePackage.MAIN_GRID__ZONE:
				return ((InternalEList<?>)getZone()).basicRemove(otherEnd, msgs);
			case NacrePackage.MAIN_GRID__SUBSTATION:
				return ((InternalEList<?>)getSubstation()).basicRemove(otherEnd, msgs);
			case NacrePackage.MAIN_GRID__CENTRALCONTROLER:
				return basicSetCentralcontroler(null, msgs);
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
			case NacrePackage.MAIN_GRID__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case NacrePackage.MAIN_GRID__ZONE:
				return getZone();
			case NacrePackage.MAIN_GRID__SUBSTATION:
				return getSubstation();
			case NacrePackage.MAIN_GRID__CENTRALCONTROLER:
				if (resolve) return getCentralcontroler();
				return basicGetCentralcontroler();
			case NacrePackage.MAIN_GRID__LINES:
				return getLines();
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
			case NacrePackage.MAIN_GRID__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case NacrePackage.MAIN_GRID__ZONE:
				getZone().clear();
				getZone().addAll((Collection<? extends Zone>)newValue);
				return;
			case NacrePackage.MAIN_GRID__SUBSTATION:
				getSubstation().clear();
				getSubstation().addAll((Collection<? extends Substation>)newValue);
				return;
			case NacrePackage.MAIN_GRID__CENTRALCONTROLER:
				setCentralcontroler((CentralController)newValue);
				return;
			case NacrePackage.MAIN_GRID__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends Line>)newValue);
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
			case NacrePackage.MAIN_GRID__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case NacrePackage.MAIN_GRID__ZONE:
				getZone().clear();
				return;
			case NacrePackage.MAIN_GRID__SUBSTATION:
				getSubstation().clear();
				return;
			case NacrePackage.MAIN_GRID__CENTRALCONTROLER:
				setCentralcontroler((CentralController)null);
				return;
			case NacrePackage.MAIN_GRID__LINES:
				getLines().clear();
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
			case NacrePackage.MAIN_GRID__BASE_CLASS:
				return base_Class != null;
			case NacrePackage.MAIN_GRID__ZONE:
				return zone != null && !zone.isEmpty();
			case NacrePackage.MAIN_GRID__SUBSTATION:
				return substation != null && !substation.isEmpty();
			case NacrePackage.MAIN_GRID__CENTRALCONTROLER:
				return centralcontroler != null;
			case NacrePackage.MAIN_GRID__LINES:
				return lines != null && !lines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MainGridImpl
