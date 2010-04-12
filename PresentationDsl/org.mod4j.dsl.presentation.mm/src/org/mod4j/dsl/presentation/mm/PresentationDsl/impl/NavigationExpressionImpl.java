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

import org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.NavigationExpressionImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.NavigationExpressionImpl#isComposition <em>Composition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavigationExpressionImpl extends ExpressionImpl implements NavigationExpression {
    /**
     * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferences()
     * @generated
     * @ordered
     */
    protected EList<AssociationRoleReference> references;

    /**
     * The default value of the '{@link #isComposition() <em>Composition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isComposition()
     * @generated
     * @ordered
     */
    protected static final boolean COMPOSITION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isComposition() <em>Composition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isComposition()
     * @generated
     * @ordered
     */
    protected boolean composition = COMPOSITION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NavigationExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.NAVIGATION_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AssociationRoleReference> getReferences() {
        if (references == null) {
            references = new EObjectContainmentEList<AssociationRoleReference>(AssociationRoleReference.class, this, PresentationDslPackage.NAVIGATION_EXPRESSION__REFERENCES);
        }
        return references;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isComposition() {
        return composition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComposition(boolean newComposition) {
        boolean oldComposition = composition;
        composition = newComposition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.NAVIGATION_EXPRESSION__COMPOSITION, oldComposition, composition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PresentationDslPackage.NAVIGATION_EXPRESSION__REFERENCES:
                return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
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
            case PresentationDslPackage.NAVIGATION_EXPRESSION__REFERENCES:
                return getReferences();
            case PresentationDslPackage.NAVIGATION_EXPRESSION__COMPOSITION:
                return isComposition();
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
            case PresentationDslPackage.NAVIGATION_EXPRESSION__REFERENCES:
                getReferences().clear();
                getReferences().addAll((Collection<? extends AssociationRoleReference>)newValue);
                return;
            case PresentationDslPackage.NAVIGATION_EXPRESSION__COMPOSITION:
                setComposition((Boolean)newValue);
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
            case PresentationDslPackage.NAVIGATION_EXPRESSION__REFERENCES:
                getReferences().clear();
                return;
            case PresentationDslPackage.NAVIGATION_EXPRESSION__COMPOSITION:
                setComposition(COMPOSITION_EDEFAULT);
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
            case PresentationDslPackage.NAVIGATION_EXPRESSION__REFERENCES:
                return references != null && !references.isEmpty();
            case PresentationDslPackage.NAVIGATION_EXPRESSION__COMPOSITION:
                return composition != COMPOSITION_EDEFAULT;
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
        result.append(" (composition: ");
        result.append(composition);
        result.append(')');
        return result.toString();
    }

} //NavigationExpressionImpl
