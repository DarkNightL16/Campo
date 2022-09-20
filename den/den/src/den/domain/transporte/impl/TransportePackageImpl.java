/**
 */
package den.domain.transporte.impl;

import den.denPackage;

import den.domain.DomainPackage;

import den.domain.envio.EnvioPackage;

import den.domain.envio.impl.EnvioPackageImpl;

import den.domain.impl.DomainPackageImpl;

import den.domain.pedido.PedidoPackage;

import den.domain.pedido.impl.PedidoPackageImpl;

import den.domain.persona.PersonaPackage;

import den.domain.persona.impl.PersonaPackageImpl;

import den.domain.producto.ProductoPackage;

import den.domain.producto.impl.ProductoPackageImpl;

import den.domain.ruta.RutaPackage;

import den.domain.ruta.impl.RutaPackageImpl;

import den.domain.transporte.FactoryTransporte;
import den.domain.transporte.Transporte;
import den.domain.transporte.TransporteFactory;
import den.domain.transporte.TransportePackage;

import den.domain.ubicacion.UbicacionPackage;

import den.domain.ubicacion.impl.UbicacionPackageImpl;

import den.impl.denPackageImpl;

import den.ui.UiPackage;

import den.ui.impl.UiPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class TransportePackageImpl extends EPackageImpl implements TransportePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryTransporteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transporteEClass = null;

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
	 * @see den.domain.transporte.TransportePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransportePackageImpl() {
		super(eNS_URI, TransporteFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TransportePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TransportePackage init() {
		if (isInited) return (TransportePackage)EPackage.Registry.INSTANCE.getEPackage(TransportePackage.eNS_URI);

		// Obtain or create and register package
		TransportePackageImpl theTransportePackage = (TransportePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TransportePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TransportePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		denPackageImpl thedenPackage = (denPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(denPackage.eNS_URI) instanceof denPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(denPackage.eNS_URI) : denPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		UbicacionPackageImpl theUbicacionPackage = (UbicacionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UbicacionPackage.eNS_URI) instanceof UbicacionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UbicacionPackage.eNS_URI) : UbicacionPackage.eINSTANCE);
		PedidoPackageImpl thePedidoPackage = (PedidoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PedidoPackage.eNS_URI) instanceof PedidoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PedidoPackage.eNS_URI) : PedidoPackage.eINSTANCE);
		PersonaPackageImpl thePersonaPackage = (PersonaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersonaPackage.eNS_URI) instanceof PersonaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersonaPackage.eNS_URI) : PersonaPackage.eINSTANCE);
		ProductoPackageImpl theProductoPackage = (ProductoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI) instanceof ProductoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI) : ProductoPackage.eINSTANCE);
		EnvioPackageImpl theEnvioPackage = (EnvioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI) instanceof EnvioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI) : EnvioPackage.eINSTANCE);
		RutaPackageImpl theRutaPackage = (RutaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI) instanceof RutaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI) : RutaPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theTransportePackage.createPackageContents();
		thedenPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theUbicacionPackage.createPackageContents();
		thePedidoPackage.createPackageContents();
		thePersonaPackage.createPackageContents();
		theProductoPackage.createPackageContents();
		theEnvioPackage.createPackageContents();
		theRutaPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theTransportePackage.initializePackageContents();
		thedenPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theUbicacionPackage.initializePackageContents();
		thePedidoPackage.initializePackageContents();
		thePersonaPackage.initializePackageContents();
		theProductoPackage.initializePackageContents();
		theEnvioPackage.initializePackageContents();
		theRutaPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTransportePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TransportePackage.eNS_URI, theTransportePackage);
		return theTransportePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactoryTransporte() {
		return factoryTransporteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactoryTransporte_IdTransporte() {
		return (EAttribute)factoryTransporteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryTransporte_OwenedByDomain() {
		return (EReference)factoryTransporteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryTransporte_LstTransporte() {
		return (EReference)factoryTransporteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransporte() {
		return transporteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransporte_Id() {
		return (EAttribute)transporteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransporte_Marca() {
		return (EAttribute)transporteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransporte_NumeroPoliza() {
		return (EAttribute)transporteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransporte_Matricula() {
		return (EAttribute)transporteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransporte_TarjetaPropiedad() {
		return (EAttribute)transporteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransporte_OwenedByFactoryTransporte() {
		return (EReference)transporteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransporte_LstProducto() {
		return (EReference)transporteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransporte_LstEnvio() {
		return (EReference)transporteEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransporte_LstConductor() {
		return (EReference)transporteEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransporte_LstPersona() {
		return (EReference)transporteEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransporteFactory getTransporteFactory() {
		return (TransporteFactory)getEFactoryInstance();
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
		factoryTransporteEClass = createEClass(FACTORY_TRANSPORTE);
		createEAttribute(factoryTransporteEClass, FACTORY_TRANSPORTE__ID_TRANSPORTE);
		createEReference(factoryTransporteEClass, FACTORY_TRANSPORTE__OWENED_BY_DOMAIN);
		createEReference(factoryTransporteEClass, FACTORY_TRANSPORTE__LST_TRANSPORTE);

		transporteEClass = createEClass(TRANSPORTE);
		createEAttribute(transporteEClass, TRANSPORTE__ID);
		createEAttribute(transporteEClass, TRANSPORTE__MARCA);
		createEAttribute(transporteEClass, TRANSPORTE__NUMERO_POLIZA);
		createEAttribute(transporteEClass, TRANSPORTE__MATRICULA);
		createEAttribute(transporteEClass, TRANSPORTE__TARJETA_PROPIEDAD);
		createEReference(transporteEClass, TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE);
		createEReference(transporteEClass, TRANSPORTE__LST_PRODUCTO);
		createEReference(transporteEClass, TRANSPORTE__LST_ENVIO);
		createEReference(transporteEClass, TRANSPORTE__LST_CONDUCTOR);
		createEReference(transporteEClass, TRANSPORTE__LST_PERSONA);
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
		denPackage thedenPackage = (denPackage)EPackage.Registry.INSTANCE.getEPackage(denPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		ProductoPackage theProductoPackage = (ProductoPackage)EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI);
		EnvioPackage theEnvioPackage = (EnvioPackage)EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI);
		PersonaPackage thePersonaPackage = (PersonaPackage)EPackage.Registry.INSTANCE.getEPackage(PersonaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(factoryTransporteEClass, FactoryTransporte.class, "FactoryTransporte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactoryTransporte_IdTransporte(), thedenPackage.getString(), "idTransporte", " ", 0, 1, FactoryTransporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryTransporte_OwenedByDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_LstFactoryTransporte(), "owenedByDomain", null, 0, 1, FactoryTransporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryTransporte_LstTransporte(), this.getTransporte(), this.getTransporte_OwenedByFactoryTransporte(), "lstTransporte", null, 0, -1, FactoryTransporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transporteEClass, Transporte.class, "Transporte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransporte_Id(), thedenPackage.getString(), "id", " ", 0, 1, Transporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransporte_Marca(), thedenPackage.getString(), "marca", " ", 0, 1, Transporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransporte_NumeroPoliza(), thedenPackage.getString(), "numeroPoliza", " ", 0, 1, Transporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransporte_Matricula(), thedenPackage.getString(), "matricula", " ", 0, 1, Transporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransporte_TarjetaPropiedad(), thedenPackage.getString(), "tarjetaPropiedad", " ", 0, 1, Transporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransporte_OwenedByFactoryTransporte(), this.getFactoryTransporte(), this.getFactoryTransporte_LstTransporte(), "owenedByFactoryTransporte", null, 0, 1, Transporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransporte_LstProducto(), theProductoPackage.getProducto(), theProductoPackage.getProducto_LstTransporte(), "lstProducto", null, 0, -1, Transporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransporte_LstEnvio(), theEnvioPackage.getEnvio(), theEnvioPackage.getEnvio_LstTransporte(), "lstEnvio", null, 0, 1, Transporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransporte_LstConductor(), thePersonaPackage.getConductor(), thePersonaPackage.getConductor_LstTransporte(), "lstConductor", null, 0, 1, Transporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransporte_LstPersona(), thePersonaPackage.getPersona(), thePersonaPackage.getPersona_LstTransporte(), "lstPersona", null, 0, 1, Transporte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TransportePackageImpl
