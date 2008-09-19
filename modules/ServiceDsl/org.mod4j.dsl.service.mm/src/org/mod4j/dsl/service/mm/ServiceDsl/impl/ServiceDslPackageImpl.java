/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.service.mm.ServiceDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mod4j.dsl.service.mm.ServiceDsl.CostomMethod;
import org.mod4j.dsl.service.mm.ServiceDsl.CrudService;
import org.mod4j.dsl.service.mm.ServiceDsl.CustomMethod;
import org.mod4j.dsl.service.mm.ServiceDsl.DtoReference;
import org.mod4j.dsl.service.mm.ServiceDsl.MethodType;
import org.mod4j.dsl.service.mm.ServiceDsl.ModelElement;
import org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslFactory;
import org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage;
import org.mod4j.dsl.service.mm.ServiceDsl.ServiceMethod;
import org.mod4j.dsl.service.mm.ServiceDsl.ServiceModel;
import org.mod4j.dsl.service.mm.ServiceDsl.SpecialMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceDslPackageImpl extends EPackageImpl implements ServiceDslPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass serviceModelEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass modelElementEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dtoReferenceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass customMethodEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass crudServiceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass specialMethodEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass serviceMethodEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum methodTypeEEnum = null;

	/**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private ServiceDslPackageImpl() {
        super(eNS_URI, ServiceDslFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this
     * model, and for any others upon which it depends.  Simple
     * dependencies are satisfied by calling this method on all
     * dependent packages before doing anything else.  This method drives
     * initialization for interdependent packages directly, in parallel
     * with this package, itself.
     * <p>Of this package and its interdependencies, all packages which
     * have not yet been registered by their URI values are first created
     * and registered.  The packages are then initialized in two steps:
     * meta-model objects for all of the packages are created before any
     * are initialized, since one package's meta-model objects may refer to
     * those of another.
     * <p>Invocation of this method will not affect any packages that have
     * already been initialized.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static ServiceDslPackage init() {
        if (isInited) return (ServiceDslPackage)EPackage.Registry.INSTANCE.getEPackage(ServiceDslPackage.eNS_URI);

        // Obtain or create and register package
        ServiceDslPackageImpl theServiceDslPackage = (ServiceDslPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ServiceDslPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ServiceDslPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theServiceDslPackage.createPackageContents();

        // Initialize created meta-data
        theServiceDslPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theServiceDslPackage.freeze();

        return theServiceDslPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getServiceModel() {
        return serviceModelEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getServiceModel_Methods() {
        return (EReference)serviceModelEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getServiceModel_DtoReferences() {
        return (EReference)serviceModelEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getServiceModel_CrudServices() {
        return (EReference)serviceModelEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getModelElement() {
        return modelElementEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getModelElement_Name() {
        return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getModelElement_Description() {
        return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDtoReference() {
        return dtoReferenceEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoReference_Modelname() {
        return (EAttribute)dtoReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCustomMethod() {
        return customMethodEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCustomMethod_Input() {
        return (EReference)customMethodEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCustomMethod_Output() {
        return (EReference)customMethodEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCrudService() {
        return crudServiceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCrudService_Dto() {
        return (EReference)crudServiceEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSpecialMethod() {
        return specialMethodEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSpecialMethod_Dto() {
        return (EReference)specialMethodEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getServiceMethod() {
        return serviceMethodEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getServiceMethod_Type() {
        return (EAttribute)serviceMethodEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMethodType() {
        return methodTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ServiceDslFactory getServiceDslFactory() {
        return (ServiceDslFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isCreated = false;

	/**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        serviceModelEClass = createEClass(SERVICE_MODEL);
        createEReference(serviceModelEClass, SERVICE_MODEL__METHODS);
        createEReference(serviceModelEClass, SERVICE_MODEL__DTO_REFERENCES);
        createEReference(serviceModelEClass, SERVICE_MODEL__CRUD_SERVICES);

        modelElementEClass = createEClass(MODEL_ELEMENT);
        createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
        createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);

        dtoReferenceEClass = createEClass(DTO_REFERENCE);
        createEAttribute(dtoReferenceEClass, DTO_REFERENCE__MODELNAME);

        customMethodEClass = createEClass(CUSTOM_METHOD);
        createEReference(customMethodEClass, CUSTOM_METHOD__INPUT);
        createEReference(customMethodEClass, CUSTOM_METHOD__OUTPUT);

        crudServiceEClass = createEClass(CRUD_SERVICE);
        createEReference(crudServiceEClass, CRUD_SERVICE__DTO);

        specialMethodEClass = createEClass(SPECIAL_METHOD);
        createEReference(specialMethodEClass, SPECIAL_METHOD__DTO);

        serviceMethodEClass = createEClass(SERVICE_METHOD);
        createEAttribute(serviceMethodEClass, SERVICE_METHOD__TYPE);

        // Create enums
        methodTypeEEnum = createEEnum(METHOD_TYPE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        serviceModelEClass.getESuperTypes().add(this.getModelElement());
        dtoReferenceEClass.getESuperTypes().add(this.getModelElement());
        customMethodEClass.getESuperTypes().add(this.getServiceMethod());
        crudServiceEClass.getESuperTypes().add(this.getModelElement());
        specialMethodEClass.getESuperTypes().add(this.getServiceMethod());
        serviceMethodEClass.getESuperTypes().add(this.getModelElement());

        // Initialize classes and features; add operations and parameters
        initEClass(serviceModelEClass, ServiceModel.class, "ServiceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getServiceModel_Methods(), this.getServiceMethod(), null, "methods", null, 0, -1, ServiceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getServiceModel_DtoReferences(), this.getDtoReference(), null, "dtoReferences", null, 0, -1, ServiceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getServiceModel_CrudServices(), this.getCrudService(), null, "crudServices", null, 0, -1, ServiceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoReferenceEClass, DtoReference.class, "DtoReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDtoReference_Modelname(), ecorePackage.getEString(), "modelname", null, 0, 1, DtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(customMethodEClass, CustomMethod.class, "CustomMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCustomMethod_Input(), this.getDtoReference(), null, "input", null, 0, 1, CustomMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCustomMethod_Output(), this.getDtoReference(), null, "output", null, 0, 1, CustomMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(crudServiceEClass, CrudService.class, "CrudService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCrudService_Dto(), this.getDtoReference(), null, "dto", null, 0, 1, CrudService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(specialMethodEClass, SpecialMethod.class, "SpecialMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSpecialMethod_Dto(), this.getDtoReference(), null, "dto", null, 0, 1, SpecialMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(serviceMethodEClass, ServiceMethod.class, "ServiceMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getServiceMethod_Type(), this.getMethodType(), "type", "Custom", 0, 1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(methodTypeEEnum, MethodType.class, "MethodType");
        addEEnumLiteral(methodTypeEEnum, MethodType.CREATE);
        addEEnumLiteral(methodTypeEEnum, MethodType.READ);
        addEEnumLiteral(methodTypeEEnum, MethodType.UPDATE);
        addEEnumLiteral(methodTypeEEnum, MethodType.DELETE);
        addEEnumLiteral(methodTypeEEnum, MethodType.FIND);
        addEEnumLiteral(methodTypeEEnum, MethodType.CUSTOM);

        // Create resource
        createResource(eNS_URI);
    }

} //ServiceDslPackageImpl
