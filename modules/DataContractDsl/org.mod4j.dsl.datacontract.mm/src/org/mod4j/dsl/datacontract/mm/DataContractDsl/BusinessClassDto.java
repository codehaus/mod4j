/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Class Dto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getBase <em>Base</em>}</li>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getPropertyReferences <em>Property References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassDto()
 * @model
 * @generated
 */
public interface BusinessClassDto extends Dto {
    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty}.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty#getBusinessClassDto <em>Business Class Dto</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassDto_Properties()
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty#getBusinessClassDto
     * @model opposite="businessClassDto" containment="true"
     * @generated
     */
    EList<DtoProperty> getProperties();

    /**
     * Returns the value of the '<em><b>Base</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base</em>' reference.
     * @see #setBase(BusinessClassReference)
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassDto_Base()
     * @model
     * @generated
     */
    BusinessClassReference getBase();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getBase <em>Base</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base</em>' reference.
     * @see #getBase()
     * @generated
     */
    void setBase(BusinessClassReference value);

    /**
     * Returns the value of the '<em><b>Property References</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference}.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference#getDto <em>Dto</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property References</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property References</em>' containment reference list.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassDto_PropertyReferences()
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference#getDto
     * @model opposite="dto" containment="true"
     * @generated
     */
    EList<BusinessClassPropertyReference> getPropertyReferences();

} // BusinessClassDto
