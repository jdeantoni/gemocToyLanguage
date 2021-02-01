/**
 */
package fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toy Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyProgram#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyProgram#getOwnedStatements <em>Owned Statements</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage#getToyProgram()
 * @model
 * @generated
 */
public interface ToyProgram extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Variables</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Variables</em>' containment reference list.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage#getToyProgram_OwnedVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOwnedVariables();

	/**
	 * Returns the value of the '<em><b>Owned Statements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Statements</em>' containment reference list.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage#getToyProgram_OwnedStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getOwnedStatements();

} // ToyProgram
