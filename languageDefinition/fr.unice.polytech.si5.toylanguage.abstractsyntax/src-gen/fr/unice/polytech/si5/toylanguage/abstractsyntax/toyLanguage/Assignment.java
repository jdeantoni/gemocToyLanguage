/**
 */
package fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment#getVariable <em>Variable</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Statement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage#getAssignment_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(Operation)
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage#getAssignment_Operation()
	 * @model containment="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // Assignment
