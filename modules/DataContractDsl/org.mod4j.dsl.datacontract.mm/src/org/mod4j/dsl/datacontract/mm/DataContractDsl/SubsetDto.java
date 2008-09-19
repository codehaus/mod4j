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
 * A representation of the model object '<em><b>Subset Dto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.SubsetDto#getBaseDto <em>Base Dto</em>}</li>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.SubsetDto#getSelectedProperties <em>Selected Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getSubsetDto()
 * @model
 * @generated
 */
public interface SubsetDto extends Dto {
    /**
     * Returns the value of the '<em><b>Base Dto</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Dto</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Dto</em>' reference.
     * @see #setBaseDto(Dto)
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getSubsetDto_BaseDto()
     * @model
     * @generated
     */
    Dto getBaseDto();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.SubsetDto#getBaseDto <em>Base Dto</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Dto</em>' reference.
     * @see #getBaseDto()
     * @generated
     */
    void setBaseDto(Dto value);

    /**
     * Returns the value of the '<em><b>Selected Properties</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.datacontract.mm.DataContractDsl.PropertyReference}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selected Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selected Properties</em>' containment reference list.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getSubsetDto_SelectedProperties()
     * @model containment="true"
     * @generated
     */
    EList<PropertyReference> getSelectedProperties();

} // SubsetDto
