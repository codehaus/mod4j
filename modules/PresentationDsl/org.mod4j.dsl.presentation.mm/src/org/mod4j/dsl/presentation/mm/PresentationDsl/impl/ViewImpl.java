/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mod4j.dsl.presentation.mm.PresentationDsl.Action;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ViewImpl#getFormElements <em>Form Elements</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ViewImpl#getBaseView <em>Base View</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ViewImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends AbstractDialogueImpl implements View {
	/**
	 */
	@Override
	public DtoReference getContextRef() {
		if( super.getContextRef() != null ){
			return super.getContextRef();
		} else if(getBaseView() != null ){
			return getBaseView().getContextRef();
		} else {
			return null;
		}
	}
	
	@Override
	public boolean isCollectionContext() {
		if( getBaseView() == null ){
			return super.isCollectionContext();
		} else {
			return getBaseView().isCollectionContext();
		}
	}
	
	
	/**
	 * The cached value of the '{@link #getFormElements() <em>Form Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FormElement> formElements;

	/**
	 * The cached value of the '{@link #getBaseView() <em>Base View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseView()
	 * @generated
	 * @ordered
	 */
	protected View baseView;
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationDslPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormElement> getFormElements() {
		if (formElements == null) {
			formElements = new EObjectContainmentWithInverseEList<FormElement>(FormElement.class, this, PresentationDslPackage.VIEW__FORM_ELEMENTS, PresentationDslPackage.FORM_ELEMENT__FORM);
		}
		return formElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getBaseView() {
		if (baseView != null && baseView.eIsProxy()) {
			InternalEObject oldBaseView = (InternalEObject)baseView;
			baseView = (View)eResolveProxy(oldBaseView);
			if (baseView != oldBaseView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationDslPackage.VIEW__BASE_VIEW, oldBaseView, baseView));
			}
		}
		return baseView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetBaseView() {
		return baseView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseView(View newBaseView) {
		View oldBaseView = baseView;
		baseView = newBaseView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.VIEW__BASE_VIEW, oldBaseView, baseView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<Action>(Action.class, this, PresentationDslPackage.VIEW__ACTIONS, PresentationDslPackage.ACTION__VIEW);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationDslPackage.VIEW__FORM_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFormElements()).basicAdd(otherEnd, msgs);
			case PresentationDslPackage.VIEW__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationDslPackage.VIEW__FORM_ELEMENTS:
				return ((InternalEList<?>)getFormElements()).basicRemove(otherEnd, msgs);
			case PresentationDslPackage.VIEW__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationDslPackage.VIEW__FORM_ELEMENTS:
				return getFormElements();
			case PresentationDslPackage.VIEW__BASE_VIEW:
				if (resolve) return getBaseView();
				return basicGetBaseView();
			case PresentationDslPackage.VIEW__ACTIONS:
				return getActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PresentationDslPackage.VIEW__FORM_ELEMENTS:
				getFormElements().clear();
				getFormElements().addAll((Collection<? extends FormElement>)newValue);
				return;
			case PresentationDslPackage.VIEW__BASE_VIEW:
				setBaseView((View)newValue);
				return;
			case PresentationDslPackage.VIEW__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
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
			case PresentationDslPackage.VIEW__FORM_ELEMENTS:
				getFormElements().clear();
				return;
			case PresentationDslPackage.VIEW__BASE_VIEW:
				setBaseView((View)null);
				return;
			case PresentationDslPackage.VIEW__ACTIONS:
				getActions().clear();
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
			case PresentationDslPackage.VIEW__FORM_ELEMENTS:
				return formElements != null && !formElements.isEmpty();
			case PresentationDslPackage.VIEW__BASE_VIEW:
				return baseView != null;
			case PresentationDslPackage.VIEW__ACTIONS:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewImpl
