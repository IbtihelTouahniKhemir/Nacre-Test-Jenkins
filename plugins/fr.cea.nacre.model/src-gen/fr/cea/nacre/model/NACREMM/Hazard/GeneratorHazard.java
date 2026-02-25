/**
 */
package fr.cea.nacre.model.NACREMM.Hazard;

import fr.cea.nacre.model.NACREMM.CommonType.PeriodType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard#getStart <em>Start</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getGeneratorHazard()
 * @model
 * @generated
 */
public interface GeneratorHazard extends AbstractHazard {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(PeriodType)
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getGeneratorHazard_Start()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PeriodType getStart();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(PeriodType value);

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' attribute.
	 * @see #setGenerator(String)
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getGeneratorHazard_Generator()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getGenerator();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard#getGenerator <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' attribute.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(String value);

} // GeneratorHazard
