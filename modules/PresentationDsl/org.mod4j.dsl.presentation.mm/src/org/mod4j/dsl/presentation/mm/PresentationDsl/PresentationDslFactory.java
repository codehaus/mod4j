/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage
 * @generated
 */
public interface PresentationDslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PresentationDslFactory eINSTANCE = org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Association Role Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Role Reference</em>'.
	 * @generated
	 */
	AssociationRoleReference createAssociationRoleReference();

	/**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

	/**
	 * Returns a new object of class '<em>Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Property</em>'.
	 * @generated
	 */
	DataProperty createDataProperty();

	/**
	 * Returns a new object of class '<em>Dto Property Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dto Property Reference</em>'.
	 * @generated
	 */
	DtoPropertyReference createDtoPropertyReference();

	/**
	 * Returns a new object of class '<em>Form Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Element</em>'.
	 * @generated
	 */
	FormElement createFormElement();

	/**
	 * Returns a new object of class '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element</em>'.
	 * @generated
	 */
	ModelElement createModelElement();

	/**
	 * Returns a new object of class '<em>Presentation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presentation Model</em>'.
	 * @generated
	 */
	PresentationModel createPresentationModel();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Service Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Expression</em>'.
	 * @generated
	 */
	ServiceExpression createServiceExpression();

	/**
	 * Returns a new object of class '<em>Navigation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Expression</em>'.
	 * @generated
	 */
	NavigationExpression createNavigationExpression();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Standard Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Expression</em>'.
	 * @generated
	 */
	StandardExpression createStandardExpression();

	/**
	 * Returns a new object of class '<em>Operation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Expression</em>'.
	 * @generated
	 */
	OperationExpression createOperationExpression();

	/**
	 * Returns a new object of class '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu</em>'.
	 * @generated
	 */
	Menu createMenu();

	/**
	 * Returns a new object of class '<em>Abstract Dialogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Dialogue</em>'.
	 * @generated
	 */
	AbstractDialogue createAbstractDialogue();

	/**
	 * Returns a new object of class '<em>Dto Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dto Reference</em>'.
	 * @generated
	 */
	DtoReference createDtoReference();

	/**
	 * Returns a new object of class '<em>Service Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Reference</em>'.
	 * @generated
	 */
	ServiceReference createServiceReference();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Page Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Reference</em>'.
	 * @generated
	 */
	PageReference createPageReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PresentationDslPackage getPresentationDslPackage();

} //PresentationDslFactory
