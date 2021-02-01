/**
 */
package fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl;

import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Statement;
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage;
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyProgram;
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toy Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyProgramImpl#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyProgramImpl#getOwnedStatements <em>Owned Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToyProgramImpl extends NamedElementImpl implements ToyProgram {
	/**
	 * The cached value of the '{@link #getOwnedVariables() <em>Owned Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> ownedVariables;

	/**
	 * The cached value of the '{@link #getOwnedStatements() <em>Owned Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> ownedStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToyProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToyLanguagePackage.Literals.TOY_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getOwnedVariables() {
		if (ownedVariables == null) {
			ownedVariables = new EObjectContainmentEList<Variable>(Variable.class, this,
					ToyLanguagePackage.TOY_PROGRAM__OWNED_VARIABLES);
		}
		return ownedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getOwnedStatements() {
		if (ownedStatements == null) {
			ownedStatements = new EObjectContainmentEList<Statement>(Statement.class, this,
					ToyLanguagePackage.TOY_PROGRAM__OWNED_STATEMENTS);
		}
		return ownedStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ToyLanguagePackage.TOY_PROGRAM__OWNED_VARIABLES:
			return ((InternalEList<?>) getOwnedVariables()).basicRemove(otherEnd, msgs);
		case ToyLanguagePackage.TOY_PROGRAM__OWNED_STATEMENTS:
			return ((InternalEList<?>) getOwnedStatements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ToyLanguagePackage.TOY_PROGRAM__OWNED_VARIABLES:
			return getOwnedVariables();
		case ToyLanguagePackage.TOY_PROGRAM__OWNED_STATEMENTS:
			return getOwnedStatements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ToyLanguagePackage.TOY_PROGRAM__OWNED_VARIABLES:
			getOwnedVariables().clear();
			getOwnedVariables().addAll((Collection<? extends Variable>) newValue);
			return;
		case ToyLanguagePackage.TOY_PROGRAM__OWNED_STATEMENTS:
			getOwnedStatements().clear();
			getOwnedStatements().addAll((Collection<? extends Statement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ToyLanguagePackage.TOY_PROGRAM__OWNED_VARIABLES:
			getOwnedVariables().clear();
			return;
		case ToyLanguagePackage.TOY_PROGRAM__OWNED_STATEMENTS:
			getOwnedStatements().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ToyLanguagePackage.TOY_PROGRAM__OWNED_VARIABLES:
			return ownedVariables != null && !ownedVariables.isEmpty();
		case ToyLanguagePackage.TOY_PROGRAM__OWNED_STATEMENTS:
			return ownedStatements != null && !ownedStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ToyProgramImpl
