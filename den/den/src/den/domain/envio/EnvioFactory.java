/**
 */
package den.domain.envio;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see den.domain.envio.EnvioPackage
 * @generated
 */
public interface EnvioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnvioFactory eINSTANCE = den.domain.envio.impl.EnvioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Detalle Pedido</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detalle Pedido</em>'.
	 * @generated
	 */
	DetallePedido createDetallePedido();

	/**
	 * Returns a new object of class '<em>Envio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Envio</em>'.
	 * @generated
	 */
	Envio createEnvio();

	/**
	 * Returns a new object of class '<em>Factory Envio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factory Envio</em>'.
	 * @generated
	 */
	FactoryEnvio createFactoryEnvio();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnvioPackage getEnvioPackage();

} //EnvioFactory
