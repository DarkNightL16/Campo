/**
 */
package den.domain.persona;

import den.domain.Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.persona.FactoryPersona#getIdPersona <em>Id Persona</em>}</li>
 *   <li>{@link den.domain.persona.FactoryPersona#getOwenedByDomain <em>Owened By Domain</em>}</li>
 *   <li>{@link den.domain.persona.FactoryPersona#getLstPersona <em>Lst Persona</em>}</li>
 * </ul>
 *
 * @see den.domain.persona.PersonaPackage#getFactoryPersona()
 * @model
 * @generated
 */
public interface FactoryPersona extends EObject {
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
	 * @see den.domain.persona.PersonaPackage#getFactoryPersona_IdPersona()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdPersona();

	/**
	 * Sets the value of the '{@link den.domain.persona.FactoryPersona#getIdPersona <em>Id Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Persona</em>' attribute.
	 * @see #getIdPersona()
	 * @generated
	 */
	void setIdPersona(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.Domain#getLstFactoryPersona <em>Lst Factory Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Domain</em>' container reference.
	 * @see #setOwenedByDomain(Domain)
	 * @see den.domain.persona.PersonaPackage#getFactoryPersona_OwenedByDomain()
	 * @see den.domain.Domain#getLstFactoryPersona
	 * @model opposite="lstFactoryPersona" transient="false"
	 * @generated
	 */
	Domain getOwenedByDomain();

	/**
	 * Sets the value of the '{@link den.domain.persona.FactoryPersona#getOwenedByDomain <em>Owened By Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Domain</em>' container reference.
	 * @see #getOwenedByDomain()
	 * @generated
	 */
	void setOwenedByDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Lst Persona</b></em>' containment reference list.
	 * The list contents are of type {@link den.domain.persona.Persona}.
	 * It is bidirectional and its opposite is '{@link den.domain.persona.Persona#getOwenedByFactoryPersona <em>Owened By Factory Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Persona</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Persona</em>' containment reference list.
	 * @see den.domain.persona.PersonaPackage#getFactoryPersona_LstPersona()
	 * @see den.domain.persona.Persona#getOwenedByFactoryPersona
	 * @model opposite="owenedByFactoryPersona" containment="true"
	 * @generated
	 */
	EList<Persona> getLstPersona();

} // FactoryPersona
