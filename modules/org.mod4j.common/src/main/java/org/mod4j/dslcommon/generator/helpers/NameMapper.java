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

    /**
     * Local Services
     */
    private static final String LOCAL_SERVICE_INTERFACE_POSTFIX = "LocalService";

    private static final String LOCAL_SERVICE_CLASS_POSTFIX = "LocalServiceImpl";

    private static final String LOCAL_SERVICE_BASE_CLASS_POSTFIX = "LocalServiceImplBase";

    /**
     * Domain
     */
    private static final String DOMAIN_SERVICE_INTERFACE_POSTFIX = "DomainService";

    private static final String DOMAIN_SERVICE_CLASS_POSTFIX = "DomainServiceImpl";

    private static final String DOMAIN_SERVICE_BASE_INTERFACE_POSTFIX = "DomainServiceBase";

    private static final String DOMAIN_SERVICE_BASE_CLASS_POSTFIX = "DomainServiceImplBase";

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
     * @param cls
     * @return The name of the Java class for name cls
     */
    public static String javaDomainClassPath(String cls) {
        String packageName = ProjectProperties.getDomainRootPackage();
        return packageName + "." + javaDomainClass(cls);
    }

    public static String javaDomainClassFolder(String cls) {
        String packageName = ProjectProperties.getDomainRootPackage();
        return packageName + "." + javaDomainClass(cls);
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

    public static String javaDomainExampleClassPath(String cls) {
        String packageName = ProjectProperties.getDomainRootPackage();
        return packageName + "." + javaDomainExampleClass(cls);
    }

    /**
     * @param cls
     * @return The name of the Java class for name cls
     */

    public static String javaDomainBaseClassPath(String cls) {
        String packageName = ProjectProperties.getDomainRootPackage();
        return packageName + "." + javaDomainBaseClass(cls);
    }

    public static String javaDaoInterface(String cls) {
        return javaDomainClass(cls) + DAO_INTERFACE_POSTFIX;
    }

    public static String javaDaoInterfacePath(String cls) {
        String packageName = ProjectProperties.getDaoPackage();
        return packageName + "." + javaDaoInterface(cls);
    }

    public static String javaDaoClass(String cls) {
        return javaDomainClass(cls) + DAO_CLASS_POSTFIX;
    }

    public static String javaDaoClassPath(String cls) {
        String packageName = ProjectProperties.getDaoPackage();
        return packageName + "." + javaDaoClass(cls);
    }

    public static String javaGenericEnumClass() {
        return "GenericEnumUserType";
    }

    public static String javaGenericEnumClassPath() {
        String packageName = ProjectProperties.getDataRootPackage();
        return packageName + "." + javaGenericEnumClass();
    }

    public static String javaDaoBaseInterface(String cls) {
        return javaDomainClass(cls) + DAO_BASE_INTERFACE_POSTFIX;
    }

    public static String javaDaoBaseInterfacePath(String cls) {
        String packageName = ProjectProperties.getDaoPackage();
        return packageName + "." + javaDaoBaseInterface(cls);
    }

    public static String javaDaoBaseClass(String cls) {
        return javaDomainClass(cls) + DAO_BASE_CLASS_POSTFIX;
    }

    public static String javaDaoBaseClassPath(String cls) {
        String packageName = ProjectProperties.getDaoPackage();
        return packageName + "." + javaDaoBaseClass(cls);
    }

    // LOCAL SERVICES
    public static String javaLocalServiceInterface(String classname) {
        return StringHelpers.firstCharToUpper(classname) + LOCAL_SERVICE_INTERFACE_POSTFIX;
    }

    public static String javaLocalServiceInterfacePath(String classname) {
        String packageName = ProjectProperties.getServiceRootPackage();
        return packageName + "." + javaLocalServiceInterface(classname);
    }

    public static String javaLocalServiceClass(String classname) {
        return StringHelpers.firstCharToUpper(classname) + LOCAL_SERVICE_CLASS_POSTFIX;
    }

    public static String javaLocalServiceClassPath(String classname) {
        String packageName = ProjectProperties.getServiceRootPackage();
        return packageName + "." + javaLocalServiceClass(classname);
    }

    public static String javaLocalServiceBaseClass(String classname) {
        return StringHelpers.firstCharToUpper(classname) + LOCAL_SERVICE_BASE_CLASS_POSTFIX;
    }

    public static String javaLocalServiceBaseClassPath(String classname) {
        String packageName = ProjectProperties.getServiceRootPackage();
        return packageName + "." + javaLocalServiceBaseClass(classname);
    }

    // DOMAIN SERVICES
    public static String javaDomainServiceInterface(String classname) {
        return StringHelpers.firstCharToUpper(classname) + DOMAIN_SERVICE_INTERFACE_POSTFIX;
    }

    public static String javaDomainServiceInterfacePath(String classname) {
        String packageName = ProjectProperties.getBusinessRootPackage();
        return packageName + "." + javaDomainServiceInterface(classname);
    }

    public static String javaDomainServiceBaseInterface(String classname) {
        return StringHelpers.firstCharToUpper(classname) + DOMAIN_SERVICE_BASE_INTERFACE_POSTFIX;
    }

    public static String javaDomainServiceBaseInterfacePath(String classname) {
        String packageName = ProjectProperties.getBusinessRootPackage();
        return packageName + "." + javaDomainServiceBaseInterface(classname);
    }

    public static String javaDomainServiceClass(String classname) {
        return StringHelpers.firstCharToUpper(classname) + DOMAIN_SERVICE_CLASS_POSTFIX;
    }

    public static String javaDomainServiceClassPath(String classname) {
        String packageName = ProjectProperties.getBusinessRootPackage();
        return packageName + "." + javaDomainServiceClass(classname);
    }

    public static String javaDomainServiceBaseClass(String classname) {
        return StringHelpers.firstCharToUpper(classname) + DOMAIN_SERVICE_BASE_CLASS_POSTFIX;
    }

    public static String javaDomainServiceBaseClassPath(String model) {
        String packageName = ProjectProperties.getBusinessRootPackage();
        return packageName + "." + javaDomainServiceBaseClass(model);
    }

    public static String javaTranslatorClass(String classname) {
        return StringHelpers.firstCharToUpper(classname) + TRANSLATOR_CLASS_POSTFIX;
    }

    public static String javaDtoClassPath(String classname) {
        String packageName = ProjectProperties.getDtoPackage();
        return packageName + "." + javaDtoClass(classname);
    }

    private static String javaDtoClass(String classname) {
        return StringHelpers.firstCharToUpper(classname);
    }

    public static String javaTranslatorClassPath(String classname) {
        String packageName = ProjectProperties.getDtoPackage() + ".translators";
        return packageName + "." + javaTranslatorClass(classname);
    }

    public static String hibernateMappingFile(String classname) {
        return javaDomainClass(classname) + ".hbm.xml";
    }

    /**
     * 
     * @return The full packagename of business rules
     */
    public static String getBusinessRulesPackage() {
        return ProjectProperties.getDomainRootPackage() + "." + BUSINESSRULES_PACKAGE;
    }

    public static String javaBusinessRuleBaseClass(String classname) {
        return javaDomainClass(classname) + IMPLBASE_SUFFIX;
    }

    public static String javaBusinessRuleBaseClassPath(String classname) {
        String packageName = ProjectProperties.getDomainRootPackage() + "." + BUSINESSRULES_PACKAGE;
        return packageName + "." + javaBusinessRuleBaseClass(classname);
    }

    public static String javaBusinessRuleClass(String classname) {
        return javaDomainClass(classname);
    }

    public static String javaBusinessRuleClassPath(String classname) {
        String packageName = ProjectProperties.getDomainRootPackage() + "." + BUSINESSRULES_PACKAGE;
        return packageName + "." + javaBusinessRuleClass(classname);
    }

}
