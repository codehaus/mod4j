/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.StandardExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.StandardExpressionImpl#getContextRef <em>Context Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardExpressionImpl extends ExpressionImpl implements StandardExpression {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ExpressionType TYPE_EDEFAULT = ExpressionType.NONE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ExpressionType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContextRef() <em>Context Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextRef()
	 * @generated
	 * @ordered
	 */
	protected DtoReference contextRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationDslPackage.Literals.STANDARD_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ExpressionType newType) {
		ExpressionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.STANDARD_EXPRESSION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtoReference getContextRef() {
		if (contextRef != null && contextRef.eIsProxy()) {
			InternalEObject oldContextRef = (InternalEObject)contextRef;
			contextRef = (DtoReference)eResolveProxy(oldContextRef);
			if (contextRef != oldContextRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationDslPackage.STANDARD_EXPRESSION__CONTEXT_REF, oldContextRef, contextRef));
			}
		}
		return contextRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtoReference basicGetContextRef() {
		return contextRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextRef(DtoReference newContextRef) {
		DtoReference oldContextRef = contextRef;
		contextRef = newContextRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.STANDARD_EXPRESSION__CONTEXT_REF, oldContextRef, contextRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationDslPackage.STANDARD_EXPRESSION__TYPE:
				return getType();
			case PresentationDslPackage.STANDARD_EXPRESSION__CONTEXT_REF:
				if (resolve) return getContextRef();
				return basicGetContextRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PresentationDslPackage.STANDARD_EXPRESSION__TYPE:
				setType((ExpressionType)newValue);
				return;
			case PresentationDslPackage.STANDARD_EXPRESSION__CONTEXT_REF:
				setContextRef((DtoReference)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PresentationDslPackage.STANDARD_EXPRESSION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PresentationDslPackage.STANDARD_EXPRESSION__CONTEXT_REF:
				setContextRef((DtoReference)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PresentationDslPackage.STANDARD_EXPRESSION__TYPE:
				return type != TYPE_EDEFAULT;
			case PresentationDslPackage.STANDARD_EXPRESSION__CONTEXT_REF:
				return contextRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //StandardExpressionImpl
