package org.mod4j.businessdomain.generator.helpers;

import BusinessDomainDsl.*;

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
	 * @return The name of the Java class for a BusinessClass with name cls
	 */
	public static String javaClassName(String cls) {
		return StringHelpers.firstCharToUpper(cls);
	}
	
	/** 
	 * @param cls 
	 * @return The name of the Java package for cls
	 */
	public static String javaPackageName(BusinessClass cls) {
		BusinessDomainModel model = (BusinessDomainModel)cls.eContainer();
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

	public static boolean isOne2Many(Association a){
		Multiplicity srcMult = a.getSourceMultiplicity();
		Multiplicity tgtMult = a.getTargetMultiplicity();
		return ( (srcMult == Multiplicity.ONE     ) || (srcMult == Multiplicity.ZERO_ONE) ) &&
		       ( (tgtMult == Multiplicity.ONE_MANY) || (tgtMult == Multiplicity.ZERO_MANY) ) ;
	}
	
	public static boolean isOne2One(Association a){
		Multiplicity srcMult = a.getSourceMultiplicity();
		Multiplicity tgtMult = a.getTargetMultiplicity();
		return ( (srcMult == Multiplicity.ONE) || (srcMult == Multiplicity.ZERO_ONE) ) &&
		       ( (tgtMult == Multiplicity.ONE) || (tgtMult == Multiplicity.ZERO_ONE) ) ;
	}

	public static boolean isMany2One(Association a){
		Multiplicity srcMult = a.getSourceMultiplicity();
		Multiplicity tgtMult = a.getTargetMultiplicity();
		return ( (srcMult == Multiplicity.ONE_MANY) || (srcMult == Multiplicity.ZERO_MANY) ) &&
		       ( (tgtMult == Multiplicity.ONE     ) || (tgtMult == Multiplicity.ZERO_ONE ) ) ;
	}
	
	public static boolean isMany2Many(Association a){
		Multiplicity srcMult = a.getSourceMultiplicity();
		Multiplicity tgtMult = a.getTargetMultiplicity();
		return ( (srcMult == Multiplicity.ONE_MANY) || (srcMult == Multiplicity.ZERO_MANY) ) &&
		       ( (tgtMult == Multiplicity.ONE_MANY) || (tgtMult == Multiplicity.ZERO_MANY) ) ;
	}

	public static boolean isCompositePart(BusinessClass cls){
		for(Association a : cls.getAssociationsFrom() ){
			if( a.isComposite() && (a.getSourceMultiplicity() == Multiplicity.ONE) ) {
				return true;
			}
		}
		return false;
	}
	
	public static String javaType(Property p){
		if( p instanceof BoolProperty ){
			return javaType( (BoolProperty)p);
		} else if( p instanceof StringProperty ){
			return javaType( (StringProperty)p);
		} else if( p instanceof NumberProperty ){
			return javaType( (NumberProperty)p);
		} else if( p instanceof EnumerationProperty ){
			return javaType( (EnumerationProperty)p);
		} else if( p instanceof DateTimeProperty ){
			return javaType( (DateTimeProperty)p);
		}
		return "Object";
	}

	public static String javaType(BoolProperty p){
		return p.isNullable() ? "Boolean"  : "boolean";
	}

	public static String javaType(DateTimeProperty p){
		return "DateTime"  ;
	}

	public static String javaType(EnumerationProperty p){
		Enumeration e = p.getType();
		if( e == null ) {
			System.err.println("ERROR in javaType() for EnumerationProperty");
			return "Object";
		}
		return p.getType().getName();
	}

	public static String javaType(StringProperty p){
		return "String";
	}

	public static String javaType(NumberProperty p){
		if( p.getDataType().equals("integer") ){
			return p.isNullable() ? "Integer"  : "int";
		} else if( p.getDataType().equals("float") ){
			return p.isNullable() ? "Float"  : "float";
		}
		return "Object";
	}

}
