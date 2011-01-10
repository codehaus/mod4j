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

import org.mod4j.dsl.presentation.mm.PresentationDsl.*;

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
			case PresentationDslPackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = caseAbstractDialogue(view);
				if (result == null) result = caseUIModelElement(view);
				if (result == null) result = caseModelElementWithContext(view);
				if (result == null) result = caseModelElement(view);
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
			case PresentationDslPackage.FORM_ELEMENT: {
				FormElement formElement = (FormElement)theEObject;
				T result = caseFormElement(formElement);
				if (result == null) result = caseModelElement(formElement);
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
			case PresentationDslPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseAbstractProcess(action);
				if (result == null) result = caseUIModelElement(action);
				if (result == null) result = caseModelElementWithContext(action);
				if (result == null) result = caseModelElement(action);
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
			case PresentationDslPackage.MENU: {
				Menu menu = (Menu)theEObject;
				T result = caseMenu(menu);
				if (result == null) result = caseModelElement(menu);
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
			case PresentationDslPackage.ABSTRACT_DIALOGUE: {
				AbstractDialogue abstractDialogue = (AbstractDialogue)theEObject;
				T result = caseAbstractDialogue(abstractDialogue);
				if (result == null) result = caseUIModelElement(abstractDialogue);
				if (result == null) result = caseModelElementWithContext(abstractDialogue);
				if (result == null) result = caseModelElement(abstractDialogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationDslPackage.DTO_REFERENCE: {
				DtoReference dtoReference = (DtoReference)theEObject;
				T result = caseDtoReference(dtoReference);
				if (result == null) result = caseExternalReference(dtoReference);
				if (result == null) result = caseModelElement(dtoReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationDslPackage.SERVICE_REFERENCE: {
				ServiceReference serviceReference = (ServiceReference)theEObject;
				T result = caseServiceReference(serviceReference);
				if (result == null) result = caseExternalReference(serviceReference);
				if (result == null) result = caseModelElement(serviceReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationDslPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = caseAbstractDialogue(page);
				if (result == null) result = caseUIModelElement(page);
				if (result == null) result = caseModelElementWithContext(page);
				if (result == null) result = caseModelElement(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationDslPackage.PAGE_REFERENCE: {
				PageReference pageReference = (PageReference)theEObject;
				T result = casePageReference(pageReference);
				if (result == null) result = casePage(pageReference);
				if (result == null) result = caseExternalReference(pageReference);
				if (result == null) result = caseAbstractDialogue(pageReference);
				if (result == null) result = caseUIModelElement(pageReference);
				if (result == null) result = caseModelElementWithContext(pageReference);
				if (result == null) result = caseModelElement(pageReference);
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
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenu(Menu object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Dialogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Dialogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDialogue(AbstractDialogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDtoReference(DtoReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceReference(ServiceReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageReference(PageReference object) {
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
