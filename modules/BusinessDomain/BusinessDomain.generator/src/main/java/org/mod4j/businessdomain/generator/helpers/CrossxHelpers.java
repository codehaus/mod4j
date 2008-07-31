package org.mod4j.businessdomain.generator.helpers;

import java.util.ArrayList;
import java.util.List;

import mod4j.crossx.broker.repository.CrossxRepository;

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

public class CrossxHelpers {

    public static List<String> allBusinessClasses() {
    	List<String> result = new ArrayList<String>();
    	List<String> tmp = CrossxRepository.findAll("BusinessClass");
    	if( tmp != null ) {
    		System.err.println("CROSSX HELPER FINDALL [" + tmp.toString() + "]");
    		result.addAll(tmp);
    	} else {
    		System.err.println("CROSSX HELPER FINDALL NULL");
    	}
    	return result;
    }
}
