/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BusinessDomainDsl.BusinessDomainDslPackage
 * @generated
 */
public interface BusinessDomainDslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessDomainDslFactory eINSTANCE = BusinessDomainDsl.impl.BusinessDomainDslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Business Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Domain Model</em>'.
	 * @generated
	 */
	BusinessDomainModel createBusinessDomainModel();

	/**
	 * Returns a new object of class '<em>Business Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Class</em>'.
	 * @generated
	 */
	BusinessClass createBusinessClass();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
	Enumeration createEnumeration();

	/**
	 * Returns a new object of class '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Literal</em>'.
	 * @generated
	 */
	EnumerationLiteral createEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commentable Element</em>'.
	 * @generated
	 */
	CommentableElement createCommentableElement();

	/**
	 * Returns a new object of class '<em>Business Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Rule</em>'.
	 * @generated
	 */
	BusinessRule createBusinessRule();

	/**
	 * Returns a new object of class '<em>Bool Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool Property</em>'.
	 * @generated
	 */
	BoolProperty createBoolProperty();

	/**
	 * Returns a new object of class '<em>Date Time Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Property</em>'.
	 * @generated
	 */
	DateTimeProperty createDateTimeProperty();

	/**
	 * Returns a new object of class '<em>Custom Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Property</em>'.
	 * @generated
	 */
	CustomProperty createCustomProperty();

	/**
	 * Returns a new object of class '<em>Number Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Property</em>'.
	 * @generated
	 */
	NumberProperty createNumberProperty();

	/**
	 * Returns a new object of class '<em>String Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Property</em>'.
	 * @generated
	 */
	StringProperty createStringProperty();

	/**
	 * Returns a new object of class '<em>Custom Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Data Type</em>'.
	 * @generated
	 */
	CustomDataType createCustomDataType();

	/**
	 * Returns a new object of class '<em>Property Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Container</em>'.
	 * @generated
	 */
	PropertyContainer createPropertyContainer();

	/**
	 * Returns a new object of class '<em>Blob Binary Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blob Binary Property</em>'.
	 * @generated
	 */
	BlobBinaryProperty createBlobBinaryProperty();

	/**
	 * Returns a new object of class '<em>Blob Text Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blob Text Property</em>'.
	 * @generated
	 */
	BlobTextProperty createBlobTextProperty();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>association</em>'.
	 * @generated
	 */
	association createassociation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BusinessDomainDslPackage getBusinessDomainDslPackage();

} //BusinessDomainDslFactory
