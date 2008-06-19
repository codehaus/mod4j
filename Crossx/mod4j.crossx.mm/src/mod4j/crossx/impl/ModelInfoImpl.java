/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mod4j.crossx.impl;

import java.util.Collection;

import mod4j.crossx.CrossxPackage;
import mod4j.crossx.Element;
import mod4j.crossx.ModelInfo;
import mod4j.crossx.ModelReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mod4j.crossx.impl.ModelInfoImpl#getModel <em>Model</em>}</li>
 *   <li>{@link mod4j.crossx.impl.ModelInfoImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link mod4j.crossx.impl.ModelInfoImpl#getLastChanged <em>Last Changed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelInfoImpl extends EObjectImpl implements ModelInfo {
    /**
     * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected ModelReference model;

    /**
     * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElements()
     * @generated
     * @ordered
     */
    protected EList<Element> elements;

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
    public ModelReference getModel() {
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(ModelReference newModel, NotificationChain msgs) {
        ModelReference oldModel = model;
        model = newModel;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CrossxPackage.MODEL_INFO__MODEL, oldModel, newModel);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(ModelReference newModel) {
        if (newModel != model) {
            NotificationChain msgs = null;
            if (model != null)
                msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CrossxPackage.MODEL_INFO__MODEL, null, msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CrossxPackage.MODEL_INFO__MODEL, null, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.MODEL_INFO__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Element> getElements() {
        if (elements == null) {
            elements = new EObjectContainmentEList<Element>(Element.class, this, CrossxPackage.MODEL_INFO__ELEMENTS);
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
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CrossxPackage.MODEL_INFO__MODEL:
                return basicSetModel(null, msgs);
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
            case CrossxPackage.MODEL_INFO__MODEL:
                return getModel();
            case CrossxPackage.MODEL_INFO__ELEMENTS:
                return getElements();
            case CrossxPackage.MODEL_INFO__LAST_CHANGED:
                return getLastChanged();
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
            case CrossxPackage.MODEL_INFO__MODEL:
                setModel((ModelReference)newValue);
                return;
            case CrossxPackage.MODEL_INFO__ELEMENTS:
                getElements().clear();
                getElements().addAll((Collection<? extends Element>)newValue);
                return;
            case CrossxPackage.MODEL_INFO__LAST_CHANGED:
                setLastChanged((String)newValue);
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
            case CrossxPackage.MODEL_INFO__MODEL:
                setModel((ModelReference)null);
                return;
            case CrossxPackage.MODEL_INFO__ELEMENTS:
                getElements().clear();
                return;
            case CrossxPackage.MODEL_INFO__LAST_CHANGED:
                setLastChanged(LAST_CHANGED_EDEFAULT);
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
            case CrossxPackage.MODEL_INFO__MODEL:
                return model != null;
            case CrossxPackage.MODEL_INFO__ELEMENTS:
                return elements != null && !elements.isEmpty();
            case CrossxPackage.MODEL_INFO__LAST_CHANGED:
                return LAST_CHANGED_EDEFAULT == null ? lastChanged != null : !LAST_CHANGED_EDEFAULT.equals(lastChanged);
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
        result.append(')');
        return result.toString();
    }

} //ModelInfoImpl
