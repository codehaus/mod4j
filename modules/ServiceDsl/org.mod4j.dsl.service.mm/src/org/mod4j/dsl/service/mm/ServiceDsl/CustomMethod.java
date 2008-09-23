/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.service.mm.ServiceDsl;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.service.mm.ServiceDsl.CustomMethod#getOutput <em>Output</em>}</li>
 *   <li>{@link org.mod4j.dsl.service.mm.ServiceDsl.CustomMethod#getInParameters <em>In Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage#getCustomMethod()
 * @model
 * @generated
 */
public interface CustomMethod extends ServiceMethod {
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
     * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage#getCustomMethod_Output()
     * @model
     * @generated
     */
	DtoReference getOutput();

	/**
     * Sets the value of the '{@link org.mod4j.dsl.service.mm.ServiceDsl.CustomMethod#getOutput <em>Output</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output</em>' reference.
     * @see #getOutput()
     * @generated
     */
	void setOutput(DtoReference value);

    /**
     * Returns the value of the '<em><b>In Parameters</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.service.mm.ServiceDsl.Parameter}.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.service.mm.ServiceDsl.Parameter#getMethod <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Parameters</em>' containment reference list.
     * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage#getCustomMethod_InParameters()
     * @see org.mod4j.dsl.service.mm.ServiceDsl.Parameter#getMethod
     * @model opposite="method" containment="true"
     * @generated
     */
    EList<Parameter> getInParameters();

} // CustomMethod
