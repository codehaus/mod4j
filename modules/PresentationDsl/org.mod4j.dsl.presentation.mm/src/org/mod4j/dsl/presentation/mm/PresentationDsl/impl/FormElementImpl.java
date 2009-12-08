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

import org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl#getDataProperty <em>Data Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormElementImpl extends ModelElementImpl implements FormElement {
    /**
     * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferences()
     * @generated
     * @ordered
     */
    protected DtoPropertyReference references;

    /**
     * The default value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isReadonly()
     * @generated
     * @ordered
     */
    protected static final boolean READONLY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isReadonly()
     * @generated
     * @ordered
     */
    protected boolean readonly = READONLY_EDEFAULT;

    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The cached value of the '{@link #getDataProperty() <em>Data Property</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataProperty()
     * @generated
     * @ordered
     */
    protected DataProperty dataProperty;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FormElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.FORM_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DtoPropertyReference getReferences() {
        return references;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReferences(DtoPropertyReference newReferences, NotificationChain msgs) {
        DtoPropertyReference oldReferences = references;
        references = newReferences;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationDslPackage.FORM_ELEMENT__REFERENCES, oldReferences, newReferences);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferences(DtoPropertyReference newReferences) {
        if (newReferences != references) {
            NotificationChain msgs = null;
            if (references != null)
                msgs = ((InternalEObject)references).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.FORM_ELEMENT__REFERENCES, null, msgs);
            if (newReferences != null)
                msgs = ((InternalEObject)newReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.FORM_ELEMENT__REFERENCES, null, msgs);
            msgs = basicSetReferences(newReferences, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.FORM_ELEMENT__REFERENCES, newReferences, newReferences));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isReadonly() {
        return readonly;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReadonly(boolean newReadonly) {
        boolean oldReadonly = readonly;
        readonly = newReadonly;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.FORM_ELEMENT__READONLY, oldReadonly, readonly));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContentForm getForm() {
        if (eContainerFeatureID() != PresentationDslPackage.FORM_ELEMENT__FORM) return null;
        return (ContentForm)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetForm(ContentForm newForm, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newForm, PresentationDslPackage.FORM_ELEMENT__FORM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setForm(ContentForm newForm) {
        if (newForm != eInternalContainer() || (eContainerFeatureID() != PresentationDslPackage.FORM_ELEMENT__FORM && newForm != null)) {
            if (EcoreUtil.isAncestor(this, newForm))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newForm != null)
                msgs = ((InternalEObject)newForm).eInverseAdd(this, PresentationDslPackage.CONTENT_FORM__FORM_ELEMENTS, ContentForm.class, msgs);
            msgs = basicSetForm(newForm, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.FORM_ELEMENT__FORM, newForm, newForm));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.FORM_ELEMENT__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataProperty getDataProperty() {
        return dataProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataProperty(DataProperty newDataProperty, NotificationChain msgs) {
        DataProperty oldDataProperty = dataProperty;
        dataProperty = newDataProperty;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationDslPackage.FORM_ELEMENT__DATA_PROPERTY, oldDataProperty, newDataProperty);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataProperty(DataProperty newDataProperty) {
        if (newDataProperty != dataProperty) {
            NotificationChain msgs = null;
            if (dataProperty != null)
                msgs = ((InternalEObject)dataProperty).eInverseRemove(this, PresentationDslPackage.DATA_PROPERTY__FORM_ELEMENT, DataProperty.class, msgs);
            if (newDataProperty != null)
                msgs = ((InternalEObject)newDataProperty).eInverseAdd(this, PresentationDslPackage.DATA_PROPERTY__FORM_ELEMENT, DataProperty.class, msgs);
            msgs = basicSetDataProperty(newDataProperty, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.FORM_ELEMENT__DATA_PROPERTY, newDataProperty, newDataProperty));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PresentationDslPackage.FORM_ELEMENT__FORM:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetForm((ContentForm)otherEnd, msgs);
            case PresentationDslPackage.FORM_ELEMENT__DATA_PROPERTY:
                if (dataProperty != null)
                    msgs = ((InternalEObject)dataProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.FORM_ELEMENT__DATA_PROPERTY, null, msgs);
                return basicSetDataProperty((DataProperty)otherEnd, msgs);
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
            case PresentationDslPackage.FORM_ELEMENT__REFERENCES:
                return basicSetReferences(null, msgs);
            case PresentationDslPackage.FORM_ELEMENT__FORM:
                return basicSetForm(null, msgs);
            case PresentationDslPackage.FORM_ELEMENT__DATA_PROPERTY:
                return basicSetDataProperty(null, msgs);
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
            case PresentationDslPackage.FORM_ELEMENT__FORM:
                return eInternalContainer().eInverseRemove(this, PresentationDslPackage.CONTENT_FORM__FORM_ELEMENTS, ContentForm.class, msgs);
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
            case PresentationDslPackage.FORM_ELEMENT__REFERENCES:
                return getReferences();
            case PresentationDslPackage.FORM_ELEMENT__READONLY:
                return isReadonly();
            case PresentationDslPackage.FORM_ELEMENT__FORM:
                return getForm();
            case PresentationDslPackage.FORM_ELEMENT__LABEL:
                return getLabel();
            case PresentationDslPackage.FORM_ELEMENT__DATA_PROPERTY:
                return getDataProperty();
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
            case PresentationDslPackage.FORM_ELEMENT__REFERENCES:
                setReferences((DtoPropertyReference)newValue);
                return;
            case PresentationDslPackage.FORM_ELEMENT__READONLY:
                setReadonly((Boolean)newValue);
                return;
            case PresentationDslPackage.FORM_ELEMENT__FORM:
                setForm((ContentForm)newValue);
                return;
            case PresentationDslPackage.FORM_ELEMENT__LABEL:
                setLabel((String)newValue);
                return;
            case PresentationDslPackage.FORM_ELEMENT__DATA_PROPERTY:
                setDataProperty((DataProperty)newValue);
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
            case PresentationDslPackage.FORM_ELEMENT__REFERENCES:
                setReferences((DtoPropertyReference)null);
                return;
            case PresentationDslPackage.FORM_ELEMENT__READONLY:
                setReadonly(READONLY_EDEFAULT);
                return;
            case PresentationDslPackage.FORM_ELEMENT__FORM:
                setForm((ContentForm)null);
                return;
            case PresentationDslPackage.FORM_ELEMENT__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case PresentationDslPackage.FORM_ELEMENT__DATA_PROPERTY:
                setDataProperty((DataProperty)null);
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
            case PresentationDslPackage.FORM_ELEMENT__REFERENCES:
                return references != null;
            case PresentationDslPackage.FORM_ELEMENT__READONLY:
                return readonly != READONLY_EDEFAULT;
            case PresentationDslPackage.FORM_ELEMENT__FORM:
                return getForm() != null;
            case PresentationDslPackage.FORM_ELEMENT__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case PresentationDslPackage.FORM_ELEMENT__DATA_PROPERTY:
                return dataProperty != null;
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
        result.append(" (readonly: ");
        result.append(readonly);
        result.append(", label: ");
        result.append(label);
        result.append(')');
        return result.toString();
    }

} //FormElementImpl
