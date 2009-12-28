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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationModelImpl#getExternalReferences <em>External References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PresentationModelImpl extends ModelElementImpl implements PresentationModel {
    /**
     * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElements()
     * @generated
     * @ordered
     */
    protected EList<ModelElementWithContext> elements;

    /**
     * The cached value of the '{@link #getExternalReferences() <em>External References</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExternalReferences()
     * @generated
     * @ordered
     */
    protected EList<ExternalReference> externalReferences;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PresentationModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.PRESENTATION_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ModelElementWithContext> getElements() {
        if (elements == null) {
            elements = new EObjectContainmentWithInverseEList<ModelElementWithContext>(ModelElementWithContext.class, this, PresentationDslPackage.PRESENTATION_MODEL__ELEMENTS, PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL);
        }
        return elements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ExternalReference> getExternalReferences() {
        if (externalReferences == null) {
            externalReferences = new EObjectContainmentEList<ExternalReference>(ExternalReference.class, this, PresentationDslPackage.PRESENTATION_MODEL__EXTERNAL_REFERENCES);
        }
        return externalReferences;
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
            case PresentationDslPackage.PRESENTATION_MODEL__ELEMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
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
            case PresentationDslPackage.PRESENTATION_MODEL__ELEMENTS:
                return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
            case PresentationDslPackage.PRESENTATION_MODEL__EXTERNAL_REFERENCES:
                return ((InternalEList<?>)getExternalReferences()).basicRemove(otherEnd, msgs);
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
            case PresentationDslPackage.PRESENTATION_MODEL__ELEMENTS:
                return getElements();
            case PresentationDslPackage.PRESENTATION_MODEL__EXTERNAL_REFERENCES:
                return getExternalReferences();
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
            case PresentationDslPackage.PRESENTATION_MODEL__ELEMENTS:
                getElements().clear();
                getElements().addAll((Collection<? extends ModelElementWithContext>)newValue);
                return;
            case PresentationDslPackage.PRESENTATION_MODEL__EXTERNAL_REFERENCES:
                getExternalReferences().clear();
                getExternalReferences().addAll((Collection<? extends ExternalReference>)newValue);
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
            case PresentationDslPackage.PRESENTATION_MODEL__ELEMENTS:
                getElements().clear();
                return;
            case PresentationDslPackage.PRESENTATION_MODEL__EXTERNAL_REFERENCES:
                getExternalReferences().clear();
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
            case PresentationDslPackage.PRESENTATION_MODEL__ELEMENTS:
                return elements != null && !elements.isEmpty();
            case PresentationDslPackage.PRESENTATION_MODEL__EXTERNAL_REFERENCES:
                return externalReferences != null && !externalReferences.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PresentationModelImpl
