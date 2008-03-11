/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Class Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.BusinessClassModel#isAutoGenerate <em>Auto Generate</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClassModel#getBusinessProcessProject <em>Business Process Project</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClassModel#getBusinessProcessDirectory <em>Business Process Directory</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClassModel#getServiceHostProject <em>Service Host Project</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClassModel#getDatabaseType <em>Database Type</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClassModel#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClassModel#getComment <em>Comment</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClassModel#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClassModel#getPropertyContainer <em>Property Container</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClassModel#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClassModel()
 * @model
 * @generated
 */
public interface BusinessClassModel extends NamedElement {
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
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClassModel_AutoGenerate()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutoGenerate();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.BusinessClassModel#isAutoGenerate <em>Auto Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Generate</em>' attribute.
	 * @see #isAutoGenerate()
	 * @generated
	 */
	void setAutoGenerate(boolean value);

	/**
	 * Returns the value of the '<em><b>Business Process Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Process Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Process Project</em>' attribute.
	 * @see #setBusinessProcessProject(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClassModel_BusinessProcessProject()
	 * @model
	 * @generated
	 */
	String getBusinessProcessProject();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.BusinessClassModel#getBusinessProcessProject <em>Business Process Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Process Project</em>' attribute.
	 * @see #getBusinessProcessProject()
	 * @generated
	 */
	void setBusinessProcessProject(String value);

	/**
	 * Returns the value of the '<em><b>Business Process Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Process Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Process Directory</em>' attribute.
	 * @see #setBusinessProcessDirectory(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClassModel_BusinessProcessDirectory()
	 * @model
	 * @generated
	 */
	String getBusinessProcessDirectory();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.BusinessClassModel#getBusinessProcessDirectory <em>Business Process Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Process Directory</em>' attribute.
	 * @see #getBusinessProcessDirectory()
	 * @generated
	 */
	void setBusinessProcessDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Service Host Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Host Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Host Project</em>' attribute.
	 * @see #setServiceHostProject(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClassModel_ServiceHostProject()
	 * @model
	 * @generated
	 */
	String getServiceHostProject();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.BusinessClassModel#getServiceHostProject <em>Service Host Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Host Project</em>' attribute.
	 * @see #getServiceHostProject()
	 * @generated
	 */
	void setServiceHostProject(String value);

	/**
	 * Returns the value of the '<em><b>Database Type</b></em>' attribute.
	 * The default value is <code>"SQLServer_2005"</code>.
	 * The literals are from the enumeration {@link BusinessDomainDsl.DatabaseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Type</em>' attribute.
	 * @see BusinessDomainDsl.DatabaseType
	 * @see #setDatabaseType(DatabaseType)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClassModel_DatabaseType()
	 * @model default="SQLServer_2005"
	 * @generated
	 */
	DatabaseType getDatabaseType();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.BusinessClassModel#getDatabaseType <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Type</em>' attribute.
	 * @see BusinessDomainDsl.DatabaseType
	 * @see #getDatabaseType()
	 * @generated
	 */
	void setDatabaseType(DatabaseType value);

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClassModel_DatabaseName()
	 * @model
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.BusinessClassModel#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link BusinessDomainDsl.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClassModel_Comment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComment();

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' containment reference list.
	 * The list contents are of type {@link BusinessDomainDsl.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' containment reference list.
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClassModel_Enumeration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enumeration> getEnumeration();

	/**
	 * Returns the value of the '<em><b>Property Container</b></em>' containment reference list.
	 * The list contents are of type {@link BusinessDomainDsl.PropertyContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Container</em>' containment reference list.
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClassModel_PropertyContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyContainer> getPropertyContainer();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link BusinessDomainDsl.association_R}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClassModel_Associations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<association_R> getAssociations();

} // BusinessClassModel
