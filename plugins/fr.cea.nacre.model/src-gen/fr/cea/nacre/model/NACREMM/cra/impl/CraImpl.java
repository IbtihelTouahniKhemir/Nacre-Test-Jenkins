/**
 */
package fr.cea.nacre.model.NACREMM.cra.impl;

import fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl;

import fr.cea.nacre.model.NACREMM.cra.CommunicationMedia;
import fr.cea.nacre.model.NACREMM.cra.ComputingResource;
import fr.cea.nacre.model.NACREMM.cra.Cra;
import fr.cea.nacre.model.NACREMM.cra.CraPackage;
import fr.cea.nacre.model.NACREMM.cra.RedundancyCluster;
import fr.cea.nacre.model.NACREMM.cra.SoftwareResource;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.CraImpl#getCommunicationMedias <em>Communication Medias</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.CraImpl#getComputingResources <em>Computing Resources</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.CraImpl#getSoftwareResources <em>Software Resources</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.impl.CraImpl#getRedundancyClusters <em>Redundancy Clusters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CraImpl extends UIDElementImpl implements Cra {
	/**
	 * The cached value of the '{@link #getCommunicationMedias() <em>Communication Medias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMedias()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationMedia> communicationMedias;

	/**
	 * The cached value of the '{@link #getComputingResources() <em>Computing Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputingResource> computingResources;

	/**
	 * The cached value of the '{@link #getSoftwareResources() <em>Software Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareResources()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareResource> softwareResources;

	/**
	 * The cached value of the '{@link #getRedundancyClusters() <em>Redundancy Clusters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedundancyClusters()
	 * @generated
	 * @ordered
	 */
	protected EList<RedundancyCluster> redundancyClusters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CraPackage.Literals.CRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationMedia> getCommunicationMedias() {
		if (communicationMedias == null) {
			communicationMedias = new EObjectContainmentEList<CommunicationMedia>(CommunicationMedia.class, this, CraPackage.CRA__COMMUNICATION_MEDIAS);
		}
		return communicationMedias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComputingResource> getComputingResources() {
		if (computingResources == null) {
			computingResources = new EObjectContainmentEList<ComputingResource>(ComputingResource.class, this, CraPackage.CRA__COMPUTING_RESOURCES);
		}
		return computingResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SoftwareResource> getSoftwareResources() {
		if (softwareResources == null) {
			softwareResources = new EObjectContainmentEList<SoftwareResource>(SoftwareResource.class, this, CraPackage.CRA__SOFTWARE_RESOURCES);
		}
		return softwareResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RedundancyCluster> getRedundancyClusters() {
		if (redundancyClusters == null) {
			redundancyClusters = new EObjectContainmentEList<RedundancyCluster>(RedundancyCluster.class, this, CraPackage.CRA__REDUNDANCY_CLUSTERS);
		}
		return redundancyClusters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CraPackage.CRA__COMMUNICATION_MEDIAS:
				return ((InternalEList<?>)getCommunicationMedias()).basicRemove(otherEnd, msgs);
			case CraPackage.CRA__COMPUTING_RESOURCES:
				return ((InternalEList<?>)getComputingResources()).basicRemove(otherEnd, msgs);
			case CraPackage.CRA__SOFTWARE_RESOURCES:
				return ((InternalEList<?>)getSoftwareResources()).basicRemove(otherEnd, msgs);
			case CraPackage.CRA__REDUNDANCY_CLUSTERS:
				return ((InternalEList<?>)getRedundancyClusters()).basicRemove(otherEnd, msgs);
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
			case CraPackage.CRA__COMMUNICATION_MEDIAS:
				return getCommunicationMedias();
			case CraPackage.CRA__COMPUTING_RESOURCES:
				return getComputingResources();
			case CraPackage.CRA__SOFTWARE_RESOURCES:
				return getSoftwareResources();
			case CraPackage.CRA__REDUNDANCY_CLUSTERS:
				return getRedundancyClusters();
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
			case CraPackage.CRA__COMMUNICATION_MEDIAS:
				getCommunicationMedias().clear();
				getCommunicationMedias().addAll((Collection<? extends CommunicationMedia>)newValue);
				return;
			case CraPackage.CRA__COMPUTING_RESOURCES:
				getComputingResources().clear();
				getComputingResources().addAll((Collection<? extends ComputingResource>)newValue);
				return;
			case CraPackage.CRA__SOFTWARE_RESOURCES:
				getSoftwareResources().clear();
				getSoftwareResources().addAll((Collection<? extends SoftwareResource>)newValue);
				return;
			case CraPackage.CRA__REDUNDANCY_CLUSTERS:
				getRedundancyClusters().clear();
				getRedundancyClusters().addAll((Collection<? extends RedundancyCluster>)newValue);
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
			case CraPackage.CRA__COMMUNICATION_MEDIAS:
				getCommunicationMedias().clear();
				return;
			case CraPackage.CRA__COMPUTING_RESOURCES:
				getComputingResources().clear();
				return;
			case CraPackage.CRA__SOFTWARE_RESOURCES:
				getSoftwareResources().clear();
				return;
			case CraPackage.CRA__REDUNDANCY_CLUSTERS:
				getRedundancyClusters().clear();
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
			case CraPackage.CRA__COMMUNICATION_MEDIAS:
				return communicationMedias != null && !communicationMedias.isEmpty();
			case CraPackage.CRA__COMPUTING_RESOURCES:
				return computingResources != null && !computingResources.isEmpty();
			case CraPackage.CRA__SOFTWARE_RESOURCES:
				return softwareResources != null && !softwareResources.isEmpty();
			case CraPackage.CRA__REDUNDANCY_CLUSTERS:
				return redundancyClusters != null && !redundancyClusters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CraImpl
