/**
 */
package fr.cea.nacre.model.NACREMM.cra.impl;

import fr.cea.nacre.model.NACREMM.CommonType.CommonType;
import fr.cea.nacre.model.NACREMM.CommonType.PeriodType;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import fr.cea.nacre.model.NACREMM.cra.CraPackage;
import fr.cea.nacre.model.NACREMM.cra.SoftwareResource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.SoftwareResourceImpl#getComputingResources <em>Computing Resources</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.SoftwareResourceImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.SoftwareResourceImpl#getExecutionTime <em>Execution Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareResourceImpl extends UIDElementImpl implements SoftwareResource {
	/**
	 * The cached value of the '{@link #getComputingResources() <em>Computing Resources</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingResources()
	 * @generated
	 * @ordered
	 */
	protected EList<String> computingResources;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected PeriodType period;

	/**
	 * The cached value of the '{@link #getExecutionTime() <em>Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected CommonType executionTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CraPackage.Literals.SOFTWARE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getComputingResources() {
		if (computingResources == null) {
			computingResources = new EDataTypeUniqueEList<String>(String.class, this, CraPackage.SOFTWARE_RESOURCE__COMPUTING_RESOURCES);
		}
		return computingResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeriodType getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(PeriodType newPeriod, NotificationChain msgs) {
		PeriodType oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CraPackage.SOFTWARE_RESOURCE__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(PeriodType newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CraPackage.SOFTWARE_RESOURCE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CraPackage.SOFTWARE_RESOURCE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CraPackage.SOFTWARE_RESOURCE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonType getExecutionTime() {
		return executionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionTime(CommonType newExecutionTime, NotificationChain msgs) {
		CommonType oldExecutionTime = executionTime;
		executionTime = newExecutionTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CraPackage.SOFTWARE_RESOURCE__EXECUTION_TIME, oldExecutionTime, newExecutionTime);
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
	public void setExecutionTime(CommonType newExecutionTime) {
		if (newExecutionTime != executionTime) {
			NotificationChain msgs = null;
			if (executionTime != null)
				msgs = ((InternalEObject)executionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CraPackage.SOFTWARE_RESOURCE__EXECUTION_TIME, null, msgs);
			if (newExecutionTime != null)
				msgs = ((InternalEObject)newExecutionTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CraPackage.SOFTWARE_RESOURCE__EXECUTION_TIME, null, msgs);
			msgs = basicSetExecutionTime(newExecutionTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CraPackage.SOFTWARE_RESOURCE__EXECUTION_TIME, newExecutionTime, newExecutionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CraPackage.SOFTWARE_RESOURCE__PERIOD:
				return basicSetPeriod(null, msgs);
			case CraPackage.SOFTWARE_RESOURCE__EXECUTION_TIME:
				return basicSetExecutionTime(null, msgs);
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
			case CraPackage.SOFTWARE_RESOURCE__COMPUTING_RESOURCES:
				return getComputingResources();
			case CraPackage.SOFTWARE_RESOURCE__PERIOD:
				return getPeriod();
			case CraPackage.SOFTWARE_RESOURCE__EXECUTION_TIME:
				return getExecutionTime();
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
			case CraPackage.SOFTWARE_RESOURCE__COMPUTING_RESOURCES:
				getComputingResources().clear();
				getComputingResources().addAll((Collection<? extends String>)newValue);
				return;
			case CraPackage.SOFTWARE_RESOURCE__PERIOD:
				setPeriod((PeriodType)newValue);
				return;
			case CraPackage.SOFTWARE_RESOURCE__EXECUTION_TIME:
				setExecutionTime((CommonType)newValue);
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
			case CraPackage.SOFTWARE_RESOURCE__COMPUTING_RESOURCES:
				getComputingResources().clear();
				return;
			case CraPackage.SOFTWARE_RESOURCE__PERIOD:
				setPeriod((PeriodType)null);
				return;
			case CraPackage.SOFTWARE_RESOURCE__EXECUTION_TIME:
				setExecutionTime((CommonType)null);
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
			case CraPackage.SOFTWARE_RESOURCE__COMPUTING_RESOURCES:
				return computingResources != null && !computingResources.isEmpty();
			case CraPackage.SOFTWARE_RESOURCE__PERIOD:
				return period != null;
			case CraPackage.SOFTWARE_RESOURCE__EXECUTION_TIME:
				return executionTime != null;
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
		result.append(" (computingResources: ");
		result.append(computingResources);
		result.append(')');
		return result.toString();
	}

} //SoftwareResourceImpl
