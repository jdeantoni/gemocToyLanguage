/*
 * generated by Xtext 2.23.0
 */
package fr.unice.polytech.si5.toylanguage.concretesyntax.serializer;

import com.google.inject.Inject;
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Addition;
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment;
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ParallelAssignment;
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Soustraction;
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyLanguagePackage;
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyProgram;
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable;
import fr.unice.polytech.si5.toylanguage.concretesyntax.services.ToyGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ToySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ToyGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ToyLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ToyLanguagePackage.ADDITION:
				sequence_Addition(context, (Addition) semanticObject); 
				return; 
			case ToyLanguagePackage.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case ToyLanguagePackage.PARALLEL_ASSIGNMENT:
				sequence_ParallelAssignment(context, (ParallelAssignment) semanticObject); 
				return; 
			case ToyLanguagePackage.SOUSTRACTION:
				sequence_Soustraction(context, (Soustraction) semanticObject); 
				return; 
			case ToyLanguagePackage.TOY_PROGRAM:
				sequence_ToyProgram(context, (ToyProgram) semanticObject); 
				return; 
			case ToyLanguagePackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns Addition
	 *     Operation returns Addition
	 *     Addition returns Addition
	 *
	 * Constraint:
	 *     (name=ID? leftVariable=[Variable|EString] rightVariable=[Variable|EString])
	 */
	protected void sequence_Addition(ISerializationContext context, Addition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Assignment
	 *     Assignment returns Assignment
	 *
	 * Constraint:
	 *     (name=ID? ((variable=[Variable|EString] operation=Operation) | (variable=[Variable|EString] operation=Operation)))
	 */
	protected void sequence_Assignment(ISerializationContext context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ParallelAssignment
	 *     ParallelAssignment returns ParallelAssignment
	 *
	 * Constraint:
	 *     (name=ID? ownedAssignments+=Assignment ownedAssignments+=Assignment+)
	 */
	protected void sequence_ParallelAssignment(ISerializationContext context, ParallelAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Soustraction
	 *     Operation returns Soustraction
	 *     Soustraction returns Soustraction
	 *
	 * Constraint:
	 *     (name=ID? leftVariable=[Variable|EString] rightVariable=[Variable|EString])
	 */
	protected void sequence_Soustraction(ISerializationContext context, Soustraction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ToyProgram returns ToyProgram
	 *
	 * Constraint:
	 *     (name=EString ownedVariables+=Variable* ownedStatements+=Statement*)
	 */
	protected void sequence_ToyProgram(ISerializationContext context, ToyProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (name=EString type=VarType initialValue=EDouble)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ToyLanguagePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToyLanguagePackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, ToyLanguagePackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToyLanguagePackage.Literals.VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, ToyLanguagePackage.Literals.VARIABLE__INITIAL_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToyLanguagePackage.Literals.VARIABLE__INITIAL_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getTypeVarTypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVariableAccess().getInitialValueEDoubleParserRuleCall_6_0(), semanticObject.getInitialValue());
		feeder.finish();
	}
	
	
}
