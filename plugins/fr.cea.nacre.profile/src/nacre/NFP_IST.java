/**
 */
package nacre;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP IST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.NFP_IST#getUnit <em>Unit</em>}</li>
 *   <li>{@link nacre.NFP_IST#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getNFP_IST()
 * @model
 * @generated
 */
public interface NFP_IST extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link nacre.IstUnitKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see nacre.IstUnitKind
	 * @see #setUnit(IstUnitKind)
	 * @see nacre.NacrePackage#getNFP_IST_Unit()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	IstUnitKind getUnit();

	/**
	 * Sets the value of the '{@link nacre.NFP_IST#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see nacre.IstUnitKind
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(IstUnitKind value);

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
	 * @see nacre.NacrePackage#getNFP_IST_Precision()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Real" ordered="false"
	 * @generated
	 */
	double getPrecision();

	/**
	 * Sets the value of the '{@link nacre.NFP_IST#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(double value);

} // NFP_IST
