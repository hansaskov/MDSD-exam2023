/*
 * generated by Xtext 2.34.0
 */
package dk.sdu.mmmi.mdsd.ui23


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class Ui23StandaloneSetup extends Ui23StandaloneSetupGenerated {

	def static void doSetup() {
		new Ui23StandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
