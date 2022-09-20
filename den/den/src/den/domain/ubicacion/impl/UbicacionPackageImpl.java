/**
 */
package den.domain.ubicacion.impl;

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

import den.domain.transporte.TransportePackage;

import den.domain.transporte.impl.TransportePackageImpl;

import den.domain.ubicacion.Ciudad;
import den.domain.ubicacion.Departamento;
import den.domain.ubicacion.FactoryUbicacion;
import den.domain.ubicacion.Pais;
import den.domain.ubicacion.UbicacionFactory;
import den.domain.ubicacion.UbicacionPackage;

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
public class UbicacionPackageImpl extends EPackageImpl implements UbicacionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciudadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departamentoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryUbicacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paisEClass = null;

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
	 * @see den.domain.ubicacion.UbicacionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UbicacionPackageImpl() {
		super(eNS_URI, UbicacionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UbicacionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UbicacionPackage init() {
		if (isInited) return (UbicacionPackage)EPackage.Registry.INSTANCE.getEPackage(UbicacionPackage.eNS_URI);

		// Obtain or create and register package
		UbicacionPackageImpl theUbicacionPackage = (UbicacionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UbicacionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UbicacionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		denPackageImpl thedenPackage = (denPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(denPackage.eNS_URI) instanceof denPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(denPackage.eNS_URI) : denPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		PedidoPackageImpl thePedidoPackage = (PedidoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PedidoPackage.eNS_URI) instanceof PedidoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PedidoPackage.eNS_URI) : PedidoPackage.eINSTANCE);
		TransportePackageImpl theTransportePackage = (TransportePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransportePackage.eNS_URI) instanceof TransportePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransportePackage.eNS_URI) : TransportePackage.eINSTANCE);
		PersonaPackageImpl thePersonaPackage = (PersonaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersonaPackage.eNS_URI) instanceof PersonaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersonaPackage.eNS_URI) : PersonaPackage.eINSTANCE);
		ProductoPackageImpl theProductoPackage = (ProductoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI) instanceof ProductoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProductoPackage.eNS_URI) : ProductoPackage.eINSTANCE);
		EnvioPackageImpl theEnvioPackage = (EnvioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI) instanceof EnvioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI) : EnvioPackage.eINSTANCE);
		RutaPackageImpl theRutaPackage = (RutaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI) instanceof RutaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI) : RutaPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theUbicacionPackage.createPackageContents();
		thedenPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		thePedidoPackage.createPackageContents();
		theTransportePackage.createPackageContents();
		thePersonaPackage.createPackageContents();
		theProductoPackage.createPackageContents();
		theEnvioPackage.createPackageContents();
		theRutaPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theUbicacionPackage.initializePackageContents();
		thedenPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		thePedidoPackage.initializePackageContents();
		theTransportePackage.initializePackageContents();
		thePersonaPackage.initializePackageContents();
		theProductoPackage.initializePackageContents();
		theEnvioPackage.initializePackageContents();
		theRutaPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUbicacionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UbicacionPackage.eNS_URI, theUbicacionPackage);
		return theUbicacionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCiudad() {
		return ciudadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCiudad_IdCiudad() {
		return (EAttribute)ciudadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCiudad_Coordenadas() {
		return (EAttribute)ciudadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCiudad_OwenedDepartamento() {
		return (EReference)ciudadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCiudad_LstRutaOrigen() {
		return (EReference)ciudadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCiudad_LstRutaDestino() {
		return (EReference)ciudadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCiudad_TheEnvioOrigen() {
		return (EReference)ciudadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCiudad_TheEnvioDestino() {
		return (EReference)ciudadEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCiudad_LstRuta() {
		return (EReference)ciudadEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartamento() {
		return departamentoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartamento_LstCiudad() {
		return (EReference)departamentoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartamento_IdDepartamento() {
		return (EAttribute)departamentoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartamento_Capital() {
		return (EAttribute)departamentoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartamento_PrefijoTelefonico() {
		return (EAttribute)departamentoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartamento_Coordenadas() {
		return (EAttribute)departamentoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartamento_OwenedByPais() {
		return (EReference)departamentoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactoryUbicacion() {
		return factoryUbicacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactoryUbicacion_Id() {
		return (EAttribute)factoryUbicacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryUbicacion_OwenedByDomain() {
		return (EReference)factoryUbicacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryUbicacion_LstPais() {
		return (EReference)factoryUbicacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPais() {
		return paisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPais_LstDepartamento() {
		return (EReference)paisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPais_IdPais() {
		return (EAttribute)paisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPais_Capital() {
		return (EAttribute)paisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPais_CodigoInternacional() {
		return (EAttribute)paisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPais_Idioma() {
		return (EAttribute)paisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPais_Coordenadas() {
		return (EAttribute)paisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPais_OwenedByUbicacion() {
		return (EReference)paisEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbicacionFactory getUbicacionFactory() {
		return (UbicacionFactory)getEFactoryInstance();
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
		ciudadEClass = createEClass(CIUDAD);
		createEAttribute(ciudadEClass, CIUDAD__ID_CIUDAD);
		createEAttribute(ciudadEClass, CIUDAD__COORDENADAS);
		createEReference(ciudadEClass, CIUDAD__OWENED_DEPARTAMENTO);
		createEReference(ciudadEClass, CIUDAD__LST_RUTA_ORIGEN);
		createEReference(ciudadEClass, CIUDAD__LST_RUTA_DESTINO);
		createEReference(ciudadEClass, CIUDAD__THE_ENVIO_ORIGEN);
		createEReference(ciudadEClass, CIUDAD__THE_ENVIO_DESTINO);
		createEReference(ciudadEClass, CIUDAD__LST_RUTA);

		departamentoEClass = createEClass(DEPARTAMENTO);
		createEReference(departamentoEClass, DEPARTAMENTO__LST_CIUDAD);
		createEAttribute(departamentoEClass, DEPARTAMENTO__ID_DEPARTAMENTO);
		createEAttribute(departamentoEClass, DEPARTAMENTO__CAPITAL);
		createEAttribute(departamentoEClass, DEPARTAMENTO__PREFIJO_TELEFONICO);
		createEAttribute(departamentoEClass, DEPARTAMENTO__COORDENADAS);
		createEReference(departamentoEClass, DEPARTAMENTO__OWENED_BY_PAIS);

		factoryUbicacionEClass = createEClass(FACTORY_UBICACION);
		createEAttribute(factoryUbicacionEClass, FACTORY_UBICACION__ID);
		createEReference(factoryUbicacionEClass, FACTORY_UBICACION__OWENED_BY_DOMAIN);
		createEReference(factoryUbicacionEClass, FACTORY_UBICACION__LST_PAIS);

		paisEClass = createEClass(PAIS);
		createEReference(paisEClass, PAIS__LST_DEPARTAMENTO);
		createEAttribute(paisEClass, PAIS__ID_PAIS);
		createEAttribute(paisEClass, PAIS__CAPITAL);
		createEAttribute(paisEClass, PAIS__CODIGO_INTERNACIONAL);
		createEAttribute(paisEClass, PAIS__IDIOMA);
		createEAttribute(paisEClass, PAIS__COORDENADAS);
		createEReference(paisEClass, PAIS__OWENED_BY_UBICACION);
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
		RutaPackage theRutaPackage = (RutaPackage)EPackage.Registry.INSTANCE.getEPackage(RutaPackage.eNS_URI);
		EnvioPackage theEnvioPackage = (EnvioPackage)EPackage.Registry.INSTANCE.getEPackage(EnvioPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(ciudadEClass, Ciudad.class, "Ciudad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCiudad_IdCiudad(), thedenPackage.getString(), "idCiudad", " ", 0, 1, Ciudad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCiudad_Coordenadas(), thedenPackage.getString(), "coordenadas", " ", 0, 1, Ciudad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCiudad_OwenedDepartamento(), this.getDepartamento(), this.getDepartamento_LstCiudad(), "owenedDepartamento", null, 0, 1, Ciudad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCiudad_LstRutaOrigen(), theRutaPackage.getRuta(), theRutaPackage.getRuta_LstCiudadOrigen(), "lstRutaOrigen", null, 0, -1, Ciudad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCiudad_LstRutaDestino(), theRutaPackage.getRuta(), theRutaPackage.getRuta_LstCiudadDestino(), "lstRutaDestino", null, 0, -1, Ciudad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCiudad_TheEnvioOrigen(), theEnvioPackage.getEnvio(), theEnvioPackage.getEnvio_TheCiudadOrigen(), "theEnvioOrigen", null, 0, 1, Ciudad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCiudad_TheEnvioDestino(), theEnvioPackage.getEnvio(), theEnvioPackage.getEnvio_TheCiudadDestino(), "theEnvioDestino", null, 0, 1, Ciudad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCiudad_LstRuta(), theRutaPackage.getRuta(), theRutaPackage.getRuta_OwenedByCiudad(), "lstRuta", null, 0, -1, Ciudad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(departamentoEClass, Departamento.class, "Departamento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepartamento_LstCiudad(), this.getCiudad(), this.getCiudad_OwenedDepartamento(), "lstCiudad", null, 0, -1, Departamento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartamento_IdDepartamento(), thedenPackage.getString(), "idDepartamento", " ", 0, 1, Departamento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartamento_Capital(), thedenPackage.getString(), "capital", " ", 0, 1, Departamento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartamento_PrefijoTelefonico(), thedenPackage.getString(), "prefijoTelefonico", " ", 0, 1, Departamento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartamento_Coordenadas(), thedenPackage.getString(), "coordenadas", " ", 0, 1, Departamento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartamento_OwenedByPais(), this.getPais(), this.getPais_LstDepartamento(), "owenedByPais", null, 0, 1, Departamento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factoryUbicacionEClass, FactoryUbicacion.class, "FactoryUbicacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactoryUbicacion_Id(), thedenPackage.getString(), "id", " ", 0, 1, FactoryUbicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryUbicacion_OwenedByDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_LstFactoryUbicacion(), "owenedByDomain", null, 0, 1, FactoryUbicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryUbicacion_LstPais(), this.getPais(), this.getPais_OwenedByUbicacion(), "lstPais", null, 0, -1, FactoryUbicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paisEClass, Pais.class, "Pais", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPais_LstDepartamento(), this.getDepartamento(), this.getDepartamento_OwenedByPais(), "lstDepartamento", null, 0, -1, Pais.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPais_IdPais(), thedenPackage.getString(), "idPais", " ", 0, 1, Pais.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPais_Capital(), thedenPackage.getString(), "capital", " ", 0, 1, Pais.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPais_CodigoInternacional(), thedenPackage.getString(), "codigoInternacional", " ", 0, 1, Pais.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPais_Idioma(), thedenPackage.getString(), "idioma", " ", 0, 1, Pais.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPais_Coordenadas(), thedenPackage.getString(), "coordenadas", " ", 0, 1, Pais.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPais_OwenedByUbicacion(), this.getFactoryUbicacion(), this.getFactoryUbicacion_LstPais(), "owenedByUbicacion", null, 0, 1, Pais.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //UbicacionPackageImpl
