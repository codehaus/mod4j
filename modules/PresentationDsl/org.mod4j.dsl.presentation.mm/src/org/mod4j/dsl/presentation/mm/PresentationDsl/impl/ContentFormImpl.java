/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ContentFormImpl#getFormElements <em>Form Elements</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ContentFormImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentFormImpl extends FormImpl implements ContentForm {
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
     * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActions()
     * @generated
     * @ordered
     */
    protected EList<org.mod4j.dsl.presentation.mm.PresentationDsl.Process> actions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContentFormImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.CONTENT_FORM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FormElement> getFormElements() {
        if (formElements == null) {
            formElements = new EObjectContainmentWithInverseEList<FormElement>(FormElement.class, this, PresentationDslPackage.CONTENT_FORM__FORM_ELEMENTS, PresentationDslPackage.FORM_ELEMENT__FORM);
        }
        return formElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<org.mod4j.dsl.presentation.mm.PresentationDsl.Process> getActions() {
        if (actions == null) {
            actions = new EObjectContainmentWithInverseEList<org.mod4j.dsl.presentation.mm.PresentationDsl.Process>(org.mod4j.dsl.presentation.mm.PresentationDsl.Process.class, this, PresentationDslPackage.CONTENT_FORM__ACTIONS, PresentationDslPackage.PROCESS__CONTENT_FORM);
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
            case PresentationDslPackage.CONTENT_FORM__FORM_ELEMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getFormElements()).basicAdd(otherEnd, msgs);
            case PresentationDslPackage.CONTENT_FORM__ACTIONS:
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
            case PresentationDslPackage.CONTENT_FORM__FORM_ELEMENTS:
                return ((InternalEList<?>)getFormElements()).basicRemove(otherEnd, msgs);
            case PresentationDslPackage.CONTENT_FORM__ACTIONS:
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
            case PresentationDslPackage.CONTENT_FORM__FORM_ELEMENTS:
                return getFormElements();
            case PresentationDslPackage.CONTENT_FORM__ACTIONS:
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
            case PresentationDslPackage.CONTENT_FORM__FORM_ELEMENTS:
                getFormElements().clear();
                getFormElements().addAll((Collection<? extends FormElement>)newValue);
                return;
            case PresentationDslPackage.CONTENT_FORM__ACTIONS:
                getActions().clear();
                getActions().addAll((Collection<? extends org.mod4j.dsl.presentation.mm.PresentationDsl.Process>)newValue);
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
            case PresentationDslPackage.CONTENT_FORM__FORM_ELEMENTS:
                getFormElements().clear();
                return;
            case PresentationDslPackage.CONTENT_FORM__ACTIONS:
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
            case PresentationDslPackage.CONTENT_FORM__FORM_ELEMENTS:
                return formElements != null && !formElements.isEmpty();
            case PresentationDslPackage.CONTENT_FORM__ACTIONS:
                return actions != null && !actions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ContentFormImpl
