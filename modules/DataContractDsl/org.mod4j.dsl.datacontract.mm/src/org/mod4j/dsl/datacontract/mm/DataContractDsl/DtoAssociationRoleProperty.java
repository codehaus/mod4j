/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto Association Role Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty#getDtoType <em>Dto Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoAssociationRoleProperty()
 * @model
 * @generated
 */
public interface DtoAssociationRoleProperty extends DtoProperty {
    /**
     * Returns the value of the '<em><b>Dto Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dto Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dto Type</em>' reference.
     * @see #setDtoType(Dto)
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoAssociationRoleProperty_DtoType()
     * @model
     * @generated
     */
    Dto getDtoType();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoAssociationRoleProperty#getDtoType <em>Dto Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dto Type</em>' reference.
     * @see #getDtoType()
     * @generated
     */
    void setDtoType(Dto value);

} // DtoAssociationRoleProperty
