/**
 */
package den.domain.envio;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see den.domain.envio.EnvioFactory
 * @model kind="package"
 * @generated
 */
public interface EnvioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "envio";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///den/domain/envio.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "den.domain.envio";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnvioPackage eINSTANCE = den.domain.envio.impl.EnvioPackageImpl.init();

	/**
	 * The meta object id for the '{@link den.domain.envio.impl.DetallePedidoImpl <em>Detalle Pedido</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.envio.impl.DetallePedidoImpl
	 * @see den.domain.envio.impl.EnvioPackageImpl#getDetallePedido()
	 * @generated
	 */
	int DETALLE_PEDIDO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO__ID = 0;

	/**
	 * The feature id for the '<em><b>Cantidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO__CANTIDAD = 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO__DESCRIPCION = 2;

	/**
	 * The feature id for the '<em><b>Valor Unitario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO__VALOR_UNITARIO = 3;

	/**
	 * The feature id for the '<em><b>Owened By Envio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO__OWENED_BY_ENVIO = 4;

	/**
	 * The number of structural features of the '<em>Detalle Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link den.domain.envio.impl.EnvioImpl <em>Envio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.envio.impl.EnvioImpl
	 * @see den.domain.envio.impl.EnvioPackageImpl#getEnvio()
	 * @generated
	 */
	int ENVIO = 1;

	/**
	 * The feature id for the '<em><b>The Ciudad Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__THE_CIUDAD_ORIGEN = 0;

	/**
	 * The feature id for the '<em><b>Lst Transporte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__LST_TRANSPORTE = 1;

	/**
	 * The feature id for the '<em><b>Lst Detalle Pedido</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__LST_DETALLE_PEDIDO = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__ID = 3;

	/**
	 * The feature id for the '<em><b>Nit Empresa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__NIT_EMPRESA = 4;

	/**
	 * The feature id for the '<em><b>Direccion Empresa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__DIRECCION_EMPRESA = 5;

	/**
	 * The feature id for the '<em><b>Id Factura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__ID_FACTURA = 6;

	/**
	 * The feature id for the '<em><b>Fecha Envio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__FECHA_ENVIO = 7;

	/**
	 * The feature id for the '<em><b>Fecha Vencimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__FECHA_VENCIMIENTO = 8;

	/**
	 * The feature id for the '<em><b>The Ciudad Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__THE_CIUDAD_DESTINO = 9;

	/**
	 * The feature id for the '<em><b>Lst Pedido</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__LST_PEDIDO = 10;

	/**
	 * The feature id for the '<em><b>Owened By Factory Envio</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__OWENED_BY_FACTORY_ENVIO = 11;

	/**
	 * The feature id for the '<em><b>Lst Ruta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__LST_RUTA = 12;

	/**
	 * The number of structural features of the '<em>Envio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link den.domain.envio.impl.FactoryEnvioImpl <em>Factory Envio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.envio.impl.FactoryEnvioImpl
	 * @see den.domain.envio.impl.EnvioPackageImpl#getFactoryEnvio()
	 * @generated
	 */
	int FACTORY_ENVIO = 2;

	/**
	 * The feature id for the '<em><b>Lst Envio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_ENVIO__LST_ENVIO = 0;

	/**
	 * The feature id for the '<em><b>Id Envio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_ENVIO__ID_ENVIO = 1;

	/**
	 * The feature id for the '<em><b>Owened By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_ENVIO__OWENED_BY_DOMAIN = 2;

	/**
	 * The number of structural features of the '<em>Factory Envio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_ENVIO_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link den.domain.envio.DetallePedido <em>Detalle Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detalle Pedido</em>'.
	 * @see den.domain.envio.DetallePedido
	 * @generated
	 */
	EClass getDetallePedido();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.envio.DetallePedido#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see den.domain.envio.DetallePedido#getId()
	 * @see #getDetallePedido()
	 * @generated
	 */
	EAttribute getDetallePedido_Id();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.envio.DetallePedido#getCantidad <em>Cantidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cantidad</em>'.
	 * @see den.domain.envio.DetallePedido#getCantidad()
	 * @see #getDetallePedido()
	 * @generated
	 */
	EAttribute getDetallePedido_Cantidad();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.envio.DetallePedido#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see den.domain.envio.DetallePedido#getDescripcion()
	 * @see #getDetallePedido()
	 * @generated
	 */
	EAttribute getDetallePedido_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.envio.DetallePedido#getValorUnitario <em>Valor Unitario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Unitario</em>'.
	 * @see den.domain.envio.DetallePedido#getValorUnitario()
	 * @see #getDetallePedido()
	 * @generated
	 */
	EAttribute getDetallePedido_ValorUnitario();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.envio.DetallePedido#getOwenedByEnvio <em>Owened By Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Envio</em>'.
	 * @see den.domain.envio.DetallePedido#getOwenedByEnvio()
	 * @see #getDetallePedido()
	 * @generated
	 */
	EReference getDetallePedido_OwenedByEnvio();

	/**
	 * Returns the meta object for class '{@link den.domain.envio.Envio <em>Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Envio</em>'.
	 * @see den.domain.envio.Envio
	 * @generated
	 */
	EClass getEnvio();

	/**
	 * Returns the meta object for the reference '{@link den.domain.envio.Envio#getTheCiudadOrigen <em>The Ciudad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Ciudad Origen</em>'.
	 * @see den.domain.envio.Envio#getTheCiudadOrigen()
	 * @see #getEnvio()
	 * @generated
	 */
	EReference getEnvio_TheCiudadOrigen();

	/**
	 * Returns the meta object for the reference '{@link den.domain.envio.Envio#getLstTransporte <em>Lst Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lst Transporte</em>'.
	 * @see den.domain.envio.Envio#getLstTransporte()
	 * @see #getEnvio()
	 * @generated
	 */
	EReference getEnvio_LstTransporte();

	/**
	 * Returns the meta object for the containment reference '{@link den.domain.envio.Envio#getLstDetallePedido <em>Lst Detalle Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lst Detalle Pedido</em>'.
	 * @see den.domain.envio.Envio#getLstDetallePedido()
	 * @see #getEnvio()
	 * @generated
	 */
	EReference getEnvio_LstDetallePedido();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.envio.Envio#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see den.domain.envio.Envio#getId()
	 * @see #getEnvio()
	 * @generated
	 */
	EAttribute getEnvio_Id();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.envio.Envio#getNitEmpresa <em>Nit Empresa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nit Empresa</em>'.
	 * @see den.domain.envio.Envio#getNitEmpresa()
	 * @see #getEnvio()
	 * @generated
	 */
	EAttribute getEnvio_NitEmpresa();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.envio.Envio#getDireccionEmpresa <em>Direccion Empresa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion Empresa</em>'.
	 * @see den.domain.envio.Envio#getDireccionEmpresa()
	 * @see #getEnvio()
	 * @generated
	 */
	EAttribute getEnvio_DireccionEmpresa();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.envio.Envio#getIdFactura <em>Id Factura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Factura</em>'.
	 * @see den.domain.envio.Envio#getIdFactura()
	 * @see #getEnvio()
	 * @generated
	 */
	EAttribute getEnvio_IdFactura();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.envio.Envio#getFechaEnvio <em>Fecha Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Envio</em>'.
	 * @see den.domain.envio.Envio#getFechaEnvio()
	 * @see #getEnvio()
	 * @generated
	 */
	EAttribute getEnvio_FechaEnvio();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.envio.Envio#getFechaVencimiento <em>Fecha Vencimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Vencimiento</em>'.
	 * @see den.domain.envio.Envio#getFechaVencimiento()
	 * @see #getEnvio()
	 * @generated
	 */
	EAttribute getEnvio_FechaVencimiento();

	/**
	 * Returns the meta object for the reference '{@link den.domain.envio.Envio#getTheCiudadDestino <em>The Ciudad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Ciudad Destino</em>'.
	 * @see den.domain.envio.Envio#getTheCiudadDestino()
	 * @see #getEnvio()
	 * @generated
	 */
	EReference getEnvio_TheCiudadDestino();

	/**
	 * Returns the meta object for the reference '{@link den.domain.envio.Envio#getLstPedido <em>Lst Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lst Pedido</em>'.
	 * @see den.domain.envio.Envio#getLstPedido()
	 * @see #getEnvio()
	 * @generated
	 */
	EReference getEnvio_LstPedido();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.envio.Envio#getOwenedByFactoryEnvio <em>Owened By Factory Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Factory Envio</em>'.
	 * @see den.domain.envio.Envio#getOwenedByFactoryEnvio()
	 * @see #getEnvio()
	 * @generated
	 */
	EReference getEnvio_OwenedByFactoryEnvio();

	/**
	 * Returns the meta object for the reference '{@link den.domain.envio.Envio#getLstRuta <em>Lst Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lst Ruta</em>'.
	 * @see den.domain.envio.Envio#getLstRuta()
	 * @see #getEnvio()
	 * @generated
	 */
	EReference getEnvio_LstRuta();

	/**
	 * Returns the meta object for class '{@link den.domain.envio.FactoryEnvio <em>Factory Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Envio</em>'.
	 * @see den.domain.envio.FactoryEnvio
	 * @generated
	 */
	EClass getFactoryEnvio();

	/**
	 * Returns the meta object for the containment reference list '{@link den.domain.envio.FactoryEnvio#getLstEnvio <em>Lst Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Envio</em>'.
	 * @see den.domain.envio.FactoryEnvio#getLstEnvio()
	 * @see #getFactoryEnvio()
	 * @generated
	 */
	EReference getFactoryEnvio_LstEnvio();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.envio.FactoryEnvio#getIdEnvio <em>Id Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Envio</em>'.
	 * @see den.domain.envio.FactoryEnvio#getIdEnvio()
	 * @see #getFactoryEnvio()
	 * @generated
	 */
	EAttribute getFactoryEnvio_IdEnvio();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.envio.FactoryEnvio#getOwenedByDomain <em>Owened By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Domain</em>'.
	 * @see den.domain.envio.FactoryEnvio#getOwenedByDomain()
	 * @see #getFactoryEnvio()
	 * @generated
	 */
	EReference getFactoryEnvio_OwenedByDomain();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnvioFactory getEnvioFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link den.domain.envio.impl.DetallePedidoImpl <em>Detalle Pedido</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.envio.impl.DetallePedidoImpl
		 * @see den.domain.envio.impl.EnvioPackageImpl#getDetallePedido()
		 * @generated
		 */
		EClass DETALLE_PEDIDO = eINSTANCE.getDetallePedido();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_PEDIDO__ID = eINSTANCE.getDetallePedido_Id();

		/**
		 * The meta object literal for the '<em><b>Cantidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_PEDIDO__CANTIDAD = eINSTANCE.getDetallePedido_Cantidad();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_PEDIDO__DESCRIPCION = eINSTANCE.getDetallePedido_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Valor Unitario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_PEDIDO__VALOR_UNITARIO = eINSTANCE.getDetallePedido_ValorUnitario();

		/**
		 * The meta object literal for the '<em><b>Owened By Envio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETALLE_PEDIDO__OWENED_BY_ENVIO = eINSTANCE.getDetallePedido_OwenedByEnvio();

		/**
		 * The meta object literal for the '{@link den.domain.envio.impl.EnvioImpl <em>Envio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.envio.impl.EnvioImpl
		 * @see den.domain.envio.impl.EnvioPackageImpl#getEnvio()
		 * @generated
		 */
		EClass ENVIO = eINSTANCE.getEnvio();

		/**
		 * The meta object literal for the '<em><b>The Ciudad Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIO__THE_CIUDAD_ORIGEN = eINSTANCE.getEnvio_TheCiudadOrigen();

		/**
		 * The meta object literal for the '<em><b>Lst Transporte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIO__LST_TRANSPORTE = eINSTANCE.getEnvio_LstTransporte();

		/**
		 * The meta object literal for the '<em><b>Lst Detalle Pedido</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIO__LST_DETALLE_PEDIDO = eINSTANCE.getEnvio_LstDetallePedido();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIO__ID = eINSTANCE.getEnvio_Id();

		/**
		 * The meta object literal for the '<em><b>Nit Empresa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIO__NIT_EMPRESA = eINSTANCE.getEnvio_NitEmpresa();

		/**
		 * The meta object literal for the '<em><b>Direccion Empresa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIO__DIRECCION_EMPRESA = eINSTANCE.getEnvio_DireccionEmpresa();

		/**
		 * The meta object literal for the '<em><b>Id Factura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIO__ID_FACTURA = eINSTANCE.getEnvio_IdFactura();

		/**
		 * The meta object literal for the '<em><b>Fecha Envio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIO__FECHA_ENVIO = eINSTANCE.getEnvio_FechaEnvio();

		/**
		 * The meta object literal for the '<em><b>Fecha Vencimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIO__FECHA_VENCIMIENTO = eINSTANCE.getEnvio_FechaVencimiento();

		/**
		 * The meta object literal for the '<em><b>The Ciudad Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIO__THE_CIUDAD_DESTINO = eINSTANCE.getEnvio_TheCiudadDestino();

		/**
		 * The meta object literal for the '<em><b>Lst Pedido</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIO__LST_PEDIDO = eINSTANCE.getEnvio_LstPedido();

		/**
		 * The meta object literal for the '<em><b>Owened By Factory Envio</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIO__OWENED_BY_FACTORY_ENVIO = eINSTANCE.getEnvio_OwenedByFactoryEnvio();

		/**
		 * The meta object literal for the '<em><b>Lst Ruta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIO__LST_RUTA = eINSTANCE.getEnvio_LstRuta();

		/**
		 * The meta object literal for the '{@link den.domain.envio.impl.FactoryEnvioImpl <em>Factory Envio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.envio.impl.FactoryEnvioImpl
		 * @see den.domain.envio.impl.EnvioPackageImpl#getFactoryEnvio()
		 * @generated
		 */
		EClass FACTORY_ENVIO = eINSTANCE.getFactoryEnvio();

		/**
		 * The meta object literal for the '<em><b>Lst Envio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_ENVIO__LST_ENVIO = eINSTANCE.getFactoryEnvio_LstEnvio();

		/**
		 * The meta object literal for the '<em><b>Id Envio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY_ENVIO__ID_ENVIO = eINSTANCE.getFactoryEnvio_IdEnvio();

		/**
		 * The meta object literal for the '<em><b>Owened By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_ENVIO__OWENED_BY_DOMAIN = eINSTANCE.getFactoryEnvio_OwenedByDomain();

	}

} //EnvioPackage
