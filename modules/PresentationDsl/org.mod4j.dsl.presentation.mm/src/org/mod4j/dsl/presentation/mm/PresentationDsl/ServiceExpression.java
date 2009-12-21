/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression#getServiceMethod <em>Service Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getServiceExpression()
 * @model
 * @generated
 */
public interface ServiceExpression extends Expression {
    /**
     * Returns the value of the '<em><b>Service Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Name</em>' attribute.
     * @see #setServiceName(String)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getServiceExpression_ServiceName()
     * @model
     * @generated
     */
    String getServiceName();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression#getServiceName <em>Service Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Name</em>' attribute.
     * @see #getServiceName()
     * @generated
     */
    void setServiceName(String value);

    /**
     * Returns the value of the '<em><b>Service Method</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Method</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Method</em>' attribute.
     * @see #setServiceMethod(String)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getServiceExpression_ServiceMethod()
     * @model
     * @generated
     */
    String getServiceMethod();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression#getServiceMethod <em>Service Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Method</em>' attribute.
     * @see #getServiceMethod()
     * @generated
     */
    void setServiceMethod(String value);

} // ServiceExpression
