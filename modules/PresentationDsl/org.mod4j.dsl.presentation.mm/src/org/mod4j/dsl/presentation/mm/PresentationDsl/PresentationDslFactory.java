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
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Link Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Ref</em>'.
	 * @generated
	 */
	LinkRef createLinkRef();

	/**
	 * Returns a new object of class '<em>Named Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Reference</em>'.
	 * @generated
	 */
	NamedReference createNamedReference();

	/**
	 * Returns a new object of class '<em>Presentation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presentation Model</em>'.
	 * @generated
	 */
	PresentationModel createPresentationModel();

	/**
	 * Returns a new object of class '<em>Process Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Call</em>'.
	 * @generated
	 */
	ProcessCall createProcessCall();

	/**
	 * Returns a new object of class '<em>Dto Property Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dto Property Reference</em>'.
	 * @generated
	 */
	DtoPropertyReference createDtoPropertyReference();

	/**
	 * Returns a new object of class '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference</em>'.
	 * @generated
	 */
	ExternalReference createExternalReference();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>Content Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Form</em>'.
	 * @generated
	 */
	ContentForm createContentForm();

	/**
	 * Returns a new object of class '<em>Compound Dialogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Dialogue</em>'.
	 * @generated
	 */
	CompoundDialogue createCompoundDialogue();

	/**
	 * Returns a new object of class '<em>Collection Dialogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Dialogue</em>'.
	 * @generated
	 */
	CollectionDialogue createCollectionDialogue();

	/**
	 * Returns a new object of class '<em>Dialogue Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialogue Call</em>'.
	 * @generated
	 */
	DialogueCall createDialogueCall();

	/**
	 * Returns a new object of class '<em>Interactive Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interactive Process</em>'.
	 * @generated
	 */
	InteractiveProcess createInteractiveProcess();

	/**
	 * Returns a new object of class '<em>Automated Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automated Process</em>'.
	 * @generated
	 */
	AutomatedProcess createAutomatedProcess();

	/**
	 * Returns a new object of class '<em>Form Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Element</em>'.
	 * @generated
	 */
	FormElement createFormElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PresentationDslPackage getPresentationDslPackage();

} //PresentationDslFactory
