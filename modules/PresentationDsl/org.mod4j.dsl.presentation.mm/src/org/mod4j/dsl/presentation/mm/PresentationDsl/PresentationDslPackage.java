/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslFactory
 * @model kind="package"
 * @generated
 */
public interface PresentationDslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PresentationDsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mod4j.org/pmfmod";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pmfmod";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PresentationDslPackage eINSTANCE = org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ModelElementImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AssociationRoleReferenceImpl <em>Association Role Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AssociationRoleReferenceImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getAssociationRoleReference()
	 * @generated
	 */
	int ASSOCIATION_ROLE_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ROLE_REFERENCE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ROLE_REFERENCE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Association Role Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_ROLE_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ModelElementWithContextImpl <em>Model Element With Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ModelElementWithContextImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getModelElementWithContext()
	 * @generated
	 */
	int MODEL_ELEMENT_WITH_CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_WITH_CONTEXT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_WITH_CONTEXT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_WITH_CONTEXT__CONTEXT_REF = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_WITH_CONTEXT__COLLECTION_CONTEXT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Element With Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_WITH_CONTEXT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementImpl <em>UI Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getUIModelElement()
	 * @generated
	 */
	int UI_MODEL_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL_ELEMENT__NAME = MODEL_ELEMENT_WITH_CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL_ELEMENT__DESCRIPTION = MODEL_ELEMENT_WITH_CONTEXT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL_ELEMENT__CONTEXT_REF = MODEL_ELEMENT_WITH_CONTEXT__CONTEXT_REF;

	/**
	 * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL_ELEMENT__PRESENTATION_MODEL = MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL;

	/**
	 * The feature id for the '<em><b>Collection Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL_ELEMENT__COLLECTION_CONTEXT = MODEL_ELEMENT_WITH_CONTEXT__COLLECTION_CONTEXT;

	/**
	 * The number of structural features of the '<em>UI Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_WITH_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AbstractDialogueImpl <em>Abstract Dialogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AbstractDialogueImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getAbstractDialogue()
	 * @generated
	 */
	int ABSTRACT_DIALOGUE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOGUE__NAME = UI_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOGUE__DESCRIPTION = UI_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOGUE__CONTEXT_REF = UI_MODEL_ELEMENT__CONTEXT_REF;

	/**
	 * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOGUE__PRESENTATION_MODEL = UI_MODEL_ELEMENT__PRESENTATION_MODEL;

	/**
	 * The feature id for the '<em><b>Collection Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOGUE__COLLECTION_CONTEXT = UI_MODEL_ELEMENT__COLLECTION_CONTEXT;

	/**
	 * The number of structural features of the '<em>Abstract Dialogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIALOGUE_FEATURE_COUNT = UI_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ViewImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = ABSTRACT_DIALOGUE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DESCRIPTION = ABSTRACT_DIALOGUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CONTEXT_REF = ABSTRACT_DIALOGUE__CONTEXT_REF;

	/**
	 * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PRESENTATION_MODEL = ABSTRACT_DIALOGUE__PRESENTATION_MODEL;

	/**
	 * The feature id for the '<em><b>Collection Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__COLLECTION_CONTEXT = ABSTRACT_DIALOGUE__COLLECTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Form Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__FORM_ELEMENTS = ABSTRACT_DIALOGUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__BASE_VIEW = ABSTRACT_DIALOGUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ACTIONS = ABSTRACT_DIALOGUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = ABSTRACT_DIALOGUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DataPropertyImpl <em>Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DataPropertyImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDataProperty()
	 * @generated
	 */
	int DATA_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__DATA_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Enumeration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__IS_ENUMERATION = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Form Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__FORM_ELEMENT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__EDITABLE = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoPropertyReferenceImpl <em>Dto Property Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoPropertyReferenceImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDtoPropertyReference()
	 * @generated
	 */
	int DTO_PROPERTY_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_PROPERTY_REFERENCE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_PROPERTY_REFERENCE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_PROPERTY_REFERENCE__SUBNAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dto Property Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_PROPERTY_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference <em>External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__MODEL_NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl <em>Form Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getFormElement()
	 * @generated
	 */
	int FORM_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__REFERENCES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__READONLY = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__FORM = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__LABEL = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__DATA_PROPERTY = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Form Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationModelImpl <em>Presentation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationModelImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getPresentationModel()
	 * @generated
	 */
	int PRESENTATION_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_MODEL__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_MODEL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_MODEL__ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_MODEL__EXTERNAL_REFERENCES = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Main Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_MODEL__MAIN_MENU = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Presentation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_MODEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AbstractProcessImpl <em>Abstract Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AbstractProcessImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getAbstractProcess()
	 * @generated
	 */
	int ABSTRACT_PROCESS = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__NAME = UI_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__DESCRIPTION = UI_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__CONTEXT_REF = UI_MODEL_ELEMENT__CONTEXT_REF;

	/**
	 * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__PRESENTATION_MODEL = UI_MODEL_ELEMENT__PRESENTATION_MODEL;

	/**
	 * The feature id for the '<em><b>Collection Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__COLLECTION_CONTEXT = UI_MODEL_ELEMENT__COLLECTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__TYPE = UI_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__LABEL = UI_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS_FEATURE_COUNT = UI_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ActionImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = ABSTRACT_PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = ABSTRACT_PROCESS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTEXT_REF = ABSTRACT_PROCESS__CONTEXT_REF;

	/**
	 * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PRESENTATION_MODEL = ABSTRACT_PROCESS__PRESENTATION_MODEL;

	/**
	 * The feature id for the '<em><b>Collection Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COLLECTION_CONTEXT = ABSTRACT_PROCESS__COLLECTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = ABSTRACT_PROCESS__TYPE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LABEL = ABSTRACT_PROCESS__LABEL;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LINK = ABSTRACT_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NEXT_PAGE = ABSTRACT_PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONDITION = ABSTRACT_PROCESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTEXT_EXP = ABSTRACT_PROCESS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ARGUMENTS = ABSTRACT_PROCESS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VIEW = ABSTRACT_PROCESS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__MENU = ABSTRACT_PROCESS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ABSTRACT_PROCESS_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ExpressionImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ServiceExpressionImpl <em>Service Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ServiceExpressionImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getServiceExpression()
	 * @generated
	 */
	int SERVICE_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXPRESSION__DESCRIPTION = EXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXPRESSION__SERVICE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.NavigationExpressionImpl <em>Navigation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.NavigationExpressionImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getNavigationExpression()
	 * @generated
	 */
	int NAVIGATION_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EXPRESSION__DESCRIPTION = EXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EXPRESSION__REFERENCES = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.StandardExpressionImpl <em>Standard Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.StandardExpressionImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getStandardExpression()
	 * @generated
	 */
	int STANDARD_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EXPRESSION__DESCRIPTION = EXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EXPRESSION__CONTEXT_REF = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Standard Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.OperationExpressionImpl <em>Operation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.OperationExpressionImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getOperationExpression()
	 * @generated
	 */
	int OPERATION_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXPRESSION__DESCRIPTION = EXPRESSION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Operation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.MenuImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Start Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__START_ACTIONS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoReferenceImpl <em>Dto Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoReferenceImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDtoReference()
	 * @generated
	 */
	int DTO_REFERENCE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REFERENCE__NAME = EXTERNAL_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REFERENCE__DESCRIPTION = EXTERNAL_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REFERENCE__MODEL_NAME = EXTERNAL_REFERENCE__MODEL_NAME;

	/**
	 * The number of structural features of the '<em>Dto Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REFERENCE_FEATURE_COUNT = EXTERNAL_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ServiceReferenceImpl <em>Service Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ServiceReferenceImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getServiceReference()
	 * @generated
	 */
	int SERVICE_REFERENCE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REFERENCE__NAME = EXTERNAL_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REFERENCE__DESCRIPTION = EXTERNAL_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REFERENCE__MODEL_NAME = EXTERNAL_REFERENCE__MODEL_NAME;

	/**
	 * The number of structural features of the '<em>Service Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REFERENCE_FEATURE_COUNT = EXTERNAL_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PageImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = ABSTRACT_DIALOGUE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DESCRIPTION = ABSTRACT_DIALOGUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONTEXT_REF = ABSTRACT_DIALOGUE__CONTEXT_REF;

	/**
	 * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PRESENTATION_MODEL = ABSTRACT_DIALOGUE__PRESENTATION_MODEL;

	/**
	 * The feature id for the '<em><b>Collection Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__COLLECTION_CONTEXT = ABSTRACT_DIALOGUE__COLLECTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Dialogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DIALOGUE = ABSTRACT_DIALOGUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = ABSTRACT_DIALOGUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PageReferenceImpl <em>Page Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PageReferenceImpl
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getPageReference()
	 * @generated
	 */
	int PAGE_REFERENCE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFERENCE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFERENCE__DESCRIPTION = PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFERENCE__CONTEXT_REF = PAGE__CONTEXT_REF;

	/**
	 * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFERENCE__PRESENTATION_MODEL = PAGE__PRESENTATION_MODEL;

	/**
	 * The feature id for the '<em><b>Collection Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFERENCE__COLLECTION_CONTEXT = PAGE__COLLECTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Dialogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFERENCE__DIALOGUE = PAGE__DIALOGUE;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFERENCE__MODEL_NAME = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Page Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_REFERENCE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType <em>Process Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getProcessType()
	 * @generated
	 */
	int PROCESS_TYPE = 23;

	/**
	 * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType <em>Expression Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getExpressionType()
	 * @generated
	 */
	int EXPRESSION_TYPE = 24;


	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference <em>Association Role Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Role Reference</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference
	 * @generated
	 */
	EClass getAssociationRoleReference();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.View#getFormElements <em>Form Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Elements</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.View#getFormElements()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_FormElements();

	/**
	 * Returns the meta object for the reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.View#getBaseView <em>Base View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base View</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.View#getBaseView()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_BaseView();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.View#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.View#getActions()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Actions();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty
	 * @generated
	 */
	EClass getDataProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#getDataType()
	 * @see #getDataProperty()
	 * @generated
	 */
	EAttribute getDataProperty_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#isIsEnumeration <em>Is Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enumeration</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#isIsEnumeration()
	 * @see #getDataProperty()
	 * @generated
	 */
	EAttribute getDataProperty_IsEnumeration();

	/**
	 * Returns the meta object for the container reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#getFormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Form Element</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#getFormElement()
	 * @see #getDataProperty()
	 * @generated
	 */
	EReference getDataProperty_FormElement();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty#isEditable()
	 * @see #getDataProperty()
	 * @generated
	 */
	EAttribute getDataProperty_Editable();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference <em>Dto Property Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dto Property Reference</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference
	 * @generated
	 */
	EClass getDtoPropertyReference();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference#getSubname <em>Subname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subname</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference#getSubname()
	 * @see #getDtoPropertyReference()
	 * @generated
	 */
	EAttribute getDtoPropertyReference_Subname();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference
	 * @generated
	 */
	EClass getExternalReference();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference#getModelName()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_ModelName();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Element</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement
	 * @generated
	 */
	EClass getFormElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>References</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getReferences()
	 * @see #getFormElement()
	 * @generated
	 */
	EReference getFormElement_References();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#isReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#isReadonly()
	 * @see #getFormElement()
	 * @generated
	 */
	EAttribute getFormElement_Readonly();

	/**
	 * Returns the meta object for the container reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Form</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getForm()
	 * @see #getFormElement()
	 * @generated
	 */
	EReference getFormElement_Form();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getLabel()
	 * @see #getFormElement()
	 * @generated
	 */
	EAttribute getFormElement_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getDataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Property</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getDataProperty()
	 * @see #getFormElement()
	 * @generated
	 */
	EReference getFormElement_DataProperty();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext <em>Model Element With Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element With Context</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext
	 * @generated
	 */
	EClass getModelElementWithContext();

	/**
	 * Returns the meta object for the reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext#getContextRef <em>Context Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Ref</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext#getContextRef()
	 * @see #getModelElementWithContext()
	 * @generated
	 */
	EReference getModelElementWithContext_ContextRef();

	/**
	 * Returns the meta object for the container reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext#getPresentationModel <em>Presentation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Presentation Model</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext#getPresentationModel()
	 * @see #getModelElementWithContext()
	 * @generated
	 */
	EReference getModelElementWithContext_PresentationModel();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext#isCollectionContext <em>Collection Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Context</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext#isCollectionContext()
	 * @see #getModelElementWithContext()
	 * @generated
	 */
	EAttribute getModelElementWithContext_CollectionContext();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Description();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel <em>Presentation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation Model</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel
	 * @generated
	 */
	EClass getPresentationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getElements()
	 * @see #getPresentationModel()
	 * @generated
	 */
	EReference getPresentationModel_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External References</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getExternalReferences()
	 * @see #getPresentationModel()
	 * @generated
	 */
	EReference getPresentationModel_ExternalReferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getMainMenu <em>Main Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Menu</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getMainMenu()
	 * @see #getPresentationModel()
	 * @generated
	 */
	EReference getPresentationModel_MainMenu();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getLink()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Link();

	/**
	 * Returns the meta object for the reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getNextPage <em>Next Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Page</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getNextPage()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_NextPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getCondition()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getContextExp <em>Context Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Exp</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getContextExp()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ContextExp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getArguments()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Arguments();

	/**
	 * Returns the meta object for the container reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>View</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getView()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_View();

	/**
	 * Returns the meta object for the container reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Menu</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Action#getMenu()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Menu();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement <em>UI Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Model Element</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement
	 * @generated
	 */
	EClass getUIModelElement();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression <em>Service Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Expression</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression
	 * @generated
	 */
	EClass getServiceExpression();

	/**
	 * Returns the meta object for the reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression#getService()
	 * @see #getServiceExpression()
	 * @generated
	 */
	EReference getServiceExpression_Service();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression <em>Navigation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Expression</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression
	 * @generated
	 */
	EClass getNavigationExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression#getReferences()
	 * @see #getNavigationExpression()
	 * @generated
	 */
	EReference getNavigationExpression_References();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression <em>Standard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Expression</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression
	 * @generated
	 */
	EClass getStandardExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression#getType()
	 * @see #getStandardExpression()
	 * @generated
	 */
	EAttribute getStandardExpression_Type();

	/**
	 * Returns the meta object for the reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression#getContextRef <em>Context Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Ref</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression#getContextRef()
	 * @see #getStandardExpression()
	 * @generated
	 */
	EReference getStandardExpression_ContextRef();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.OperationExpression <em>Operation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Expression</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.OperationExpression
	 * @generated
	 */
	EClass getOperationExpression();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Menu#getStartActions <em>Start Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start Actions</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Menu#getStartActions()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_StartActions();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractProcess <em>Abstract Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Process</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractProcess
	 * @generated
	 */
	EClass getAbstractProcess();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractProcess#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractProcess#getType()
	 * @see #getAbstractProcess()
	 * @generated
	 */
	EAttribute getAbstractProcess_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractProcess#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractProcess#getLabel()
	 * @see #getAbstractProcess()
	 * @generated
	 */
	EAttribute getAbstractProcess_Label();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractDialogue <em>Abstract Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Dialogue</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractDialogue
	 * @generated
	 */
	EClass getAbstractDialogue();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DtoReference <em>Dto Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dto Reference</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DtoReference
	 * @generated
	 */
	EClass getDtoReference();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceReference <em>Service Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Reference</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceReference
	 * @generated
	 */
	EClass getServiceReference();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Page#getDialogue <em>Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dialogue</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Page#getDialogue()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Dialogue();

	/**
	 * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.PageReference <em>Page Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Reference</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PageReference
	 * @generated
	 */
	EClass getPageReference();

	/**
	 * Returns the meta object for enum '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType <em>Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Type</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType
	 * @generated
	 */
	EEnum getProcessType();

	/**
	 * Returns the meta object for enum '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Type</em>'.
	 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType
	 * @generated
	 */
	EEnum getExpressionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PresentationDslFactory getPresentationDslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AssociationRoleReferenceImpl <em>Association Role Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AssociationRoleReferenceImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getAssociationRoleReference()
		 * @generated
		 */
		EClass ASSOCIATION_ROLE_REFERENCE = eINSTANCE.getAssociationRoleReference();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ViewImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Form Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__FORM_ELEMENTS = eINSTANCE.getView_FormElements();

		/**
		 * The meta object literal for the '<em><b>Base View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__BASE_VIEW = eINSTANCE.getView_BaseView();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__ACTIONS = eINSTANCE.getView_Actions();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DataPropertyImpl <em>Data Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DataPropertyImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDataProperty()
		 * @generated
		 */
		EClass DATA_PROPERTY = eINSTANCE.getDataProperty();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROPERTY__DATA_TYPE = eINSTANCE.getDataProperty_DataType();

		/**
		 * The meta object literal for the '<em><b>Is Enumeration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROPERTY__IS_ENUMERATION = eINSTANCE.getDataProperty_IsEnumeration();

		/**
		 * The meta object literal for the '<em><b>Form Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY__FORM_ELEMENT = eINSTANCE.getDataProperty_FormElement();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROPERTY__EDITABLE = eINSTANCE.getDataProperty_Editable();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoPropertyReferenceImpl <em>Dto Property Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoPropertyReferenceImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDtoPropertyReference()
		 * @generated
		 */
		EClass DTO_PROPERTY_REFERENCE = eINSTANCE.getDtoPropertyReference();

		/**
		 * The meta object literal for the '<em><b>Subname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTO_PROPERTY_REFERENCE__SUBNAME = eINSTANCE.getDtoPropertyReference_Subname();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference <em>External Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getExternalReference()
		 * @generated
		 */
		EClass EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE__MODEL_NAME = eINSTANCE.getExternalReference_ModelName();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl <em>Form Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getFormElement()
		 * @generated
		 */
		EClass FORM_ELEMENT = eINSTANCE.getFormElement();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_ELEMENT__REFERENCES = eINSTANCE.getFormElement_References();

		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_ELEMENT__READONLY = eINSTANCE.getFormElement_Readonly();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_ELEMENT__FORM = eINSTANCE.getFormElement_Form();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_ELEMENT__LABEL = eINSTANCE.getFormElement_Label();

		/**
		 * The meta object literal for the '<em><b>Data Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_ELEMENT__DATA_PROPERTY = eINSTANCE.getFormElement_DataProperty();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ModelElementWithContextImpl <em>Model Element With Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ModelElementWithContextImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getModelElementWithContext()
		 * @generated
		 */
		EClass MODEL_ELEMENT_WITH_CONTEXT = eINSTANCE.getModelElementWithContext();

		/**
		 * The meta object literal for the '<em><b>Context Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_WITH_CONTEXT__CONTEXT_REF = eINSTANCE.getModelElementWithContext_ContextRef();

		/**
		 * The meta object literal for the '<em><b>Presentation Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL = eINSTANCE.getModelElementWithContext_PresentationModel();

		/**
		 * The meta object literal for the '<em><b>Collection Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_WITH_CONTEXT__COLLECTION_CONTEXT = eINSTANCE.getModelElementWithContext_CollectionContext();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ModelElementImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationModelImpl <em>Presentation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationModelImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getPresentationModel()
		 * @generated
		 */
		EClass PRESENTATION_MODEL = eINSTANCE.getPresentationModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_MODEL__ELEMENTS = eINSTANCE.getPresentationModel_Elements();

		/**
		 * The meta object literal for the '<em><b>External References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_MODEL__EXTERNAL_REFERENCES = eINSTANCE.getPresentationModel_ExternalReferences();

		/**
		 * The meta object literal for the '<em><b>Main Menu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_MODEL__MAIN_MENU = eINSTANCE.getPresentationModel_MainMenu();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ActionImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__LINK = eINSTANCE.getAction_Link();

		/**
		 * The meta object literal for the '<em><b>Next Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__NEXT_PAGE = eINSTANCE.getAction_NextPage();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONDITION = eINSTANCE.getAction_Condition();

		/**
		 * The meta object literal for the '<em><b>Context Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONTEXT_EXP = eINSTANCE.getAction_ContextExp();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ARGUMENTS = eINSTANCE.getAction_Arguments();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__VIEW = eINSTANCE.getAction_View();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__MENU = eINSTANCE.getAction_Menu();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementImpl <em>UI Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getUIModelElement()
		 * @generated
		 */
		EClass UI_MODEL_ELEMENT = eINSTANCE.getUIModelElement();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ServiceExpressionImpl <em>Service Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ServiceExpressionImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getServiceExpression()
		 * @generated
		 */
		EClass SERVICE_EXPRESSION = eINSTANCE.getServiceExpression();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_EXPRESSION__SERVICE = eINSTANCE.getServiceExpression_Service();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.NavigationExpressionImpl <em>Navigation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.NavigationExpressionImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getNavigationExpression()
		 * @generated
		 */
		EClass NAVIGATION_EXPRESSION = eINSTANCE.getNavigationExpression();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_EXPRESSION__REFERENCES = eINSTANCE.getNavigationExpression_References();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ExpressionImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.StandardExpressionImpl <em>Standard Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.StandardExpressionImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getStandardExpression()
		 * @generated
		 */
		EClass STANDARD_EXPRESSION = eINSTANCE.getStandardExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_EXPRESSION__TYPE = eINSTANCE.getStandardExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Context Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_EXPRESSION__CONTEXT_REF = eINSTANCE.getStandardExpression_ContextRef();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.OperationExpressionImpl <em>Operation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.OperationExpressionImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getOperationExpression()
		 * @generated
		 */
		EClass OPERATION_EXPRESSION = eINSTANCE.getOperationExpression();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.MenuImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Start Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__START_ACTIONS = eINSTANCE.getMenu_StartActions();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AbstractProcessImpl <em>Abstract Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AbstractProcessImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getAbstractProcess()
		 * @generated
		 */
		EClass ABSTRACT_PROCESS = eINSTANCE.getAbstractProcess();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROCESS__TYPE = eINSTANCE.getAbstractProcess_Type();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROCESS__LABEL = eINSTANCE.getAbstractProcess_Label();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AbstractDialogueImpl <em>Abstract Dialogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AbstractDialogueImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getAbstractDialogue()
		 * @generated
		 */
		EClass ABSTRACT_DIALOGUE = eINSTANCE.getAbstractDialogue();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoReferenceImpl <em>Dto Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoReferenceImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDtoReference()
		 * @generated
		 */
		EClass DTO_REFERENCE = eINSTANCE.getDtoReference();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ServiceReferenceImpl <em>Service Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ServiceReferenceImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getServiceReference()
		 * @generated
		 */
		EClass SERVICE_REFERENCE = eINSTANCE.getServiceReference();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PageImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Dialogue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__DIALOGUE = eINSTANCE.getPage_Dialogue();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PageReferenceImpl <em>Page Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PageReferenceImpl
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getPageReference()
		 * @generated
		 */
		EClass PAGE_REFERENCE = eINSTANCE.getPageReference();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType <em>Process Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getProcessType()
		 * @generated
		 */
		EEnum PROCESS_TYPE = eINSTANCE.getProcessType();

		/**
		 * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType <em>Expression Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType
		 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getExpressionType()
		 * @generated
		 */
		EEnum EXPRESSION_TYPE = eINSTANCE.getExpressionType();

	}

} //PresentationDslPackage
