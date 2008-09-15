package org.mod4j.dsl.service.generator.helpers;

import org.mod4j.dsl.service.mm.ServiceDsl.ServiceMethod;
import org.mod4j.dslcommon.generator.helpers.StringHelpers;

public class ServiceMethodHelpers {

    /**
     * @param cls
     * @return The name of the Java class for cls
     */
    public static String javaClassName(ServiceMethod cls) {
        return StringHelpers.firstCharToUpper(cls.getName());
    }

 }
