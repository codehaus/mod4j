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
 * A representation of the literals of the enumeration '<em><b>Access Modifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getAccessModifier()
 * @model
 * @generated
 */
public enum AccessModifier implements Enumerator {
	/**
	 * The '<em><b>Public</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC(0, "Public", "Public"),

	/**
	 * The '<em><b>Assembly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSEMBLY_VALUE
	 * @generated
	 * @ordered
	 */
	ASSEMBLY(1, "Assembly", "Assembly"),

	/**
	 * The '<em><b>Private</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE(2, "Private", "Private"),

	/**
	 * The '<em><b>Family</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILY_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY(3, "Family", "Family"),

	/**
	 * The '<em><b>Family Or Assembly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILY_OR_ASSEMBLY_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY_OR_ASSEMBLY(4, "FamilyOrAssembly", "FamilyOrAssembly"),

	/**
	 * The '<em><b>Family And Assembly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILY_AND_ASSEMBLY_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY_AND_ASSEMBLY(5, "FamilyAndAssembly", "FamilyAndAssembly");

	/**
	 * The '<em><b>Public</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Public</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLIC
	 * @model name="Public"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_VALUE = 0;

	/**
	 * The '<em><b>Assembly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assembly</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSEMBLY
	 * @model name="Assembly"
	 * @generated
	 * @ordered
	 */
	public static final int ASSEMBLY_VALUE = 1;

	/**
	 * The '<em><b>Private</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Private</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIVATE
	 * @model name="Private"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_VALUE = 2;

	/**
	 * The '<em><b>Family</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Family</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAMILY
	 * @model name="Family"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILY_VALUE = 3;

	/**
	 * The '<em><b>Family Or Assembly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Family Or Assembly</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAMILY_OR_ASSEMBLY
	 * @model name="FamilyOrAssembly"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILY_OR_ASSEMBLY_VALUE = 4;

	/**
	 * The '<em><b>Family And Assembly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Family And Assembly</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAMILY_AND_ASSEMBLY
	 * @model name="FamilyAndAssembly"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILY_AND_ASSEMBLY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Access Modifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AccessModifier[] VALUES_ARRAY =
		new AccessModifier[] {
			PUBLIC,
			ASSEMBLY,
			PRIVATE,
			FAMILY,
			FAMILY_OR_ASSEMBLY,
			FAMILY_AND_ASSEMBLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Access Modifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AccessModifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Access Modifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessModifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessModifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Modifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessModifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessModifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Modifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessModifier get(int value) {
		switch (value) {
			case PUBLIC_VALUE: return PUBLIC;
			case ASSEMBLY_VALUE: return ASSEMBLY;
			case PRIVATE_VALUE: return PRIVATE;
			case FAMILY_VALUE: return FAMILY;
			case FAMILY_OR_ASSEMBLY_VALUE: return FAMILY_OR_ASSEMBLY;
			case FAMILY_AND_ASSEMBLY_VALUE: return FAMILY_AND_ASSEMBLY;
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
	private AccessModifier(int value, String name, String literal) {
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
	
} //AccessModifier
