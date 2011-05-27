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

public class NameMapper {

	private static final String IMPL_POSTFIX = "ImplBase";

    private static final String EXAMPLE_POSTFIX = "Example";

    /**
     * Dao
     */
    private static final String DAO_INTERFACE_POSTFIX = "Dao";

    private static final String DAO_CLASS_POSTFIX = "DaoImpl";

    private static final String DAO_BASE_INTERFACE_POSTFIX = "DaoBase";

    private static final String DAO_BASE_CLASS_POSTFIX = "DaoImplBase";
    
    public static final String DAO_IMPL_PACKAGE = "hibernate.spring";
    
    /**
     * Dto 
     */
    public static final String DTO_PACKAGE = "dto";

    public static final String TRANSLATORS_PACKAGE = "translators";

    /**
     * Local Services
     */
    private static final String LOCALSERVICES_PACKAGE = "local";
    
    private static final String LOCAL_SERVICE_INTERFACE_POSTFIX = "LocalService";

    private static final String LOCAL_SERVICE_CLASS_POSTFIX = "LocalServiceImpl";

    private static final String LOCAL_SERVICE_BASE_CLASS_POSTFIX = "LocalServiceImplBase";

    private static final String TRANSLATOR_CLASS_POSTFIX = "Translator";

    public static final String BUSINESSRULES_PACKAGE = "businessrules";

    public static final String IMPLBASE_SUFFIX = "ImplBase";

    
    /**
     * @param cls
     * @return The name of the Java class for name cls
     */
    public static String javaDomainClass(String cls) {
    	return StringHelpers.firstCharToUpper(cls);
    }

    /**
     * Determines the Fully Qualified Name of the domain class that corresponds with the given className.
     * The Fully Qualified Name is constructed from the following parts: <br>
     * - business module name + modelName + domainPackageName<br>
     * - the java class name <br>
     * 
     * @param modelName
     * @param className
     * @return The Fully Qualified Name of the corresponding domain class.
     */
    public static String getFqnDomainClass(String modelName, String className) {
        return getBusinessModelDomainPackage(modelName) + "." + javaDomainClass(className);
    }
    
    public static String getBusinessModelPackage(final String modelName){
    	return ProjectProperties.getBusinessdomainRootPackage() + "." + modelName;
    }
    
    public static String getBusinessModelDomainPackage(final String modelName){
    	return getBusinessModelPackage(modelName) + "." + ProjectProperties.getDomainPackageName();
    }

    public static String getBusinessModelDomainPackageAsPath(final String modelName){
    	return getBusinessModelPackage(modelName).replaceAll("\\.", "/");
    }
    
    /**
     * Determines the Fully Qualified Name of the domain base class that corresponds with the given className.
     * 
     * @param modelName
     * @param className
     * @return The Fully Qualified Name of the corresponding domain base class.
     */
    public static String getFqnDomainBaseClass(String modelName, String className) {
    	return getBusinessModelDomainPackage(modelName) + "." + javaDomainBaseClass(className);
    }

    /**
     * @param cls
     * @return The name of the Java class for name cls
     */
    public static String javaDomainBaseClass(String cls) {
        return javaDomainClass(cls) + IMPL_POSTFIX;
    }

    /**
     * @param cls
     * @return The name of the Java class for name cls
     */
    public static String javaDomainExampleClass(String cls) {
        return javaDomainClass(cls) + EXAMPLE_POSTFIX;
    }

    /**
     * Determines the Fully Qualified Name of the example class that corresponds with the given className.
     * @param modelname
     * @param className
     * @return The Fully Qualified Name of the corresponding example class.
     */
    public static String getFqnDomainExampleClass(String modelName, String className) {
        return getBusinessModelDomainPackage(modelName) + "." + javaDomainExampleClass(className);
    }

    public static String javaDaoInterface(String cls) {
        return javaDomainClass(cls) + DAO_INTERFACE_POSTFIX;
    }

    public static String getFqnDaoInterface(String modelName, String cls) {
    	return getBusinessModelDataPackage(modelName) + "." + javaDaoInterface(cls);
    }

    public static String getBusinessModelDataPackage(String modelName) {
    	return getBusinessModelPackage(modelName) + "." + ProjectProperties.getDataPackageName();
	}

	public static String javaDaoClass(String cls) {
        return javaDomainClass(cls) + DAO_CLASS_POSTFIX;
    }

    public static String getFqnDaoImplClass(String modelName, String cls) {
        return getDaoImplPackage(modelName) + "." + javaDaoClass(cls);
    }

    public static String getFqnGenericEnumUserType() {
        return ProjectProperties.getGenericEnumUserTypeClass();
    }

    public static String javaDaoBaseInterface(String cls) {
        return javaDomainClass(cls) + DAO_BASE_INTERFACE_POSTFIX;
    }

    public static String getFqnDaoBaseInterface(String modelName, String cls) {
        return getBusinessModelDataPackage(modelName) + "." + javaDaoBaseInterface(cls);
    }
    
    public static String getDaoPackage(String modelName){
    	return ProjectProperties.getDataPackageName() + "." + modelName;
    }

    public static String javaDaoBaseClass(String cls) {
        return javaDomainClass(cls) + DAO_BASE_CLASS_POSTFIX;
    }

    public static String getFqnDaoBaseImplClass(String modelName, String cls) {
        return getDaoImplPackage(modelName) + "." + javaDaoBaseClass(cls);
    }
    
    public static String getDaoImplPackage(String modelName) {
    	return getBusinessModelDataPackage(modelName) + "." + DAO_IMPL_PACKAGE;
	}

    // LOCAL SERVICES
    public static String javaLocalServiceInterface(String classname) {
        return StringHelpers.firstCharToUpper(classname) + LOCAL_SERVICE_INTERFACE_POSTFIX;
    }

