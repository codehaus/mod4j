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
 * A representation of the model object '<em><b>Domain Class Dto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DomainClassDto#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DomainClassDto#getBase <em>Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDomainClassDto()
 * @model
 * @generated
 */
public interface DomainClassDto extends Dto {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.mod4j.dsl.datacontract.mm.DataContractDsl.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDomainClassDto_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(DomainClassReference)
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getDomainClassDto_Base()
	 * @model
	 * @generated
	 */
	DomainClassReference getBase();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DomainClassDto#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(DomainClassReference value);

} // DomainClassDto
