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
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl#getForm <em>Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormElementImpl extends EObjectImpl implements FormElement {
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
     * The cached value of the '{@link #getReferences() <em>References</em>}' reference.
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
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.FORM_ELEMENT__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoPropertyReference getReferences() {
        if (references != null && references.eIsProxy()) {
            InternalEObject oldReferences = (InternalEObject)references;
            references = (DtoPropertyReference)eResolveProxy(oldReferences);
            if (references != oldReferences) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationDslPackage.FORM_ELEMENT__REFERENCES, oldReferences, references));
            }
        }
        return references;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoPropertyReference basicGetReferences() {
        return references;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReferences(DtoPropertyReference newReferences) {
        DtoPropertyReference oldReferences = references;
        references = newReferences;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.FORM_ELEMENT__REFERENCES, oldReferences, references));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PresentationDslPackage.FORM_ELEMENT__FORM:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetForm((ContentForm)otherEnd, msgs);
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
            case PresentationDslPackage.FORM_ELEMENT__FORM:
                return basicSetForm(null, msgs);
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
            case PresentationDslPackage.FORM_ELEMENT__NAME:
                return getName();
            case PresentationDslPackage.FORM_ELEMENT__REFERENCES:
                if (resolve) return getReferences();
                return basicGetReferences();
            case PresentationDslPackage.FORM_ELEMENT__READONLY:
                return isReadonly();
            case PresentationDslPackage.FORM_ELEMENT__FORM:
                return getForm();
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
            case PresentationDslPackage.FORM_ELEMENT__NAME:
                setName((String)newValue);
                return;
            case PresentationDslPackage.FORM_ELEMENT__REFERENCES:
                setReferences((DtoPropertyReference)newValue);
                return;
            case PresentationDslPackage.FORM_ELEMENT__READONLY:
                setReadonly((Boolean)newValue);
                return;
            case PresentationDslPackage.FORM_ELEMENT__FORM:
                setForm((ContentForm)newValue);
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
            case PresentationDslPackage.FORM_ELEMENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case PresentationDslPackage.FORM_ELEMENT__REFERENCES:
                setReferences((DtoPropertyReference)null);
                return;
            case PresentationDslPackage.FORM_ELEMENT__READONLY:
                setReadonly(READONLY_EDEFAULT);
                return;
            case PresentationDslPackage.FORM_ELEMENT__FORM:
                setForm((ContentForm)null);
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
            case PresentationDslPackage.FORM_ELEMENT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case PresentationDslPackage.FORM_ELEMENT__REFERENCES:
                return references != null;
            case PresentationDslPackage.FORM_ELEMENT__READONLY:
                return readonly != READONLY_EDEFAULT;
            case PresentationDslPackage.FORM_ELEMENT__FORM:
                return getForm() != null;
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
        result.append(" (name: ");
        result.append(name);
        result.append(", readonly: ");
        result.append(readonly);
        result.append(')');
        return result.toString();
    }

} //FormElementImpl
