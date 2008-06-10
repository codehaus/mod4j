package org.mod4j.businessdomain.generator.helpers;

import org.mod4j.businessdomain.generator.utils.TemplateUtils;

public class ProjectProperties {

	public static void setPropertiesFile(String filename){
		propertyFile = filename;
	}
	private static String propertyFile       ="DEFAULT";
	private static String applicationVersion ="DEFAULT";
	private static String applicationName    = "DEFAULT";
	private static String applicationPath    = "DEFAULT";
	private static String domainModulePath   = "DEFAULT";
	private static String dataModulePath     = "DEFAULT";
	private static String rootPackage        = "DEFAULT";
	private static String domainRootPackage  = "DEFAULT";
	private static String dataRootPackage    = "DEFAULT";

	private static String srcGenPath         = "DEFAULT";
	private static String srcManPath         = "DEFAULT";
	private static String resourceManPath    = "DEFAULT";
	private static String fileEncoding       = "ISO-8859-1";

	public static String getApplicationName() {
		return TemplateUtils.getProperty("applicationName", propertyFile);
	}

	public static String getApplicationVersion() {
		return TemplateUtils.getProperty("applicationVersion", propertyFile);
	}

	public static String getApplicationPath() {
		return TemplateUtils.getProperty("applicationPath", propertyFile);
	}

	public static String getDomainModulePath() {
		return TemplateUtils.getProperty("domainModulePath", propertyFile);
	}

	public static String getDataModulePath() {
		return TemplateUtils.getProperty("dataModulePath", propertyFile);
	}

	public static String getRootPackage() {
		return TemplateUtils.getProperty("rootPackage", propertyFile);
	}

	public static String getDomainRootPackage() {
		return TemplateUtils.getProperty("domainRootPackage", propertyFile);
	}

	public static String getDataRootPackage() {
		return TemplateUtils.getProperty("dataRootPackage", propertyFile);
	}

	public static String getSrcGenPath() {
		return srcGenPath;
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
