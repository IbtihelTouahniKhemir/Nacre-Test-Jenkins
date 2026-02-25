package fr.cea.nacre.ui.plus.parser.deserializer;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

import fr.cea.nacre.model.NACREMM.cfa.CfaPackage;

/** this class is used to not generate EMF attribute about EMF
 *
 */
public class DeserializationExclusionStrategy  implements ExclusionStrategy{
	@Override
	public boolean shouldSkipField(FieldAttributes field) {
		if (field.getName().equals(CfaPackage.eINSTANCE.getBus_RteInstallations().getName())) {
			return true;
		}
		if (field.getName().equals(CfaPackage.eINSTANCE.getBus_Generators().getName())) {
			return true;
		}
		if (field.getName().equals(CfaPackage.eINSTANCE.getBus_Batteries().getName())) {
			return true;
		}
		if (field.getName().equals(CfaPackage.eINSTANCE.getBus_Loads().getName())) {
			return true;
		}
		if( field.getName().equals(CfaPackage.eINSTANCE.getZone_Substations().getName())) {
			return true;
		}
		if( field.getName().equals(CfaPackage.eINSTANCE.getSubstation_Bus().getName())) {
			return true;
		}
		return false;
	}

	@Override
	public boolean shouldSkipClass(Class<?> clazz) {
		return false;
	}
};
