/**
 */
package fr.cea.nacre.model.NACREMM.cra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Redundancy Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.cea.nacre.model.NACREMM.cra.CraPackage#getRedundancyKind()
 * @model
 * @generated
 */
public enum RedundancyKind implements Enumerator {
	/**
	 * The '<em><b>Consensus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSENSUS_VALUE
	 * @generated
	 * @ordered
	 */
	CONSENSUS(0, "consensus", "consensus"),

	/**
	 * The '<em><b>Hypervisor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYPERVISOR_VALUE
	 * @generated
	 * @ordered
	 */
	HYPERVISOR(1, "hypervisor", "hypervisor"),

	/**
	 * The '<em><b>Active standby</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_STANDBY_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE_STANDBY(2, "active_standby", "active_standby");

	/**
	 * The '<em><b>Consensus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSENSUS
	 * @model name="consensus"
	 * @generated
	 * @ordered
	 */
	public static final int CONSENSUS_VALUE = 0;

	/**
	 * The '<em><b>Hypervisor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYPERVISOR
	 * @model name="hypervisor"
	 * @generated
	 * @ordered
	 */
	public static final int HYPERVISOR_VALUE = 1;

	/**
	 * The '<em><b>Active standby</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_STANDBY
	 * @model name="active_standby"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_STANDBY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Redundancy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RedundancyKind[] VALUES_ARRAY =
		new RedundancyKind[] {
			CONSENSUS,
			HYPERVISOR,
			ACTIVE_STANDBY,
		};

	/**
	 * A public read-only list of all the '<em><b>Redundancy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RedundancyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Redundancy Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RedundancyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RedundancyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Redundancy Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RedundancyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RedundancyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Redundancy Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RedundancyKind get(int value) {
		switch (value) {
			case CONSENSUS_VALUE: return CONSENSUS;
			case HYPERVISOR_VALUE: return HYPERVISOR;
			case ACTIVE_STANDBY_VALUE: return ACTIVE_STANDBY;
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
	private RedundancyKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //RedundancyKind
