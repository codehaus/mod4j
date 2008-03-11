/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.NumberProperty#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.NumberProperty#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.NumberProperty#isMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link BusinessDomainDsl.NumberProperty#isMaxInclusive <em>Max Inclusive</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getNumberProperty()
 * @model
 * @generated
 */
public interface NumberProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getNumberProperty_MinValue()
	 * @model
	 * @generated
	 */
	String getMinValue();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.NumberProperty#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(String value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getNumberProperty_MaxValue()
	 * @model
	 * @generated
	 */
	String getMaxValue();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.NumberProperty#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(String value);

	/**
	 * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Inclusive</em>' attribute.
	 * @see #setMinInclusive(boolean)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getNumberProperty_MinInclusive()
	 * @model
	 * @generated
	 */
	boolean isMinInclusive();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.NumberProperty#isMinInclusive <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Inclusive</em>' attribute.
	 * @see #isMinInclusive()
	 * @generated
	 */
	void setMinInclusive(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Inclusive</em>' attribute.
	 * @see #setMaxInclusive(boolean)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getNumberProperty_MaxInclusive()
	 * @model
	 * @generated
	 */
	boolean isMaxInclusive();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.NumberProperty#isMaxInclusive <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Inclusive</em>' attribute.
	 * @see #isMaxInclusive()
	 * @generated
	 */
	void setMaxInclusive(boolean value);

} // NumberProperty
