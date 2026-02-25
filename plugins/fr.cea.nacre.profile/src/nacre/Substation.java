/**
 */
package nacre;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.Substation#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link nacre.Substation#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link nacre.Substation#getBus <em>Bus</em>}</li>
 *   <li>{@link nacre.Substation#getMaingrid <em>Maingrid</em>}</li>
 *   <li>{@link nacre.Substation#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getSubstation()
 * @model
 * @generated
 */
public interface Substation extends EObject {
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
	 * @see nacre.NacrePackage#getSubstation_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link nacre.Substation#getBase_Class <em>Base Class</em>}' reference.
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
	 * @see nacre.NacrePackage#getSubstation_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link nacre.Substation#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' reference list.
	 * The list contents are of type {@link nacre.Bus}.
	 * It is bidirectional and its opposite is '{@link nacre.Bus#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' reference list.
	 * @see nacre.NacrePackage#getSubstation_Bus()
	 * @see nacre.Bus#getSubstation
	 * @model opposite="substation" ordered="false"
	 * @generated
	 */
	EList<Bus> getBus();

	/**
	 * Returns the value of the '<em><b>Maingrid</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link nacre.MainGrid#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maingrid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maingrid</em>' reference.
	 * @see #setMaingrid(MainGrid)
	 * @see nacre.NacrePackage#getSubstation_Maingrid()
	 * @see nacre.MainGrid#getSubstation
	 * @model opposite="substation" required="true" ordered="false"
	 * @generated
	 */
	MainGrid getMaingrid();

	/**
	 * Sets the value of the '{@link nacre.Substation#getMaingrid <em>Maingrid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maingrid</em>' reference.
	 * @see #getMaingrid()
	 * @generated
	 */
	void setMaingrid(MainGrid value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link nacre.Zone#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' reference.
	 * @see #setZone(Zone)
	 * @see nacre.NacrePackage#getSubstation_Zone()
	 * @see nacre.Zone#getSubstation
	 * @model opposite="substation" required="true" ordered="false"
	 * @generated
	 */
	Zone getZone();

	/**
	 * Sets the value of the '{@link nacre.Substation#getZone <em>Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' reference.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(Zone value);

} // Substation
