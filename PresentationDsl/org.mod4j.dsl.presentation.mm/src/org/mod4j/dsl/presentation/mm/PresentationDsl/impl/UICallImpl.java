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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Expression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UICall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UICallImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UICallImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UICallImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UICallImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UICallImpl#getContextExp <em>Context Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UICallImpl extends ModelElementImpl implements UICall {
    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected Expression condition;

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
     * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArguments()
     * @generated
     * @ordered
     */
    protected EList<Expression> arguments;

    /**
     * The cached value of the '{@link #getContextExp() <em>Context Exp</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextExp()
     * @generated
     * @ordered
     */
    protected Expression contextExp;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UICallImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.UI_CALL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.mod4j.dsl.presentation.mm.PresentationDsl.Process getProcess() {
        if (eContainerFeatureID() != PresentationDslPackage.UI_CALL__PROCESS) return null;
        return (org.mod4j.dsl.presentation.mm.PresentationDsl.Process)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProcess(org.mod4j.dsl.presentation.mm.PresentationDsl.Process newProcess, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newProcess, PresentationDslPackage.UI_CALL__PROCESS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcess(org.mod4j.dsl.presentation.mm.PresentationDsl.Process newProcess) {
        if (newProcess != eInternalContainer() || (eContainerFeatureID() != PresentationDslPackage.UI_CALL__PROCESS && newProcess != null)) {
            if (EcoreUtil.isAncestor(this, newProcess))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newProcess != null)
                msgs = ((InternalEObject)newProcess).eInverseAdd(this, PresentationDslPackage.PROCESS__PROCESS_ELEMENTS, org.mod4j.dsl.presentation.mm.PresentationDsl.Process.class, msgs);
            msgs = basicSetProcess(newProcess, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.UI_CALL__PROCESS, newProcess, newProcess));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
        Expression oldCondition = condition;
        condition = newCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationDslPackage.UI_CALL__CONDITION, oldCondition, newCondition);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCondition(Expression newCondition) {
        if (newCondition != condition) {
            NotificationChain msgs = null;
            if (condition != null)
                msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.UI_CALL__CONDITION, null, msgs);
            if (newCondition != null)
                msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.UI_CALL__CONDITION, null, msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.UI_CALL__CONDITION, newCondition, newCondition));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.UI_CALL__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Expression> getArguments() {
        if (arguments == null) {
            arguments = new EObjectContainmentEList<Expression>(Expression.class, this, PresentationDslPackage.UI_CALL__ARGUMENTS);
        }
        return arguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getContextExp() {
        return contextExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContextExp(Expression newContextExp, NotificationChain msgs) {
        Expression oldContextExp = contextExp;
        contextExp = newContextExp;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationDslPackage.UI_CALL__CONTEXT_EXP, oldContextExp, newContextExp);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextExp(Expression newContextExp) {
        if (newContextExp != contextExp) {
            NotificationChain msgs = null;
            if (contextExp != null)
                msgs = ((InternalEObject)contextExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.UI_CALL__CONTEXT_EXP, null, msgs);
            if (newContextExp != null)
                msgs = ((InternalEObject)newContextExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.UI_CALL__CONTEXT_EXP, null, msgs);
            msgs = basicSetContextExp(newContextExp, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.UI_CALL__CONTEXT_EXP, newContextExp, newContextExp));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NO
     */
    public ProcessCall asProcessCall() {
        if( this instanceof ProcessCall ){
            return (ProcessCall) this;
        } else {
            return null;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NO
     */
    public DialogueCall asDialogueCall() {
        if( this instanceof DialogueCall ){
            return (DialogueCall) this;
        } else {
            return null;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PresentationDslPackage.UI_CALL__PROCESS:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetProcess((org.mod4j.dsl.presentation.mm.PresentationDsl.Process)otherEnd, msgs);
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
            case PresentationDslPackage.UI_CALL__PROCESS:
                return basicSetProcess(null, msgs);
            case PresentationDslPackage.UI_CALL__CONDITION:
                return basicSetCondition(null, msgs);
            case PresentationDslPackage.UI_CALL__ARGUMENTS:
                return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
            case PresentationDslPackage.UI_CALL__CONTEXT_EXP:
                return basicSetContextExp(null, msgs);
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
            case PresentationDslPackage.UI_CALL__PROCESS:
                return eInternalContainer().eInverseRemove(this, PresentationDslPackage.PROCESS__PROCESS_ELEMENTS, org.mod4j.dsl.presentation.mm.PresentationDsl.Process.class, msgs);
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
            case PresentationDslPackage.UI_CALL__PROCESS:
                return getProcess();
            case PresentationDslPackage.UI_CALL__CONDITION:
                return getCondition();
            case PresentationDslPackage.UI_CALL__LABEL:
                return getLabel();
            case PresentationDslPackage.UI_CALL__ARGUMENTS:
                return getArguments();
            case PresentationDslPackage.UI_CALL__CONTEXT_EXP:
                return getContextExp();
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
            case PresentationDslPackage.UI_CALL__PROCESS:
                setProcess((org.mod4j.dsl.presentation.mm.PresentationDsl.Process)newValue);
                return;
            case PresentationDslPackage.UI_CALL__CONDITION:
                setCondition((Expression)newValue);
                return;
            case PresentationDslPackage.UI_CALL__LABEL:
                setLabel((String)newValue);
                return;
            case PresentationDslPackage.UI_CALL__ARGUMENTS:
                getArguments().clear();
                getArguments().addAll((Collection<? extends Expression>)newValue);
                return;
            case PresentationDslPackage.UI_CALL__CONTEXT_EXP:
                setContextExp((Expression)newValue);
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
            case PresentationDslPackage.UI_CALL__PROCESS:
                setProcess((org.mod4j.dsl.presentation.mm.PresentationDsl.Process)null);
                return;
            case PresentationDslPackage.UI_CALL__CONDITION:
                setCondition((Expression)null);
                return;
            case PresentationDslPackage.UI_CALL__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case PresentationDslPackage.UI_CALL__ARGUMENTS:
                getArguments().clear();
                return;
            case PresentationDslPackage.UI_CALL__CONTEXT_EXP:
                setContextExp((Expression)null);
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
            case PresentationDslPackage.UI_CALL__PROCESS:
                return getProcess() != null;
            case PresentationDslPackage.UI_CALL__CONDITION:
                return condition != null;
            case PresentationDslPackage.UI_CALL__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case PresentationDslPackage.UI_CALL__ARGUMENTS:
                return arguments != null && !arguments.isEmpty();
            case PresentationDslPackage.UI_CALL__CONTEXT_EXP:
                return contextExp != null;
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
        result.append(" (label: ");
        result.append(label);
        result.append(')');
        return result.toString();
    }

} //UICallImpl
