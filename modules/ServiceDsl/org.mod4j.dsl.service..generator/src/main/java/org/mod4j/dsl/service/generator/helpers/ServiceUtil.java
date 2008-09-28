package org.mod4j.dsl.service.generator.helpers;

import org.mod4j.dsl.service.mm.ServiceDsl.ServiceMethod;
import org.mod4j.dslcommon.generator.helpers.ProjectProperties;
import org.mod4j.dslcommon.generator.helpers.StringHelpers;

public class ServiceUtil {

    static public String javaClassName(String className){
        return className;
    }

    static public String javaBaseClassName(String className){
        return javaClassName(className) + ProjectProperties.IMPLBASE_SUFFIX;
    }
   
 }
