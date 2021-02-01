/*
 * generated by Xtext 2.23.0
 */
package fr.unice.polytech.si5.toylanguage.concretesyntax.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ToyGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ToyProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.ToyProgram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cToyProgramAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cProgramKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cOwnedVariablesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOwnedVariablesVariableParserRuleCall_3_0 = (RuleCall)cOwnedVariablesAssignment_3.eContents().get(0);
		private final Assignment cOwnedStatementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOwnedStatementsStatementParserRuleCall_4_0 = (RuleCall)cOwnedStatementsAssignment_4.eContents().get(0);
		
		//ToyProgram:
		//	{ToyProgram}
		//	'program'
		//	name=EString
		//	ownedVariables+=Variable*
		//	ownedStatements+=Statement*;
		@Override public ParserRule getRule() { return rule; }
		
		//{ToyProgram} 'program' name=EString ownedVariables+=Variable* ownedStatements+=Statement*
		public Group getGroup() { return cGroup; }
		
		//{ToyProgram}
		public Action getToyProgramAction_0() { return cToyProgramAction_0; }
		
		//'program'
		public Keyword getProgramKeyword_1() { return cProgramKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//ownedVariables+=Variable*
		public Assignment getOwnedVariablesAssignment_3() { return cOwnedVariablesAssignment_3; }
		
		//Variable
		public RuleCall getOwnedVariablesVariableParserRuleCall_3_0() { return cOwnedVariablesVariableParserRuleCall_3_0; }
		
		//ownedStatements+=Statement*
		public Assignment getOwnedStatementsAssignment_4() { return cOwnedStatementsAssignment_4; }
		
		//Statement
		public RuleCall getOwnedStatementsStatementParserRuleCall_4_0() { return cOwnedStatementsStatementParserRuleCall_4_0; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cOperationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAssignmentParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cParallelAssignmentParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Statement:
		//	Operation | Assignment | ParallelAssignment;
		@Override public ParserRule getRule() { return rule; }
		
		//Operation | Assignment | ParallelAssignment
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Operation
		public RuleCall getOperationParserRuleCall_0() { return cOperationParserRuleCall_0; }
		
		//Assignment
		public RuleCall getAssignmentParserRuleCall_1() { return cAssignmentParserRuleCall_1; }
		
		//ParallelAssignment
		public RuleCall getParallelAssignmentParserRuleCall_2() { return cParallelAssignmentParserRuleCall_2; }
	}
	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.Operation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAdditionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSoustractionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Operation:
		//	Addition | Soustraction;
		@Override public ParserRule getRule() { return rule; }
		
		//Addition | Soustraction
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Addition
		public RuleCall getAdditionParserRuleCall_0() { return cAdditionParserRuleCall_0; }
		
		//Soustraction
		public RuleCall getSoustractionParserRuleCall_1() { return cSoustractionParserRuleCall_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVariableAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVarKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeVarTypeEnumRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
		private final Keyword cEqualsSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cInitialValueAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cInitialValueEDoubleParserRuleCall_6_0 = (RuleCall)cInitialValueAssignment_6.eContents().get(0);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Variable:
		//	{Variable}
		//	'Var' name=EString ':' type=VarType '=' initialValue=EDouble ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Variable} 'Var' name=EString ':' type=VarType '=' initialValue=EDouble ';'?
		public Group getGroup() { return cGroup; }
		
		//{Variable}
		public Action getVariableAction_0() { return cVariableAction_0; }
		
		//'Var'
		public Keyword getVarKeyword_1() { return cVarKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//type=VarType
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//VarType
		public RuleCall getTypeVarTypeEnumRuleCall_4_0() { return cTypeVarTypeEnumRuleCall_4_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_5() { return cEqualsSignKeyword_5; }
		
		//initialValue=EDouble
		public Assignment getInitialValueAssignment_6() { return cInitialValueAssignment_6; }
		
		//EDouble
		public RuleCall getInitialValueEDoubleParserRuleCall_6_0() { return cInitialValueEDoubleParserRuleCall_6_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class EDoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.EDouble");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_4_0 = (Alternatives)cGroup_4.eContents().get(0);
		private final Keyword cEKeyword_4_0_0 = (Keyword)cAlternatives_4_0.eContents().get(0);
		private final Keyword cEKeyword_4_0_1 = (Keyword)cAlternatives_4_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_4_2 = (RuleCall)cGroup_4.eContents().get(2);
		
		//EDouble ecore::EDouble:
		//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT? '.' INT (('E' | 'e') '-'? INT)?
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
		
		//(('E' | 'e') '-'? INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//('E' | 'e')
		public Alternatives getAlternatives_4_0() { return cAlternatives_4_0; }
		
		//'E'
		public Keyword getEKeyword_4_0_0() { return cEKeyword_4_0_0; }
		
		//'e'
		public Keyword getEKeyword_4_0_1() { return cEKeyword_4_0_1; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_4_1() { return cHyphenMinusKeyword_4_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_4_2() { return cINTTerminalRuleCall_4_2; }
	}
	public class AdditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.Addition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0_0 = (RuleCall)cNameAssignment_0_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLeftVariableAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cLeftVariableVariableCrossReference_2_0 = (CrossReference)cLeftVariableAssignment_2.eContents().get(0);
		private final RuleCall cLeftVariableVariableEStringParserRuleCall_2_0_1 = (RuleCall)cLeftVariableVariableCrossReference_2_0.eContents().get(1);
		private final Keyword cPlusSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRightVariableAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cRightVariableVariableCrossReference_4_0 = (CrossReference)cRightVariableAssignment_4.eContents().get(0);
		private final RuleCall cRightVariableVariableEStringParserRuleCall_4_0_1 = (RuleCall)cRightVariableVariableCrossReference_4_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Addition:
		//	(name=ID '->')? '(' leftVariable=[Variable|EString] '+' rightVariable=[Variable|EString] ')';
		@Override public ParserRule getRule() { return rule; }
		
		//(name=ID '->')? '(' leftVariable=[Variable|EString] '+' rightVariable=[Variable|EString] ')'
		public Group getGroup() { return cGroup; }
		
		//(name=ID '->')?
		public Group getGroup_0() { return cGroup_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0_0() { return cNameIDTerminalRuleCall_0_0_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_0_1() { return cHyphenMinusGreaterThanSignKeyword_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//leftVariable=[Variable|EString]
		public Assignment getLeftVariableAssignment_2() { return cLeftVariableAssignment_2; }
		
		//[Variable|EString]
		public CrossReference getLeftVariableVariableCrossReference_2_0() { return cLeftVariableVariableCrossReference_2_0; }
		
		//EString
		public RuleCall getLeftVariableVariableEStringParserRuleCall_2_0_1() { return cLeftVariableVariableEStringParserRuleCall_2_0_1; }
		
		//'+'
		public Keyword getPlusSignKeyword_3() { return cPlusSignKeyword_3; }
		
		//rightVariable=[Variable|EString]
		public Assignment getRightVariableAssignment_4() { return cRightVariableAssignment_4; }
		
		//[Variable|EString]
		public CrossReference getRightVariableVariableCrossReference_4_0() { return cRightVariableVariableCrossReference_4_0; }
		
		//EString
		public RuleCall getRightVariableVariableEStringParserRuleCall_4_0_1() { return cRightVariableVariableEStringParserRuleCall_4_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class SoustractionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.Soustraction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0_0 = (RuleCall)cNameAssignment_0_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLeftVariableAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cLeftVariableVariableCrossReference_2_0 = (CrossReference)cLeftVariableAssignment_2.eContents().get(0);
		private final RuleCall cLeftVariableVariableEStringParserRuleCall_2_0_1 = (RuleCall)cLeftVariableVariableCrossReference_2_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRightVariableAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cRightVariableVariableCrossReference_4_0 = (CrossReference)cRightVariableAssignment_4.eContents().get(0);
		private final RuleCall cRightVariableVariableEStringParserRuleCall_4_0_1 = (RuleCall)cRightVariableVariableCrossReference_4_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Soustraction:
		//	(name=ID '->')? '(' leftVariable=[Variable|EString] '-' rightVariable=[Variable|EString] ')';
		@Override public ParserRule getRule() { return rule; }
		
		//(name=ID '->')? '(' leftVariable=[Variable|EString] '-' rightVariable=[Variable|EString] ')'
		public Group getGroup() { return cGroup; }
		
		//(name=ID '->')?
		public Group getGroup_0() { return cGroup_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0_0() { return cNameIDTerminalRuleCall_0_0_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_0_1() { return cHyphenMinusGreaterThanSignKeyword_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//leftVariable=[Variable|EString]
		public Assignment getLeftVariableAssignment_2() { return cLeftVariableAssignment_2; }
		
		//[Variable|EString]
		public CrossReference getLeftVariableVariableCrossReference_2_0() { return cLeftVariableVariableCrossReference_2_0; }
		
		//EString
		public RuleCall getLeftVariableVariableEStringParserRuleCall_2_0_1() { return cLeftVariableVariableEStringParserRuleCall_2_0_1; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_3() { return cHyphenMinusKeyword_3; }
		
		//rightVariable=[Variable|EString]
		public Assignment getRightVariableAssignment_4() { return cRightVariableAssignment_4; }
		
		//[Variable|EString]
		public CrossReference getRightVariableVariableCrossReference_4_0() { return cRightVariableVariableCrossReference_4_0; }
		
		//EString
		public RuleCall getRightVariableVariableEStringParserRuleCall_4_0_1() { return cRightVariableVariableEStringParserRuleCall_4_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class AssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.Assignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0_0 = (RuleCall)cNameAssignment_0_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cAssignKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cVariableAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final CrossReference cVariableVariableCrossReference_1_0_1_0 = (CrossReference)cVariableAssignment_1_0_1.eContents().get(0);
		private final RuleCall cVariableVariableEStringParserRuleCall_1_0_1_0_1 = (RuleCall)cVariableVariableCrossReference_1_0_1_0.eContents().get(1);
		private final Keyword cWithKeyword_1_0_2 = (Keyword)cGroup_1_0.eContents().get(2);
		private final Assignment cOperationAssignment_1_0_3 = (Assignment)cGroup_1_0.eContents().get(3);
		private final RuleCall cOperationOperationParserRuleCall_1_0_3_0 = (RuleCall)cOperationAssignment_1_0_3.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cVariableAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final CrossReference cVariableVariableCrossReference_1_1_0_0 = (CrossReference)cVariableAssignment_1_1_0.eContents().get(0);
		private final RuleCall cVariableVariableEStringParserRuleCall_1_1_0_0_1 = (RuleCall)cVariableVariableCrossReference_1_1_0_0.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cOperationAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cOperationOperationParserRuleCall_1_1_2_0 = (RuleCall)cOperationAssignment_1_1_2.eContents().get(0);
		
		//Assignment:
		//	(name=ID '->')? ('Assign' variable=[Variable|EString] 'with' operation=Operation | variable=[Variable|EString] ':='
		//	operation=Operation);
		@Override public ParserRule getRule() { return rule; }
		
		//(name=ID '->')? ('Assign' variable=[Variable|EString] 'with' operation=Operation | variable=[Variable|EString] ':='
		//operation=Operation)
		public Group getGroup() { return cGroup; }
		
		//(name=ID '->')?
		public Group getGroup_0() { return cGroup_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0_0() { return cNameIDTerminalRuleCall_0_0_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_0_1() { return cHyphenMinusGreaterThanSignKeyword_0_1; }
		
		//('Assign' variable=[Variable|EString] 'with' operation=Operation | variable=[Variable|EString] ':=' operation=Operation)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'Assign' variable=[Variable|EString] 'with' operation=Operation
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//'Assign'
		public Keyword getAssignKeyword_1_0_0() { return cAssignKeyword_1_0_0; }
		
		//variable=[Variable|EString]
		public Assignment getVariableAssignment_1_0_1() { return cVariableAssignment_1_0_1; }
		
		//[Variable|EString]
		public CrossReference getVariableVariableCrossReference_1_0_1_0() { return cVariableVariableCrossReference_1_0_1_0; }
		
		//EString
		public RuleCall getVariableVariableEStringParserRuleCall_1_0_1_0_1() { return cVariableVariableEStringParserRuleCall_1_0_1_0_1; }
		
		//'with'
		public Keyword getWithKeyword_1_0_2() { return cWithKeyword_1_0_2; }
		
		//operation=Operation
		public Assignment getOperationAssignment_1_0_3() { return cOperationAssignment_1_0_3; }
		
		//Operation
		public RuleCall getOperationOperationParserRuleCall_1_0_3_0() { return cOperationOperationParserRuleCall_1_0_3_0; }
		
		//variable=[Variable|EString] ':=' operation=Operation
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//variable=[Variable|EString]
		public Assignment getVariableAssignment_1_1_0() { return cVariableAssignment_1_1_0; }
		
		//[Variable|EString]
		public CrossReference getVariableVariableCrossReference_1_1_0_0() { return cVariableVariableCrossReference_1_1_0_0; }
		
		//EString
		public RuleCall getVariableVariableEStringParserRuleCall_1_1_0_0_1() { return cVariableVariableEStringParserRuleCall_1_1_0_0_1; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_1_1_1() { return cColonEqualsSignKeyword_1_1_1; }
		
		//operation=Operation
		public Assignment getOperationAssignment_1_1_2() { return cOperationAssignment_1_1_2; }
		
		//Operation
		public RuleCall getOperationOperationParserRuleCall_1_1_2_0() { return cOperationOperationParserRuleCall_1_1_2_0; }
	}
	public class ParallelAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.ParallelAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0_0 = (RuleCall)cNameAssignment_0_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cOwnedAssignmentsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOwnedAssignmentsAssignmentParserRuleCall_1_1_0 = (RuleCall)cOwnedAssignmentsAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cVerticalLineKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cOwnedAssignmentsAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cOwnedAssignmentsAssignmentParserRuleCall_1_2_1_0 = (RuleCall)cOwnedAssignmentsAssignment_1_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		//ParallelAssignment:
		//	(name=ID '->')? ('[' ownedAssignments+=Assignment ('|' ownedAssignments+=Assignment)+ ']');
		@Override public ParserRule getRule() { return rule; }
		
		//(name=ID '->')? ('[' ownedAssignments+=Assignment ('|' ownedAssignments+=Assignment)+ ']')
		public Group getGroup() { return cGroup; }
		
		//(name=ID '->')?
		public Group getGroup_0() { return cGroup_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0_0() { return cNameIDTerminalRuleCall_0_0_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_0_1() { return cHyphenMinusGreaterThanSignKeyword_0_1; }
		
		//('[' ownedAssignments+=Assignment ('|' ownedAssignments+=Assignment)+ ']')
		public Group getGroup_1() { return cGroup_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//ownedAssignments+=Assignment
		public Assignment getOwnedAssignmentsAssignment_1_1() { return cOwnedAssignmentsAssignment_1_1; }
		
		//Assignment
		public RuleCall getOwnedAssignmentsAssignmentParserRuleCall_1_1_0() { return cOwnedAssignmentsAssignmentParserRuleCall_1_1_0; }
		
		//('|' ownedAssignments+=Assignment)+
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_2_0() { return cVerticalLineKeyword_1_2_0; }
		
		//ownedAssignments+=Assignment
		public Assignment getOwnedAssignmentsAssignment_1_2_1() { return cOwnedAssignmentsAssignment_1_2_1; }
		
		//Assignment
		public RuleCall getOwnedAssignmentsAssignmentParserRuleCall_1_2_1_0() { return cOwnedAssignmentsAssignmentParserRuleCall_1_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_3() { return cRightSquareBracketKeyword_1_3; }
	}
	
	public class VarTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.toylanguage.concretesyntax.Toy.VarType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cIntEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cIntIntKeyword_0_0 = (Keyword)cIntEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDoubleEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDoubleDoubleKeyword_1_0 = (Keyword)cDoubleEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum VarType:
		//	int | double;
		public EnumRule getRule() { return rule; }
		
		//int | double
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//int
		public EnumLiteralDeclaration getIntEnumLiteralDeclaration_0() { return cIntEnumLiteralDeclaration_0; }
		
		//'int'
		public Keyword getIntIntKeyword_0_0() { return cIntIntKeyword_0_0; }
		
		//double
		public EnumLiteralDeclaration getDoubleEnumLiteralDeclaration_1() { return cDoubleEnumLiteralDeclaration_1; }
		
		//'double'
		public Keyword getDoubleDoubleKeyword_1_0() { return cDoubleDoubleKeyword_1_0; }
	}
	
	private final ToyProgramElements pToyProgram;
	private final StatementElements pStatement;
	private final OperationElements pOperation;
	private final EStringElements pEString;
	private final VariableElements pVariable;
	private final VarTypeElements eVarType;
	private final EDoubleElements pEDouble;
	private final AdditionElements pAddition;
	private final SoustractionElements pSoustraction;
	private final AssignmentElements pAssignment;
	private final ParallelAssignmentElements pParallelAssignment;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ToyGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pToyProgram = new ToyProgramElements();
		this.pStatement = new StatementElements();
		this.pOperation = new OperationElements();
		this.pEString = new EStringElements();
		this.pVariable = new VariableElements();
		this.eVarType = new VarTypeElements();
		this.pEDouble = new EDoubleElements();
		this.pAddition = new AdditionElements();
		this.pSoustraction = new SoustractionElements();
		this.pAssignment = new AssignmentElements();
		this.pParallelAssignment = new ParallelAssignmentElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.unice.polytech.si5.toylanguage.concretesyntax.Toy".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ToyProgram:
	//	{ToyProgram}
	//	'program'
	//	name=EString
	//	ownedVariables+=Variable*
	//	ownedStatements+=Statement*;
	public ToyProgramElements getToyProgramAccess() {
		return pToyProgram;
	}
	
	public ParserRule getToyProgramRule() {
		return getToyProgramAccess().getRule();
	}
	
	//Statement:
	//	Operation | Assignment | ParallelAssignment;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//Operation:
	//	Addition | Soustraction;
	public OperationElements getOperationAccess() {
		return pOperation;
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Variable:
	//	{Variable}
	//	'Var' name=EString ':' type=VarType '=' initialValue=EDouble ';'?;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//enum VarType:
	//	int | double;
	public VarTypeElements getVarTypeAccess() {
		return eVarType;
	}
	
	public EnumRule getVarTypeRule() {
		return getVarTypeAccess().getRule();
	}
	
	//EDouble ecore::EDouble:
	//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
	public EDoubleElements getEDoubleAccess() {
		return pEDouble;
	}
	
	public ParserRule getEDoubleRule() {
		return getEDoubleAccess().getRule();
	}
	
	//Addition:
	//	(name=ID '->')? '(' leftVariable=[Variable|EString] '+' rightVariable=[Variable|EString] ')';
	public AdditionElements getAdditionAccess() {
		return pAddition;
	}
	
	public ParserRule getAdditionRule() {
		return getAdditionAccess().getRule();
	}
	
	//Soustraction:
	//	(name=ID '->')? '(' leftVariable=[Variable|EString] '-' rightVariable=[Variable|EString] ')';
	public SoustractionElements getSoustractionAccess() {
		return pSoustraction;
	}
	
	public ParserRule getSoustractionRule() {
		return getSoustractionAccess().getRule();
	}
	
	//Assignment:
	//	(name=ID '->')? ('Assign' variable=[Variable|EString] 'with' operation=Operation | variable=[Variable|EString] ':='
	//	operation=Operation);
	public AssignmentElements getAssignmentAccess() {
		return pAssignment;
	}
	
	public ParserRule getAssignmentRule() {
		return getAssignmentAccess().getRule();
	}
	
	//ParallelAssignment:
	//	(name=ID '->')? ('[' ownedAssignments+=Assignment ('|' ownedAssignments+=Assignment)+ ']');
	public ParallelAssignmentElements getParallelAssignmentAccess() {
		return pParallelAssignment;
	}
	
	public ParserRule getParallelAssignmentRule() {
		return getParallelAssignmentAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
