package org.mod4j.businessdomain.generator.helpers;

import java.util.ArrayList;
import java.util.List;

import BusinessDomainDsl.AbstractType;
import BusinessDomainDsl.Association;
import BusinessDomainDsl.BoolProperty;
import BusinessDomainDsl.BusinessClass;
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

    public static String javaNullableType(Property p) {
        if (p instanceof BoolProperty) {
            return javaNullableType((BoolProperty) p);
        } else if (p instanceof StringProperty) {
            return javaNullableType((StringProperty) p);
        } else if (p instanceof IntegerProperty) {
            return javaNullableType((IntegerProperty) p);
        } else if (p instanceof DecimalProperty) {
            return javaNullableType((DecimalProperty) p);
        } else if (p instanceof EnumerationProperty) {
            return javaNullableType((EnumerationProperty) p);
        } else if (p instanceof DateTimeProperty) {
            return javaNullableType((DateTimeProperty) p);
        }
        return "Object";
    }

    public static String javaType(BoolProperty p) {
        return p.isNullable() ? "Boolean" : "boolean";
    }

    public static String javaNullableType(BoolProperty p) {
        return "Boolean";
    }

    public static String javaType(DateTimeProperty p) {
        return "DateTime";
    }

    public static String javaNullableType(DateTimeProperty p) {
        return javaType(p);
    }

    public static String javaType(EnumerationProperty p) {
        Enumeration e = p.getType();
        if (e == null) {
            System.err.println("ERROR in javaType() for EnumerationProperty");
            return "Object";
        }
        return p.getType().getName();
    }

    public static String javaNullableType(EnumerationProperty p) {
        return javaType(p);
    }

    public static String javaType(StringProperty p) {
        return "String";
    }

    public static String javaNullableType(StringProperty p) {
        return javaType(p);
    }

    public static String javaType(IntegerProperty p) {
        return p.isNullable() ? "Integer" : "int";
    }

    public static String javaNullableType(IntegerProperty p) {
        return "Integer";
    }

    public static String javaType(DecimalProperty p) {
        return p.isNullable() ? "Float" : "float";
    }

    public static String javaNullableType(DecimalProperty p) {
        return "Float";
    }

    public static List<Property> getAllProperties(BusinessClass cls) {
        List<Property> result = new ArrayList<Property>();
        if (cls.getSuperclass() != null) {
            result.addAll(getAllProperties(cls.getSuperclass()));
        }
        result.addAll(cls.getProperties());
        return result;
    }

    public static List<Association> getAllAssociationsTo(BusinessClass cls) {
        List<Association> result = new ArrayList<Association>();
        if (cls.getSuperclass() != null) {
            result.addAll(getAllAssociationsTo(cls.getSuperclass()));
        }
        result.addAll(cls.getAssociationsTo());
        return result;
    }

    public static List<Association> getAllAssociationsFrom(BusinessClass cls) {
        List<Association> result = new ArrayList<Association>();
        if (cls.getSuperclass() != null) {
            result.addAll(getAllAssociationsFrom(cls.getSuperclass()));
        }
        result.addAll(cls.getAssociationsFrom());
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
