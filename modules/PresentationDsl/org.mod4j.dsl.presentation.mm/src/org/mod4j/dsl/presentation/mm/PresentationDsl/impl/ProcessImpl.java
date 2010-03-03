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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UICall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessImpl#getProcessElements <em>Process Elements</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessImpl#getContentForm <em>Content Form</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessImpl#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends AbstractProcessImpl implements org.mod4j.dsl.presentation.mm.PresentationDsl.Process {
    /**
     * The cached value of the '{@link #getProcessElements() <em>Process Elements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessElements()
     * @generated
     * @ordered
     */
    protected EList<UICall> processElements;

    /**
     * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLink()
     * @generated
     * @ordered
     */
    protected AssociationRoleReference link;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.PROCESS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<UICall> getProcessElements() {
        if (processElements == null) {
            processElements = new EObjectContainmentWithInverseEList<UICall>(UICall.class, this, PresentationDslPackage.PROCESS__PROCESS_ELEMENTS, PresentationDslPackage.UI_CALL__PROCESS);
        }
        return processElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContentForm getContentForm() {
        if (eContainerFeatureID() != PresentationDslPackage.PROCESS__CONTENT_FORM) return null;
        return (ContentForm)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContentForm(ContentForm newContentForm, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContentForm, PresentationDslPackage.PROCESS__CONTENT_FORM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContentForm(ContentForm newContentForm) {
        if (newContentForm != eInternalContainer() || (eContainerFeatureID() != PresentationDslPackage.PROCESS__CONTENT_FORM && newContentForm != null)) {
            if (EcoreUtil.isAncestor(this, newContentForm))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newContentForm != null)
                msgs = ((InternalEObject)newContentForm).eInverseAdd(this, PresentationDslPackage.CONTENT_FORM__ACTIONS, ContentForm.class, msgs);
            msgs = basicSetContentForm(newContentForm, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.PROCESS__CONTENT_FORM, newContentForm, newContentForm));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssociationRoleReference getLink() {
        return link;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLink(AssociationRoleReference newLink, NotificationChain msgs) {
        AssociationRoleReference oldLink = link;
        link = newLink;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationDslPackage.PROCESS__LINK, oldLink, newLink);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLink(AssociationRoleReference newLink) {
        if (newLink != link) {
            NotificationChain msgs = null;
            if (link != null)
                msgs = ((InternalEObject)link).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.PROCESS__LINK, null, msgs);
            if (newLink != null)
                msgs = ((InternalEObject)newLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.PROCESS__LINK, null, msgs);
            msgs = basicSetLink(newLink, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.PROCESS__LINK, newLink, newLink));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NO
     */
    public boolean isInteractive() {
        for (UICall call : this.getProcessElements()) {
            if( call instanceof DialogueCall   ){
                return true;
            }
        }
        return false;
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
            case PresentationDslPackage.PROCESS__PROCESS_ELEMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessElements()).basicAdd(otherEnd, msgs);
            case PresentationDslPackage.PROCESS__CONTENT_FORM:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetContentForm((ContentForm)otherEnd, msgs);
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
            case PresentationDslPackage.PROCESS__PROCESS_ELEMENTS:
                return ((InternalEList<?>)getProcessElements()).basicRemove(otherEnd, msgs);
            case PresentationDslPackage.PROCESS__CONTENT_FORM:
                return basicSetContentForm(null, msgs);
            case PresentationDslPackage.PROCESS__LINK:
                return basicSetLink(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case PresentationDslPackage.PROCESS__CONTENT_FORM:
                return eInternalContainer().eInverseRemove(this, PresentationDslPackage.CONTENT_FORM__ACTIONS, ContentForm.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PresentationDslPackage.PROCESS__PROCESS_ELEMENTS:
                return getProcessElements();
            case PresentationDslPackage.PROCESS__CONTENT_FORM:
                return getContentForm();
            case PresentationDslPackage.PROCESS__LINK:
                return getLink();
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
            case PresentationDslPackage.PROCESS__PROCESS_ELEMENTS:
                getProcessElements().clear();
                getProcessElements().addAll((Collection<? extends UICall>)newValue);
                return;
            case PresentationDslPackage.PROCESS__CONTENT_FORM:
                setContentForm((ContentForm)newValue);
                return;
            case PresentationDslPackage.PROCESS__LINK:
                setLink((AssociationRoleReference)newValue);
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
            case PresentationDslPackage.PROCESS__PROCESS_ELEMENTS:
                getProcessElements().clear();
                return;
            case PresentationDslPackage.PROCESS__CONTENT_FORM:
                setContentForm((ContentForm)null);
                return;
            case PresentationDslPackage.PROCESS__LINK:
                setLink((AssociationRoleReference)null);
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
            case PresentationDslPackage.PROCESS__PROCESS_ELEMENTS:
                return processElements != null && !processElements.isEmpty();
            case PresentationDslPackage.PROCESS__CONTENT_FORM:
                return getContentForm() != null;
            case PresentationDslPackage.PROCESS__LINK:
                return link != null;
        }
        return super.eIsSet(featureID);
    }

} //ProcessImpl
