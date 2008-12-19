/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Inheritance Modifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getInheritanceModifier()
 * @model
 * @generated
 */
public enum InheritanceModifier implements Enumerator {
    /**
     * The '<em><b>NONE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE(0, "NONE", "None"),

    /**
     * The '<em><b>ABSTRACT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ABSTRACT_VALUE
     * @generated
     * @ordered
     */
    ABSTRACT(1, "ABSTRACT", "Abstract"),

    /**
     * The '<em><b>FINAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FINAL_VALUE
     * @generated
     * @ordered
     */
    FINAL(2, "FINAL", "Sealed");

    /**
     * The '<em><b>NONE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NONE
     * @model literal="None"
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 0;

    /**
     * The '<em><b>ABSTRACT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ABSTRACT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ABSTRACT
     * @model literal="Abstract"
     * @generated
     * @ordered
     */
    public static final int ABSTRACT_VALUE = 1;

    /**
     * The '<em><b>FINAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>FINAL</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FINAL
     * @model literal="Sealed"
     * @generated
     * @ordered
     */
    public static final int FINAL_VALUE = 2;

    /**
     * An array of all the '<em><b>Inheritance Modifier</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final InheritanceModifier[] VALUES_ARRAY =
        new InheritanceModifier[] {
            NONE,
            ABSTRACT,
            FINAL,
        };

    /**
     * A public read-only list of all the '<em><b>Inheritance Modifier</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<InheritanceModifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Inheritance Modifier</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InheritanceModifier get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            InheritanceModifier result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Inheritance Modifier</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InheritanceModifier getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            InheritanceModifier result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Inheritance Modifier</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InheritanceModifier get(int value) {
        switch (value) {
            case NONE_VALUE: return NONE;
            case ABSTRACT_VALUE: return ABSTRACT;
            case FINAL_VALUE: return FINAL;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private InheritanceModifier(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //InheritanceModifier
