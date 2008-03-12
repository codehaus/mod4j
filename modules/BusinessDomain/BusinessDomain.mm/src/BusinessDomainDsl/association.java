/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.association#getSource <em>Source</em>}</li>
 *   <li>{@link BusinessDomainDsl.association#getTarget <em>Target</em>}</li>
 *   <li>{@link BusinessDomainDsl.association#getSourceRoleName <em>Source Role Name</em>}</li>
 *   <li>{@link BusinessDomainDsl.association#getSourceMultiplicity <em>Source Multiplicity</em>}</li>
 *   <li>{@link BusinessDomainDsl.association#isTargetNavigability <em>Target Navigability</em>}</li>
 *   <li>{@link BusinessDomainDsl.association#isSourceNavigability <em>Source Navigability</em>}</li>
 *   <li>{@link BusinessDomainDsl.association#getTargetRoleName <em>Target Role Name</em>}</li>
 *   <li>{@link BusinessDomainDsl.association#getTargetMultiplicity <em>Target Multiplicity</em>}</li>
 *   <li>{@link BusinessDomainDsl.association#isIsComposite <em>Is Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getassociation()
 * @model
 * @generated
 */
public interface association extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link BusinessDomainDsl.BusinessClass#getAssociationTo <em>Association To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(BusinessClass)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getassociation_Source()
	 * @see BusinessDomainDsl.BusinessClass#getAssociationTo
	 * @model opposite="associationTo" required="true"
	 * @generated
	 */
	BusinessClass getSource();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.association#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(BusinessClass value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link BusinessDomainDsl.BusinessClass#getAssociationFrom <em>Association From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(BusinessClass)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getassociation_Target()
	 * @see BusinessDomainDsl.BusinessClass#getAssociationFrom
	 * @model opposite="associationFrom" required="true"
	 * @generated
	 */
	BusinessClass getTarget();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.association#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(BusinessClass value);

	/**
	 * Returns the value of the '<em><b>Source Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role Name</em>' attribute.
	 * @see #setSourceRoleName(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getassociation_SourceRoleName()
	 * @model
	 * @generated
	 */
	String getSourceRoleName();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.association#getSourceRoleName <em>Source Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role Name</em>' attribute.
	 * @see #getSourceRoleName()
	 * @generated
	 */
	void setSourceRoleName(String value);

	/**
	 * Returns the value of the '<em><b>Source Multiplicity</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Multiplicity</em>' attribute.
	 * @see #setSourceMultiplicity(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getassociation_SourceMultiplicity()
	 * @model default=""
	 * @generated
	 */
	String getSourceMultiplicity();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.association#getSourceMultiplicity <em>Source Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Multiplicity</em>' attribute.
	 * @see #getSourceMultiplicity()
	 * @generated
	 */
	void setSourceMultiplicity(String value);

	/**
	 * Returns the value of the '<em><b>Target Navigability</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Navigability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Navigability</em>' attribute.
	 * @see #setTargetNavigability(boolean)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getassociation_TargetNavigability()
	 * @model default="true"
	 * @generated
	 */
	boolean isTargetNavigability();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.association#isTargetNavigability <em>Target Navigability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Navigability</em>' attribute.
	 * @see #isTargetNavigability()
	 * @generated
	 */
	void setTargetNavigability(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Navigability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Navigability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Navigability</em>' attribute.
	 * @see #setSourceNavigability(boolean)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getassociation_SourceNavigability()
	 * @model
	 * @generated
	 */
	boolean isSourceNavigability();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.association#isSourceNavigability <em>Source Navigability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Navigability</em>' attribute.
	 * @see #isSourceNavigability()
	 * @generated
	 */
	void setSourceNavigability(boolean value);

	/**
	 * Returns the value of the '<em><b>Target Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Role Name</em>' attribute.
	 * @see #setTargetRoleName(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getassociation_TargetRoleName()
	 * @model
	 * @generated
	 */
	String getTargetRoleName();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.association#getTargetRoleName <em>Target Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Role Name</em>' attribute.
	 * @see #getTargetRoleName()
	 * @generated
	 */
	void setTargetRoleName(String value);

	/**
	 * Returns the value of the '<em><b>Target Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Multiplicity</em>' attribute.
	 * @see #setTargetMultiplicity(String)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getassociation_TargetMultiplicity()
	 * @model
	 * @generated
	 */
	String getTargetMultiplicity();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.association#getTargetMultiplicity <em>Target Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Multiplicity</em>' attribute.
	 * @see #getTargetMultiplicity()
	 * @generated
	 */
	void setTargetMultiplicity(String value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(boolean)
	 * @see BusinessDomainDsl.BusinessDomainDslPackage#getassociation_IsComposite()
	 * @model
	 * @generated
	 */
	boolean isIsComposite();

	/**
	 * Sets the value of the '{@link BusinessDomainDsl.association#isIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isIsComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

} // association
