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

import org.mod4j.dsl.presentation.mm.PresentationDsl.*;

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
			case PresentationDslPackage.VIEW: return createView();
			case PresentationDslPackage.DATA_PROPERTY: return createDataProperty();
			case PresentationDslPackage.DTO_PROPERTY_REFERENCE: return createDtoPropertyReference();
			case PresentationDslPackage.FORM_ELEMENT: return createFormElement();
			case PresentationDslPackage.MODEL_ELEMENT: return createModelElement();
			case PresentationDslPackage.PRESENTATION_MODEL: return createPresentationModel();
			case PresentationDslPackage.ACTION: return createAction();
			case PresentationDslPackage.SERVICE_EXPRESSION: return createServiceExpression();
			case PresentationDslPackage.NAVIGATION_EXPRESSION: return createNavigationExpression();
			case PresentationDslPackage.EXPRESSION: return createExpression();
			case PresentationDslPackage.STANDARD_EXPRESSION: return createStandardExpression();
			case PresentationDslPackage.OPERATION_EXPRESSION: return createOperationExpression();
			case PresentationDslPackage.MENU: return createMenu();
			case PresentationDslPackage.ABSTRACT_DIALOGUE: return createAbstractDialogue();
			case PresentationDslPackage.DTO_REFERENCE: return createDtoReference();
			case PresentationDslPackage.SERVICE_REFERENCE: return createServiceReference();
			case PresentationDslPackage.PAGE: return createPage();
			case PresentationDslPackage.PAGE_REFERENCE: return createPageReference();
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
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
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
	public DtoPropertyReference createDtoPropertyReference() {
		DtoPropertyReferenceImpl dtoPropertyReference = new DtoPropertyReferenceImpl();
		return dtoPropertyReference;
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
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
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
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDialogue createAbstractDialogue() {
		AbstractDialogueImpl abstractDialogue = new AbstractDialogueImpl();
		return abstractDialogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtoReference createDtoReference() {
		DtoReferenceImpl dtoReference = new DtoReferenceImpl();
		return dtoReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceReference createServiceReference() {
		ServiceReferenceImpl serviceReference = new ServiceReferenceImpl();
		return serviceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageReference createPageReference() {
		PageReferenceImpl pageReference = new PageReferenceImpl();
		return pageReference;
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
