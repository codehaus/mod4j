/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AutomatedProcess;
import org.mod4j.dsl.presentation.mm.PresentationDsl.CollectionDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DirectDialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DirectProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Form;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.InteractiveProcess;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkPath;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Link;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkRef;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkStep;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedDialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail;
import org.mod4j.dsl.presentation.mm.PresentationDsl.NamedReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslFactory;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PresentationDslFactoryImpl extends EFactoryImpl implements PresentationDslFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static PresentationDslFactory init() {
        try {
            PresentationDslFactory thePresentationDslFactory = (PresentationDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mod4j.org/pmfmod"); 
            if (thePresentationDslFactory != null) {
                return thePresentationDslFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new PresentationDslFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PresentationDslFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case PresentationDslPackage.ASSOCIATION_ROLE_REFERENCE: return createAssociationRoleReference();
            case PresentationDslPackage.AUTOMATED_PROCESS: return createAutomatedProcess();
            case PresentationDslPackage.CONTENT_FORM: return createContentForm();
            case PresentationDslPackage.COMPOUND_DIALOGUE: return createCompoundDialogue();
            case PresentationDslPackage.COLLECTION_DIALOGUE: return createCollectionDialogue();
            case PresentationDslPackage.DIRECT_DIALOGUE_CALL: return createDirectDialogueCall();
            case PresentationDslPackage.DIRECT_PROCESS_CALL: return createDirectProcessCall();
            case PresentationDslPackage.DTO_PROPERTY_REFERENCE: return createDtoPropertyReference();
            case PresentationDslPackage.EXTERNAL_REFERENCE: return createExternalReference();
            case PresentationDslPackage.FORM: return createForm();
            case PresentationDslPackage.FORM_ELEMENT: return createFormElement();
            case PresentationDslPackage.INTERACTIVE_PROCESS: return createInteractiveProcess();
            case PresentationDslPackage.LINKED_DIALOGUE_CALL: return createLinkedDialogueCall();
            case PresentationDslPackage.LINKED_PROCESS_CALL: return createLinkedProcessCall();
            case PresentationDslPackage.LINK_REF: return createLinkRef();
            case PresentationDslPackage.LINK_PATH: return createLinkPath();
            case PresentationDslPackage.LINK_STEP: return createLinkStep();
            case PresentationDslPackage.MASTER_DETAIL: return createMasterDetail();
            case PresentationDslPackage.NAMED_REFERENCE: return createNamedReference();
            case PresentationDslPackage.PRESENTATION_MODEL: return createPresentationModel();
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL: return createUIModelElementCall();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LinkRef createLinkRef() {
        LinkRefImpl linkRef = new LinkRefImpl();
        return linkRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LinkPath createLinkPath() {
        LinkPathImpl linkPath = new LinkPathImpl();
        return linkPath;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LinkStep createLinkStep() {
        LinkStepImpl linkStep = new LinkStepImpl();
        return linkStep;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NamedReference createNamedReference() {
        NamedReferenceImpl namedReference = new NamedReferenceImpl();
        return namedReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PresentationModel createPresentationModel() {
        PresentationModelImpl presentationModel = new PresentationModelImpl();
        return presentationModel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public UIModelElementCall createUIModelElementCall() {
        UIModelElementCallImpl uiModelElementCall = new UIModelElementCallImpl();
        return uiModelElementCall;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AssociationRoleReference createAssociationRoleReference() {
        AssociationRoleReferenceImpl associationRoleReference = new AssociationRoleReferenceImpl();
        return associationRoleReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MasterDetail createMasterDetail() {
        MasterDetailImpl masterDetail = new MasterDetailImpl();
        return masterDetail;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DtoPropertyReference createDtoPropertyReference() {
        DtoPropertyReferenceImpl dtoPropertyReference = new DtoPropertyReferenceImpl();
        return dtoPropertyReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExternalReference createExternalReference() {
        ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
        return externalReference;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Form createForm() {
        FormImpl form = new FormImpl();
        return form;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ContentForm createContentForm() {
        ContentFormImpl contentForm = new ContentFormImpl();
        return contentForm;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CompoundDialogue createCompoundDialogue() {
        CompoundDialogueImpl compoundDialogue = new CompoundDialogueImpl();
        return compoundDialogue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CollectionDialogue createCollectionDialogue() {
        CollectionDialogueImpl collectionDialogue = new CollectionDialogueImpl();
        return collectionDialogue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DirectDialogueCall createDirectDialogueCall() {
        DirectDialogueCallImpl directDialogueCall = new DirectDialogueCallImpl();
        return directDialogueCall;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DirectProcessCall createDirectProcessCall() {
        DirectProcessCallImpl directProcessCall = new DirectProcessCallImpl();
        return directProcessCall;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public InteractiveProcess createInteractiveProcess() {
        InteractiveProcessImpl interactiveProcess = new InteractiveProcessImpl();
        return interactiveProcess;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LinkedDialogueCall createLinkedDialogueCall() {
        LinkedDialogueCallImpl linkedDialogueCall = new LinkedDialogueCallImpl();
        return linkedDialogueCall;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkedProcessCall createLinkedProcessCall() {
        LinkedProcessCallImpl linkedProcessCall = new LinkedProcessCallImpl();
        return linkedProcessCall;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AutomatedProcess createAutomatedProcess() {
        AutomatedProcessImpl automatedProcess = new AutomatedProcessImpl();
        return automatedProcess;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FormElement createFormElement() {
        FormElementImpl formElement = new FormElementImpl();
        return formElement;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PresentationDslPackage getPresentationDslPackage() {
        return (PresentationDslPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static PresentationDslPackage getPackage() {
        return PresentationDslPackage.eINSTANCE;
    }

} //PresentationDslFactoryImpl
