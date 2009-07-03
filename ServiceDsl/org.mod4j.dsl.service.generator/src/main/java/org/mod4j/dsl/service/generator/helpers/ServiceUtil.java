/*******************************************************************************
 * Copyright (c) 2009 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ordina - initial implementation
 *******************************************************************************/
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
