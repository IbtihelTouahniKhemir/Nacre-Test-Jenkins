/**
 */
package nacre;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTE Installation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.RTE_Installation#getV <em>V</em>}</li>
 *   <li>{@link nacre.RTE_Installation#getEnd <em>End</em>}</li>
 *   <li>{@link nacre.RTE_Installation#getBranch <em>Branch</em>}</li>
 *   <li>{@link nacre.RTE_Installation#getSide <em>Side</em>}</li>
 *   <li>{@link nacre.RTE_Installation#getIst <em>Ist</em>}</li>
 *   <li>{@link nacre.RTE_Installation#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getRTE_Installation()
 * @model
 * @generated
 */
public interface RTE_Installation extends Equipement {
	/**
	 * Returns the value of the '<em><b>V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V</em>' containment reference.
	 * @see #setV(NFP_Voltage)
	 * @see nacre.NacrePackage#getRTE_Installation_V()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NFP_Voltage getV();

	/**
	 * Sets the value of the '{@link nacre.RTE_Installation#getV <em>V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V</em>' containment reference.
	 * @see #getV()
	 * @generated
	 */
	void setV(NFP_Voltage value);

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
	 * @see nacre.NacrePackage#getRTE_Installation_End()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link nacre.RTE_Installation#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

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
	 * @see nacre.NacrePackage#getRTE_Installation_Branch()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBranch();

	/**
	 * Sets the value of the '{@link nacre.RTE_Installation#getBranch <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' attribute.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(String value);

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
	 * @see nacre.NacrePackage#getRTE_Installation_Side()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSide();

	/**
	 * Sets the value of the '{@link nacre.RTE_Installation#getSide <em>Side</em>}' attribute.
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
	 * @see #setIst(NFP_IST)
	 * @see nacre.NacrePackage#getRTE_Installation_Ist()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NFP_IST getIst();

	/**
	 * Sets the value of the '{@link nacre.RTE_Installation#getIst <em>Ist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ist</em>' containment reference.
	 * @see #getIst()
	 * @generated
	 */
	void setIst(NFP_IST value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' reference.
	 * @see #setLine(Line)
	 * @see nacre.NacrePackage#getRTE_Installation_Line()
	 * @model ordered="false"
	 * @generated
	 */
	Line getLine();

	/**
	 * Sets the value of the '{@link nacre.RTE_Installation#getLine <em>Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(Line value);

} // RTE_Installation
