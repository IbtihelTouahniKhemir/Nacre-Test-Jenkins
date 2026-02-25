/**
 */
package fr.cea.nacre.model.NACREMM.cfra;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cfra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfra.Cfra#getAbstractions <em>Abstractions</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cfra.Cfra#getCra <em>Cra</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cfra.CfraPackage#getCfra()
 * @model
 * @generated
 */
public interface Cfra extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Abstractions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.cfra.Abstraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstractions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstractions</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.cfra.CfraPackage#getCfra_Abstractions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Abstraction> getAbstractions();

	/**
	 * Returns the value of the '<em><b>Cra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cra</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cra</em>' attribute.
	 * @see #setCra(String)
	 * @see fr.cea.nacre.model.NACREMM.cfra.CfraPackage#getCfra_Cra()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCra();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cfra.Cfra#getCra <em>Cra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cra</em>' attribute.
	 * @see #getCra()
	 * @generated
	 */
	void setCra(String value);

} // Cfra
