// AspectJ classes that have been aspectized and name
package fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage;
public aspect AspectJSoustraction{
double around (fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Soustraction self)  :target (self) && (call ( double fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Soustraction.execute(  ) ) ) { return fr.unice.polytech.si5.toylanguage.rewritingrules.SoustractionAspect.execute(self );}

}
