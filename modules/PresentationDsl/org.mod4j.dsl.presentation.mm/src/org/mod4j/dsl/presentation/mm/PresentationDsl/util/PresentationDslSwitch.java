/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractProcess;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Application;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.CollectionDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Expression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Form;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext;
import org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.OperationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UICall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage
 * @generated
 */
public class PresentationDslSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static PresentationDslPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PresentationDslSwitch() {
        if (modelPackage == null) {
            modelPackage = PresentationDslPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case PresentationDslPackage.ASSOCIATION_ROLE_REFERENCE: {
                AssociationRoleReference associationRoleReference = (AssociationRoleReference)theEObject;
                T result = caseAssociationRoleReference(associationRoleReference);
                if (result == null) result = caseModelElement(associationRoleReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.CONTENT_FORM: {
                ContentForm contentForm = (ContentForm)theEObject;
                T result = caseContentForm(contentForm);
                if (result == null) result = caseForm(contentForm);
                if (result == null) result = caseDialogue(contentForm);
                if (result == null) result = caseUIModelElement(contentForm);
                if (result == null) result = caseModelElementWithContext(contentForm);
                if (result == null) result = caseModelElement(contentForm);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.COMPOUND_DIALOGUE: {
                CompoundDialogue compoundDialogue = (CompoundDialogue)theEObject;
                T result = caseCompoundDialogue(compoundDialogue);
                if (result == null) result = caseDialogue(compoundDialogue);
                if (result == null) result = caseUIModelElement(compoundDialogue);
                if (result == null) result = caseModelElementWithContext(compoundDialogue);
                if (result == null) result = caseModelElement(compoundDialogue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.COLLECTION_DIALOGUE: {
                CollectionDialogue collectionDialogue = (CollectionDialogue)theEObject;
                T result = caseCollectionDialogue(collectionDialogue);
                if (result == null) result = caseCompoundDialogue(collectionDialogue);
                if (result == null) result = caseDialogue(collectionDialogue);
                if (result == null) result = caseUIModelElement(collectionDialogue);
                if (result == null) result = caseModelElementWithContext(collectionDialogue);
                if (result == null) result = caseModelElement(collectionDialogue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.DATA_PROPERTY: {
                DataProperty dataProperty = (DataProperty)theEObject;
                T result = caseDataProperty(dataProperty);
                if (result == null) result = caseModelElement(dataProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.DIALOGUE: {
                Dialogue dialogue = (Dialogue)theEObject;
                T result = caseDialogue(dialogue);
                if (result == null) result = caseUIModelElement(dialogue);
                if (result == null) result = caseModelElementWithContext(dialogue);
                if (result == null) result = caseModelElement(dialogue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.DIALOGUE_CALL: {
                DialogueCall dialogueCall = (DialogueCall)theEObject;
                T result = caseDialogueCall(dialogueCall);
                if (result == null) result = caseUICall(dialogueCall);
                if (result == null) result = caseModelElement(dialogueCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.DTO_PROPERTY_REFERENCE: {
                DtoPropertyReference dtoPropertyReference = (DtoPropertyReference)theEObject;
                T result = caseDtoPropertyReference(dtoPropertyReference);
                if (result == null) result = caseModelElement(dtoPropertyReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.EXTERNAL_REFERENCE: {
                ExternalReference externalReference = (ExternalReference)theEObject;
                T result = caseExternalReference(externalReference);
                if (result == null) result = caseModelElement(externalReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.FORM: {
                Form form = (Form)theEObject;
                T result = caseForm(form);
                if (result == null) result = caseDialogue(form);
                if (result == null) result = caseUIModelElement(form);
                if (result == null) result = caseModelElementWithContext(form);
                if (result == null) result = caseModelElement(form);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.FORM_ELEMENT: {
                FormElement formElement = (FormElement)theEObject;
                T result = caseFormElement(formElement);
                if (result == null) result = caseModelElement(formElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.MASTER_DETAIL: {
                MasterDetail masterDetail = (MasterDetail)theEObject;
                T result = caseMasterDetail(masterDetail);
                if (result == null) result = caseCompoundDialogue(masterDetail);
                if (result == null) result = caseDialogue(masterDetail);
                if (result == null) result = caseUIModelElement(masterDetail);
                if (result == null) result = caseModelElementWithContext(masterDetail);
                if (result == null) result = caseModelElement(masterDetail);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.MODEL_ELEMENT_WITH_CONTEXT: {
                ModelElementWithContext modelElementWithContext = (ModelElementWithContext)theEObject;
                T result = caseModelElementWithContext(modelElementWithContext);
                if (result == null) result = caseModelElement(modelElementWithContext);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.MODEL_ELEMENT: {
                ModelElement modelElement = (ModelElement)theEObject;
                T result = caseModelElement(modelElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.PRESENTATION_MODEL: {
                PresentationModel presentationModel = (PresentationModel)theEObject;
                T result = casePresentationModel(presentationModel);
                if (result == null) result = caseModelElement(presentationModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.PROCESS: {
                org.mod4j.dsl.presentation.mm.PresentationDsl.Process process = (org.mod4j.dsl.presentation.mm.PresentationDsl.Process)theEObject;
                T result = caseProcess(process);
                if (result == null) result = caseAbstractProcess(process);
                if (result == null) result = caseUIModelElement(process);
                if (result == null) result = caseModelElementWithContext(process);
                if (result == null) result = caseModelElement(process);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.PROCESS_CALL: {
                ProcessCall processCall = (ProcessCall)theEObject;
                T result = caseProcessCall(processCall);
                if (result == null) result = caseUICall(processCall);
                if (result == null) result = caseModelElement(processCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.UI_MODEL_ELEMENT: {
                UIModelElement uiModelElement = (UIModelElement)theEObject;
                T result = caseUIModelElement(uiModelElement);
                if (result == null) result = caseModelElementWithContext(uiModelElement);
                if (result == null) result = caseModelElement(uiModelElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.UI_CALL: {
                UICall uiCall = (UICall)theEObject;
                T result = caseUICall(uiCall);
                if (result == null) result = caseModelElement(uiCall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.SERVICE_EXPRESSION: {
                ServiceExpression serviceExpression = (ServiceExpression)theEObject;
                T result = caseServiceExpression(serviceExpression);
                if (result == null) result = caseExpression(serviceExpression);
                if (result == null) result = caseModelElement(serviceExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.NAVIGATION_EXPRESSION: {
                NavigationExpression navigationExpression = (NavigationExpression)theEObject;
                T result = caseNavigationExpression(navigationExpression);
                if (result == null) result = caseExpression(navigationExpression);
                if (result == null) result = caseModelElement(navigationExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.EXPRESSION: {
                Expression expression = (Expression)theEObject;
                T result = caseExpression(expression);
                if (result == null) result = caseModelElement(expression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.STANDARD_EXPRESSION: {
                StandardExpression standardExpression = (StandardExpression)theEObject;
                T result = caseStandardExpression(standardExpression);
                if (result == null) result = caseExpression(standardExpression);
                if (result == null) result = caseModelElement(standardExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.OPERATION_EXPRESSION: {
                OperationExpression operationExpression = (OperationExpression)theEObject;
                T result = caseOperationExpression(operationExpression);
                if (result == null) result = caseExpression(operationExpression);
                if (result == null) result = caseModelElement(operationExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.APPLICATION: {
                Application application = (Application)theEObject;
                T result = caseApplication(application);
                if (result == null) result = caseModelElement(application);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.PROCESS_REFERENCE: {
                ProcessReference processReference = (ProcessReference)theEObject;
                T result = caseProcessReference(processReference);
                if (result == null) result = caseAbstractProcess(processReference);
                if (result == null) result = caseExternalReference(processReference);
                if (result == null) result = caseUIModelElement(processReference);
                if (result == null) result = caseModelElementWithContext(processReference);
                if (result == null) result = caseModelElement(processReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PresentationDslPackage.ABSTRACT_PROCESS: {
                AbstractProcess abstractProcess = (AbstractProcess)theEObject;
                T result = caseAbstractProcess(abstractProcess);
                if (result == null) result = caseUIModelElement(abstractProcess);
                if (result == null) result = caseModelElementWithContext(abstractProcess);
                if (result == null) result = caseModelElement(abstractProcess);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Association Role Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Association Role Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssociationRoleReference(AssociationRoleReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Content Form</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Content Form</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContentForm(ContentForm object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Compound Dialogue</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Compound Dialogue</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompoundDialogue(CompoundDialogue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Collection Dialogue</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Collection Dialogue</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCollectionDialogue(CollectionDialogue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataProperty(DataProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dialogue</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dialogue</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDialogue(Dialogue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dialogue Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dialogue Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDialogueCall(DialogueCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dto Property Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dto Property Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDtoPropertyReference(DtoPropertyReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>External Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>External Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExternalReference(ExternalReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Form</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseForm(Form object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Form Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Form Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormElement(FormElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Master Detail</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Master Detail</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMasterDetail(MasterDetail object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Element With Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element With Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelElementWithContext(ModelElementWithContext object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelElement(ModelElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Presentation Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Presentation Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePresentationModel(PresentationModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcess(org.mod4j.dsl.presentation.mm.PresentationDsl.Process object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessCall(ProcessCall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UI Model Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UI Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUIModelElement(UIModelElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UI Call</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UI Call</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUICall(UICall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceExpression(ServiceExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Navigation Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Navigation Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNavigationExpression(NavigationExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExpression(Expression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Standard Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Standard Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStandardExpression(StandardExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operation Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationExpression(OperationExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Application</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApplication(Application object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcessReference(ProcessReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Process</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Process</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractProcess(AbstractProcess object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //PresentationDslSwitch
