// AspectJ classes that have been aspectized and name
package fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage;
public aspect AspectJStatement{
double around (fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Statement self)  :target (self) && (call ( double fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Statement.execute(  ) ) ) { return fr.unice.polytech.si5.toylanguage.rewritingrules.StatementAspect.execute(self );}

}
