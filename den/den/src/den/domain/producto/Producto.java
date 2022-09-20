/**
 */
package den.domain.producto;

import den.domain.pedido.DetallePedido;

import den.domain.transporte.Transporte;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.producto.Producto#getLstTransporte <em>Lst Transporte</em>}</li>
 *   <li>{@link den.domain.producto.Producto#getIdProducto <em>Id Producto</em>}</li>
 *   <li>{@link den.domain.producto.Producto#getCodigoProducto <em>Codigo Producto</em>}</li>
 *   <li>{@link den.domain.producto.Producto#getPesoNeto <em>Peso Neto</em>}</li>
 *   <li>{@link den.domain.producto.Producto#getMarca <em>Marca</em>}</li>
 *   <li>{@link den.domain.producto.Producto#getFechaVencimiento <em>Fecha Vencimiento</em>}</li>
 *   <li>{@link den.domain.producto.Producto#getFechaElaboracion <em>Fecha Elaboracion</em>}</li>
 *   <li>{@link den.domain.producto.Producto#getPesoBruto <em>Peso Bruto</em>}</li>
 *   <li>{@link den.domain.producto.Producto#getPrecio <em>Precio</em>}</li>
 *   <li>{@link den.domain.producto.Producto#getLstDetallePedido <em>Lst Detalle Pedido</em>}</li>
 *   <li>{@link den.domain.producto.Producto#getOwenedFactoryProducto <em>Owened Factory Producto</em>}</li>
 * </ul>
 *
 * @see den.domain.producto.ProductoPackage#getProducto()
 * @model
 * @generated
 */
public interface Producto extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Transporte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.transporte.Transporte#getLstProducto <em>Lst Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Transporte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Transporte</em>' reference.
	 * @see #setLstTransporte(Transporte)
	 * @see den.domain.producto.ProductoPackage#getProducto_LstTransporte()
	 * @see den.domain.transporte.Transporte#getLstProducto
	 * @model opposite="lstProducto"
	 * @generated
	 */
	Transporte getLstTransporte();

	/**
	 * Sets the value of the '{@link den.domain.producto.Producto#getLstTransporte <em>Lst Transporte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Transporte</em>' reference.
	 * @see #getLstTransporte()
	 * @generated
	 */
	void setLstTransporte(Transporte value);

	/**
	 * Returns the value of the '<em><b>Id Producto</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Producto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Producto</em>' attribute.
	 * @see #setIdProducto(String)
	 * @see den.domain.producto.ProductoPackage#getProducto_IdProducto()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdProducto();

	/**
	 * Sets the value of the '{@link den.domain.producto.Producto#getIdProducto <em>Id Producto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Producto</em>' attribute.
	 * @see #getIdProducto()
	 * @generated
	 */
	void setIdProducto(String value);

	/**
	 * Returns the value of the '<em><b>Codigo Producto</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Producto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Producto</em>' attribute.
	 * @see #setCodigoProducto(String)
	 * @see den.domain.producto.ProductoPackage#getProducto_CodigoProducto()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getCodigoProducto();

	/**
	 * Sets the value of the '{@link den.domain.producto.Producto#getCodigoProducto <em>Codigo Producto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo Producto</em>' attribute.
	 * @see #getCodigoProducto()
	 * @generated
	 */
	void setCodigoProducto(String value);

	/**
	 * Returns the value of the '<em><b>Peso Neto</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peso Neto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peso Neto</em>' attribute.
	 * @see #setPesoNeto(String)
	 * @see den.domain.producto.ProductoPackage#getProducto_PesoNeto()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getPesoNeto();

	/**
	 * Sets the value of the '{@link den.domain.producto.Producto#getPesoNeto <em>Peso Neto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peso Neto</em>' attribute.
	 * @see #getPesoNeto()
	 * @generated
	 */
	void setPesoNeto(String value);

	/**
	 * Returns the value of the '<em><b>Marca</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marca</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marca</em>' attribute.
	 * @see #setMarca(String)
	 * @see den.domain.producto.ProductoPackage#getProducto_Marca()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getMarca();

	/**
	 * Sets the value of the '{@link den.domain.producto.Producto#getMarca <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marca</em>' attribute.
	 * @see #getMarca()
	 * @generated
	 */
	void setMarca(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Vencimiento</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Vencimiento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Vencimiento</em>' attribute.
	 * @see #setFechaVencimiento(String)
	 * @see den.domain.producto.ProductoPackage#getProducto_FechaVencimiento()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getFechaVencimiento();

	/**
	 * Sets the value of the '{@link den.domain.producto.Producto#getFechaVencimiento <em>Fecha Vencimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Vencimiento</em>' attribute.
	 * @see #getFechaVencimiento()
	 * @generated
	 */
	void setFechaVencimiento(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Elaboracion</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Elaboracion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Elaboracion</em>' attribute.
	 * @see #setFechaElaboracion(String)
	 * @see den.domain.producto.ProductoPackage#getProducto_FechaElaboracion()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getFechaElaboracion();

	/**
	 * Sets the value of the '{@link den.domain.producto.Producto#getFechaElaboracion <em>Fecha Elaboracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Elaboracion</em>' attribute.
	 * @see #getFechaElaboracion()
	 * @generated
	 */
	void setFechaElaboracion(String value);

	/**
	 * Returns the value of the '<em><b>Peso Bruto</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peso Bruto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peso Bruto</em>' attribute.
	 * @see #setPesoBruto(String)
	 * @see den.domain.producto.ProductoPackage#getProducto_PesoBruto()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getPesoBruto();

	/**
	 * Sets the value of the '{@link den.domain.producto.Producto#getPesoBruto <em>Peso Bruto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peso Bruto</em>' attribute.
	 * @see #getPesoBruto()
	 * @generated
	 */
	void setPesoBruto(String value);

	/**
	 * Returns the value of the '<em><b>Precio</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precio</em>' attribute.
	 * @see #setPrecio(String)
	 * @see den.domain.producto.ProductoPackage#getProducto_Precio()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getPrecio();

	/**
	 * Sets the value of the '{@link den.domain.producto.Producto#getPrecio <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precio</em>' attribute.
	 * @see #getPrecio()
	 * @generated
	 */
	void setPrecio(String value);

	/**
	 * Returns the value of the '<em><b>Lst Detalle Pedido</b></em>' reference list.
	 * The list contents are of type {@link den.domain.pedido.DetallePedido}.
	 * It is bidirectional and its opposite is '{@link den.domain.pedido.DetallePedido#getLstProducto <em>Lst Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Detalle Pedido</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Detalle Pedido</em>' reference list.
	 * @see den.domain.producto.ProductoPackage#getProducto_LstDetallePedido()
	 * @see den.domain.pedido.DetallePedido#getLstProducto
	 * @model opposite="lstProducto"
	 * @generated
	 */
	EList<DetallePedido> getLstDetallePedido();

	/**
	 * Returns the value of the '<em><b>Owened Factory Producto</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.producto.FactoryProducto#getLstProducto <em>Lst Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened Factory Producto</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened Factory Producto</em>' container reference.
	 * @see #setOwenedFactoryProducto(FactoryProducto)
	 * @see den.domain.producto.ProductoPackage#getProducto_OwenedFactoryProducto()
	 * @see den.domain.producto.FactoryProducto#getLstProducto
	 * @model opposite="lstProducto" transient="false"
	 * @generated
	 */
	FactoryProducto getOwenedFactoryProducto();

	/**
	 * Sets the value of the '{@link den.domain.producto.Producto#getOwenedFactoryProducto <em>Owened Factory Producto</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened Factory Producto</em>' container reference.
	 * @see #getOwenedFactoryProducto()
	 * @generated
	 */
	void setOwenedFactoryProducto(FactoryProducto value);

} // Producto
