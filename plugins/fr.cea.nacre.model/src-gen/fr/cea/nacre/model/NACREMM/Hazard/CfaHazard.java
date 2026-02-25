/**
 */
package fr.cea.nacre.model.NACREMM.Hazard;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cfa Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.CfaHazard#getLineHazards <em>Line Hazards</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.CfaHazard#getCfa <em>Cfa</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.CfaHazard#getGeneratorhazard <em>Generatorhazard</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getCfaHazard()
 * @model
 * @generated
 */
public interface CfaHazard extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Line Hazards</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.Hazard.LineHazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Hazards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Hazards</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getCfaHazard_LineHazards()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<LineHazard> getLineHazards();

	/**
	 * Returns the value of the '<em><b>Cfa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfa</em>' attribute.
	 * @see #setCfa(String)
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getCfaHazard_Cfa()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCfa();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.Hazard.CfaHazard#getCfa <em>Cfa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfa</em>' attribute.
	 * @see #getCfa()
	 * @generated
	 */
	void setCfa(String value);

	/**
	 * Returns the value of the '<em><b>Generatorhazard</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generatorhazard</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generatorhazard</em>' containment reference list.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getCfaHazard_Generatorhazard()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<GeneratorHazard> getGeneratorhazard();

} // CfaHazard
