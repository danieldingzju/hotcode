package org.hotcode.hotcode.constants;

import java.util.HashSet;
import java.util.Set;

/**
 * Constants of HotCode are defined here.
 * 
 * @author khotyn 2013-06-24 20:22:14
 */
public class HotCodeConstant {

    /**
     * The field name of the field which holds the static fields of the class.
     */
    public static final String      HOTCODE_STATIC_FIELDS         = "__hotcode_static_fields__";
    /**
     * The field name of the field which holds the instance fields of the class.
     */
    public static final String      HOTCODE_INSTANCE_FIELDS       = "__hotcode_instance_fields__";
    /**
     * The field name of the field which is used for class reload.
     */
    public static final String      HOTCODE_CLASS_RELOADER_FIELDS = "__hotcode_class_reloader_field__";
    /**
     * The name of the HotCode "<clinit>" method for class reinitialize.
     */
    public static final String      HOTCODE_CLINIT_METHOD_NAME    = "__hotcode_clinit__";

    public static final Set<String> HOTCODE_ADDED_FIELDS          = new HashSet<>();

    static {
        HOTCODE_ADDED_FIELDS.add(HOTCODE_STATIC_FIELDS);
        HOTCODE_ADDED_FIELDS.add(HOTCODE_INSTANCE_FIELDS);
        HOTCODE_ADDED_FIELDS.add(HOTCODE_CLASS_RELOADER_FIELDS);
    }
}
