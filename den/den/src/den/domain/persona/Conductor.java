/**
 */
package den.domain.persona;

import den.domain.transporte.Transporte;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conductor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.persona.Conductor#getLstTransporte <em>Lst Transporte</em>}</li>
 *   <li>{@link den.domain.persona.Conductor#getIdConductor <em>Id Conductor</em>}</li>
 *   <li>{@link den.domain.persona.Conductor#getCategoriaLicencia <em>Categoria Licencia</em>}</li>
 *   <li>{@link den.domain.persona.Conductor#getCodigoLicencia <em>Codigo Licencia</em>}</li>
 *   <li>{@link den.domain.persona.Conductor#getOwenedByPersona <em>Owened By Persona</em>}</li>
 * </ul>
 *
 * @see den.domain.persona.PersonaPackage#getConductor()
 * @model
 * @generated
 */
public interface Conductor extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Transporte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.transporte.Transporte#getLstConductor <em>Lst Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Transporte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Transporte</em>' reference.
	 * @see #setLstTransporte(Transporte)
	 * @see den.domain.persona.PersonaPackage#getConductor_LstTransporte()
	 * @see den.domain.transporte.Transporte#getLstConductor
	 * @model opposite="lstConductor"
	 * @generated
	 */
	Transporte getLstTransporte();

	/**
	 * Sets the value of the '{@link den.domain.persona.Conductor#getLstTransporte <em>Lst Transporte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Transporte</em>' reference.
	 * @see #getLstTransporte()
	 * @generated
	 */
	void setLstTransporte(Transporte value);

	/**
	 * Returns the value of the '<em><b>Id Conductor</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Conductor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Conductor</em>' attribute.
	 * @see #setIdConductor(String)
	 * @see den.domain.persona.PersonaPackage#getConductor_IdConductor()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdConductor();

	/**
	 * Sets the value of the '{@link den.domain.persona.Conductor#getIdConductor <em>Id Conductor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Conductor</em>' attribute.
	 * @see #getIdConductor()
	 * @generated
	 */
	void setIdConductor(String value);

	/**
	 * Returns the value of the '<em><b>Categoria Licencia</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categoria Licencia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categoria Licencia</em>' attribute.
	 * @see #setCategoriaLicencia(String)
	 * @see den.domain.persona.PersonaPackage#getConductor_CategoriaLicencia()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getCategoriaLicencia();

	/**
	 * Sets the value of the '{@link den.domain.persona.Conductor#getCategoriaLicencia <em>Categoria Licencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categoria Licencia</em>' attribute.
	 * @see #getCategoriaLicencia()
	 * @generated
	 */
	void setCategoriaLicencia(String value);

	/**
	 * Returns the value of the '<em><b>Codigo Licencia</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Licencia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Licencia</em>' attribute.
	 * @see #setCodigoLicencia(String)
	 * @see den.domain.persona.PersonaPackage#getConductor_CodigoLicencia()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getCodigoLicencia();

	/**
	 * Sets the value of the '{@link den.domain.persona.Conductor#getCodigoLicencia <em>Codigo Licencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo Licencia</em>' attribute.
	 * @see #getCodigoLicencia()
	 * @generated
	 */
	void setCodigoLicencia(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Persona</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.persona.Persona#getLstConductor <em>Lst Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Persona</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Persona</em>' container reference.
	 * @see #setOwenedByPersona(Persona)
	 * @see den.domain.persona.PersonaPackage#getConductor_OwenedByPersona()
	 * @see den.domain.persona.Persona#getLstConductor
	 * @model opposite="lstConductor" transient="false"
	 * @generated
	 */
	Persona getOwenedByPersona();

	/**
	 * Sets the value of the '{@link den.domain.persona.Conductor#getOwenedByPersona <em>Owened By Persona</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Persona</em>' container reference.
	 * @see #getOwenedByPersona()
	 * @generated
	 */
	void setOwenedByPersona(Persona value);

} // Conductor
