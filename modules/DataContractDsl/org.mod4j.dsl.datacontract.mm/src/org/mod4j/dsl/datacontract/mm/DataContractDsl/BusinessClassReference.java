/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Class Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference#getModelname <em>Modelname</em>}</li>
 *   <li>{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference#getDatacontractModel <em>Datacontract Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassReference()
 * @model
 * @generated
 */
public interface BusinessClassReference extends ModelElement {
    /**
     * Returns the value of the '<em><b>Modelname</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modelname</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modelname</em>' attribute.
     * @see #setModelname(String)
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassReference_Modelname()
     * @model default=""
     * @generated
     */
    String getModelname();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference#getModelname <em>Modelname</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modelname</em>' attribute.
     * @see #getModelname()
     * @generated
     */
    void setModelname(String value);

    /**
     * Returns the value of the '<em><b>Datacontract Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel#getBusinessClasses <em>Business Classes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Datacontract Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Datacontract Model</em>' container reference.
     * @see #setDatacontractModel(DataContractModel)
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage#getBusinessClassReference_DatacontractModel()
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel#getBusinessClasses
     * @model opposite="businessClasses" transient="false"
     * @generated
     */
    DataContractModel getDatacontractModel();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference#getDatacontractModel <em>Datacontract Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Datacontract Model</em>' container reference.
     * @see #getDatacontractModel()
     * @generated
     */
    void setDatacontractModel(DataContractModel value);

} // BusinessClassReference
