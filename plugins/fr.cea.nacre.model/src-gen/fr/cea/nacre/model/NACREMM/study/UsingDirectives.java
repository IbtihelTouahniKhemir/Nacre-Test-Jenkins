/**
 */
package fr.cea.nacre.model.NACREMM.study;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Using Directives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.study.UsingDirectives#getIidm <em>Iidm</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.study.UsingDirectives#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.study.StudyPackage#getUsingDirectives()
 * @model
 * @generated
 */
public interface UsingDirectives extends EObject {
	/**
	 * Returns the value of the '<em><b>Iidm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iidm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iidm</em>' attribute.
	 * @see #setIidm(String)
	 * @see fr.cea.nacre.model.NACREMM.study.StudyPackage#getUsingDirectives_Iidm()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getIidm();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.study.UsingDirectives#getIidm <em>Iidm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iidm</em>' attribute.
	 * @see #getIidm()
	 * @generated
	 */
	void setIidm(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see fr.cea.nacre.model.NACREMM.study.StudyPackage#getUsingDirectives_Filter()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.study.UsingDirectives#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

} // UsingDirectives
