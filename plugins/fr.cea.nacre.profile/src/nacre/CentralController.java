/**
 */
package nacre;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Central Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.CentralController#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link nacre.CentralController#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link nacre.CentralController#getMaingrid <em>Maingrid</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getCentralController()
 * @model
 * @generated
 */
public interface CentralController extends Controller {
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
	 * @see nacre.NacrePackage#getCentralController_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link nacre.CentralController#getBase_Class <em>Base Class</em>}' reference.
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
	 * @see nacre.NacrePackage#getCentralController_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link nacre.CentralController#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Maingrid</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link nacre.MainGrid#getCentralcontroler <em>Centralcontroler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maingrid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maingrid</em>' reference.
	 * @see #setMaingrid(MainGrid)
	 * @see nacre.NacrePackage#getCentralController_Maingrid()
	 * @see nacre.MainGrid#getCentralcontroler
	 * @model opposite="centralcontroler" required="true" ordered="false"
	 * @generated
	 */
	MainGrid getMaingrid();

	/**
	 * Sets the value of the '{@link nacre.CentralController#getMaingrid <em>Maingrid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maingrid</em>' reference.
	 * @see #getMaingrid()
	 * @generated
	 */
	void setMaingrid(MainGrid value);

} // CentralController
