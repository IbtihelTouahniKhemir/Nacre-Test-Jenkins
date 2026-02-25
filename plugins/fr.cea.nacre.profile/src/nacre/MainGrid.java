/**
 */
package nacre;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nacre.MainGrid#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link nacre.MainGrid#getZone <em>Zone</em>}</li>
 *   <li>{@link nacre.MainGrid#getSubstation <em>Substation</em>}</li>
 *   <li>{@link nacre.MainGrid#getCentralcontroler <em>Centralcontroler</em>}</li>
 *   <li>{@link nacre.MainGrid#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see nacre.NacrePackage#getMainGrid()
 * @model
 * @generated
 */
public interface MainGrid extends EObject {
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
	 * @see nacre.NacrePackage#getMainGrid_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link nacre.MainGrid#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' reference list.
	 * The list contents are of type {@link nacre.Zone}.
	 * It is bidirectional and its opposite is '{@link nacre.Zone#getMaingrid <em>Maingrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' reference list.
	 * @see nacre.NacrePackage#getMainGrid_Zone()
	 * @see nacre.Zone#getMaingrid
	 * @model opposite="maingrid" ordered="false"
	 * @generated
	 */
	EList<Zone> getZone();

	/**
	 * Returns the value of the '<em><b>Substation</b></em>' reference list.
	 * The list contents are of type {@link nacre.Substation}.
	 * It is bidirectional and its opposite is '{@link nacre.Substation#getMaingrid <em>Maingrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substation</em>' reference list.
	 * @see nacre.NacrePackage#getMainGrid_Substation()
	 * @see nacre.Substation#getMaingrid
	 * @model opposite="maingrid" ordered="false"
	 * @generated
	 */
	EList<Substation> getSubstation();

	/**
	 * Returns the value of the '<em><b>Centralcontroler</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link nacre.CentralController#getMaingrid <em>Maingrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centralcontroler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centralcontroler</em>' reference.
	 * @see #setCentralcontroler(CentralController)
	 * @see nacre.NacrePackage#getMainGrid_Centralcontroler()
	 * @see nacre.CentralController#getMaingrid
	 * @model opposite="maingrid" required="true" ordered="false"
	 * @generated
	 */
	CentralController getCentralcontroler();

	/**
	 * Sets the value of the '{@link nacre.MainGrid#getCentralcontroler <em>Centralcontroler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centralcontroler</em>' reference.
	 * @see #getCentralcontroler()
	 * @generated
	 */
	void setCentralcontroler(CentralController value);

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
	 * @see nacre.NacrePackage#getMainGrid_Lines()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Line> getLines();

} // MainGrid
