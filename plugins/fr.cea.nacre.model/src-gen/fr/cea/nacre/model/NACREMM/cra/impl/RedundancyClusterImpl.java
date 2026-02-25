/**
 */
package fr.cea.nacre.model.NACREMM.cra.impl;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import fr.cea.nacre.model.NACREMM.cra.CraPackage;
import fr.cea.nacre.model.NACREMM.cra.RedundancyCluster;
import fr.cea.nacre.model.NACREMM.cra.RedundancyKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redundancy Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.RedundancyClusterImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.RedundancyClusterImpl#getActive <em>Active</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.RedundancyClusterImpl#getPassive <em>Passive</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.RedundancyClusterImpl#getHypervisor <em>Hypervisor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedundancyClusterImpl extends UIDElementImpl implements RedundancyCluster {
	/**
	 * The default value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final RedundancyKind RUNTIME_EDEFAULT = RedundancyKind.CONSENSUS;

	/**
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected RedundancyKind runtime = RUNTIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected EList<String> active;

	/**
	 * The cached value of the '{@link #getPassive() <em>Passive</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassive()
	 * @generated
	 * @ordered
	 */
	protected EList<String> passive;

	/**
	 * The default value of the '{@link #getHypervisor() <em>Hypervisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor()
	 * @generated
	 * @ordered
	 */
	protected static final String HYPERVISOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHypervisor() <em>Hypervisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor()
	 * @generated
	 * @ordered
	 */
	protected String hypervisor = HYPERVISOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedundancyClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CraPackage.Literals.REDUNDANCY_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RedundancyKind getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntime(RedundancyKind newRuntime) {
		RedundancyKind oldRuntime = runtime;
		runtime = newRuntime == null ? RUNTIME_EDEFAULT : newRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CraPackage.REDUNDANCY_CLUSTER__RUNTIME, oldRuntime, runtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getActive() {
		if (active == null) {
			active = new EDataTypeUniqueEList<String>(String.class, this, CraPackage.REDUNDANCY_CLUSTER__ACTIVE);
		}
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPassive() {
		if (passive == null) {
			passive = new EDataTypeUniqueEList<String>(String.class, this, CraPackage.REDUNDANCY_CLUSTER__PASSIVE);
		}
		return passive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHypervisor() {
		return hypervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHypervisor(String newHypervisor) {
		String oldHypervisor = hypervisor;
		hypervisor = newHypervisor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CraPackage.REDUNDANCY_CLUSTER__HYPERVISOR, oldHypervisor, hypervisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CraPackage.REDUNDANCY_CLUSTER__RUNTIME:
				return getRuntime();
			case CraPackage.REDUNDANCY_CLUSTER__ACTIVE:
				return getActive();
			case CraPackage.REDUNDANCY_CLUSTER__PASSIVE:
				return getPassive();
			case CraPackage.REDUNDANCY_CLUSTER__HYPERVISOR:
				return getHypervisor();
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
			case CraPackage.REDUNDANCY_CLUSTER__RUNTIME:
				setRuntime((RedundancyKind)newValue);
				return;
			case CraPackage.REDUNDANCY_CLUSTER__ACTIVE:
				getActive().clear();
				getActive().addAll((Collection<? extends String>)newValue);
				return;
			case CraPackage.REDUNDANCY_CLUSTER__PASSIVE:
				getPassive().clear();
				getPassive().addAll((Collection<? extends String>)newValue);
				return;
			case CraPackage.REDUNDANCY_CLUSTER__HYPERVISOR:
				setHypervisor((String)newValue);
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
			case CraPackage.REDUNDANCY_CLUSTER__RUNTIME:
				setRuntime(RUNTIME_EDEFAULT);
				return;
			case CraPackage.REDUNDANCY_CLUSTER__ACTIVE:
				getActive().clear();
				return;
			case CraPackage.REDUNDANCY_CLUSTER__PASSIVE:
				getPassive().clear();
				return;
			case CraPackage.REDUNDANCY_CLUSTER__HYPERVISOR:
				setHypervisor(HYPERVISOR_EDEFAULT);
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
			case CraPackage.REDUNDANCY_CLUSTER__RUNTIME:
				return runtime != RUNTIME_EDEFAULT;
			case CraPackage.REDUNDANCY_CLUSTER__ACTIVE:
				return active != null && !active.isEmpty();
			case CraPackage.REDUNDANCY_CLUSTER__PASSIVE:
				return passive != null && !passive.isEmpty();
			case CraPackage.REDUNDANCY_CLUSTER__HYPERVISOR:
				return HYPERVISOR_EDEFAULT == null ? hypervisor != null : !HYPERVISOR_EDEFAULT.equals(hypervisor);
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
		result.append(" (runtime: ");
		result.append(runtime);
		result.append(", active: ");
		result.append(active);
		result.append(", passive: ");
		result.append(passive);
		result.append(", hypervisor: ");
		result.append(hypervisor);
		result.append(')');
		return result.toString();
	}

} //RedundancyClusterImpl
