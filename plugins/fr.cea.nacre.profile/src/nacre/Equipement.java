/**
 */
package nacre;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.Equipement#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link nacre.Equipement#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link nacre.Equipement#isConnected <em>Connected</em>}</li>
 *   <li>{@link nacre.Equipement#isActivable <em>Activable</em>}</li>
 *   <li>{@link nacre.Equipement#getP <em>P</em>}</li>
 *   <li>{@link nacre.Equipement#getQ <em>Q</em>}</li>
 *   <li>{@link nacre.Equipement#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link nacre.Equipement#getLocalcontroller <em>Localcontroller</em>}</li>
 *   <li>{@link nacre.Equipement#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getEquipement()
 * @model abstract="true"
 * @generated
 */
public interface Equipement extends EObject {
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
	 * @see nacre.NacrePackage#getEquipement_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link nacre.Equipement#getBase_Class <em>Base Class</em>}' reference.
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
	 * @see nacre.NacrePackage#getEquipement_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link nacre.Equipement#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

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
	 * @see nacre.NacrePackage#getEquipement_Connected()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isConnected();

	/**
	 * Sets the value of the '{@link nacre.Equipement#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isConnected()
	 * @generated
	 */
	void setConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Activable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activable</em>' attribute.
	 * @see #setActivable(boolean)
	 * @see nacre.NacrePackage#getEquipement_Activable()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isActivable();

	/**
	 * Sets the value of the '{@link nacre.Equipement#isActivable <em>Activable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activable</em>' attribute.
	 * @see #isActivable()
	 * @generated
	 */
	void setActivable(boolean value);

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference.
	 * @see #setP(NFP_Power)
	 * @see nacre.NacrePackage#getEquipement_P()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NFP_Power getP();

	/**
	 * Sets the value of the '{@link nacre.Equipement#getP <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' containment reference.
	 * @see #getP()
	 * @generated
	 */
	void setP(NFP_Power value);

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Q</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' containment reference.
	 * @see #setQ(NFP_Power)
	 * @see nacre.NacrePackage#getEquipement_Q()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NFP_Power getQ();

	/**
	 * Sets the value of the '{@link nacre.Equipement#getQ <em>Q</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' containment reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(NFP_Power value);

	/**
	 * Returns the value of the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Port</em>' reference.
	 * @see #setBase_Port(Port)
	 * @see nacre.NacrePackage#getEquipement_Base_Port()
	 * @model ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link nacre.Equipement#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

	/**
	 * Returns the value of the '<em><b>Localcontroller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link nacre.LocalController#getEquipement <em>Equipement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localcontroller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localcontroller</em>' reference.
	 * @see #setLocalcontroller(LocalController)
	 * @see nacre.NacrePackage#getEquipement_Localcontroller()
	 * @see nacre.LocalController#getEquipement
	 * @model opposite="equipement" required="true" ordered="false"
	 * @generated
	 */
	LocalController getLocalcontroller();

	/**
	 * Sets the value of the '{@link nacre.Equipement#getLocalcontroller <em>Localcontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localcontroller</em>' reference.
	 * @see #getLocalcontroller()
	 * @generated
	 */
	void setLocalcontroller(LocalController value);

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link nacre.Bus#getEquipement <em>Equipement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' reference.
	 * @see #setBus(Bus)
	 * @see nacre.NacrePackage#getEquipement_Bus()
	 * @see nacre.Bus#getEquipement
	 * @model opposite="equipement" required="true" ordered="false"
	 * @generated
	 */
	Bus getBus();

	/**
	 * Sets the value of the '{@link nacre.Equipement#getBus <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus</em>' reference.
	 * @see #getBus()
	 * @generated
	 */
	void setBus(Bus value);

} // Equipement
