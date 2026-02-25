/**
 */
package nacre;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.Bus#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link nacre.Bus#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link nacre.Bus#getNominalLevel <em>Nominal Level</em>}</li>
 *   <li>{@link nacre.Bus#isConnected <em>Connected</em>}</li>
 *   <li>{@link nacre.Bus#getEquipement <em>Equipement</em>}</li>
 *   <li>{@link nacre.Bus#getSubstation <em>Substation</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getBus()
 * @model
 * @generated
 */
public interface Bus extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see nacre.NacrePackage#getBus_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link nacre.Bus#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see nacre.NacrePackage#getBus_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link nacre.Bus#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Nominal Level</b></em>' attribute.
	 * The literals are from the enumeration {@link nacre.VoltageLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Level</em>' attribute.
	 * @see nacre.VoltageLevel
	 * @see #setNominalLevel(VoltageLevel)
	 * @see nacre.NacrePackage#getBus_NominalLevel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VoltageLevel getNominalLevel();

	/**
	 * Sets the value of the '{@link nacre.Bus#getNominalLevel <em>Nominal Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Level</em>' attribute.
	 * @see nacre.VoltageLevel
	 * @see #getNominalLevel()
	 * @generated
	 */
	void setNominalLevel(VoltageLevel value);

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #setConnected(boolean)
	 * @see nacre.NacrePackage#getBus_Connected()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isConnected();

	/**
	 * Sets the value of the '{@link nacre.Bus#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isConnected()
	 * @generated
	 */
	void setConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Equipement</b></em>' reference list.
	 * The list contents are of type {@link nacre.Equipement}.
	 * It is bidirectional and its opposite is '{@link nacre.Equipement#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipement</em>' reference list.
	 * @see nacre.NacrePackage#getBus_Equipement()
	 * @see nacre.Equipement#getBus
	 * @model opposite="bus" required="true" ordered="false"
	 * @generated
	 */
	EList<Equipement> getEquipement();

	/**
	 * Returns the value of the '<em><b>Substation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link nacre.Substation#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substation</em>' reference.
	 * @see #setSubstation(Substation)
	 * @see nacre.NacrePackage#getBus_Substation()
	 * @see nacre.Substation#getBus
	 * @model opposite="bus" required="true" ordered="false"
	 * @generated
	 */
	Substation getSubstation();

	/**
	 * Sets the value of the '{@link nacre.Bus#getSubstation <em>Substation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substation</em>' reference.
	 * @see #getSubstation()
	 * @generated
	 */
	void setSubstation(Substation value);

} // Bus
