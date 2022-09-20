/**
 */
package den.domain.envio;

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
 *   <li>{@link den.domain.envio.DetallePedido#getId <em>Id</em>}</li>
 *   <li>{@link den.domain.envio.DetallePedido#getCantidad <em>Cantidad</em>}</li>
 *   <li>{@link den.domain.envio.DetallePedido#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link den.domain.envio.DetallePedido#getValorUnitario <em>Valor Unitario</em>}</li>
 *   <li>{@link den.domain.envio.DetallePedido#getOwenedByEnvio <em>Owened By Envio</em>}</li>
 * </ul>
 *
 * @see den.domain.envio.EnvioPackage#getDetallePedido()
 * @model
 * @generated
 */
public interface DetallePedido extends EObject {
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
	 * @see den.domain.envio.EnvioPackage#getDetallePedido_Id()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link den.domain.envio.DetallePedido#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Cantidad</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cantidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cantidad</em>' attribute.
	 * @see #setCantidad(String)
	 * @see den.domain.envio.EnvioPackage#getDetallePedido_Cantidad()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getCantidad();

	/**
	 * Sets the value of the '{@link den.domain.envio.DetallePedido#getCantidad <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cantidad</em>' attribute.
	 * @see #getCantidad()
	 * @generated
	 */
	void setCantidad(String value);

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
	 * @see den.domain.envio.EnvioPackage#getDetallePedido_Descripcion()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link den.domain.envio.DetallePedido#getDescripcion <em>Descripcion</em>}' attribute.
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
	 * @see den.domain.envio.EnvioPackage#getDetallePedido_ValorUnitario()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getValorUnitario();

	/**
	 * Sets the value of the '{@link den.domain.envio.DetallePedido#getValorUnitario <em>Valor Unitario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Unitario</em>' attribute.
	 * @see #getValorUnitario()
	 * @generated
	 */
	void setValorUnitario(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Envio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.envio.Envio#getLstDetallePedido <em>Lst Detalle Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Envio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Envio</em>' container reference.
	 * @see #setOwenedByEnvio(Envio)
	 * @see den.domain.envio.EnvioPackage#getDetallePedido_OwenedByEnvio()
	 * @see den.domain.envio.Envio#getLstDetallePedido
	 * @model opposite="lstDetallePedido" transient="false"
	 * @generated
	 */
	Envio getOwenedByEnvio();

	/**
	 * Sets the value of the '{@link den.domain.envio.DetallePedido#getOwenedByEnvio <em>Owened By Envio</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Envio</em>' container reference.
	 * @see #getOwenedByEnvio()
	 * @generated
	 */
	void setOwenedByEnvio(Envio value);

} // DetallePedido
