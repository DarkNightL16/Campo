/**
 */
package den.domain.envio.impl;

import den.denPackage;

import den.domain.DomainPackage;

import den.domain.envio.DetallePedido;
import den.domain.envio.Envio;
import den.domain.envio.EnvioFactory;
import den.domain.envio.EnvioPackage;
import den.domain.envio.FactoryEnvio;

import den.domain.impl.DomainPackageImpl;

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
public class EnvioPackageImpl extends EPackageImpl implements EnvioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detallePedidoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryEnvioEClass = null;

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
	 * @see den.domain.envio.EnvioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnvioPackageImpl() {
		super(eNS_URI, EnvioFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnvioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnvioPackage init() {
		if (isInited) return (EnvioPackage)EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI);

		// Obtain or create and register package
		EnvioPackageImpl theEnvioPackage = (EnvioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnvioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EnvioPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		denPackageImpl thedenPackage = (denPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(denPackage.eNS_URI) instanceof denPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(denPackage.eNS_URI) : denPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		UbicacionPackageImpl theUbicacionPackage = (UbicacionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UbicacionPackage.eNS_URI) instanceof UbicacionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UbicacionPackage.eNS_URI) : UbicacionPackage.eINSTANCE);
		PedidoPackageImpl thePedidoPackage = (PedidoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PedidoPackage.eNS_URI) instanceof PedidoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PedidoPackage.eNS_URI) : PedidoPackage.eINSTANCE);
		TransportePackageImpl theTransportePackage = (TransportePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransportePackage.eNS_URI) instanceof TransportePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransportePackage.eNS_URI) : TransportePackage.eINSTANCE);
		PersonaPackageImpl thePersonaPackage = (PersonaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersonaPackage.eNS_URI) instanceof PersonaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersonaPackage.eNS_URI) : PersonaPackage.eINSTANCE);
		ProductoPackageImpl theProductoPackage = (ProductoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI) instanceof ProductoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI) : ProductoPackage.eINSTANCE);
		RutaPackageImpl theRutaPackage = (RutaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI) instanceof RutaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI) : RutaPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theEnvioPackage.createPackageContents();
		thedenPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theUbicacionPackage.createPackageContents();
		thePedidoPackage.createPackageContents();
		theTransportePackage.createPackageContents();
		thePersonaPackage.createPackageContents();
		theProductoPackage.createPackageContents();
		theRutaPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theEnvioPackage.initializePackageContents();
		thedenPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theUbicacionPackage.initializePackageContents();
		thePedidoPackage.initializePackageContents();
		theTransportePackage.initializePackageContents();
		thePersonaPackage.initializePackageContents();
		theProductoPackage.initializePackageContents();
		theRutaPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnvioPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnvioPackage.eNS_URI, theEnvioPackage);
		return theEnvioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetallePedido() {
		return detallePedidoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallePedido_Id() {
		return (EAttribute)detallePedidoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallePedido_Cantidad() {
		return (EAttribute)detallePedidoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallePedido_Descripcion() {
		return (EAttribute)detallePedidoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallePedido_ValorUnitario() {
		return (EAttribute)detallePedidoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetallePedido_OwenedByEnvio() {
		return (EReference)detallePedidoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvio() {
		return envioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvio_TheCiudadOrigen() {
		return (EReference)envioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvio_LstTransporte() {
		return (EReference)envioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvio_LstDetallePedido() {
		return (EReference)envioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvio_Id() {
		return (EAttribute)envioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvio_NitEmpresa() {
		return (EAttribute)envioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvio_DireccionEmpresa() {
		return (EAttribute)envioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvio_IdFactura() {
		return (EAttribute)envioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvio_FechaEnvio() {
		return (EAttribute)envioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvio_FechaVencimiento() {
		return (EAttribute)envioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvio_TheCiudadDestino() {
		return (EReference)envioEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvio_LstPedido() {
		return (EReference)envioEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvio_OwenedByFactoryEnvio() {
		return (EReference)envioEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvio_LstRuta() {
		return (EReference)envioEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactoryEnvio() {
		return factoryEnvioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryEnvio_LstEnvio() {
		return (EReference)factoryEnvioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactoryEnvio_IdEnvio() {
		return (EAttribute)factoryEnvioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryEnvio_OwenedByDomain() {
		return (EReference)factoryEnvioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvioFactory getEnvioFactory() {
		return (EnvioFactory)getEFactoryInstance();
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
		detallePedidoEClass = createEClass(DETALLE_PEDIDO);
		createEAttribute(detallePedidoEClass, DETALLE_PEDIDO__ID);
		createEAttribute(detallePedidoEClass, DETALLE_PEDIDO__CANTIDAD);
		createEAttribute(detallePedidoEClass, DETALLE_PEDIDO__DESCRIPCION);
		createEAttribute(detallePedidoEClass, DETALLE_PEDIDO__VALOR_UNITARIO);
		createEReference(detallePedidoEClass, DETALLE_PEDIDO__OWENED_BY_ENVIO);

		envioEClass = createEClass(ENVIO);
		createEReference(envioEClass, ENVIO__THE_CIUDAD_ORIGEN);
		createEReference(envioEClass, ENVIO__LST_TRANSPORTE);
		createEReference(envioEClass, ENVIO__LST_DETALLE_PEDIDO);
		createEAttribute(envioEClass, ENVIO__ID);
		createEAttribute(envioEClass, ENVIO__NIT_EMPRESA);
		createEAttribute(envioEClass, ENVIO__DIRECCION_EMPRESA);
		createEAttribute(envioEClass, ENVIO__ID_FACTURA);
		createEAttribute(envioEClass, ENVIO__FECHA_ENVIO);
		createEAttribute(envioEClass, ENVIO__FECHA_VENCIMIENTO);
		createEReference(envioEClass, ENVIO__THE_CIUDAD_DESTINO);
		createEReference(envioEClass, ENVIO__LST_PEDIDO);
		createEReference(envioEClass, ENVIO__OWENED_BY_FACTORY_ENVIO);
		createEReference(envioEClass, ENVIO__LST_RUTA);

		factoryEnvioEClass = createEClass(FACTORY_ENVIO);
		createEReference(factoryEnvioEClass, FACTORY_ENVIO__LST_ENVIO);
		createEAttribute(factoryEnvioEClass, FACTORY_ENVIO__ID_ENVIO);
		createEReference(factoryEnvioEClass, FACTORY_ENVIO__OWENED_BY_DOMAIN);
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
		UbicacionPackage theUbicacionPackage = (UbicacionPackage)EPackage.Registry.INSTANCE.getEPackage(UbicacionPackage.eNS_URI);
		TransportePackage theTransportePackage = (TransportePackage)EPackage.Registry.INSTANCE.getEPackage(TransportePackage.eNS_URI);
		PedidoPackage thePedidoPackage = (PedidoPackage)EPackage.Registry.INSTANCE.getEPackage(PedidoPackage.eNS_URI);
		RutaPackage theRutaPackage = (RutaPackage)EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(detallePedidoEClass, DetallePedido.class, "DetallePedido", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetallePedido_Id(), thedenPackage.getString(), "id", " ", 0, 1, DetallePedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetallePedido_Cantidad(), thedenPackage.getString(), "cantidad", " ", 0, 1, DetallePedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetallePedido_Descripcion(), thedenPackage.getString(), "descripcion", " ", 0, 1, DetallePedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetallePedido_ValorUnitario(), thedenPackage.getString(), "valorUnitario", " ", 0, 1, DetallePedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetallePedido_OwenedByEnvio(), this.getEnvio(), this.getEnvio_LstDetallePedido(), "owenedByEnvio", null, 0, 1, DetallePedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envioEClass, Envio.class, "Envio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvio_TheCiudadOrigen(), theUbicacionPackage.getCiudad(), theUbicacionPackage.getCiudad_TheEnvioOrigen(), "theCiudadOrigen", null, 0, 1, Envio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvio_LstTransporte(), theTransportePackage.getTransporte(), theTransportePackage.getTransporte_LstEnvio(), "lstTransporte", null, 0, 1, Envio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvio_LstDetallePedido(), this.getDetallePedido(), this.getDetallePedido_OwenedByEnvio(), "lstDetallePedido", null, 0, 1, Envio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvio_Id(), thedenPackage.getString(), "id", " ", 0, 1, Envio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvio_NitEmpresa(), thedenPackage.getString(), "nitEmpresa", " ", 0, 1, Envio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvio_DireccionEmpresa(), thedenPackage.getString(), "direccionEmpresa", " ", 0, 1, Envio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvio_IdFactura(), thedenPackage.getString(), "idFactura", " ", 0, 1, Envio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvio_FechaEnvio(), thedenPackage.getString(), "fechaEnvio", " ", 0, 1, Envio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvio_FechaVencimiento(), thedenPackage.getString(), "fechaVencimiento", " ", 0, 1, Envio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvio_TheCiudadDestino(), theUbicacionPackage.getCiudad(), theUbicacionPackage.getCiudad_TheEnvioDestino(), "theCiudadDestino", null, 0, 1, Envio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvio_LstPedido(), thePedidoPackage.getPedido(), thePedidoPackage.getPedido_TheEnvio(), "lstPedido", null, 0, 1, Envio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvio_OwenedByFactoryEnvio(), this.getFactoryEnvio(), this.getFactoryEnvio_LstEnvio(), "owenedByFactoryEnvio", null, 0, 1, Envio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvio_LstRuta(), theRutaPackage.getRuta(), theRutaPackage.getRuta_LstEnvio(), "lstRuta", null, 0, 1, Envio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factoryEnvioEClass, FactoryEnvio.class, "FactoryEnvio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactoryEnvio_LstEnvio(), this.getEnvio(), this.getEnvio_OwenedByFactoryEnvio(), "lstEnvio", null, 0, -1, FactoryEnvio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactoryEnvio_IdEnvio(), thedenPackage.getString(), "idEnvio", " ", 0, 1, FactoryEnvio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryEnvio_OwenedByDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_LstFactoryEnvio(), "owenedByDomain", null, 0, 1, FactoryEnvio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //EnvioPackageImpl
