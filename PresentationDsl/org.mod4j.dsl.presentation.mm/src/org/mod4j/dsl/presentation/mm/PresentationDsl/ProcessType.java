/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Process Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getProcessType()
 * @model
 * @generated
 */
public enum ProcessType implements Enumerator {
    /**
     * The '<em><b>NEW</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NEW_VALUE
     * @generated
     * @ordered
     */
    NEW(0, "NEW", "NEW"),

    /**
     * The '<em><b>SAVE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SAVE_VALUE
     * @generated
     * @ordered
     */
    SAVE(1, "SAVE", "SAVE"),

    /**
     * The '<em><b>EDIT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EDIT_VALUE
     * @generated
     * @ordered
     */
    EDIT(2, "EDIT", "EDIT"),

    /**
     * The '<em><b>DELETE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DELETE_VALUE
     * @generated
     * @ordered
     */
    DELETE(3, "DELETE", "DELETE"),

    /**
     * The '<em><b>CUSTOM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CUSTOM_VALUE
     * @generated
     * @ordered
     */
    CUSTOM(4, "CUSTOM", "CUSTOM"),

    /**
     * The '<em><b>CANCEL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CANCEL_VALUE
     * @generated
     * @ordered
     */
    CANCEL(5, "CANCEL", "CANCEL"),

    /**
     * The '<em><b>ADDTO</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ADDTO_VALUE
     * @generated
     * @ordered
     */
    ADDTO(6, "ADDTO", "ADDTO"),

    /**
     * The '<em><b>REMOVEFROM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMOVEFROM_VALUE
     * @generated
     * @ordered
     */
    REMOVEFROM(7, "REMOVEFROM", "REMOVEFROM"),

    /**
     * The '<em><b>LINK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LINK_VALUE
     * @generated
     * @ordered
     */
    LINK(8, "LINK", "LINK");

    /**
     * The '<em><b>NEW</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NEW</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NEW
     * @model
     * @generated
     * @ordered
     */
    public static final int NEW_VALUE = 0;

    /**
     * The '<em><b>SAVE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SAVE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SAVE
     * @model
     * @generated
     * @ordered
     */
    public static final int SAVE_VALUE = 1;

    /**
     * The '<em><b>EDIT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>EDIT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EDIT
     * @model
     * @generated
     * @ordered
     */
    public static final int EDIT_VALUE = 2;

    /**
     * The '<em><b>DELETE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DELETE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DELETE
     * @model
     * @generated
     * @ordered
     */
    public static final int DELETE_VALUE = 3;

    /**
     * The '<em><b>CUSTOM</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CUSTOM</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CUSTOM
     * @model
     * @generated
     * @ordered
     */
    public static final int CUSTOM_VALUE = 4;

    /**
     * The '<em><b>CANCEL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CANCEL</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CANCEL
     * @model
     * @generated
     * @ordered
     */
    public static final int CANCEL_VALUE = 5;

    /**
     * The '<em><b>ADDTO</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ADDTO</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ADDTO
     * @model
     * @generated
     * @ordered
     */
    public static final int ADDTO_VALUE = 6;

    /**
     * The '<em><b>REMOVEFROM</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>REMOVEFROM</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REMOVEFROM
     * @model
     * @generated
     * @ordered
     */
    public static final int REMOVEFROM_VALUE = 7;

    /**
     * The '<em><b>LINK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LINK</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LINK
     * @model
     * @generated
     * @ordered
     */
    public static final int LINK_VALUE = 8;

    /**
     * An array of all the '<em><b>Process Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ProcessType[] VALUES_ARRAY =
        new ProcessType[] {
            NEW,
            SAVE,
            EDIT,
            DELETE,
            CUSTOM,
            CANCEL,
            ADDTO,
            REMOVEFROM,
            LINK,
        };

    /**
     * A public read-only list of all the '<em><b>Process Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ProcessType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Process Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ProcessType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ProcessType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Process Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ProcessType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ProcessType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Process Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ProcessType get(int value) {
        switch (value) {
            case NEW_VALUE: return NEW;
            case SAVE_VALUE: return SAVE;
            case EDIT_VALUE: return EDIT;
            case DELETE_VALUE: return DELETE;
            case CUSTOM_VALUE: return CUSTOM;
            case CANCEL_VALUE: return CANCEL;
            case ADDTO_VALUE: return ADDTO;
            case REMOVEFROM_VALUE: return REMOVEFROM;
            case LINK_VALUE: return LINK;
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
    private ProcessType(int value, String name, String literal) {
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
    
} //ProcessType
