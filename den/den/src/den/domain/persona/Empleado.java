/**
 */
package den.domain.persona;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empleado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.persona.Empleado#getIdEmpleado <em>Id Empleado</em>}</li>
 *   <li>{@link den.domain.persona.Empleado#getFechaInicioContrato <em>Fecha Inicio Contrato</em>}</li>
 *   <li>{@link den.domain.persona.Empleado#getFechaTerminacionContrato <em>Fecha Terminacion Contrato</em>}</li>
 *   <li>{@link den.domain.persona.Empleado#getCargo <em>Cargo</em>}</li>
 *   <li>{@link den.domain.persona.Empleado#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link den.domain.persona.Empleado#getSalario <em>Salario</em>}</li>
 *   <li>{@link den.domain.persona.Empleado#getOwenedByPersona <em>Owened By Persona</em>}</li>
 * </ul>
 *
 * @see den.domain.persona.PersonaPackage#getEmpleado()
 * @model
 * @generated
 */
public interface Empleado extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Empleado</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Empleado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Empleado</em>' attribute.
	 * @see #setIdEmpleado(String)
	 * @see den.domain.persona.PersonaPackage#getEmpleado_IdEmpleado()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdEmpleado();

	/**
	 * Sets the value of the '{@link den.domain.persona.Empleado#getIdEmpleado <em>Id Empleado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Empleado</em>' attribute.
	 * @see #getIdEmpleado()
	 * @generated
	 */
	void setIdEmpleado(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Inicio Contrato</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Inicio Contrato</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Inicio Contrato</em>' attribute.
	 * @see #setFechaInicioContrato(String)
	 * @see den.domain.persona.PersonaPackage#getEmpleado_FechaInicioContrato()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getFechaInicioContrato();

	/**
	 * Sets the value of the '{@link den.domain.persona.Empleado#getFechaInicioContrato <em>Fecha Inicio Contrato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Inicio Contrato</em>' attribute.
	 * @see #getFechaInicioContrato()
	 * @generated
	 */
	void setFechaInicioContrato(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Terminacion Contrato</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Terminacion Contrato</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Terminacion Contrato</em>' attribute.
	 * @see #setFechaTerminacionContrato(String)
	 * @see den.domain.persona.PersonaPackage#getEmpleado_FechaTerminacionContrato()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getFechaTerminacionContrato();

	/**
	 * Sets the value of the '{@link den.domain.persona.Empleado#getFechaTerminacionContrato <em>Fecha Terminacion Contrato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Terminacion Contrato</em>' attribute.
	 * @see #getFechaTerminacionContrato()
	 * @generated
	 */
	void setFechaTerminacionContrato(String value);

	/**
	 * Returns the value of the '<em><b>Cargo</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cargo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cargo</em>' attribute.
	 * @see #setCargo(String)
	 * @see den.domain.persona.PersonaPackage#getEmpleado_Cargo()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getCargo();

	/**
	 * Sets the value of the '{@link den.domain.persona.Empleado#getCargo <em>Cargo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cargo</em>' attribute.
	 * @see #getCargo()
	 * @generated
	 */
	void setCargo(String value);

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
	 * @see den.domain.persona.PersonaPackage#getEmpleado_Descripcion()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link den.domain.persona.Empleado#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Salario</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salario</em>' attribute.
	 * @see #setSalario(String)
	 * @see den.domain.persona.PersonaPackage#getEmpleado_Salario()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getSalario();

	/**
	 * Sets the value of the '{@link den.domain.persona.Empleado#getSalario <em>Salario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salario</em>' attribute.
	 * @see #getSalario()
	 * @generated
	 */
	void setSalario(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Persona</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.persona.Persona#getLstEmpleado <em>Lst Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Persona</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Persona</em>' container reference.
	 * @see #setOwenedByPersona(Persona)
	 * @see den.domain.persona.PersonaPackage#getEmpleado_OwenedByPersona()
	 * @see den.domain.persona.Persona#getLstEmpleado
	 * @model opposite="lstEmpleado" transient="false"
	 * @generated
	 */
	Persona getOwenedByPersona();

	/**
	 * Sets the value of the '{@link den.domain.persona.Empleado#getOwenedByPersona <em>Owened By Persona</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Persona</em>' container reference.
	 * @see #getOwenedByPersona()
	 * @generated
	 */
	void setOwenedByPersona(Persona value);

} // Empleado
