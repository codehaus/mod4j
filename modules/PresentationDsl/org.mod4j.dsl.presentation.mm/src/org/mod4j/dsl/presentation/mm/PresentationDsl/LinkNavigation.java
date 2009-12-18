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
 * A representation of the model object '<em><b>Link Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkNavigation#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getLinkNavigation()
 * @model
 * @generated
 */
public interface LinkNavigation extends Link {

    /**
     * Returns the value of the '<em><b>References</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>References</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>References</em>' containment reference list.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getLinkNavigation_References()
     * @model containment="true"
     * @generated
     */
    EList<AssociationRoleReference> getReferences();
} // LinkNavigation
