/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.util;

import BusinessDomainDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BusinessDomainDsl.BusinessDomainDslPackage
 * @generated
 */
public class BusinessDomainDslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BusinessDomainDslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessDomainDslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BusinessDomainDslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessDomainDslSwitch<Adapter> modelSwitch =
		new BusinessDomainDslSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseBusinessDomainModel(BusinessDomainModel object) {
				return createBusinessDomainModelAdapter();
			}
			@Override
			public Adapter caseBusinessClass(BusinessClass object) {
				return createBusinessClassAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
				return createEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseCommentableElement(CommentableElement object) {
				return createCommentableElementAdapter();
			}
			@Override
			public Adapter caseBusinessRule(BusinessRule object) {
				return createBusinessRuleAdapter();
			}
			@Override
			public Adapter caseBoolProperty(BoolProperty object) {
				return createBoolPropertyAdapter();
			}
			@Override
			public Adapter caseDateTimeProperty(DateTimeProperty object) {
				return createDateTimePropertyAdapter();
			}
			@Override
			public Adapter caseCustomProperty(CustomProperty object) {
				return createCustomPropertyAdapter();
			}
			@Override
			public Adapter caseNumberProperty(NumberProperty object) {
				return createNumberPropertyAdapter();
			}
			@Override
			public Adapter caseStringProperty(StringProperty object) {
				return createStringPropertyAdapter();
			}
			@Override
			public Adapter caseCustomDataType(CustomDataType object) {
				return createCustomDataTypeAdapter();
			}
			@Override
			public Adapter casePropertyContainer(PropertyContainer object) {
				return createPropertyContainerAdapter();
			}
			@Override
			public Adapter caseBlobBinaryProperty(BlobBinaryProperty object) {
				return createBlobBinaryPropertyAdapter();
			}
			@Override
			public Adapter caseBlobTextProperty(BlobTextProperty object) {
				return createBlobTextPropertyAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseassociation(association object) {
				return createassociationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.BusinessDomainModel <em>Business Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.BusinessDomainModel
	 * @generated
	 */
	public Adapter createBusinessDomainModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.BusinessClass <em>Business Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.BusinessClass
	 * @generated
	 */
	public Adapter createBusinessClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.CommentableElement
	 * @generated
	 */
	public Adapter createCommentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.BusinessRule <em>Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.BusinessRule
	 * @generated
	 */
	public Adapter createBusinessRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.BoolProperty <em>Bool Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.BoolProperty
	 * @generated
	 */
	public Adapter createBoolPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.DateTimeProperty <em>Date Time Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.DateTimeProperty
	 * @generated
	 */
	public Adapter createDateTimePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.CustomProperty <em>Custom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.CustomProperty
	 * @generated
	 */
	public Adapter createCustomPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.NumberProperty <em>Number Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.NumberProperty
	 * @generated
	 */
	public Adapter createNumberPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.StringProperty <em>String Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.StringProperty
	 * @generated
	 */
	public Adapter createStringPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.CustomDataType <em>Custom Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.CustomDataType
	 * @generated
	 */
	public Adapter createCustomDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.PropertyContainer <em>Property Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.PropertyContainer
	 * @generated
	 */
	public Adapter createPropertyContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.BlobBinaryProperty <em>Blob Binary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.BlobBinaryProperty
	 * @generated
	 */
	public Adapter createBlobBinaryPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.BlobTextProperty <em>Blob Text Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.BlobTextProperty
	 * @generated
	 */
	public Adapter createBlobTextPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BusinessDomainDsl.association <em>association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BusinessDomainDsl.association
	 * @generated
	 */
	public Adapter createassociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BusinessDomainDslAdapterFactory
