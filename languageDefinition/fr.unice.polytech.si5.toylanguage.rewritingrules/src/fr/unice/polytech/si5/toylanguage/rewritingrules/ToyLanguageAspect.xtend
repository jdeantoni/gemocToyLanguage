package fr.unice.polytech.si5.toylanguage.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.ToyProgram

import static extension fr.unice.polytech.si5.toylanguage.rewritingrules.VariableAspect.*
import static extension fr.unice.polytech.si5.toylanguage.rewritingrules.StatementAspect.*
import static extension fr.unice.polytech.si5.toylanguage.rewritingrules.AdditionAspect.*
import static extension fr.unice.polytech.si5.toylanguage.rewritingrules.SoustractionAspect.*
import static extension fr.unice.polytech.si5.toylanguage.rewritingrules.AssignmentAspect.*

import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Statement
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Addition
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Soustraction
import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

/**
 * add the runtime state to the concept of Variable, i.e. the currentValue 
 * as well as a initialisation rewriting rule
 */
@Aspect(className=Variable)
class VariableAspect {
	public var Integer currentValue = 0
	
	@Step
	@ReplaceAspectMethod
	def void initialize(){
		_self.currentValue = _self.initialValue as int
	}
	
}
/**
 * define the entry point of the operational semantics (may be replaced later by a concurrency model
 */
@Aspect(className=ToyProgram)
class ToyProgramAspect{
	
	@Main
	@Step
	def void entryPoint(){
		for(Variable v :_self.ownedVariables){
			v.initialize()
		}
		
		for(Statement s : _self.ownedStatements){
			s.execute()
		}
		
	}
}

@Aspect(className=Statement)
class StatementAspect{
	@Step
	@ReplaceAspectMethod
	def double execute(){
		return -1
	}
}

@Aspect(className=Addition)
class AdditionAspect extends StatementAspect{
	@Step
	@OverrideAspectMethod
	@ReplaceAspectMethod
	def double execute(){
		return _self.leftVariable.currentValue + _self.rightVariable.currentValue
	}
}

@Aspect(className=Soustraction)
class SoustractionAspect extends StatementAspect{
	@Step
	@OverrideAspectMethod
	@ReplaceAspectMethod
	def double execute(){
		return _self.leftVariable.currentValue - _self.rightVariable.currentValue
	}
}

@Aspect(className=Assignment)
class AssignmentAspect extends StatementAspect{
	@Step
	@OverrideAspectMethod
	@ReplaceAspectMethod
	def double execute(){
		_self.variable.currentValue = _self.operation.execute as int
		return 0
	}
}
