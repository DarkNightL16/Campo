/**
 */
package den.domain.envio.impl;

import den.domain.envio.*;

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
public class EnvioFactoryImpl extends EFactoryImpl implements EnvioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnvioFactory init() {
		try {
			EnvioFactory theEnvioFactory = (EnvioFactory)EPackage.Registry.INSTANCE.getEFactory(EnvioPackage.eNS_URI);
			if (theEnvioFactory != null) {
				return theEnvioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnvioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvioFactoryImpl() {
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
			case EnvioPackage.DETALLE_PEDIDO: return createDetallePedido();
			case EnvioPackage.ENVIO: return createEnvio();
			case EnvioPackage.FACTORY_ENVIO: return createFactoryEnvio();
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
	public Envio createEnvio() {
		EnvioImpl envio = new EnvioImpl();
		return envio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryEnvio createFactoryEnvio() {
		FactoryEnvioImpl factoryEnvio = new FactoryEnvioImpl();
		return factoryEnvio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvioPackage getEnvioPackage() {
		return (EnvioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnvioPackage getPackage() {
		return EnvioPackage.eINSTANCE;
	}

} //EnvioFactoryImpl
