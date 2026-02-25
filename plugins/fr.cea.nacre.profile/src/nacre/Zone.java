/**
 */
package nacre;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.Zone#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link nacre.Zone#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link nacre.Zone#getSubstation <em>Substation</em>}</li>
 *   <li>{@link nacre.Zone#getZonalcontroller <em>Zonalcontroller</em>}</li>
 *   <li>{@link nacre.Zone#getLines <em>Lines</em>}</li>
 *   <li>{@link nacre.Zone#getMaingrid <em>Maingrid</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getZone()
 * @model
 * @generated
 */
public interface Zone extends EObject {
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
	 * @see nacre.NacrePackage#getZone_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link nacre.Zone#getBase_Class <em>Base Class</em>}' reference.
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
	 * @see nacre.NacrePackage#getZone_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link nacre.Zone#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Substation</b></em>' reference list.
	 * The list contents are of type {@link nacre.Substation}.
	 * It is bidirectional and its opposite is '{@link nacre.Substation#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substation</em>' reference list.
	 * @see nacre.NacrePackage#getZone_Substation()
	 * @see nacre.Substation#getZone
	 * @model opposite="zone" ordered="false"
	 * @generated
	 */
	EList<Substation> getSubstation();

	/**
	 * Returns the value of the '<em><b>Zonalcontroller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link nacre.ZonalController#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zonalcontroller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zonalcontroller</em>' reference.
	 * @see #setZonalcontroller(ZonalController)
	 * @see nacre.NacrePackage#getZone_Zonalcontroller()
	 * @see nacre.ZonalController#getZone
	 * @model opposite="zone" required="true" ordered="false"
	 * @generated
	 */
	ZonalController getZonalcontroller();

	/**
	 * Sets the value of the '{@link nacre.Zone#getZonalcontroller <em>Zonalcontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zonalcontroller</em>' reference.
	 * @see #getZonalcontroller()
	 * @generated
	 */
	void setZonalcontroller(ZonalController value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' reference list.
	 * The list contents are of type {@link nacre.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' reference list.
	 * @see nacre.NacrePackage#getZone_Lines()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Line> getLines();

	/**
	 * Returns the value of the '<em><b>Maingrid</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link nacre.MainGrid#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maingrid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maingrid</em>' reference.
	 * @see #setMaingrid(MainGrid)
	 * @see nacre.NacrePackage#getZone_Maingrid()
	 * @see nacre.MainGrid#getZone
	 * @model opposite="zone" required="true" ordered="false"
	 * @generated
	 */
	MainGrid getMaingrid();

	/**
	 * Sets the value of the '{@link nacre.Zone#getMaingrid <em>Maingrid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maingrid</em>' reference.
	 * @see #getMaingrid()
	 * @generated
	 */
	void setMaingrid(MainGrid value);

} // Zone
