/**
 */
package den.domain.ubicacion;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see den.domain.ubicacion.UbicacionFactory
 * @model kind="package"
 * @generated
 */
public interface UbicacionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ubicacion";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///den/domain/ubicacion.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "den.domain.ubicacion";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UbicacionPackage eINSTANCE = den.domain.ubicacion.impl.UbicacionPackageImpl.init();

	/**
	 * The meta object id for the '{@link den.domain.ubicacion.impl.CiudadImpl <em>Ciudad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.ubicacion.impl.CiudadImpl
	 * @see den.domain.ubicacion.impl.UbicacionPackageImpl#getCiudad()
	 * @generated
	 */
	int CIUDAD = 0;

	/**
	 * The feature id for the '<em><b>Id Ciudad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIUDAD__ID_CIUDAD = 0;

	/**
	 * The feature id for the '<em><b>Coordenadas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIUDAD__COORDENADAS = 1;

	/**
	 * The feature id for the '<em><b>Owened Departamento</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIUDAD__OWENED_DEPARTAMENTO = 2;

	/**
	 * The feature id for the '<em><b>Lst Ruta Origen</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIUDAD__LST_RUTA_ORIGEN = 3;

	/**
	 * The feature id for the '<em><b>Lst Ruta Destino</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIUDAD__LST_RUTA_DESTINO = 4;

	/**
	 * The feature id for the '<em><b>The Envio Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIUDAD__THE_ENVIO_ORIGEN = 5;

	/**
	 * The feature id for the '<em><b>The Envio Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIUDAD__THE_ENVIO_DESTINO = 6;

	/**
	 * The feature id for the '<em><b>Lst Ruta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIUDAD__LST_RUTA = 7;

	/**
	 * The number of structural features of the '<em>Ciudad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIUDAD_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link den.domain.ubicacion.impl.DepartamentoImpl <em>Departamento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.ubicacion.impl.DepartamentoImpl
	 * @see den.domain.ubicacion.impl.UbicacionPackageImpl#getDepartamento()
	 * @generated
	 */
	int DEPARTAMENTO = 1;

	/**
	 * The feature id for the '<em><b>Lst Ciudad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__LST_CIUDAD = 0;

	/**
	 * The feature id for the '<em><b>Id Departamento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__ID_DEPARTAMENTO = 1;

	/**
	 * The feature id for the '<em><b>Capital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__CAPITAL = 2;

	/**
	 * The feature id for the '<em><b>Prefijo Telefonico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__PREFIJO_TELEFONICO = 3;

	/**
	 * The feature id for the '<em><b>Coordenadas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__COORDENADAS = 4;

	/**
	 * The feature id for the '<em><b>Owened By Pais</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO__OWENED_BY_PAIS = 5;

	/**
	 * The number of structural features of the '<em>Departamento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTAMENTO_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link den.domain.ubicacion.impl.FactoryUbicacionImpl <em>Factory Ubicacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.ubicacion.impl.FactoryUbicacionImpl
	 * @see den.domain.ubicacion.impl.UbicacionPackageImpl#getFactoryUbicacion()
	 * @generated
	 */
	int FACTORY_UBICACION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_UBICACION__ID = 0;

	/**
	 * The feature id for the '<em><b>Owened By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_UBICACION__OWENED_BY_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Lst Pais</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_UBICACION__LST_PAIS = 2;

	/**
	 * The number of structural features of the '<em>Factory Ubicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_UBICACION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link den.domain.ubicacion.impl.PaisImpl <em>Pais</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.ubicacion.impl.PaisImpl
	 * @see den.domain.ubicacion.impl.UbicacionPackageImpl#getPais()
	 * @generated
	 */
	int PAIS = 3;

	/**
	 * The feature id for the '<em><b>Lst Departamento</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIS__LST_DEPARTAMENTO = 0;

	/**
	 * The feature id for the '<em><b>Id Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIS__ID_PAIS = 1;

	/**
	 * The feature id for the '<em><b>Capital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIS__CAPITAL = 2;

	/**
	 * The feature id for the '<em><b>Codigo Internacional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIS__CODIGO_INTERNACIONAL = 3;

	/**
	 * The feature id for the '<em><b>Idioma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIS__IDIOMA = 4;

	/**
	 * The feature id for the '<em><b>Coordenadas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIS__COORDENADAS = 5;

	/**
	 * The feature id for the '<em><b>Owened By Ubicacion</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIS__OWENED_BY_UBICACION = 6;

	/**
	 * The number of structural features of the '<em>Pais</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIS_FEATURE_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link den.domain.ubicacion.Ciudad <em>Ciudad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ciudad</em>'.
	 * @see den.domain.ubicacion.Ciudad
	 * @generated
	 */
	EClass getCiudad();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ubicacion.Ciudad#getIdCiudad <em>Id Ciudad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ciudad</em>'.
	 * @see den.domain.ubicacion.Ciudad#getIdCiudad()
	 * @see #getCiudad()
	 * @generated
	 */
	EAttribute getCiudad_IdCiudad();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ubicacion.Ciudad#getCoordenadas <em>Coordenadas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordenadas</em>'.
	 * @see den.domain.ubicacion.Ciudad#getCoordenadas()
	 * @see #getCiudad()
	 * @generated
	 */
	EAttribute getCiudad_Coordenadas();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.ubicacion.Ciudad#getOwenedDepartamento <em>Owened Departamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened Departamento</em>'.
	 * @see den.domain.ubicacion.Ciudad#getOwenedDepartamento()
	 * @see #getCiudad()
	 * @generated
	 */
	EReference getCiudad_OwenedDepartamento();

	/**
	 * Returns the meta object for the reference list '{@link den.domain.ubicacion.Ciudad#getLstRutaOrigen <em>Lst Ruta Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Ruta Origen</em>'.
	 * @see den.domain.ubicacion.Ciudad#getLstRutaOrigen()
	 * @see #getCiudad()
	 * @generated
	 */
	EReference getCiudad_LstRutaOrigen();

	/**
	 * Returns the meta object for the reference list '{@link den.domain.ubicacion.Ciudad#getLstRutaDestino <em>Lst Ruta Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Ruta Destino</em>'.
	 * @see den.domain.ubicacion.Ciudad#getLstRutaDestino()
	 * @see #getCiudad()
	 * @generated
	 */
	EReference getCiudad_LstRutaDestino();

	/**
	 * Returns the meta object for the reference '{@link den.domain.ubicacion.Ciudad#getTheEnvioOrigen <em>The Envio Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Envio Origen</em>'.
	 * @see den.domain.ubicacion.Ciudad#getTheEnvioOrigen()
	 * @see #getCiudad()
	 * @generated
	 */
	EReference getCiudad_TheEnvioOrigen();

	/**
	 * Returns the meta object for the reference '{@link den.domain.ubicacion.Ciudad#getTheEnvioDestino <em>The Envio Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Envio Destino</em>'.
	 * @see den.domain.ubicacion.Ciudad#getTheEnvioDestino()
	 * @see #getCiudad()
	 * @generated
	 */
	EReference getCiudad_TheEnvioDestino();

	/**
	 * Returns the meta object for the containment reference list '{@link den.domain.ubicacion.Ciudad#getLstRuta <em>Lst Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Ruta</em>'.
	 * @see den.domain.ubicacion.Ciudad#getLstRuta()
	 * @see #getCiudad()
	 * @generated
	 */
	EReference getCiudad_LstRuta();

	/**
	 * Returns the meta object for class '{@link den.domain.ubicacion.Departamento <em>Departamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departamento</em>'.
	 * @see den.domain.ubicacion.Departamento
	 * @generated
	 */
	EClass getDepartamento();

	/**
	 * Returns the meta object for the containment reference list '{@link den.domain.ubicacion.Departamento#getLstCiudad <em>Lst Ciudad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Ciudad</em>'.
	 * @see den.domain.ubicacion.Departamento#getLstCiudad()
	 * @see #getDepartamento()
	 * @generated
	 */
	EReference getDepartamento_LstCiudad();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ubicacion.Departamento#getIdDepartamento <em>Id Departamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Departamento</em>'.
	 * @see den.domain.ubicacion.Departamento#getIdDepartamento()
	 * @see #getDepartamento()
	 * @generated
	 */
	EAttribute getDepartamento_IdDepartamento();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ubicacion.Departamento#getCapital <em>Capital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capital</em>'.
	 * @see den.domain.ubicacion.Departamento#getCapital()
	 * @see #getDepartamento()
	 * @generated
	 */
	EAttribute getDepartamento_Capital();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ubicacion.Departamento#getPrefijoTelefonico <em>Prefijo Telefonico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefijo Telefonico</em>'.
	 * @see den.domain.ubicacion.Departamento#getPrefijoTelefonico()
	 * @see #getDepartamento()
	 * @generated
	 */
	EAttribute getDepartamento_PrefijoTelefonico();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ubicacion.Departamento#getCoordenadas <em>Coordenadas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordenadas</em>'.
	 * @see den.domain.ubicacion.Departamento#getCoordenadas()
	 * @see #getDepartamento()
	 * @generated
	 */
	EAttribute getDepartamento_Coordenadas();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.ubicacion.Departamento#getOwenedByPais <em>Owened By Pais</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Pais</em>'.
	 * @see den.domain.ubicacion.Departamento#getOwenedByPais()
	 * @see #getDepartamento()
	 * @generated
	 */
	EReference getDepartamento_OwenedByPais();

	/**
	 * Returns the meta object for class '{@link den.domain.ubicacion.FactoryUbicacion <em>Factory Ubicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Ubicacion</em>'.
	 * @see den.domain.ubicacion.FactoryUbicacion
	 * @generated
	 */
	EClass getFactoryUbicacion();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ubicacion.FactoryUbicacion#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see den.domain.ubicacion.FactoryUbicacion#getId()
	 * @see #getFactoryUbicacion()
	 * @generated
	 */
	EAttribute getFactoryUbicacion_Id();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.ubicacion.FactoryUbicacion#getOwenedByDomain <em>Owened By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Domain</em>'.
	 * @see den.domain.ubicacion.FactoryUbicacion#getOwenedByDomain()
	 * @see #getFactoryUbicacion()
	 * @generated
	 */
	EReference getFactoryUbicacion_OwenedByDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link den.domain.ubicacion.FactoryUbicacion#getLstPais <em>Lst Pais</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Pais</em>'.
	 * @see den.domain.ubicacion.FactoryUbicacion#getLstPais()
	 * @see #getFactoryUbicacion()
	 * @generated
	 */
	EReference getFactoryUbicacion_LstPais();

	/**
	 * Returns the meta object for class '{@link den.domain.ubicacion.Pais <em>Pais</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pais</em>'.
	 * @see den.domain.ubicacion.Pais
	 * @generated
	 */
	EClass getPais();

	/**
	 * Returns the meta object for the containment reference list '{@link den.domain.ubicacion.Pais#getLstDepartamento <em>Lst Departamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Departamento</em>'.
	 * @see den.domain.ubicacion.Pais#getLstDepartamento()
	 * @see #getPais()
	 * @generated
	 */
	EReference getPais_LstDepartamento();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ubicacion.Pais#getIdPais <em>Id Pais</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Pais</em>'.
	 * @see den.domain.ubicacion.Pais#getIdPais()
	 * @see #getPais()
	 * @generated
	 */
	EAttribute getPais_IdPais();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ubicacion.Pais#getCapital <em>Capital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capital</em>'.
	 * @see den.domain.ubicacion.Pais#getCapital()
	 * @see #getPais()
	 * @generated
	 */
	EAttribute getPais_Capital();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ubicacion.Pais#getCodigoInternacional <em>Codigo Internacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Internacional</em>'.
	 * @see den.domain.ubicacion.Pais#getCodigoInternacional()
	 * @see #getPais()
	 * @generated
	 */
	EAttribute getPais_CodigoInternacional();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ubicacion.Pais#getIdioma <em>Idioma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idioma</em>'.
	 * @see den.domain.ubicacion.Pais#getIdioma()
	 * @see #getPais()
	 * @generated
	 */
	EAttribute getPais_Idioma();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ubicacion.Pais#getCoordenadas <em>Coordenadas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordenadas</em>'.
	 * @see den.domain.ubicacion.Pais#getCoordenadas()
	 * @see #getPais()
	 * @generated
	 */
	EAttribute getPais_Coordenadas();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.ubicacion.Pais#getOwenedByUbicacion <em>Owened By Ubicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Ubicacion</em>'.
	 * @see den.domain.ubicacion.Pais#getOwenedByUbicacion()
	 * @see #getPais()
	 * @generated
	 */
	EReference getPais_OwenedByUbicacion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UbicacionFactory getUbicacionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link den.domain.ubicacion.impl.CiudadImpl <em>Ciudad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.ubicacion.impl.CiudadImpl
		 * @see den.domain.ubicacion.impl.UbicacionPackageImpl#getCiudad()
		 * @generated
		 */
		EClass CIUDAD = eINSTANCE.getCiudad();

		/**
		 * The meta object literal for the '<em><b>Id Ciudad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIUDAD__ID_CIUDAD = eINSTANCE.getCiudad_IdCiudad();

		/**
		 * The meta object literal for the '<em><b>Coordenadas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIUDAD__COORDENADAS = eINSTANCE.getCiudad_Coordenadas();

		/**
		 * The meta object literal for the '<em><b>Owened Departamento</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIUDAD__OWENED_DEPARTAMENTO = eINSTANCE.getCiudad_OwenedDepartamento();

		/**
		 * The meta object literal for the '<em><b>Lst Ruta Origen</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIUDAD__LST_RUTA_ORIGEN = eINSTANCE.getCiudad_LstRutaOrigen();

		/**
		 * The meta object literal for the '<em><b>Lst Ruta Destino</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIUDAD__LST_RUTA_DESTINO = eINSTANCE.getCiudad_LstRutaDestino();

		/**
		 * The meta object literal for the '<em><b>The Envio Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIUDAD__THE_ENVIO_ORIGEN = eINSTANCE.getCiudad_TheEnvioOrigen();

		/**
		 * The meta object literal for the '<em><b>The Envio Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIUDAD__THE_ENVIO_DESTINO = eINSTANCE.getCiudad_TheEnvioDestino();

		/**
		 * The meta object literal for the '<em><b>Lst Ruta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIUDAD__LST_RUTA = eINSTANCE.getCiudad_LstRuta();

		/**
		 * The meta object literal for the '{@link den.domain.ubicacion.impl.DepartamentoImpl <em>Departamento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.ubicacion.impl.DepartamentoImpl
		 * @see den.domain.ubicacion.impl.UbicacionPackageImpl#getDepartamento()
		 * @generated
		 */
		EClass DEPARTAMENTO = eINSTANCE.getDepartamento();

		/**
		 * The meta object literal for the '<em><b>Lst Ciudad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTAMENTO__LST_CIUDAD = eINSTANCE.getDepartamento_LstCiudad();

		/**
		 * The meta object literal for the '<em><b>Id Departamento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTAMENTO__ID_DEPARTAMENTO = eINSTANCE.getDepartamento_IdDepartamento();

		/**
		 * The meta object literal for the '<em><b>Capital</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTAMENTO__CAPITAL = eINSTANCE.getDepartamento_Capital();

		/**
		 * The meta object literal for the '<em><b>Prefijo Telefonico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTAMENTO__PREFIJO_TELEFONICO = eINSTANCE.getDepartamento_PrefijoTelefonico();

		/**
		 * The meta object literal for the '<em><b>Coordenadas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTAMENTO__COORDENADAS = eINSTANCE.getDepartamento_Coordenadas();

		/**
		 * The meta object literal for the '<em><b>Owened By Pais</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTAMENTO__OWENED_BY_PAIS = eINSTANCE.getDepartamento_OwenedByPais();

		/**
		 * The meta object literal for the '{@link den.domain.ubicacion.impl.FactoryUbicacionImpl <em>Factory Ubicacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.ubicacion.impl.FactoryUbicacionImpl
		 * @see den.domain.ubicacion.impl.UbicacionPackageImpl#getFactoryUbicacion()
		 * @generated
		 */
		EClass FACTORY_UBICACION = eINSTANCE.getFactoryUbicacion();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY_UBICACION__ID = eINSTANCE.getFactoryUbicacion_Id();

		/**
		 * The meta object literal for the '<em><b>Owened By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_UBICACION__OWENED_BY_DOMAIN = eINSTANCE.getFactoryUbicacion_OwenedByDomain();

		/**
		 * The meta object literal for the '<em><b>Lst Pais</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_UBICACION__LST_PAIS = eINSTANCE.getFactoryUbicacion_LstPais();

		/**
		 * The meta object literal for the '{@link den.domain.ubicacion.impl.PaisImpl <em>Pais</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.ubicacion.impl.PaisImpl
		 * @see den.domain.ubicacion.impl.UbicacionPackageImpl#getPais()
		 * @generated
		 */
		EClass PAIS = eINSTANCE.getPais();

		/**
		 * The meta object literal for the '<em><b>Lst Departamento</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIS__LST_DEPARTAMENTO = eINSTANCE.getPais_LstDepartamento();

		/**
		 * The meta object literal for the '<em><b>Id Pais</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIS__ID_PAIS = eINSTANCE.getPais_IdPais();

		/**
		 * The meta object literal for the '<em><b>Capital</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIS__CAPITAL = eINSTANCE.getPais_Capital();

		/**
		 * The meta object literal for the '<em><b>Codigo Internacional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIS__CODIGO_INTERNACIONAL = eINSTANCE.getPais_CodigoInternacional();

		/**
		 * The meta object literal for the '<em><b>Idioma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIS__IDIOMA = eINSTANCE.getPais_Idioma();

		/**
		 * The meta object literal for the '<em><b>Coordenadas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIS__COORDENADAS = eINSTANCE.getPais_Coordenadas();

		/**
		 * The meta object literal for the '<em><b>Owened By Ubicacion</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIS__OWENED_BY_UBICACION = eINSTANCE.getPais_OwenedByUbicacion();

	}

} //UbicacionPackage
