package org.mod4j.businessdomain.generator.helpers;

import org.mod4j.dslcommon.generator.helpers.ProjectProperties;
import org.mod4j.dslcommon.generator.helpers.StringHelpers;

import BusinessDomainDsl.BusinessRule;

public class BusinessRuleHelpers {

    /**
     * @param br
     * @return The name of the Java class for br
     */
    public static String javaClassName(BusinessRule br) {
        return StringHelpers.firstCharToUpper(br.getName());
    }

    /**
     * @param br
     * @return The name of the abstract implementation base class for BusinessRule br
     */
    public static String implBaseClassName(BusinessRule br) {
        return javaClassName(br) + ProjectProperties.IMPLBASE_SUFFIX;
    }

    /**
     * 
     * @return The full packagename of business rules
     */
    public static String getBusinessRulesPackage() {
        return ProjectProperties.getDomainRootPackage() + "." + ProjectProperties.BUSINESSRULES_PACKAGE;
    }
    
    public static String getBusinessRulesPackageAsPath() {
        return getBusinessRulesPackage().replaceAll("\\.", "/");
    }

}
