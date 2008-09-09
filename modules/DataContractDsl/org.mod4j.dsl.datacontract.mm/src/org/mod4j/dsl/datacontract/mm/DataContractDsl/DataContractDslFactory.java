/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage
 * @generated
 */
public interface DataContractDslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataContractDslFactory eINSTANCE = org.mod4j.dsl.datacontract.mm.DataContractDsl.impl.DataContractDslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Contract Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Contract Model</em>'.
	 * @generated
	 */
	DataContractModel createDataContractModel();

	/**
	 * Returns a new object of class '<em>Dto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dto</em>'.
	 * @generated
	 */
	Dto createDto();

	/**
	 * Returns a new object of class '<em>Domain Class Dto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Class Dto</em>'.
	 * @generated
	 */
	DomainClassDto createDomainClassDto();

	/**
	 * Returns a new object of class '<em>List Dto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Dto</em>'.
	 * @generated
	 */
	ListDto createListDto();

	/**
	 * Returns a new object of class '<em>Subset Dto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subset Dto</em>'.
	 * @generated
	 */
	SubsetDto createSubsetDto();

	/**
	 * Returns a new object of class '<em>Composite Dto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Dto</em>'.
	 * @generated
	 */
	CompositeDto createCompositeDto();

	/**
	 * Returns a new object of class '<em>Reference Dto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Dto</em>'.
	 * @generated
	 */
	ReferenceDto createReferenceDto();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Property Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Reference</em>'.
	 * @generated
	 */
	PropertyReference createPropertyReference();

	/**
	 * Returns a new object of class '<em>Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Property</em>'.
	 * @generated
	 */
	DataProperty createDataProperty();

	/**
	 * Returns a new object of class '<em>String Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Property</em>'.
	 * @generated
	 */
	StringProperty createStringProperty();

	/**
	 * Returns a new object of class '<em>Boolean Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Property</em>'.
	 * @generated
	 */
	BooleanProperty createBooleanProperty();

	/**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
	Enumeration createEnumeration();

	/**
	 * Returns a new object of class '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Literal</em>'.
	 * @generated
	 */
	EnumerationLiteral createEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element</em>'.
	 * @generated
	 */
	ModelElement createModelElement();

	/**
	 * Returns a new object of class '<em>Custom Dto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Dto</em>'.
	 * @generated
	 */
	CustomDto createCustomDto();

	/**
	 * Returns a new object of class '<em>Domain Class Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Class Reference</em>'.
	 * @generated
	 */
	DomainClassReference createDomainClassReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataContractDslPackage getDataContractDslPackage();

} //DataContractDslFactory
