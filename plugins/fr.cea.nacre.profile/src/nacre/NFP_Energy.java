/**
 */
package nacre;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP Energy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.NFP_Energy#getUnit <em>Unit</em>}</li>
 *   <li>{@link nacre.NFP_Energy#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getNFP_Energy()
 * @model
 * @generated
 */
public interface NFP_Energy extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link nacre.EnergyUnitKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see nacre.EnergyUnitKind
	 * @see #setUnit(EnergyUnitKind)
	 * @see nacre.NacrePackage#getNFP_Energy_Unit()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EnergyUnitKind getUnit();

	/**
	 * Sets the value of the '{@link nacre.NFP_Energy#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see nacre.EnergyUnitKind
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(EnergyUnitKind value);

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
	 * @see nacre.NacrePackage#getNFP_Energy_Precision()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Real" ordered="false"
	 * @generated
	 */
	double getPrecision();

	/**
	 * Sets the value of the '{@link nacre.NFP_Energy#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(double value);

} // NFP_Energy
