/**
 */
package den.domain.persona;

import den.domain.pedido.Pedido;

import den.domain.transporte.Transporte;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.persona.Persona#getLstCliente <em>Lst Cliente</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getLstConductor <em>Lst Conductor</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getLstEmpleado <em>Lst Empleado</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getIdPersona <em>Id Persona</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getNumeroDocumento <em>Numero Documento</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getTipoDocumento <em>Tipo Documento</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getEdad <em>Edad</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getFechaNacimiento <em>Fecha Nacimiento</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getGenero <em>Genero</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getDireccionResidencia <em>Direccion Residencia</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getEmail <em>Email</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getLugarResidencia <em>Lugar Residencia</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getLstPedido <em>Lst Pedido</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getLstTransporte <em>Lst Transporte</em>}</li>
 *   <li>{@link den.domain.persona.Persona#getOwenedByFactoryPersona <em>Owened By Factory Persona</em>}</li>
 * </ul>
 *
 * @see den.domain.persona.PersonaPackage#getPersona()
 * @model
 * @generated
 */
public interface Persona extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Cliente</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link den.domain.persona.Cliente#getOwenedByPersona <em>Owened By Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Cliente</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Cliente</em>' containment reference.
	 * @see #setLstCliente(Cliente)
	 * @see den.domain.persona.PersonaPackage#getPersona_LstCliente()
	 * @see den.domain.persona.Cliente#getOwenedByPersona
	 * @model opposite="owenedByPersona" containment="true"
	 * @generated
	 */
	Cliente getLstCliente();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getLstCliente <em>Lst Cliente</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Cliente</em>' containment reference.
	 * @see #getLstCliente()
	 * @generated
	 */
	void setLstCliente(Cliente value);

	/**
	 * Returns the value of the '<em><b>Lst Conductor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link den.domain.persona.Conductor#getOwenedByPersona <em>Owened By Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Conductor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Conductor</em>' containment reference.
	 * @see #setLstConductor(Conductor)
	 * @see den.domain.persona.PersonaPackage#getPersona_LstConductor()
	 * @see den.domain.persona.Conductor#getOwenedByPersona
	 * @model opposite="owenedByPersona" containment="true"
	 * @generated
	 */
	Conductor getLstConductor();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getLstConductor <em>Lst Conductor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Conductor</em>' containment reference.
	 * @see #getLstConductor()
	 * @generated
	 */
	void setLstConductor(Conductor value);

	/**
	 * Returns the value of the '<em><b>Lst Empleado</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link den.domain.persona.Empleado#getOwenedByPersona <em>Owened By Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Empleado</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Empleado</em>' containment reference.
	 * @see #setLstEmpleado(Empleado)
	 * @see den.domain.persona.PersonaPackage#getPersona_LstEmpleado()
	 * @see den.domain.persona.Empleado#getOwenedByPersona
	 * @model opposite="owenedByPersona" containment="true"
	 * @generated
	 */
	Empleado getLstEmpleado();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getLstEmpleado <em>Lst Empleado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Empleado</em>' containment reference.
	 * @see #getLstEmpleado()
	 * @generated
	 */
	void setLstEmpleado(Empleado value);

	/**
	 * Returns the value of the '<em><b>Id Persona</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Persona</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Persona</em>' attribute.
	 * @see #setIdPersona(String)
	 * @see den.domain.persona.PersonaPackage#getPersona_IdPersona()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdPersona();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getIdPersona <em>Id Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Persona</em>' attribute.
	 * @see #getIdPersona()
	 * @generated
	 */
	void setIdPersona(String value);

	/**
	 * Returns the value of the '<em><b>Numero Documento</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Documento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Documento</em>' attribute.
	 * @see #setNumeroDocumento(String)
	 * @see den.domain.persona.PersonaPackage#getPersona_NumeroDocumento()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getNumeroDocumento();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getNumeroDocumento <em>Numero Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Documento</em>' attribute.
	 * @see #getNumeroDocumento()
	 * @generated
	 */
	void setNumeroDocumento(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Documento</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Documento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Documento</em>' attribute.
	 * @see #setTipoDocumento(String)
	 * @see den.domain.persona.PersonaPackage#getPersona_TipoDocumento()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getTipoDocumento();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getTipoDocumento <em>Tipo Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Documento</em>' attribute.
	 * @see #getTipoDocumento()
	 * @generated
	 */
	void setTipoDocumento(String value);

	/**
	 * Returns the value of the '<em><b>Edad</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edad</em>' attribute.
	 * @see #setEdad(String)
	 * @see den.domain.persona.PersonaPackage#getPersona_Edad()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getEdad();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getEdad <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edad</em>' attribute.
	 * @see #getEdad()
	 * @generated
	 */
	void setEdad(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Nacimiento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Nacimiento</em>' attribute.
	 * @see #setFechaNacimiento(String)
	 * @see den.domain.persona.PersonaPackage#getPersona_FechaNacimiento()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getFechaNacimiento();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getFechaNacimiento <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Nacimiento</em>' attribute.
	 * @see #getFechaNacimiento()
	 * @generated
	 */
	void setFechaNacimiento(String value);

	/**
	 * Returns the value of the '<em><b>Genero</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genero</em>' attribute.
	 * @see #setGenero(String)
	 * @see den.domain.persona.PersonaPackage#getPersona_Genero()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getGenero();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getGenero <em>Genero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genero</em>' attribute.
	 * @see #getGenero()
	 * @generated
	 */
	void setGenero(String value);

	/**
	 * Returns the value of the '<em><b>Direccion Residencia</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direccion Residencia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion Residencia</em>' attribute.
	 * @see #setDireccionResidencia(String)
	 * @see den.domain.persona.PersonaPackage#getPersona_DireccionResidencia()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getDireccionResidencia();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getDireccionResidencia <em>Direccion Residencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion Residencia</em>' attribute.
	 * @see #getDireccionResidencia()
	 * @generated
	 */
	void setDireccionResidencia(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see den.domain.persona.PersonaPackage#getPersona_Email()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Telefono</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telefono</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefono</em>' attribute.
	 * @see #setTelefono(String)
	 * @see den.domain.persona.PersonaPackage#getPersona_Telefono()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getTelefono();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getTelefono <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefono</em>' attribute.
	 * @see #getTelefono()
	 * @generated
	 */
	void setTelefono(String value);

	/**
	 * Returns the value of the '<em><b>Lugar Residencia</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lugar Residencia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lugar Residencia</em>' attribute.
	 * @see #setLugarResidencia(String)
	 * @see den.domain.persona.PersonaPackage#getPersona_LugarResidencia()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getLugarResidencia();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getLugarResidencia <em>Lugar Residencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lugar Residencia</em>' attribute.
	 * @see #getLugarResidencia()
	 * @generated
	 */
	void setLugarResidencia(String value);

	/**
	 * Returns the value of the '<em><b>Lst Pedido</b></em>' reference list.
	 * The list contents are of type {@link den.domain.pedido.Pedido}.
	 * It is bidirectional and its opposite is '{@link den.domain.pedido.Pedido#getLstPersona <em>Lst Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Pedido</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Pedido</em>' reference list.
	 * @see den.domain.persona.PersonaPackage#getPersona_LstPedido()
	 * @see den.domain.pedido.Pedido#getLstPersona
	 * @model opposite="lstPersona" required="true"
	 * @generated
	 */
	EList<Pedido> getLstPedido();

	/**
	 * Returns the value of the '<em><b>Lst Transporte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.transporte.Transporte#getLstPersona <em>Lst Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Transporte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Transporte</em>' reference.
	 * @see #setLstTransporte(Transporte)
	 * @see den.domain.persona.PersonaPackage#getPersona_LstTransporte()
	 * @see den.domain.transporte.Transporte#getLstPersona
	 * @model opposite="lstPersona"
	 * @generated
	 */
	Transporte getLstTransporte();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getLstTransporte <em>Lst Transporte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Transporte</em>' reference.
	 * @see #getLstTransporte()
	 * @generated
	 */
	void setLstTransporte(Transporte value);

	/**
	 * Returns the value of the '<em><b>Owened By Factory Persona</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.persona.FactoryPersona#getLstPersona <em>Lst Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Factory Persona</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Factory Persona</em>' container reference.
	 * @see #setOwenedByFactoryPersona(FactoryPersona)
	 * @see den.domain.persona.PersonaPackage#getPersona_OwenedByFactoryPersona()
	 * @see den.domain.persona.FactoryPersona#getLstPersona
	 * @model opposite="lstPersona" transient="false"
	 * @generated
	 */
	FactoryPersona getOwenedByFactoryPersona();

	/**
	 * Sets the value of the '{@link den.domain.persona.Persona#getOwenedByFactoryPersona <em>Owened By Factory Persona</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Factory Persona</em>' container reference.
	 * @see #getOwenedByFactoryPersona()
	 * @generated
	 */
	void setOwenedByFactoryPersona(FactoryPersona value);

} // Persona
