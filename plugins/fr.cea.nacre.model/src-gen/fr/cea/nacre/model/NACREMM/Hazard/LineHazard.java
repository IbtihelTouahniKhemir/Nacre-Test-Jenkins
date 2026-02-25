/**
 */
package fr.cea.nacre.model.NACREMM.Hazard;

import fr.cea.nacre.model.NACREMM.CommonType.PeriodType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.LineHazard#getLine <em>Line</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.LineHazard#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getLineHazard()
 * @model
 * @generated
 */
public interface LineHazard extends AbstractHazard {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(String)
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getLineHazard_Line()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLine();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.Hazard.LineHazard#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(PeriodType)
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getLineHazard_Start()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PeriodType getStart();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.Hazard.LineHazard#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(PeriodType value);

} // LineHazard
