/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.service.mm.ServiceDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.service.mm.ServiceDsl.ServiceMethod#getType <em>Type</em>}</li>
 *   <li>{@link org.mod4j.dsl.service.mm.ServiceDsl.ServiceMethod#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage#getServiceMethod()
 * @model
 * @generated
 */
public interface ServiceMethod extends ModelElement {
	/**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"Custom"</code>.
     * The literals are from the enumeration {@link org.mod4j.dsl.service.mm.ServiceDsl.MethodType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.mod4j.dsl.service.mm.ServiceDsl.MethodType
     * @see #setType(MethodType)
     * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage#getServiceMethod_Type()
     * @model default="Custom"
     * @generated
     */
	MethodType getType();

	/**
     * Sets the value of the '{@link org.mod4j.dsl.service.mm.ServiceDsl.ServiceMethod#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.mod4j.dsl.service.mm.ServiceDsl.MethodType
     * @see #getType()
     * @generated
     */
	void setType(MethodType value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.service.mm.ServiceDsl.ServiceModel#getMethods <em>Methods</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(ServiceModel)
     * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage#getServiceMethod_Model()
     * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceModel#getMethods
     * @model opposite="methods" transient="false"
     * @generated
     */
    ServiceModel getModel();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.service.mm.ServiceDsl.ServiceMethod#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(ServiceModel value);

} // ServiceMethod
