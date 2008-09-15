/**
 * (c) Mod4j and contributors
 *
 * $Id$
 */
package org.mod4j.crossx.mm.crossx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.crossx.mm.crossx.Symbol#getName <em>Name</em>}</li>
 *   <li>{@link org.mod4j.crossx.mm.crossx.Symbol#getType <em>Type</em>}</li>
 *   <li>{@link org.mod4j.crossx.mm.crossx.Symbol#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mod4j.crossx.mm.crossx.Symbol#getSubSymbols <em>Sub Symbols</em>}</li>
 *   <li>{@link org.mod4j.crossx.mm.crossx.Symbol#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.crossx.mm.crossx.CrossxPackage#getSymbol()
 * @model
 * @generated
 */
public interface Symbol extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.mod4j.crossx.mm.crossx.CrossxPackage#getSymbol_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.mod4j.crossx.mm.crossx.Symbol#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.mod4j.crossx.mm.crossx.CrossxPackage#getSymbol_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.mod4j.crossx.mm.crossx.Symbol#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.crossx.mm.crossx.SymbolProperty}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see org.mod4j.crossx.mm.crossx.CrossxPackage#getSymbol_Properties()
     * @model containment="true"
     * @generated
     */
    EList<SymbolProperty> getProperties();

    /**
     * Returns the value of the '<em><b>Sub Symbols</b></em>' containment reference list.
     * The list contents are of type {@link org.mod4j.crossx.mm.crossx.Symbol}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Symbols</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Symbols</em>' containment reference list.
     * @see org.mod4j.crossx.mm.crossx.CrossxPackage#getSymbol_SubSymbols()
     * @model containment="true"
     * @generated
     */
    EList<Symbol> getSubSymbols();

    /**
     * Returns the value of the '<em><b>Owner</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mod4j.crossx.mm.crossx.ModelInfo#getSymbols <em>Symbols</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' container reference.
     * @see #setOwner(ModelInfo)
     * @see org.mod4j.crossx.mm.crossx.CrossxPackage#getSymbol_Owner()
     * @see org.mod4j.crossx.mm.crossx.ModelInfo#getSymbols
     * @model opposite="symbols" transient="false"
     * @generated
     */
    ModelInfo getOwner();

    /**
     * Sets the value of the '{@link org.mod4j.crossx.mm.crossx.Symbol#getOwner <em>Owner</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' container reference.
     * @see #getOwner()
     * @generated
     */
    void setOwner(ModelInfo value);

} // Symbol
