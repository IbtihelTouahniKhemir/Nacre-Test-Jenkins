/**
 */
package nacre;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Voltage Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nacre.NacrePackage#getVoltageLevel()
 * @model
 * @generated
 */
public enum VoltageLevel implements Enumerator {
	/**
	 * The '<em><b>63</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_63_VALUE
	 * @generated
	 * @ordered
	 */
	_63(63, "_63", "_63"), /**
	 * The '<em><b>20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_20_VALUE
	 * @generated
	 * @ordered
	 */
	_20(20, "_20", "_20"), /**
	 * The '<em><b>42</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_42_VALUE
	 * @generated
	 * @ordered
	 */
	_42(42, "_42", "_42"),

	/**
	 * The '<em><b>90</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_90_VALUE
	 * @generated
	 * @ordered
	 */
	_90(90, "_90", "_90"),

	/**
	 * The '<em><b>150</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_150_VALUE
	 * @generated
	 * @ordered
	 */
	_150(150, "_150", "_150"), /**
	 * The '<em><b>225</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_225_VALUE
	 * @generated
	 * @ordered
	 */
	_225(225, "_225", "_225"),

	/**
	 * The '<em><b>380</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_380_VALUE
	 * @generated
	 * @ordered
	 */
	_380(380, "_380", "_380");

	/**
	 * The '<em><b>63</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_63
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='63'"
	 * @generated
	 * @ordered
	 */
	public static final int _63_VALUE = 63;

	/**
	 * The '<em><b>20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_20
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='20'"
	 * @generated
	 * @ordered
	 */
	public static final int _20_VALUE = 20;

	/**
	 * The '<em><b>42</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_42
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='42'"
	 * @generated
	 * @ordered
	 */
	public static final int _42_VALUE = 42;

	/**
	 * The '<em><b>90</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_90
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='90'"
	 * @generated
	 * @ordered
	 */
	public static final int _90_VALUE = 90;

	/**
	 * The '<em><b>150</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_150
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='150'"
	 * @generated
	 * @ordered
	 */
	public static final int _150_VALUE = 150;

	/**
	 * The '<em><b>225</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_225
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='225'"
	 * @generated
	 * @ordered
	 */
	public static final int _225_VALUE = 225;

	/**
	 * The '<em><b>380</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_380
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='380'"
	 * @generated
	 * @ordered
	 */
	public static final int _380_VALUE = 380;

	/**
	 * An array of all the '<em><b>Voltage Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VoltageLevel[] VALUES_ARRAY =
		new VoltageLevel[] {
			_63,
			_20,
			_42,
			_90,
			_150,
			_225,
			_380,
		};

	/**
	 * A public read-only list of all the '<em><b>Voltage Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VoltageLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Voltage Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VoltageLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VoltageLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Voltage Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VoltageLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VoltageLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Voltage Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VoltageLevel get(int value) {
		switch (value) {
			case _63_VALUE: return _63;
			case _20_VALUE: return _20;
			case _42_VALUE: return _42;
			case _90_VALUE: return _90;
			case _150_VALUE: return _150;
			case _225_VALUE: return _225;
			case _380_VALUE: return _380;
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
	private VoltageLevel(int value, String name, String literal) {
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
	
} //VoltageLevel
