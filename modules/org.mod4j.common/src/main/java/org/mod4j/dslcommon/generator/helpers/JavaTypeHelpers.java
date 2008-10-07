package org.mod4j.dslcommon.generator.helpers;

public class JavaTypeHelpers {

    public static String javaPrimitiveType(String typename, boolean nullable) {
        if (typename.equalsIgnoreCase("boolean") ) {
            if( nullable ) {
                return "Boolean";
            } else {
                return "boolean";
            }
        } else if (typename.equalsIgnoreCase("string") ) {
            return "String";
        } else if (typename.equalsIgnoreCase("integer") ) {
            if( nullable ) {
                return "Integer";
            } else {
                return "int";
            }
        } else if (typename.equalsIgnoreCase("decimal") ) {
            if( nullable ) {
                return "Float";
            } else {
                return "float";
            }
        } else if (typename.equalsIgnoreCase("datetime") ) {
            return "DateTime";
        } 
        return "void";
    }
    
}
