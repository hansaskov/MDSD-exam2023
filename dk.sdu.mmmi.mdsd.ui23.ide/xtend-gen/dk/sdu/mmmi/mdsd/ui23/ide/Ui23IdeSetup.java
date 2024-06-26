/**
 * generated by Xtext 2.34.0
 */
package dk.sdu.mmmi.mdsd.ui23.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import dk.sdu.mmmi.mdsd.ui23.Ui23RuntimeModule;
import dk.sdu.mmmi.mdsd.ui23.Ui23StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class Ui23IdeSetup extends Ui23StandaloneSetup {
  @Override
  public Injector createInjector() {
    Ui23RuntimeModule _ui23RuntimeModule = new Ui23RuntimeModule();
    Ui23IdeModule _ui23IdeModule = new Ui23IdeModule();
    return Guice.createInjector(Modules2.mixin(_ui23RuntimeModule, _ui23IdeModule));
  }
}
