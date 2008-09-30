/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mod4j.dsl.datacontract.mm.DataContractDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataContractDslFactoryImpl extends EFactoryImpl implements DataContractDslFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DataContractDslFactory init() {
        try {
            DataContractDslFactory theDataContractDslFactory = (DataContractDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mod4j.org/datacontract"); 
            if (theDataContractDslFactory != null) {
                return theDataContractDslFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DataContractDslFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataContractDslFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case DataContractDslPackage.DATA_CONTRACT_MODEL: return createDataContractModel();
            case DataContractDslPackage.DTO: return createDto();
            case DataContractDslPackage.BUSINESS_CLASS_DTO: return createBusinessClassDto();
            case DataContractDslPackage.LIST_DTO: return createListDto();
            case DataContractDslPackage.DTO_PROPERTY: return createDtoProperty();
            case DataContractDslPackage.DTO_PROPERTY_REFERENCE: return createDtoPropertyReference();
            case DataContractDslPackage.DTO_DATA_PROPERTY: return createDtoDataProperty();
            case DataContractDslPackage.DTO_STRING_PROPERTY: return createDtoStringProperty();
            case DataContractDslPackage.DTO_BOOLEAN_PROPERTY: return createDtoBooleanProperty();
            case DataContractDslPackage.ENUMERATION: return createEnumeration();
            case DataContractDslPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
            case DataContractDslPackage.MODEL_ELEMENT: return createModelElement();
            case DataContractDslPackage.CUSTOM_DTO: return createCustomDto();
            case DataContractDslPackage.BUSINESS_CLASS_REFERENCE: return createBusinessClassReference();
            case DataContractDslPackage.DTO_INTEGER_PROPERTY: return createDtoIntegerProperty();
            case DataContractDslPackage.DTO_DECIMAL_PROPERTY: return createDtoDecimalProperty();
            case DataContractDslPackage.DTO_ENUMERATION_PROPERTY: return createDtoEnumerationProperty();
            case DataContractDslPackage.DTO_DATE_TIME_PROPERTY: return createDtoDateTimeProperty();
            case DataContractDslPackage.BUSINESS_CLASS_PROPERTY_REFERENCE: return createBusinessClassPropertyReference();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataContractModel createDataContractModel() {
        DataContractModelImpl dataContractModel = new DataContractModelImpl();
        return dataContractModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Dto createDto() {
        DtoImpl dto = new DtoImpl();
        return dto;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessClassDto createBusinessClassDto() {
        BusinessClassDtoImpl businessClassDto = new BusinessClassDtoImpl();
        return businessClassDto;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListDto createListDto() {
        ListDtoImpl listDto = new ListDtoImpl();
        return listDto;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoProperty createDtoProperty() {
        DtoPropertyImpl dtoProperty = new DtoPropertyImpl();
        return dtoProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoPropertyReference createDtoPropertyReference() {
        DtoPropertyReferenceImpl dtoPropertyReference = new DtoPropertyReferenceImpl();
        return dtoPropertyReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoDataProperty createDtoDataProperty() {
        DtoDataPropertyImpl dtoDataProperty = new DtoDataPropertyImpl();
        return dtoDataProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoStringProperty createDtoStringProperty() {
        DtoStringPropertyImpl dtoStringProperty = new DtoStringPropertyImpl();
        return dtoStringProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoBooleanProperty createDtoBooleanProperty() {
        DtoBooleanPropertyImpl dtoBooleanProperty = new DtoBooleanPropertyImpl();
        return dtoBooleanProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Enumeration createEnumeration() {
        EnumerationImpl enumeration = new EnumerationImpl();
        return enumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnumerationLiteral createEnumerationLiteral() {
        EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
        return enumerationLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelElement createModelElement() {
        ModelElementImpl modelElement = new ModelElementImpl();
        return modelElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomDto createCustomDto() {
        CustomDtoImpl customDto = new CustomDtoImpl();
        return customDto;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessClassReference createBusinessClassReference() {
        BusinessClassReferenceImpl businessClassReference = new BusinessClassReferenceImpl();
        return businessClassReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoIntegerProperty createDtoIntegerProperty() {
        DtoIntegerPropertyImpl dtoIntegerProperty = new DtoIntegerPropertyImpl();
        return dtoIntegerProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoDecimalProperty createDtoDecimalProperty() {
        DtoDecimalPropertyImpl dtoDecimalProperty = new DtoDecimalPropertyImpl();
        return dtoDecimalProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoEnumerationProperty createDtoEnumerationProperty() {
        DtoEnumerationPropertyImpl dtoEnumerationProperty = new DtoEnumerationPropertyImpl();
        return dtoEnumerationProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoDateTimeProperty createDtoDateTimeProperty() {
        DtoDateTimePropertyImpl dtoDateTimeProperty = new DtoDateTimePropertyImpl();
        return dtoDateTimeProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessClassPropertyReference createBusinessClassPropertyReference() {
        BusinessClassPropertyReferenceImpl businessClassPropertyReference = new BusinessClassPropertyReferenceImpl();
        return businessClassPropertyReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataContractDslPackage getDataContractDslPackage() {
        return (DataContractDslPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DataContractDslPackage getPackage() {
        return DataContractDslPackage.eINSTANCE;
    }

} //DataContractDslFactoryImpl
