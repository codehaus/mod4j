package org.mod4j.businessdomain.generator.helpers;

import BusinessDomainDsl.*;

public class BusinessClassHelpers {

	public static String javaClassName(BusinessClass cls) {
		return StringHelpers.firstCharToUpper(cls.getName());
	}

	public static String javaClassName(String cls) {
		return StringHelpers.firstCharToUpper(cls);
	}
	
	public static String javaPackageName(BusinessClass cls) {
		BusinessDomainModel model = (BusinessDomainModel)cls.eContainer();
		return StringHelpers.firstCharToUpper(model.getName());
	}
	
	public static String javaFullName(BusinessClass cls) {
		return javaPackageName(cls) + "." + javaClassName(cls);
	}
	
	public static String javaVarName(BusinessClass cls) {
		return StringHelpers.firstCharToLower(cls.getName());
	}
	
	public static String daoClassName(BusinessClass cls) {
		return javaClassName(cls) + "Dao";
	}

	public static String daoImplClassName(BusinessClass cls) {
		return javaClassName(cls) + "DaoImpl";
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
	

}
