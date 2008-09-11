/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mod4j.crossx.mm.crossx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.crossx.mm.crossx.ModelInfo#getElements <em>Elements</em>}</li>
 *   <li>{@link org.mod4j.crossx.mm.crossx.ModelInfo#getLastChanged <em>Last Changed</em>}</li>
 *   <li>{@link org.mod4j.crossx.mm.crossx.ModelInfo#getName <em>Name</em>}</li>
 *   <li>{@link org.mod4j.crossx.mm.crossx.ModelInfo#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.crossx.mm.crossx.CrossxPackage#getModelInfo()
 * @model
 * @generated
 */
public interface ModelInfo extends EObject {
    /**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.crossx.mm.crossx.Symbol}.
     * It is bidirectional and its opposite is '{@link org.mod4j.crossx.mm.crossx.Symbol#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' containment reference list.
     * @see org.mod4j.crossx.mm.crossx.CrossxPackage#getModelInfo_Elements()
     * @see org.mod4j.crossx.mm.crossx.Symbol#getOwner
     * @model opposite="owner" containment="true"
     * @generated
     */
    EList<Symbol> getElements();

    /**
     * Returns the value of the '<em><b>Last Changed</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Changed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Changed</em>' attribute.
     * @see #setLastChanged(String)
     * @see org.mod4j.crossx.mm.crossx.CrossxPackage#getModelInfo_LastChanged()
     * @model default=""
     * @generated
     */
    String getLastChanged();

    /**
     * Sets the value of the '{@link org.mod4j.crossx.mm.crossx.ModelInfo#getLastChanged <em>Last Changed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Changed</em>' attribute.
     * @see #getLastChanged()
     * @generated
     */
    void setLastChanged(String value);

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
     * @see org.mod4j.crossx.mm.crossx.CrossxPackage#getModelInfo_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.mod4j.crossx.mm.crossx.ModelInfo#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Resource</b></em>' attribute.
     * The default value is <code>"[unknown]"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource</em>' attribute.
     * @see #setResource(String)
     * @see org.mod4j.crossx.mm.crossx.CrossxPackage#getModelInfo_Resource()
     * @model default="[unknown]"
     * @generated
     */
    String getResource();

    /**
     * Sets the value of the '{@link org.mod4j.crossx.mm.crossx.ModelInfo#getResource <em>Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource</em>' attribute.
     * @see #getResource()
     * @generated
     */
    void setResource(String value);

} // ModelInfo
