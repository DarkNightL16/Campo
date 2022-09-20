/**
 */
package den.domain.envio;

import den.domain.pedido.Pedido;

import den.domain.ruta.Ruta;

import den.domain.transporte.Transporte;

import den.domain.ubicacion.Ciudad;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Envio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.envio.Envio#getTheCiudadOrigen <em>The Ciudad Origen</em>}</li>
 *   <li>{@link den.domain.envio.Envio#getLstTransporte <em>Lst Transporte</em>}</li>
 *   <li>{@link den.domain.envio.Envio#getLstDetallePedido <em>Lst Detalle Pedido</em>}</li>
 *   <li>{@link den.domain.envio.Envio#getId <em>Id</em>}</li>
 *   <li>{@link den.domain.envio.Envio#getNitEmpresa <em>Nit Empresa</em>}</li>
 *   <li>{@link den.domain.envio.Envio#getDireccionEmpresa <em>Direccion Empresa</em>}</li>
 *   <li>{@link den.domain.envio.Envio#getIdFactura <em>Id Factura</em>}</li>
 *   <li>{@link den.domain.envio.Envio#getFechaEnvio <em>Fecha Envio</em>}</li>
 *   <li>{@link den.domain.envio.Envio#getFechaVencimiento <em>Fecha Vencimiento</em>}</li>
 *   <li>{@link den.domain.envio.Envio#getTheCiudadDestino <em>The Ciudad Destino</em>}</li>
 *   <li>{@link den.domain.envio.Envio#getLstPedido <em>Lst Pedido</em>}</li>
 *   <li>{@link den.domain.envio.Envio#getOwenedByFactoryEnvio <em>Owened By Factory Envio</em>}</li>
 *   <li>{@link den.domain.envio.Envio#getLstRuta <em>Lst Ruta</em>}</li>
 * </ul>
 *
 * @see den.domain.envio.EnvioPackage#getEnvio()
 * @model
 * @generated
 */
public interface Envio extends EObject {
	/**
	 * Returns the value of the '<em><b>The Ciudad Origen</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.ubicacion.Ciudad#getTheEnvioOrigen <em>The Envio Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Ciudad Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Ciudad Origen</em>' reference.
	 * @see #setTheCiudadOrigen(Ciudad)
	 * @see den.domain.envio.EnvioPackage#getEnvio_TheCiudadOrigen()
	 * @see den.domain.ubicacion.Ciudad#getTheEnvioOrigen
	 * @model opposite="theEnvioOrigen"
	 * @generated
	 */
	Ciudad getTheCiudadOrigen();

	/**
	 * Sets the value of the '{@link den.domain.envio.Envio#getTheCiudadOrigen <em>The Ciudad Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Ciudad Origen</em>' reference.
	 * @see #getTheCiudadOrigen()
	 * @generated
	 */
	void setTheCiudadOrigen(Ciudad value);

	/**
	 * Returns the value of the '<em><b>Lst Transporte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.transporte.Transporte#getLstEnvio <em>Lst Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Transporte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Transporte</em>' reference.
	 * @see #setLstTransporte(Transporte)
	 * @see den.domain.envio.EnvioPackage#getEnvio_LstTransporte()
	 * @see den.domain.transporte.Transporte#getLstEnvio
	 * @model opposite="lstEnvio"
	 * @generated
	 */
	Transporte getLstTransporte();

	/**
	 * Sets the value of the '{@link den.domain.envio.Envio#getLstTransporte <em>Lst Transporte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Transporte</em>' reference.
	 * @see #getLstTransporte()
	 * @generated
	 */
	void setLstTransporte(Transporte value);

	/**
	 * Returns the value of the '<em><b>Lst Detalle Pedido</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link den.domain.envio.DetallePedido#getOwenedByEnvio <em>Owened By Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Detalle Pedido</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Detalle Pedido</em>' containment reference.
	 * @see #setLstDetallePedido(DetallePedido)
	 * @see den.domain.envio.EnvioPackage#getEnvio_LstDetallePedido()
	 * @see den.domain.envio.DetallePedido#getOwenedByEnvio
	 * @model opposite="owenedByEnvio" containment="true"
	 * @generated
	 */
	DetallePedido getLstDetallePedido();

	/**
	 * Sets the value of the '{@link den.domain.envio.Envio#getLstDetallePedido <em>Lst Detalle Pedido</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Detalle Pedido</em>' containment reference.
	 * @see #getLstDetallePedido()
	 * @generated
	 */
	void setLstDetallePedido(DetallePedido value);

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
	 * @see den.domain.envio.EnvioPackage#getEnvio_Id()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link den.domain.envio.Envio#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Nit Empresa</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nit Empresa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nit Empresa</em>' attribute.
	 * @see #setNitEmpresa(String)
	 * @see den.domain.envio.EnvioPackage#getEnvio_NitEmpresa()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getNitEmpresa();

	/**
	 * Sets the value of the '{@link den.domain.envio.Envio#getNitEmpresa <em>Nit Empresa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nit Empresa</em>' attribute.
	 * @see #getNitEmpresa()
	 * @generated
	 */
	void setNitEmpresa(String value);

	/**
	 * Returns the value of the '<em><b>Direccion Empresa</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direccion Empresa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion Empresa</em>' attribute.
	 * @see #setDireccionEmpresa(String)
	 * @see den.domain.envio.EnvioPackage#getEnvio_DireccionEmpresa()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getDireccionEmpresa();

	/**
	 * Sets the value of the '{@link den.domain.envio.Envio#getDireccionEmpresa <em>Direccion Empresa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion Empresa</em>' attribute.
	 * @see #getDireccionEmpresa()
	 * @generated
	 */
	void setDireccionEmpresa(String value);

	/**
	 * Returns the value of the '<em><b>Id Factura</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Factura</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Factura</em>' attribute.
	 * @see #setIdFactura(String)
	 * @see den.domain.envio.EnvioPackage#getEnvio_IdFactura()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdFactura();

	/**
	 * Sets the value of the '{@link den.domain.envio.Envio#getIdFactura <em>Id Factura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Factura</em>' attribute.
	 * @see #getIdFactura()
	 * @generated
	 */
	void setIdFactura(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Envio</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Envio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Envio</em>' attribute.
	 * @see #setFechaEnvio(String)
	 * @see den.domain.envio.EnvioPackage#getEnvio_FechaEnvio()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getFechaEnvio();

	/**
	 * Sets the value of the '{@link den.domain.envio.Envio#getFechaEnvio <em>Fecha Envio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Envio</em>' attribute.
	 * @see #getFechaEnvio()
	 * @generated
	 */
	void setFechaEnvio(String value);

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
	 * @see den.domain.envio.EnvioPackage#getEnvio_FechaVencimiento()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getFechaVencimiento();

	/**
	 * Sets the value of the '{@link den.domain.envio.Envio#getFechaVencimiento <em>Fecha Vencimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Vencimiento</em>' attribute.
	 * @see #getFechaVencimiento()
	 * @generated
	 */
	void setFechaVencimiento(String value);

	/**
	 * Returns the value of the '<em><b>The Ciudad Destino</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.ubicacion.Ciudad#getTheEnvioDestino <em>The Envio Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Ciudad Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Ciudad Destino</em>' reference.
	 * @see #setTheCiudadDestino(Ciudad)
	 * @see den.domain.envio.EnvioPackage#getEnvio_TheCiudadDestino()
	 * @see den.domain.ubicacion.Ciudad#getTheEnvioDestino
	 * @model opposite="theEnvioDestino"
	 * @generated
	 */
	Ciudad getTheCiudadDestino();

	/**
	 * Sets the value of the '{@link den.domain.envio.Envio#getTheCiudadDestino <em>The Ciudad Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Ciudad Destino</em>' reference.
	 * @see #getTheCiudadDestino()
	 * @generated
	 */
	void setTheCiudadDestino(Ciudad value);

	/**
	 * Returns the value of the '<em><b>Lst Pedido</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.pedido.Pedido#getTheEnvio <em>The Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Pedido</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Pedido</em>' reference.
	 * @see #setLstPedido(Pedido)
	 * @see den.domain.envio.EnvioPackage#getEnvio_LstPedido()
	 * @see den.domain.pedido.Pedido#getTheEnvio
	 * @model opposite="theEnvio"
	 * @generated
	 */
	Pedido getLstPedido();

	/**
	 * Sets the value of the '{@link den.domain.envio.Envio#getLstPedido <em>Lst Pedido</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Pedido</em>' reference.
	 * @see #getLstPedido()
	 * @generated
	 */
	void setLstPedido(Pedido value);

	/**
	 * Returns the value of the '<em><b>Owened By Factory Envio</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.envio.FactoryEnvio#getLstEnvio <em>Lst Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Factory Envio</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Factory Envio</em>' container reference.
	 * @see #setOwenedByFactoryEnvio(FactoryEnvio)
	 * @see den.domain.envio.EnvioPackage#getEnvio_OwenedByFactoryEnvio()
	 * @see den.domain.envio.FactoryEnvio#getLstEnvio
	 * @model opposite="lstEnvio" transient="false"
	 * @generated
	 */
	FactoryEnvio getOwenedByFactoryEnvio();

	/**
	 * Sets the value of the '{@link den.domain.envio.Envio#getOwenedByFactoryEnvio <em>Owened By Factory Envio</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Factory Envio</em>' container reference.
	 * @see #getOwenedByFactoryEnvio()
	 * @generated
	 */
	void setOwenedByFactoryEnvio(FactoryEnvio value);

	/**
	 * Returns the value of the '<em><b>Lst Ruta</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.ruta.Ruta#getLstEnvio <em>Lst Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Ruta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Ruta</em>' reference.
	 * @see #setLstRuta(Ruta)
	 * @see den.domain.envio.EnvioPackage#getEnvio_LstRuta()
	 * @see den.domain.ruta.Ruta#getLstEnvio
	 * @model opposite="lstEnvio"
	 * @generated
	 */
	Ruta getLstRuta();

	/**
	 * Sets the value of the '{@link den.domain.envio.Envio#getLstRuta <em>Lst Ruta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Ruta</em>' reference.
	 * @see #getLstRuta()
	 * @generated
	 */
	void setLstRuta(Ruta value);

} // Envio
