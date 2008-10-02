/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto Property Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoPropertyReference#getReferredProperty <em>Referred Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoPropertyReference()
 * @model
 * @generated
 */
public interface DtoPropertyReference extends DtoProperty {
    /**
     * Returns the value of the '<em><b>Referred Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred Property</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred Property</em>' reference.
     * @see #setReferredProperty(DtoProperty)
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDtoPropertyReference_ReferredProperty()
     * @model
     * @generated
     */
    DtoProperty getReferredProperty();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoPropertyReference#getReferredProperty <em>Referred Property</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referred Property</em>' reference.
     * @see #getReferredProperty()
     * @generated
     */
    void setReferredProperty(DtoProperty value);

} // DtoPropertyReference
