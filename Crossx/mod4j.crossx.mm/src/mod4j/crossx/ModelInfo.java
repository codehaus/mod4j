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
 * A representation of the model object '<em><b>Model Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mod4j.crossx.ModelInfo#getModel <em>Model</em>}</li>
 *   <li>{@link mod4j.crossx.ModelInfo#getElements <em>Elements</em>}</li>
 *   <li>{@link mod4j.crossx.ModelInfo#getLastChanged <em>Last Changed</em>}</li>
 * </ul>
 * </p>
 *
 * @see mod4j.crossx.CrossxPackage#getModelInfo()
 * @model
 * @generated
 */
public interface ModelInfo extends EObject {
    /**
     * Returns the value of the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' containment reference.
     * @see #setModel(ModelReference)
     * @see mod4j.crossx.CrossxPackage#getModelInfo_Model()
     * @model containment="true"
     * @generated
     */
    ModelReference getModel();

    /**
     * Sets the value of the '{@link mod4j.crossx.ModelInfo#getModel <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' containment reference.
     * @see #getModel()
     * @generated
     */
    void setModel(ModelReference value);

    /**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
     * The list contents are of type {@link mod4j.crossx.Element}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' containment reference list.
     * @see mod4j.crossx.CrossxPackage#getModelInfo_Elements()
     * @model containment="true"
     * @generated
     */
    EList<Element> getElements();

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
     * @see mod4j.crossx.CrossxPackage#getModelInfo_LastChanged()
     * @model default=""
     * @generated
     */
    String getLastChanged();

    /**
     * Sets the value of the '{@link mod4j.crossx.ModelInfo#getLastChanged <em>Last Changed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Changed</em>' attribute.
     * @see #getLastChanged()
     * @generated
     */
    void setLastChanged(String value);

} // ModelInfo
