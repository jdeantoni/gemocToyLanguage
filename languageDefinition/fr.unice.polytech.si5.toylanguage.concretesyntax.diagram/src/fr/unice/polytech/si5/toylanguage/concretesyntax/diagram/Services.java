package fr.unice.polytech.si5.toylanguage.concretesyntax.diagram;

import org.eclipse.emf.ecore.EObject;

import fr.unice.polytech.si5.toylanguage.abstractsyntax.toyLanguage.Variable;
import toylanguage.xdsml.api.impl.ToylanguageRTDAccessor;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public Integer getCurrentValue(Variable self) {
       return ToylanguageRTDAccessor.getcurrentValue(self);
    }
}
