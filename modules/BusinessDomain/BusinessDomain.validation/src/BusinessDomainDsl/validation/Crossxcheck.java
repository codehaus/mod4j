/*******************************************************************************
 * Copyright (c) 2008 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ordina - initial implementation
 *******************************************************************************/
package BusinessDomainDsl.validation;

import mod4j.crossx.broker.repository.CrossxRepository;

public class Crossxcheck {

    /**
     * @param classname
     * @return Returns true of a BusinessClass with the name path exists in any model in the workspace
     */
    public static boolean classExists(String classname){
    	String resource = CrossxRepository.find(classname, "BusinessClass") ;
    	return (resource != null);
    }

    /** This does the same as classExists, need a way to not do this twice
     *   Returns the name of the resource in which the BusinessClass path is defined.
     */
    public static String definedInResource(String classname){
    	String result = CrossxRepository.find(classname, "BusinessClass") ;
    	return result ;
    }
}