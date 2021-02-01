/**
 */
package fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Operation#getLeftVariable <em>Left Variable</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Operation#getRightVariable <em>Right Variable</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends Statement {

	/**
	 * Returns the value of the '<em><b>Left Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Variable</em>' reference.
	 * @see #setLeftVariable(Variable)
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage#getOperation_LeftVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getLeftVariable();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Operation#getLeftVariable <em>Left Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Variable</em>' reference.
	 * @see #getLeftVariable()
	 * @generated
	 */
	void setLeftVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Right Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Variable</em>' reference.
	 * @see #setRightVariable(Variable)
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage#getOperation_RightVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getRightVariable();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Operation#getRightVariable <em>Right Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Variable</em>' reference.
	 * @see #getRightVariable()
	 * @generated
	 */
	void setRightVariable(Variable value);
} // Operation
