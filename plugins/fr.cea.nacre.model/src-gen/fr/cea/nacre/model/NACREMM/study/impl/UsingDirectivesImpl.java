/**
 */
package fr.cea.nacre.model.NACREMM.study.impl;

import fr.cea.nacre.model.NACREMM.study.StudyPackage;
import fr.cea.nacre.model.NACREMM.study.UsingDirectives;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Using Directives</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.study.impl.UsingDirectivesImpl#getIidm <em>Iidm</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.study.impl.UsingDirectivesImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsingDirectivesImpl extends MinimalEObjectImpl.Container implements UsingDirectives {
	/**
	 * The default value of the '{@link #getIidm() <em>Iidm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIidm()
	 * @generated
	 * @ordered
	 */
	protected static final String IIDM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIidm() <em>Iidm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIidm()
	 * @generated
	 * @ordered
	 */
	protected String iidm = IIDM_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsingDirectivesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPackage.Literals.USING_DIRECTIVES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIidm() {
		return iidm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIidm(String newIidm) {
		String oldIidm = iidm;
		iidm = newIidm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.USING_DIRECTIVES__IIDM, oldIidm, iidm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.USING_DIRECTIVES__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyPackage.USING_DIRECTIVES__IIDM:
				return getIidm();
			case StudyPackage.USING_DIRECTIVES__FILTER:
				return getFilter();
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
			case StudyPackage.USING_DIRECTIVES__IIDM:
				setIidm((String)newValue);
				return;
			case StudyPackage.USING_DIRECTIVES__FILTER:
				setFilter((String)newValue);
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
			case StudyPackage.USING_DIRECTIVES__IIDM:
				setIidm(IIDM_EDEFAULT);
				return;
			case StudyPackage.USING_DIRECTIVES__FILTER:
				setFilter(FILTER_EDEFAULT);
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
			case StudyPackage.USING_DIRECTIVES__IIDM:
				return IIDM_EDEFAULT == null ? iidm != null : !IIDM_EDEFAULT.equals(iidm);
			case StudyPackage.USING_DIRECTIVES__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
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
		result.append(" (iidm: ");
		result.append(iidm);
		result.append(", filter: ");
		result.append(filter);
		result.append(')');
		return result.toString();
	}

} //UsingDirectivesImpl
