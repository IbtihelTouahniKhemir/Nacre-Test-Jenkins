/**
 */
package fr.cea.nacre.model.NACREMM.cfra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfra.Abstraction#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfra.Abstraction#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cfra.CfraPackage#getAbstraction()
 * @model
 * @generated
 */
public interface Abstraction extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see fr.cea.nacre.model.NACREMM.cfra.CfraPackage#getAbstraction_Function()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfra.Abstraction#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see fr.cea.nacre.model.NACREMM.cfra.CfraPackage#getAbstraction_Resource()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfra.Abstraction#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(String value);

} // Abstraction
