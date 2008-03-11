/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.CustomDataType#isAutoGenerate <em>Auto Generate</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getCustomDataType()
 * @model
 * @generated
 */
public interface CustomDataType extends PropertyContainer {
	/**
	 * Returns the value of the '<em><b>Auto Generate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Generate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Generate</em>' attribute.
	 * @see #setAutoGenerate(boolean)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getCustomDataType_AutoGenerate()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutoGenerate();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.CustomDataType#isAutoGenerate <em>Auto Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Generate</em>' attribute.
	 * @see #isAutoGenerate()
	 * @generated
	 */
	void setAutoGenerate(boolean value);

} // CustomDataType
