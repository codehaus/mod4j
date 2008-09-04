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
 package org.mod4j.dslcommon.generator.helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ProjectProperties {

    public static void setPropertiesFile(String filename) {
        System.err.println("PROPERTIES [" + filename + "]");
        propertyFile = filename;
        readAllProperties();
    }

    private static void readAllProperties() {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(propertyFile));
        } catch (FileNotFoundException e) {
            System.err.println("PropjectProperties: cannot find properties file [" + propertyFile + "]");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("PropjectProperties: cannot read properties file [" + propertyFile + "]");
            e.printStackTrace();
        }

        applicationName = properties.getProperty("applicationName");
        applicationVersion = properties.getProperty("applicationVersion");
        applicationPath = properties.getProperty("applicationPath");
        dslModelsModuleName = properties.getProperty("dslModelsModuleName");
        domainModuleName = properties.getProperty("domainModuleName");
        dataModuleName = properties.getProperty("dataModuleName");
        rootPackage = properties.getProperty("rootPackage");
        domainRootPackage = properties.getProperty("domainRootPackage");
        dataRootPackage = properties.getProperty("dataRootPackage");
        srcGenPath = properties.getProperty("srcGenPath");
        resourceGenPath = properties.getProperty("resourceGenPath");
        srcManPath = properties.getProperty("srcManPath");
        resourceManPath = properties.getProperty("resourceManPath");
        fileEncoding = properties.getProperty("fileEncoding");
    }

    private static String propertyFile = "DEFAULT";

    private static String applicationVersion = "DEFAULT";

    private static String applicationName = "DEFAULT";

    private static String applicationPath = "DEFAULT";

    private static String dslModelsModuleName = "DslModels";

    private static String srcModelPath = "src/model";
    
    private static String dataModuleName = "DEFAULT";

    private static String domainModuleName = "DEFAULT";
    
    private static String rootPackage = "DEFAULT";

    private static String domainRootPackage = "DEFAULT";

    private static String dataRootPackage = "DEFAULT";

    private static String srcGenPath = "DEFAULT";
    
    private static String resourceGenPath = "DEFAULT";

    private static String srcManPath = "DEFAULT";

    private static String resourceManPath = "DEFAULT";

    private static String fileEncoding = "ISO-8859-1";

    public static final String IMPLBASE_SUFFIX = "ImplBase";

    public static final String BUSINESSRULES_PACKAGE = "businessrules";

    public static final String DAO_PACKAGE = "spring.dao";

    private static String workDir = "/";

    public static void setWorkDir(String dir) {
        workDir = dir;
    }

    public static String getApplicationName() {
        return applicationName;
    }

    public static String getApplicationVersion() {
        return applicationVersion;
    }

    public static String getApplicationPath() {
        return workDir + "/" + applicationPath;
    }

    public static String getDslModelsModulePath() {
        return getApplicationPath() + "/" + getDslModelsModuleName();
    }

    public static String getDslModelsModuleName() {
        return dslModelsModuleName;
    }
    
    public static String getDomainModulePath() {
        return getApplicationPath() + "/" + getDomainModuleName();
    }

    public static String getDomainModuleName() {
        return domainModuleName;
    }

    public static String getDataModulePath() {
        return getApplicationPath() + "/" + getDataModuleName();
    }

    public static String getDataModuleName() {
        return dataModuleName;
    }

    public static String getRootPackage() {
        return rootPackage;
    }

    public static String getDomainRootPackage() {
        return domainRootPackage;
    }

    public static String getDataRootPackage() {
        return dataRootPackage;
    }

    public static String getDaoPackage() {
        return getDataRootPackage() + "." + DAO_PACKAGE;
    }

    public static String getSrcModelPath() {
        return srcModelPath;
    }

    public static String getSrcGenPath() {
        return srcGenPath;
    }

    public static String getResourceGenPath() {
        return resourceGenPath;
    }
    
    public static String getSrcManPath() {
        return srcManPath;
    }

    public static String getResourceManPath() {
        return resourceManPath;
    }

    public static String getFileEncoding() {
        return fileEncoding;
    }

}
