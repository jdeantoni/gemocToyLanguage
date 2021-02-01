// AspectJ classes that have been aspectized and name
package fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage;
public aspect AspectJAssignment{
double around (fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment self)  :target (self) && (call ( double fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Assignment.execute(  ) ) ) { return fr.unice.polytech.si5.toylanguage.rewritingrules.AssignmentAspect.execute(self );}

}
