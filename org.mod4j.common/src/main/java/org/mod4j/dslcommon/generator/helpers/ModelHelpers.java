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
package org.mod4j.dslcommon.generator.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import org.mod4j.common.generator.admin.FileTrack;
import org.mod4j.common.generator.admin.Mod4jTracker;
import org.mod4j.common.generator.admin.GeneratedFile;

public class ModelHelpers {

    private static Properties appProps = new Properties();

    public static boolean equalsIgnoreCase(String one, String two) {
        return one.equalsIgnoreCase(two);
    }
    
    /**
     * Read the properties file 'propFilePath' and return the result as a Map<String, String>
     * 
     * @param propFilePath
     *            absolute pathname of the properties files
     * @return
     */
    public static Map<String, String> getProperties(String propFilePath) {
        Map<String, String> result = new HashMap<String, String>();
        try {
            Properties props = new Properties();
            props.load(new FileInputStream(propFilePath));

            for (Entry<Object, Object> property : props.entrySet()) {
                result.put((String) property.getKey(), (String) property.getValue());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    public static String getProperty(String key, String propFilePath) {

        try {
            appProps.load(new FileInputStream(propFilePath));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return appProps.getProperty(key);
    }

    public static String timestamp() {
        Date now = new Date(System.currentTimeMillis());
        return now.toString();
    }

    public static boolean fileExist(String path) {
        File f = new File(path);
        if( ! f.exists() ){
        	return false;
        }
        return f.exists();
    }

    public static boolean shouldRegenerate(String path) {
    	boolean exists = fileExist(path);
    	if( ! exists ) {
//        	System.err.println("["+ path + "] REGENERATE: ! exists " + path + " ==> true");
    		return true;
    	}

    	// Do no regenerate exzisting pom.xml files
    	if( path.endsWith("pom.xml")){
    		return false;
    	}
        File f = new File(path);
        long modified = f.lastModified();
        FileTrack current = Mod4jTracker.getFileTracker().getCurrentTrack();
        if( current == null ) {
//        	System.err.println("["+ path + "] REGENERATE: current == null " + path + " ==> false");
        	return false;
        }
        GeneratedFile extension = current.getExtensionFile(path);
        if( extension != null ) {
//        	System.err.println("REGENERATE: extension != null " + path);
	        long generated = extension.getModifiedDate();
        	System.err.println("["+ path + "] modified : [" + DateFormat.getInstance().format(modified) + "] generated [" 
        			+ DateFormat.getInstance().format(generated) + "]" + " ==> " + (modified == generated));
	        return ( modified == generated );
        } else {
//        	System.err.println("["+ path + "] REGENERATE: no track " + path + " ==> false");
        	return false;
        }
    }
    
    /**
     * @param cls
     * @return The name of the Java class for name cls
     */
    public static String javaClassName(String cls) {
        return StringHelpers.firstCharToUpper(cls);
    }

    public static void print(String m) {
        System.err.println(m);
    }
}
