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
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType;
import org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.SimpleProcessImpl#getDialogue <em>Dialogue</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.SimpleProcessImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.SimpleProcessImpl#getContentForm <em>Content Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleProcessImpl extends ModelElementImpl implements SimpleProcess {
    /**
     * The cached value of the '{@link #getDialogue() <em>Dialogue</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDialogue()
     * @generated
     * @ordered
     */
    protected DialogueCall dialogue;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final ProcessType TYPE_EDEFAULT = ProcessType.CUSTOM;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ProcessType type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SimpleProcessImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.SIMPLE_PROCESS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DialogueCall getDialogue() {
        return dialogue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDialogue(DialogueCall newDialogue, NotificationChain msgs) {
        DialogueCall oldDialogue = dialogue;
        dialogue = newDialogue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE, oldDialogue, newDialogue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDialogue(DialogueCall newDialogue) {
        if (newDialogue != dialogue) {
            NotificationChain msgs = null;
            if (dialogue != null)
                msgs = ((InternalEObject)dialogue).eInverseRemove(this, PresentationDslPackage.DIALOGUE_CALL__CALLING_SIMPLE_PROCESS, DialogueCall.class, msgs);
            if (newDialogue != null)
                msgs = ((InternalEObject)newDialogue).eInverseAdd(this, PresentationDslPackage.DIALOGUE_CALL__CALLING_SIMPLE_PROCESS, DialogueCall.class, msgs);
            msgs = basicSetDialogue(newDialogue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE, newDialogue, newDialogue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(ProcessType newType) {
        ProcessType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.SIMPLE_PROCESS__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContentForm getContentForm() {
        if (eContainerFeatureID() != PresentationDslPackage.SIMPLE_PROCESS__CONTENT_FORM) return null;
        return (ContentForm)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContentForm(ContentForm newContentForm, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContentForm, PresentationDslPackage.SIMPLE_PROCESS__CONTENT_FORM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContentForm(ContentForm newContentForm) {
        if (newContentForm != eInternalContainer() || (eContainerFeatureID() != PresentationDslPackage.SIMPLE_PROCESS__CONTENT_FORM && newContentForm != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.SIMPLE_PROCESS__CONTENT_FORM, newContentForm, newContentForm));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE:
                if (dialogue != null)
                    msgs = ((InternalEObject)dialogue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE, null, msgs);
                return basicSetDialogue((DialogueCall)otherEnd, msgs);
            case PresentationDslPackage.SIMPLE_PROCESS__CONTENT_FORM:
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
            case PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE:
                return basicSetDialogue(null, msgs);
            case PresentationDslPackage.SIMPLE_PROCESS__CONTENT_FORM:
                return basicSetContentForm(null, msgs);
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
            case PresentationDslPackage.SIMPLE_PROCESS__CONTENT_FORM:
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
            case PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE:
                return getDialogue();
            case PresentationDslPackage.SIMPLE_PROCESS__TYPE:
                return getType();
            case PresentationDslPackage.SIMPLE_PROCESS__CONTENT_FORM:
                return getContentForm();
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
            case PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE:
                setDialogue((DialogueCall)newValue);
                return;
            case PresentationDslPackage.SIMPLE_PROCESS__TYPE:
                setType((ProcessType)newValue);
                return;
            case PresentationDslPackage.SIMPLE_PROCESS__CONTENT_FORM:
                setContentForm((ContentForm)newValue);
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
            case PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE:
                setDialogue((DialogueCall)null);
                return;
            case PresentationDslPackage.SIMPLE_PROCESS__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case PresentationDslPackage.SIMPLE_PROCESS__CONTENT_FORM:
                setContentForm((ContentForm)null);
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
            case PresentationDslPackage.SIMPLE_PROCESS__DIALOGUE:
                return dialogue != null;
            case PresentationDslPackage.SIMPLE_PROCESS__TYPE:
                return type != TYPE_EDEFAULT;
            case PresentationDslPackage.SIMPLE_PROCESS__CONTENT_FORM:
                return getContentForm() != null;
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
        result.append(" (type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //SimpleProcessImpl
