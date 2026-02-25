/**
 */
package fr.cea.nacre.model.NACREMM.cfa.impl;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;
import fr.cea.nacre.model.NACREMM.cfa.Controller;
import fr.cea.nacre.model.NACREMM.cfa.Line;
import fr.cea.nacre.model.NACREMM.cfa.MainGrid;
import fr.cea.nacre.model.NACREMM.cfa.Substation;
import fr.cea.nacre.model.NACREMM.cfa.Zone;

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
 * An implementation of the model object '<em><b>Main Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.MainGridImpl#getZones <em>Zones</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.MainGridImpl#getSubstations <em>Substations</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.MainGridImpl#getCentralController <em>Central Controller</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.impl.MainGridImpl#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainGridImpl extends UIDElementImpl implements MainGrid {
	/**
	 * The cached value of the '{@link #getZones() <em>Zones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZones()
	 * @generated
	 * @ordered
	 */
	protected EList<Zone> zones;

	/**
	 * The cached value of the '{@link #getSubstations() <em>Substations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstations()
	 * @generated
	 * @ordered
	 */
	protected EList<Substation> substations;

	/**
	 * The cached value of the '{@link #getCentralController() <em>Central Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentralController()
	 * @generated
	 * @ordered
	 */
	protected Controller centralController;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> lines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainGridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CfaPackage.Literals.MAIN_GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Zone> getZones() {
		if (zones == null) {
			zones = new EObjectContainmentEList<Zone>(Zone.class, this, CfaPackage.MAIN_GRID__ZONES);
		}
		return zones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Substation> getSubstations() {
		if (substations == null) {
			substations = new EObjectContainmentEList<Substation>(Substation.class, this, CfaPackage.MAIN_GRID__SUBSTATIONS);
		}
		return substations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller getCentralController() {
		return centralController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCentralController(Controller newCentralController, NotificationChain msgs) {
		Controller oldCentralController = centralController;
		centralController = newCentralController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CfaPackage.MAIN_GRID__CENTRAL_CONTROLLER, oldCentralController, newCentralController);
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
	public void setCentralController(Controller newCentralController) {
		if (newCentralController != centralController) {
			NotificationChain msgs = null;
			if (centralController != null)
				msgs = ((InternalEObject)centralController).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CfaPackage.MAIN_GRID__CENTRAL_CONTROLLER, null, msgs);
			if (newCentralController != null)
				msgs = ((InternalEObject)newCentralController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CfaPackage.MAIN_GRID__CENTRAL_CONTROLLER, null, msgs);
			msgs = basicSetCentralController(newCentralController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CfaPackage.MAIN_GRID__CENTRAL_CONTROLLER, newCentralController, newCentralController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Line> getLines() {
		if (lines == null) {
			lines = new EObjectContainmentEList<Line>(Line.class, this, CfaPackage.MAIN_GRID__LINES);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfaPackage.MAIN_GRID__ZONES:
				return ((InternalEList<?>)getZones()).basicRemove(otherEnd, msgs);
			case CfaPackage.MAIN_GRID__SUBSTATIONS:
				return ((InternalEList<?>)getSubstations()).basicRemove(otherEnd, msgs);
			case CfaPackage.MAIN_GRID__CENTRAL_CONTROLLER:
				return basicSetCentralController(null, msgs);
			case CfaPackage.MAIN_GRID__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
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
			case CfaPackage.MAIN_GRID__ZONES:
				return getZones();
			case CfaPackage.MAIN_GRID__SUBSTATIONS:
				return getSubstations();
			case CfaPackage.MAIN_GRID__CENTRAL_CONTROLLER:
				return getCentralController();
			case CfaPackage.MAIN_GRID__LINES:
				return getLines();
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
			case CfaPackage.MAIN_GRID__ZONES:
				getZones().clear();
				getZones().addAll((Collection<? extends Zone>)newValue);
				return;
			case CfaPackage.MAIN_GRID__SUBSTATIONS:
				getSubstations().clear();
				getSubstations().addAll((Collection<? extends Substation>)newValue);
				return;
			case CfaPackage.MAIN_GRID__CENTRAL_CONTROLLER:
				setCentralController((Controller)newValue);
				return;
			case CfaPackage.MAIN_GRID__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends Line>)newValue);
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
			case CfaPackage.MAIN_GRID__ZONES:
				getZones().clear();
				return;
			case CfaPackage.MAIN_GRID__SUBSTATIONS:
				getSubstations().clear();
				return;
			case CfaPackage.MAIN_GRID__CENTRAL_CONTROLLER:
				setCentralController((Controller)null);
				return;
			case CfaPackage.MAIN_GRID__LINES:
				getLines().clear();
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
			case CfaPackage.MAIN_GRID__ZONES:
				return zones != null && !zones.isEmpty();
			case CfaPackage.MAIN_GRID__SUBSTATIONS:
				return substations != null && !substations.isEmpty();
			case CfaPackage.MAIN_GRID__CENTRAL_CONTROLLER:
				return centralController != null;
			case CfaPackage.MAIN_GRID__LINES:
				return lines != null && !lines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MainGridImpl
