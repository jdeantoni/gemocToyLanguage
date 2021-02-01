// AspectJ classes that have been aspectized and name
package fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage;
public aspect AspectJVariable{
void around (fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable self)  :target (self) && (call ( void fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable.initialize(  ) ) ) { fr.unice.polytech.si5.toylanguage.rewritingrules.VariableAspect.initialize(self );}

}
