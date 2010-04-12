/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression#getReferences <em>References</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression#isComposition <em>Composition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getNavigationExpression()
 * @model
 * @generated
 */
public interface NavigationExpression extends Expression {
    /**
     * Returns the value of the '<em><b>References</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>References</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>References</em>' containment reference list.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getNavigationExpression_References()
     * @model containment="true"
     * @generated
     */
    EList<AssociationRoleReference> getReferences();

    /**
     * Returns the value of the '<em><b>Composition</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Composition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Composition</em>' attribute.
     * @see #setComposition(boolean)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getNavigationExpression_Composition()
     * @model default="false"
     * @generated
     */
    boolean isComposition();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression#isComposition <em>Composition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Composition</em>' attribute.
     * @see #isComposition()
     * @generated
     */
    void setComposition(boolean value);

} // NavigationExpression
