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
import mod4j.crossx.Property;

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
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mod4j.crossx.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link mod4j.crossx.impl.ElementImpl#getElemType <em>Elem Type</em>}</li>
 *   <li>{@link mod4j.crossx.impl.ElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link mod4j.crossx.impl.ElementImpl#getSubElements <em>Sub Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends EObjectImpl implements Element {
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
     * The default value of the '{@link #getElemType() <em>Elem Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElemType()
     * @generated
     * @ordered
     */
    protected static final String ELEM_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getElemType() <em>Elem Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElemType()
     * @generated
     * @ordered
     */
    protected String elemType = ELEM_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList<Property> properties;

    /**
     * The cached value of the '{@link #getSubElements() <em>Sub Elements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubElements()
     * @generated
     * @ordered
     */
    protected EList<Element> subElements;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CrossxPackage.Literals.ELEMENT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.ELEMENT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getElemType() {
        return elemType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElemType(String newElemType) {
        String oldElemType = elemType;
        elemType = newElemType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CrossxPackage.ELEMENT__ELEM_TYPE, oldElemType, elemType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<Property>(Property.class, this, CrossxPackage.ELEMENT__PROPERTIES);
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Element> getSubElements() {
        if (subElements == null) {
            subElements = new EObjectContainmentEList<Element>(Element.class, this, CrossxPackage.ELEMENT__SUB_ELEMENTS);
        }
        return subElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CrossxPackage.ELEMENT__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
            case CrossxPackage.ELEMENT__SUB_ELEMENTS:
                return ((InternalEList<?>)getSubElements()).basicRemove(otherEnd, msgs);
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
            case CrossxPackage.ELEMENT__NAME:
                return getName();
            case CrossxPackage.ELEMENT__ELEM_TYPE:
                return getElemType();
            case CrossxPackage.ELEMENT__PROPERTIES:
                return getProperties();
            case CrossxPackage.ELEMENT__SUB_ELEMENTS:
                return getSubElements();
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
            case CrossxPackage.ELEMENT__NAME:
                setName((String)newValue);
                return;
            case CrossxPackage.ELEMENT__ELEM_TYPE:
                setElemType((String)newValue);
                return;
            case CrossxPackage.ELEMENT__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends Property>)newValue);
                return;
            case CrossxPackage.ELEMENT__SUB_ELEMENTS:
                getSubElements().clear();
                getSubElements().addAll((Collection<? extends Element>)newValue);
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
            case CrossxPackage.ELEMENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case CrossxPackage.ELEMENT__ELEM_TYPE:
                setElemType(ELEM_TYPE_EDEFAULT);
                return;
            case CrossxPackage.ELEMENT__PROPERTIES:
                getProperties().clear();
                return;
            case CrossxPackage.ELEMENT__SUB_ELEMENTS:
                getSubElements().clear();
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
            case CrossxPackage.ELEMENT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case CrossxPackage.ELEMENT__ELEM_TYPE:
                return ELEM_TYPE_EDEFAULT == null ? elemType != null : !ELEM_TYPE_EDEFAULT.equals(elemType);
            case CrossxPackage.ELEMENT__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case CrossxPackage.ELEMENT__SUB_ELEMENTS:
                return subElements != null && !subElements.isEmpty();
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
        result.append(", elemType: ");
        result.append(elemType);
        result.append(')');
        return result.toString();
    }

} //ElementImpl
