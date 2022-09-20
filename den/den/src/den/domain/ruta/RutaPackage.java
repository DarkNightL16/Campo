/**
 */
package den.domain.ruta;

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
 * @see den.domain.ruta.RutaFactory
 * @model kind="package"
 * @generated
 */
public interface RutaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ruta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///den/domain/ruta.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "den.domain.ruta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RutaPackage eINSTANCE = den.domain.ruta.impl.RutaPackageImpl.init();

	/**
	 * The meta object id for the '{@link den.domain.ruta.impl.FactoryRutaImpl <em>Factory Ruta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.ruta.impl.FactoryRutaImpl
	 * @see den.domain.ruta.impl.RutaPackageImpl#getFactoryRuta()
	 * @generated
	 */
	int FACTORY_RUTA = 0;

	/**
	 * The feature id for the '<em><b>Id Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_RUTA__ID_RUTA = 0;

	/**
	 * The feature id for the '<em><b>Owened By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_RUTA__OWENED_BY_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Lst Ruta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_RUTA__LST_RUTA = 2;

	/**
	 * The number of structural features of the '<em>Factory Ruta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_RUTA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link den.domain.ruta.impl.RutaImpl <em>Ruta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.ruta.impl.RutaImpl
	 * @see den.domain.ruta.impl.RutaPackageImpl#getRuta()
	 * @generated
	 */
	int RUTA = 1;

	/**
	 * The feature id for the '<em><b>Lst Ciudad Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__LST_CIUDAD_ORIGEN = 0;

	/**
	 * The feature id for the '<em><b>Lst Ciudad Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__LST_CIUDAD_DESTINO = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__ID = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__NOMBRE = 3;

	/**
	 * The feature id for the '<em><b>Km</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__KM = 4;

	/**
	 * The feature id for the '<em><b>Owened By Ciudad</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__OWENED_BY_CIUDAD = 5;

	/**
	 * The feature id for the '<em><b>Lst Envio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__LST_ENVIO = 6;

	/**
	 * The feature id for the '<em><b>Owened By Factory Ruta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__OWENED_BY_FACTORY_RUTA = 7;

	/**
	 * The feature id for the '<em><b>Lst Tarifa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA__LST_TARIFA = 8;

	/**
	 * The number of structural features of the '<em>Ruta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUTA_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link den.domain.ruta.impl.TarifaImpl <em>Tarifa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.ruta.impl.TarifaImpl
	 * @see den.domain.ruta.impl.RutaPackageImpl#getTarifa()
	 * @generated
	 */
	int TARIFA = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFA__ID = 0;

	/**
	 * The feature id for the '<em><b>Precio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFA__PRECIO = 1;

	/**
	 * The feature id for the '<em><b>Owened By Ruta</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFA__OWENED_BY_RUTA = 2;

	/**
	 * The number of structural features of the '<em>Tarifa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFA_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link den.domain.ruta.FactoryRuta <em>Factory Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Ruta</em>'.
	 * @see den.domain.ruta.FactoryRuta
	 * @generated
	 */
	EClass getFactoryRuta();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ruta.FactoryRuta#getIdRuta <em>Id Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ruta</em>'.
	 * @see den.domain.ruta.FactoryRuta#getIdRuta()
	 * @see #getFactoryRuta()
	 * @generated
	 */
	EAttribute getFactoryRuta_IdRuta();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.ruta.FactoryRuta#getOwenedByDomain <em>Owened By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Domain</em>'.
	 * @see den.domain.ruta.FactoryRuta#getOwenedByDomain()
	 * @see #getFactoryRuta()
	 * @generated
	 */
	EReference getFactoryRuta_OwenedByDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link den.domain.ruta.FactoryRuta#getLstRuta <em>Lst Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Ruta</em>'.
	 * @see den.domain.ruta.FactoryRuta#getLstRuta()
	 * @see #getFactoryRuta()
	 * @generated
	 */
	EReference getFactoryRuta_LstRuta();

	/**
	 * Returns the meta object for class '{@link den.domain.ruta.Ruta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruta</em>'.
	 * @see den.domain.ruta.Ruta
	 * @generated
	 */
	EClass getRuta();

	/**
	 * Returns the meta object for the reference '{@link den.domain.ruta.Ruta#getLstCiudadOrigen <em>Lst Ciudad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lst Ciudad Origen</em>'.
	 * @see den.domain.ruta.Ruta#getLstCiudadOrigen()
	 * @see #getRuta()
	 * @generated
	 */
	EReference getRuta_LstCiudadOrigen();

	/**
	 * Returns the meta object for the reference '{@link den.domain.ruta.Ruta#getLstCiudadDestino <em>Lst Ciudad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lst Ciudad Destino</em>'.
	 * @see den.domain.ruta.Ruta#getLstCiudadDestino()
	 * @see #getRuta()
	 * @generated
	 */
	EReference getRuta_LstCiudadDestino();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ruta.Ruta#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see den.domain.ruta.Ruta#getId()
	 * @see #getRuta()
	 * @generated
	 */
	EAttribute getRuta_Id();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ruta.Ruta#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see den.domain.ruta.Ruta#getNombre()
	 * @see #getRuta()
	 * @generated
	 */
	EAttribute getRuta_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ruta.Ruta#getKm <em>Km</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Km</em>'.
	 * @see den.domain.ruta.Ruta#getKm()
	 * @see #getRuta()
	 * @generated
	 */
	EAttribute getRuta_Km();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.ruta.Ruta#getOwenedByCiudad <em>Owened By Ciudad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Ciudad</em>'.
	 * @see den.domain.ruta.Ruta#getOwenedByCiudad()
	 * @see #getRuta()
	 * @generated
	 */
	EReference getRuta_OwenedByCiudad();

	/**
	 * Returns the meta object for the reference '{@link den.domain.ruta.Ruta#getLstEnvio <em>Lst Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lst Envio</em>'.
	 * @see den.domain.ruta.Ruta#getLstEnvio()
	 * @see #getRuta()
	 * @generated
	 */
	EReference getRuta_LstEnvio();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.ruta.Ruta#getOwenedByFactoryRuta <em>Owened By Factory Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Factory Ruta</em>'.
	 * @see den.domain.ruta.Ruta#getOwenedByFactoryRuta()
	 * @see #getRuta()
	 * @generated
	 */
	EReference getRuta_OwenedByFactoryRuta();

	/**
	 * Returns the meta object for the containment reference list '{@link den.domain.ruta.Ruta#getLstTarifa <em>Lst Tarifa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Tarifa</em>'.
	 * @see den.domain.ruta.Ruta#getLstTarifa()
	 * @see #getRuta()
	 * @generated
	 */
	EReference getRuta_LstTarifa();

	/**
	 * Returns the meta object for class '{@link den.domain.ruta.Tarifa <em>Tarifa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarifa</em>'.
	 * @see den.domain.ruta.Tarifa
	 * @generated
	 */
	EClass getTarifa();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ruta.Tarifa#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see den.domain.ruta.Tarifa#getId()
	 * @see #getTarifa()
	 * @generated
	 */
	EAttribute getTarifa_Id();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.ruta.Tarifa#getPrecio <em>Precio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precio</em>'.
	 * @see den.domain.ruta.Tarifa#getPrecio()
	 * @see #getTarifa()
	 * @generated
	 */
	EAttribute getTarifa_Precio();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.ruta.Tarifa#getOwenedByRuta <em>Owened By Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Ruta</em>'.
	 * @see den.domain.ruta.Tarifa#getOwenedByRuta()
	 * @see #getTarifa()
	 * @generated
	 */
	EReference getTarifa_OwenedByRuta();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RutaFactory getRutaFactory();

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
		 * The meta object literal for the '{@link den.domain.ruta.impl.FactoryRutaImpl <em>Factory Ruta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.ruta.impl.FactoryRutaImpl
		 * @see den.domain.ruta.impl.RutaPackageImpl#getFactoryRuta()
		 * @generated
		 */
		EClass FACTORY_RUTA = eINSTANCE.getFactoryRuta();

		/**
		 * The meta object literal for the '<em><b>Id Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY_RUTA__ID_RUTA = eINSTANCE.getFactoryRuta_IdRuta();

		/**
		 * The meta object literal for the '<em><b>Owened By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_RUTA__OWENED_BY_DOMAIN = eINSTANCE.getFactoryRuta_OwenedByDomain();

		/**
		 * The meta object literal for the '<em><b>Lst Ruta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_RUTA__LST_RUTA = eINSTANCE.getFactoryRuta_LstRuta();

		/**
		 * The meta object literal for the '{@link den.domain.ruta.impl.RutaImpl <em>Ruta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.ruta.impl.RutaImpl
		 * @see den.domain.ruta.impl.RutaPackageImpl#getRuta()
		 * @generated
		 */
		EClass RUTA = eINSTANCE.getRuta();

		/**
		 * The meta object literal for the '<em><b>Lst Ciudad Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUTA__LST_CIUDAD_ORIGEN = eINSTANCE.getRuta_LstCiudadOrigen();

		/**
		 * The meta object literal for the '<em><b>Lst Ciudad Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUTA__LST_CIUDAD_DESTINO = eINSTANCE.getRuta_LstCiudadDestino();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUTA__ID = eINSTANCE.getRuta_Id();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUTA__NOMBRE = eINSTANCE.getRuta_Nombre();

		/**
		 * The meta object literal for the '<em><b>Km</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUTA__KM = eINSTANCE.getRuta_Km();

		/**
		 * The meta object literal for the '<em><b>Owened By Ciudad</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUTA__OWENED_BY_CIUDAD = eINSTANCE.getRuta_OwenedByCiudad();

		/**
		 * The meta object literal for the '<em><b>Lst Envio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUTA__LST_ENVIO = eINSTANCE.getRuta_LstEnvio();

		/**
		 * The meta object literal for the '<em><b>Owened By Factory Ruta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUTA__OWENED_BY_FACTORY_RUTA = eINSTANCE.getRuta_OwenedByFactoryRuta();

		/**
		 * The meta object literal for the '<em><b>Lst Tarifa</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUTA__LST_TARIFA = eINSTANCE.getRuta_LstTarifa();

		/**
		 * The meta object literal for the '{@link den.domain.ruta.impl.TarifaImpl <em>Tarifa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.ruta.impl.TarifaImpl
		 * @see den.domain.ruta.impl.RutaPackageImpl#getTarifa()
		 * @generated
		 */
		EClass TARIFA = eINSTANCE.getTarifa();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARIFA__ID = eINSTANCE.getTarifa_Id();

		/**
		 * The meta object literal for the '<em><b>Precio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARIFA__PRECIO = eINSTANCE.getTarifa_Precio();

		/**
		 * The meta object literal for the '<em><b>Owened By Ruta</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARIFA__OWENED_BY_RUTA = eINSTANCE.getTarifa_OwenedByRuta();

	}

} //RutaPackage
