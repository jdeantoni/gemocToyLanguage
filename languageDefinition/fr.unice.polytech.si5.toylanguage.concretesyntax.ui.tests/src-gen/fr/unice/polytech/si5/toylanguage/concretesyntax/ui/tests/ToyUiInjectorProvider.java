/*
 * generated by Xtext 2.23.0
 */
package fr.unice.polytech.si5.toylanguage.concretesyntax.ui.tests;

import com.google.inject.Injector;
import fr.unice.polytech.si5.toylanguage.concretesyntax.ui.internal.ConcretesyntaxActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class ToyUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ConcretesyntaxActivator.getInstance().getInjector("fr.unice.polytech.si5.toylanguage.concretesyntax.Toy");
	}

}
