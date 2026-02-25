/**
 */
package fr.cea.nacre.model.NACREMM.Hazard;

import fr.cea.nacre.model.NACREMM.CommonType.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getComponent <em>Component</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getFrom <em>From</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getTo <em>To</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getPercent <em>Percent</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getCommunicationHazard()
 * @model
 * @generated
 */
public interface CommunicationHazard extends AbstractHazard {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' attribute.
	 * @see #setComponent(String)
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getCommunicationHazard_Component()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getComponent();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getComponent <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' attribute.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getCommunicationHazard_From()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getCommunicationHazard_To()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' reference.
	 * @see #setPeriod(Period)
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getCommunicationHazard_Period()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getPeriod <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent</em>' attribute.
	 * @see #setPercent(double)
	 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardPackage#getCommunicationHazard_Percent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getPercent();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getPercent <em>Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent</em>' attribute.
	 * @see #getPercent()
	 * @generated
	 */
	void setPercent(double value);

} // CommunicationHazard
