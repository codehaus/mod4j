/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AutomatedProcess;
import org.mod4j.dsl.presentation.mm.PresentationDsl.CollectionDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DirectDialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DirectProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Form;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.InteractiveProcess;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkPath;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkRef;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkService;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkStep;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedDialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.LinkedProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslFactory;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType;
import org.mod4j.dsl.presentation.mm.PresentationDsl.SimpleProcess;
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
            case PresentationDslPackage.DATA_PROPERTY: return createDataProperty();
            case PresentationDslPackage.DIRECT_DIALOGUE_CALL: return createDirectDialogueCall();
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
            case PresentationDslPackage.MODEL_ELEMENT: return createModelElement();
            case PresentationDslPackage.PRESENTATION_MODEL: return createPresentationModel();
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL: return createUIModelElementCall();
            case PresentationDslPackage.DIRECT_PROCESS_CALL: return createDirectProcessCall();
            case PresentationDslPackage.SIMPLE_PROCESS: return createSimpleProcess();
            case PresentationDslPackage.LINK_SERVICE: return createLinkService();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case PresentationDslPackage.PROCESS_TYPE:
                return createProcessTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case PresentationDslPackage.PROCESS_TYPE:
                return convertProcessTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
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
    public AutomatedProcess createAutomatedProcess() {
        AutomatedProcessImpl automatedProcess = new AutomatedProcessImpl();
        return automatedProcess;
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
    public DataProperty createDataProperty() {
        DataPropertyImpl dataProperty = new DataPropertyImpl();
        return dataProperty;
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
    public FormElement createFormElement() {
        FormElementImpl formElement = new FormElementImpl();
        return formElement;
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
    public MasterDetail createMasterDetail() {
        MasterDetailImpl masterDetail = new MasterDetailImpl();
        return masterDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelElement createModelElement() {
        ModelElementImpl modelElement = new ModelElementImpl();
        return modelElement;
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
    public DirectProcessCall createDirectProcessCall() {
        DirectProcessCallImpl directProcessCall = new DirectProcessCallImpl();
        return directProcessCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleProcess createSimpleProcess() {
        SimpleProcessImpl simpleProcess = new SimpleProcessImpl();
        return simpleProcess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkService createLinkService() {
        LinkServiceImpl linkService = new LinkServiceImpl();
        return linkService;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType createProcessTypeFromString(EDataType eDataType, String initialValue) {
        ProcessType result = ProcessType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
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
