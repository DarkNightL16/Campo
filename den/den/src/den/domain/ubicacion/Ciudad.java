/**
 */
package den.domain.ubicacion;

import den.domain.envio.Envio;

import den.domain.ruta.Ruta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ciudad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.ubicacion.Ciudad#getIdCiudad <em>Id Ciudad</em>}</li>
 *   <li>{@link den.domain.ubicacion.Ciudad#getCoordenadas <em>Coordenadas</em>}</li>
 *   <li>{@link den.domain.ubicacion.Ciudad#getOwenedDepartamento <em>Owened Departamento</em>}</li>
 *   <li>{@link den.domain.ubicacion.Ciudad#getLstRutaOrigen <em>Lst Ruta Origen</em>}</li>
 *   <li>{@link den.domain.ubicacion.Ciudad#getLstRutaDestino <em>Lst Ruta Destino</em>}</li>
 *   <li>{@link den.domain.ubicacion.Ciudad#getTheEnvioOrigen <em>The Envio Origen</em>}</li>
 *   <li>{@link den.domain.ubicacion.Ciudad#getTheEnvioDestino <em>The Envio Destino</em>}</li>
 *   <li>{@link den.domain.ubicacion.Ciudad#getLstRuta <em>Lst Ruta</em>}</li>
 * </ul>
 *
 * @see den.domain.ubicacion.UbicacionPackage#getCiudad()
 * @model
 * @generated
 */
public interface Ciudad extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Ciudad</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Ciudad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Ciudad</em>' attribute.
	 * @see #setIdCiudad(String)
	 * @see den.domain.ubicacion.UbicacionPackage#getCiudad_IdCiudad()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdCiudad();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Ciudad#getIdCiudad <em>Id Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Ciudad</em>' attribute.
	 * @see #getIdCiudad()
	 * @generated
	 */
	void setIdCiudad(String value);

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
	 * @see den.domain.ubicacion.UbicacionPackage#getCiudad_Coordenadas()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getCoordenadas();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Ciudad#getCoordenadas <em>Coordenadas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordenadas</em>' attribute.
	 * @see #getCoordenadas()
	 * @generated
	 */
	void setCoordenadas(String value);

	/**
	 * Returns the value of the '<em><b>Owened Departamento</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.ubicacion.Departamento#getLstCiudad <em>Lst Ciudad</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened Departamento</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened Departamento</em>' container reference.
	 * @see #setOwenedDepartamento(Departamento)
	 * @see den.domain.ubicacion.UbicacionPackage#getCiudad_OwenedDepartamento()
	 * @see den.domain.ubicacion.Departamento#getLstCiudad
	 * @model opposite="lstCiudad" transient="false"
	 * @generated
	 */
	Departamento getOwenedDepartamento();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Ciudad#getOwenedDepartamento <em>Owened Departamento</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened Departamento</em>' container reference.
	 * @see #getOwenedDepartamento()
	 * @generated
	 */
	void setOwenedDepartamento(Departamento value);

	/**
	 * Returns the value of the '<em><b>Lst Ruta Origen</b></em>' reference list.
	 * The list contents are of type {@link den.domain.ruta.Ruta}.
	 * It is bidirectional and its opposite is '{@link den.domain.ruta.Ruta#getLstCiudadOrigen <em>Lst Ciudad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Ruta Origen</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Ruta Origen</em>' reference list.
	 * @see den.domain.ubicacion.UbicacionPackage#getCiudad_LstRutaOrigen()
	 * @see den.domain.ruta.Ruta#getLstCiudadOrigen
	 * @model opposite="lstCiudadOrigen"
	 * @generated
	 */
	EList<Ruta> getLstRutaOrigen();

	/**
	 * Returns the value of the '<em><b>Lst Ruta Destino</b></em>' reference list.
	 * The list contents are of type {@link den.domain.ruta.Ruta}.
	 * It is bidirectional and its opposite is '{@link den.domain.ruta.Ruta#getLstCiudadDestino <em>Lst Ciudad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Ruta Destino</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Ruta Destino</em>' reference list.
	 * @see den.domain.ubicacion.UbicacionPackage#getCiudad_LstRutaDestino()
	 * @see den.domain.ruta.Ruta#getLstCiudadDestino
	 * @model opposite="lstCiudadDestino"
	 * @generated
	 */
	EList<Ruta> getLstRutaDestino();

	/**
	 * Returns the value of the '<em><b>The Envio Origen</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.envio.Envio#getTheCiudadOrigen <em>The Ciudad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Envio Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Envio Origen</em>' reference.
	 * @see #setTheEnvioOrigen(Envio)
	 * @see den.domain.ubicacion.UbicacionPackage#getCiudad_TheEnvioOrigen()
	 * @see den.domain.envio.Envio#getTheCiudadOrigen
	 * @model opposite="theCiudadOrigen"
	 * @generated
	 */
	Envio getTheEnvioOrigen();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Ciudad#getTheEnvioOrigen <em>The Envio Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Envio Origen</em>' reference.
	 * @see #getTheEnvioOrigen()
	 * @generated
	 */
	void setTheEnvioOrigen(Envio value);

	/**
	 * Returns the value of the '<em><b>The Envio Destino</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.envio.Envio#getTheCiudadDestino <em>The Ciudad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Envio Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Envio Destino</em>' reference.
	 * @see #setTheEnvioDestino(Envio)
	 * @see den.domain.ubicacion.UbicacionPackage#getCiudad_TheEnvioDestino()
	 * @see den.domain.envio.Envio#getTheCiudadDestino
	 * @model opposite="theCiudadDestino"
	 * @generated
	 */
	Envio getTheEnvioDestino();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.Ciudad#getTheEnvioDestino <em>The Envio Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Envio Destino</em>' reference.
	 * @see #getTheEnvioDestino()
	 * @generated
	 */
	void setTheEnvioDestino(Envio value);

	/**
	 * Returns the value of the '<em><b>Lst Ruta</b></em>' containment reference list.
	 * The list contents are of type {@link den.domain.ruta.Ruta}.
	 * It is bidirectional and its opposite is '{@link den.domain.ruta.Ruta#getOwenedByCiudad <em>Owened By Ciudad</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Ruta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Ruta</em>' containment reference list.
	 * @see den.domain.ubicacion.UbicacionPackage#getCiudad_LstRuta()
	 * @see den.domain.ruta.Ruta#getOwenedByCiudad
	 * @model opposite="owenedByCiudad" containment="true"
	 * @generated
	 */
	EList<Ruta> getLstRuta();

} // Ciudad
