/**
 */
package fr.cea.nacre.model.NACREMM.cra.impl;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import fr.cea.nacre.model.NACREMM.cra.ComputingResource;
import fr.cea.nacre.model.NACREMM.cra.CraPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computing Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.ComputingResourceImpl#getCommunicationMedias <em>Communication Medias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputingResourceImpl extends UIDElementImpl implements ComputingResource {
	/**
	 * The cached value of the '{@link #getCommunicationMedias() <em>Communication Medias</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMedias()
	 * @generated
	 * @ordered
	 */
	protected EList<String> communicationMedias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputingResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CraPackage.Literals.COMPUTING_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCommunicationMedias() {
		if (communicationMedias == null) {
			communicationMedias = new EDataTypeUniqueEList<String>(String.class, this, CraPackage.COMPUTING_RESOURCE__COMMUNICATION_MEDIAS);
		}
		return communicationMedias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CraPackage.COMPUTING_RESOURCE__COMMUNICATION_MEDIAS:
				return getCommunicationMedias();
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
			case CraPackage.COMPUTING_RESOURCE__COMMUNICATION_MEDIAS:
				getCommunicationMedias().clear();
				getCommunicationMedias().addAll((Collection<? extends String>)newValue);
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
			case CraPackage.COMPUTING_RESOURCE__COMMUNICATION_MEDIAS:
				getCommunicationMedias().clear();
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
			case CraPackage.COMPUTING_RESOURCE__COMMUNICATION_MEDIAS:
				return communicationMedias != null && !communicationMedias.isEmpty();
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
		result.append(" (communicationMedias: ");
		result.append(communicationMedias);
		result.append(')');
		return result.toString();
	}

} //ComputingResourceImpl
