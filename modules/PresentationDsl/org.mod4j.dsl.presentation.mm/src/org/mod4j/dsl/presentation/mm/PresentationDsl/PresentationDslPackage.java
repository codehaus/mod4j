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
    int MODEL_ELEMENT = 12;

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
    int MODEL_ELEMENT_WITH_CONTEXT = 11;

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
    int UI_MODEL_ELEMENT = 16;

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
    int ABSTRACT_DIALOGUE = 27;

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
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DialogueImpl <em>Dialogue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DialogueImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDialogue()
     * @generated
     */
    int DIALOGUE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE__NAME = ABSTRACT_DIALOGUE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE__DESCRIPTION = ABSTRACT_DIALOGUE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE__CONTEXT_REF = ABSTRACT_DIALOGUE__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE__PRESENTATION_MODEL = ABSTRACT_DIALOGUE__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Collection Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE__COLLECTION_CONTEXT = ABSTRACT_DIALOGUE__COLLECTION_CONTEXT;

    /**
     * The feature id for the '<em><b>Readonly</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE__READONLY = ABSTRACT_DIALOGUE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Processes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE__PROCESSES = ABSTRACT_DIALOGUE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Dialogue</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_FEATURE_COUNT = ABSTRACT_DIALOGUE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ContentFormImpl <em>Content Form</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ContentFormImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getContentForm()
     * @generated
     */
    int CONTENT_FORM = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT_FORM__NAME = DIALOGUE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT_FORM__DESCRIPTION = DIALOGUE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT_FORM__CONTEXT_REF = DIALOGUE__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT_FORM__PRESENTATION_MODEL = DIALOGUE__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Collection Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT_FORM__COLLECTION_CONTEXT = DIALOGUE__COLLECTION_CONTEXT;

    /**
     * The feature id for the '<em><b>Readonly</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT_FORM__READONLY = DIALOGUE__READONLY;

    /**
     * The feature id for the '<em><b>Processes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT_FORM__PROCESSES = DIALOGUE__PROCESSES;

    /**
     * The feature id for the '<em><b>Form Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT_FORM__FORM_ELEMENTS = DIALOGUE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT_FORM__ACTIONS = DIALOGUE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Content Form</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT_FORM_FEATURE_COUNT = DIALOGUE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.CompoundDialogueImpl <em>Compound Dialogue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.CompoundDialogueImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getCompoundDialogue()
     * @generated
     */
    int COMPOUND_DIALOGUE = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOUND_DIALOGUE__NAME = DIALOGUE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOUND_DIALOGUE__DESCRIPTION = DIALOGUE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOUND_DIALOGUE__CONTEXT_REF = DIALOGUE__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOUND_DIALOGUE__PRESENTATION_MODEL = DIALOGUE__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Collection Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOUND_DIALOGUE__COLLECTION_CONTEXT = DIALOGUE__COLLECTION_CONTEXT;

    /**
     * The feature id for the '<em><b>Readonly</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOUND_DIALOGUE__READONLY = DIALOGUE__READONLY;

    /**
     * The feature id for the '<em><b>Processes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOUND_DIALOGUE__PROCESSES = DIALOGUE__PROCESSES;

    /**
     * The feature id for the '<em><b>Dialogues</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOUND_DIALOGUE__DIALOGUES = DIALOGUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Compound Dialogue</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOUND_DIALOGUE_FEATURE_COUNT = DIALOGUE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.CollectionDialogueImpl <em>Collection Dialogue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.CollectionDialogueImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getCollectionDialogue()
     * @generated
     */
    int COLLECTION_DIALOGUE = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLECTION_DIALOGUE__NAME = COMPOUND_DIALOGUE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLECTION_DIALOGUE__DESCRIPTION = COMPOUND_DIALOGUE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLECTION_DIALOGUE__CONTEXT_REF = COMPOUND_DIALOGUE__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLECTION_DIALOGUE__PRESENTATION_MODEL = COMPOUND_DIALOGUE__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Collection Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLECTION_DIALOGUE__COLLECTION_CONTEXT = COMPOUND_DIALOGUE__COLLECTION_CONTEXT;

    /**
     * The feature id for the '<em><b>Readonly</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLECTION_DIALOGUE__READONLY = COMPOUND_DIALOGUE__READONLY;

    /**
     * The feature id for the '<em><b>Processes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLECTION_DIALOGUE__PROCESSES = COMPOUND_DIALOGUE__PROCESSES;

    /**
     * The feature id for the '<em><b>Dialogues</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLECTION_DIALOGUE__DIALOGUES = COMPOUND_DIALOGUE__DIALOGUES;

    /**
     * The number of structural features of the '<em>Collection Dialogue</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLECTION_DIALOGUE_FEATURE_COUNT = COMPOUND_DIALOGUE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DataPropertyImpl <em>Data Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DataPropertyImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDataProperty()
     * @generated
     */
    int DATA_PROPERTY = 4;

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
     * The number of structural features of the '<em>Data Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PROPERTY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UICallImpl <em>UI Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UICallImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getUICall()
     * @generated
     */
    int UI_CALL = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UI_CALL__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UI_CALL__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UI_CALL__PROCESS = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UI_CALL__CONDITION = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UI_CALL__LABEL = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UI_CALL__ARGUMENTS = MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Context Exp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UI_CALL__CONTEXT_EXP = MODEL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>UI Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UI_CALL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DialogueCallImpl <em>Dialogue Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DialogueCallImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDialogueCall()
     * @generated
     */
    int DIALOGUE_CALL = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_CALL__NAME = UI_CALL__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_CALL__DESCRIPTION = UI_CALL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_CALL__PROCESS = UI_CALL__PROCESS;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_CALL__CONDITION = UI_CALL__CONDITION;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_CALL__LABEL = UI_CALL__LABEL;

    /**
     * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_CALL__ARGUMENTS = UI_CALL__ARGUMENTS;

    /**
     * The feature id for the '<em><b>Context Exp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_CALL__CONTEXT_EXP = UI_CALL__CONTEXT_EXP;

    /**
     * The feature id for the '<em><b>Compound Dialogue</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_CALL__COMPOUND_DIALOGUE = UI_CALL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Referred Dialogue</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_CALL__REFERRED_DIALOGUE = UI_CALL_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Dialogue Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_CALL_FEATURE_COUNT = UI_CALL_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoPropertyReferenceImpl <em>Dto Property Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoPropertyReferenceImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDtoPropertyReference()
     * @generated
     */
    int DTO_PROPERTY_REFERENCE = 7;

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
     * The number of structural features of the '<em>Dto Property Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DTO_PROPERTY_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference <em>External Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getExternalReference()
     * @generated
     */
    int EXTERNAL_REFERENCE = 8;

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
    int FORM_ELEMENT = 9;

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
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.MasterDetailImpl <em>Master Detail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.MasterDetailImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getMasterDetail()
     * @generated
     */
    int MASTER_DETAIL = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_DETAIL__NAME = COMPOUND_DIALOGUE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_DETAIL__DESCRIPTION = COMPOUND_DIALOGUE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_DETAIL__CONTEXT_REF = COMPOUND_DIALOGUE__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_DETAIL__PRESENTATION_MODEL = COMPOUND_DIALOGUE__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Collection Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_DETAIL__COLLECTION_CONTEXT = COMPOUND_DIALOGUE__COLLECTION_CONTEXT;

    /**
     * The feature id for the '<em><b>Readonly</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_DETAIL__READONLY = COMPOUND_DIALOGUE__READONLY;

    /**
     * The feature id for the '<em><b>Processes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_DETAIL__PROCESSES = COMPOUND_DIALOGUE__PROCESSES;

    /**
     * The feature id for the '<em><b>Dialogues</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_DETAIL__DIALOGUES = COMPOUND_DIALOGUE__DIALOGUES;

    /**
     * The feature id for the '<em><b>Master</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_DETAIL__MASTER = COMPOUND_DIALOGUE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Detail</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_DETAIL__DETAIL = COMPOUND_DIALOGUE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Master Detail</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTER_DETAIL_FEATURE_COUNT = COMPOUND_DIALOGUE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationModelImpl <em>Presentation Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationModelImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getPresentationModel()
     * @generated
     */
    int PRESENTATION_MODEL = 13;

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
     * The feature id for the '<em><b>Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_MODEL__START = MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Presentation Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENTATION_MODEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getProcess()
     * @generated
     */
    int PROCESS = 14;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessCallImpl <em>Process Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessCallImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getProcessCall()
     * @generated
     */
    int PROCESS_CALL = 15;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ExpressionImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getExpression()
     * @generated
     */
    int EXPRESSION = 20;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ServiceExpressionImpl <em>Service Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ServiceExpressionImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getServiceExpression()
     * @generated
     */
    int SERVICE_EXPRESSION = 18;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.NavigationExpressionImpl <em>Navigation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.NavigationExpressionImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getNavigationExpression()
     * @generated
     */
    int NAVIGATION_EXPRESSION = 19;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.StandardExpressionImpl <em>Standard Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.StandardExpressionImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getStandardExpression()
     * @generated
     */
    int STANDARD_EXPRESSION = 21;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.OperationExpressionImpl <em>Operation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.OperationExpressionImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getOperationExpression()
     * @generated
     */
    int OPERATION_EXPRESSION = 22;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ApplicationImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getApplication()
     * @generated
     */
    int APPLICATION = 23;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AbstractProcessImpl <em>Abstract Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AbstractProcessImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getAbstractProcess()
     * @generated
     */
    int ABSTRACT_PROCESS = 25;

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
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__NAME = ABSTRACT_PROCESS__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__DESCRIPTION = ABSTRACT_PROCESS__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__CONTEXT_REF = ABSTRACT_PROCESS__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__PRESENTATION_MODEL = ABSTRACT_PROCESS__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Collection Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__COLLECTION_CONTEXT = ABSTRACT_PROCESS__COLLECTION_CONTEXT;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__TYPE = ABSTRACT_PROCESS__TYPE;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__LABEL = ABSTRACT_PROCESS__LABEL;

    /**
     * The feature id for the '<em><b>Process Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__PROCESS_ELEMENTS = ABSTRACT_PROCESS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Content Form</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__CONTENT_FORM = ABSTRACT_PROCESS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Link</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__LINK = ABSTRACT_PROCESS_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Process</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_FEATURE_COUNT = ABSTRACT_PROCESS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_CALL__NAME = UI_CALL__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_CALL__DESCRIPTION = UI_CALL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_CALL__PROCESS = UI_CALL__PROCESS;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_CALL__CONDITION = UI_CALL__CONDITION;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_CALL__LABEL = UI_CALL__LABEL;

    /**
     * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_CALL__ARGUMENTS = UI_CALL__ARGUMENTS;

    /**
     * The feature id for the '<em><b>Context Exp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_CALL__CONTEXT_EXP = UI_CALL__CONTEXT_EXP;

    /**
     * The feature id for the '<em><b>Owning Dialogue</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_CALL__OWNING_DIALOGUE = UI_CALL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Referred Process</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_CALL__REFERRED_PROCESS = UI_CALL_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Process Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_CALL_FEATURE_COUNT = UI_CALL_FEATURE_COUNT + 2;

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
     * The feature id for the '<em><b>Service Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_EXPRESSION__SERVICE_NAME = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Service Method</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_EXPRESSION__SERVICE_METHOD = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Service Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

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
     * The feature id for the '<em><b>Composition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION_EXPRESSION__COMPOSITION = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Navigation Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

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
     * The number of structural features of the '<em>Standard Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDARD_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

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
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Start Processes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__START_PROCESSES = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessReferenceImpl <em>Process Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessReferenceImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getProcessReference()
     * @generated
     */
    int PROCESS_REFERENCE = 24;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_REFERENCE__NAME = ABSTRACT_PROCESS__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_REFERENCE__DESCRIPTION = ABSTRACT_PROCESS__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_REFERENCE__CONTEXT_REF = ABSTRACT_PROCESS__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_REFERENCE__PRESENTATION_MODEL = ABSTRACT_PROCESS__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Collection Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_REFERENCE__COLLECTION_CONTEXT = ABSTRACT_PROCESS__COLLECTION_CONTEXT;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_REFERENCE__TYPE = ABSTRACT_PROCESS__TYPE;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_REFERENCE__LABEL = ABSTRACT_PROCESS__LABEL;

    /**
     * The feature id for the '<em><b>Model Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_REFERENCE__MODEL_NAME = ABSTRACT_PROCESS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Process Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_REFERENCE_FEATURE_COUNT = ABSTRACT_PROCESS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DialogueReferenceImpl <em>Dialogue Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DialogueReferenceImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDialogueReference()
     * @generated
     */
    int DIALOGUE_REFERENCE = 26;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_REFERENCE__NAME = ABSTRACT_DIALOGUE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_REFERENCE__DESCRIPTION = ABSTRACT_DIALOGUE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_REFERENCE__CONTEXT_REF = ABSTRACT_DIALOGUE__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_REFERENCE__PRESENTATION_MODEL = ABSTRACT_DIALOGUE__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Collection Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_REFERENCE__COLLECTION_CONTEXT = ABSTRACT_DIALOGUE__COLLECTION_CONTEXT;

    /**
     * The feature id for the '<em><b>Model Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_REFERENCE__MODEL_NAME = ABSTRACT_DIALOGUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dialogue Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_REFERENCE_FEATURE_COUNT = ABSTRACT_DIALOGUE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoReferenceImpl <em>Dto Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoReferenceImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDtoReference()
     * @generated
     */
    int DTO_REFERENCE = 28;

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
    int SERVICE_REFERENCE = 29;

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
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType <em>Process Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getProcessType()
     * @generated
     */
    int PROCESS_TYPE = 30;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType <em>Expression Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getExpressionType()
     * @generated
     */
    int EXPRESSION_TYPE = 31;


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
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm <em>Content Form</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Content Form</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm
     * @generated
     */
    EClass getContentForm();

    /**
     * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm#getFormElements <em>Form Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Form Elements</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm#getFormElements()
     * @see #getContentForm()
     * @generated
     */
    EReference getContentForm_FormElements();

    /**
     * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm#getActions <em>Actions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Actions</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm#getActions()
     * @see #getContentForm()
     * @generated
     */
    EReference getContentForm_Actions();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue <em>Compound Dialogue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Compound Dialogue</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue
     * @generated
     */
    EClass getCompoundDialogue();

    /**
     * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue#getDialogues <em>Dialogues</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Dialogues</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue#getDialogues()
     * @see #getCompoundDialogue()
     * @generated
     */
    EReference getCompoundDialogue_Dialogues();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.CollectionDialogue <em>Collection Dialogue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Collection Dialogue</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.CollectionDialogue
     * @generated
     */
    EClass getCollectionDialogue();

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
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue <em>Dialogue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dialogue</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue
     * @generated
     */
    EClass getDialogue();

    /**
     * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue#isReadonly <em>Readonly</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Readonly</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue#isReadonly()
     * @see #getDialogue()
     * @generated
     */
    EAttribute getDialogue_Readonly();

    /**
     * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue#getProcesses <em>Processes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Processes</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue#getProcesses()
     * @see #getDialogue()
     * @generated
     */
    EReference getDialogue_Processes();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall <em>Dialogue Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dialogue Call</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall
     * @generated
     */
    EClass getDialogueCall();

    /**
     * Returns the meta object for the container reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall#getCompoundDialogue <em>Compound Dialogue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Compound Dialogue</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall#getCompoundDialogue()
     * @see #getDialogueCall()
     * @generated
     */
    EReference getDialogueCall_CompoundDialogue();

    /**
     * Returns the meta object for the reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall#getReferredDialogue <em>Referred Dialogue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referred Dialogue</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall#getReferredDialogue()
     * @see #getDialogueCall()
     * @generated
     */
    EReference getDialogueCall_ReferredDialogue();

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
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail <em>Master Detail</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Master Detail</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail
     * @generated
     */
    EClass getMasterDetail();

    /**
     * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail#getMaster <em>Master</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Master</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail#getMaster()
     * @see #getMasterDetail()
     * @generated
     */
    EReference getMasterDetail_Master();

    /**
     * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail#getDetail <em>Detail</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Detail</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail#getDetail()
     * @see #getMasterDetail()
     * @generated
     */
    EReference getMasterDetail_Detail();

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
     * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getStart <em>Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Start</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getStart()
     * @see #getPresentationModel()
     * @generated
     */
    EReference getPresentationModel_Start();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Process
     * @generated
     */
    EClass getProcess();

    /**
     * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getProcessElements <em>Process Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Process Elements</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getProcessElements()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_ProcessElements();

    /**
     * Returns the meta object for the container reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getContentForm <em>Content Form</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Content Form</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getContentForm()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_ContentForm();

    /**
     * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getLink <em>Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Link</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Process#getLink()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_Link();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall <em>Process Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process Call</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall
     * @generated
     */
    EClass getProcessCall();

    /**
     * Returns the meta object for the container reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall#getOwningDialogue <em>Owning Dialogue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owning Dialogue</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall#getOwningDialogue()
     * @see #getProcessCall()
     * @generated
     */
    EReference getProcessCall_OwningDialogue();

    /**
     * Returns the meta object for the reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall#getReferredProcess <em>Referred Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referred Process</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall#getReferredProcess()
     * @see #getProcessCall()
     * @generated
     */
    EReference getProcessCall_ReferredProcess();

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
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall <em>UI Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>UI Call</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.UICall
     * @generated
     */
    EClass getUICall();

    /**
     * Returns the meta object for the container reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Process</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getProcess()
     * @see #getUICall()
     * @generated
     */
    EReference getUICall_Process();

    /**
     * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getCondition()
     * @see #getUICall()
     * @generated
     */
    EReference getUICall_Condition();

    /**
     * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getLabel()
     * @see #getUICall()
     * @generated
     */
    EAttribute getUICall_Label();

    /**
     * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getArguments <em>Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Arguments</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getArguments()
     * @see #getUICall()
     * @generated
     */
    EReference getUICall_Arguments();

    /**
     * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getContextExp <em>Context Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Context Exp</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.UICall#getContextExp()
     * @see #getUICall()
     * @generated
     */
    EReference getUICall_ContextExp();

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
     * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression#getServiceName <em>Service Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service Name</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression#getServiceName()
     * @see #getServiceExpression()
     * @generated
     */
    EAttribute getServiceExpression_ServiceName();

    /**
     * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression#getServiceMethod <em>Service Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service Method</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression#getServiceMethod()
     * @see #getServiceExpression()
     * @generated
     */
    EAttribute getServiceExpression_ServiceMethod();

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
     * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression#isComposition <em>Composition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Composition</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression#isComposition()
     * @see #getNavigationExpression()
     * @generated
     */
    EAttribute getNavigationExpression_Composition();

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
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.OperationExpression <em>Operation Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation Expression</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.OperationExpression
     * @generated
     */
    EClass getOperationExpression();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Application <em>Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Application</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Application
     * @generated
     */
    EClass getApplication();

    /**
     * Returns the meta object for the containment reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Application#getStartProcesses <em>Start Processes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Start Processes</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Application#getStartProcesses()
     * @see #getApplication()
     * @generated
     */
    EReference getApplication_StartProcesses();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessReference <em>Process Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process Reference</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessReference
     * @generated
     */
    EClass getProcessReference();

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
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueReference <em>Dialogue Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dialogue Reference</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueReference
     * @generated
     */
    EClass getDialogueReference();

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
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ContentFormImpl <em>Content Form</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ContentFormImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getContentForm()
         * @generated
         */
        EClass CONTENT_FORM = eINSTANCE.getContentForm();

        /**
         * The meta object literal for the '<em><b>Form Elements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTENT_FORM__FORM_ELEMENTS = eINSTANCE.getContentForm_FormElements();

        /**
         * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTENT_FORM__ACTIONS = eINSTANCE.getContentForm_Actions();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.CompoundDialogueImpl <em>Compound Dialogue</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.CompoundDialogueImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getCompoundDialogue()
         * @generated
         */
        EClass COMPOUND_DIALOGUE = eINSTANCE.getCompoundDialogue();

        /**
         * The meta object literal for the '<em><b>Dialogues</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPOUND_DIALOGUE__DIALOGUES = eINSTANCE.getCompoundDialogue_Dialogues();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.CollectionDialogueImpl <em>Collection Dialogue</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.CollectionDialogueImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getCollectionDialogue()
         * @generated
         */
        EClass COLLECTION_DIALOGUE = eINSTANCE.getCollectionDialogue();

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
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DialogueImpl <em>Dialogue</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DialogueImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDialogue()
         * @generated
         */
        EClass DIALOGUE = eINSTANCE.getDialogue();

        /**
         * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIALOGUE__READONLY = eINSTANCE.getDialogue_Readonly();

        /**
         * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIALOGUE__PROCESSES = eINSTANCE.getDialogue_Processes();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DialogueCallImpl <em>Dialogue Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DialogueCallImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDialogueCall()
         * @generated
         */
        EClass DIALOGUE_CALL = eINSTANCE.getDialogueCall();

        /**
         * The meta object literal for the '<em><b>Compound Dialogue</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIALOGUE_CALL__COMPOUND_DIALOGUE = eINSTANCE.getDialogueCall_CompoundDialogue();

        /**
         * The meta object literal for the '<em><b>Referred Dialogue</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIALOGUE_CALL__REFERRED_DIALOGUE = eINSTANCE.getDialogueCall_ReferredDialogue();

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
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.MasterDetailImpl <em>Master Detail</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.MasterDetailImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getMasterDetail()
         * @generated
         */
        EClass MASTER_DETAIL = eINSTANCE.getMasterDetail();

        /**
         * The meta object literal for the '<em><b>Master</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MASTER_DETAIL__MASTER = eINSTANCE.getMasterDetail_Master();

        /**
         * The meta object literal for the '<em><b>Detail</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MASTER_DETAIL__DETAIL = eINSTANCE.getMasterDetail_Detail();

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
         * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENTATION_MODEL__START = eINSTANCE.getPresentationModel_Start();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessImpl <em>Process</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getProcess()
         * @generated
         */
        EClass PROCESS = eINSTANCE.getProcess();

        /**
         * The meta object literal for the '<em><b>Process Elements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS__PROCESS_ELEMENTS = eINSTANCE.getProcess_ProcessElements();

        /**
         * The meta object literal for the '<em><b>Content Form</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS__CONTENT_FORM = eINSTANCE.getProcess_ContentForm();

        /**
         * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS__LINK = eINSTANCE.getProcess_Link();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessCallImpl <em>Process Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessCallImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getProcessCall()
         * @generated
         */
        EClass PROCESS_CALL = eINSTANCE.getProcessCall();

        /**
         * The meta object literal for the '<em><b>Owning Dialogue</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_CALL__OWNING_DIALOGUE = eINSTANCE.getProcessCall_OwningDialogue();

        /**
         * The meta object literal for the '<em><b>Referred Process</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS_CALL__REFERRED_PROCESS = eINSTANCE.getProcessCall_ReferredProcess();

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
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UICallImpl <em>UI Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UICallImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getUICall()
         * @generated
         */
        EClass UI_CALL = eINSTANCE.getUICall();

        /**
         * The meta object literal for the '<em><b>Process</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UI_CALL__PROCESS = eINSTANCE.getUICall_Process();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UI_CALL__CONDITION = eINSTANCE.getUICall_Condition();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UI_CALL__LABEL = eINSTANCE.getUICall_Label();

        /**
         * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UI_CALL__ARGUMENTS = eINSTANCE.getUICall_Arguments();

        /**
         * The meta object literal for the '<em><b>Context Exp</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UI_CALL__CONTEXT_EXP = eINSTANCE.getUICall_ContextExp();

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
         * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_EXPRESSION__SERVICE_NAME = eINSTANCE.getServiceExpression_ServiceName();

        /**
         * The meta object literal for the '<em><b>Service Method</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE_EXPRESSION__SERVICE_METHOD = eINSTANCE.getServiceExpression_ServiceMethod();

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
         * The meta object literal for the '<em><b>Composition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAVIGATION_EXPRESSION__COMPOSITION = eINSTANCE.getNavigationExpression_Composition();

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
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.OperationExpressionImpl <em>Operation Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.OperationExpressionImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getOperationExpression()
         * @generated
         */
        EClass OPERATION_EXPRESSION = eINSTANCE.getOperationExpression();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ApplicationImpl <em>Application</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ApplicationImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getApplication()
         * @generated
         */
        EClass APPLICATION = eINSTANCE.getApplication();

        /**
         * The meta object literal for the '<em><b>Start Processes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICATION__START_PROCESSES = eINSTANCE.getApplication_StartProcesses();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessReferenceImpl <em>Process Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessReferenceImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getProcessReference()
         * @generated
         */
        EClass PROCESS_REFERENCE = eINSTANCE.getProcessReference();

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
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DialogueReferenceImpl <em>Dialogue Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DialogueReferenceImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDialogueReference()
         * @generated
         */
        EClass DIALOGUE_REFERENCE = eINSTANCE.getDialogueReference();

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
