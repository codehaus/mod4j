/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.CompositeDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.CustomDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslFactory;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoBooleanProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoDataProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoDateTimeProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoDecimalProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoIntegerProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoPropertyReference;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoStringProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.Enumeration;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.EnumerationLiteral;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.ListDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.ModelElement;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.ReferenceDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.SubsetDto;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataContractDslPackageImpl extends EPackageImpl implements DataContractDslPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataContractModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass businessClassDtoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass listDtoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subsetDtoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass compositeDtoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceDtoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoPropertyReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoDataPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoStringPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoBooleanPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumerationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumerationLiteralEClass = null;

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
    private EClass customDtoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass businessClassReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoIntegerPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoDecimalPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoEnumerationPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoDateTimePropertyEClass = null;

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
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DataContractDslPackageImpl() {
        super(eNS_URI, DataContractDslFactory.eINSTANCE);
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
    public static DataContractDslPackage init() {
        if (isInited) return (DataContractDslPackage)EPackage.Registry.INSTANCE.getEPackage(DataContractDslPackage.eNS_URI);

        // Obtain or create and register package
        DataContractDslPackageImpl theDataContractDslPackage = (DataContractDslPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DataContractDslPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DataContractDslPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theDataContractDslPackage.createPackageContents();

        // Initialize created meta-data
        theDataContractDslPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theDataContractDslPackage.freeze();

        return theDataContractDslPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataContractModel() {
        return dataContractModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataContractModel_Dtos() {
        return (EReference)dataContractModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataContractModel_Enumerations() {
        return (EReference)dataContractModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataContractModel_BusinessClasses() {
        return (EReference)dataContractModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDto() {
        return dtoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDto_DatacontractModel() {
        return (EReference)dtoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBusinessClassDto() {
        return businessClassDtoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessClassDto_Properties() {
        return (EReference)businessClassDtoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessClassDto_Base() {
        return (EReference)businessClassDtoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getListDto() {
        return listDtoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getListDto_BaseDto() {
        return (EReference)listDtoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getListDto_SelectedProperties() {
        return (EReference)listDtoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSubsetDto() {
        return subsetDtoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubsetDto_BaseDto() {
        return (EReference)subsetDtoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubsetDto_SelectedProperties() {
        return (EReference)subsetDtoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCompositeDto() {
        return compositeDtoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCompositeDto_Dtos() {
        return (EReference)compositeDtoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReferenceDto() {
        return referenceDtoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoProperty() {
        return dtoPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDtoProperty_DataType() {
        return (EAttribute)dtoPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoPropertyReference() {
        return dtoPropertyReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoDataProperty() {
        return dtoDataPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoStringProperty() {
        return dtoStringPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoBooleanProperty() {
        return dtoBooleanPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEnumeration() {
        return enumerationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEnumeration_Literals() {
        return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEnumerationLiteral() {
        return enumerationLiteralEClass;
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
    public EClass getCustomDto() {
        return customDtoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCustomDto_Properties() {
        return (EReference)customDtoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBusinessClassReference() {
        return businessClassReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBusinessClassReference_Modelname() {
        return (EAttribute)businessClassReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBusinessClassReference_DatacontractModel() {
        return (EReference)businessClassReferenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoIntegerProperty() {
        return dtoIntegerPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoDecimalProperty() {
        return dtoDecimalPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoEnumerationProperty() {
        return dtoEnumerationPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDtoEnumerationProperty_Type() {
        return (EReference)dtoEnumerationPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoDateTimeProperty() {
        return dtoDateTimePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataContractDslFactory getDataContractDslFactory() {
        return (DataContractDslFactory)getEFactoryInstance();
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
        dataContractModelEClass = createEClass(DATA_CONTRACT_MODEL);
        createEReference(dataContractModelEClass, DATA_CONTRACT_MODEL__DTOS);
        createEReference(dataContractModelEClass, DATA_CONTRACT_MODEL__ENUMERATIONS);
        createEReference(dataContractModelEClass, DATA_CONTRACT_MODEL__BUSINESS_CLASSES);

        dtoEClass = createEClass(DTO);
        createEReference(dtoEClass, DTO__DATACONTRACT_MODEL);

        businessClassDtoEClass = createEClass(BUSINESS_CLASS_DTO);
        createEReference(businessClassDtoEClass, BUSINESS_CLASS_DTO__PROPERTIES);
        createEReference(businessClassDtoEClass, BUSINESS_CLASS_DTO__BASE);

        listDtoEClass = createEClass(LIST_DTO);
        createEReference(listDtoEClass, LIST_DTO__BASE_DTO);
        createEReference(listDtoEClass, LIST_DTO__SELECTED_PROPERTIES);

        subsetDtoEClass = createEClass(SUBSET_DTO);
        createEReference(subsetDtoEClass, SUBSET_DTO__BASE_DTO);
        createEReference(subsetDtoEClass, SUBSET_DTO__SELECTED_PROPERTIES);

        compositeDtoEClass = createEClass(COMPOSITE_DTO);
        createEReference(compositeDtoEClass, COMPOSITE_DTO__DTOS);

        referenceDtoEClass = createEClass(REFERENCE_DTO);

        dtoPropertyEClass = createEClass(DTO_PROPERTY);
        createEAttribute(dtoPropertyEClass, DTO_PROPERTY__DATA_TYPE);

        dtoPropertyReferenceEClass = createEClass(DTO_PROPERTY_REFERENCE);

        dtoDataPropertyEClass = createEClass(DTO_DATA_PROPERTY);

        dtoStringPropertyEClass = createEClass(DTO_STRING_PROPERTY);

        dtoBooleanPropertyEClass = createEClass(DTO_BOOLEAN_PROPERTY);

        enumerationEClass = createEClass(ENUMERATION);
        createEReference(enumerationEClass, ENUMERATION__LITERALS);

        enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);

        modelElementEClass = createEClass(MODEL_ELEMENT);
        createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
        createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);

        customDtoEClass = createEClass(CUSTOM_DTO);
        createEReference(customDtoEClass, CUSTOM_DTO__PROPERTIES);

        businessClassReferenceEClass = createEClass(BUSINESS_CLASS_REFERENCE);
        createEAttribute(businessClassReferenceEClass, BUSINESS_CLASS_REFERENCE__MODELNAME);
        createEReference(businessClassReferenceEClass, BUSINESS_CLASS_REFERENCE__DATACONTRACT_MODEL);

        dtoIntegerPropertyEClass = createEClass(DTO_INTEGER_PROPERTY);

        dtoDecimalPropertyEClass = createEClass(DTO_DECIMAL_PROPERTY);

        dtoEnumerationPropertyEClass = createEClass(DTO_ENUMERATION_PROPERTY);
        createEReference(dtoEnumerationPropertyEClass, DTO_ENUMERATION_PROPERTY__TYPE);

        dtoDateTimePropertyEClass = createEClass(DTO_DATE_TIME_PROPERTY);
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
        dataContractModelEClass.getESuperTypes().add(this.getModelElement());
        dtoEClass.getESuperTypes().add(this.getModelElement());
        businessClassDtoEClass.getESuperTypes().add(this.getDto());
        listDtoEClass.getESuperTypes().add(this.getDto());
        subsetDtoEClass.getESuperTypes().add(this.getDto());
        compositeDtoEClass.getESuperTypes().add(this.getDto());
        referenceDtoEClass.getESuperTypes().add(this.getDto());
        dtoPropertyEClass.getESuperTypes().add(this.getModelElement());
        dtoPropertyReferenceEClass.getESuperTypes().add(this.getDtoProperty());
        dtoDataPropertyEClass.getESuperTypes().add(this.getDtoProperty());
        dtoStringPropertyEClass.getESuperTypes().add(this.getDtoDataProperty());
        dtoBooleanPropertyEClass.getESuperTypes().add(this.getDtoDataProperty());
        enumerationEClass.getESuperTypes().add(this.getModelElement());
        customDtoEClass.getESuperTypes().add(this.getDto());
        businessClassReferenceEClass.getESuperTypes().add(this.getModelElement());
        dtoIntegerPropertyEClass.getESuperTypes().add(this.getDtoDataProperty());
        dtoDecimalPropertyEClass.getESuperTypes().add(this.getDtoDataProperty());
        dtoEnumerationPropertyEClass.getESuperTypes().add(this.getDtoDataProperty());
        dtoDateTimePropertyEClass.getESuperTypes().add(this.getDtoDataProperty());

        // Initialize classes and features; add operations and parameters
        initEClass(dataContractModelEClass, DataContractModel.class, "DataContractModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataContractModel_Dtos(), this.getDto(), this.getDto_DatacontractModel(), "dtos", null, 0, -1, DataContractModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataContractModel_Enumerations(), this.getEnumeration(), null, "enumerations", null, 0, -1, DataContractModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataContractModel_BusinessClasses(), this.getBusinessClassReference(), this.getBusinessClassReference_DatacontractModel(), "businessClasses", null, 0, -1, DataContractModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoEClass, Dto.class, "Dto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDto_DatacontractModel(), this.getDataContractModel(), this.getDataContractModel_Dtos(), "datacontractModel", null, 0, 1, Dto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(businessClassDtoEClass, BusinessClassDto.class, "BusinessClassDto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBusinessClassDto_Properties(), this.getDtoProperty(), null, "properties", null, 0, -1, BusinessClassDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessClassDto_Base(), this.getBusinessClassReference(), null, "base", null, 0, 1, BusinessClassDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(listDtoEClass, ListDto.class, "ListDto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getListDto_BaseDto(), this.getDto(), null, "baseDto", null, 0, 1, ListDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getListDto_SelectedProperties(), this.getDtoPropertyReference(), null, "selectedProperties", null, 0, -1, ListDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(subsetDtoEClass, SubsetDto.class, "SubsetDto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSubsetDto_BaseDto(), this.getDto(), null, "baseDto", null, 0, 1, SubsetDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSubsetDto_SelectedProperties(), this.getDtoPropertyReference(), null, "selectedProperties", null, 0, -1, SubsetDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(compositeDtoEClass, CompositeDto.class, "CompositeDto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCompositeDto_Dtos(), this.getDto(), null, "dtos", null, 0, -1, CompositeDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(referenceDtoEClass, ReferenceDto.class, "ReferenceDto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dtoPropertyEClass, DtoProperty.class, "DtoProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDtoProperty_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, DtoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoPropertyReferenceEClass, DtoPropertyReference.class, "DtoPropertyReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dtoDataPropertyEClass, DtoDataProperty.class, "DtoDataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dtoStringPropertyEClass, DtoStringProperty.class, "DtoStringProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dtoBooleanPropertyEClass, DtoBooleanProperty.class, "DtoBooleanProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEnumeration_Literals(), this.getEnumerationLiteral(), null, "literals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(customDtoEClass, CustomDto.class, "CustomDto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCustomDto_Properties(), this.getDtoProperty(), null, "properties", null, 0, -1, CustomDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(businessClassReferenceEClass, BusinessClassReference.class, "BusinessClassReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBusinessClassReference_Modelname(), ecorePackage.getEString(), "modelname", "", 0, 1, BusinessClassReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessClassReference_DatacontractModel(), this.getDataContractModel(), this.getDataContractModel_BusinessClasses(), "datacontractModel", null, 0, 1, BusinessClassReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoIntegerPropertyEClass, DtoIntegerProperty.class, "DtoIntegerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dtoDecimalPropertyEClass, DtoDecimalProperty.class, "DtoDecimalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dtoEnumerationPropertyEClass, DtoEnumerationProperty.class, "DtoEnumerationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDtoEnumerationProperty_Type(), this.getEnumeration(), null, "type", null, 0, 1, DtoEnumerationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoDateTimePropertyEClass, DtoDateTimeProperty.class, "DtoDateTimeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //DataContractDslPackageImpl
