package org.mod4j.dsl.datacontract.generator.helpers;

import java.util.ArrayList;
import java.util.List;

import org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoBooleanProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoDataProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoDateTimeProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoDecimalProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoIntegerProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoStringProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.Enumeration;

public class DtoHelpers {

    public static String javaType(DtoProperty p) {
        if (p instanceof DtoBooleanProperty) {
            return javaType((DtoBooleanProperty) p);
        } else if (p instanceof DtoStringProperty) {
            return javaType((DtoStringProperty) p);
        } else if (p instanceof DtoIntegerProperty) {
            return javaType((DtoIntegerProperty) p);
        } else if (p instanceof DtoDecimalProperty) {
            return javaType((DtoDecimalProperty) p);
        } else if (p instanceof DtoEnumerationProperty) {
            return javaType((DtoEnumerationProperty) p);
        } else if (p instanceof DtoDateTimeProperty) {
            return javaType((DtoDateTimeProperty) p);
        }
        return "Object";
    }

    public static String javaType(DtoBooleanProperty p) {
        // return p.isNullable() ? "Boolean" : "boolean";
        return "Boolean";
    }

    public static String javaType(DtoDateTimeProperty p) {
        return "DateTime";
    }

    public static String javaType(DtoEnumerationProperty p) {
        Enumeration e = p.getType();
        if (e == null) {
            System.err.println("ERROR in javaType() for EnumerationProperty");
            return "Object";
        }
        return p.getType().getName();
    }

    public static String javaType(DtoStringProperty p) {
        return "String";
    }

    public static String javaType(DtoIntegerProperty p) {
        // return p.isNullable() ? "Integer" : "int";
        return "Integer";
    }

    public static String javaType(DtoDecimalProperty p) {
        // return p.isNullable() ? "Float" : "float";
        return "Float";
    }

    public static List<DtoProperty> getAllProperties(BusinessClassDto cls) {
        List<DtoProperty> result = new ArrayList<DtoProperty>();
        result.addAll(cls.getProperties());
        return result;
    }
    
    public static String javaTranslatorName(String clsName){
        return clsName + "Translator";
    }
    
}
