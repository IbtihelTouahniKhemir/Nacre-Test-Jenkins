/**
 */
package fr.cea.nacre.model.NACREMM.study;

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
 * @see fr.cea.nacre.model.NACREMM.study.StudyFactory
 * @model kind="package"
 * @generated
 */
public interface StudyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "study";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///NACREMM/study.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NACREMM.study";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyPackage eINSTANCE = fr.cea.nacre.model.NACREMM.study.impl.StudyPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.study.impl.StudyImpl <em>Study</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.study.impl.StudyImpl
	 * @see fr.cea.nacre.model.NACREMM.study.impl.StudyPackageImpl#getStudy()
	 * @generated
	 */
	int STUDY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Cfa</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY__CFA = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY__CRAS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cfras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY__CFRAS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY__HAZARDS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Study</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Study</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.study.impl.ManifestImpl <em>Manifest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.study.impl.ManifestImpl
	 * @see fr.cea.nacre.model.NACREMM.study.impl.StudyPackageImpl#getManifest()
	 * @generated
	 */
	int MANIFEST = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.study.impl.UsingDirectivesImpl <em>Using Directives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.study.impl.UsingDirectivesImpl
	 * @see fr.cea.nacre.model.NACREMM.study.impl.StudyPackageImpl#getUsingDirectives()
	 * @generated
	 */
	int USING_DIRECTIVES = 2;

	/**
	 * The feature id for the '<em><b>Iidm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_DIRECTIVES__IIDM = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_DIRECTIVES__FILTER = 1;

	/**
	 * The number of structural features of the '<em>Using Directives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_DIRECTIVES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Using Directives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_DIRECTIVES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.study.Study <em>Study</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study</em>'.
	 * @see fr.cea.nacre.model.NACREMM.study.Study
	 * @generated
	 */
	EClass getStudy();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.study.Study#getCfa <em>Cfa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cfa</em>'.
	 * @see fr.cea.nacre.model.NACREMM.study.Study#getCfa()
	 * @see #getStudy()
	 * @generated
	 */
	EReference getStudy_Cfa();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.study.Study#getCras <em>Cras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cras</em>'.
	 * @see fr.cea.nacre.model.NACREMM.study.Study#getCras()
	 * @see #getStudy()
	 * @generated
	 */
	EReference getStudy_Cras();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.study.Study#getCfras <em>Cfras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cfras</em>'.
	 * @see fr.cea.nacre.model.NACREMM.study.Study#getCfras()
	 * @see #getStudy()
	 * @generated
	 */
	EReference getStudy_Cfras();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cea.nacre.model.NACREMM.study.Study#getHazards <em>Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hazards</em>'.
	 * @see fr.cea.nacre.model.NACREMM.study.Study#getHazards()
	 * @see #getStudy()
	 * @generated
	 */
	EReference getStudy_Hazards();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.study.Manifest <em>Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manifest</em>'.
	 * @see fr.cea.nacre.model.NACREMM.study.Manifest
	 * @generated
	 */
	EClass getManifest();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.study.Manifest#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see fr.cea.nacre.model.NACREMM.study.Manifest#getVersion()
	 * @see #getManifest()
	 * @generated
	 */
	EAttribute getManifest_Version();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.study.Manifest#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.cea.nacre.model.NACREMM.study.Manifest#getDescription()
	 * @see #getManifest()
	 * @generated
	 */
	EAttribute getManifest_Description();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.study.Manifest#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see fr.cea.nacre.model.NACREMM.study.Manifest#getService()
	 * @see #getManifest()
	 * @generated
	 */
	EAttribute getManifest_Service();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.study.Manifest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.cea.nacre.model.NACREMM.study.Manifest#getType()
	 * @see #getManifest()
	 * @generated
	 */
	EAttribute getManifest_Type();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.study.UsingDirectives <em>Using Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Using Directives</em>'.
	 * @see fr.cea.nacre.model.NACREMM.study.UsingDirectives
	 * @generated
	 */
	EClass getUsingDirectives();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.study.UsingDirectives#getIidm <em>Iidm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iidm</em>'.
	 * @see fr.cea.nacre.model.NACREMM.study.UsingDirectives#getIidm()
	 * @see #getUsingDirectives()
	 * @generated
	 */
	EAttribute getUsingDirectives_Iidm();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.study.UsingDirectives#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see fr.cea.nacre.model.NACREMM.study.UsingDirectives#getFilter()
	 * @see #getUsingDirectives()
	 * @generated
	 */
	EAttribute getUsingDirectives_Filter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StudyFactory getStudyFactory();

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
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.study.impl.StudyImpl <em>Study</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.study.impl.StudyImpl
		 * @see fr.cea.nacre.model.NACREMM.study.impl.StudyPackageImpl#getStudy()
		 * @generated
		 */
		EClass STUDY = eINSTANCE.getStudy();

		/**
		 * The meta object literal for the '<em><b>Cfa</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY__CFA = eINSTANCE.getStudy_Cfa();

		/**
		 * The meta object literal for the '<em><b>Cras</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY__CRAS = eINSTANCE.getStudy_Cras();

		/**
		 * The meta object literal for the '<em><b>Cfras</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY__CFRAS = eINSTANCE.getStudy_Cfras();

		/**
		 * The meta object literal for the '<em><b>Hazards</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY__HAZARDS = eINSTANCE.getStudy_Hazards();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.study.impl.ManifestImpl <em>Manifest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.study.impl.ManifestImpl
		 * @see fr.cea.nacre.model.NACREMM.study.impl.StudyPackageImpl#getManifest()
		 * @generated
		 */
		EClass MANIFEST = eINSTANCE.getManifest();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__VERSION = eINSTANCE.getManifest_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__DESCRIPTION = eINSTANCE.getManifest_Description();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__SERVICE = eINSTANCE.getManifest_Service();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__TYPE = eINSTANCE.getManifest_Type();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.study.impl.UsingDirectivesImpl <em>Using Directives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.study.impl.UsingDirectivesImpl
		 * @see fr.cea.nacre.model.NACREMM.study.impl.StudyPackageImpl#getUsingDirectives()
		 * @generated
		 */
		EClass USING_DIRECTIVES = eINSTANCE.getUsingDirectives();

		/**
		 * The meta object literal for the '<em><b>Iidm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USING_DIRECTIVES__IIDM = eINSTANCE.getUsingDirectives_Iidm();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USING_DIRECTIVES__FILTER = eINSTANCE.getUsingDirectives_Filter();

	}

} //StudyPackage
