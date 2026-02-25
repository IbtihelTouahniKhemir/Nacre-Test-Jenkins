package fr.cea.nacre.ui.plus.handlers;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

/** this class is used to not generate EMF attribute about EMF
 *
 */
public class MyExclusionStrategy  implements ExclusionStrategy{
    @Override
    public boolean shouldSkipField(FieldAttributes field) {
        if (field.getName().equals("eContainer")) {
            return true;
        }
        if (field.getName().equals("eFlags")) {
            return true;
        }
        if (field.getName().equals("qualifiedName")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }
};