    public static String getFqnLocalServiceInterface(String classname) {
        return getLocalServicePackage(classname) + "." + javaLocalServiceInterface(classname);
    }

    public static String javaLocalServiceClass(String classname) {
        return StringHelpers.firstCharToUpper(classname) + LOCAL_SERVICE_CLASS_POSTFIX;
    }

    public static String getFqnLocalServiceClass(String classname) {
        return getLocalServicePackage(classname) + "." + javaLocalServiceClass(classname);
    }
    
    public static String getLocalServicePackage(String modelName){
    	return ProjectProperties.getServiceRootPackage() + "." + modelName + "." + LOCALSERVICES_PACKAGE;
    }

    public static String javaLocalServiceBaseClass(String classname) {
        return StringHelpers.firstCharToUpper(classname) + LOCAL_SERVICE_BASE_CLASS_POSTFIX;
    }

    public static String getFqnLocalServiceBaseClass(String classname) {
        return getLocalServicePackage(classname) + "." + javaLocalServiceBaseClass(classname);
    }

    public static String javaTranslatorClass(String classname) {
        return StringHelpers.firstCharToUpper(classname) + TRANSLATOR_CLASS_POSTFIX;
    }

    public static String getFqnDtoClass(String modelName, String classname) {
        String packageName = getDtoPackage(modelName);
        return packageName + "." + javaDtoClass(classname);
    }

    public static String javaDtoClass(String classname) {
        return StringHelpers.firstCharToUpper(classname);
    }

    public static String getFqnTranslatorClass(String modelName, String classname) {
        return getTranslatorsPackage(modelName) + "." + javaTranslatorClass(classname);
    }
    
    public static String getDtoPackage(String modelName){
    	return ProjectProperties.getServiceRootPackage() + "." + DTO_PACKAGE + "." + modelName;
    }
    
    public static String getTranslatorsPackage(String modelName) {
        return getDtoPackage(modelName) + "." + TRANSLATORS_PACKAGE;
    }

    public static String hibernateMappingFile(String classname) {
        return javaDomainClass(classname) + ".hbm.xml";
    }

    public static String javaBusinessRuleBaseClass(String classname) {
        return javaDomainClass(classname) + IMPLBASE_SUFFIX;
    }

    public static String getFqnBusinessRuleBaseClass(String modelName, String classname) {
        return getBusinessRulePackage(modelName) + "." + javaBusinessRuleBaseClass(classname);
    }
    
    public static String getFqnBusinessRuleClass(String modelName, String classname) {
        return getBusinessRulePackage(modelName) + "." + javaBusinessRuleClass(classname);
    }
    
    public static String getBusinessRulePackage(String modelName){
    	return getBusinessModelDomainPackage(modelName) + "." + BUSINESSRULES_PACKAGE;
    }

    public static String javaBusinessRuleClass(String classname) {
        return javaDomainClass(classname);
    }

    // Presentation
    public static String getPresentationPackage() {
        return ProjectProperties.getPresentationRootPackage() ;
    }

    public static String getPresentationServiceFacadeClass() {
        return "ServiceFacade" ;
    }

    public static String getPresentationServiceFacadeClassPath(String modelName) {
        return ProjectProperties.getPresentationRootPackage() + "." + getPresentationServiceFacadeClass() ;
    }

    public static String getWicketPanelClass(String name) {
        return javaDomainClass(name) + "Panel";
    }
    public static String getWicketEditPanelClass(String name) {
        return javaDomainClass(name) + "EditPanel";
    }
    public static String getWicketSwapPanelClass(String name) {
        return javaDomainClass(name) + "SwapPanel";
    }
    
    public static String getWicketDataProviderClass(String dtoname) {
        return javaDomainClass(dtoname) + "DataProvider";
    }
    public static String getWicketServiceDataProviderClass(String dtoname) {
        return javaDomainClass(dtoname) + "ServiceDataProvider";
    }
    public static String getWicketFinderDataProviderClass(String dtoname) {
        return javaDomainClass(dtoname) + "FinderDataProvider";
    }

    public static String getWicketReferenceDataProviderClass(String whole, String part) {
        return javaDomainClass(whole) + "To" + javaDomainClass(part) + "ReferenceDataProvider";
    }
    public static String getWicketCompositeDataProviderClass(String whole, String part) {
        return javaDomainClass(whole) + "To" + javaDomainClass(part) + "CompositeDataProvider";
    }
    
    public static String getWicketApplicationClass() {
        return StringHelpers.firstCharToUpper(ProjectProperties.getApplicationName()) + "Application";
    }
    public static String getWicketSesssionClass() {
        return StringHelpers.firstCharToUpper(ProjectProperties.getApplicationName()) + "Session";
    }
    public static String getWicketRequestCycleClass() {
        return StringHelpers.firstCharToUpper(ProjectProperties.getApplicationName()) + "RequestCycle";
    }
    public static String getWicketMasterPageClass() {
        return StringHelpers.firstCharToUpper(ProjectProperties.getApplicationName()) + "MasterPage";
    }
    public static String getWicketHomePageClass() {
        return StringHelpers.firstCharToUpper(ProjectProperties.getApplicationName()) + "HomePage";
    }
    public static String getWicketHtmlPanelClass() {
        return StringHelpers.firstCharToUpper(ProjectProperties.getApplicationName()) + "HtmlHeader";
    }
    public static String getWicketPageNotFoundPageClass() {
        return StringHelpers.firstCharToUpper(ProjectProperties.getApplicationName()) + "PageNotFoundPage";
    }
    public static String getWicketExceptionPageClass() {
        return StringHelpers.firstCharToUpper(ProjectProperties.getApplicationName()) + "ExceptionPage";
    }
}
