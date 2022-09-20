/**
 */
package den.domain.pedido.impl;

import den.denPackage;

import den.domain.DomainPackage;

import den.domain.envio.EnvioPackage;

import den.domain.envio.impl.EnvioPackageImpl;

import den.domain.impl.DomainPackageImpl;

import den.domain.pedido.DetallePedido;
import den.domain.pedido.FactoryPedido;
import den.domain.pedido.Pedido;
import den.domain.pedido.PedidoFactory;
import den.domain.pedido.PedidoPackage;

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
public class PedidoPackageImpl extends EPackageImpl implements PedidoPackage {
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
	private EClass factoryPedidoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pedidoEClass = null;

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
	 * @see den.domain.pedido.PedidoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PedidoPackageImpl() {
		super(eNS_URI, PedidoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PedidoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PedidoPackage init() {
		if (isInited) return (PedidoPackage)EPackage.Registry.INSTANCE.getEPackage(PedidoPackage.eNS_URI);

		// Obtain or create and register package
		PedidoPackageImpl thePedidoPackage = (PedidoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PedidoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PedidoPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		denPackageImpl thedenPackage = (denPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(denPackage.eNS_URI) instanceof denPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(denPackage.eNS_URI) : denPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		UbicacionPackageImpl theUbicacionPackage = (UbicacionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UbicacionPackage.eNS_URI) instanceof UbicacionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UbicacionPackage.eNS_URI) : UbicacionPackage.eINSTANCE);
		TransportePackageImpl theTransportePackage = (TransportePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransportePackage.eNS_URI) instanceof TransportePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransportePackage.eNS_URI) : TransportePackage.eINSTANCE);
		PersonaPackageImpl thePersonaPackage = (PersonaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersonaPackage.eNS_URI) instanceof PersonaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersonaPackage.eNS_URI) : PersonaPackage.eINSTANCE);
		ProductoPackageImpl theProductoPackage = (ProductoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI) instanceof ProductoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI) : ProductoPackage.eINSTANCE);
		EnvioPackageImpl theEnvioPackage = (EnvioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI) instanceof EnvioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI) : EnvioPackage.eINSTANCE);
		RutaPackageImpl theRutaPackage = (RutaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI) instanceof RutaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI) : RutaPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		thePedidoPackage.createPackageContents();
		thedenPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theUbicacionPackage.createPackageContents();
		theTransportePackage.createPackageContents();
		thePersonaPackage.createPackageContents();
		theProductoPackage.createPackageContents();
		theEnvioPackage.createPackageContents();
		theRutaPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		thePedidoPackage.initializePackageContents();
		thedenPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theUbicacionPackage.initializePackageContents();
		theTransportePackage.initializePackageContents();
		thePersonaPackage.initializePackageContents();
		theProductoPackage.initializePackageContents();
		theEnvioPackage.initializePackageContents();
		theRutaPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePedidoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PedidoPackage.eNS_URI, thePedidoPackage);
		return thePedidoPackage;
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
	public EAttribute getDetallePedido_IdPedido() {
		return (EAttribute)detallePedidoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallePedido_Descripcion() {
		return (EAttribute)detallePedidoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallePedido_ValorUnitario() {
		return (EAttribute)detallePedidoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallePedido_ValorTotal() {
		return (EAttribute)detallePedidoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallePedido_Iva() {
		return (EAttribute)detallePedidoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallePedido_TotalPagar() {
		return (EAttribute)detallePedidoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallePedido_CantidadKilos() {
		return (EAttribute)detallePedidoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetallePedido_OwenedByPedido() {
		return (EReference)detallePedidoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetallePedido_LstProducto() {
		return (EReference)detallePedidoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactoryPedido() {
		return factoryPedidoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactoryPedido_IdPedido() {
		return (EAttribute)factoryPedidoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryPedido_OwenedByDomain() {
		return (EReference)factoryPedidoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryPedido_LstPedido() {
		return (EReference)factoryPedidoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPedido() {
		return pedidoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPedido_Id() {
		return (EAttribute)pedidoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPedido_Fecha() {
		return (EAttribute)pedidoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPedido_Total() {
		return (EAttribute)pedidoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPedido_SubTotal() {
		return (EAttribute)pedidoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPedido_Iva() {
		return (EAttribute)pedidoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPedido_Descuento() {
		return (EAttribute)pedidoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPedido_LstDetallePedido() {
		return (EReference)pedidoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPedido_OwenedByFactoryPedido() {
		return (EReference)pedidoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPedido_LstPersona() {
		return (EReference)pedidoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPedido_TheEnvio() {
		return (EReference)pedidoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedidoFactory getPedidoFactory() {
		return (PedidoFactory)getEFactoryInstance();
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
		createEAttribute(detallePedidoEClass, DETALLE_PEDIDO__ID_PEDIDO);
		createEAttribute(detallePedidoEClass, DETALLE_PEDIDO__DESCRIPCION);
		createEAttribute(detallePedidoEClass, DETALLE_PEDIDO__VALOR_UNITARIO);
		createEAttribute(detallePedidoEClass, DETALLE_PEDIDO__VALOR_TOTAL);
		createEAttribute(detallePedidoEClass, DETALLE_PEDIDO__IVA);
		createEAttribute(detallePedidoEClass, DETALLE_PEDIDO__TOTAL_PAGAR);
		createEAttribute(detallePedidoEClass, DETALLE_PEDIDO__CANTIDAD_KILOS);
		createEReference(detallePedidoEClass, DETALLE_PEDIDO__OWENED_BY_PEDIDO);
		createEReference(detallePedidoEClass, DETALLE_PEDIDO__LST_PRODUCTO);

		factoryPedidoEClass = createEClass(FACTORY_PEDIDO);
		createEAttribute(factoryPedidoEClass, FACTORY_PEDIDO__ID_PEDIDO);
		createEReference(factoryPedidoEClass, FACTORY_PEDIDO__OWENED_BY_DOMAIN);
		createEReference(factoryPedidoEClass, FACTORY_PEDIDO__LST_PEDIDO);

		pedidoEClass = createEClass(PEDIDO);
		createEAttribute(pedidoEClass, PEDIDO__ID);
		createEAttribute(pedidoEClass, PEDIDO__FECHA);
		createEAttribute(pedidoEClass, PEDIDO__TOTAL);
		createEAttribute(pedidoEClass, PEDIDO__SUB_TOTAL);
		createEAttribute(pedidoEClass, PEDIDO__IVA);
		createEAttribute(pedidoEClass, PEDIDO__DESCUENTO);
		createEReference(pedidoEClass, PEDIDO__LST_DETALLE_PEDIDO);
		createEReference(pedidoEClass, PEDIDO__OWENED_BY_FACTORY_PEDIDO);
		createEReference(pedidoEClass, PEDIDO__LST_PERSONA);
		createEReference(pedidoEClass, PEDIDO__THE_ENVIO);
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
		ProductoPackage theProductoPackage = (ProductoPackage)EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		PersonaPackage thePersonaPackage = (PersonaPackage)EPackage.Registry.INSTANCE.getEPackage(PersonaPackage.eNS_URI);
		EnvioPackage theEnvioPackage = (EnvioPackage)EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(detallePedidoEClass, DetallePedido.class, "DetallePedido", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetallePedido_IdPedido(), thedenPackage.getString(), "idPedido", " ", 0, 1, DetallePedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetallePedido_Descripcion(), thedenPackage.getString(), "descripcion", " ", 0, 1, DetallePedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetallePedido_ValorUnitario(), thedenPackage.getString(), "valorUnitario", " ", 0, 1, DetallePedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetallePedido_ValorTotal(), thedenPackage.getString(), "valorTotal", " ", 0, 1, DetallePedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetallePedido_Iva(), thedenPackage.getString(), "iva", " ", 0, 1, DetallePedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetallePedido_TotalPagar(), thedenPackage.getString(), "totalPagar", " ", 0, 1, DetallePedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetallePedido_CantidadKilos(), thedenPackage.getString(), "cantidadKilos", " ", 0, 1, DetallePedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetallePedido_OwenedByPedido(), this.getPedido(), this.getPedido_LstDetallePedido(), "owenedByPedido", null, 0, 1, DetallePedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetallePedido_LstProducto(), theProductoPackage.getProducto(), theProductoPackage.getProducto_LstDetallePedido(), "lstProducto", null, 0, -1, DetallePedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factoryPedidoEClass, FactoryPedido.class, "FactoryPedido", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactoryPedido_IdPedido(), thedenPackage.getString(), "idPedido", " ", 0, 1, FactoryPedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryPedido_OwenedByDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_LstFactoryPedido(), "owenedByDomain", null, 0, 1, FactoryPedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryPedido_LstPedido(), this.getPedido(), this.getPedido_OwenedByFactoryPedido(), "lstPedido", null, 0, -1, FactoryPedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pedidoEClass, Pedido.class, "Pedido", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPedido_Id(), thedenPackage.getString(), "id", " ", 0, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPedido_Fecha(), thedenPackage.getString(), "fecha", " ", 0, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPedido_Total(), thedenPackage.getString(), "total", " ", 0, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPedido_SubTotal(), thedenPackage.getString(), "subTotal", " ", 0, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPedido_Iva(), thedenPackage.getString(), "iva", " ", 0, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPedido_Descuento(), thedenPackage.getString(), "descuento", " ", 0, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPedido_LstDetallePedido(), this.getDetallePedido(), this.getDetallePedido_OwenedByPedido(), "lstDetallePedido", null, 0, -1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPedido_OwenedByFactoryPedido(), this.getFactoryPedido(), this.getFactoryPedido_LstPedido(), "owenedByFactoryPedido", null, 0, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPedido_LstPersona(), thePersonaPackage.getPersona(), thePersonaPackage.getPersona_LstPedido(), "lstPersona", null, 0, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPedido_TheEnvio(), theEnvioPackage.getEnvio(), theEnvioPackage.getEnvio_LstPedido(), "theEnvio", null, 0, 1, Pedido.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PedidoPackageImpl
