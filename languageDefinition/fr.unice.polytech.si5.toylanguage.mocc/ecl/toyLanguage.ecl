import 'http://www.polytech.unice.fr/toyLanguage'
import _'http://www.eclipse.org/emf/2002/Ecore'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

package toyLanguage --extension du langage OCL: Object Constraint Language

	 context Variable
	 	def : initIt : Event = self.initialize()
	 context Statement
	 	def 
	 		if((self.oclIsKindOf(Assignment) or self.oclIsKindOf(ParallelAssignment)) 
	 			--and self.oclAsType(ecore::EObject).eContainer().oclAsType(ToyLanguage).ownedStatement.exists(self)
	 		) 
	 		: executeIt : Event = self.execute()
	 
	 context ToyProgram
	 	inv LastInitBeforeFirstExec:
	 		let lastInit : Event = Expression Sup(self.ownedVariables.initIt) in 
	 		let firstExec : Event = Expression Inf(self.ownedStatements.executeIt) in
	 		(Relation Precedes(lastInit, firstExec))
	 	inv followCollectionOrder:
	 		Relation Precedes(self.ownedStatements.executeIt)
	 	
	 context ParallelAssignment
	 	inv execFirstThenInternal:
	 		let firstInternal : Event = Expression Inf(self.ownedAssignments.executeIt) in
	 		Relation Precedes(self.executeIt, firstInternal)
	 	
	 	inv lastInternalThenNext:
	 		(let prog : ToyProgram = self.oclAsType(ecore::EObject).eContainer().oclAsType(ToyProgram) in
		 	(prog.ownedStatements->size() > prog.ownedStatements->asOrderedSet()->indexOf(self)) implies
		 		let lastInternal : Event = Expression Sup(self.ownedAssignments.executeIt) in 
		 		Relation Precedes(lastInternal, prog.ownedStatements->at(prog.ownedStatements->asOrderedSet()->indexOf(self)+1).executeIt))
	 		
	 context Variable
	 	inv initOnlyOnce:
	 		let oneInit : Event = Expression OneTickAndNoMore(self.initIt) in
	 		Relation Coincides(oneInit, self.initIt)

 endpackage