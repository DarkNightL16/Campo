/**
 */
package den.domain.ubicacion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Departamento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.ubicacion.Departamento#getLstCiudad <em>Lst Ciudad</em>}</li>
 *   <li>{@link den.domain.ubicacion.Departamento#getIdDepartamento <em>Id Departamento</em>}</li>
 *   <li>{@link den.domain.ubicacion.Departamento#getCapital <em>Capital</em>}</li>
 *   <li>{@link den.domain.ubicacion.Departamento#getPrefijoTelefonico <em>Prefijo Telefonico</em>}</li>
 *   <li>{@link den.domain.ubicacion.Departamento#getCoordenadas <em>Coordenadas</em>}</li>
 *   <li>{@link den.domain.ubicacion.Departamento#getOwenedByPais <em>Owened By Pais</em>}</li>
 * </ul>
 *
 * @see den.domain.ubicacion.UbicacionPackage#getDepartamento()
 * @model
 * @generated
 */
public interface Departamento extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Ciudad</b></em>' containment reference list.
	 * The list contents are of type {@link den.domain.ubicacion.Ciudad}.
	 * It is bidirectional and its opposite is '{@link den.domain.ubicacion.Ciudad#getOwenedDepartamento <em>Owened Departamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Ciudad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Ciudad</em>' containment reference list.
	 * @see den.domain.ubicacion.UbicacionPackage#getDepartamento_LstCiudad()
	 * @see den.domain.ubicacion.Ciudad#getOwenedDepartamento
	 * @model opposite="owenedDepartamento" containment="true"
	 * @generated
	 */
	EList<Ciudad> getLstCiudad();

	/**
	 * Returns the value of the '<em><b>Id Departamento</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Departamento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Departamento</em>' attribute.
	 * @see #setIdDepartamento(String)
	 * @see den.domain.ubicacion.UbicacionPackage#getDepartamento_IdDepartamento()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdDepartamento();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Departamento#getIdDepartamento <em>Id Departamento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Departamento</em>' attribute.
	 * @see #getIdDepartamento()
	 * @generated
	 */
	void setIdDepartamento(String value);

	/**
	 * Returns the value of the '<em><b>Capital</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capital</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capital</em>' attribute.
	 * @see #setCapital(String)
	 * @see den.domain.ubicacion.UbicacionPackage#getDepartamento_Capital()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getCapital();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Departamento#getCapital <em>Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capital</em>' attribute.
	 * @see #getCapital()
	 * @generated
	 */
	void setCapital(String value);

	/**
	 * Returns the value of the '<em><b>Prefijo Telefonico</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefijo Telefonico</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefijo Telefonico</em>' attribute.
	 * @see #setPrefijoTelefonico(String)
	 * @see den.domain.ubicacion.UbicacionPackage#getDepartamento_PrefijoTelefonico()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getPrefijoTelefonico();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Departamento#getPrefijoTelefonico <em>Prefijo Telefonico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefijo Telefonico</em>' attribute.
	 * @see #getPrefijoTelefonico()
	 * @generated
	 */
	void setPrefijoTelefonico(String value);

	/**
	 * Returns the value of the '<em><b>Coordenadas</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordenadas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordenadas</em>' attribute.
	 * @see #setCoordenadas(String)
	 * @see den.domain.ubicacion.UbicacionPackage#getDepartamento_Coordenadas()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getCoordenadas();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Departamento#getCoordenadas <em>Coordenadas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordenadas</em>' attribute.
	 * @see #getCoordenadas()
	 * @generated
	 */
	void setCoordenadas(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Pais</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.ubicacion.Pais#getLstDepartamento <em>Lst Departamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Pais</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Pais</em>' container reference.
	 * @see #setOwenedByPais(Pais)
	 * @see den.domain.ubicacion.UbicacionPackage#getDepartamento_OwenedByPais()
	 * @see den.domain.ubicacion.Pais#getLstDepartamento
	 * @model opposite="lstDepartamento" transient="false"
	 * @generated
	 */
	Pais getOwenedByPais();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Departamento#getOwenedByPais <em>Owened By Pais</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Pais</em>' container reference.
	 * @see #getOwenedByPais()
	 * @generated
	 */
	void setOwenedByPais(Pais value);

} // Departamento
