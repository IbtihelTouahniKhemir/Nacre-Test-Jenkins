/**
 */
package fr.cea.nacre.model.NACREMM.cra;

import fr.cea.nacre.model.NACREMM.CommonType.CommonType;
import fr.cea.nacre.model.NACREMM.CommonType.PeriodType;

import fr.cea.nacre.model.NACREMM.UID.UIDElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.SoftwareResource#getComputingResources <em>Computing Resources</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.SoftwareResource#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.cea.nacre.model.NACREMM.cra.SoftwareResource#getExecutionTime <em>Execution Time</em>}</li>
 * </ul>
 *
 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getSoftwareResource()
 * @model
 * @generated
 */
public interface SoftwareResource extends UIDElement {
	/**
	 * Returns the value of the '<em><b>Computing Resources</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computing Resources</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computing Resources</em>' attribute list.
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getSoftwareResource_ComputingResources()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getComputingResources();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(PeriodType)
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getSoftwareResource_Period()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PeriodType getPeriod();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cra.SoftwareResource#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(PeriodType value);

	/**
	 * Returns the value of the '<em><b>Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Time</em>' containment reference.
	 * @see #setExecutionTime(CommonType)
	 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getSoftwareResource_ExecutionTime()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CommonType getExecutionTime();

	/**
	 * Sets the value of the '{@link fr.cea.nacre.model.NACREMM.cra.SoftwareResource#getExecutionTime <em>Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Time</em>' containment reference.
	 * @see #getExecutionTime()
	 * @generated
	 */
	void setExecutionTime(CommonType value);

} // SoftwareResource
