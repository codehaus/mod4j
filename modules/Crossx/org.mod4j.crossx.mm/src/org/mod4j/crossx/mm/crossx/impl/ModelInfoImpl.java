/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mod4j.crossx.mm.crossx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mod4j.crossx.mm.crossx.CrossxPackage;
import org.mod4j.crossx.mm.crossx.ModelInfo;
import org.mod4j.crossx.mm.crossx.Symbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.crossx.mm.crossx.impl.ModelInfoImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.mod4j.crossx.mm.crossx.impl.ModelInfoImpl#getLastChanged <em>Last Changed</em>}</li>
 *   <li>{@link org.mod4j.crossx.mm.crossx.impl.ModelInfoImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mod4j.crossx.mm.crossx.impl.ModelInfoImpl#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelInfoImpl extends EObjectImpl implements ModelInfo {
    /**
     * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElements()
     * @generated
     * @ordered
     */
    protected EList<Symbol> elements;

    /**
     * The default value of the '{@link #getLastChanged() <em>Last Changed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastChanged()
     * @generated
     * @ordered
     */
    protected static final String LAST_CHANGED_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getLastChanged() <em>Last Changed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastChanged()
     * @generated
     * @ordered
     */
    protected String lastChanged = LAST_CHANGED_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResource()
     * @generated
     * @ordered
     */
    protected static final String RESOURCE_EDEFAULT = "[unknown]";

    /**
     * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResource()
     * @generated
     * @ordered
     */
    protected String resource = RESOURCE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CrossxPackage.Literals.MODEL_INFO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Symbol> getElements() {
        if (elements == null) {
            elements = new EObjectContainmentWithInverseEList<Symbol>(Symbol.class, this, CrossxPackage.MODEL_INFO__ELEMENTS, CrossxPackage.SYMBOL__OWNER);
        }
        return elements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLastChanged() {
        return lastChanged;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLastChanged(String newLastChanged) {
        String oldLastChanged = lastChanged;
        lastChanged = newLastChanged;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.MODEL_INFO__LAST_CHANGED, oldLastChanged, lastChanged));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.MODEL_INFO__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getResource() {
        return resource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResource(String newResource) {
        String oldResource = resource;
        resource = newResource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.MODEL_INFO__RESOURCE, oldResource, resource));
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
            case CrossxPackage.MODEL_INFO__ELEMENTS:
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
            case CrossxPackage.MODEL_INFO__ELEMENTS:
                return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
            case CrossxPackage.MODEL_INFO__ELEMENTS:
                return getElements();
            case CrossxPackage.MODEL_INFO__LAST_CHANGED:
                return getLastChanged();
            case CrossxPackage.MODEL_INFO__NAME:
                return getName();
            case CrossxPackage.MODEL_INFO__RESOURCE:
                return getResource();
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
            case CrossxPackage.MODEL_INFO__ELEMENTS:
                getElements().clear();
                getElements().addAll((Collection<? extends Symbol>)newValue);
                return;
            case CrossxPackage.MODEL_INFO__LAST_CHANGED:
                setLastChanged((String)newValue);
                return;
            case CrossxPackage.MODEL_INFO__NAME:
                setName((String)newValue);
                return;
            case CrossxPackage.MODEL_INFO__RESOURCE:
                setResource((String)newValue);
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
            case CrossxPackage.MODEL_INFO__ELEMENTS:
                getElements().clear();
                return;
            case CrossxPackage.MODEL_INFO__LAST_CHANGED:
                setLastChanged(LAST_CHANGED_EDEFAULT);
                return;
            case CrossxPackage.MODEL_INFO__NAME:
                setName(NAME_EDEFAULT);
                return;
            case CrossxPackage.MODEL_INFO__RESOURCE:
                setResource(RESOURCE_EDEFAULT);
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
            case CrossxPackage.MODEL_INFO__ELEMENTS:
                return elements != null && !elements.isEmpty();
            case CrossxPackage.MODEL_INFO__LAST_CHANGED:
                return LAST_CHANGED_EDEFAULT == null ? lastChanged != null : !LAST_CHANGED_EDEFAULT.equals(lastChanged);
            case CrossxPackage.MODEL_INFO__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case CrossxPackage.MODEL_INFO__RESOURCE:
                return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
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
        result.append(" (lastChanged: ");
        result.append(lastChanged);
        result.append(", name: ");
        result.append(name);
        result.append(", resource: ");
        result.append(resource);
        result.append(')');
        return result.toString();
    }

} //ModelInfoImpl
