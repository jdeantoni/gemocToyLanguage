/**
 */
package fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl;

import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment;
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ParallelAssignment;
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ParallelAssignmentImpl#getOwnedAssignments <em>Owned Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParallelAssignmentImpl extends StatementImpl implements ParallelAssignment {
	/**
	 * The cached value of the '{@link #getOwnedAssignments() <em>Owned Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> ownedAssignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToyLanguagePackage.Literals.PARALLEL_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assignment> getOwnedAssignments() {
		if (ownedAssignments == null) {
			ownedAssignments = new EObjectContainmentEList<Assignment>(Assignment.class, this,
					ToyLanguagePackage.PARALLEL_ASSIGNMENT__OWNED_ASSIGNMENTS);
		}
		return ownedAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ToyLanguagePackage.PARALLEL_ASSIGNMENT__OWNED_ASSIGNMENTS:
			return ((InternalEList<?>) getOwnedAssignments()).basicRemove(otherEnd, msgs);
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
		case ToyLanguagePackage.PARALLEL_ASSIGNMENT__OWNED_ASSIGNMENTS:
			return getOwnedAssignments();
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
		case ToyLanguagePackage.PARALLEL_ASSIGNMENT__OWNED_ASSIGNMENTS:
			getOwnedAssignments().clear();
			getOwnedAssignments().addAll((Collection<? extends Assignment>) newValue);
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
		case ToyLanguagePackage.PARALLEL_ASSIGNMENT__OWNED_ASSIGNMENTS:
			getOwnedAssignments().clear();
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
		case ToyLanguagePackage.PARALLEL_ASSIGNMENT__OWNED_ASSIGNMENTS:
			return ownedAssignments != null && !ownedAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParallelAssignmentImpl
