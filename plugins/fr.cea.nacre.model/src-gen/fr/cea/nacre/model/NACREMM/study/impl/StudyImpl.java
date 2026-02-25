/**
 */
package fr.cea.nacre.model.NACREMM.study.impl;

import fr.cea.nacre.model.NACREMM.Hazard.NACREHazard;
import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import fr.cea.nacre.model.NACREMM.cfa.Cfa;

import fr.cea.nacre.model.NACREMM.cfra.Cfra;

import fr.cea.nacre.model.NACREMM.cra.Cra;

import fr.cea.nacre.model.NACREMM.study.Study;
import fr.cea.nacre.model.NACREMM.study.StudyPackage;

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
 * An implementation of the model object '<em><b>Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.study.impl.StudyImpl#getCfa <em>Cfa</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.study.impl.StudyImpl#getCras <em>Cras</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.study.impl.StudyImpl#getCfras <em>Cfras</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.study.impl.StudyImpl#getHazards <em>Hazards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyImpl extends UIDElementImpl implements Study {
	/**
	 * The cached value of the '{@link #getCfa() <em>Cfa</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfa()
	 * @generated
	 * @ordered
	 */
	protected Cfa cfa;

	/**
	 * The cached value of the '{@link #getCras() <em>Cras</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCras()
	 * @generated
	 * @ordered
	 */
	protected EList<Cra> cras;

	/**
	 * The cached value of the '{@link #getCfras() <em>Cfras</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfras()
	 * @generated
	 * @ordered
	 */
	protected EList<Cfra> cfras;

	/**
	 * The cached value of the '{@link #getHazards() <em>Hazards</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazards()
	 * @generated
	 * @ordered
	 */
	protected NACREHazard hazards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPackage.Literals.STUDY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cfa getCfa() {
		return cfa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCfa(Cfa newCfa, NotificationChain msgs) {
		Cfa oldCfa = cfa;
		cfa = newCfa;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyPackage.STUDY__CFA, oldCfa, newCfa);
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
	public void setCfa(Cfa newCfa) {
		if (newCfa != cfa) {
			NotificationChain msgs = null;
			if (cfa != null)
				msgs = ((InternalEObject)cfa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyPackage.STUDY__CFA, null, msgs);
			if (newCfa != null)
				msgs = ((InternalEObject)newCfa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyPackage.STUDY__CFA, null, msgs);
			msgs = basicSetCfa(newCfa, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.STUDY__CFA, newCfa, newCfa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cra> getCras() {
		if (cras == null) {
			cras = new EObjectContainmentEList<Cra>(Cra.class, this, StudyPackage.STUDY__CRAS);
		}
		return cras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cfra> getCfras() {
		if (cfras == null) {
			cfras = new EObjectContainmentEList<Cfra>(Cfra.class, this, StudyPackage.STUDY__CFRAS);
		}
		return cfras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NACREHazard getHazards() {
		return hazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHazards(NACREHazard newHazards, NotificationChain msgs) {
		NACREHazard oldHazards = hazards;
		hazards = newHazards;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyPackage.STUDY__HAZARDS, oldHazards, newHazards);
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
	public void setHazards(NACREHazard newHazards) {
		if (newHazards != hazards) {
			NotificationChain msgs = null;
			if (hazards != null)
				msgs = ((InternalEObject)hazards).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyPackage.STUDY__HAZARDS, null, msgs);
			if (newHazards != null)
				msgs = ((InternalEObject)newHazards).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyPackage.STUDY__HAZARDS, null, msgs);
			msgs = basicSetHazards(newHazards, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.STUDY__HAZARDS, newHazards, newHazards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPackage.STUDY__CFA:
				return basicSetCfa(null, msgs);
			case StudyPackage.STUDY__CRAS:
				return ((InternalEList<?>)getCras()).basicRemove(otherEnd, msgs);
			case StudyPackage.STUDY__CFRAS:
				return ((InternalEList<?>)getCfras()).basicRemove(otherEnd, msgs);
			case StudyPackage.STUDY__HAZARDS:
				return basicSetHazards(null, msgs);
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
			case StudyPackage.STUDY__CFA:
				return getCfa();
			case StudyPackage.STUDY__CRAS:
				return getCras();
			case StudyPackage.STUDY__CFRAS:
				return getCfras();
			case StudyPackage.STUDY__HAZARDS:
				return getHazards();
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
			case StudyPackage.STUDY__CFA:
				setCfa((Cfa)newValue);
				return;
			case StudyPackage.STUDY__CRAS:
				getCras().clear();
				getCras().addAll((Collection<? extends Cra>)newValue);
				return;
			case StudyPackage.STUDY__CFRAS:
				getCfras().clear();
				getCfras().addAll((Collection<? extends Cfra>)newValue);
				return;
			case StudyPackage.STUDY__HAZARDS:
				setHazards((NACREHazard)newValue);
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
			case StudyPackage.STUDY__CFA:
				setCfa((Cfa)null);
				return;
			case StudyPackage.STUDY__CRAS:
				getCras().clear();
				return;
			case StudyPackage.STUDY__CFRAS:
				getCfras().clear();
				return;
			case StudyPackage.STUDY__HAZARDS:
				setHazards((NACREHazard)null);
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
			case StudyPackage.STUDY__CFA:
				return cfa != null;
			case StudyPackage.STUDY__CRAS:
				return cras != null && !cras.isEmpty();
			case StudyPackage.STUDY__CFRAS:
				return cfras != null && !cfras.isEmpty();
			case StudyPackage.STUDY__HAZARDS:
				return hazards != null;
		}
		return super.eIsSet(featureID);
	}

} //StudyImpl
