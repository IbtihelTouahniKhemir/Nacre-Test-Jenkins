/**
 */
package fr.cea.nacre.model.NACREMM.Hazard.impl;

import fr.cea.nacre.model.NACREMM.Hazard.CfaHazard;
import fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard;
import fr.cea.nacre.model.NACREMM.Hazard.HazardPackage;
import fr.cea.nacre.model.NACREMM.Hazard.LineHazard;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

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
 * An implementation of the model object '<em><b>Cfa Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.impl.CfaHazardImpl#getLineHazards <em>Line Hazards</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.impl.CfaHazardImpl#getCfa <em>Cfa</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.impl.CfaHazardImpl#getGeneratorhazard <em>Generatorhazard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CfaHazardImpl extends UIDElementImpl implements CfaHazard {
	/**
	 * The cached value of the '{@link #getLineHazards() <em>Line Hazards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<LineHazard> lineHazards;

	/**
	 * The default value of the '{@link #getCfa() <em>Cfa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfa()
	 * @generated
	 * @ordered
	 */
	protected static final String CFA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCfa() <em>Cfa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfa()
	 * @generated
	 * @ordered
	 */
	protected String cfa = CFA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneratorhazard() <em>Generatorhazard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorhazard()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorHazard> generatorhazard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CfaHazardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HazardPackage.Literals.CFA_HAZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LineHazard> getLineHazards() {
		if (lineHazards == null) {
			lineHazards = new EObjectContainmentEList<LineHazard>(LineHazard.class, this, HazardPackage.CFA_HAZARD__LINE_HAZARDS);
		}
		return lineHazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCfa() {
		return cfa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCfa(String newCfa) {
		String oldCfa = cfa;
		cfa = newCfa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.CFA_HAZARD__CFA, oldCfa, cfa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GeneratorHazard> getGeneratorhazard() {
		if (generatorhazard == null) {
			generatorhazard = new EObjectContainmentEList<GeneratorHazard>(GeneratorHazard.class, this, HazardPackage.CFA_HAZARD__GENERATORHAZARD);
		}
		return generatorhazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HazardPackage.CFA_HAZARD__LINE_HAZARDS:
				return ((InternalEList<?>)getLineHazards()).basicRemove(otherEnd, msgs);
			case HazardPackage.CFA_HAZARD__GENERATORHAZARD:
				return ((InternalEList<?>)getGeneratorhazard()).basicRemove(otherEnd, msgs);
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
			case HazardPackage.CFA_HAZARD__LINE_HAZARDS:
				return getLineHazards();
			case HazardPackage.CFA_HAZARD__CFA:
				return getCfa();
			case HazardPackage.CFA_HAZARD__GENERATORHAZARD:
				return getGeneratorhazard();
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
			case HazardPackage.CFA_HAZARD__LINE_HAZARDS:
				getLineHazards().clear();
				getLineHazards().addAll((Collection<? extends LineHazard>)newValue);
				return;
			case HazardPackage.CFA_HAZARD__CFA:
				setCfa((String)newValue);
				return;
			case HazardPackage.CFA_HAZARD__GENERATORHAZARD:
				getGeneratorhazard().clear();
				getGeneratorhazard().addAll((Collection<? extends GeneratorHazard>)newValue);
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
			case HazardPackage.CFA_HAZARD__LINE_HAZARDS:
				getLineHazards().clear();
				return;
			case HazardPackage.CFA_HAZARD__CFA:
				setCfa(CFA_EDEFAULT);
				return;
			case HazardPackage.CFA_HAZARD__GENERATORHAZARD:
				getGeneratorhazard().clear();
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
			case HazardPackage.CFA_HAZARD__LINE_HAZARDS:
				return lineHazards != null && !lineHazards.isEmpty();
			case HazardPackage.CFA_HAZARD__CFA:
				return CFA_EDEFAULT == null ? cfa != null : !CFA_EDEFAULT.equals(cfa);
			case HazardPackage.CFA_HAZARD__GENERATORHAZARD:
				return generatorhazard != null && !generatorhazard.isEmpty();
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
		result.append(" (cfa: ");
		result.append(cfa);
		result.append(')');
		return result.toString();
	}

} //CfaHazardImpl
