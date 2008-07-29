package org.mod4j.businessdomain.generator.helpers;

import java.util.ArrayList;
import java.util.List;

import org.mod4j.dslcommon.generator.helpers.ProjectProperties;
import org.mod4j.dslcommon.generator.helpers.StringHelpers;

import BusinessDomainDsl.AbstractType;
import BusinessDomainDsl.Association;
import BusinessDomainDsl.BoolProperty;
import BusinessDomainDsl.BusinessClass;
import BusinessDomainDsl.AbstractBusinessClass;
import BusinessDomainDsl.BusinessDomainModel;
import BusinessDomainDsl.DateTimeProperty;
import BusinessDomainDsl.DecimalProperty;
import BusinessDomainDsl.Enumeration;
import BusinessDomainDsl.EnumerationProperty;
import BusinessDomainDsl.IntegerProperty;
import BusinessDomainDsl.Multiplicity;
import BusinessDomainDsl.Property;
import BusinessDomainDsl.StringProperty;

public class BusinessClassHelpers {

    /**
     * @param cls
     * @return The name of the Java class for cls
     */
    public static String javaClassName(BusinessClass cls) {
        return StringHelpers.firstCharToUpper(cls.getName());
    }

    /**
     * @param cls
     * @return The name of the Java class for cls
     */
    public static String javaClassName(AbstractBusinessClass cls) {
        return StringHelpers.firstCharToUpper(cls.getName());
    }
    
    /**
     * @param cls
     * @return The name of the Java package for BusinessClass cls
     */
    public static String javaPackageName(BusinessClass cls) {
        BusinessDomainModel model = (BusinessDomainModel) cls.eContainer();
        return StringHelpers.firstCharToUpper(model.getName());
    }

    /**
     * @param cls
     * @return The full name of the Java class for cls, including the package name
     */
    public static String javaFullName(BusinessClass cls) {
        return javaPackageName(cls) + "." + javaClassName(cls);
    }

    public static String javaVarName(BusinessClass cls) {
        return StringHelpers.firstCharToLower(cls.getName());
    }

    /**
     * @param cls
     * @return The name of the abstract implementation base class for BusinessClass cls
     */
    public static String implBaseClassName(BusinessClass cls) {
        return javaClassName(cls) + ProjectProperties.IMPLBASE_SUFFIX;
    }

    /**
     * @param cls
     * @return The Java class name for the data accesss object (dao) class for BusinessClass 'cls'
     */
    public static String daoInterfaceName(BusinessClass cls) {
        return javaClassName(cls) + "Dao";
    }

    /**
     * @param cls
     * @return The Java class name for the data accesss object (dao) bases class for BusinessClass 'cls'
     */
    public static String daoInterfaceBaseName(BusinessClass cls) {
        return daoInterfaceName(cls) + "Base";
    }

    public static String daoImplClassName(BusinessClass cls) {
        return javaClassName(cls) + "DaoImpl";
    }

    public static String daoImplClassBaseName(BusinessClass cls) {
        return daoImplClassName(cls) + "Base";
    }

    public static boolean isOne2Many(Association a) {
        Multiplicity srcMult = a.getSourceMultiplicity();
        Multiplicity tgtMult = a.getTargetMultiplicity();
        return ((srcMult == Multiplicity.ONE) || (srcMult == Multiplicity.ZERO_ONE))
                && ((tgtMult == Multiplicity.ONE_MANY) || (tgtMult == Multiplicity.ZERO_MANY));
    }

    public static boolean isOne2One(Association a) {
        Multiplicity srcMult = a.getSourceMultiplicity();
        Multiplicity tgtMult = a.getTargetMultiplicity();
        return ((srcMult == Multiplicity.ONE) || (srcMult == Multiplicity.ZERO_ONE))
                && ((tgtMult == Multiplicity.ONE) || (tgtMult == Multiplicity.ZERO_ONE));
    }

    public static boolean isMany2One(Association a) {
        Multiplicity srcMult = a.getSourceMultiplicity();
        Multiplicity tgtMult = a.getTargetMultiplicity();
        return ((srcMult == Multiplicity.ONE_MANY) || (srcMult == Multiplicity.ZERO_MANY))
                && ((tgtMult == Multiplicity.ONE) || (tgtMult == Multiplicity.ZERO_ONE));
    }

    public static boolean isMany2Many(Association a) {
        Multiplicity srcMult = a.getSourceMultiplicity();
        Multiplicity tgtMult = a.getTargetMultiplicity();
        return ((srcMult == Multiplicity.ONE_MANY) || (srcMult == Multiplicity.ZERO_MANY))
                && ((tgtMult == Multiplicity.ONE_MANY) || (tgtMult == Multiplicity.ZERO_MANY));
    }

    public static boolean isCompositePart(BusinessClass cls) {
        for (Association a : cls.getAssociationsFrom()) {
            if (a.isComposite() && (a.getSourceMultiplicity() == Multiplicity.ONE)) {
                return true;
            }
        }
        return false;
    }

    public static String javaType(Property p) {
        if (p instanceof BoolProperty) {
            return javaType((BoolProperty) p);
        } else if (p instanceof StringProperty) {
            return javaType((StringProperty) p);
        } else if (p instanceof IntegerProperty) {
            return javaType((IntegerProperty) p);
        } else if (p instanceof DecimalProperty) {
            return javaType((DecimalProperty) p);
        } else if (p instanceof EnumerationProperty) {
            return javaType((EnumerationProperty) p);
        } else if (p instanceof DateTimeProperty) {
            return javaType((DateTimeProperty) p);
        }
        return "Object";
    }

    public static String javaType(BoolProperty p) {
        return p.isNullable() ? "Boolean" : "boolean";
    }

    public static String javaType(DateTimeProperty p) {
        return "DateTime";
    }

    public static String javaType(EnumerationProperty p) {
        Enumeration e = p.getType();
        if (e == null) {
            System.err.println("ERROR in javaType() for EnumerationProperty");
            return "Object";
        }
        return p.getType().getName();
    }

    public static String javaType(StringProperty p) {
        return "String";
    }

    public static String javaType(IntegerProperty p) {
        return p.isNullable() ? "Integer" : "int";
    }

    public static String javaType(DecimalProperty p) {
        return p.isNullable() ? "Float" : "float";
    }

    public static List<Property> getAllProperties(BusinessClass cls) {
        List<Property> result = new ArrayList<Property>();
        if (cls.getSuperclass() != null) {
            result.addAll(getAllProperties(cls.getSuperclass()));
        }
        result.addAll(cls.getProperties());
        return result;
    }

    public static boolean hasSubclasses(BusinessClass clazz) {
        BusinessDomainModel model = (BusinessDomainModel) clazz.eContainer();
        for (AbstractType type : model.getTypes()) {
            if (type instanceof BusinessClass) {
                BusinessClass businessClass = (BusinessClass) type;
                if (businessClass.getSuperclass() != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
