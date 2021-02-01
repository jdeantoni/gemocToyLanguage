/*
 * generated by Xtext 2.23.0
 */
package fr.unice.polytech.si5.toylanguage.concretesyntax.ui;

import com.google.inject.Injector;
import fr.unice.polytech.si5.toylanguage.concretesyntax.ui.internal.ConcretesyntaxActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ToyExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(ConcretesyntaxActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		ConcretesyntaxActivator activator = ConcretesyntaxActivator.getInstance();
		return activator != null ? activator.getInjector(ConcretesyntaxActivator.FR_UNICE_POLYTECH_SI5_TOYLANGUAGE_CONCRETESYNTAX_TOY) : null;
	}

}
