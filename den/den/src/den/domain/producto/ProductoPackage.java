/**
 */
package den.domain.producto;

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
 * @see den.domain.producto.ProductoFactory
 * @model kind="package"
 * @generated
 */
public interface ProductoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "producto";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///den/domain/producto.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "den.domain.producto";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductoPackage eINSTANCE = den.domain.producto.impl.ProductoPackageImpl.init();

	/**
	 * The meta object id for the '{@link den.domain.producto.impl.FactoryProductoImpl <em>Factory Producto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.producto.impl.FactoryProductoImpl
	 * @see den.domain.producto.impl.ProductoPackageImpl#getFactoryProducto()
	 * @generated
	 */
	int FACTORY_PRODUCTO = 0;

	/**
	 * The feature id for the '<em><b>Id Producto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PRODUCTO__ID_PRODUCTO = 0;

	/**
	 * The feature id for the '<em><b>Owened By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PRODUCTO__OWENED_BY_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Lst Producto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PRODUCTO__LST_PRODUCTO = 2;

	/**
	 * The number of structural features of the '<em>Factory Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PRODUCTO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link den.domain.producto.impl.ProductoImpl <em>Producto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.producto.impl.ProductoImpl
	 * @see den.domain.producto.impl.ProductoPackageImpl#getProducto()
	 * @generated
	 */
	int PRODUCTO = 1;

	/**
	 * The feature id for the '<em><b>Lst Transporte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__LST_TRANSPORTE = 0;

	/**
	 * The feature id for the '<em><b>Id Producto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__ID_PRODUCTO = 1;

	/**
	 * The feature id for the '<em><b>Codigo Producto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__CODIGO_PRODUCTO = 2;

	/**
	 * The feature id for the '<em><b>Peso Neto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__PESO_NETO = 3;

	/**
	 * The feature id for the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__MARCA = 4;

	/**
	 * The feature id for the '<em><b>Fecha Vencimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__FECHA_VENCIMIENTO = 5;

	/**
	 * The feature id for the '<em><b>Fecha Elaboracion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__FECHA_ELABORACION = 6;

	/**
	 * The feature id for the '<em><b>Peso Bruto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__PESO_BRUTO = 7;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__PRECIO = 8;

	/**
	 * The feature id for the '<em><b>Lst Detalle Pedido</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__LST_DETALLE_PEDIDO = 9;

	/**
	 * The feature id for the '<em><b>Owened Factory Producto</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO__OWENED_FACTORY_PRODUCTO = 10;

	/**
	 * The number of structural features of the '<em>Producto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTO_FEATURE_COUNT = 11;


	/**
	 * Returns the meta object for class '{@link den.domain.producto.FactoryProducto <em>Factory Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Producto</em>'.
	 * @see den.domain.producto.FactoryProducto
	 * @generated
	 */
	EClass getFactoryProducto();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.producto.FactoryProducto#getIdProducto <em>Id Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Producto</em>'.
	 * @see den.domain.producto.FactoryProducto#getIdProducto()
	 * @see #getFactoryProducto()
	 * @generated
	 */
	EAttribute getFactoryProducto_IdProducto();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.producto.FactoryProducto#getOwenedByDomain <em>Owened By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Domain</em>'.
	 * @see den.domain.producto.FactoryProducto#getOwenedByDomain()
	 * @see #getFactoryProducto()
	 * @generated
	 */
	EReference getFactoryProducto_OwenedByDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link den.domain.producto.FactoryProducto#getLstProducto <em>Lst Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Producto</em>'.
	 * @see den.domain.producto.FactoryProducto#getLstProducto()
	 * @see #getFactoryProducto()
	 * @generated
	 */
	EReference getFactoryProducto_LstProducto();

	/**
	 * Returns the meta object for class '{@link den.domain.producto.Producto <em>Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producto</em>'.
	 * @see den.domain.producto.Producto
	 * @generated
	 */
	EClass getProducto();

	/**
	 * Returns the meta object for the reference '{@link den.domain.producto.Producto#getLstTransporte <em>Lst Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lst Transporte</em>'.
	 * @see den.domain.producto.Producto#getLstTransporte()
	 * @see #getProducto()
	 * @generated
	 */
	EReference getProducto_LstTransporte();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.producto.Producto#getIdProducto <em>Id Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Producto</em>'.
	 * @see den.domain.producto.Producto#getIdProducto()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_IdProducto();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.producto.Producto#getCodigoProducto <em>Codigo Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Producto</em>'.
	 * @see den.domain.producto.Producto#getCodigoProducto()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_CodigoProducto();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.producto.Producto#getPesoNeto <em>Peso Neto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peso Neto</em>'.
	 * @see den.domain.producto.Producto#getPesoNeto()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_PesoNeto();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.producto.Producto#getMarca <em>Marca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marca</em>'.
	 * @see den.domain.producto.Producto#getMarca()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Marca();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.producto.Producto#getFechaVencimiento <em>Fecha Vencimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Vencimiento</em>'.
	 * @see den.domain.producto.Producto#getFechaVencimiento()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_FechaVencimiento();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.producto.Producto#getFechaElaboracion <em>Fecha Elaboracion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Elaboracion</em>'.
	 * @see den.domain.producto.Producto#getFechaElaboracion()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_FechaElaboracion();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.producto.Producto#getPesoBruto <em>Peso Bruto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peso Bruto</em>'.
	 * @see den.domain.producto.Producto#getPesoBruto()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_PesoBruto();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.producto.Producto#getPrecio <em>Precio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio</em>'.
	 * @see den.domain.producto.Producto#getPrecio()
	 * @see #getProducto()
	 * @generated
	 */
	EAttribute getProducto_Precio();

	/**
	 * Returns the meta object for the reference list '{@link den.domain.producto.Producto#getLstDetallePedido <em>Lst Detalle Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Detalle Pedido</em>'.
	 * @see den.domain.producto.Producto#getLstDetallePedido()
	 * @see #getProducto()
	 * @generated
	 */
	EReference getProducto_LstDetallePedido();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.producto.Producto#getOwenedFactoryProducto <em>Owened Factory Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened Factory Producto</em>'.
	 * @see den.domain.producto.Producto#getOwenedFactoryProducto()
	 * @see #getProducto()
	 * @generated
	 */
	EReference getProducto_OwenedFactoryProducto();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductoFactory getProductoFactory();

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
		 * The meta object literal for the '{@link den.domain.producto.impl.FactoryProductoImpl <em>Factory Producto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.producto.impl.FactoryProductoImpl
		 * @see den.domain.producto.impl.ProductoPackageImpl#getFactoryProducto()
		 * @generated
		 */
		EClass FACTORY_PRODUCTO = eINSTANCE.getFactoryProducto();

		/**
		 * The meta object literal for the '<em><b>Id Producto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY_PRODUCTO__ID_PRODUCTO = eINSTANCE.getFactoryProducto_IdProducto();

		/**
		 * The meta object literal for the '<em><b>Owened By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_PRODUCTO__OWENED_BY_DOMAIN = eINSTANCE.getFactoryProducto_OwenedByDomain();

		/**
		 * The meta object literal for the '<em><b>Lst Producto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_PRODUCTO__LST_PRODUCTO = eINSTANCE.getFactoryProducto_LstProducto();

		/**
		 * The meta object literal for the '{@link den.domain.producto.impl.ProductoImpl <em>Producto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.producto.impl.ProductoImpl
		 * @see den.domain.producto.impl.ProductoPackageImpl#getProducto()
		 * @generated
		 */
		EClass PRODUCTO = eINSTANCE.getProducto();

		/**
		 * The meta object literal for the '<em><b>Lst Transporte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO__LST_TRANSPORTE = eINSTANCE.getProducto_LstTransporte();

		/**
		 * The meta object literal for the '<em><b>Id Producto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__ID_PRODUCTO = eINSTANCE.getProducto_IdProducto();

		/**
		 * The meta object literal for the '<em><b>Codigo Producto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__CODIGO_PRODUCTO = eINSTANCE.getProducto_CodigoProducto();

		/**
		 * The meta object literal for the '<em><b>Peso Neto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__PESO_NETO = eINSTANCE.getProducto_PesoNeto();

		/**
		 * The meta object literal for the '<em><b>Marca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__MARCA = eINSTANCE.getProducto_Marca();

		/**
		 * The meta object literal for the '<em><b>Fecha Vencimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__FECHA_VENCIMIENTO = eINSTANCE.getProducto_FechaVencimiento();

		/**
		 * The meta object literal for the '<em><b>Fecha Elaboracion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__FECHA_ELABORACION = eINSTANCE.getProducto_FechaElaboracion();

		/**
		 * The meta object literal for the '<em><b>Peso Bruto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__PESO_BRUTO = eINSTANCE.getProducto_PesoBruto();

		/**
		 * The meta object literal for the '<em><b>Precio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTO__PRECIO = eINSTANCE.getProducto_Precio();

		/**
		 * The meta object literal for the '<em><b>Lst Detalle Pedido</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO__LST_DETALLE_PEDIDO = eINSTANCE.getProducto_LstDetallePedido();

		/**
		 * The meta object literal for the '<em><b>Owened Factory Producto</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTO__OWENED_FACTORY_PRODUCTO = eINSTANCE.getProducto_OwenedFactoryProducto();

	}

} //ProductoPackage
