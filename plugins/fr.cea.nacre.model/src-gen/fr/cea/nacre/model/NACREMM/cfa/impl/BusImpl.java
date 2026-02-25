/**
 */
package fr.cea.nacre.model.NACREMM.cfa.impl;

import fr.cea.nacre.model.NACREMM.CommonType.CommonType;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import fr.cea.nacre.model.NACREMM.cfa.Battery;
import fr.cea.nacre.model.NACREMM.cfa.Bus;
import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;
import fr.cea.nacre.model.NACREMM.cfa.Generator;
import fr.cea.nacre.model.NACREMM.cfa.Load;
import fr.cea.nacre.model.NACREMM.cfa.RteInstallation;

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
 * An implementation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.BusImpl#getNominalLevel <em>Nominal Level</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.BusImpl#isConnected <em>Connected</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.BusImpl#getGenerators <em>Generators</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.BusImpl#getBatteries <em>Batteries</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.BusImpl#getRteInstallations <em>Rte Installations</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.BusImpl#getLoads <em>Loads</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusImpl extends UIDElementImpl implements Bus {
	/**
	 * The cached value of the '{@link #getNominalLevel() <em>Nominal Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalLevel()
	 * @generated
	 * @ordered
	 */
	protected CommonType nominalLevel;

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
	 * The cached value of the '{@link #getGenerators() <em>Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<Generator> generators;

	/**
	 * The cached value of the '{@link #getBatteries() <em>Batteries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteries()
	 * @generated
	 * @ordered
	 */
	protected EList<Battery> batteries;

	/**
	 * The cached value of the '{@link #getRteInstallations() <em>Rte Installations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRteInstallations()
	 * @generated
	 * @ordered
	 */
	protected EList<RteInstallation> rteInstallations;

	/**
	 * The cached value of the '{@link #getLoads() <em>Loads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoads()
	 * @generated
	 * @ordered
	 */
	protected EList<Load> loads;

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
		return CfaPackage.Literals.BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonType getNominalLevel() {
		return nominalLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNominalLevel(CommonType newNominalLevel, NotificationChain msgs) {
		CommonType oldNominalLevel = nominalLevel;
		nominalLevel = newNominalLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfaPackage.BUS__NOMINAL_LEVEL, oldNominalLevel, newNominalLevel);
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
	public void setNominalLevel(CommonType newNominalLevel) {
		if (newNominalLevel != nominalLevel) {
			NotificationChain msgs = null;
			if (nominalLevel != null)
				msgs = ((InternalEObject)nominalLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfaPackage.BUS__NOMINAL_LEVEL, null, msgs);
			if (newNominalLevel != null)
				msgs = ((InternalEObject)newNominalLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfaPackage.BUS__NOMINAL_LEVEL, null, msgs);
			msgs = basicSetNominalLevel(newNominalLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.BUS__NOMINAL_LEVEL, newNominalLevel, newNominalLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.BUS__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Generator> getGenerators() {
		if (generators == null) {
			generators = new EObjectContainmentEList<Generator>(Generator.class, this, CfaPackage.BUS__GENERATORS);
		}
		return generators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Battery> getBatteries() {
		if (batteries == null) {
			batteries = new EObjectContainmentEList<Battery>(Battery.class, this, CfaPackage.BUS__BATTERIES);
		}
		return batteries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RteInstallation> getRteInstallations() {
		if (rteInstallations == null) {
			rteInstallations = new EObjectContainmentEList<RteInstallation>(RteInstallation.class, this, CfaPackage.BUS__RTE_INSTALLATIONS);
		}
		return rteInstallations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Load> getLoads() {
		if (loads == null) {
			loads = new EObjectContainmentEList<Load>(Load.class, this, CfaPackage.BUS__LOADS);
		}
		return loads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfaPackage.BUS__NOMINAL_LEVEL:
				return basicSetNominalLevel(null, msgs);
			case CfaPackage.BUS__GENERATORS:
				return ((InternalEList<?>)getGenerators()).basicRemove(otherEnd, msgs);
			case CfaPackage.BUS__BATTERIES:
				return ((InternalEList<?>)getBatteries()).basicRemove(otherEnd, msgs);
			case CfaPackage.BUS__RTE_INSTALLATIONS:
				return ((InternalEList<?>)getRteInstallations()).basicRemove(otherEnd, msgs);
			case CfaPackage.BUS__LOADS:
				return ((InternalEList<?>)getLoads()).basicRemove(otherEnd, msgs);
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
			case CfaPackage.BUS__NOMINAL_LEVEL:
				return getNominalLevel();
			case CfaPackage.BUS__CONNECTED:
				return isConnected();
			case CfaPackage.BUS__GENERATORS:
				return getGenerators();
			case CfaPackage.BUS__BATTERIES:
				return getBatteries();
			case CfaPackage.BUS__RTE_INSTALLATIONS:
				return getRteInstallations();
			case CfaPackage.BUS__LOADS:
				return getLoads();
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
			case CfaPackage.BUS__NOMINAL_LEVEL:
				setNominalLevel((CommonType)newValue);
				return;
			case CfaPackage.BUS__CONNECTED:
				setConnected((Boolean)newValue);
				return;
			case CfaPackage.BUS__GENERATORS:
				getGenerators().clear();
				getGenerators().addAll((Collection<? extends Generator>)newValue);
				return;
			case CfaPackage.BUS__BATTERIES:
				getBatteries().clear();
				getBatteries().addAll((Collection<? extends Battery>)newValue);
				return;
			case CfaPackage.BUS__RTE_INSTALLATIONS:
				getRteInstallations().clear();
				getRteInstallations().addAll((Collection<? extends RteInstallation>)newValue);
				return;
			case CfaPackage.BUS__LOADS:
				getLoads().clear();
				getLoads().addAll((Collection<? extends Load>)newValue);
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
			case CfaPackage.BUS__NOMINAL_LEVEL:
				setNominalLevel((CommonType)null);
				return;
			case CfaPackage.BUS__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
				return;
			case CfaPackage.BUS__GENERATORS:
				getGenerators().clear();
				return;
			case CfaPackage.BUS__BATTERIES:
				getBatteries().clear();
				return;
			case CfaPackage.BUS__RTE_INSTALLATIONS:
				getRteInstallations().clear();
				return;
			case CfaPackage.BUS__LOADS:
				getLoads().clear();
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
			case CfaPackage.BUS__NOMINAL_LEVEL:
				return nominalLevel != null;
			case CfaPackage.BUS__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
			case CfaPackage.BUS__GENERATORS:
				return generators != null && !generators.isEmpty();
			case CfaPackage.BUS__BATTERIES:
				return batteries != null && !batteries.isEmpty();
			case CfaPackage.BUS__RTE_INSTALLATIONS:
				return rteInstallations != null && !rteInstallations.isEmpty();
			case CfaPackage.BUS__LOADS:
				return loads != null && !loads.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //BusImpl
