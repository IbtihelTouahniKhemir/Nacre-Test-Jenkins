/**
 */
package nacre.impl;

import java.util.Collection;
import nacre.NacrePackage;
import nacre.RedundancyCluster;
import nacre.RedundancyKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redundancy Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nacre.impl.RedundancyClusterImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link nacre.impl.RedundancyClusterImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link nacre.impl.RedundancyClusterImpl#getActive <em>Active</em>}</li>
 *   <li>{@link nacre.impl.RedundancyClusterImpl#getPassive <em>Passive</em>}</li>
 *   <li>{@link nacre.impl.RedundancyClusterImpl#getHypervisor <em>Hypervisor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedundancyClusterImpl extends MinimalEObjectImpl.Container implements RedundancyCluster {
	/**
	 * The default value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final RedundancyKind RUNTIME_EDEFAULT = RedundancyKind.ACTIVE_STANDBY;

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
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected EList<SwSchedulableResource> active;

	/**
	 * The cached value of the '{@link #getPassive() <em>Passive</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassive()
	 * @generated
	 * @ordered
	 */
	protected EList<SwSchedulableResource> passive;

	/**
	 * The cached value of the '{@link #getHypervisor() <em>Hypervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor()
	 * @generated
	 * @ordered
	 */
	protected SwSchedulableResource hypervisor;

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
		return NacrePackage.Literals.REDUNDANCY_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedundancyKind getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntime(RedundancyKind newRuntime) {
		RedundancyKind oldRuntime = runtime;
		runtime = newRuntime == null ? RUNTIME_EDEFAULT : newRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.REDUNDANCY_CLUSTER__RUNTIME, oldRuntime, runtime));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.REDUNDANCY_CLUSTER__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.REDUNDANCY_CLUSTER__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwSchedulableResource> getActive() {
		if (active == null) {
			active = new EObjectResolvingEList<SwSchedulableResource>(SwSchedulableResource.class, this, NacrePackage.REDUNDANCY_CLUSTER__ACTIVE);
		}
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwSchedulableResource> getPassive() {
		if (passive == null) {
			passive = new EObjectResolvingEList<SwSchedulableResource>(SwSchedulableResource.class, this, NacrePackage.REDUNDANCY_CLUSTER__PASSIVE);
		}
		return passive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwSchedulableResource getHypervisor() {
		if (hypervisor != null && hypervisor.eIsProxy()) {
			InternalEObject oldHypervisor = (InternalEObject)hypervisor;
			hypervisor = (SwSchedulableResource)eResolveProxy(oldHypervisor);
			if (hypervisor != oldHypervisor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NacrePackage.REDUNDANCY_CLUSTER__HYPERVISOR, oldHypervisor, hypervisor));
			}
		}
		return hypervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwSchedulableResource basicGetHypervisor() {
		return hypervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHypervisor(SwSchedulableResource newHypervisor) {
		SwSchedulableResource oldHypervisor = hypervisor;
		hypervisor = newHypervisor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NacrePackage.REDUNDANCY_CLUSTER__HYPERVISOR, oldHypervisor, hypervisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NacrePackage.REDUNDANCY_CLUSTER__RUNTIME:
				return getRuntime();
			case NacrePackage.REDUNDANCY_CLUSTER__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case NacrePackage.REDUNDANCY_CLUSTER__ACTIVE:
				return getActive();
			case NacrePackage.REDUNDANCY_CLUSTER__PASSIVE:
				return getPassive();
			case NacrePackage.REDUNDANCY_CLUSTER__HYPERVISOR:
				if (resolve) return getHypervisor();
				return basicGetHypervisor();
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
			case NacrePackage.REDUNDANCY_CLUSTER__RUNTIME:
				setRuntime((RedundancyKind)newValue);
				return;
			case NacrePackage.REDUNDANCY_CLUSTER__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case NacrePackage.REDUNDANCY_CLUSTER__ACTIVE:
				getActive().clear();
				getActive().addAll((Collection<? extends SwSchedulableResource>)newValue);
				return;
			case NacrePackage.REDUNDANCY_CLUSTER__PASSIVE:
				getPassive().clear();
				getPassive().addAll((Collection<? extends SwSchedulableResource>)newValue);
				return;
			case NacrePackage.REDUNDANCY_CLUSTER__HYPERVISOR:
				setHypervisor((SwSchedulableResource)newValue);
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
			case NacrePackage.REDUNDANCY_CLUSTER__RUNTIME:
				setRuntime(RUNTIME_EDEFAULT);
				return;
			case NacrePackage.REDUNDANCY_CLUSTER__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case NacrePackage.REDUNDANCY_CLUSTER__ACTIVE:
				getActive().clear();
				return;
			case NacrePackage.REDUNDANCY_CLUSTER__PASSIVE:
				getPassive().clear();
				return;
			case NacrePackage.REDUNDANCY_CLUSTER__HYPERVISOR:
				setHypervisor((SwSchedulableResource)null);
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
			case NacrePackage.REDUNDANCY_CLUSTER__RUNTIME:
				return runtime != RUNTIME_EDEFAULT;
			case NacrePackage.REDUNDANCY_CLUSTER__BASE_CLASS:
				return base_Class != null;
			case NacrePackage.REDUNDANCY_CLUSTER__ACTIVE:
				return active != null && !active.isEmpty();
			case NacrePackage.REDUNDANCY_CLUSTER__PASSIVE:
				return passive != null && !passive.isEmpty();
			case NacrePackage.REDUNDANCY_CLUSTER__HYPERVISOR:
				return hypervisor != null;
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
		result.append(')');
		return result.toString();
	}

} //RedundancyClusterImpl
