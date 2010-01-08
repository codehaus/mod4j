/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getStandardExpression()
 * @model
 * @generated
 */
public interface StandardExpression extends Expression {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"NONE"</code>.
     * The literals are from the enumeration {@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType
     * @see #setType(ExpressionType)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getStandardExpression_Type()
     * @model default="NONE"
     * @generated
     */
    ExpressionType getType();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType
     * @see #getType()
     * @generated
     */
    void setType(ExpressionType value);

} // StandardExpression
