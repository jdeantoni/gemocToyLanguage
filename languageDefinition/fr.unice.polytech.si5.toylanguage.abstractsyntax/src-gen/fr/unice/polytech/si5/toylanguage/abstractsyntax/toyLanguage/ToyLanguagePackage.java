/**
 */
package fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface ToyLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "toyLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polytech.unice.fr/toyLanguage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "toyLanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToyLanguagePackage eINSTANCE = fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.NamedElementImpl
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyProgramImpl <em>Toy Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyProgramImpl
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getToyProgram()
	 * @generated
	 */
	int TOY_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOY_PROGRAM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOY_PROGRAM__OWNED_VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOY_PROGRAM__OWNED_STATEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Toy Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOY_PROGRAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Toy Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOY_PROGRAM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.VariableImpl
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INITIAL_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___INITIALIZE = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.StatementImpl
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT___EXECUTE = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.OperationImpl
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Left Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LEFT_VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RIGHT_VARIABLE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___EXECUTE = STATEMENT___EXECUTE;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.AdditionImpl
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Left Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__LEFT_VARIABLE = OPERATION__LEFT_VARIABLE;

	/**
	 * The feature id for the '<em><b>Right Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__RIGHT_VARIABLE = OPERATION__RIGHT_VARIABLE;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION___EXECUTE = OPERATION___EXECUTE;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.SoustractionImpl <em>Soustraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.SoustractionImpl
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getSoustraction()
	 * @generated
	 */
	int SOUSTRACTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Left Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION__LEFT_VARIABLE = OPERATION__LEFT_VARIABLE;

	/**
	 * The feature id for the '<em><b>Right Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION__RIGHT_VARIABLE = OPERATION__RIGHT_VARIABLE;

	/**
	 * The number of structural features of the '<em>Soustraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION___EXECUTE = OPERATION___EXECUTE;

	/**
	 * The number of operations of the '<em>Soustraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUSTRACTION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.AssignmentImpl
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__OPERATION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___EXECUTE = STATEMENT___EXECUTE;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ParallelAssignmentImpl <em>Parallel Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ParallelAssignmentImpl
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getParallelAssignment()
	 * @generated
	 */
	int PARALLEL_ASSIGNMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ASSIGNMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ASSIGNMENT__OWNED_ASSIGNMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parallel Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ASSIGNMENT___EXECUTE = STATEMENT___EXECUTE;

	/**
	 * The number of operations of the '<em>Parallel Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ASSIGNMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.VarType <em>Var Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.VarType
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getVarType()
	 * @generated
	 */
	int VAR_TYPE = 9;

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyProgram <em>Toy Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toy Program</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyProgram
	 * @generated
	 */
	EClass getToyProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyProgram#getOwnedVariables <em>Owned Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Variables</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyProgram#getOwnedVariables()
	 * @see #getToyProgram()
	 * @generated
	 */
	EReference getToyProgram_OwnedVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyProgram#getOwnedStatements <em>Owned Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Statements</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyProgram#getOwnedStatements()
	 * @see #getToyProgram()
	 * @generated
	 */
	EReference getToyProgram_OwnedStatements();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable#getInitialValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_InitialValue();

	/**
	 * Returns the meta object for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable#initialize()
	 * @generated
	 */
	EOperation getVariable__Initialize();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Operation#getLeftVariable <em>Left Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Variable</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Operation#getLeftVariable()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_LeftVariable();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Operation#getRightVariable <em>Right Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Variable</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Operation#getRightVariable()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_RightVariable();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Soustraction <em>Soustraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soustraction</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Soustraction
	 * @generated
	 */
	EClass getSoustraction();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment#getVariable()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment#getOperation()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Operation();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Statement#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Statement#execute()
	 * @generated
	 */
	EOperation getStatement__Execute();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ParallelAssignment <em>Parallel Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Assignment</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ParallelAssignment
	 * @generated
	 */
	EClass getParallelAssignment();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ParallelAssignment#getOwnedAssignments <em>Owned Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Assignments</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ParallelAssignment#getOwnedAssignments()
	 * @see #getParallelAssignment()
	 * @generated
	 */
	EReference getParallelAssignment_OwnedAssignments();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Var Type</em>'.
	 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.VarType
	 * @generated
	 */
	EEnum getVarType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToyLanguageFactory getToyLanguageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyProgramImpl <em>Toy Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyProgramImpl
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getToyProgram()
		 * @generated
		 */
		EClass TOY_PROGRAM = eINSTANCE.getToyProgram();

		/**
		 * The meta object literal for the '<em><b>Owned Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOY_PROGRAM__OWNED_VARIABLES = eINSTANCE.getToyProgram_OwnedVariables();

		/**
		 * The meta object literal for the '<em><b>Owned Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOY_PROGRAM__OWNED_STATEMENTS = eINSTANCE.getToyProgram_OwnedStatements();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.VariableImpl
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__INITIAL_VALUE = eINSTANCE.getVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE___INITIALIZE = eINSTANCE.getVariable__Initialize();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.OperationImpl
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Left Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__LEFT_VARIABLE = eINSTANCE.getOperation_LeftVariable();

		/**
		 * The meta object literal for the '<em><b>Right Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RIGHT_VARIABLE = eINSTANCE.getOperation_RightVariable();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.AdditionImpl
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.SoustractionImpl <em>Soustraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.SoustractionImpl
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getSoustraction()
		 * @generated
		 */
		EClass SOUSTRACTION = eINSTANCE.getSoustraction();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.AssignmentImpl
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VARIABLE = eINSTANCE.getAssignment_Variable();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__OPERATION = eINSTANCE.getAssignment_Operation();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.NamedElementImpl
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.StatementImpl
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATEMENT___EXECUTE = eINSTANCE.getStatement__Execute();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ParallelAssignmentImpl <em>Parallel Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ParallelAssignmentImpl
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getParallelAssignment()
		 * @generated
		 */
		EClass PARALLEL_ASSIGNMENT = eINSTANCE.getParallelAssignment();

		/**
		 * The meta object literal for the '<em><b>Owned Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_ASSIGNMENT__OWNED_ASSIGNMENTS = eINSTANCE.getParallelAssignment_OwnedAssignments();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.VarType <em>Var Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.VarType
		 * @see fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.impl.ToyLanguagePackageImpl#getVarType()
		 * @generated
		 */
		EEnum VAR_TYPE = eINSTANCE.getVarType();

	}

} //ToyLanguagePackage
