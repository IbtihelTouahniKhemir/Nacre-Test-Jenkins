/**
 */
package fr.cea.nacre.model.NACREMM.cfra;

import fr.cea.nacre.model.NACREMM.UID.UIDPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see fr.cea.nacre.model.NACREMM.cfra.CfraFactory
 * @model kind="package"
 * @generated
 */
public interface CfraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cfra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///NACREMM/cfra.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NACREMM.cfra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CfraPackage eINSTANCE = fr.cea.nacre.model.NACREMM.cfra.impl.CfraPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfra.impl.CfraImpl <em>Cfra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfra.impl.CfraImpl
	 * @see fr.cea.nacre.model.NACREMM.cfra.impl.CfraPackageImpl#getCfra()
	 * @generated
	 */
	int CFRA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFRA__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFRA__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFRA__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Abstractions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFRA__ABSTRACTIONS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFRA__CRA = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cfra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFRA_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cfra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFRA_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.cfra.impl.AbstractionImpl <em>Abstraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.cfra.impl.AbstractionImpl
	 * @see fr.cea.nacre.model.NACREMM.cfra.impl.CfraPackageImpl#getAbstraction()
	 * @generated
	 */
	int ABSTRACTION = 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Abstraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfra.Cfra <em>Cfra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cfra</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfra.Cfra
	 * @generated
	 */
	EClass getCfra();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.cfra.Cfra#getAbstractions <em>Abstractions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstractions</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfra.Cfra#getAbstractions()
	 * @see #getCfra()
	 * @generated
	 */
	EReference getCfra_Abstractions();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfra.Cfra#getCra <em>Cra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cra</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfra.Cfra#getCra()
	 * @see #getCfra()
	 * @generated
	 */
	EAttribute getCfra_Cra();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.cfra.Abstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstraction</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfra.Abstraction
	 * @generated
	 */
	EClass getAbstraction();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfra.Abstraction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfra.Abstraction#getFunction()
	 * @see #getAbstraction()
	 * @generated
	 */
	EAttribute getAbstraction_Function();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.cfra.Abstraction#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see fr.cea.nacre.model.NACREMM.cfra.Abstraction#getResource()
	 * @see #getAbstraction()
	 * @generated
	 */
	EAttribute getAbstraction_Resource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CfraFactory getCfraFactory();

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
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfra.impl.CfraImpl <em>Cfra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfra.impl.CfraImpl
		 * @see fr.cea.nacre.model.NACREMM.cfra.impl.CfraPackageImpl#getCfra()
		 * @generated
		 */
		EClass CFRA = eINSTANCE.getCfra();

		/**
		 * The meta object literal for the '<em><b>Abstractions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFRA__ABSTRACTIONS = eINSTANCE.getCfra_Abstractions();

		/**
		 * The meta object literal for the '<em><b>Cra</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CFRA__CRA = eINSTANCE.getCfra_Cra();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.cfra.impl.AbstractionImpl <em>Abstraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.cfra.impl.AbstractionImpl
		 * @see fr.cea.nacre.model.NACREMM.cfra.impl.CfraPackageImpl#getAbstraction()
		 * @generated
		 */
		EClass ABSTRACTION = eINSTANCE.getAbstraction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACTION__FUNCTION = eINSTANCE.getAbstraction_Function();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACTION__RESOURCE = eINSTANCE.getAbstraction_Resource();

	}

} //CfraPackage
