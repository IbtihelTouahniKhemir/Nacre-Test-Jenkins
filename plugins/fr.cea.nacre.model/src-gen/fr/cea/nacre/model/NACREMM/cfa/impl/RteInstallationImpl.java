/**
 */
package fr.cea.nacre.model.NACREMM.cfa.impl;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;
import fr.cea.nacre.model.NACREMM.cfa.Controller;
import fr.cea.nacre.model.NACREMM.cfa.PowerType;
import fr.cea.nacre.model.NACREMM.cfa.RteInstallation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rte Installation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.RteInstallationImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.RteInstallationImpl#isConnected <em>Connected</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.RteInstallationImpl#isActivable <em>Activable</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.RteInstallationImpl#getLocalController <em>Local Controller</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.RteInstallationImpl#getEnd <em>End</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.RteInstallationImpl#getSide <em>Side</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.RteInstallationImpl#getIst <em>Ist</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.RteInstallationImpl#getLineRef <em>Line Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RteInstallationImpl extends UIDElementImpl implements RteInstallation {
	/**
	 * The default value of the '{@link #getBranch() <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected static final String BRANCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBranch() <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected String branch = BRANCH_EDEFAULT;

	/**
	 * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTED_EDEFAULT = false;

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
	protected static final boolean ACTIVABLE_EDEFAULT = false;

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
	 * The cached value of the '{@link #getLocalController() <em>Local Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalController()
	 * @generated
	 * @ordered
	 */
	protected Controller localController;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected String end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected static final int SIDE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected int side = SIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIst() <em>Ist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIst()
	 * @generated
	 * @ordered
	 */
	protected PowerType ist;

	/**
	 * The default value of the '{@link #getLineRef() <em>Line Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineRef()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineRef() <em>Line Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineRef()
	 * @generated
	 * @ordered
	 */
	protected String lineRef = LINE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteInstallationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CfaPackage.Literals.RTE_INSTALLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBranch() {
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranch(String newBranch) {
		String oldBranch = branch;
		branch = newBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.RTE_INSTALLATION__BRANCH, oldBranch, branch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConnected() {
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnected(boolean newConnected) {
		boolean oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.RTE_INSTALLATION__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActivable() {
		return activable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivable(boolean newActivable) {
		boolean oldActivable = activable;
		activable = newActivable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.RTE_INSTALLATION__ACTIVABLE, oldActivable, activable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller getLocalController() {
		return localController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalController(Controller newLocalController, NotificationChain msgs) {
		Controller oldLocalController = localController;
		localController = newLocalController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfaPackage.RTE_INSTALLATION__LOCAL_CONTROLLER, oldLocalController, newLocalController);
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
	public void setLocalController(Controller newLocalController) {
		if (newLocalController != localController) {
			NotificationChain msgs = null;
			if (localController != null)
				msgs = ((InternalEObject)localController).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfaPackage.RTE_INSTALLATION__LOCAL_CONTROLLER, null, msgs);
			if (newLocalController != null)
				msgs = ((InternalEObject)newLocalController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfaPackage.RTE_INSTALLATION__LOCAL_CONTROLLER, null, msgs);
			msgs = basicSetLocalController(newLocalController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.RTE_INSTALLATION__LOCAL_CONTROLLER, newLocalController, newLocalController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(String newEnd) {
		String oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.RTE_INSTALLATION__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSide() {
		return side;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSide(int newSide) {
		int oldSide = side;
		side = newSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.RTE_INSTALLATION__SIDE, oldSide, side));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerType getIst() {
		return ist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIst(PowerType newIst, NotificationChain msgs) {
		PowerType oldIst = ist;
		ist = newIst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfaPackage.RTE_INSTALLATION__IST, oldIst, newIst);
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
	public void setIst(PowerType newIst) {
		if (newIst != ist) {
			NotificationChain msgs = null;
			if (ist != null)
				msgs = ((InternalEObject)ist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfaPackage.RTE_INSTALLATION__IST, null, msgs);
			if (newIst != null)
				msgs = ((InternalEObject)newIst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfaPackage.RTE_INSTALLATION__IST, null, msgs);
			msgs = basicSetIst(newIst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.RTE_INSTALLATION__IST, newIst, newIst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineRef() {
		return lineRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineRef(String newLineRef) {
		String oldLineRef = lineRef;
		lineRef = newLineRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.RTE_INSTALLATION__LINE_REF, oldLineRef, lineRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfaPackage.RTE_INSTALLATION__LOCAL_CONTROLLER:
				return basicSetLocalController(null, msgs);
			case CfaPackage.RTE_INSTALLATION__IST:
				return basicSetIst(null, msgs);
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
			case CfaPackage.RTE_INSTALLATION__BRANCH:
				return getBranch();
			case CfaPackage.RTE_INSTALLATION__CONNECTED:
				return isConnected();
			case CfaPackage.RTE_INSTALLATION__ACTIVABLE:
				return isActivable();
			case CfaPackage.RTE_INSTALLATION__LOCAL_CONTROLLER:
				return getLocalController();
			case CfaPackage.RTE_INSTALLATION__END:
				return getEnd();
			case CfaPackage.RTE_INSTALLATION__SIDE:
				return getSide();
			case CfaPackage.RTE_INSTALLATION__IST:
				return getIst();
			case CfaPackage.RTE_INSTALLATION__LINE_REF:
				return getLineRef();
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
			case CfaPackage.RTE_INSTALLATION__BRANCH:
				setBranch((String)newValue);
				return;
			case CfaPackage.RTE_INSTALLATION__CONNECTED:
				setConnected((Boolean)newValue);
				return;
			case CfaPackage.RTE_INSTALLATION__ACTIVABLE:
				setActivable((Boolean)newValue);
				return;
			case CfaPackage.RTE_INSTALLATION__LOCAL_CONTROLLER:
				setLocalController((Controller)newValue);
				return;
			case CfaPackage.RTE_INSTALLATION__END:
				setEnd((String)newValue);
				return;
			case CfaPackage.RTE_INSTALLATION__SIDE:
				setSide((Integer)newValue);
				return;
			case CfaPackage.RTE_INSTALLATION__IST:
				setIst((PowerType)newValue);
				return;
			case CfaPackage.RTE_INSTALLATION__LINE_REF:
				setLineRef((String)newValue);
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
			case CfaPackage.RTE_INSTALLATION__BRANCH:
				setBranch(BRANCH_EDEFAULT);
				return;
			case CfaPackage.RTE_INSTALLATION__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
				return;
			case CfaPackage.RTE_INSTALLATION__ACTIVABLE:
				setActivable(ACTIVABLE_EDEFAULT);
				return;
			case CfaPackage.RTE_INSTALLATION__LOCAL_CONTROLLER:
				setLocalController((Controller)null);
				return;
			case CfaPackage.RTE_INSTALLATION__END:
				setEnd(END_EDEFAULT);
				return;
			case CfaPackage.RTE_INSTALLATION__SIDE:
				setSide(SIDE_EDEFAULT);
				return;
			case CfaPackage.RTE_INSTALLATION__IST:
				setIst((PowerType)null);
				return;
			case CfaPackage.RTE_INSTALLATION__LINE_REF:
				setLineRef(LINE_REF_EDEFAULT);
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
			case CfaPackage.RTE_INSTALLATION__BRANCH:
				return BRANCH_EDEFAULT == null ? branch != null : !BRANCH_EDEFAULT.equals(branch);
			case CfaPackage.RTE_INSTALLATION__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
			case CfaPackage.RTE_INSTALLATION__ACTIVABLE:
				return activable != ACTIVABLE_EDEFAULT;
			case CfaPackage.RTE_INSTALLATION__LOCAL_CONTROLLER:
				return localController != null;
			case CfaPackage.RTE_INSTALLATION__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case CfaPackage.RTE_INSTALLATION__SIDE:
				return side != SIDE_EDEFAULT;
			case CfaPackage.RTE_INSTALLATION__IST:
				return ist != null;
			case CfaPackage.RTE_INSTALLATION__LINE_REF:
				return LINE_REF_EDEFAULT == null ? lineRef != null : !LINE_REF_EDEFAULT.equals(lineRef);
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
		result.append(" (branch: ");
		result.append(branch);
		result.append(", connected: ");
		result.append(connected);
		result.append(", activable: ");
		result.append(activable);
		result.append(", end: ");
		result.append(end);
		result.append(", side: ");
		result.append(side);
		result.append(", lineRef: ");
		result.append(lineRef);
		result.append(')');
		return result.toString();
	}

} //RteInstallationImpl
