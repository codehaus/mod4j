/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element With Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ModelElementWithContextImpl#getContextRef <em>Context Ref</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ModelElementWithContextImpl#getPresentationModel <em>Presentation Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelElementWithContextImpl extends ModelElementImpl implements ModelElementWithContext {
    /**
     * The cached value of the '{@link #getContextRef() <em>Context Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextRef()
     * @generated
     * @ordered
     */
    protected ExternalReference contextRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelElementWithContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.MODEL_ELEMENT_WITH_CONTEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExternalReference getContextRef() {
        if (contextRef != null && contextRef.eIsProxy()) {
            InternalEObject oldContextRef = (InternalEObject)contextRef;
            contextRef = (ExternalReference)eResolveProxy(oldContextRef);
            if (contextRef != oldContextRef) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__CONTEXT_REF, oldContextRef, contextRef));
            }
        }
        return contextRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExternalReference basicGetContextRef() {
        return contextRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextRef(ExternalReference newContextRef) {
        ExternalReference oldContextRef = contextRef;
        contextRef = newContextRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__CONTEXT_REF, oldContextRef, contextRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PresentationModel getPresentationModel() {
        if (eContainerFeatureID() != PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL) return null;
        return (PresentationModel)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPresentationModel(PresentationModel newPresentationModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPresentationModel, PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPresentationModel(PresentationModel newPresentationModel) {
        if (newPresentationModel != eInternalContainer() || (eContainerFeatureID() != PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL && newPresentationModel != null)) {
            if (EcoreUtil.isAncestor(this, newPresentationModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPresentationModel != null)
                msgs = ((InternalEObject)newPresentationModel).eInverseAdd(this, PresentationDslPackage.PRESENTATION_MODEL__ELEMENTS, PresentationModel.class, msgs);
            msgs = basicSetPresentationModel(newPresentationModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL, newPresentationModel, newPresentationModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPresentationModel((PresentationModel)otherEnd, msgs);
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
            case PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL:
                return basicSetPresentationModel(null, msgs);
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
            case PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL:
                return eInternalContainer().eInverseRemove(this, PresentationDslPackage.PRESENTATION_MODEL__ELEMENTS, PresentationModel.class, msgs);
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
            case PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__CONTEXT_REF:
                if (resolve) return getContextRef();
                return basicGetContextRef();
            case PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL:
                return getPresentationModel();
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
            case PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__CONTEXT_REF:
                setContextRef((ExternalReference)newValue);
                return;
            case PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL:
                setPresentationModel((PresentationModel)newValue);
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
            case PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__CONTEXT_REF:
                setContextRef((ExternalReference)null);
                return;
            case PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL:
                setPresentationModel((PresentationModel)null);
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
            case PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__CONTEXT_REF:
                return contextRef != null;
            case PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL:
                return getPresentationModel() != null;
        }
        return super.eIsSet(featureID);
    }

} //ModelElementWithContextImpl
