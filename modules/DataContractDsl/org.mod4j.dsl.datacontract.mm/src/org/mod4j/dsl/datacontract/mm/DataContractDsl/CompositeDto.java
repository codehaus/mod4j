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
 * A representation of the model object '<em><b>Composite Dto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.CompositeDto#getDtos <em>Dtos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getCompositeDto()
 * @model
 * @generated
 */
public interface CompositeDto extends Dto {
    /**
     * Returns the value of the '<em><b>Dtos</b></em>' reference list.
     * The list contents are of type {@link org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dtos</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dtos</em>' reference list.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getCompositeDto_Dtos()
     * @model
     * @generated
     */
    EList<Dto> getDtos();

} // CompositeDto
