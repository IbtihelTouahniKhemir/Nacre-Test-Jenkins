/**
 */
package fr.cea.nacre.model.NACREMM.Hazard.impl;

import fr.cea.nacre.model.NACREMM.Hazard.CfaHazard;
import fr.cea.nacre.model.NACREMM.Hazard.CraHazard;
import fr.cea.nacre.model.NACREMM.Hazard.HazardPackage;
import fr.cea.nacre.model.NACREMM.Hazard.NACREHazard;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NACRE Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.impl.NACREHazardImpl#getCraHazards <em>Cra Hazards</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.impl.NACREHazardImpl#getCfaHazards <em>Cfa Hazards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NACREHazardImpl extends UIDElementImpl implements NACREHazard {
	/**
	 * The cached value of the '{@link #getCraHazards() <em>Cra Hazards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCraHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<CraHazard> craHazards;

	/**
	 * The cached value of the '{@link #getCfaHazards() <em>Cfa Hazards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfaHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<CfaHazard> cfaHazards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NACREHazardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HazardPackage.Literals.NACRE_HAZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CraHazard> getCraHazards() {
		if (craHazards == null) {
			craHazards = new EObjectContainmentEList<CraHazard>(CraHazard.class, this, HazardPackage.NACRE_HAZARD__CRA_HAZARDS);
		}
		return craHazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CfaHazard> getCfaHazards() {
		if (cfaHazards == null) {
			cfaHazards = new EObjectContainmentEList<CfaHazard>(CfaHazard.class, this, HazardPackage.NACRE_HAZARD__CFA_HAZARDS);
		}
		return cfaHazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HazardPackage.NACRE_HAZARD__CRA_HAZARDS:
				return ((InternalEList<?>)getCraHazards()).basicRemove(otherEnd, msgs);
			case HazardPackage.NACRE_HAZARD__CFA_HAZARDS:
				return ((InternalEList<?>)getCfaHazards()).basicRemove(otherEnd, msgs);
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
			case HazardPackage.NACRE_HAZARD__CRA_HAZARDS:
				return getCraHazards();
			case HazardPackage.NACRE_HAZARD__CFA_HAZARDS:
				return getCfaHazards();
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
			case HazardPackage.NACRE_HAZARD__CRA_HAZARDS:
				getCraHazards().clear();
				getCraHazards().addAll((Collection<? extends CraHazard>)newValue);
				return;
			case HazardPackage.NACRE_HAZARD__CFA_HAZARDS:
				getCfaHazards().clear();
				getCfaHazards().addAll((Collection<? extends CfaHazard>)newValue);
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
			case HazardPackage.NACRE_HAZARD__CRA_HAZARDS:
				getCraHazards().clear();
				return;
			case HazardPackage.NACRE_HAZARD__CFA_HAZARDS:
				getCfaHazards().clear();
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
			case HazardPackage.NACRE_HAZARD__CRA_HAZARDS:
				return craHazards != null && !craHazards.isEmpty();
			case HazardPackage.NACRE_HAZARD__CFA_HAZARDS:
				return cfaHazards != null && !cfaHazards.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NACREHazardImpl
