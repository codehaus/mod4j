/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.datacontract.mm.DataContractDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mod4j.dsl.datacontract.mm.DataContractDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractDslPackage
 * @generated
 */
public class DataContractDslAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DataContractDslPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataContractDslAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DataContractDslPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataContractDslSwitch<Adapter> modelSwitch =
        new DataContractDslSwitch<Adapter>() {
            @Override
            public Adapter caseDataContractModel(DataContractModel object) {
                return createDataContractModelAdapter();
            }
            @Override
            public Adapter caseDto(Dto object) {
                return createDtoAdapter();
            }
            @Override
            public Adapter caseBusinessClassDto(BusinessClassDto object) {
                return createBusinessClassDtoAdapter();
            }
            @Override
            public Adapter caseListDto(ListDto object) {
                return createListDtoAdapter();
            }
            @Override
            public Adapter caseSubsetDto(SubsetDto object) {
                return createSubsetDtoAdapter();
            }
            @Override
            public Adapter caseCompositeDto(CompositeDto object) {
                return createCompositeDtoAdapter();
            }
            @Override
            public Adapter caseReferenceDto(ReferenceDto object) {
                return createReferenceDtoAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter casePropertyReference(PropertyReference object) {
                return createPropertyReferenceAdapter();
            }
            @Override
            public Adapter caseDataProperty(DataProperty object) {
                return createDataPropertyAdapter();
            }
            @Override
            public Adapter caseStringProperty(StringProperty object) {
                return createStringPropertyAdapter();
            }
            @Override
            public Adapter caseBooleanProperty(BooleanProperty object) {
                return createBooleanPropertyAdapter();
            }
            @Override
            public Adapter caseEnumeration(Enumeration object) {
                return createEnumerationAdapter();
            }
            @Override
            public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
                return createEnumerationLiteralAdapter();
            }
            @Override
            public Adapter caseModelElement(ModelElement object) {
                return createModelElementAdapter();
            }
            @Override
            public Adapter caseCustomDto(CustomDto object) {
                return createCustomDtoAdapter();
            }
            @Override
            public Adapter caseBusinessClassReference(BusinessClassReference object) {
                return createBusinessClassReferenceAdapter();
            }
            @Override
            public Adapter caseIntegerProperty(IntegerProperty object) {
                return createIntegerPropertyAdapter();
            }
            @Override
            public Adapter caseDecimalProperty(DecimalProperty object) {
                return createDecimalPropertyAdapter();
            }
            @Override
            public Adapter caseEnumerationProperty(EnumerationProperty object) {
                return createEnumerationPropertyAdapter();
            }
            @Override
            public Adapter caseDateTimeProperty(DateTimeProperty object) {
                return createDateTimePropertyAdapter();
            }
            @Override
            public Adapter caseEClass0(EClass0 object) {
                return createEClass0Adapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel <em>Data Contract Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel
     * @generated
     */
    public Adapter createDataContractModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto <em>Dto</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto
     * @generated
     */
    public Adapter createDtoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto <em>Business Class Dto</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto
     * @generated
     */
    public Adapter createBusinessClassDtoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.ListDto <em>List Dto</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.ListDto
     * @generated
     */
    public Adapter createListDtoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.SubsetDto <em>Subset Dto</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.SubsetDto
     * @generated
     */
    public Adapter createSubsetDtoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.CompositeDto <em>Composite Dto</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.CompositeDto
     * @generated
     */
    public Adapter createCompositeDtoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.ReferenceDto <em>Reference Dto</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.ReferenceDto
     * @generated
     */
    public Adapter createReferenceDtoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.PropertyReference <em>Property Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.PropertyReference
     * @generated
     */
    public Adapter createPropertyReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DataProperty <em>Data Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DataProperty
     * @generated
     */
    public Adapter createDataPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.StringProperty <em>String Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.StringProperty
     * @generated
     */
    public Adapter createStringPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BooleanProperty <em>Boolean Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BooleanProperty
     * @generated
     */
    public Adapter createBooleanPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.Enumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.Enumeration
     * @generated
     */
    public Adapter createEnumerationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.EnumerationLiteral <em>Enumeration Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.EnumerationLiteral
     * @generated
     */
    public Adapter createEnumerationLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.ModelElement <em>Model Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.ModelElement
     * @generated
     */
    public Adapter createModelElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.CustomDto <em>Custom Dto</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.CustomDto
     * @generated
     */
    public Adapter createCustomDtoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference <em>Business Class Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassReference
     * @generated
     */
    public Adapter createBusinessClassReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.IntegerProperty <em>Integer Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.IntegerProperty
     * @generated
     */
    public Adapter createIntegerPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DecimalProperty <em>Decimal Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DecimalProperty
     * @generated
     */
    public Adapter createDecimalPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.EnumerationProperty <em>Enumeration Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.EnumerationProperty
     * @generated
     */
    public Adapter createEnumerationPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.DateTimeProperty <em>Date Time Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.DateTimeProperty
     * @generated
     */
    public Adapter createDateTimePropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mod4j.dsl.datacontract.mm.DataContractDsl.EClass0 <em>EClass0</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mod4j.dsl.datacontract.mm.DataContractDsl.EClass0
     * @generated
     */
    public Adapter createEClass0Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //DataContractDslAdapterFactory
