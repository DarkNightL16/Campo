/**
 */
package den.domain.pedido;

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
 * @see den.domain.pedido.PedidoFactory
 * @model kind="package"
 * @generated
 */
public interface PedidoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pedido";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///den/domain/pedido.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "den.domain.pedido";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PedidoPackage eINSTANCE = den.domain.pedido.impl.PedidoPackageImpl.init();

	/**
	 * The meta object id for the '{@link den.domain.pedido.impl.DetallePedidoImpl <em>Detalle Pedido</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.pedido.impl.DetallePedidoImpl
	 * @see den.domain.pedido.impl.PedidoPackageImpl#getDetallePedido()
	 * @generated
	 */
	int DETALLE_PEDIDO = 0;

	/**
	 * The feature id for the '<em><b>Id Pedido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO__ID_PEDIDO = 0;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO__DESCRIPCION = 1;

	/**
	 * The feature id for the '<em><b>Valor Unitario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO__VALOR_UNITARIO = 2;

	/**
	 * The feature id for the '<em><b>Valor Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO__VALOR_TOTAL = 3;

	/**
	 * The feature id for the '<em><b>Iva</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO__IVA = 4;

	/**
	 * The feature id for the '<em><b>Total Pagar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO__TOTAL_PAGAR = 5;

	/**
	 * The feature id for the '<em><b>Cantidad Kilos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO__CANTIDAD_KILOS = 6;

	/**
	 * The feature id for the '<em><b>Owened By Pedido</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO__OWENED_BY_PEDIDO = 7;

	/**
	 * The feature id for the '<em><b>Lst Producto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO__LST_PRODUCTO = 8;

	/**
	 * The number of structural features of the '<em>Detalle Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_PEDIDO_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link den.domain.pedido.impl.FactoryPedidoImpl <em>Factory Pedido</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.pedido.impl.FactoryPedidoImpl
	 * @see den.domain.pedido.impl.PedidoPackageImpl#getFactoryPedido()
	 * @generated
	 */
	int FACTORY_PEDIDO = 1;

	/**
	 * The feature id for the '<em><b>Id Pedido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PEDIDO__ID_PEDIDO = 0;

	/**
	 * The feature id for the '<em><b>Owened By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PEDIDO__OWENED_BY_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Lst Pedido</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PEDIDO__LST_PEDIDO = 2;

	/**
	 * The number of structural features of the '<em>Factory Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PEDIDO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link den.domain.pedido.impl.PedidoImpl <em>Pedido</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.pedido.impl.PedidoImpl
	 * @see den.domain.pedido.impl.PedidoPackageImpl#getPedido()
	 * @generated
	 */
	int PEDIDO = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__ID = 0;

	/**
	 * The feature id for the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__FECHA = 1;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__TOTAL = 2;

	/**
	 * The feature id for the '<em><b>Sub Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__SUB_TOTAL = 3;

	/**
	 * The feature id for the '<em><b>Iva</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__IVA = 4;

	/**
	 * The feature id for the '<em><b>Descuento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__DESCUENTO = 5;

	/**
	 * The feature id for the '<em><b>Lst Detalle Pedido</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__LST_DETALLE_PEDIDO = 6;

	/**
	 * The feature id for the '<em><b>Owened By Factory Pedido</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__OWENED_BY_FACTORY_PEDIDO = 7;

	/**
	 * The feature id for the '<em><b>Lst Persona</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__LST_PERSONA = 8;

	/**
	 * The feature id for the '<em><b>The Envio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__THE_ENVIO = 9;

	/**
	 * The number of structural features of the '<em>Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO_FEATURE_COUNT = 10;


	/**
	 * Returns the meta object for class '{@link den.domain.pedido.DetallePedido <em>Detalle Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detalle Pedido</em>'.
	 * @see den.domain.pedido.DetallePedido
	 * @generated
	 */
	EClass getDetallePedido();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.pedido.DetallePedido#getIdPedido <em>Id Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Pedido</em>'.
	 * @see den.domain.pedido.DetallePedido#getIdPedido()
	 * @see #getDetallePedido()
	 * @generated
	 */
	EAttribute getDetallePedido_IdPedido();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.pedido.DetallePedido#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see den.domain.pedido.DetallePedido#getDescripcion()
	 * @see #getDetallePedido()
	 * @generated
	 */
	EAttribute getDetallePedido_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.pedido.DetallePedido#getValorUnitario <em>Valor Unitario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Unitario</em>'.
	 * @see den.domain.pedido.DetallePedido#getValorUnitario()
	 * @see #getDetallePedido()
	 * @generated
	 */
	EAttribute getDetallePedido_ValorUnitario();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.pedido.DetallePedido#getValorTotal <em>Valor Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Total</em>'.
	 * @see den.domain.pedido.DetallePedido#getValorTotal()
	 * @see #getDetallePedido()
	 * @generated
	 */
	EAttribute getDetallePedido_ValorTotal();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.pedido.DetallePedido#getIva <em>Iva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iva</em>'.
	 * @see den.domain.pedido.DetallePedido#getIva()
	 * @see #getDetallePedido()
	 * @generated
	 */
	EAttribute getDetallePedido_Iva();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.pedido.DetallePedido#getTotalPagar <em>Total Pagar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Pagar</em>'.
	 * @see den.domain.pedido.DetallePedido#getTotalPagar()
	 * @see #getDetallePedido()
	 * @generated
	 */
	EAttribute getDetallePedido_TotalPagar();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.pedido.DetallePedido#getCantidadKilos <em>Cantidad Kilos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cantidad Kilos</em>'.
	 * @see den.domain.pedido.DetallePedido#getCantidadKilos()
	 * @see #getDetallePedido()
	 * @generated
	 */
	EAttribute getDetallePedido_CantidadKilos();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.pedido.DetallePedido#getOwenedByPedido <em>Owened By Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Pedido</em>'.
	 * @see den.domain.pedido.DetallePedido#getOwenedByPedido()
	 * @see #getDetallePedido()
	 * @generated
	 */
	EReference getDetallePedido_OwenedByPedido();

	/**
	 * Returns the meta object for the reference list '{@link den.domain.pedido.DetallePedido#getLstProducto <em>Lst Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Producto</em>'.
	 * @see den.domain.pedido.DetallePedido#getLstProducto()
	 * @see #getDetallePedido()
	 * @generated
	 */
	EReference getDetallePedido_LstProducto();

	/**
	 * Returns the meta object for class '{@link den.domain.pedido.FactoryPedido <em>Factory Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Pedido</em>'.
	 * @see den.domain.pedido.FactoryPedido
	 * @generated
	 */
	EClass getFactoryPedido();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.pedido.FactoryPedido#getIdPedido <em>Id Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Pedido</em>'.
	 * @see den.domain.pedido.FactoryPedido#getIdPedido()
	 * @see #getFactoryPedido()
	 * @generated
	 */
	EAttribute getFactoryPedido_IdPedido();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.pedido.FactoryPedido#getOwenedByDomain <em>Owened By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Domain</em>'.
	 * @see den.domain.pedido.FactoryPedido#getOwenedByDomain()
	 * @see #getFactoryPedido()
	 * @generated
	 */
	EReference getFactoryPedido_OwenedByDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link den.domain.pedido.FactoryPedido#getLstPedido <em>Lst Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Pedido</em>'.
	 * @see den.domain.pedido.FactoryPedido#getLstPedido()
	 * @see #getFactoryPedido()
	 * @generated
	 */
	EReference getFactoryPedido_LstPedido();

	/**
	 * Returns the meta object for class '{@link den.domain.pedido.Pedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedido</em>'.
	 * @see den.domain.pedido.Pedido
	 * @generated
	 */
	EClass getPedido();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.pedido.Pedido#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see den.domain.pedido.Pedido#getId()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_Id();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.pedido.Pedido#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha</em>'.
	 * @see den.domain.pedido.Pedido#getFecha()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_Fecha();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.pedido.Pedido#getTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see den.domain.pedido.Pedido#getTotal()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_Total();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.pedido.Pedido#getSubTotal <em>Sub Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Total</em>'.
	 * @see den.domain.pedido.Pedido#getSubTotal()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_SubTotal();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.pedido.Pedido#getIva <em>Iva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iva</em>'.
	 * @see den.domain.pedido.Pedido#getIva()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_Iva();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.pedido.Pedido#getDescuento <em>Descuento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descuento</em>'.
	 * @see den.domain.pedido.Pedido#getDescuento()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_Descuento();

	/**
	 * Returns the meta object for the containment reference list '{@link den.domain.pedido.Pedido#getLstDetallePedido <em>Lst Detalle Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Detalle Pedido</em>'.
	 * @see den.domain.pedido.Pedido#getLstDetallePedido()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_LstDetallePedido();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.pedido.Pedido#getOwenedByFactoryPedido <em>Owened By Factory Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Factory Pedido</em>'.
	 * @see den.domain.pedido.Pedido#getOwenedByFactoryPedido()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_OwenedByFactoryPedido();

	/**
	 * Returns the meta object for the reference '{@link den.domain.pedido.Pedido#getLstPersona <em>Lst Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lst Persona</em>'.
	 * @see den.domain.pedido.Pedido#getLstPersona()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_LstPersona();

	/**
	 * Returns the meta object for the reference '{@link den.domain.pedido.Pedido#getTheEnvio <em>The Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Envio</em>'.
	 * @see den.domain.pedido.Pedido#getTheEnvio()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_TheEnvio();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PedidoFactory getPedidoFactory();

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
		 * The meta object literal for the '{@link den.domain.pedido.impl.DetallePedidoImpl <em>Detalle Pedido</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.pedido.impl.DetallePedidoImpl
		 * @see den.domain.pedido.impl.PedidoPackageImpl#getDetallePedido()
		 * @generated
		 */
		EClass DETALLE_PEDIDO = eINSTANCE.getDetallePedido();

		/**
		 * The meta object literal for the '<em><b>Id Pedido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_PEDIDO__ID_PEDIDO = eINSTANCE.getDetallePedido_IdPedido();

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
		 * The meta object literal for the '<em><b>Valor Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_PEDIDO__VALOR_TOTAL = eINSTANCE.getDetallePedido_ValorTotal();

		/**
		 * The meta object literal for the '<em><b>Iva</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_PEDIDO__IVA = eINSTANCE.getDetallePedido_Iva();

		/**
		 * The meta object literal for the '<em><b>Total Pagar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_PEDIDO__TOTAL_PAGAR = eINSTANCE.getDetallePedido_TotalPagar();

		/**
		 * The meta object literal for the '<em><b>Cantidad Kilos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE_PEDIDO__CANTIDAD_KILOS = eINSTANCE.getDetallePedido_CantidadKilos();

		/**
		 * The meta object literal for the '<em><b>Owened By Pedido</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETALLE_PEDIDO__OWENED_BY_PEDIDO = eINSTANCE.getDetallePedido_OwenedByPedido();

		/**
		 * The meta object literal for the '<em><b>Lst Producto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETALLE_PEDIDO__LST_PRODUCTO = eINSTANCE.getDetallePedido_LstProducto();

		/**
		 * The meta object literal for the '{@link den.domain.pedido.impl.FactoryPedidoImpl <em>Factory Pedido</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.pedido.impl.FactoryPedidoImpl
		 * @see den.domain.pedido.impl.PedidoPackageImpl#getFactoryPedido()
		 * @generated
		 */
		EClass FACTORY_PEDIDO = eINSTANCE.getFactoryPedido();

		/**
		 * The meta object literal for the '<em><b>Id Pedido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY_PEDIDO__ID_PEDIDO = eINSTANCE.getFactoryPedido_IdPedido();

		/**
		 * The meta object literal for the '<em><b>Owened By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_PEDIDO__OWENED_BY_DOMAIN = eINSTANCE.getFactoryPedido_OwenedByDomain();

		/**
		 * The meta object literal for the '<em><b>Lst Pedido</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_PEDIDO__LST_PEDIDO = eINSTANCE.getFactoryPedido_LstPedido();

		/**
		 * The meta object literal for the '{@link den.domain.pedido.impl.PedidoImpl <em>Pedido</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.pedido.impl.PedidoImpl
		 * @see den.domain.pedido.impl.PedidoPackageImpl#getPedido()
		 * @generated
		 */
		EClass PEDIDO = eINSTANCE.getPedido();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__ID = eINSTANCE.getPedido_Id();

		/**
		 * The meta object literal for the '<em><b>Fecha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__FECHA = eINSTANCE.getPedido_Fecha();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__TOTAL = eINSTANCE.getPedido_Total();

		/**
		 * The meta object literal for the '<em><b>Sub Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__SUB_TOTAL = eINSTANCE.getPedido_SubTotal();

		/**
		 * The meta object literal for the '<em><b>Iva</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__IVA = eINSTANCE.getPedido_Iva();

		/**
		 * The meta object literal for the '<em><b>Descuento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__DESCUENTO = eINSTANCE.getPedido_Descuento();

		/**
		 * The meta object literal for the '<em><b>Lst Detalle Pedido</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__LST_DETALLE_PEDIDO = eINSTANCE.getPedido_LstDetallePedido();

		/**
		 * The meta object literal for the '<em><b>Owened By Factory Pedido</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__OWENED_BY_FACTORY_PEDIDO = eINSTANCE.getPedido_OwenedByFactoryPedido();

		/**
		 * The meta object literal for the '<em><b>Lst Persona</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__LST_PERSONA = eINSTANCE.getPedido_LstPersona();

		/**
		 * The meta object literal for the '<em><b>The Envio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__THE_ENVIO = eINSTANCE.getPedido_TheEnvio();

	}

} //PedidoPackage
