/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mod4j.crossx.broker.CrossxBroker;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UICall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessReferenceImpl#getModelName <em>Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessReferenceImpl extends AbstractProcessImpl implements ProcessReference {
    /**
     * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelName()
     * @generated
     * @ordered
     */
    protected static final String MODEL_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelName()
     * @generated
     * @ordered
     */
    protected String modelName = MODEL_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PresentationDslPackage.Literals.PROCESS_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModelName(String newModelName) {
        String oldModelName = modelName;
        modelName = newModelName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PresentationDslPackage.PROCESS_REFERENCE__MODEL_NAME, oldModelName, modelName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PresentationDslPackage.PROCESS_REFERENCE__MODEL_NAME:
                return getModelName();
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
            case PresentationDslPackage.PROCESS_REFERENCE__MODEL_NAME:
                setModelName((String)newValue);
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
            case PresentationDslPackage.PROCESS_REFERENCE__MODEL_NAME:
                setModelName(MODEL_NAME_EDEFAULT);
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
            case PresentationDslPackage.PROCESS_REFERENCE__MODEL_NAME:
                return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == ExternalReference.class) {
            switch (derivedFeatureID) {
                case PresentationDslPackage.PROCESS_REFERENCE__MODEL_NAME: return PresentationDslPackage.EXTERNAL_REFERENCE__MODEL_NAME;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == ExternalReference.class) {
            switch (baseFeatureID) {
                case PresentationDslPackage.EXTERNAL_REFERENCE__MODEL_NAME: return PresentationDslPackage.PROCESS_REFERENCE__MODEL_NAME;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (modelName: ");
        result.append(modelName);
        result.append(')');
        return result.toString();
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NO
     */
    public boolean isInteractive() {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NO
     */
    @Override
    public boolean isCollectionContext() {
        Symbol sym = CrossxBroker.lookupSymbol(modelName, name, "Process");
        String value = CrossxBroker.getPropertyValue(sym, "isCollectionContext");
        return value.equals("true");
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NO
     */
    @Override
    public ProcessType getType() {
        Symbol sym = CrossxBroker.lookupSymbol(modelName, name, "Process");
        String value = CrossxBroker.getPropertyValue(sym, "processType");
        return ProcessType.get(value);
    }


} //ProcessReferenceImpl
