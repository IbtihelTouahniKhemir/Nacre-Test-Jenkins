/**
 */
package nacre;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.LocalController#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link nacre.LocalController#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link nacre.LocalController#getEquipement <em>Equipement</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getLocalController()
 * @model
 * @generated
 */
public interface LocalController extends Controller {
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
	 * @see nacre.NacrePackage#getLocalController_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link nacre.LocalController#getBase_Class <em>Base Class</em>}' reference.
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
	 * @see nacre.NacrePackage#getLocalController_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link nacre.LocalController#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Equipement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link nacre.Equipement#getLocalcontroller <em>Localcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipement</em>' reference.
	 * @see #setEquipement(Equipement)
	 * @see nacre.NacrePackage#getLocalController_Equipement()
	 * @see nacre.Equipement#getLocalcontroller
	 * @model opposite="localcontroller" required="true" ordered="false"
	 * @generated
	 */
	Equipement getEquipement();

	/**
	 * Sets the value of the '{@link nacre.LocalController#getEquipement <em>Equipement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipement</em>' reference.
	 * @see #getEquipement()
	 * @generated
	 */
	void setEquipement(Equipement value);

} // LocalController
