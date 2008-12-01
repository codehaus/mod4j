/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mod4j.crossx.mm.crossx;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Symbol Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.crossx.mm.crossx.ReferenceSymbolProperty#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.crossx.mm.crossx.CrossxPackage#getReferenceSymbolProperty()
 * @model
 * @generated
 */
public interface ReferenceSymbolProperty extends SymbolProperty {
    /**
	 * Returns the value of the '<em><b>Referred Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Type</em>' attribute.
	 * @see #setReferredType(String)
	 * @see org.mod4j.crossx.mm.crossx.CrossxPackage#getReferenceSymbolProperty_ReferredType()
	 * @model
	 * @generated
	 */
    String getReferredType();

    /**
	 * Sets the value of the '{@link org.mod4j.crossx.mm.crossx.ReferenceSymbolProperty#getReferredType <em>Referred Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Type</em>' attribute.
	 * @see #getReferredType()
	 * @generated
	 */
    void setReferredType(String value);

} // ReferenceSymbolProperty
