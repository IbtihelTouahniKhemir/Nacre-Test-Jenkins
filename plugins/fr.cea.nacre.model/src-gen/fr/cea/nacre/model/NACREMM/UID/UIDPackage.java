/**
 */
package fr.cea.nacre.model.NACREMM.UID;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.cea.nacre.model.NACREMM.UID.UIDFactory
 * @model kind="package"
 * @generated
 */
public interface UIDPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UID";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///NACREMM/UID.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NACREMM.UID";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UIDPackage eINSTANCE = fr.cea.nacre.model.NACREMM.UID.impl.UIDPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl
	 * @see fr.cea.nacre.model.NACREMM.UID.impl.UIDPackageImpl#getUIDElement()
	 * @generated
	 */
	int UID_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UID_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UID_ELEMENT__UID = 1;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UID_ELEMENT__QUALIFIED_NAME = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UID_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UID_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.UID.UIDElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see fr.cea.nacre.model.NACREMM.UID.UIDElement
	 * @generated
	 */
	EClass getUIDElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.UID.UIDElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.cea.nacre.model.NACREMM.UID.UIDElement#getName()
	 * @see #getUIDElement()
	 * @generated
	 */
	EAttribute getUIDElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.UID.UIDElement#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see fr.cea.nacre.model.NACREMM.UID.UIDElement#getUid()
	 * @see #getUIDElement()
	 * @generated
	 */
	EAttribute getUIDElement_Uid();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.UID.UIDElement#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see fr.cea.nacre.model.NACREMM.UID.UIDElement#getQualifiedName()
	 * @see #getUIDElement()
	 * @generated
	 */
	EAttribute getUIDElement_QualifiedName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UIDFactory getUIDFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.UID.impl.UIDElementImpl
		 * @see fr.cea.nacre.model.NACREMM.UID.impl.UIDPackageImpl#getUIDElement()
		 * @generated
		 */
		EClass UID_ELEMENT = eINSTANCE.getUIDElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UID_ELEMENT__NAME = eINSTANCE.getUIDElement_Name();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UID_ELEMENT__UID = eINSTANCE.getUIDElement_Uid();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UID_ELEMENT__QUALIFIED_NAME = eINSTANCE.getUIDElement_QualifiedName();

	}

} //UIDPackage
