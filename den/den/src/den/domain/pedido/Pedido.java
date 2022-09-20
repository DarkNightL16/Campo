/**
 */
package den.domain.pedido;

import den.domain.envio.Envio;

import den.domain.persona.Persona;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pedido</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.pedido.Pedido#getId <em>Id</em>}</li>
 *   <li>{@link den.domain.pedido.Pedido#getFecha <em>Fecha</em>}</li>
 *   <li>{@link den.domain.pedido.Pedido#getTotal <em>Total</em>}</li>
 *   <li>{@link den.domain.pedido.Pedido#getSubTotal <em>Sub Total</em>}</li>
 *   <li>{@link den.domain.pedido.Pedido#getIva <em>Iva</em>}</li>
 *   <li>{@link den.domain.pedido.Pedido#getDescuento <em>Descuento</em>}</li>
 *   <li>{@link den.domain.pedido.Pedido#getLstDetallePedido <em>Lst Detalle Pedido</em>}</li>
 *   <li>{@link den.domain.pedido.Pedido#getOwenedByFactoryPedido <em>Owened By Factory Pedido</em>}</li>
 *   <li>{@link den.domain.pedido.Pedido#getLstPersona <em>Lst Persona</em>}</li>
 *   <li>{@link den.domain.pedido.Pedido#getTheEnvio <em>The Envio</em>}</li>
 * </ul>
 *
 * @see den.domain.pedido.PedidoPackage#getPedido()
 * @model
 * @generated
 */
public interface Pedido extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see den.domain.pedido.PedidoPackage#getPedido_Id()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link den.domain.pedido.Pedido#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Fecha</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha</em>' attribute.
	 * @see #setFecha(String)
	 * @see den.domain.pedido.PedidoPackage#getPedido_Fecha()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getFecha();

	/**
	 * Sets the value of the '{@link den.domain.pedido.Pedido#getFecha <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha</em>' attribute.
	 * @see #getFecha()
	 * @generated
	 */
	void setFecha(String value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(String)
	 * @see den.domain.pedido.PedidoPackage#getPedido_Total()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getTotal();

	/**
	 * Sets the value of the '{@link den.domain.pedido.Pedido#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(String value);

	/**
	 * Returns the value of the '<em><b>Sub Total</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Total</em>' attribute.
	 * @see #setSubTotal(String)
	 * @see den.domain.pedido.PedidoPackage#getPedido_SubTotal()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getSubTotal();

	/**
	 * Sets the value of the '{@link den.domain.pedido.Pedido#getSubTotal <em>Sub Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Total</em>' attribute.
	 * @see #getSubTotal()
	 * @generated
	 */
	void setSubTotal(String value);

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
	 * @see den.domain.pedido.PedidoPackage#getPedido_Iva()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIva();

	/**
	 * Sets the value of the '{@link den.domain.pedido.Pedido#getIva <em>Iva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iva</em>' attribute.
	 * @see #getIva()
	 * @generated
	 */
	void setIva(String value);

	/**
	 * Returns the value of the '<em><b>Descuento</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descuento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descuento</em>' attribute.
	 * @see #setDescuento(String)
	 * @see den.domain.pedido.PedidoPackage#getPedido_Descuento()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getDescuento();

	/**
	 * Sets the value of the '{@link den.domain.pedido.Pedido#getDescuento <em>Descuento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descuento</em>' attribute.
	 * @see #getDescuento()
	 * @generated
	 */
	void setDescuento(String value);

	/**
	 * Returns the value of the '<em><b>Lst Detalle Pedido</b></em>' containment reference list.
	 * The list contents are of type {@link den.domain.pedido.DetallePedido}.
	 * It is bidirectional and its opposite is '{@link den.domain.pedido.DetallePedido#getOwenedByPedido <em>Owened By Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Detalle Pedido</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Detalle Pedido</em>' containment reference list.
	 * @see den.domain.pedido.PedidoPackage#getPedido_LstDetallePedido()
	 * @see den.domain.pedido.DetallePedido#getOwenedByPedido
	 * @model opposite="owenedByPedido" containment="true"
	 * @generated
	 */
	EList<DetallePedido> getLstDetallePedido();

	/**
	 * Returns the value of the '<em><b>Owened By Factory Pedido</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.pedido.FactoryPedido#getLstPedido <em>Lst Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Factory Pedido</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Factory Pedido</em>' container reference.
	 * @see #setOwenedByFactoryPedido(FactoryPedido)
	 * @see den.domain.pedido.PedidoPackage#getPedido_OwenedByFactoryPedido()
	 * @see den.domain.pedido.FactoryPedido#getLstPedido
	 * @model opposite="lstPedido" transient="false"
	 * @generated
	 */
	FactoryPedido getOwenedByFactoryPedido();

	/**
	 * Sets the value of the '{@link den.domain.pedido.Pedido#getOwenedByFactoryPedido <em>Owened By Factory Pedido</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Factory Pedido</em>' container reference.
	 * @see #getOwenedByFactoryPedido()
	 * @generated
	 */
	void setOwenedByFactoryPedido(FactoryPedido value);

	/**
	 * Returns the value of the '<em><b>Lst Persona</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.persona.Persona#getLstPedido <em>Lst Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Persona</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Persona</em>' reference.
	 * @see #setLstPersona(Persona)
	 * @see den.domain.pedido.PedidoPackage#getPedido_LstPersona()
	 * @see den.domain.persona.Persona#getLstPedido
	 * @model opposite="lstPedido"
	 * @generated
	 */
	Persona getLstPersona();

	/**
	 * Sets the value of the '{@link den.domain.pedido.Pedido#getLstPersona <em>Lst Persona</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Persona</em>' reference.
	 * @see #getLstPersona()
	 * @generated
	 */
	void setLstPersona(Persona value);

	/**
	 * Returns the value of the '<em><b>The Envio</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.envio.Envio#getLstPedido <em>Lst Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Envio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Envio</em>' reference.
	 * @see #setTheEnvio(Envio)
	 * @see den.domain.pedido.PedidoPackage#getPedido_TheEnvio()
	 * @see den.domain.envio.Envio#getLstPedido
	 * @model opposite="lstPedido"
	 * @generated
	 */
	Envio getTheEnvio();

	/**
	 * Sets the value of the '{@link den.domain.pedido.Pedido#getTheEnvio <em>The Envio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Envio</em>' reference.
	 * @see #getTheEnvio()
	 * @generated
	 */
	void setTheEnvio(Envio value);

} // Pedido
