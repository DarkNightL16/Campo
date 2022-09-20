/**
 */
package den.domain.pedido;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see den.domain.pedido.PedidoPackage
 * @generated
 */
public interface PedidoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PedidoFactory eINSTANCE = den.domain.pedido.impl.PedidoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Detalle Pedido</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detalle Pedido</em>'.
	 * @generated
	 */
	DetallePedido createDetallePedido();

	/**
	 * Returns a new object of class '<em>Factory Pedido</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factory Pedido</em>'.
	 * @generated
	 */
	FactoryPedido createFactoryPedido();

	/**
	 * Returns a new object of class '<em>Pedido</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pedido</em>'.
	 * @generated
	 */
	Pedido createPedido();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PedidoPackage getPedidoPackage();

} //PedidoFactory
