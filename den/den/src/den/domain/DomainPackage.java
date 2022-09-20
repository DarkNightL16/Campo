/**
 */
package den.domain;

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
 * @see den.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///den/domain.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "den.domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = den.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link den.domain.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.impl.DomainImpl
	 * @see den.domain.impl.DomainPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Lst Factory Ubicacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LST_FACTORY_UBICACION = 1;

	/**
	 * The feature id for the '<em><b>Lst Factory Pedido</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LST_FACTORY_PEDIDO = 2;

	/**
	 * The feature id for the '<em><b>Lst Factory Transporte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LST_FACTORY_TRANSPORTE = 3;

	/**
	 * The feature id for the '<em><b>Lst Factory Persona</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LST_FACTORY_PERSONA = 4;

	/**
	 * The feature id for the '<em><b>Lst Factory Producto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LST_FACTORY_PRODUCTO = 5;

	/**
	 * The feature id for the '<em><b>Lst Factory Envio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LST_FACTORY_ENVIO = 6;

	/**
	 * The feature id for the '<em><b>Lst Factory Ruta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LST_FACTORY_RUTA = 7;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_UI = 8;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 9;


	/**
	 * Returns the meta object for class '{@link den.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see den.domain.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.Domain#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see den.domain.Domain#getTheModelFactory()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheModelFactory();

	/**
	 * Returns the meta object for the containment reference '{@link den.domain.Domain#getLstFactoryUbicacion <em>Lst Factory Ubicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lst Factory Ubicacion</em>'.
	 * @see den.domain.Domain#getLstFactoryUbicacion()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_LstFactoryUbicacion();

	/**
	 * Returns the meta object for the containment reference '{@link den.domain.Domain#getLstFactoryPedido <em>Lst Factory Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lst Factory Pedido</em>'.
	 * @see den.domain.Domain#getLstFactoryPedido()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_LstFactoryPedido();

	/**
	 * Returns the meta object for the containment reference '{@link den.domain.Domain#getLstFactoryTransporte <em>Lst Factory Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lst Factory Transporte</em>'.
	 * @see den.domain.Domain#getLstFactoryTransporte()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_LstFactoryTransporte();

	/**
	 * Returns the meta object for the containment reference '{@link den.domain.Domain#getLstFactoryPersona <em>Lst Factory Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lst Factory Persona</em>'.
	 * @see den.domain.Domain#getLstFactoryPersona()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_LstFactoryPersona();

	/**
	 * Returns the meta object for the containment reference '{@link den.domain.Domain#getLstFactoryProducto <em>Lst Factory Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lst Factory Producto</em>'.
	 * @see den.domain.Domain#getLstFactoryProducto()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_LstFactoryProducto();

	/**
	 * Returns the meta object for the containment reference '{@link den.domain.Domain#getLstFactoryEnvio <em>Lst Factory Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lst Factory Envio</em>'.
	 * @see den.domain.Domain#getLstFactoryEnvio()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_LstFactoryEnvio();

	/**
	 * Returns the meta object for the containment reference '{@link den.domain.Domain#getLstFactoryRuta <em>Lst Factory Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lst Factory Ruta</em>'.
	 * @see den.domain.Domain#getLstFactoryRuta()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_LstFactoryRuta();

	/**
	 * Returns the meta object for the reference '{@link den.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The UI</em>'.
	 * @see den.domain.Domain#getTheUI()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheUI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

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
		 * The meta object literal for the '{@link den.domain.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.impl.DomainImpl
		 * @see den.domain.impl.DomainPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_MODEL_FACTORY = eINSTANCE.getDomain_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>Lst Factory Ubicacion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LST_FACTORY_UBICACION = eINSTANCE.getDomain_LstFactoryUbicacion();

		/**
		 * The meta object literal for the '<em><b>Lst Factory Pedido</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LST_FACTORY_PEDIDO = eINSTANCE.getDomain_LstFactoryPedido();

		/**
		 * The meta object literal for the '<em><b>Lst Factory Transporte</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LST_FACTORY_TRANSPORTE = eINSTANCE.getDomain_LstFactoryTransporte();

		/**
		 * The meta object literal for the '<em><b>Lst Factory Persona</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LST_FACTORY_PERSONA = eINSTANCE.getDomain_LstFactoryPersona();

		/**
		 * The meta object literal for the '<em><b>Lst Factory Producto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LST_FACTORY_PRODUCTO = eINSTANCE.getDomain_LstFactoryProducto();

		/**
		 * The meta object literal for the '<em><b>Lst Factory Envio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LST_FACTORY_ENVIO = eINSTANCE.getDomain_LstFactoryEnvio();

		/**
		 * The meta object literal for the '<em><b>Lst Factory Ruta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LST_FACTORY_RUTA = eINSTANCE.getDomain_LstFactoryRuta();

		/**
		 * The meta object literal for the '<em><b>The UI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_UI = eINSTANCE.getDomain_TheUI();

	}

} //DomainPackage
