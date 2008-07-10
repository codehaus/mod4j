/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.BusinessDomainModel#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessDomainModel#getTypes <em>Types</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessDomainModel#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessDomainModel()
 * @model
 * @generated
 */
public interface BusinessDomainModel extends ModelElement {
    /**
     * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
     * The list contents are of type {@link BusinessDomainDsl.Enumeration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enumerations</em>' containment reference list.
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessDomainModel_Enumerations()
     * @model containment="true"
     * @generated
     */
    EList<Enumeration> getEnumerations();

    /**
     * Returns the value of the '<em><b>Types</b></em>' containment reference list.
     * The list contents are of type {@link BusinessDomainDsl.AbstractType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Types</em>' containment reference list.
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessDomainModel_Types()
     * @model containment="true"
     * @generated
     */
    EList<AbstractType> getTypes();

    /**
     * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
     * The list contents are of type {@link BusinessDomainDsl.Association}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Associations</em>' containment reference list.
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessDomainModel_Associations()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Association> getAssociations();

} // BusinessDomainModel
