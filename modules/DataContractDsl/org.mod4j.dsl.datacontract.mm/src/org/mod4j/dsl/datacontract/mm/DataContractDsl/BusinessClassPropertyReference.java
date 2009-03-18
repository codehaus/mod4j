/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Class Property Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference#getDto <em>Dto</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassPropertyReference()
 * @model
 * @generated
 */
public interface BusinessClassPropertyReference extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Dto</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getPropertyReferences <em>Property References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dto</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto</em>' container reference.
	 * @see #setDto(BusinessClassDto)
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassPropertyReference_Dto()
	 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto#getPropertyReferences
	 * @model opposite="propertyReferences" transient="false"
	 * @generated
	 */
	BusinessClassDto getDto();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassPropertyReference#getDto <em>Dto</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dto</em>' container reference.
	 * @see #getDto()
	 * @generated
	 */
	void setDto(BusinessClassDto value);

} // BusinessClassPropertyReference
