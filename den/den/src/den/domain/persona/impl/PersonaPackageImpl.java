/**
 */
package den.domain.persona.impl;

import den.denPackage;

import den.domain.DomainPackage;

import den.domain.envio.EnvioPackage;

import den.domain.envio.impl.EnvioPackageImpl;

import den.domain.impl.DomainPackageImpl;

import den.domain.pedido.PedidoPackage;

import den.domain.pedido.impl.PedidoPackageImpl;

import den.domain.persona.Cliente;
import den.domain.persona.Conductor;
import den.domain.persona.Empleado;
import den.domain.persona.FactoryPersona;
import den.domain.persona.Persona;
import den.domain.persona.PersonaFactory;
import den.domain.persona.PersonaPackage;

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
public class PersonaPackageImpl extends EPackageImpl implements PersonaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clienteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conductorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empleadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryPersonaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personaEClass = null;

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
	 * @see den.domain.persona.PersonaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PersonaPackageImpl() {
		super(eNS_URI, PersonaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PersonaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PersonaPackage init() {
		if (isInited) return (PersonaPackage)EPackage.Registry.INSTANCE.getEPackage(PersonaPackage.eNS_URI);

		// Obtain or create and register package
		PersonaPackageImpl thePersonaPackage = (PersonaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PersonaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PersonaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		denPackageImpl thedenPackage = (denPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(denPackage.eNS_URI) instanceof denPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(denPackage.eNS_URI) : denPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		UbicacionPackageImpl theUbicacionPackage = (UbicacionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UbicacionPackage.eNS_URI) instanceof UbicacionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UbicacionPackage.eNS_URI) : UbicacionPackage.eINSTANCE);
		PedidoPackageImpl thePedidoPackage = (PedidoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PedidoPackage.eNS_URI) instanceof PedidoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PedidoPackage.eNS_URI) : PedidoPackage.eINSTANCE);
		TransportePackageImpl theTransportePackage = (TransportePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransportePackage.eNS_URI) instanceof TransportePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransportePackage.eNS_URI) : TransportePackage.eINSTANCE);
		ProductoPackageImpl theProductoPackage = (ProductoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI) instanceof ProductoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI) : ProductoPackage.eINSTANCE);
		EnvioPackageImpl theEnvioPackage = (EnvioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI) instanceof EnvioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI) : EnvioPackage.eINSTANCE);
		RutaPackageImpl theRutaPackage = (RutaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI) instanceof RutaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI) : RutaPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		thePersonaPackage.createPackageContents();
		thedenPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theUbicacionPackage.createPackageContents();
		thePedidoPackage.createPackageContents();
		theTransportePackage.createPackageContents();
		theProductoPackage.createPackageContents();
		theEnvioPackage.createPackageContents();
		theRutaPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		thePersonaPackage.initializePackageContents();
		thedenPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theUbicacionPackage.initializePackageContents();
		thePedidoPackage.initializePackageContents();
		theTransportePackage.initializePackageContents();
		theProductoPackage.initializePackageContents();
		theEnvioPackage.initializePackageContents();
		theRutaPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePersonaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PersonaPackage.eNS_URI, thePersonaPackage);
		return thePersonaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCliente() {
		return clienteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_IdCliente() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCliente_Estado() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCliente_OwenedByPersona() {
		return (EReference)clienteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConductor() {
		return conductorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConductor_LstTransporte() {
		return (EReference)conductorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_IdConductor() {
		return (EAttribute)conductorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_CategoriaLicencia() {
		return (EAttribute)conductorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_CodigoLicencia() {
		return (EAttribute)conductorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConductor_OwenedByPersona() {
		return (EReference)conductorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmpleado() {
		return empleadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_IdEmpleado() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_FechaInicioContrato() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_FechaTerminacionContrato() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_Cargo() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_Descripcion() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmpleado_Salario() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmpleado_OwenedByPersona() {
		return (EReference)empleadoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactoryPersona() {
		return factoryPersonaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactoryPersona_IdPersona() {
		return (EAttribute)factoryPersonaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryPersona_OwenedByDomain() {
		return (EReference)factoryPersonaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryPersona_LstPersona() {
		return (EReference)factoryPersonaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersona() {
		return personaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersona_LstCliente() {
		return (EReference)personaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersona_LstConductor() {
		return (EReference)personaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersona_LstEmpleado() {
		return (EReference)personaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_IdPersona() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_NumeroDocumento() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_TipoDocumento() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_Edad() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_FechaNacimiento() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_Genero() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_DireccionResidencia() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_Email() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_Telefono() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersona_LugarResidencia() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersona_LstPedido() {
		return (EReference)personaEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersona_LstTransporte() {
		return (EReference)personaEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersona_OwenedByFactoryPersona() {
		return (EReference)personaEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonaFactory getPersonaFactory() {
		return (PersonaFactory)getEFactoryInstance();
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
		clienteEClass = createEClass(CLIENTE);
		createEAttribute(clienteEClass, CLIENTE__ID_CLIENTE);
		createEAttribute(clienteEClass, CLIENTE__ESTADO);
		createEReference(clienteEClass, CLIENTE__OWENED_BY_PERSONA);

		conductorEClass = createEClass(CONDUCTOR);
		createEReference(conductorEClass, CONDUCTOR__LST_TRANSPORTE);
		createEAttribute(conductorEClass, CONDUCTOR__ID_CONDUCTOR);
		createEAttribute(conductorEClass, CONDUCTOR__CATEGORIA_LICENCIA);
		createEAttribute(conductorEClass, CONDUCTOR__CODIGO_LICENCIA);
		createEReference(conductorEClass, CONDUCTOR__OWENED_BY_PERSONA);

		empleadoEClass = createEClass(EMPLEADO);
		createEAttribute(empleadoEClass, EMPLEADO__ID_EMPLEADO);
		createEAttribute(empleadoEClass, EMPLEADO__FECHA_INICIO_CONTRATO);
		createEAttribute(empleadoEClass, EMPLEADO__FECHA_TERMINACION_CONTRATO);
		createEAttribute(empleadoEClass, EMPLEADO__CARGO);
		createEAttribute(empleadoEClass, EMPLEADO__DESCRIPCION);
		createEAttribute(empleadoEClass, EMPLEADO__SALARIO);
		createEReference(empleadoEClass, EMPLEADO__OWENED_BY_PERSONA);

		factoryPersonaEClass = createEClass(FACTORY_PERSONA);
		createEAttribute(factoryPersonaEClass, FACTORY_PERSONA__ID_PERSONA);
		createEReference(factoryPersonaEClass, FACTORY_PERSONA__OWENED_BY_DOMAIN);
		createEReference(factoryPersonaEClass, FACTORY_PERSONA__LST_PERSONA);

		personaEClass = createEClass(PERSONA);
		createEReference(personaEClass, PERSONA__LST_CLIENTE);
		createEReference(personaEClass, PERSONA__LST_CONDUCTOR);
		createEReference(personaEClass, PERSONA__LST_EMPLEADO);
		createEAttribute(personaEClass, PERSONA__ID_PERSONA);
		createEAttribute(personaEClass, PERSONA__NUMERO_DOCUMENTO);
		createEAttribute(personaEClass, PERSONA__TIPO_DOCUMENTO);
		createEAttribute(personaEClass, PERSONA__EDAD);
		createEAttribute(personaEClass, PERSONA__FECHA_NACIMIENTO);
		createEAttribute(personaEClass, PERSONA__GENERO);
		createEAttribute(personaEClass, PERSONA__DIRECCION_RESIDENCIA);
		createEAttribute(personaEClass, PERSONA__EMAIL);
		createEAttribute(personaEClass, PERSONA__TELEFONO);
		createEAttribute(personaEClass, PERSONA__LUGAR_RESIDENCIA);
		createEReference(personaEClass, PERSONA__LST_PEDIDO);
		createEReference(personaEClass, PERSONA__LST_TRANSPORTE);
		createEReference(personaEClass, PERSONA__OWENED_BY_FACTORY_PERSONA);
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
		TransportePackage theTransportePackage = (TransportePackage)EPackage.Registry.INSTANCE.getEPackage(TransportePackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		PedidoPackage thePedidoPackage = (PedidoPackage)EPackage.Registry.INSTANCE.getEPackage(PedidoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(clienteEClass, Cliente.class, "Cliente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCliente_IdCliente(), thedenPackage.getString(), "idCliente", " ", 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCliente_Estado(), thedenPackage.getString(), "estado", " ", 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCliente_OwenedByPersona(), this.getPersona(), this.getPersona_LstCliente(), "owenedByPersona", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conductorEClass, Conductor.class, "Conductor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConductor_LstTransporte(), theTransportePackage.getTransporte(), theTransportePackage.getTransporte_LstConductor(), "lstTransporte", null, 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConductor_IdConductor(), thedenPackage.getString(), "idConductor", " ", 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConductor_CategoriaLicencia(), thedenPackage.getString(), "categoriaLicencia", " ", 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConductor_CodigoLicencia(), thedenPackage.getString(), "codigoLicencia", " ", 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConductor_OwenedByPersona(), this.getPersona(), this.getPersona_LstConductor(), "owenedByPersona", null, 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empleadoEClass, Empleado.class, "Empleado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmpleado_IdEmpleado(), thedenPackage.getString(), "idEmpleado", " ", 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_FechaInicioContrato(), thedenPackage.getString(), "fechaInicioContrato", " ", 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_FechaTerminacionContrato(), thedenPackage.getString(), "fechaTerminacionContrato", " ", 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_Cargo(), thedenPackage.getString(), "cargo", " ", 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_Descripcion(), thedenPackage.getString(), "descripcion", " ", 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_Salario(), thedenPackage.getString(), "salario", " ", 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmpleado_OwenedByPersona(), this.getPersona(), this.getPersona_LstEmpleado(), "owenedByPersona", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factoryPersonaEClass, FactoryPersona.class, "FactoryPersona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactoryPersona_IdPersona(), thedenPackage.getString(), "idPersona", " ", 0, 1, FactoryPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryPersona_OwenedByDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_LstFactoryPersona(), "owenedByDomain", null, 0, 1, FactoryPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryPersona_LstPersona(), this.getPersona(), this.getPersona_OwenedByFactoryPersona(), "lstPersona", null, 0, -1, FactoryPersona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersona_LstCliente(), this.getCliente(), this.getCliente_OwenedByPersona(), "lstCliente", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_LstConductor(), this.getConductor(), this.getConductor_OwenedByPersona(), "lstConductor", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_LstEmpleado(), this.getEmpleado(), this.getEmpleado_OwenedByPersona(), "lstEmpleado", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_IdPersona(), thedenPackage.getString(), "idPersona", " ", 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_NumeroDocumento(), thedenPackage.getString(), "numeroDocumento", " ", 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_TipoDocumento(), thedenPackage.getString(), "tipoDocumento", " ", 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Edad(), thedenPackage.getString(), "edad", " ", 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_FechaNacimiento(), thedenPackage.getString(), "fechaNacimiento", " ", 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Genero(), thedenPackage.getString(), "genero", " ", 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_DireccionResidencia(), thedenPackage.getString(), "direccionResidencia", " ", 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Email(), thedenPackage.getString(), "email", " ", 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Telefono(), thedenPackage.getString(), "telefono", " ", 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_LugarResidencia(), thedenPackage.getString(), "lugarResidencia", " ", 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_LstPedido(), thePedidoPackage.getPedido(), thePedidoPackage.getPedido_LstPersona(), "lstPedido", null, 1, -1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_LstTransporte(), theTransportePackage.getTransporte(), theTransportePackage.getTransporte_LstPersona(), "lstTransporte", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersona_OwenedByFactoryPersona(), this.getFactoryPersona(), this.getFactoryPersona_LstPersona(), "owenedByFactoryPersona", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PersonaPackageImpl
