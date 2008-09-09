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
			case DataContractDslPackage.DOMAIN_CLASS_DTO: return createDomainClassDto();
			case DataContractDslPackage.LIST_DTO: return createListDto();
			case DataContractDslPackage.SUBSET_DTO: return createSubsetDto();
			case DataContractDslPackage.COMPOSITE_DTO: return createCompositeDto();
			case DataContractDslPackage.REFERENCE_DTO: return createReferenceDto();
			case DataContractDslPackage.PROPERTY: return createProperty();
			case DataContractDslPackage.PROPERTY_REFERENCE: return createPropertyReference();
			case DataContractDslPackage.DATA_PROPERTY: return createDataProperty();
			case DataContractDslPackage.STRING_PROPERTY: return createStringProperty();
			case DataContractDslPackage.BOOLEAN_PROPERTY: return createBooleanProperty();
			case DataContractDslPackage.ENUMERATION: return createEnumeration();
			case DataContractDslPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case DataContractDslPackage.MODEL_ELEMENT: return createModelElement();
			case DataContractDslPackage.CUSTOM_DTO: return createCustomDto();
			case DataContractDslPackage.DOMAIN_CLASS_REFERENCE: return createDomainClassReference();
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
	public DomainClassDto createDomainClassDto() {
		DomainClassDtoImpl domainClassDto = new DomainClassDtoImpl();
		return domainClassDto;
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
	public SubsetDto createSubsetDto() {
		SubsetDtoImpl subsetDto = new SubsetDtoImpl();
		return subsetDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDto createCompositeDto() {
		CompositeDtoImpl compositeDto = new CompositeDtoImpl();
		return compositeDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceDto createReferenceDto() {
		ReferenceDtoImpl referenceDto = new ReferenceDtoImpl();
		return referenceDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyReference createPropertyReference() {
		PropertyReferenceImpl propertyReference = new PropertyReferenceImpl();
		return propertyReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty createDataProperty() {
		DataPropertyImpl dataProperty = new DataPropertyImpl();
		return dataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringProperty createStringProperty() {
		StringPropertyImpl stringProperty = new StringPropertyImpl();
		return stringProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanProperty createBooleanProperty() {
		BooleanPropertyImpl booleanProperty = new BooleanPropertyImpl();
		return booleanProperty;
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
	public DomainClassReference createDomainClassReference() {
		DomainClassReferenceImpl domainClassReference = new DomainClassReferenceImpl();
		return domainClassReference;
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
