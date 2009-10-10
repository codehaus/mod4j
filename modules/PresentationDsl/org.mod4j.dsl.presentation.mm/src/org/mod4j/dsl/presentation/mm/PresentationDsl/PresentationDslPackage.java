/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	int MODEL_ELEMENT = 21;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementImpl <em>UI Model Element</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getUIModelElement()
     * @generated
     */
	int UI_MODEL_ELEMENT = 26;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getLink()
     * @generated
     */
	int LINK = 14;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationModelImpl <em>Presentation Model</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationModelImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getPresentationModel()
     * @generated
     */
	int PRESENTATION_MODEL = 23;

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
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getProcess()
     * @generated
     */
	int PROCESS = 24;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormImpl <em>Form</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getForm()
     * @generated
     */
	int FORM = 11;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ContentFormImpl <em>Content Form</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ContentFormImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getContentForm()
     * @generated
     */
	int CONTENT_FORM = 2;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.CompoundDialogueImpl <em>Compound Dialogue</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.CompoundDialogueImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getCompoundDialogue()
     * @generated
     */
	int COMPOUND_DIALOGUE = 3;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.CollectionDialogueImpl <em>Collection Dialogue</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.CollectionDialogueImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getCollectionDialogue()
     * @generated
     */
	int COLLECTION_DIALOGUE = 4;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.InteractiveProcessImpl <em>Interactive Process</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.InteractiveProcessImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getInteractiveProcess()
     * @generated
     */
	int INTERACTIVE_PROCESS = 13;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AutomatedProcessImpl <em>Automated Process</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AutomatedProcessImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getAutomatedProcess()
     * @generated
     */
	int AUTOMATED_PROCESS = 1;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.NamedReferenceImpl <em>Named Reference</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.NamedReferenceImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getNamedReference()
     * @generated
     */
	int NAMED_REFERENCE = 22;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAMED_REFERENCE__NAME = 0;

	/**
     * The number of structural features of the '<em>Named Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NAMED_REFERENCE_FEATURE_COUNT = 1;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl <em>Form Element</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormElementImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getFormElement()
     * @generated
     */
	int FORM_ELEMENT = 12;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ExternalReferenceImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getExternalReference()
     * @generated
     */
	int EXTERNAL_REFERENCE = 10;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoPropertyReferenceImpl <em>Dto Property Reference</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DtoPropertyReferenceImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDtoPropertyReference()
     * @generated
     */
	int DTO_PROPERTY_REFERENCE = 9;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementCallImpl <em>UI Model Element Call</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementCallImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getUIModelElementCall()
     * @generated
     */
	int UI_MODEL_ELEMENT_CALL = 27;

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
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DirectDialogueCallImpl <em>Direct Dialogue Call</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DirectDialogueCallImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDirectDialogueCall()
     * @generated
     */
	int DIRECT_DIALOGUE_CALL = 7;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkedDialogueCallImpl <em>Linked Dialogue Call</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkedDialogueCallImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getLinkedDialogueCall()
     * @generated
     */
	int LINKED_DIALOGUE_CALL = 15;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkRefImpl <em>Link Ref</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkRefImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getLinkRef()
     * @generated
     */
	int LINK_REF = 17;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkPathImpl <em>Link Path</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkPathImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getLinkPath()
     * @generated
     */
	int LINK_PATH = 18;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkStepImpl <em>Link Step</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkStepImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getLinkStep()
     * @generated
     */
	int LINK_STEP = 19;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessCallImpl <em>Process Call</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessCallImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getProcessCall()
     * @generated
     */
	int PROCESS_CALL = 25;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.MasterDetailImpl <em>Master Detail</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.MasterDetailImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getMasterDetail()
     * @generated
     */
	int MASTER_DETAIL = 20;

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
	int ASSOCIATION_ROLE_REFERENCE__NAME = NAMED_REFERENCE__NAME;

	/**
     * The number of structural features of the '<em>Association Role Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ASSOCIATION_ROLE_REFERENCE_FEATURE_COUNT = NAMED_REFERENCE_FEATURE_COUNT + 0;

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
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MODEL_ELEMENT__CONTEXT_REF = 2;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MODEL_ELEMENT__PRESENTATION_MODEL = 3;

    /**
     * The number of structural features of the '<em>Model Element</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MODEL_ELEMENT_FEATURE_COUNT = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UI_MODEL_ELEMENT__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UI_MODEL_ELEMENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UI_MODEL_ELEMENT__CONTEXT_REF = MODEL_ELEMENT__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UI_MODEL_ELEMENT__PRESENTATION_MODEL = MODEL_ELEMENT__PRESENTATION_MODEL;

    /**
     * The number of structural features of the '<em>UI Model Element</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UI_MODEL_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCESS__NAME = UI_MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCESS__DESCRIPTION = UI_MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCESS__CONTEXT_REF = UI_MODEL_ELEMENT__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCESS__PRESENTATION_MODEL = UI_MODEL_ELEMENT__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Process Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__PROCESS_ELEMENTS = UI_MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Process</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCESS_FEATURE_COUNT = UI_MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AUTOMATED_PROCESS__NAME = PROCESS__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AUTOMATED_PROCESS__DESCRIPTION = PROCESS__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AUTOMATED_PROCESS__CONTEXT_REF = PROCESS__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AUTOMATED_PROCESS__PRESENTATION_MODEL = PROCESS__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Process Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATED_PROCESS__PROCESS_ELEMENTS = PROCESS__PROCESS_ELEMENTS;

    /**
     * The number of structural features of the '<em>Automated Process</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AUTOMATED_PROCESS_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOGUE__NAME = UI_MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOGUE__DESCRIPTION = UI_MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOGUE__CONTEXT_REF = UI_MODEL_ELEMENT__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOGUE__PRESENTATION_MODEL = UI_MODEL_ELEMENT__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Readonly</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOGUE__READONLY = UI_MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Processes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOGUE__PROCESSES = UI_MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Dialogue</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOGUE_FEATURE_COUNT = UI_MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORM__NAME = DIALOGUE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORM__DESCRIPTION = DIALOGUE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORM__CONTEXT_REF = DIALOGUE__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORM__PRESENTATION_MODEL = DIALOGUE__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Readonly</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORM__READONLY = DIALOGUE__READONLY;

    /**
     * The feature id for the '<em><b>Processes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORM__PROCESSES = DIALOGUE__PROCESSES;

    /**
     * The number of structural features of the '<em>Form</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORM_FEATURE_COUNT = DIALOGUE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTENT_FORM__NAME = FORM__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTENT_FORM__DESCRIPTION = FORM__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTENT_FORM__CONTEXT_REF = FORM__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTENT_FORM__PRESENTATION_MODEL = FORM__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Readonly</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTENT_FORM__READONLY = FORM__READONLY;

    /**
     * The feature id for the '<em><b>Processes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTENT_FORM__PROCESSES = FORM__PROCESSES;

    /**
     * The feature id for the '<em><b>Form Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTENT_FORM__FORM_ELEMENTS = FORM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Content Form</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTENT_FORM_FEATURE_COUNT = FORM_FEATURE_COUNT + 1;

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
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UICallImpl <em>UI Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UICallImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getUICall()
     * @generated
     */
    int UI_CALL = 28;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UI_CALL__NAME = NAMED_REFERENCE__NAME;

    /**
     * The number of structural features of the '<em>UI Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UI_CALL_FEATURE_COUNT = NAMED_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UI_MODEL_ELEMENT_CALL__NAME = UI_CALL__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UI_MODEL_ELEMENT_CALL__ALIAS = UI_CALL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>UI Model Element Call</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UI_MODEL_ELEMENT_CALL_FEATURE_COUNT = UI_CALL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOGUE_CALL__NAME = UI_MODEL_ELEMENT_CALL__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIALOGUE_CALL__ALIAS = UI_MODEL_ELEMENT_CALL__ALIAS;

    /**
     * The number of structural features of the '<em>Dialogue Call</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIALOGUE_CALL_FEATURE_COUNT = UI_MODEL_ELEMENT_CALL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIRECT_DIALOGUE_CALL__NAME = DIALOGUE_CALL__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECT_DIALOGUE_CALL__ALIAS = DIALOGUE_CALL__ALIAS;

    /**
     * The number of structural features of the '<em>Direct Dialogue Call</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DIRECT_DIALOGUE_CALL_FEATURE_COUNT = DIALOGUE_CALL_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkedProcessCallImpl <em>Linked Process Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkedProcessCallImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getLinkedProcessCall()
     * @generated
     */
    int LINKED_PROCESS_CALL = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCESS_CALL__NAME = UI_MODEL_ELEMENT_CALL__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_CALL__ALIAS = UI_MODEL_ELEMENT_CALL__ALIAS;

    /**
     * The number of structural features of the '<em>Process Call</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROCESS_CALL_FEATURE_COUNT = UI_MODEL_ELEMENT_CALL_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DirectProcessCallImpl <em>Direct Process Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DirectProcessCallImpl
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDirectProcessCall()
     * @generated
     */
    int DIRECT_PROCESS_CALL = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECT_PROCESS_CALL__NAME = PROCESS_CALL__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECT_PROCESS_CALL__ALIAS = PROCESS_CALL__ALIAS;

    /**
     * The number of structural features of the '<em>Direct Process Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECT_PROCESS_CALL_FEATURE_COUNT = PROCESS_CALL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_PROPERTY_REFERENCE__NAME = NAMED_REFERENCE__NAME;

    /**
     * The number of structural features of the '<em>Dto Property Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DTO_PROPERTY_REFERENCE_FEATURE_COUNT = NAMED_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_REFERENCE__NAME = NAMED_REFERENCE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_REFERENCE__DESCRIPTION = NAMED_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Model Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_REFERENCE__MODEL_NAME = NAMED_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>External Reference</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EXTERNAL_REFERENCE_FEATURE_COUNT = NAMED_REFERENCE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORM_ELEMENT__NAME = 0;

    /**
     * The feature id for the '<em><b>References</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORM_ELEMENT__REFERENCES = 1;

    /**
     * The feature id for the '<em><b>Readonly</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORM_ELEMENT__READONLY = 2;

    /**
     * The feature id for the '<em><b>Form</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORM_ELEMENT__FORM = 3;

    /**
     * The number of structural features of the '<em>Form Element</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FORM_ELEMENT_FEATURE_COUNT = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERACTIVE_PROCESS__NAME = PROCESS__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERACTIVE_PROCESS__DESCRIPTION = PROCESS__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERACTIVE_PROCESS__CONTEXT_REF = PROCESS__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERACTIVE_PROCESS__PRESENTATION_MODEL = PROCESS__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Process Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTIVE_PROCESS__PROCESS_ELEMENTS = PROCESS__PROCESS_ELEMENTS;

    /**
     * The number of structural features of the '<em>Interactive Process</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INTERACTIVE_PROCESS_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK__NAME = MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK__CONTEXT_REF = MODEL_ELEMENT__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK__PRESENTATION_MODEL = MODEL_ELEMENT__PRESENTATION_MODEL;

    /**
     * The number of structural features of the '<em>Link</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINKED_DIALOGUE_CALL__NAME = DIALOGUE_CALL__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_DIALOGUE_CALL__ALIAS = DIALOGUE_CALL__ALIAS;

    /**
     * The feature id for the '<em><b>Link</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINKED_DIALOGUE_CALL__LINK = DIALOGUE_CALL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Linked Dialogue Call</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINKED_DIALOGUE_CALL_FEATURE_COUNT = DIALOGUE_CALL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PROCESS_CALL__NAME = PROCESS_CALL__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PROCESS_CALL__ALIAS = PROCESS_CALL__ALIAS;

    /**
     * The feature id for the '<em><b>Link</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PROCESS_CALL__LINK = PROCESS_CALL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Linked Process Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKED_PROCESS_CALL_FEATURE_COUNT = PROCESS_CALL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_REF__NAME = NAMED_REFERENCE__NAME;

    /**
     * The number of structural features of the '<em>Link Ref</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_REF_FEATURE_COUNT = NAMED_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_PATH__NAME = LINK__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_PATH__DESCRIPTION = LINK__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_PATH__CONTEXT_REF = LINK__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_PATH__PRESENTATION_MODEL = LINK__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Steps</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_PATH__STEPS = LINK_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Link Path</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_PATH_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_STEP__NAME = LINK__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_STEP__DESCRIPTION = LINK__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Context Ref</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_STEP__CONTEXT_REF = LINK__CONTEXT_REF;

    /**
     * The feature id for the '<em><b>Presentation Model</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_STEP__PRESENTATION_MODEL = LINK__PRESENTATION_MODEL;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_STEP__REFERENCE = LINK_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Link Step</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int LINK_STEP_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

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
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRESENTATION_MODEL__NAME = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRESENTATION_MODEL__DESCRIPTION = 1;

    /**
     * The feature id for the '<em><b>Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRESENTATION_MODEL__ELEMENTS = 2;

    /**
     * The feature id for the '<em><b>External References</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRESENTATION_MODEL__EXTERNAL_REFERENCES = 3;

    /**
     * The number of structural features of the '<em>Presentation Model</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRESENTATION_MODEL_FEATURE_COUNT = 4;

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
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall <em>UI Model Element Call</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>UI Model Element Call</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall
     * @generated
     */
	EClass getUIModelElementCall();

	/**
     * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall#getAlias <em>Alias</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Alias</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall#getAlias()
     * @see #getUIModelElementCall()
     * @generated
     */
    EAttribute getUIModelElementCall_Alias();

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
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference <em>Association Role Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Association Role Reference</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference
     * @generated
     */
	EClass getAssociationRoleReference();

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
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference <em>External Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>External Reference</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference
     * @generated
     */
	EClass getExternalReference();

	/**
     * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference#getDescription()
     * @see #getExternalReference()
     * @generated
     */
	EAttribute getExternalReference_Description();

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
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference <em>Dto Property Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dto Property Reference</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference
     * @generated
     */
	EClass getDtoPropertyReference();

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
     * Returns the meta object for the reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getContextRef <em>Context Ref</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Ref</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getContextRef()
     * @see #getModelElement()
     * @generated
     */
	EReference getModelElement_ContextRef();

	/**
     * Returns the meta object for the container reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getPresentationModel <em>Presentation Model</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Presentation Model</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement#getPresentationModel()
     * @see #getModelElement()
     * @generated
     */
	EReference getModelElement_PresentationModel();

	/**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.NamedReference <em>Named Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Reference</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.NamedReference
     * @generated
     */
	EClass getNamedReference();

	/**
     * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.NamedReference#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.NamedReference#getName()
     * @see #getNamedReference()
     * @generated
     */
	EAttribute getNamedReference_Name();

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
     * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getName()
     * @see #getPresentationModel()
     * @generated
     */
	EAttribute getPresentationModel_Name();

	/**
     * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel#getDescription()
     * @see #getPresentationModel()
     * @generated
     */
	EAttribute getPresentationModel_Description();

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
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Link <em>Link</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Link
     * @generated
     */
	EClass getLink();

	/**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedDialogueCall <em>Linked Dialogue Call</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Linked Dialogue Call</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedDialogueCall
     * @generated
     */
	EClass getLinkedDialogueCall();

	/**
     * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedDialogueCall#getLink <em>Link</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Link</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedDialogueCall#getLink()
     * @see #getLinkedDialogueCall()
     * @generated
     */
	EReference getLinkedDialogueCall_Link();

	/**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedProcessCall <em>Linked Process Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Linked Process Call</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedProcessCall
     * @generated
     */
    EClass getLinkedProcessCall();

    /**
     * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedProcessCall#getLink <em>Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Link</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedProcessCall#getLink()
     * @see #getLinkedProcessCall()
     * @generated
     */
    EReference getLinkedProcessCall_Link();

    /**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkRef <em>Link Ref</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link Ref</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkRef
     * @generated
     */
	EClass getLinkRef();

	/**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkPath <em>Link Path</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link Path</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkPath
     * @generated
     */
	EClass getLinkPath();

	/**
     * Returns the meta object for the reference list '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkPath#getSteps <em>Steps</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Steps</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkPath#getSteps()
     * @see #getLinkPath()
     * @generated
     */
	EReference getLinkPath_Steps();

	/**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkStep <em>Link Step</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link Step</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkStep
     * @generated
     */
	EClass getLinkStep();

	/**
     * Returns the meta object for the containment reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.LinkStep#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Reference</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.LinkStep#getReference()
     * @see #getLinkStep()
     * @generated
     */
	EReference getLinkStep_Reference();

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
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DirectDialogueCall <em>Direct Dialogue Call</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Direct Dialogue Call</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DirectDialogueCall
     * @generated
     */
	EClass getDirectDialogueCall();

	/**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.DirectProcessCall <em>Direct Process Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Direct Process Call</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.DirectProcessCall
     * @generated
     */
    EClass getDirectProcessCall();

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
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall <em>Process Call</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process Call</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall
     * @generated
     */
	EClass getProcessCall();

	/**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.Form <em>Form</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Form</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.Form
     * @generated
     */
	EClass getForm();

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
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.InteractiveProcess <em>Interactive Process</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interactive Process</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.InteractiveProcess
     * @generated
     */
	EClass getInteractiveProcess();

	/**
     * Returns the meta object for class '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.AutomatedProcess <em>Automated Process</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Automated Process</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.AutomatedProcess
     * @generated
     */
	EClass getAutomatedProcess();

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
     * Returns the meta object for the attribute '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getName()
     * @see #getFormElement()
     * @generated
     */
	EAttribute getFormElement_Name();

	/**
     * Returns the meta object for the reference '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement#getReferences <em>References</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>References</em>'.
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
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementImpl <em>UI Model Element</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getUIModelElement()
         * @generated
         */
		EClass UI_MODEL_ELEMENT = eINSTANCE.getUIModelElement();

		/**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementCallImpl <em>UI Model Element Call</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.UIModelElementCallImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getUIModelElementCall()
         * @generated
         */
		EClass UI_MODEL_ELEMENT_CALL = eINSTANCE.getUIModelElementCall();

		/**
         * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UI_MODEL_ELEMENT_CALL__ALIAS = eINSTANCE.getUIModelElementCall_Alias();

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
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AssociationRoleReferenceImpl <em>Association Role Reference</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AssociationRoleReferenceImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getAssociationRoleReference()
         * @generated
         */
		EClass ASSOCIATION_ROLE_REFERENCE = eINSTANCE.getAssociationRoleReference();

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
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ExternalReferenceImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getExternalReference()
         * @generated
         */
		EClass EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

		/**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute EXTERNAL_REFERENCE__DESCRIPTION = eINSTANCE.getExternalReference_Description();

		/**
         * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute EXTERNAL_REFERENCE__MODEL_NAME = eINSTANCE.getExternalReference_ModelName();

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
         * The meta object literal for the '<em><b>Context Ref</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MODEL_ELEMENT__CONTEXT_REF = eINSTANCE.getModelElement_ContextRef();

		/**
         * The meta object literal for the '<em><b>Presentation Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MODEL_ELEMENT__PRESENTATION_MODEL = eINSTANCE.getModelElement_PresentationModel();

		/**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.NamedReferenceImpl <em>Named Reference</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.NamedReferenceImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getNamedReference()
         * @generated
         */
		EClass NAMED_REFERENCE = eINSTANCE.getNamedReference();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NAMED_REFERENCE__NAME = eINSTANCE.getNamedReference_Name();

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
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PRESENTATION_MODEL__NAME = eINSTANCE.getPresentationModel_Name();

		/**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PRESENTATION_MODEL__DESCRIPTION = eINSTANCE.getPresentationModel_Description();

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
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkImpl <em>Link</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getLink()
         * @generated
         */
		EClass LINK = eINSTANCE.getLink();

		/**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkedDialogueCallImpl <em>Linked Dialogue Call</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkedDialogueCallImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getLinkedDialogueCall()
         * @generated
         */
		EClass LINKED_DIALOGUE_CALL = eINSTANCE.getLinkedDialogueCall();

		/**
         * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference LINKED_DIALOGUE_CALL__LINK = eINSTANCE.getLinkedDialogueCall_Link();

		/**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkedProcessCallImpl <em>Linked Process Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkedProcessCallImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getLinkedProcessCall()
         * @generated
         */
        EClass LINKED_PROCESS_CALL = eINSTANCE.getLinkedProcessCall();

        /**
         * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKED_PROCESS_CALL__LINK = eINSTANCE.getLinkedProcessCall_Link();

        /**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkRefImpl <em>Link Ref</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkRefImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getLinkRef()
         * @generated
         */
		EClass LINK_REF = eINSTANCE.getLinkRef();

		/**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkPathImpl <em>Link Path</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkPathImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getLinkPath()
         * @generated
         */
		EClass LINK_PATH = eINSTANCE.getLinkPath();

		/**
         * The meta object literal for the '<em><b>Steps</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference LINK_PATH__STEPS = eINSTANCE.getLinkPath_Steps();

		/**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkStepImpl <em>Link Step</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.LinkStepImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getLinkStep()
         * @generated
         */
		EClass LINK_STEP = eINSTANCE.getLinkStep();

		/**
         * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference LINK_STEP__REFERENCE = eINSTANCE.getLinkStep_Reference();

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
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DirectDialogueCallImpl <em>Direct Dialogue Call</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DirectDialogueCallImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDirectDialogueCall()
         * @generated
         */
		EClass DIRECT_DIALOGUE_CALL = eINSTANCE.getDirectDialogueCall();

		/**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DirectProcessCallImpl <em>Direct Process Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.DirectProcessCallImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getDirectProcessCall()
         * @generated
         */
        EClass DIRECT_PROCESS_CALL = eINSTANCE.getDirectProcessCall();

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
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessCallImpl <em>Process Call</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.ProcessCallImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getProcessCall()
         * @generated
         */
		EClass PROCESS_CALL = eINSTANCE.getProcessCall();

		/**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormImpl <em>Form</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.FormImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getForm()
         * @generated
         */
		EClass FORM = eINSTANCE.getForm();

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
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.InteractiveProcessImpl <em>Interactive Process</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.InteractiveProcessImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getInteractiveProcess()
         * @generated
         */
		EClass INTERACTIVE_PROCESS = eINSTANCE.getInteractiveProcess();

		/**
         * The meta object literal for the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AutomatedProcessImpl <em>Automated Process</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.AutomatedProcessImpl
         * @see org.mod4j.dsl.presentation.mm.PresentationDsl.impl.PresentationDslPackageImpl#getAutomatedProcess()
         * @generated
         */
		EClass AUTOMATED_PROCESS = eINSTANCE.getAutomatedProcess();

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
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute FORM_ELEMENT__NAME = eINSTANCE.getFormElement_Name();

		/**
         * The meta object literal for the '<em><b>References</b></em>' reference feature.
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

	}

} //PresentationDslPackage
