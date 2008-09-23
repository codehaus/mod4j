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
     * Returns a new object of class '<em>Business Class Dto</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Class Dto</em>'.
     * @generated
     */
    BusinessClassDto createBusinessClassDto();

    /**
     * Returns a new object of class '<em>List Dto</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>List Dto</em>'.
     * @generated
     */
    ListDto createListDto();

    /**
     * Returns a new object of class '<em>Dto Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dto Property</em>'.
     * @generated
     */
    DtoProperty createDtoProperty();

    /**
     * Returns a new object of class '<em>Dto Property Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dto Property Reference</em>'.
     * @generated
     */
    DtoPropertyReference createDtoPropertyReference();

    /**
     * Returns a new object of class '<em>Dto Data Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dto Data Property</em>'.
     * @generated
     */
    DtoDataProperty createDtoDataProperty();

    /**
     * Returns a new object of class '<em>Dto String Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dto String Property</em>'.
     * @generated
     */
    DtoStringProperty createDtoStringProperty();

    /**
     * Returns a new object of class '<em>Dto Boolean Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dto Boolean Property</em>'.
     * @generated
     */
    DtoBooleanProperty createDtoBooleanProperty();

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
     * Returns a new object of class '<em>Business Class Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Business Class Reference</em>'.
     * @generated
     */
    BusinessClassReference createBusinessClassReference();

    /**
     * Returns a new object of class '<em>Dto Integer Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dto Integer Property</em>'.
     * @generated
     */
    DtoIntegerProperty createDtoIntegerProperty();

    /**
     * Returns a new object of class '<em>Dto Decimal Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dto Decimal Property</em>'.
     * @generated
     */
    DtoDecimalProperty createDtoDecimalProperty();

    /**
     * Returns a new object of class '<em>Dto Enumeration Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dto Enumeration Property</em>'.
     * @generated
     */
    DtoEnumerationProperty createDtoEnumerationProperty();

    /**
     * Returns a new object of class '<em>Dto Date Time Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dto Date Time Property</em>'.
     * @generated
     */
    DtoDateTimeProperty createDtoDateTimeProperty();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DataContractDslPackage getDataContractDslPackage();

} //DataContractDslFactory
