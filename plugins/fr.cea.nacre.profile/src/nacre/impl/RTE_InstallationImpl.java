/**
 */
package nacre.impl;

import nacre.Line;
import nacre.NFP_IST;
import nacre.NFP_Voltage;
import nacre.NacrePackage;
import nacre.RTE_Installation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTE Installation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nacre.impl.RTE_InstallationImpl#getV <em>V</em>}</li>
 *   <li>{@link nacre.impl.RTE_InstallationImpl#getEnd <em>End</em>}</li>
 *   <li>{@link nacre.impl.RTE_InstallationImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link nacre.impl.RTE_InstallationImpl#getSide <em>Side</em>}</li>
 *   <li>{@link nacre.impl.RTE_InstallationImpl#getIst <em>Ist</em>}</li>
 *   <li>{@link nacre.impl.RTE_InstallationImpl#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RTE_InstallationImpl extends EquipementImpl implements RTE_Installation {
	/**
	 * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected NFP_Voltage v;

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
	protected NFP_IST ist;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected Line line;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTE_InstallationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NacrePackage.Literals.RTE_INSTALLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Voltage getV() {
		return v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetV(NFP_Voltage newV, NotificationChain msgs) {
		NFP_Voltage oldV = v;
		v = newV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.RTE_INSTALLATION__V, oldV, newV);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV(NFP_Voltage newV) {
		if (newV != v) {
			NotificationChain msgs = null;
			if (v != null)
				msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NacrePackage.RTE_INSTALLATION__V, null, msgs);
			if (newV != null)
				msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NacrePackage.RTE_INSTALLATION__V, null, msgs);
			msgs = basicSetV(newV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.RTE_INSTALLATION__V, newV, newV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(String newEnd) {
		String oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.RTE_INSTALLATION__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranch(String newBranch) {
		String oldBranch = branch;
		branch = newBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.RTE_INSTALLATION__BRANCH, oldBranch, branch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSide() {
		return side;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSide(int newSide) {
		int oldSide = side;
		side = newSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.RTE_INSTALLATION__SIDE, oldSide, side));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_IST getIst() {
		return ist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIst(NFP_IST newIst, NotificationChain msgs) {
		NFP_IST oldIst = ist;
		ist = newIst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NacrePackage.RTE_INSTALLATION__IST, oldIst, newIst);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIst(NFP_IST newIst) {
		if (newIst != ist) {
			NotificationChain msgs = null;
			if (ist != null)
				msgs = ((InternalEObject)ist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NacrePackage.RTE_INSTALLATION__IST, null, msgs);
			if (newIst != null)
				msgs = ((InternalEObject)newIst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NacrePackage.RTE_INSTALLATION__IST, null, msgs);
			msgs = basicSetIst(newIst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.RTE_INSTALLATION__IST, newIst, newIst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getLine() {
		if (line != null && line.eIsProxy()) {
			InternalEObject oldLine = (InternalEObject)line;
			line = (Line)eResolveProxy(oldLine);
			if (line != oldLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.RTE_INSTALLATION__LINE, oldLine, line));
			}
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line basicGetLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(Line newLine) {
		Line oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.RTE_INSTALLATION__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NacrePackage.RTE_INSTALLATION__V:
				return basicSetV(null, msgs);
			case NacrePackage.RTE_INSTALLATION__IST:
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
			case NacrePackage.RTE_INSTALLATION__V:
				return getV();
			case NacrePackage.RTE_INSTALLATION__END:
				return getEnd();
			case NacrePackage.RTE_INSTALLATION__BRANCH:
				return getBranch();
			case NacrePackage.RTE_INSTALLATION__SIDE:
				return getSide();
			case NacrePackage.RTE_INSTALLATION__IST:
				return getIst();
			case NacrePackage.RTE_INSTALLATION__LINE:
				if (resolve) return getLine();
				return basicGetLine();
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
			case NacrePackage.RTE_INSTALLATION__V:
				setV((NFP_Voltage)newValue);
				return;
			case NacrePackage.RTE_INSTALLATION__END:
				setEnd((String)newValue);
				return;
			case NacrePackage.RTE_INSTALLATION__BRANCH:
				setBranch((String)newValue);
				return;
			case NacrePackage.RTE_INSTALLATION__SIDE:
				setSide((Integer)newValue);
				return;
			case NacrePackage.RTE_INSTALLATION__IST:
				setIst((NFP_IST)newValue);
				return;
			case NacrePackage.RTE_INSTALLATION__LINE:
				setLine((Line)newValue);
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
			case NacrePackage.RTE_INSTALLATION__V:
				setV((NFP_Voltage)null);
				return;
			case NacrePackage.RTE_INSTALLATION__END:
				setEnd(END_EDEFAULT);
				return;
			case NacrePackage.RTE_INSTALLATION__BRANCH:
				setBranch(BRANCH_EDEFAULT);
				return;
			case NacrePackage.RTE_INSTALLATION__SIDE:
				setSide(SIDE_EDEFAULT);
				return;
			case NacrePackage.RTE_INSTALLATION__IST:
				setIst((NFP_IST)null);
				return;
			case NacrePackage.RTE_INSTALLATION__LINE:
				setLine((Line)null);
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
			case NacrePackage.RTE_INSTALLATION__V:
				return v != null;
			case NacrePackage.RTE_INSTALLATION__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case NacrePackage.RTE_INSTALLATION__BRANCH:
				return BRANCH_EDEFAULT == null ? branch != null : !BRANCH_EDEFAULT.equals(branch);
			case NacrePackage.RTE_INSTALLATION__SIDE:
				return side != SIDE_EDEFAULT;
			case NacrePackage.RTE_INSTALLATION__IST:
				return ist != null;
			case NacrePackage.RTE_INSTALLATION__LINE:
				return line != null;
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
		result.append(" (end: ");
		result.append(end);
		result.append(", branch: ");
		result.append(branch);
		result.append(", side: ");
		result.append(side);
		result.append(')');
		return result.toString();
	}

} //RTE_InstallationImpl
