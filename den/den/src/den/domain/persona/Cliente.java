/**
 */
package den.domain.persona;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.persona.Cliente#getIdCliente <em>Id Cliente</em>}</li>
 *   <li>{@link den.domain.persona.Cliente#getEstado <em>Estado</em>}</li>
 *   <li>{@link den.domain.persona.Cliente#getOwenedByPersona <em>Owened By Persona</em>}</li>
 * </ul>
 *
 * @see den.domain.persona.PersonaPackage#getCliente()
 * @model
 * @generated
 */
public interface Cliente extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Cliente</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Cliente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Cliente</em>' attribute.
	 * @see #setIdCliente(String)
	 * @see den.domain.persona.PersonaPackage#getCliente_IdCliente()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdCliente();

	/**
	 * Sets the value of the '{@link den.domain.persona.Cliente#getIdCliente <em>Id Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Cliente</em>' attribute.
	 * @see #getIdCliente()
	 * @generated
	 */
	void setIdCliente(String value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(String)
	 * @see den.domain.persona.PersonaPackage#getCliente_Estado()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link den.domain.persona.Cliente#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Persona</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.persona.Persona#getLstCliente <em>Lst Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Persona</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Persona</em>' container reference.
	 * @see #setOwenedByPersona(Persona)
	 * @see den.domain.persona.PersonaPackage#getCliente_OwenedByPersona()
	 * @see den.domain.persona.Persona#getLstCliente
	 * @model opposite="lstCliente" transient="false"
	 * @generated
	 */
	Persona getOwenedByPersona();

	/**
	 * Sets the value of the '{@link den.domain.persona.Cliente#getOwenedByPersona <em>Owened By Persona</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Persona</em>' container reference.
	 * @see #getOwenedByPersona()
	 * @generated
	 */
	void setOwenedByPersona(Persona value);

} // Cliente
