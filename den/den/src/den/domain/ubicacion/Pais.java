/**
 */
package den.domain.ubicacion;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pais</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.ubicacion.Pais#getLstDepartamento <em>Lst Departamento</em>}</li>
 *   <li>{@link den.domain.ubicacion.Pais#getIdPais <em>Id Pais</em>}</li>
 *   <li>{@link den.domain.ubicacion.Pais#getCapital <em>Capital</em>}</li>
 *   <li>{@link den.domain.ubicacion.Pais#getCodigoInternacional <em>Codigo Internacional</em>}</li>
 *   <li>{@link den.domain.ubicacion.Pais#getIdioma <em>Idioma</em>}</li>
 *   <li>{@link den.domain.ubicacion.Pais#getCoordenadas <em>Coordenadas</em>}</li>
 *   <li>{@link den.domain.ubicacion.Pais#getOwenedByUbicacion <em>Owened By Ubicacion</em>}</li>
 * </ul>
 *
 * @see den.domain.ubicacion.UbicacionPackage#getPais()
 * @model
 * @generated
 */
public interface Pais extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Departamento</b></em>' containment reference list.
	 * The list contents are of type {@link den.domain.ubicacion.Departamento}.
	 * It is bidirectional and its opposite is '{@link den.domain.ubicacion.Departamento#getOwenedByPais <em>Owened By Pais</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Departamento</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Departamento</em>' containment reference list.
	 * @see den.domain.ubicacion.UbicacionPackage#getPais_LstDepartamento()
	 * @see den.domain.ubicacion.Departamento#getOwenedByPais
	 * @model opposite="owenedByPais" containment="true"
	 * @generated
	 */
	EList<Departamento> getLstDepartamento();

	/**
	 * Returns the value of the '<em><b>Id Pais</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Pais</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Pais</em>' attribute.
	 * @see #setIdPais(String)
	 * @see den.domain.ubicacion.UbicacionPackage#getPais_IdPais()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdPais();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Pais#getIdPais <em>Id Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Pais</em>' attribute.
	 * @see #getIdPais()
	 * @generated
	 */
	void setIdPais(String value);

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
	 * @see den.domain.ubicacion.UbicacionPackage#getPais_Capital()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getCapital();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Pais#getCapital <em>Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capital</em>' attribute.
	 * @see #getCapital()
	 * @generated
	 */
	void setCapital(String value);

	/**
	 * Returns the value of the '<em><b>Codigo Internacional</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Internacional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Internacional</em>' attribute.
	 * @see #setCodigoInternacional(String)
	 * @see den.domain.ubicacion.UbicacionPackage#getPais_CodigoInternacional()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getCodigoInternacional();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Pais#getCodigoInternacional <em>Codigo Internacional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo Internacional</em>' attribute.
	 * @see #getCodigoInternacional()
	 * @generated
	 */
	void setCodigoInternacional(String value);

	/**
	 * Returns the value of the '<em><b>Idioma</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idioma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idioma</em>' attribute.
	 * @see #setIdioma(String)
	 * @see den.domain.ubicacion.UbicacionPackage#getPais_Idioma()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdioma();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Pais#getIdioma <em>Idioma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idioma</em>' attribute.
	 * @see #getIdioma()
	 * @generated
	 */
	void setIdioma(String value);

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
	 * @see den.domain.ubicacion.UbicacionPackage#getPais_Coordenadas()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getCoordenadas();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Pais#getCoordenadas <em>Coordenadas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordenadas</em>' attribute.
	 * @see #getCoordenadas()
	 * @generated
	 */
	void setCoordenadas(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Ubicacion</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.ubicacion.FactoryUbicacion#getLstPais <em>Lst Pais</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Ubicacion</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Ubicacion</em>' container reference.
	 * @see #setOwenedByUbicacion(FactoryUbicacion)
	 * @see den.domain.ubicacion.UbicacionPackage#getPais_OwenedByUbicacion()
	 * @see den.domain.ubicacion.FactoryUbicacion#getLstPais
	 * @model opposite="lstPais" transient="false"
	 * @generated
	 */
	FactoryUbicacion getOwenedByUbicacion();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Pais#getOwenedByUbicacion <em>Owened By Ubicacion</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Ubicacion</em>' container reference.
	 * @see #getOwenedByUbicacion()
	 * @generated
	 */
	void setOwenedByUbicacion(FactoryUbicacion value);

} // Pais
