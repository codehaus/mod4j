package org.mod4j.dslcommon.generator.helpers;

public class ProjectProperties {

    public static void setPropertiesFile(String filename) {
        propertyFile = filename;
    }

    private static String propertyFile = "DEFAULT";

    private static String applicationVersion = "DEFAULT";

    private static String applicationName = "DEFAULT";

    private static String applicationPath = "DEFAULT";

    private static String dataModuleName = "DEFAULT";
    
    private static String domainModuleName = "DEFAULT";

    private static String rootPackage = "DEFAULT";

    private static String domainRootPackage = "DEFAULT";

    private static String dataRootPackage = "DEFAULT";

    private static String srcGenPath = "DEFAULT";

    private static String srcManPath = "DEFAULT";

    private static String resourceManPath = "DEFAULT";

    private static String fileEncoding = "ISO-8859-1";
    
    public final static String IMPLBASE_SUFFIX = "ImplBase";

    public static final String BUSINESSRULES_PACKAGE = "businessrules";

    public static final String DAO_PACKAGE = "spring.dao";

    public static String getApplicationName() {
        return ModelHelpers.getProperty("applicationName", propertyFile);
    }

    public static String getApplicationVersion() {
        return ModelHelpers.getProperty("applicationVersion", propertyFile);
    }

    public static String getApplicationPath() {
        return ModelHelpers.getProperty("applicationPath", propertyFile);
    }

    public static String getDomainModulePath() {
        return getApplicationPath() + "/" + getDomainModuleName();
    }

    public static String getDomainModuleName() {
        return ModelHelpers.getProperty("domainModuleName", propertyFile);
    }

    public static String getDataModulePath() {
        return getApplicationPath() + "/" + getDataModuleName();
    }

    public static String getDataModuleName() {
        return ModelHelpers.getProperty("dataModuleName", propertyFile);
    }

    public static String getRootPackage() {
        return ModelHelpers.getProperty("rootPackage", propertyFile);
    }

    public static String getDomainRootPackage() {
        return ModelHelpers.getProperty("domainRootPackage", propertyFile);
    }

    public static String getDataRootPackage() {
        return ModelHelpers.getProperty("dataRootPackage", propertyFile);
    }

    public static String getDaoPackage() {
        return getDataRootPackage() + "." + DAO_PACKAGE;
    }

    public static String getSrcGenPath() {
        return srcGenPath;
    }

    public static String getSrcManPath() {
        return ModelHelpers.getProperty("srcManPath", propertyFile);
    }

    public static String getResourceManPath() {
        return resourceManPath;
    }

    public static String getFileEncoding() {
        return fileEncoding;
    }

}
