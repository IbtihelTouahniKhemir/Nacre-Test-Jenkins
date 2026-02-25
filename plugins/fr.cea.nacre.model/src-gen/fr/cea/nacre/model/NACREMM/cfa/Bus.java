/**
 */
package fr.cea.nacre.model.NACREMM.cfa;

import fr.cea.nacre.model.NACREMM.CommonType.CommonType;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Bus#getNominalLevel <em>Nominal Level</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Bus#isConnected <em>Connected</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Bus#getGenerators <em>Generators</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Bus#getBatteries <em>Batteries</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Bus#getRteInstallations <em>Rte Installations</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.Bus#getLoads <em>Loads</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getBus()
 * @model
 * @generated
 */
public interface Bus extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Nominal Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Level</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Level</em>' containment reference.
	 * @see #setNominalLevel(CommonType)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getBus_NominalLevel()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CommonType getNominalLevel();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.Bus#getNominalLevel <em>Nominal Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Level</em>' containment reference.
	 * @see #getNominalLevel()
	 * @generated
	 */
	void setNominalLevel(CommonType value);

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #setConnected(boolean)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getBus_Connected()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isConnected();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.Bus#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isConnected()
	 * @generated
	 */
	void setConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cfa.Generator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generators</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getBus_Generators()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Generator> getGenerators();

	/**
	 * Returns the value of the '<em><b>Batteries</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cfa.Battery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batteries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batteries</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getBus_Batteries()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Battery> getBatteries();

	/**
	 * Returns the value of the '<em><b>Rte Installations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Installations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Installations</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getBus_RteInstallations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RteInstallation> getRteInstallations();

	/**
	 * Returns the value of the '<em><b>Loads</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cfa.Load}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loads</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getBus_Loads()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Load> getLoads();

} // Bus
