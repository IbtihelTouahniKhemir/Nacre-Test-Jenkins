/**
 */
package fr.cea.nacre.model.NACREMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.cea.nacre.model.NACREMM.NACREMMPackage
 * @generated
 */
public interface NACREMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NACREMMFactory eINSTANCE = fr.cea.nacre.model.NACREMM.impl.NACREMMFactoryImpl.init();




	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NACREMMPackage getNACREMMPackage();

} //NACREMMFactory
