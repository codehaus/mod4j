/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.service.mm.ServiceDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Costom Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.service.mm.ServiceDsl.CostomMethod#getInput <em>Input</em>}</li>
 *   <li>{@link org.mod4j.dsl.service.mm.ServiceDsl.CostomMethod#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage#getCostomMethod()
 * @model
 * @generated
 */
public interface CostomMethod extends ServiceMethod {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(DtoReference)
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage#getCostomMethod_Input()
	 * @model
	 * @generated
	 */
	DtoReference getInput();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.service.mm.ServiceDsl.CostomMethod#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(DtoReference value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(DtoReference)
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage#getCostomMethod_Output()
	 * @model
	 * @generated
	 */
	DtoReference getOutput();

	/**
	 * Sets the value of the '{@link org.mod4j.dsl.service.mm.ServiceDsl.CostomMethod#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(DtoReference value);

} // CostomMethod
