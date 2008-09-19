/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.service.mm.ServiceDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Method Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mod4j.dsl.service.mm.ServiceDsl.ServiceDslPackage#getMethodType()
 * @model
 * @generated
 */
public enum MethodType implements Enumerator {
	/**
     * The '<em><b>Create</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CREATE_VALUE
     * @generated
     * @ordered
     */
	CREATE(0, "Create", "Create"),

	/**
     * The '<em><b>Read</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #READ_VALUE
     * @generated
     * @ordered
     */
	READ(1, "Read", "Read"),

	/**
     * The '<em><b>Update</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #UPDATE_VALUE
     * @generated
     * @ordered
     */
	UPDATE(2, "Update", "Update"),

	/**
     * The '<em><b>Delete</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DELETE_VALUE
     * @generated
     * @ordered
     */
	DELETE(3, "Delete", "Delete"),

	/**
     * The '<em><b>Find</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #FIND_VALUE
     * @generated
     * @ordered
     */
	FIND(4, "Find", "Find"),

	/**
     * The '<em><b>Custom</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CUSTOM_VALUE
     * @generated
     * @ordered
     */
	CUSTOM(5, "Custom", "Custom");

	/**
     * The '<em><b>Create</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Create</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CREATE
     * @model name="Create"
     * @generated
     * @ordered
     */
	public static final int CREATE_VALUE = 0;

	/**
     * The '<em><b>Read</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #READ
     * @model name="Read"
     * @generated
     * @ordered
     */
	public static final int READ_VALUE = 1;

	/**
     * The '<em><b>Update</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Update</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #UPDATE
     * @model name="Update"
     * @generated
     * @ordered
     */
	public static final int UPDATE_VALUE = 2;

	/**
     * The '<em><b>Delete</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #DELETE
     * @model name="Delete"
     * @generated
     * @ordered
     */
	public static final int DELETE_VALUE = 3;

	/**
     * The '<em><b>Find</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Find</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #FIND
     * @model name="Find"
     * @generated
     * @ordered
     */
	public static final int FIND_VALUE = 4;

	/**
     * The '<em><b>Custom</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CUSTOM
     * @model name="Custom"
     * @generated
     * @ordered
     */
	public static final int CUSTOM_VALUE = 5;

	/**
     * An array of all the '<em><b>Method Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final MethodType[] VALUES_ARRAY =
		new MethodType[] {
            CREATE,
            READ,
            UPDATE,
            DELETE,
            FIND,
            CUSTOM,
        };

	/**
     * A public read-only list of all the '<em><b>Method Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<MethodType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Method Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static MethodType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MethodType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Method Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static MethodType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MethodType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Method Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static MethodType get(int value) {
        switch (value) {
            case CREATE_VALUE: return CREATE;
            case READ_VALUE: return READ;
            case UPDATE_VALUE: return UPDATE;
            case DELETE_VALUE: return DELETE;
            case FIND_VALUE: return FIND;
            case CUSTOM_VALUE: return CUSTOM;
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
	private MethodType(int value, String name, String literal) {
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
	
} //MethodType
