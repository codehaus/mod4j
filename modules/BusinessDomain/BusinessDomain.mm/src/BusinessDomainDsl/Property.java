/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.Property#getDataType <em>Data Type</em>}</li>
 *   <li>{@link BusinessDomainDsl.Property#isNullable <em>Nullable</em>}</li>
 *   <li>{@link BusinessDomainDsl.Property#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.Property#isUseAsLogicalId <em>Use As Logical Id</em>}</li>
 *   <li>{@link BusinessDomainDsl.Property#getPersistency <em>Persistency</em>}</li>
 *   <li>{@link BusinessDomainDsl.Property#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getProperty_DataType()
	 * @model
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.Property#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getProperty_Nullable()
	 * @model
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.Property#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getProperty_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.Property#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Use As Logical Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use As Logical Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use As Logical Id</em>' attribute.
	 * @see #setUseAsLogicalId(boolean)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getProperty_UseAsLogicalId()
	 * @model
	 * @generated
	 */
	boolean isUseAsLogicalId();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.Property#isUseAsLogicalId <em>Use As Logical Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use As Logical Id</em>' attribute.
	 * @see #isUseAsLogicalId()
	 * @generated
	 */
	void setUseAsLogicalId(boolean value);

	/**
	 * Returns the value of the '<em><b>Persistency</b></em>' attribute.
	 * The default value is <code>"ReadWrite"</code>.
	 * The literals are from the enumeration {@link BusinessDomainDsl.PersistencyMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistency</em>' attribute.
	 * @see BusinessDomainDsl.PersistencyMode
	 * @see #setPersistency(PersistencyMode)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getProperty_Persistency()
	 * @model default="ReadWrite"
	 * @generated
	 */
	PersistencyMode getPersistency();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.Property#getPersistency <em>Persistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistency</em>' attribute.
	 * @see BusinessDomainDsl.PersistencyMode
	 * @see #getPersistency()
	 * @generated
	 */
	void setPersistency(PersistencyMode value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getProperty_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.Property#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Property
