/**
 */
package fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl;

import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Operation;
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage;

import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.OperationImpl#getLeftVariable <em>Left Variable</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.OperationImpl#getRightVariable <em>Right Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationImpl extends StatementImpl implements Operation {
	/**
	 * The cached value of the '{@link #getLeftVariable() <em>Left Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable leftVariable;
	/**
	 * The cached value of the '{@link #getRightVariable() <em>Right Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable rightVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToyLanguagePackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getLeftVariable() {
		if (leftVariable != null && leftVariable.eIsProxy()) {
			InternalEObject oldLeftVariable = (InternalEObject) leftVariable;
			leftVariable = (Variable) eResolveProxy(oldLeftVariable);
			if (leftVariable != oldLeftVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ToyLanguagePackage.OPERATION__LEFT_VARIABLE, oldLeftVariable, leftVariable));
			}
		}
		return leftVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetLeftVariable() {
		return leftVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftVariable(Variable newLeftVariable) {
		Variable oldLeftVariable = leftVariable;
		leftVariable = newLeftVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToyLanguagePackage.OPERATION__LEFT_VARIABLE,
					oldLeftVariable, leftVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getRightVariable() {
		if (rightVariable != null && rightVariable.eIsProxy()) {
			InternalEObject oldRightVariable = (InternalEObject) rightVariable;
			rightVariable = (Variable) eResolveProxy(oldRightVariable);
			if (rightVariable != oldRightVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ToyLanguagePackage.OPERATION__RIGHT_VARIABLE, oldRightVariable, rightVariable));
			}
		}
		return rightVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetRightVariable() {
		return rightVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightVariable(Variable newRightVariable) {
		Variable oldRightVariable = rightVariable;
		rightVariable = newRightVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToyLanguagePackage.OPERATION__RIGHT_VARIABLE,
					oldRightVariable, rightVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ToyLanguagePackage.OPERATION__LEFT_VARIABLE:
			if (resolve)
				return getLeftVariable();
			return basicGetLeftVariable();
		case ToyLanguagePackage.OPERATION__RIGHT_VARIABLE:
			if (resolve)
				return getRightVariable();
			return basicGetRightVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ToyLanguagePackage.OPERATION__LEFT_VARIABLE:
			setLeftVariable((Variable) newValue);
			return;
		case ToyLanguagePackage.OPERATION__RIGHT_VARIABLE:
			setRightVariable((Variable) newValue);
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
		case ToyLanguagePackage.OPERATION__LEFT_VARIABLE:
			setLeftVariable((Variable) null);
			return;
		case ToyLanguagePackage.OPERATION__RIGHT_VARIABLE:
			setRightVariable((Variable) null);
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
		case ToyLanguagePackage.OPERATION__LEFT_VARIABLE:
			return leftVariable != null;
		case ToyLanguagePackage.OPERATION__RIGHT_VARIABLE:
			return rightVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
