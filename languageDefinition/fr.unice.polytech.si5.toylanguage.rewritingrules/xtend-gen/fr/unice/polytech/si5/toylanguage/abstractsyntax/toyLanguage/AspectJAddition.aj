// AspectJ classes that have been aspectized and name
package fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage;
public aspect AspectJAddition{
double around (fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Addition self)  :target (self) && (call ( double fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Addition.execute(  ) ) ) { return fr.unice.polytech.si5.toylanguage.rewritingrules.AdditionAspect.execute(self );}

}
