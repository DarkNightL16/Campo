/**
 */
package den.domain.pedido;

import den.domain.producto.Producto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detalle Pedido</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.pedido.DetallePedido#getIdPedido <em>Id Pedido</em>}</li>
 *   <li>{@link den.domain.pedido.DetallePedido#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link den.domain.pedido.DetallePedido#getValorUnitario <em>Valor Unitario</em>}</li>
 *   <li>{@link den.domain.pedido.DetallePedido#getValorTotal <em>Valor Total</em>}</li>
 *   <li>{@link den.domain.pedido.DetallePedido#getIva <em>Iva</em>}</li>
 *   <li>{@link den.domain.pedido.DetallePedido#getTotalPagar <em>Total Pagar</em>}</li>
 *   <li>{@link den.domain.pedido.DetallePedido#getCantidadKilos <em>Cantidad Kilos</em>}</li>
 *   <li>{@link den.domain.pedido.DetallePedido#getOwenedByPedido <em>Owened By Pedido</em>}</li>
 *   <li>{@link den.domain.pedido.DetallePedido#getLstProducto <em>Lst Producto</em>}</li>
 * </ul>
 *
 * @see den.domain.pedido.PedidoPackage#getDetallePedido()
 * @model
 * @generated
 */
public interface DetallePedido extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Pedido</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Pedido</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Pedido</em>' attribute.
	 * @see #setIdPedido(String)
	 * @see den.domain.pedido.PedidoPackage#getDetallePedido_IdPedido()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdPedido();

	/**
	 * Sets the value of the '{@link den.domain.pedido.DetallePedido#getIdPedido <em>Id Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Pedido</em>' attribute.
	 * @see #getIdPedido()
	 * @generated
	 */
	void setIdPedido(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see den.domain.pedido.PedidoPackage#getDetallePedido_Descripcion()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link den.domain.pedido.DetallePedido#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Valor Unitario</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Unitario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Unitario</em>' attribute.
	 * @see #setValorUnitario(String)
	 * @see den.domain.pedido.PedidoPackage#getDetallePedido_ValorUnitario()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getValorUnitario();

	/**
	 * Sets the value of the '{@link den.domain.pedido.DetallePedido#getValorUnitario <em>Valor Unitario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Unitario</em>' attribute.
	 * @see #getValorUnitario()
	 * @generated
	 */
	void setValorUnitario(String value);

	/**
	 * Returns the value of the '<em><b>Valor Total</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Total</em>' attribute.
	 * @see #setValorTotal(String)
	 * @see den.domain.pedido.PedidoPackage#getDetallePedido_ValorTotal()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getValorTotal();

	/**
	 * Sets the value of the '{@link den.domain.pedido.DetallePedido#getValorTotal <em>Valor Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Total</em>' attribute.
	 * @see #getValorTotal()
	 * @generated
	 */
	void setValorTotal(String value);

	/**
	 * Returns the value of the '<em><b>Iva</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iva</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iva</em>' attribute.
	 * @see #setIva(String)
	 * @see den.domain.pedido.PedidoPackage#getDetallePedido_Iva()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIva();

	/**
	 * Sets the value of the '{@link den.domain.pedido.DetallePedido#getIva <em>Iva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iva</em>' attribute.
	 * @see #getIva()
	 * @generated
	 */
	void setIva(String value);

	/**
	 * Returns the value of the '<em><b>Total Pagar</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Pagar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Pagar</em>' attribute.
	 * @see #setTotalPagar(String)
	 * @see den.domain.pedido.PedidoPackage#getDetallePedido_TotalPagar()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getTotalPagar();

	/**
	 * Sets the value of the '{@link den.domain.pedido.DetallePedido#getTotalPagar <em>Total Pagar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Pagar</em>' attribute.
	 * @see #getTotalPagar()
	 * @generated
	 */
	void setTotalPagar(String value);

	/**
	 * Returns the value of the '<em><b>Cantidad Kilos</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cantidad Kilos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cantidad Kilos</em>' attribute.
	 * @see #setCantidadKilos(String)
	 * @see den.domain.pedido.PedidoPackage#getDetallePedido_CantidadKilos()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getCantidadKilos();

	/**
	 * Sets the value of the '{@link den.domain.pedido.DetallePedido#getCantidadKilos <em>Cantidad Kilos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cantidad Kilos</em>' attribute.
	 * @see #getCantidadKilos()
	 * @generated
	 */
	void setCantidadKilos(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Pedido</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.pedido.Pedido#getLstDetallePedido <em>Lst Detalle Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Pedido</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Pedido</em>' container reference.
	 * @see #setOwenedByPedido(Pedido)
	 * @see den.domain.pedido.PedidoPackage#getDetallePedido_OwenedByPedido()
	 * @see den.domain.pedido.Pedido#getLstDetallePedido
	 * @model opposite="lstDetallePedido" transient="false"
	 * @generated
	 */
	Pedido getOwenedByPedido();

	/**
	 * Sets the value of the '{@link den.domain.pedido.DetallePedido#getOwenedByPedido <em>Owened By Pedido</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Pedido</em>' container reference.
	 * @see #getOwenedByPedido()
	 * @generated
	 */
	void setOwenedByPedido(Pedido value);

	/**
	 * Returns the value of the '<em><b>Lst Producto</b></em>' reference list.
	 * The list contents are of type {@link den.domain.producto.Producto}.
	 * It is bidirectional and its opposite is '{@link den.domain.producto.Producto#getLstDetallePedido <em>Lst Detalle Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Producto</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Producto</em>' reference list.
	 * @see den.domain.pedido.PedidoPackage#getDetallePedido_LstProducto()
	 * @see den.domain.producto.Producto#getLstDetallePedido
	 * @model opposite="lstDetallePedido"
	 * @generated
	 */
	EList<Producto> getLstProducto();

} // DetallePedido
