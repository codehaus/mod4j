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
 * A representation of the literals of the enumeration '<em><b>Database Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getDatabaseType()
 * @model
 * @generated
 */
public enum DatabaseType implements Enumerator {
	/**
	 * The '<em><b>SQL Server 2000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQL_SERVER_2000_VALUE
	 * @generated
	 * @ordered
	 */
	SQL_SERVER_2000(0, "SQLServer_2000", "SQLServer_2000"),

	/**
	 * The '<em><b>Oracle Any Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE_ANY_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	ORACLE_ANY_VERSION(0, "Oracle_Any_Version", "Oracle_Any_Version"),

	/**
	 * The '<em><b>My Sql 3or 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_SQL_3OR_4_VALUE
	 * @generated
	 * @ordered
	 */
	MY_SQL_3OR_4(0, "MySql_3_or_4", "MySql_3_or_4"),

	/**
	 * The '<em><b>My Sql 5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_SQL_5_VALUE
	 * @generated
	 * @ordered
	 */
	MY_SQL_5(0, "MySql_5", "MySql_5"),

	/**
	 * The '<em><b>Oracle 9to 10g</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE_9TO_10G_VALUE
	 * @generated
	 * @ordered
	 */
	ORACLE_9TO_10G(0, "Oracle_9_to_10g", "Oracle_9_to_10g"),

	/**
	 * The '<em><b>SQL Server 2005</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQL_SERVER_2005_VALUE
	 * @generated
	 * @ordered
	 */
	SQL_SERVER_2005(0, "SQLServer_2005", "SQLServer_2005"),

	/**
	 * The '<em><b>SQL Server 7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQL_SERVER_7_VALUE
	 * @generated
	 * @ordered
	 */
	SQL_SERVER_7(0, "SQLServer_7", "SQLServer_7");

	/**
	 * The '<em><b>SQL Server 2000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SQL Server 2000</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQL_SERVER_2000
	 * @model name="SQLServer_2000"
	 * @generated
	 * @ordered
	 */
	public static final int SQL_SERVER_2000_VALUE = 0;

	/**
	 * The '<em><b>Oracle Any Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oracle Any Version</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORACLE_ANY_VERSION
	 * @model name="Oracle_Any_Version"
	 * @generated
	 * @ordered
	 */
	public static final int ORACLE_ANY_VERSION_VALUE = 0;

	/**
	 * The '<em><b>My Sql 3or 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>My Sql 3or 4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MY_SQL_3OR_4
	 * @model name="MySql_3_or_4"
	 * @generated
	 * @ordered
	 */
	public static final int MY_SQL_3OR_4_VALUE = 0;

	/**
	 * The '<em><b>My Sql 5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>My Sql 5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MY_SQL_5
	 * @model name="MySql_5"
	 * @generated
	 * @ordered
	 */
	public static final int MY_SQL_5_VALUE = 0;

	/**
	 * The '<em><b>Oracle 9to 10g</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oracle 9to 10g</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORACLE_9TO_10G
	 * @model name="Oracle_9_to_10g"
	 * @generated
	 * @ordered
	 */
	public static final int ORACLE_9TO_10G_VALUE = 0;

	/**
	 * The '<em><b>SQL Server 2005</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SQL Server 2005</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQL_SERVER_2005
	 * @model name="SQLServer_2005"
	 * @generated
	 * @ordered
	 */
	public static final int SQL_SERVER_2005_VALUE = 0;

	/**
	 * The '<em><b>SQL Server 7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SQL Server 7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQL_SERVER_7
	 * @model name="SQLServer_7"
	 * @generated
	 * @ordered
	 */
	public static final int SQL_SERVER_7_VALUE = 0;

	/**
	 * An array of all the '<em><b>Database Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DatabaseType[] VALUES_ARRAY =
		new DatabaseType[] {
			SQL_SERVER_2000,
			ORACLE_ANY_VERSION,
			MY_SQL_3OR_4,
			MY_SQL_5,
			ORACLE_9TO_10G,
			SQL_SERVER_2005,
			SQL_SERVER_7,
		};

	/**
	 * A public read-only list of all the '<em><b>Database Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DatabaseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Database Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatabaseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatabaseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Database Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatabaseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatabaseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Database Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatabaseType get(int value) {
		switch (value) {
			case SQL_SERVER_2000_VALUE: return SQL_SERVER_2000;
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
	private DatabaseType(int value, String name, String literal) {
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
	
} //DatabaseType
