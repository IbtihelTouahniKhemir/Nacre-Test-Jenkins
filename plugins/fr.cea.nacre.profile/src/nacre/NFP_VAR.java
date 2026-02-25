/**
 */
package nacre;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP VAR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.NFP_VAR#getUnit <em>Unit</em>}</li>
 *   <li>{@link nacre.NFP_VAR#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getNFP_VAR()
 * @model
 * @generated
 */
public interface NFP_VAR extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link nacre.ReactivePowerUnitKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see nacre.ReactivePowerUnitKind
	 * @see #setUnit(ReactivePowerUnitKind)
	 * @see nacre.NacrePackage#getNFP_VAR_Unit()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ReactivePowerUnitKind getUnit();

	/**
	 * Sets the value of the '{@link nacre.NFP_VAR#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see nacre.ReactivePowerUnitKind
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(ReactivePowerUnitKind value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(double)
	 * @see nacre.NacrePackage#getNFP_VAR_Precision()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Real" ordered="false"
	 * @generated
	 */
	double getPrecision();

	/**
	 * Sets the value of the '{@link nacre.NFP_VAR#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(double value);

} // NFP_VAR
