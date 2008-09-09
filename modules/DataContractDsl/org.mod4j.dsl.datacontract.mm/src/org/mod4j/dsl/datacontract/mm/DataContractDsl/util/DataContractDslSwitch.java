/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.mod4j.dsl.datacontract.mm.DataContractDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage
 * @generated
 */
public class DataContractDslSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataContractDslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataContractDslSwitch() {
		if (modelPackage == null) {
			modelPackage = DataContractDslPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DataContractDslPackage.DATA_CONTRACT_MODEL: {
				DataContractModel dataContractModel = (DataContractModel)theEObject;
				T result = caseDataContractModel(dataContractModel);
				if (result == null) result = caseModelElement(dataContractModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.DTO: {
				Dto dto = (Dto)theEObject;
				T result = caseDto(dto);
				if (result == null) result = caseModelElement(dto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.DOMAIN_CLASS_DTO: {
				DomainClassDto domainClassDto = (DomainClassDto)theEObject;
				T result = caseDomainClassDto(domainClassDto);
				if (result == null) result = caseDto(domainClassDto);
				if (result == null) result = caseModelElement(domainClassDto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.LIST_DTO: {
				ListDto listDto = (ListDto)theEObject;
				T result = caseListDto(listDto);
				if (result == null) result = caseDto(listDto);
				if (result == null) result = caseModelElement(listDto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.SUBSET_DTO: {
				SubsetDto subsetDto = (SubsetDto)theEObject;
				T result = caseSubsetDto(subsetDto);
				if (result == null) result = caseDto(subsetDto);
				if (result == null) result = caseModelElement(subsetDto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.COMPOSITE_DTO: {
				CompositeDto compositeDto = (CompositeDto)theEObject;
				T result = caseCompositeDto(compositeDto);
				if (result == null) result = caseDto(compositeDto);
				if (result == null) result = caseModelElement(compositeDto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.REFERENCE_DTO: {
				ReferenceDto referenceDto = (ReferenceDto)theEObject;
				T result = caseReferenceDto(referenceDto);
				if (result == null) result = caseDto(referenceDto);
				if (result == null) result = caseModelElement(referenceDto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseModelElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.PROPERTY_REFERENCE: {
				PropertyReference propertyReference = (PropertyReference)theEObject;
				T result = casePropertyReference(propertyReference);
				if (result == null) result = caseProperty(propertyReference);
				if (result == null) result = caseModelElement(propertyReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.DATA_PROPERTY: {
				DataProperty dataProperty = (DataProperty)theEObject;
				T result = caseDataProperty(dataProperty);
				if (result == null) result = caseProperty(dataProperty);
				if (result == null) result = caseModelElement(dataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.STRING_PROPERTY: {
				StringProperty stringProperty = (StringProperty)theEObject;
				T result = caseStringProperty(stringProperty);
				if (result == null) result = caseDataProperty(stringProperty);
				if (result == null) result = caseProperty(stringProperty);
				if (result == null) result = caseModelElement(stringProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.BOOLEAN_PROPERTY: {
				BooleanProperty booleanProperty = (BooleanProperty)theEObject;
				T result = caseBooleanProperty(booleanProperty);
				if (result == null) result = caseDataProperty(booleanProperty);
				if (result == null) result = caseProperty(booleanProperty);
				if (result == null) result = caseModelElement(booleanProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseModelElement(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.ENUMERATION_LITERAL: {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
				T result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.CUSTOM_DTO: {
				CustomDto customDto = (CustomDto)theEObject;
				T result = caseCustomDto(customDto);
				if (result == null) result = caseDto(customDto);
				if (result == null) result = caseModelElement(customDto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataContractDslPackage.DOMAIN_CLASS_REFERENCE: {
				DomainClassReference domainClassReference = (DomainClassReference)theEObject;
				T result = caseDomainClassReference(domainClassReference);
				if (result == null) result = caseModelElement(domainClassReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Contract Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Contract Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataContractModel(DataContractModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDto(Dto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Class Dto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Class Dto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainClassDto(DomainClassDto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Dto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Dto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListDto(ListDto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subset Dto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subset Dto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsetDto(SubsetDto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Dto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Dto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeDto(CompositeDto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Dto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Dto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceDto(ReferenceDto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyReference(PropertyReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProperty(DataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringProperty(StringProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanProperty(BooleanProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Dto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Dto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDto(CustomDto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Class Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Class Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainClassReference(DomainClassReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DataContractDslSwitch
