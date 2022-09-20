/**
 */
package den.domain.ruta;

import den.domain.envio.Envio;

import den.domain.ubicacion.Ciudad;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ruta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.ruta.Ruta#getLstCiudadOrigen <em>Lst Ciudad Origen</em>}</li>
 *   <li>{@link den.domain.ruta.Ruta#getLstCiudadDestino <em>Lst Ciudad Destino</em>}</li>
 *   <li>{@link den.domain.ruta.Ruta#getId <em>Id</em>}</li>
 *   <li>{@link den.domain.ruta.Ruta#getNombre <em>Nombre</em>}</li>
 *   <li>{@link den.domain.ruta.Ruta#getKm <em>Km</em>}</li>
 *   <li>{@link den.domain.ruta.Ruta#getOwenedByCiudad <em>Owened By Ciudad</em>}</li>
 *   <li>{@link den.domain.ruta.Ruta#getLstEnvio <em>Lst Envio</em>}</li>
 *   <li>{@link den.domain.ruta.Ruta#getOwenedByFactoryRuta <em>Owened By Factory Ruta</em>}</li>
 *   <li>{@link den.domain.ruta.Ruta#getLstTarifa <em>Lst Tarifa</em>}</li>
 * </ul>
 *
 * @see den.domain.ruta.RutaPackage#getRuta()
 * @model
 * @generated
 */
public interface Ruta extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Ciudad Origen</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.ubicacion.Ciudad#getLstRutaOrigen <em>Lst Ruta Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Ciudad Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Ciudad Origen</em>' reference.
	 * @see #setLstCiudadOrigen(Ciudad)
	 * @see den.domain.ruta.RutaPackage#getRuta_LstCiudadOrigen()
	 * @see den.domain.ubicacion.Ciudad#getLstRutaOrigen
	 * @model opposite="lstRutaOrigen"
	 * @generated
	 */
	Ciudad getLstCiudadOrigen();

	/**
	 * Sets the value of the '{@link den.domain.ruta.Ruta#getLstCiudadOrigen <em>Lst Ciudad Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Ciudad Origen</em>' reference.
	 * @see #getLstCiudadOrigen()
	 * @generated
	 */
	void setLstCiudadOrigen(Ciudad value);

	/**
	 * Returns the value of the '<em><b>Lst Ciudad Destino</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.ubicacion.Ciudad#getLstRutaDestino <em>Lst Ruta Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Ciudad Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Ciudad Destino</em>' reference.
	 * @see #setLstCiudadDestino(Ciudad)
	 * @see den.domain.ruta.RutaPackage#getRuta_LstCiudadDestino()
	 * @see den.domain.ubicacion.Ciudad#getLstRutaDestino
	 * @model opposite="lstRutaDestino"
	 * @generated
	 */
	Ciudad getLstCiudadDestino();

	/**
	 * Sets the value of the '{@link den.domain.ruta.Ruta#getLstCiudadDestino <em>Lst Ciudad Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Ciudad Destino</em>' reference.
	 * @see #getLstCiudadDestino()
	 * @generated
	 */
	void setLstCiudadDestino(Ciudad value);

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
	 * @see den.domain.ruta.RutaPackage#getRuta_Id()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link den.domain.ruta.Ruta#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see den.domain.ruta.RutaPackage#getRuta_Nombre()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link den.domain.ruta.Ruta#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Km</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Km</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Km</em>' attribute.
	 * @see #setKm(String)
	 * @see den.domain.ruta.RutaPackage#getRuta_Km()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getKm();

	/**
	 * Sets the value of the '{@link den.domain.ruta.Ruta#getKm <em>Km</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Km</em>' attribute.
	 * @see #getKm()
	 * @generated
	 */
	void setKm(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Ciudad</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.ubicacion.Ciudad#getLstRuta <em>Lst Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Ciudad</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Ciudad</em>' container reference.
	 * @see #setOwenedByCiudad(Ciudad)
	 * @see den.domain.ruta.RutaPackage#getRuta_OwenedByCiudad()
	 * @see den.domain.ubicacion.Ciudad#getLstRuta
	 * @model opposite="lstRuta" transient="false"
	 * @generated
	 */
	Ciudad getOwenedByCiudad();

	/**
	 * Sets the value of the '{@link den.domain.ruta.Ruta#getOwenedByCiudad <em>Owened By Ciudad</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Ciudad</em>' container reference.
	 * @see #getOwenedByCiudad()
	 * @generated
	 */
	void setOwenedByCiudad(Ciudad value);

	/**
	 * Returns the value of the '<em><b>Lst Envio</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link den.domain.envio.Envio#getLstRuta <em>Lst Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Envio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Envio</em>' reference.
	 * @see #setLstEnvio(Envio)
	 * @see den.domain.ruta.RutaPackage#getRuta_LstEnvio()
	 * @see den.domain.envio.Envio#getLstRuta
	 * @model opposite="lstRuta"
	 * @generated
	 */
	Envio getLstEnvio();

	/**
	 * Sets the value of the '{@link den.domain.ruta.Ruta#getLstEnvio <em>Lst Envio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Envio</em>' reference.
	 * @see #getLstEnvio()
	 * @generated
	 */
	void setLstEnvio(Envio value);

	/**
	 * Returns the value of the '<em><b>Owened By Factory Ruta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.ruta.FactoryRuta#getLstRuta <em>Lst Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Factory Ruta</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Factory Ruta</em>' container reference.
	 * @see #setOwenedByFactoryRuta(FactoryRuta)
	 * @see den.domain.ruta.RutaPackage#getRuta_OwenedByFactoryRuta()
	 * @see den.domain.ruta.FactoryRuta#getLstRuta
	 * @model opposite="lstRuta" transient="false"
	 * @generated
	 */
	FactoryRuta getOwenedByFactoryRuta();

	/**
	 * Sets the value of the '{@link den.domain.ruta.Ruta#getOwenedByFactoryRuta <em>Owened By Factory Ruta</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Factory Ruta</em>' container reference.
	 * @see #getOwenedByFactoryRuta()
	 * @generated
	 */
	void setOwenedByFactoryRuta(FactoryRuta value);

	/**
	 * Returns the value of the '<em><b>Lst Tarifa</b></em>' containment reference list.
	 * The list contents are of type {@link den.domain.ruta.Tarifa}.
	 * It is bidirectional and its opposite is '{@link den.domain.ruta.Tarifa#getOwenedByRuta <em>Owened By Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Tarifa</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Tarifa</em>' containment reference list.
	 * @see den.domain.ruta.RutaPackage#getRuta_LstTarifa()
	 * @see den.domain.ruta.Tarifa#getOwenedByRuta
	 * @model opposite="owenedByRuta" containment="true"
	 * @generated
	 */
	EList<Tarifa> getLstTarifa();

} // Ruta
