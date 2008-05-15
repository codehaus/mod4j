/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mod4j.crossx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mod4j.crossx.Element#getName <em>Name</em>}</li>
 *   <li>{@link mod4j.crossx.Element#getElemType <em>Elem Type</em>}</li>
 *   <li>{@link mod4j.crossx.Element#getProperties <em>Properties</em>}</li>
 *   <li>{@link mod4j.crossx.Element#getSubElements <em>Sub Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see mod4j.crossx.CrossxPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see mod4j.crossx.CrossxPackage#getElement_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link mod4j.crossx.Element#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Elem Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elem Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elem Type</em>' attribute.
     * @see #setElemType(String)
     * @see mod4j.crossx.CrossxPackage#getElement_ElemType()
     * @model
     * @generated
     */
    String getElemType();

    /**
     * Sets the value of the '{@link mod4j.crossx.Element#getElemType <em>Elem Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Elem Type</em>' attribute.
     * @see #getElemType()
     * @generated
     */
    void setElemType(String value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link mod4j.crossx.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see mod4j.crossx.CrossxPackage#getElement_Properties()
     * @model containment="true"
     * @generated
     */
    EList<Property> getProperties();

    /**
     * Returns the value of the '<em><b>Sub Elements</b></em>' containment reference list.
     * The list contents are of type {@link mod4j.crossx.Element}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Elements</em>' containment reference list.
     * @see mod4j.crossx.CrossxPackage#getElement_SubElements()
     * @model containment="true"
     * @generated
     */
    EList<Element> getSubElements();

} // Element
