/**
 */
package den.domain;

import den.ModelFactory;

import den.domain.envio.FactoryEnvio;

import den.domain.pedido.FactoryPedido;

import den.domain.persona.FactoryPersona;

import den.domain.producto.FactoryProducto;

import den.domain.ruta.FactoryRuta;

import den.domain.transporte.FactoryTransporte;

import den.domain.ubicacion.FactoryUbicacion;

import den.ui.UI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.Domain#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link den.domain.Domain#getLstFactoryUbicacion <em>Lst Factory Ubicacion</em>}</li>
 *   <li>{@link den.domain.Domain#getLstFactoryPedido <em>Lst Factory Pedido</em>}</li>
 *   <li>{@link den.domain.Domain#getLstFactoryTransporte <em>Lst Factory Transporte</em>}</li>
 *   <li>{@link den.domain.Domain#getLstFactoryPersona <em>Lst Factory Persona</em>}</li>
 *   <li>{@link den.domain.Domain#getLstFactoryProducto <em>Lst Factory Producto</em>}</li>
 *   <li>{@link den.domain.Domain#getLstFactoryEnvio <em>Lst Factory Envio</em>}</li>
 *   <li>{@link den.domain.Domain#getLstFactoryRuta <em>Lst Factory Ruta</em>}</li>
 *   <li>{@link den.domain.Domain#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @see den.domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.ModelFactory#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see den.domain.DomainPackage#getDomain_TheModelFactory()
	 * @see den.ModelFactory#getTheDomain
	 * @model opposite="theDomain" transient="false"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link den.domain.Domain#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>Lst Factory Ubicacion</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link den.domain.ubicacion.FactoryUbicacion#getOwenedByDomain <em>Owened By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Factory Ubicacion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Factory Ubicacion</em>' containment reference.
	 * @see #setLstFactoryUbicacion(FactoryUbicacion)
	 * @see den.domain.DomainPackage#getDomain_LstFactoryUbicacion()
	 * @see den.domain.ubicacion.FactoryUbicacion#getOwenedByDomain
	 * @model opposite="owenedByDomain" containment="true"
	 * @generated
	 */
	FactoryUbicacion getLstFactoryUbicacion();

	/**
	 * Sets the value of the '{@link den.domain.Domain#getLstFactoryUbicacion <em>Lst Factory Ubicacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Factory Ubicacion</em>' containment reference.
	 * @see #getLstFactoryUbicacion()
	 * @generated
	 */
	void setLstFactoryUbicacion(FactoryUbicacion value);

	/**
	 * Returns the value of the '<em><b>Lst Factory Pedido</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link den.domain.pedido.FactoryPedido#getOwenedByDomain <em>Owened By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Factory Pedido</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Factory Pedido</em>' containment reference.
	 * @see #setLstFactoryPedido(FactoryPedido)
	 * @see den.domain.DomainPackage#getDomain_LstFactoryPedido()
	 * @see den.domain.pedido.FactoryPedido#getOwenedByDomain
	 * @model opposite="owenedByDomain" containment="true"
	 * @generated
	 */
	FactoryPedido getLstFactoryPedido();

	/**
	 * Sets the value of the '{@link den.domain.Domain#getLstFactoryPedido <em>Lst Factory Pedido</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Factory Pedido</em>' containment reference.
	 * @see #getLstFactoryPedido()
	 * @generated
	 */
	void setLstFactoryPedido(FactoryPedido value);

	/**
	 * Returns the value of the '<em><b>Lst Factory Transporte</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link den.domain.transporte.FactoryTransporte#getOwenedByDomain <em>Owened By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Factory Transporte</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Factory Transporte</em>' containment reference.
	 * @see #setLstFactoryTransporte(FactoryTransporte)
	 * @see den.domain.DomainPackage#getDomain_LstFactoryTransporte()
	 * @see den.domain.transporte.FactoryTransporte#getOwenedByDomain
	 * @model opposite="owenedByDomain" containment="true"
	 * @generated
	 */
	FactoryTransporte getLstFactoryTransporte();

	/**
	 * Sets the value of the '{@link den.domain.Domain#getLstFactoryTransporte <em>Lst Factory Transporte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Factory Transporte</em>' containment reference.
	 * @see #getLstFactoryTransporte()
	 * @generated
	 */
	void setLstFactoryTransporte(FactoryTransporte value);

	/**
	 * Returns the value of the '<em><b>Lst Factory Persona</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link den.domain.persona.FactoryPersona#getOwenedByDomain <em>Owened By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Factory Persona</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Factory Persona</em>' containment reference.
	 * @see #setLstFactoryPersona(FactoryPersona)
	 * @see den.domain.DomainPackage#getDomain_LstFactoryPersona()
	 * @see den.domain.persona.FactoryPersona#getOwenedByDomain
	 * @model opposite="owenedByDomain" containment="true"
	 * @generated
	 */
	FactoryPersona getLstFactoryPersona();

	/**
	 * Sets the value of the '{@link den.domain.Domain#getLstFactoryPersona <em>Lst Factory Persona</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Factory Persona</em>' containment reference.
	 * @see #getLstFactoryPersona()
	 * @generated
	 */
	void setLstFactoryPersona(FactoryPersona value);

	/**
	 * Returns the value of the '<em><b>Lst Factory Producto</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link den.domain.producto.FactoryProducto#getOwenedByDomain <em>Owened By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Factory Producto</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Factory Producto</em>' containment reference.
	 * @see #setLstFactoryProducto(FactoryProducto)
	 * @see den.domain.DomainPackage#getDomain_LstFactoryProducto()
	 * @see den.domain.producto.FactoryProducto#getOwenedByDomain
	 * @model opposite="owenedByDomain" containment="true"
	 * @generated
	 */
	FactoryProducto getLstFactoryProducto();

	/**
	 * Sets the value of the '{@link den.domain.Domain#getLstFactoryProducto <em>Lst Factory Producto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Factory Producto</em>' containment reference.
	 * @see #getLstFactoryProducto()
	 * @generated
	 */
	void setLstFactoryProducto(FactoryProducto value);

	/**
	 * Returns the value of the '<em><b>Lst Factory Envio</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link den.domain.envio.FactoryEnvio#getOwenedByDomain <em>Owened By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Factory Envio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Factory Envio</em>' containment reference.
	 * @see #setLstFactoryEnvio(FactoryEnvio)
	 * @see den.domain.DomainPackage#getDomain_LstFactoryEnvio()
	 * @see den.domain.envio.FactoryEnvio#getOwenedByDomain
	 * @model opposite="owenedByDomain" containment="true"
	 * @generated
	 */
	FactoryEnvio getLstFactoryEnvio();

	/**
	 * Sets the value of the '{@link den.domain.Domain#getLstFactoryEnvio <em>Lst Factory Envio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Factory Envio</em>' containment reference.
	 * @see #getLstFactoryEnvio()
	 * @generated
	 */
	void setLstFactoryEnvio(FactoryEnvio value);

	/**
	 * Returns the value of the '<em><b>Lst Factory Ruta</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link den.domain.ruta.FactoryRuta#getOwenedByDomain <em>Owened By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Factory Ruta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Factory Ruta</em>' containment reference.
	 * @see #setLstFactoryRuta(FactoryRuta)
	 * @see den.domain.DomainPackage#getDomain_LstFactoryRuta()
	 * @see den.domain.ruta.FactoryRuta#getOwenedByDomain
	 * @model opposite="owenedByDomain" containment="true"
	 * @generated
	 */
	FactoryRuta getLstFactoryRuta();

	/**
	 * Sets the value of the '{@link den.domain.Domain#getLstFactoryRuta <em>Lst Factory Ruta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Factory Ruta</em>' containment reference.
	 * @see #getLstFactoryRuta()
	 * @generated
	 */
	void setLstFactoryRuta(FactoryRuta value);

	/**
	 * Returns the value of the '<em><b>The UI</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.ui.UI#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI</em>' reference.
	 * @see #setTheUI(UI)
	 * @see den.domain.DomainPackage#getDomain_TheUI()
	 * @see den.ui.UI#getTheDomain
	 * @model opposite="theDomain"
	 * @generated
	 */
	UI getTheUI();

	/**
	 * Sets the value of the '{@link den.domain.Domain#getTheUI <em>The UI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI</em>' reference.
	 * @see #getTheUI()
	 * @generated
	 */
	void setTheUI(UI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//TODO implementarModelo\n'"
	 * @generated
	 */
	void implementarModelo();

} // Domain
