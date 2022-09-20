/**
 */
package den.domain.pedido.impl;

import den.domain.pedido.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PedidoFactoryImpl extends EFactoryImpl implements PedidoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PedidoFactory init() {
		try {
			PedidoFactory thePedidoFactory = (PedidoFactory)EPackage.Registry.INSTANCE.getEFactory(PedidoPackage.eNS_URI);
			if (thePedidoFactory != null) {
				return thePedidoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PedidoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedidoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PedidoPackage.DETALLE_PEDIDO: return createDetallePedido();
			case PedidoPackage.FACTORY_PEDIDO: return createFactoryPedido();
			case PedidoPackage.PEDIDO: return createPedido();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetallePedido createDetallePedido() {
		DetallePedidoImpl detallePedido = new DetallePedidoImpl();
		return detallePedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryPedido createFactoryPedido() {
		FactoryPedidoImpl factoryPedido = new FactoryPedidoImpl();
		return factoryPedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pedido createPedido() {
		PedidoImpl pedido = new PedidoImpl();
		return pedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedidoPackage getPedidoPackage() {
		return (PedidoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PedidoPackage getPackage() {
		return PedidoPackage.eINSTANCE;
	}

} //PedidoFactoryImpl
