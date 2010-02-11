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
import org.mod4j.dsl.presentation.mm.PresentationDsl.CollectionDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Expression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Form;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.OperationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslFactory;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression;
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
            case PresentationDslPackage.CONTENT_FORM: return createContentForm();
            case PresentationDslPackage.COMPOUND_DIALOGUE: return createCompoundDialogue();
            case PresentationDslPackage.COLLECTION_DIALOGUE: return createCollectionDialogue();
            case PresentationDslPackage.DATA_PROPERTY: return createDataProperty();
            case PresentationDslPackage.DIALOGUE_CALL: return createDialogueCall();
            case PresentationDslPackage.DTO_PROPERTY_REFERENCE: return createDtoPropertyReference();
            case PresentationDslPackage.EXTERNAL_REFERENCE: return createExternalReference();
            case PresentationDslPackage.FORM: return createForm();
            case PresentationDslPackage.FORM_ELEMENT: return createFormElement();
            case PresentationDslPackage.MASTER_DETAIL: return createMasterDetail();
            case PresentationDslPackage.MODEL_ELEMENT: return createModelElement();
            case PresentationDslPackage.PRESENTATION_MODEL: return createPresentationModel();
            case PresentationDslPackage.PROCESS: return createProcess();
            case PresentationDslPackage.PROCESS_CALL: return createProcessCall();
            case PresentationDslPackage.UI_MODEL_ELEMENT_CALL: return createUIModelElementCall();
            case PresentationDslPackage.SERVICE_EXPRESSION: return createServiceExpression();
            case PresentationDslPackage.NAVIGATION_EXPRESSION: return createNavigationExpression();
            case PresentationDslPackage.EXPRESSION: return createExpression();
            case PresentationDslPackage.STANDARD_EXPRESSION: return createStandardExpression();
            case PresentationDslPackage.OPERATION_EXPRESSION: return createOperationExpression();
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
            case PresentationDslPackage.EXPRESSION_TYPE:
                return createExpressionTypeFromString(eDataType, initialValue);
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
            case PresentationDslPackage.EXPRESSION_TYPE:
                return convertExpressionTypeToString(eDataType, instanceValue);
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
    public DialogueCall createDialogueCall() {
        DialogueCallImpl dialogueCall = new DialogueCallImpl();
        return dialogueCall;
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
    public org.mod4j.dsl.presentation.mm.PresentationDsl.Process createProcess() {
        ProcessImpl process = new ProcessImpl();
        return process;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessCall createProcessCall() {
        ProcessCallImpl processCall = new ProcessCallImpl();
        return processCall;
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
    public ServiceExpression createServiceExpression() {
        ServiceExpressionImpl serviceExpression = new ServiceExpressionImpl();
        return serviceExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NavigationExpression createNavigationExpression() {
        NavigationExpressionImpl navigationExpression = new NavigationExpressionImpl();
        return navigationExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression createExpression() {
        ExpressionImpl expression = new ExpressionImpl();
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StandardExpression createStandardExpression() {
        StandardExpressionImpl standardExpression = new StandardExpressionImpl();
        return standardExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationExpression createOperationExpression() {
        OperationExpressionImpl operationExpression = new OperationExpressionImpl();
        return operationExpression;
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
    public ExpressionType createExpressionTypeFromString(EDataType eDataType, String initialValue) {
        ExpressionType result = ExpressionType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExpressionTypeToString(EDataType eDataType, Object instanceValue) {
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
