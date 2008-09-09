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
 * A representation of the model object '<em><b>Data Contract Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel#getDtos <em>Dtos</em>}</li>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel#getDomainClasses <em>Domain Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDataContractModel()
 * @model
 * @generated
 */
public interface DataContractModel extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Dtos</b></em>' containment reference list.
	 * The list contents are of type {@link org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dtos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtos</em>' containment reference list.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDataContractModel_Dtos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dto> getDtos();

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link org.mod4j.dsl.datacontract.mm.DataContractDsl.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDataContractModel_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enumeration> getEnumerations();

	/**
	 * Returns the value of the '<em><b>Domain Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DomainClassReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Classes</em>' containment reference list.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDataContractModel_DomainClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainClassReference> getDomainClasses();

} // DataContractModel
