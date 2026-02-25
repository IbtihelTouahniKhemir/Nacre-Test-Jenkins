/**
 */
package nacre;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nacre.NacrePackage#getControlType()
 * @model
 * @generated
 */
public enum ControlType implements Enumerator {
	/**
	 * The '<em><b>Default Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT_CONTROL(0, "DefaultControl", "DefaultControl"), /**
	 * The '<em><b>Approximate Linear MPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROXIMATE_LINEAR_MPC_VALUE
	 * @generated
	 * @ordered
	 */
	APPROXIMATE_LINEAR_MPC(1, "ApproximateLinearMPC", "ApproximateLinearMPC"), /**
	 * The '<em><b>Mixed Logical Dynamical MPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED_LOGICAL_DYNAMICAL_MPC_VALUE
	 * @generated
	 * @ordered
	 */
	MIXED_LOGICAL_DYNAMICAL_MPC(2, "MixedLogicalDynamicalMPC", "MixedLogicalDynamicalMPC"), /**
	 * The '<em><b>MPC Rte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MPC_RTE_VALUE
	 * @generated
	 * @ordered
	 */
	MPC_RTE(3, "MPCRte", "MPCRte"), /**
	 * The '<em><b>Limiter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMITER_VALUE
	 * @generated
	 * @ordered
	 */
	LIMITER(4, "Limiter", "Limiter"), /**
	 * The '<em><b>Release all</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELEASE_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	RELEASE_ALL(5, "Release_all", "Release_all");

	/**
	 * The '<em><b>Default Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_CONTROL
	 * @model name="DefaultControl"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_CONTROL_VALUE = 0;

	/**
	 * The '<em><b>Approximate Linear MPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROXIMATE_LINEAR_MPC
	 * @model name="ApproximateLinearMPC"
	 * @generated
	 * @ordered
	 */
	public static final int APPROXIMATE_LINEAR_MPC_VALUE = 1;

	/**
	 * The '<em><b>Mixed Logical Dynamical MPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED_LOGICAL_DYNAMICAL_MPC
	 * @model name="MixedLogicalDynamicalMPC"
	 * @generated
	 * @ordered
	 */
	public static final int MIXED_LOGICAL_DYNAMICAL_MPC_VALUE = 2;

	/**
	 * The '<em><b>MPC Rte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MPC_RTE
	 * @model name="MPCRte"
	 * @generated
	 * @ordered
	 */
	public static final int MPC_RTE_VALUE = 3;

	/**
	 * The '<em><b>Limiter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMITER
	 * @model name="Limiter"
	 * @generated
	 * @ordered
	 */
	public static final int LIMITER_VALUE = 4;

	/**
	 * The '<em><b>Release all</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELEASE_ALL
	 * @model name="Release_all"
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_ALL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Control Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControlType[] VALUES_ARRAY =
		new ControlType[] {
			DEFAULT_CONTROL,
			APPROXIMATE_LINEAR_MPC,
			MIXED_LOGICAL_DYNAMICAL_MPC,
			MPC_RTE,
			LIMITER,
			RELEASE_ALL,
		};

	/**
	 * A public read-only list of all the '<em><b>Control Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControlType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Control Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlType get(int value) {
		switch (value) {
			case DEFAULT_CONTROL_VALUE: return DEFAULT_CONTROL;
			case APPROXIMATE_LINEAR_MPC_VALUE: return APPROXIMATE_LINEAR_MPC;
			case MIXED_LOGICAL_DYNAMICAL_MPC_VALUE: return MIXED_LOGICAL_DYNAMICAL_MPC;
			case MPC_RTE_VALUE: return MPC_RTE;
			case LIMITER_VALUE: return LIMITER;
			case RELEASE_ALL_VALUE: return RELEASE_ALL;
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
	private ControlType(int value, String name, String literal) {
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
	
} //ControlType
