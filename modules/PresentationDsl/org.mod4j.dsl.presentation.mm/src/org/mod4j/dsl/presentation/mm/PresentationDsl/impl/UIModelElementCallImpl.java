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
import org.eclipse.emf.ecore.util.InternalEList;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Expression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Model Element Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementCallImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementCallImpl#getContextExp <em>Context Exp</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementCallImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIModelElementCallImpl extends UICallImpl implements UIModelElementCall {
    /**
     * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
    protected static final String ALIAS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
    protected String alias = ALIAS_EDEFAULT;

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
     * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArguments()
     * @generated
     * @ordered
     */
    protected EList<Expression> arguments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UIModelElementCallImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.UI_MODEL_ELEMENT_CALL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlias() {
        return alias;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlias(String newAlias) {
        String oldAlias = alias;
        alias = newAlias;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.UI_MODEL_ELEMENT_CALL__ALIAS, oldAlias, alias));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationDslPackage.UI_MODEL_ELEMENT_CALL__CONTEXT_EXP, oldContextExp, newContextExp);
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
                msgs = ((InternalEObject)contextExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.UI_MODEL_ELEMENT_CALL__CONTEXT_EXP, null, msgs);
            if (newContextExp != null)
                msgs = ((InternalEObject)newContextExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationDslPackage.UI_MODEL_ELEMENT_CALL__CONTEXT_EXP, null, msgs);
            msgs = basicSetContextExp(newContextExp, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.UI_MODEL_ELEMENT_CALL__CONTEXT_EXP, newContextExp, newContextExp));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Expression> getArguments() {
        if (arguments == null) {
            arguments = new EObjectContainmentEList<Expression>(Expression.class, this, PresentationDslPackage.UI_MODEL_ELEMENT_CALL__ARGUMENTS);
        }
        return arguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL__CONTEXT_EXP:
                return basicSetContextExp(null, msgs);
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL__ARGUMENTS:
                return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL__ALIAS:
                return getAlias();
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL__CONTEXT_EXP:
                return getContextExp();
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL__ARGUMENTS:
                return getArguments();
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
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL__ALIAS:
                setAlias((String)newValue);
                return;
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL__CONTEXT_EXP:
                setContextExp((Expression)newValue);
                return;
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL__ARGUMENTS:
                getArguments().clear();
                getArguments().addAll((Collection<? extends Expression>)newValue);
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
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL__ALIAS:
                setAlias(ALIAS_EDEFAULT);
                return;
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL__CONTEXT_EXP:
                setContextExp((Expression)null);
                return;
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL__ARGUMENTS:
                getArguments().clear();
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
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL__ALIAS:
                return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL__CONTEXT_EXP:
                return contextExp != null;
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL__ARGUMENTS:
                return arguments != null && !arguments.isEmpty();
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
        result.append(" (alias: ");
        result.append(alias);
        result.append(')');
        return result.toString();
    }

} //UIModelElementCallImpl
