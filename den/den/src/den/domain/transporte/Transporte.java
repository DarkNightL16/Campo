/**
 */
package den.domain.transporte;

import den.domain.envio.Envio;

import den.domain.persona.Conductor;
import den.domain.persona.Persona;

import den.domain.producto.Producto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transporte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.transporte.Transporte#getId <em>Id</em>}</li>
 *   <li>{@link den.domain.transporte.Transporte#getMarca <em>Marca</em>}</li>
 *   <li>{@link den.domain.transporte.Transporte#getNumeroPoliza <em>Numero Poliza</em>}</li>
 *   <li>{@link den.domain.transporte.Transporte#getMatricula <em>Matricula</em>}</li>
 *   <li>{@link den.domain.transporte.Transporte#getTarjetaPropiedad <em>Tarjeta Propiedad</em>}</li>
 *   <li>{@link den.domain.transporte.Transporte#getOwenedByFactoryTransporte <em>Owened By Factory Transporte</em>}</li>
 *   <li>{@link den.domain.transporte.Transporte#getLstProducto <em>Lst Producto</em>}</li>
 *   <li>{@link den.domain.transporte.Transporte#getLstEnvio <em>Lst Envio</em>}</li>
 *   <li>{@link den.domain.transporte.Transporte#getLstConductor <em>Lst Conductor</em>}</li>
 *   <li>{@link den.domain.transporte.Transporte#getLstPersona <em>Lst Persona</em>}</li>
 * </ul>
 *
 * @see den.domain.transporte.TransportePackage#getTransporte()
 * @model
 * @generated
 */
public interface Transporte extends EObject {
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
	 * @see den.domain.transporte.TransportePackage#getTransporte_Id()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link den.domain.transporte.Transporte#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see den.domain.transporte.TransportePackage#getTransporte_Marca()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getMarca();

	/**
	 * Sets the value of the '{@link den.domain.transporte.Transporte#getMarca <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marca</em>' attribute.
	 * @see #getMarca()
	 * @generated
	 */
	void setMarca(String value);

	/**
	 * Returns the value of the '<em><b>Numero Poliza</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Poliza</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Poliza</em>' attribute.
	 * @see #setNumeroPoliza(String)
	 * @see den.domain.transporte.TransportePackage#getTransporte_NumeroPoliza()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getNumeroPoliza();

	/**
	 * Sets the value of the '{@link den.domain.transporte.Transporte#getNumeroPoliza <em>Numero Poliza</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Poliza</em>' attribute.
	 * @see #getNumeroPoliza()
	 * @generated
	 */
	void setNumeroPoliza(String value);

	/**
	 * Returns the value of the '<em><b>Matricula</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matricula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matricula</em>' attribute.
	 * @see #setMatricula(String)
	 * @see den.domain.transporte.TransportePackage#getTransporte_Matricula()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getMatricula();

	/**
	 * Sets the value of the '{@link den.domain.transporte.Transporte#getMatricula <em>Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricula</em>' attribute.
	 * @see #getMatricula()
	 * @generated
	 */
	void setMatricula(String value);

	/**
	 * Returns the value of the '<em><b>Tarjeta Propiedad</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tarjeta Propiedad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarjeta Propiedad</em>' attribute.
	 * @see #setTarjetaPropiedad(String)
	 * @see den.domain.transporte.TransportePackage#getTransporte_TarjetaPropiedad()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getTarjetaPropiedad();

	/**
	 * Sets the value of the '{@link den.domain.transporte.Transporte#getTarjetaPropiedad <em>Tarjeta Propiedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tarjeta Propiedad</em>' attribute.
	 * @see #getTarjetaPropiedad()
	 * @generated
	 */
	void setTarjetaPropiedad(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Factory Transporte</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.transporte.FactoryTransporte#getLstTransporte <em>Lst Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Factory Transporte</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Factory Transporte</em>' container reference.
	 * @see #setOwenedByFactoryTransporte(FactoryTransporte)
	 * @see den.domain.transporte.TransportePackage#getTransporte_OwenedByFactoryTransporte()
	 * @see den.domain.transporte.FactoryTransporte#getLstTransporte
	 * @model opposite="lstTransporte" transient="false"
	 * @generated
	 */
	FactoryTransporte getOwenedByFactoryTransporte();

	/**
	 * Sets the value of the '{@link den.domain.transporte.Transporte#getOwenedByFactoryTransporte <em>Owened By Factory Transporte</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Factory Transporte</em>' container reference.
	 * @see #getOwenedByFactoryTransporte()
	 * @generated
	 */
	void setOwenedByFactoryTransporte(FactoryTransporte value);

	/**
	 * Returns the value of the '<em><b>Lst Producto</b></em>' reference list.
	 * The list contents are of type {@link den.domain.producto.Producto}.
	 * It is bidirectional and its opposite is '{@link den.domain.producto.Producto#getLstTransporte <em>Lst Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Producto</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Producto</em>' reference list.
	 * @see den.domain.transporte.TransportePackage#getTransporte_LstProducto()
	 * @see den.domain.producto.Producto#getLstTransporte
	 * @model opposite="lstTransporte"
	 * @generated
	 */
	EList<Producto> getLstProducto();

	/**
	 * Returns the value of the '<em><b>Lst Envio</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.envio.Envio#getLstTransporte <em>Lst Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Envio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Envio</em>' reference.
	 * @see #setLstEnvio(Envio)
	 * @see den.domain.transporte.TransportePackage#getTransporte_LstEnvio()
	 * @see den.domain.envio.Envio#getLstTransporte
	 * @model opposite="lstTransporte"
	 * @generated
	 */
	Envio getLstEnvio();

	/**
	 * Sets the value of the '{@link den.domain.transporte.Transporte#getLstEnvio <em>Lst Envio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Envio</em>' reference.
	 * @see #getLstEnvio()
	 * @generated
	 */
	void setLstEnvio(Envio value);

	/**
	 * Returns the value of the '<em><b>Lst Conductor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.persona.Conductor#getLstTransporte <em>Lst Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Conductor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Conductor</em>' reference.
	 * @see #setLstConductor(Conductor)
	 * @see den.domain.transporte.TransportePackage#getTransporte_LstConductor()
	 * @see den.domain.persona.Conductor#getLstTransporte
	 * @model opposite="lstTransporte"
	 * @generated
	 */
	Conductor getLstConductor();

	/**
	 * Sets the value of the '{@link den.domain.transporte.Transporte#getLstConductor <em>Lst Conductor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Conductor</em>' reference.
	 * @see #getLstConductor()
	 * @generated
	 */
	void setLstConductor(Conductor value);

	/**
	 * Returns the value of the '<em><b>Lst Persona</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.persona.Persona#getLstTransporte <em>Lst Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Persona</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Persona</em>' reference.
	 * @see #setLstPersona(Persona)
	 * @see den.domain.transporte.TransportePackage#getTransporte_LstPersona()
	 * @see den.domain.persona.Persona#getLstTransporte
	 * @model opposite="lstTransporte"
	 * @generated
	 */
	Persona getLstPersona();

	/**
	 * Sets the value of the '{@link den.domain.transporte.Transporte#getLstPersona <em>Lst Persona</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Persona</em>' reference.
	 * @see #getLstPersona()
	 * @generated
	 */
	void setLstPersona(Persona value);

} // Transporte
