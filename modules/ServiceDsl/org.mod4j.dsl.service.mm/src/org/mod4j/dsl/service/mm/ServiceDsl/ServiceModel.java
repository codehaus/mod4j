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
 * A representation of the model object '<em><b>Service Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.service.mm.ServiceDsl.ServiceModel#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage#getServiceModel()
 * @model
 * @generated
 */
public interface ServiceModel extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.mod4j.dsl.service.mm.ServiceDsl.ServiceMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage#getServiceModel_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceMethod> getMethods();

} // ServiceModel
