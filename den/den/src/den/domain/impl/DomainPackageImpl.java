/**
 */
package den.domain.impl;

import den.denPackage;

import den.domain.Domain;
import den.domain.DomainFactory;
import den.domain.DomainPackage;

import den.domain.envio.EnvioPackage;

import den.domain.envio.impl.EnvioPackageImpl;

import den.domain.pedido.PedidoPackage;

import den.domain.pedido.impl.PedidoPackageImpl;

import den.domain.persona.PersonaPackage;

import den.domain.persona.impl.PersonaPackageImpl;

import den.domain.producto.ProductoPackage;

import den.domain.producto.impl.ProductoPackageImpl;

import den.domain.ruta.RutaPackage;

import den.domain.ruta.impl.RutaPackageImpl;

import den.domain.transporte.TransportePackage;

import den.domain.transporte.impl.TransportePackageImpl;

import den.domain.ubicacion.UbicacionPackage;

import den.domain.ubicacion.impl.UbicacionPackageImpl;

import den.impl.denPackageImpl;

import den.ui.UiPackage;

import den.ui.impl.UiPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see den.domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		denPackageImpl thedenPackage = (denPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(denPackage.eNS_URI) instanceof denPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(denPackage.eNS_URI) : denPackage.eINSTANCE);
		UbicacionPackageImpl theUbicacionPackage = (UbicacionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UbicacionPackage.eNS_URI) instanceof UbicacionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UbicacionPackage.eNS_URI) : UbicacionPackage.eINSTANCE);
		PedidoPackageImpl thePedidoPackage = (PedidoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PedidoPackage.eNS_URI) instanceof PedidoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PedidoPackage.eNS_URI) : PedidoPackage.eINSTANCE);
		TransportePackageImpl theTransportePackage = (TransportePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransportePackage.eNS_URI) instanceof TransportePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransportePackage.eNS_URI) : TransportePackage.eINSTANCE);
		PersonaPackageImpl thePersonaPackage = (PersonaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersonaPackage.eNS_URI) instanceof PersonaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersonaPackage.eNS_URI) : PersonaPackage.eINSTANCE);
		ProductoPackageImpl theProductoPackage = (ProductoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI) instanceof ProductoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI) : ProductoPackage.eINSTANCE);
		EnvioPackageImpl theEnvioPackage = (EnvioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI) instanceof EnvioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI) : EnvioPackage.eINSTANCE);
		RutaPackageImpl theRutaPackage = (RutaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI) instanceof RutaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI) : RutaPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theDomainPackage.createPackageContents();
		thedenPackage.createPackageContents();
		theUbicacionPackage.createPackageContents();
		thePedidoPackage.createPackageContents();
		theTransportePackage.createPackageContents();
		thePersonaPackage.createPackageContents();
		theProductoPackage.createPackageContents();
		theEnvioPackage.createPackageContents();
		theRutaPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();
		thedenPackage.initializePackageContents();
		theUbicacionPackage.initializePackageContents();
		thePedidoPackage.initializePackageContents();
		theTransportePackage.initializePackageContents();
		thePersonaPackage.initializePackageContents();
		theProductoPackage.initializePackageContents();
		theEnvioPackage.initializePackageContents();
		theRutaPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheModelFactory() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_LstFactoryUbicacion() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_LstFactoryPedido() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_LstFactoryTransporte() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_LstFactoryPersona() {
		return (EReference)domainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_LstFactoryProducto() {
		return (EReference)domainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_LstFactoryEnvio() {
		return (EReference)domainEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_LstFactoryRuta() {
		return (EReference)domainEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheUI() {
		return (EReference)domainEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__THE_MODEL_FACTORY);
		createEReference(domainEClass, DOMAIN__LST_FACTORY_UBICACION);
		createEReference(domainEClass, DOMAIN__LST_FACTORY_PEDIDO);
		createEReference(domainEClass, DOMAIN__LST_FACTORY_TRANSPORTE);
		createEReference(domainEClass, DOMAIN__LST_FACTORY_PERSONA);
		createEReference(domainEClass, DOMAIN__LST_FACTORY_PRODUCTO);
		createEReference(domainEClass, DOMAIN__LST_FACTORY_ENVIO);
		createEReference(domainEClass, DOMAIN__LST_FACTORY_RUTA);
		createEReference(domainEClass, DOMAIN__THE_UI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UbicacionPackage theUbicacionPackage = (UbicacionPackage)EPackage.Registry.INSTANCE.getEPackage(UbicacionPackage.eNS_URI);
		PedidoPackage thePedidoPackage = (PedidoPackage)EPackage.Registry.INSTANCE.getEPackage(PedidoPackage.eNS_URI);
		TransportePackage theTransportePackage = (TransportePackage)EPackage.Registry.INSTANCE.getEPackage(TransportePackage.eNS_URI);
		PersonaPackage thePersonaPackage = (PersonaPackage)EPackage.Registry.INSTANCE.getEPackage(PersonaPackage.eNS_URI);
		ProductoPackage theProductoPackage = (ProductoPackage)EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI);
		EnvioPackage theEnvioPackage = (EnvioPackage)EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI);
		RutaPackage theRutaPackage = (RutaPackage)EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI);
		denPackage thedenPackage = (denPackage)EPackage.Registry.INSTANCE.getEPackage(denPackage.eNS_URI);
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theUbicacionPackage);
		getESubpackages().add(thePedidoPackage);
		getESubpackages().add(theTransportePackage);
		getESubpackages().add(thePersonaPackage);
		getESubpackages().add(theProductoPackage);
		getESubpackages().add(theEnvioPackage);
		getESubpackages().add(theRutaPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_TheModelFactory(), thedenPackage.getModelFactory(), thedenPackage.getModelFactory_TheDomain(), "theModelFactory", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_LstFactoryUbicacion(), theUbicacionPackage.getFactoryUbicacion(), theUbicacionPackage.getFactoryUbicacion_OwenedByDomain(), "lstFactoryUbicacion", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_LstFactoryPedido(), thePedidoPackage.getFactoryPedido(), thePedidoPackage.getFactoryPedido_OwenedByDomain(), "lstFactoryPedido", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_LstFactoryTransporte(), theTransportePackage.getFactoryTransporte(), theTransportePackage.getFactoryTransporte_OwenedByDomain(), "lstFactoryTransporte", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_LstFactoryPersona(), thePersonaPackage.getFactoryPersona(), thePersonaPackage.getFactoryPersona_OwenedByDomain(), "lstFactoryPersona", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_LstFactoryProducto(), theProductoPackage.getFactoryProducto(), theProductoPackage.getFactoryProducto_OwenedByDomain(), "lstFactoryProducto", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_LstFactoryEnvio(), theEnvioPackage.getFactoryEnvio(), theEnvioPackage.getFactoryEnvio_OwenedByDomain(), "lstFactoryEnvio", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_LstFactoryRuta(), theRutaPackage.getFactoryRuta(), theRutaPackage.getFactoryRuta_OwenedByDomain(), "lstFactoryRuta", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_TheUI(), theUiPackage.getUI(), theUiPackage.getUI_TheDomain(), "theUI", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(domainEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //DomainPackageImpl
