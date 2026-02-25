/**
 */
package fr.cea.nacre.model.NACREMM.cfa;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Installation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getBranch <em>Branch</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#isConnected <em>Connected</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#isActivable <em>Activable</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getLocalController <em>Local Controller</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getEnd <em>End</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getSide <em>Side</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getIst <em>Ist</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getLineRef <em>Line Ref</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getRteInstallation()
 * @model
 * @generated
 */
public interface RteInstallation extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' attribute.
	 * @see #setBranch(String)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getRteInstallation_Branch()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBranch();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getBranch <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' attribute.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(String value);

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
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getRteInstallation_Connected()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isConnected();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isConnected()
	 * @generated
	 */
	void setConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Activable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activable</em>' attribute.
	 * @see #setActivable(boolean)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getRteInstallation_Activable()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isActivable();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#isActivable <em>Activable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activable</em>' attribute.
	 * @see #isActivable()
	 * @generated
	 */
	void setActivable(boolean value);

	/**
	 * Returns the value of the '<em><b>Local Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Controller</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Controller</em>' containment reference.
	 * @see #setLocalController(Controller)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getRteInstallation_LocalController()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Controller getLocalController();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getLocalController <em>Local Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Controller</em>' containment reference.
	 * @see #getLocalController()
	 * @generated
	 */
	void setLocalController(Controller value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getRteInstallation_End()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see #setSide(int)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getRteInstallation_Side()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSide();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(int value);

	/**
	 * Returns the value of the '<em><b>Ist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ist</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ist</em>' containment reference.
	 * @see #setIst(PowerType)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getRteInstallation_Ist()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PowerType getIst();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getIst <em>Ist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ist</em>' containment reference.
	 * @see #getIst()
	 * @generated
	 */
	void setIst(PowerType value);

	/**
	 * Returns the value of the '<em><b>Line Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Ref</em>' attribute.
	 * @see #setLineRef(String)
	 * @see fr.cea.nacre.model.NACREMM.cfa.CfaPackage#getRteInstallation_LineRef()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLineRef();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfa.RteInstallation#getLineRef <em>Line Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Ref</em>' attribute.
	 * @see #getLineRef()
	 * @generated
	 */
	void setLineRef(String value);

} // RteInstallation
