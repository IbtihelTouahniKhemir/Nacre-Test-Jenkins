/**
 */
package fr.cea.nacre.model.NACREMM.Hazard;

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
 * @see fr.cea.nacre.model.NACREMM.Hazard.HazardFactory
 * @model kind="package"
 * @generated
 */
public interface HazardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Hazard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///NACREMM/Hazard.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NACREMM.Hazard";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HazardPackage eINSTANCE = fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.Hazard.impl.AbstractHazardImpl <em>Abstract Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.AbstractHazardImpl
	 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl#getAbstractHazard()
	 * @generated
	 */
	int ABSTRACT_HAZARD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HAZARD__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HAZARD__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HAZARD__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HAZARD__DESCRIPTION = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HAZARD__JUSTIFICATION = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HAZARD_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HAZARD_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.Hazard.impl.CommunicationHazardImpl <em>Communication Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.CommunicationHazardImpl
	 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl#getCommunicationHazard()
	 * @generated
	 */
	int COMMUNICATION_HAZARD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__NAME = ABSTRACT_HAZARD__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__UID = ABSTRACT_HAZARD__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__QUALIFIED_NAME = ABSTRACT_HAZARD__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__DESCRIPTION = ABSTRACT_HAZARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__JUSTIFICATION = ABSTRACT_HAZARD__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__COMPONENT = ABSTRACT_HAZARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__FROM = ABSTRACT_HAZARD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__TO = ABSTRACT_HAZARD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__PERIOD = ABSTRACT_HAZARD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD__PERCENT = ABSTRACT_HAZARD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Communication Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD_FEATURE_COUNT = ABSTRACT_HAZARD_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Communication Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HAZARD_OPERATION_COUNT = ABSTRACT_HAZARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.Hazard.impl.CraHazardImpl <em>Cra Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.CraHazardImpl
	 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl#getCraHazard()
	 * @generated
	 */
	int CRA_HAZARD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_HAZARD__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_HAZARD__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_HAZARD__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Cra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_HAZARD__CRA = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Hazards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_HAZARD__COMMUNICATION_HAZARDS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cra Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_HAZARD_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cra Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRA_HAZARD_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.Hazard.impl.NACREHazardImpl <em>NACRE Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.NACREHazardImpl
	 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl#getNACREHazard()
	 * @generated
	 */
	int NACRE_HAZARD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACRE_HAZARD__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACRE_HAZARD__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACRE_HAZARD__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Cra Hazards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACRE_HAZARD__CRA_HAZARDS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cfa Hazards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACRE_HAZARD__CFA_HAZARDS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NACRE Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACRE_HAZARD_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>NACRE Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACRE_HAZARD_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.Hazard.impl.CfaHazardImpl <em>Cfa Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.CfaHazardImpl
	 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl#getCfaHazard()
	 * @generated
	 */
	int CFA_HAZARD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA_HAZARD__NAME = UIDPackage.UID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA_HAZARD__UID = UIDPackage.UID_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA_HAZARD__QUALIFIED_NAME = UIDPackage.UID_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Line Hazards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA_HAZARD__LINE_HAZARDS = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cfa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA_HAZARD__CFA = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generatorhazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA_HAZARD__GENERATORHAZARD = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cfa Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA_HAZARD_FEATURE_COUNT = UIDPackage.UID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cfa Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFA_HAZARD_OPERATION_COUNT = UIDPackage.UID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.Hazard.impl.LineHazardImpl <em>Line Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.LineHazardImpl
	 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl#getLineHazard()
	 * @generated
	 */
	int LINE_HAZARD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD__NAME = ABSTRACT_HAZARD__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD__UID = ABSTRACT_HAZARD__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD__QUALIFIED_NAME = ABSTRACT_HAZARD__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD__DESCRIPTION = ABSTRACT_HAZARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD__JUSTIFICATION = ABSTRACT_HAZARD__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD__LINE = ABSTRACT_HAZARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD__START = ABSTRACT_HAZARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Line Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD_FEATURE_COUNT = ABSTRACT_HAZARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Line Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_HAZARD_OPERATION_COUNT = ABSTRACT_HAZARD_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link fr.cea.nacre.model.NACREMM.Hazard.impl.GeneratorHazardImpl <em>Generator Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.GeneratorHazardImpl
	 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl#getGeneratorHazard()
	 * @generated
	 */
	int GENERATOR_HAZARD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD__NAME = ABSTRACT_HAZARD__NAME;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD__UID = ABSTRACT_HAZARD__UID;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD__QUALIFIED_NAME = ABSTRACT_HAZARD__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD__DESCRIPTION = ABSTRACT_HAZARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD__JUSTIFICATION = ABSTRACT_HAZARD__JUSTIFICATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD__START = ABSTRACT_HAZARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD__GENERATOR = ABSTRACT_HAZARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generator Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD_FEATURE_COUNT = ABSTRACT_HAZARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generator Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_HAZARD_OPERATION_COUNT = ABSTRACT_HAZARD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard <em>Communication Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Hazard</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard
	 * @generated
	 */
	EClass getCommunicationHazard();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getComponent()
	 * @see #getCommunicationHazard()
	 * @generated
	 */
	EAttribute getCommunicationHazard_Component();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getFrom()
	 * @see #getCommunicationHazard()
	 * @generated
	 */
	EAttribute getCommunicationHazard_From();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getTo()
	 * @see #getCommunicationHazard()
	 * @generated
	 */
	EAttribute getCommunicationHazard_To();

	/**
	 * Returns the meta object for the reference '{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getPeriod()
	 * @see #getCommunicationHazard()
	 * @generated
	 */
	EReference getCommunicationHazard_Period();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getPercent <em>Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CommunicationHazard#getPercent()
	 * @see #getCommunicationHazard()
	 * @generated
	 */
	EAttribute getCommunicationHazard_Percent();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.Hazard.AbstractHazard <em>Abstract Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Hazard</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.AbstractHazard
	 * @generated
	 */
	EClass getAbstractHazard();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.Hazard.AbstractHazard#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.AbstractHazard#getDescription()
	 * @see #getAbstractHazard()
	 * @generated
	 */
	EAttribute getAbstractHazard_Description();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.Hazard.AbstractHazard#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.AbstractHazard#getJustification()
	 * @see #getAbstractHazard()
	 * @generated
	 */
	EAttribute getAbstractHazard_Justification();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.Hazard.CraHazard <em>Cra Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cra Hazard</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CraHazard
	 * @generated
	 */
	EClass getCraHazard();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.Hazard.CraHazard#getCra <em>Cra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cra</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CraHazard#getCra()
	 * @see #getCraHazard()
	 * @generated
	 */
	EAttribute getCraHazard_Cra();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.Hazard.CraHazard#getCommunicationHazards <em>Communication Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Hazards</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CraHazard#getCommunicationHazards()
	 * @see #getCraHazard()
	 * @generated
	 */
	EReference getCraHazard_CommunicationHazards();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.Hazard.NACREHazard <em>NACRE Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NACRE Hazard</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.NACREHazard
	 * @generated
	 */
	EClass getNACREHazard();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.Hazard.NACREHazard#getCraHazards <em>Cra Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cra Hazards</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.NACREHazard#getCraHazards()
	 * @see #getNACREHazard()
	 * @generated
	 */
	EReference getNACREHazard_CraHazards();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.Hazard.NACREHazard#getCfaHazards <em>Cfa Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cfa Hazards</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.NACREHazard#getCfaHazards()
	 * @see #getNACREHazard()
	 * @generated
	 */
	EReference getNACREHazard_CfaHazards();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.Hazard.CfaHazard <em>Cfa Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cfa Hazard</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CfaHazard
	 * @generated
	 */
	EClass getCfaHazard();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.Hazard.CfaHazard#getLineHazards <em>Line Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line Hazards</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CfaHazard#getLineHazards()
	 * @see #getCfaHazard()
	 * @generated
	 */
	EReference getCfaHazard_LineHazards();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.Hazard.CfaHazard#getCfa <em>Cfa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cfa</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CfaHazard#getCfa()
	 * @see #getCfaHazard()
	 * @generated
	 */
	EAttribute getCfaHazard_Cfa();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cea.nacre.model.NACREMM.Hazard.CfaHazard#getGeneratorhazard <em>Generatorhazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generatorhazard</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.CfaHazard#getGeneratorhazard()
	 * @see #getCfaHazard()
	 * @generated
	 */
	EReference getCfaHazard_Generatorhazard();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.Hazard.LineHazard <em>Line Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Hazard</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.LineHazard
	 * @generated
	 */
	EClass getLineHazard();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.Hazard.LineHazard#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.LineHazard#getLine()
	 * @see #getLineHazard()
	 * @generated
	 */
	EAttribute getLineHazard_Line();

	/**
	 * Returns the meta object for the reference '{@link fr.cea.nacre.model.NACREMM.Hazard.LineHazard#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.LineHazard#getStart()
	 * @see #getLineHazard()
	 * @generated
	 */
	EReference getLineHazard_Start();

	/**
	 * Returns the meta object for class '{@link fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard <em>Generator Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Hazard</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard
	 * @generated
	 */
	EClass getGeneratorHazard();

	/**
	 * Returns the meta object for the reference '{@link fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard#getStart()
	 * @see #getGeneratorHazard()
	 * @generated
	 */
	EReference getGeneratorHazard_Start();

	/**
	 * Returns the meta object for the attribute '{@link fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see fr.cea.nacre.model.NACREMM.Hazard.GeneratorHazard#getGenerator()
	 * @see #getGeneratorHazard()
	 * @generated
	 */
	EAttribute getGeneratorHazard_Generator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HazardFactory getHazardFactory();

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
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.Hazard.impl.CommunicationHazardImpl <em>Communication Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.CommunicationHazardImpl
		 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl#getCommunicationHazard()
		 * @generated
		 */
		EClass COMMUNICATION_HAZARD = eINSTANCE.getCommunicationHazard();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_HAZARD__COMPONENT = eINSTANCE.getCommunicationHazard_Component();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_HAZARD__FROM = eINSTANCE.getCommunicationHazard_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_HAZARD__TO = eINSTANCE.getCommunicationHazard_To();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_HAZARD__PERIOD = eINSTANCE.getCommunicationHazard_Period();

		/**
		 * The meta object literal for the '<em><b>Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_HAZARD__PERCENT = eINSTANCE.getCommunicationHazard_Percent();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.Hazard.impl.AbstractHazardImpl <em>Abstract Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.AbstractHazardImpl
		 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl#getAbstractHazard()
		 * @generated
		 */
		EClass ABSTRACT_HAZARD = eINSTANCE.getAbstractHazard();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_HAZARD__DESCRIPTION = eINSTANCE.getAbstractHazard_Description();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_HAZARD__JUSTIFICATION = eINSTANCE.getAbstractHazard_Justification();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.Hazard.impl.CraHazardImpl <em>Cra Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.CraHazardImpl
		 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl#getCraHazard()
		 * @generated
		 */
		EClass CRA_HAZARD = eINSTANCE.getCraHazard();

		/**
		 * The meta object literal for the '<em><b>Cra</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRA_HAZARD__CRA = eINSTANCE.getCraHazard_Cra();

		/**
		 * The meta object literal for the '<em><b>Communication Hazards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRA_HAZARD__COMMUNICATION_HAZARDS = eINSTANCE.getCraHazard_CommunicationHazards();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.Hazard.impl.NACREHazardImpl <em>NACRE Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.NACREHazardImpl
		 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl#getNACREHazard()
		 * @generated
		 */
		EClass NACRE_HAZARD = eINSTANCE.getNACREHazard();

		/**
		 * The meta object literal for the '<em><b>Cra Hazards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACRE_HAZARD__CRA_HAZARDS = eINSTANCE.getNACREHazard_CraHazards();

		/**
		 * The meta object literal for the '<em><b>Cfa Hazards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACRE_HAZARD__CFA_HAZARDS = eINSTANCE.getNACREHazard_CfaHazards();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.Hazard.impl.CfaHazardImpl <em>Cfa Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.CfaHazardImpl
		 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl#getCfaHazard()
		 * @generated
		 */
		EClass CFA_HAZARD = eINSTANCE.getCfaHazard();

		/**
		 * The meta object literal for the '<em><b>Line Hazards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFA_HAZARD__LINE_HAZARDS = eINSTANCE.getCfaHazard_LineHazards();

		/**
		 * The meta object literal for the '<em><b>Cfa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CFA_HAZARD__CFA = eINSTANCE.getCfaHazard_Cfa();

		/**
		 * The meta object literal for the '<em><b>Generatorhazard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFA_HAZARD__GENERATORHAZARD = eINSTANCE.getCfaHazard_Generatorhazard();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.Hazard.impl.LineHazardImpl <em>Line Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.LineHazardImpl
		 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl#getLineHazard()
		 * @generated
		 */
		EClass LINE_HAZARD = eINSTANCE.getLineHazard();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_HAZARD__LINE = eINSTANCE.getLineHazard_Line();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_HAZARD__START = eINSTANCE.getLineHazard_Start();

		/**
		 * The meta object literal for the '{@link fr.cea.nacre.model.NACREMM.Hazard.impl.GeneratorHazardImpl <em>Generator Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.GeneratorHazardImpl
		 * @see fr.cea.nacre.model.NACREMM.Hazard.impl.HazardPackageImpl#getGeneratorHazard()
		 * @generated
		 */
		EClass GENERATOR_HAZARD = eINSTANCE.getGeneratorHazard();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_HAZARD__START = eINSTANCE.getGeneratorHazard_Start();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_HAZARD__GENERATOR = eINSTANCE.getGeneratorHazard_Generator();

	}

} //HazardPackage
