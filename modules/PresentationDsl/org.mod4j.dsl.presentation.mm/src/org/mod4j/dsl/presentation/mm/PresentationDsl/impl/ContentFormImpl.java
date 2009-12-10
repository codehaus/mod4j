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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ContentFormImpl#getFormElements <em>Form Elements</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ContentFormImpl#isIsCollection <em>Is Collection</em>}</li>
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
     * The default value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsCollection()
     * @generated
     * @ordered
     */
    protected static final boolean IS_COLLECTION_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsCollection()
     * @generated
     * @ordered
     */
    protected boolean isCollection = IS_COLLECTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActions()
     * @generated
     * @ordered
     */
    protected EList<SimpleProcess> actions;

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
    public boolean isIsCollection() {
        return isCollection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsCollection(boolean newIsCollection) {
        boolean oldIsCollection = isCollection;
        isCollection = newIsCollection;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.CONTENT_FORM__IS_COLLECTION, oldIsCollection, isCollection));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SimpleProcess> getActions() {
        if (actions == null) {
            actions = new EObjectContainmentEList<SimpleProcess>(SimpleProcess.class, this, PresentationDslPackage.CONTENT_FORM__ACTIONS);
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
            case PresentationDslPackage.CONTENT_FORM__IS_COLLECTION:
                return isIsCollection();
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
            case PresentationDslPackage.CONTENT_FORM__IS_COLLECTION:
                setIsCollection((Boolean)newValue);
                return;
            case PresentationDslPackage.CONTENT_FORM__ACTIONS:
                getActions().clear();
                getActions().addAll((Collection<? extends SimpleProcess>)newValue);
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
            case PresentationDslPackage.CONTENT_FORM__IS_COLLECTION:
                setIsCollection(IS_COLLECTION_EDEFAULT);
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
            case PresentationDslPackage.CONTENT_FORM__IS_COLLECTION:
                return isCollection != IS_COLLECTION_EDEFAULT;
            case PresentationDslPackage.CONTENT_FORM__ACTIONS:
                return actions != null && !actions.isEmpty();
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
        result.append(" (isCollection: ");
        result.append(isCollection);
        result.append(')');
        return result.toString();
    }

} //ContentFormImpl
