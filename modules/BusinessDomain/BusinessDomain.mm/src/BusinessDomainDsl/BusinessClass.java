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
 * A representation of the model object '<em><b>Business Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.BusinessClass#getInheritanceModifier <em>Inheritance Modifier</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClass#isAutoGenerateMapping <em>Auto Generate Mapping</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClass#getBusinessRule <em>Business Rule</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClass#getCompositionTarget <em>Composition Target</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClass#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClass#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClass#getAssociationTo <em>Association To</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClass#getAssociationFrom <em>Association From</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClass()
 * @model
 * @generated
 */
public interface BusinessClass extends PropertyContainer {
	/**
	 * Returns the value of the '<em><b>Inheritance Modifier</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link BusinessDomainDsl.InheritanceModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance Modifier</em>' attribute.
	 * @see BusinessDomainDsl.InheritanceModifier
	 * @see #setInheritanceModifier(InheritanceModifier)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClass_InheritanceModifier()
	 * @model default="None"
	 * @generated
	 */
	InheritanceModifier getInheritanceModifier();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.BusinessClass#getInheritanceModifier <em>Inheritance Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance Modifier</em>' attribute.
	 * @see BusinessDomainDsl.InheritanceModifier
	 * @see #getInheritanceModifier()
	 * @generated
	 */
	void setInheritanceModifier(InheritanceModifier value);

	/**
	 * Returns the value of the '<em><b>Auto Generate Mapping</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Generate Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Generate Mapping</em>' attribute.
	 * @see #setAutoGenerateMapping(boolean)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClass_AutoGenerateMapping()
	 * @model default="true"
	 * @generated
	 */
	boolean isAutoGenerateMapping();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.BusinessClass#isAutoGenerateMapping <em>Auto Generate Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Generate Mapping</em>' attribute.
	 * @see #isAutoGenerateMapping()
	 * @generated
	 */
	void setAutoGenerateMapping(boolean value);

	/**
	 * Returns the value of the '<em><b>Business Rule</b></em>' containment reference list.
	 * The list contents are of type {@link BusinessDomainDsl.BusinessRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Rule</em>' containment reference list.
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClass_BusinessRule()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessRule> getBusinessRule();

	/**
	 * Returns the value of the '<em><b>Composition Target</b></em>' reference list.
	 * The list contents are of type {@link BusinessDomainDsl.BusinessClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition Target</em>' reference list.
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClass_CompositionTarget()
	 * @model
	 * @generated
	 */
	EList<BusinessClass> getCompositionTarget();

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBaseClass(BusinessClass)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClass_BaseClass()
	 * @model
	 * @generated
	 */
	BusinessClass getBaseClass();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.BusinessClass#getBaseClass <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBaseClass()
	 * @generated
	 */
	void setBaseClass(BusinessClass value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link BusinessDomainDsl.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClass_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Association To</b></em>' reference list.
	 * The list contents are of type {@link BusinessDomainDsl.association_R}.
	 * It is bidirectional and its opposite is '{@link BusinessDomainDsl.association_R#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association To</em>' reference list.
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClass_AssociationTo()
	 * @see BusinessDomainDsl.association_R#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<association_R> getAssociationTo();

	/**
	 * Returns the value of the '<em><b>Association From</b></em>' reference list.
	 * The list contents are of type {@link BusinessDomainDsl.association_R}.
	 * It is bidirectional and its opposite is '{@link BusinessDomainDsl.association_R#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association From</em>' reference list.
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClass_AssociationFrom()
	 * @see BusinessDomainDsl.association_R#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<association_R> getAssociationFrom();

} // BusinessClass
