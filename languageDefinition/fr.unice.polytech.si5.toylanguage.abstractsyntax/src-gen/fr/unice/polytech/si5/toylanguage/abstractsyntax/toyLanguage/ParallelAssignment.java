/**
 */
package fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ParallelAssignment#getOwnedAssignments <em>Owned Assignments</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage#getParallelAssignment()
 * @model
 * @generated
 */
public interface ParallelAssignment extends Statement {
	/**
	 * Returns the value of the '<em><b>Owned Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Assignments</em>' containment reference list.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage#getParallelAssignment_OwnedAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assignment> getOwnedAssignments();

} // ParallelAssignment
