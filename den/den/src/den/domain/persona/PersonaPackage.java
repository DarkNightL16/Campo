/**
 */
package den.domain.persona;

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
 * @see den.domain.persona.PersonaFactory
 * @model kind="package"
 * @generated
 */
public interface PersonaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "persona";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///den/domain/persona.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "den.domain.persona";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersonaPackage eINSTANCE = den.domain.persona.impl.PersonaPackageImpl.init();

	/**
	 * The meta object id for the '{@link den.domain.persona.impl.ClienteImpl <em>Cliente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.persona.impl.ClienteImpl
	 * @see den.domain.persona.impl.PersonaPackageImpl#getCliente()
	 * @generated
	 */
	int CLIENTE = 0;

	/**
	 * The feature id for the '<em><b>Id Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__ID_CLIENTE = 0;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__ESTADO = 1;

	/**
	 * The feature id for the '<em><b>Owened By Persona</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__OWENED_BY_PERSONA = 2;

	/**
	 * The number of structural features of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link den.domain.persona.impl.ConductorImpl <em>Conductor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.persona.impl.ConductorImpl
	 * @see den.domain.persona.impl.PersonaPackageImpl#getConductor()
	 * @generated
	 */
	int CONDUCTOR = 1;

	/**
	 * The feature id for the '<em><b>Lst Transporte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__LST_TRANSPORTE = 0;

	/**
	 * The feature id for the '<em><b>Id Conductor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__ID_CONDUCTOR = 1;

	/**
	 * The feature id for the '<em><b>Categoria Licencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__CATEGORIA_LICENCIA = 2;

	/**
	 * The feature id for the '<em><b>Codigo Licencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__CODIGO_LICENCIA = 3;

	/**
	 * The feature id for the '<em><b>Owened By Persona</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__OWENED_BY_PERSONA = 4;

	/**
	 * The number of structural features of the '<em>Conductor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link den.domain.persona.impl.EmpleadoImpl <em>Empleado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.persona.impl.EmpleadoImpl
	 * @see den.domain.persona.impl.PersonaPackageImpl#getEmpleado()
	 * @generated
	 */
	int EMPLEADO = 2;

	/**
	 * The feature id for the '<em><b>Id Empleado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__ID_EMPLEADO = 0;

	/**
	 * The feature id for the '<em><b>Fecha Inicio Contrato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__FECHA_INICIO_CONTRATO = 1;

	/**
	 * The feature id for the '<em><b>Fecha Terminacion Contrato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__FECHA_TERMINACION_CONTRATO = 2;

	/**
	 * The feature id for the '<em><b>Cargo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__CARGO = 3;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__DESCRIPCION = 4;

	/**
	 * The feature id for the '<em><b>Salario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__SALARIO = 5;

	/**
	 * The feature id for the '<em><b>Owened By Persona</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__OWENED_BY_PERSONA = 6;

	/**
	 * The number of structural features of the '<em>Empleado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link den.domain.persona.impl.FactoryPersonaImpl <em>Factory Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.persona.impl.FactoryPersonaImpl
	 * @see den.domain.persona.impl.PersonaPackageImpl#getFactoryPersona()
	 * @generated
	 */
	int FACTORY_PERSONA = 3;

	/**
	 * The feature id for the '<em><b>Id Persona</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PERSONA__ID_PERSONA = 0;

	/**
	 * The feature id for the '<em><b>Owened By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PERSONA__OWENED_BY_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Lst Persona</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PERSONA__LST_PERSONA = 2;

	/**
	 * The number of structural features of the '<em>Factory Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_PERSONA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link den.domain.persona.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.persona.impl.PersonaImpl
	 * @see den.domain.persona.impl.PersonaPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 4;

	/**
	 * The feature id for the '<em><b>Lst Cliente</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__LST_CLIENTE = 0;

	/**
	 * The feature id for the '<em><b>Lst Conductor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__LST_CONDUCTOR = 1;

	/**
	 * The feature id for the '<em><b>Lst Empleado</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__LST_EMPLEADO = 2;

	/**
	 * The feature id for the '<em><b>Id Persona</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ID_PERSONA = 3;

	/**
	 * The feature id for the '<em><b>Numero Documento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NUMERO_DOCUMENTO = 4;

	/**
	 * The feature id for the '<em><b>Tipo Documento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__TIPO_DOCUMENTO = 5;

	/**
	 * The feature id for the '<em><b>Edad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__EDAD = 6;

	/**
	 * The feature id for the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__FECHA_NACIMIENTO = 7;

	/**
	 * The feature id for the '<em><b>Genero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__GENERO = 8;

	/**
	 * The feature id for the '<em><b>Direccion Residencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DIRECCION_RESIDENCIA = 9;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__EMAIL = 10;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__TELEFONO = 11;

	/**
	 * The feature id for the '<em><b>Lugar Residencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__LUGAR_RESIDENCIA = 12;

	/**
	 * The feature id for the '<em><b>Lst Pedido</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__LST_PEDIDO = 13;

	/**
	 * The feature id for the '<em><b>Lst Transporte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__LST_TRANSPORTE = 14;

	/**
	 * The feature id for the '<em><b>Owened By Factory Persona</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__OWENED_BY_FACTORY_PERSONA = 15;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = 16;


	/**
	 * Returns the meta object for class '{@link den.domain.persona.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente</em>'.
	 * @see den.domain.persona.Cliente
	 * @generated
	 */
	EClass getCliente();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Cliente#getIdCliente <em>Id Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Cliente</em>'.
	 * @see den.domain.persona.Cliente#getIdCliente()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_IdCliente();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Cliente#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see den.domain.persona.Cliente#getEstado()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Estado();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.persona.Cliente#getOwenedByPersona <em>Owened By Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Persona</em>'.
	 * @see den.domain.persona.Cliente#getOwenedByPersona()
	 * @see #getCliente()
	 * @generated
	 */
	EReference getCliente_OwenedByPersona();

	/**
	 * Returns the meta object for class '{@link den.domain.persona.Conductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conductor</em>'.
	 * @see den.domain.persona.Conductor
	 * @generated
	 */
	EClass getConductor();

	/**
	 * Returns the meta object for the reference '{@link den.domain.persona.Conductor#getLstTransporte <em>Lst Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lst Transporte</em>'.
	 * @see den.domain.persona.Conductor#getLstTransporte()
	 * @see #getConductor()
	 * @generated
	 */
	EReference getConductor_LstTransporte();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Conductor#getIdConductor <em>Id Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Conductor</em>'.
	 * @see den.domain.persona.Conductor#getIdConductor()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_IdConductor();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Conductor#getCategoriaLicencia <em>Categoria Licencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categoria Licencia</em>'.
	 * @see den.domain.persona.Conductor#getCategoriaLicencia()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_CategoriaLicencia();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Conductor#getCodigoLicencia <em>Codigo Licencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Licencia</em>'.
	 * @see den.domain.persona.Conductor#getCodigoLicencia()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_CodigoLicencia();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.persona.Conductor#getOwenedByPersona <em>Owened By Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Persona</em>'.
	 * @see den.domain.persona.Conductor#getOwenedByPersona()
	 * @see #getConductor()
	 * @generated
	 */
	EReference getConductor_OwenedByPersona();

	/**
	 * Returns the meta object for class '{@link den.domain.persona.Empleado <em>Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empleado</em>'.
	 * @see den.domain.persona.Empleado
	 * @generated
	 */
	EClass getEmpleado();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Empleado#getIdEmpleado <em>Id Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Empleado</em>'.
	 * @see den.domain.persona.Empleado#getIdEmpleado()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_IdEmpleado();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Empleado#getFechaInicioContrato <em>Fecha Inicio Contrato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Inicio Contrato</em>'.
	 * @see den.domain.persona.Empleado#getFechaInicioContrato()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_FechaInicioContrato();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Empleado#getFechaTerminacionContrato <em>Fecha Terminacion Contrato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Terminacion Contrato</em>'.
	 * @see den.domain.persona.Empleado#getFechaTerminacionContrato()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_FechaTerminacionContrato();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Empleado#getCargo <em>Cargo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cargo</em>'.
	 * @see den.domain.persona.Empleado#getCargo()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_Cargo();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Empleado#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see den.domain.persona.Empleado#getDescripcion()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Empleado#getSalario <em>Salario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salario</em>'.
	 * @see den.domain.persona.Empleado#getSalario()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_Salario();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.persona.Empleado#getOwenedByPersona <em>Owened By Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Persona</em>'.
	 * @see den.domain.persona.Empleado#getOwenedByPersona()
	 * @see #getEmpleado()
	 * @generated
	 */
	EReference getEmpleado_OwenedByPersona();

	/**
	 * Returns the meta object for class '{@link den.domain.persona.FactoryPersona <em>Factory Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Persona</em>'.
	 * @see den.domain.persona.FactoryPersona
	 * @generated
	 */
	EClass getFactoryPersona();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.FactoryPersona#getIdPersona <em>Id Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Persona</em>'.
	 * @see den.domain.persona.FactoryPersona#getIdPersona()
	 * @see #getFactoryPersona()
	 * @generated
	 */
	EAttribute getFactoryPersona_IdPersona();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.persona.FactoryPersona#getOwenedByDomain <em>Owened By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Domain</em>'.
	 * @see den.domain.persona.FactoryPersona#getOwenedByDomain()
	 * @see #getFactoryPersona()
	 * @generated
	 */
	EReference getFactoryPersona_OwenedByDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link den.domain.persona.FactoryPersona#getLstPersona <em>Lst Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Persona</em>'.
	 * @see den.domain.persona.FactoryPersona#getLstPersona()
	 * @see #getFactoryPersona()
	 * @generated
	 */
	EReference getFactoryPersona_LstPersona();

	/**
	 * Returns the meta object for class '{@link den.domain.persona.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona</em>'.
	 * @see den.domain.persona.Persona
	 * @generated
	 */
	EClass getPersona();

	/**
	 * Returns the meta object for the containment reference '{@link den.domain.persona.Persona#getLstCliente <em>Lst Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lst Cliente</em>'.
	 * @see den.domain.persona.Persona#getLstCliente()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_LstCliente();

	/**
	 * Returns the meta object for the containment reference '{@link den.domain.persona.Persona#getLstConductor <em>Lst Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lst Conductor</em>'.
	 * @see den.domain.persona.Persona#getLstConductor()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_LstConductor();

	/**
	 * Returns the meta object for the containment reference '{@link den.domain.persona.Persona#getLstEmpleado <em>Lst Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lst Empleado</em>'.
	 * @see den.domain.persona.Persona#getLstEmpleado()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_LstEmpleado();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Persona#getIdPersona <em>Id Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Persona</em>'.
	 * @see den.domain.persona.Persona#getIdPersona()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_IdPersona();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Persona#getNumeroDocumento <em>Numero Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Documento</em>'.
	 * @see den.domain.persona.Persona#getNumeroDocumento()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_NumeroDocumento();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Persona#getTipoDocumento <em>Tipo Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Documento</em>'.
	 * @see den.domain.persona.Persona#getTipoDocumento()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_TipoDocumento();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Persona#getEdad <em>Edad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edad</em>'.
	 * @see den.domain.persona.Persona#getEdad()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Edad();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Persona#getFechaNacimiento <em>Fecha Nacimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Nacimiento</em>'.
	 * @see den.domain.persona.Persona#getFechaNacimiento()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_FechaNacimiento();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Persona#getGenero <em>Genero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genero</em>'.
	 * @see den.domain.persona.Persona#getGenero()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Genero();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Persona#getDireccionResidencia <em>Direccion Residencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion Residencia</em>'.
	 * @see den.domain.persona.Persona#getDireccionResidencia()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_DireccionResidencia();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Persona#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see den.domain.persona.Persona#getEmail()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Email();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Persona#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see den.domain.persona.Persona#getTelefono()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Telefono();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.persona.Persona#getLugarResidencia <em>Lugar Residencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lugar Residencia</em>'.
	 * @see den.domain.persona.Persona#getLugarResidencia()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_LugarResidencia();

	/**
	 * Returns the meta object for the reference list '{@link den.domain.persona.Persona#getLstPedido <em>Lst Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Pedido</em>'.
	 * @see den.domain.persona.Persona#getLstPedido()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_LstPedido();

	/**
	 * Returns the meta object for the reference '{@link den.domain.persona.Persona#getLstTransporte <em>Lst Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lst Transporte</em>'.
	 * @see den.domain.persona.Persona#getLstTransporte()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_LstTransporte();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.persona.Persona#getOwenedByFactoryPersona <em>Owened By Factory Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Factory Persona</em>'.
	 * @see den.domain.persona.Persona#getOwenedByFactoryPersona()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_OwenedByFactoryPersona();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PersonaFactory getPersonaFactory();

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
		 * The meta object literal for the '{@link den.domain.persona.impl.ClienteImpl <em>Cliente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.persona.impl.ClienteImpl
		 * @see den.domain.persona.impl.PersonaPackageImpl#getCliente()
		 * @generated
		 */
		EClass CLIENTE = eINSTANCE.getCliente();

		/**
		 * The meta object literal for the '<em><b>Id Cliente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__ID_CLIENTE = eINSTANCE.getCliente_IdCliente();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__ESTADO = eINSTANCE.getCliente_Estado();

		/**
		 * The meta object literal for the '<em><b>Owened By Persona</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE__OWENED_BY_PERSONA = eINSTANCE.getCliente_OwenedByPersona();

		/**
		 * The meta object literal for the '{@link den.domain.persona.impl.ConductorImpl <em>Conductor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.persona.impl.ConductorImpl
		 * @see den.domain.persona.impl.PersonaPackageImpl#getConductor()
		 * @generated
		 */
		EClass CONDUCTOR = eINSTANCE.getConductor();

		/**
		 * The meta object literal for the '<em><b>Lst Transporte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTOR__LST_TRANSPORTE = eINSTANCE.getConductor_LstTransporte();

		/**
		 * The meta object literal for the '<em><b>Id Conductor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__ID_CONDUCTOR = eINSTANCE.getConductor_IdConductor();

		/**
		 * The meta object literal for the '<em><b>Categoria Licencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__CATEGORIA_LICENCIA = eINSTANCE.getConductor_CategoriaLicencia();

		/**
		 * The meta object literal for the '<em><b>Codigo Licencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__CODIGO_LICENCIA = eINSTANCE.getConductor_CodigoLicencia();

		/**
		 * The meta object literal for the '<em><b>Owened By Persona</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDUCTOR__OWENED_BY_PERSONA = eINSTANCE.getConductor_OwenedByPersona();

		/**
		 * The meta object literal for the '{@link den.domain.persona.impl.EmpleadoImpl <em>Empleado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.persona.impl.EmpleadoImpl
		 * @see den.domain.persona.impl.PersonaPackageImpl#getEmpleado()
		 * @generated
		 */
		EClass EMPLEADO = eINSTANCE.getEmpleado();

		/**
		 * The meta object literal for the '<em><b>Id Empleado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__ID_EMPLEADO = eINSTANCE.getEmpleado_IdEmpleado();

		/**
		 * The meta object literal for the '<em><b>Fecha Inicio Contrato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__FECHA_INICIO_CONTRATO = eINSTANCE.getEmpleado_FechaInicioContrato();

		/**
		 * The meta object literal for the '<em><b>Fecha Terminacion Contrato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__FECHA_TERMINACION_CONTRATO = eINSTANCE.getEmpleado_FechaTerminacionContrato();

		/**
		 * The meta object literal for the '<em><b>Cargo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__CARGO = eINSTANCE.getEmpleado_Cargo();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__DESCRIPCION = eINSTANCE.getEmpleado_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Salario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__SALARIO = eINSTANCE.getEmpleado_Salario();

		/**
		 * The meta object literal for the '<em><b>Owened By Persona</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLEADO__OWENED_BY_PERSONA = eINSTANCE.getEmpleado_OwenedByPersona();

		/**
		 * The meta object literal for the '{@link den.domain.persona.impl.FactoryPersonaImpl <em>Factory Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.persona.impl.FactoryPersonaImpl
		 * @see den.domain.persona.impl.PersonaPackageImpl#getFactoryPersona()
		 * @generated
		 */
		EClass FACTORY_PERSONA = eINSTANCE.getFactoryPersona();

		/**
		 * The meta object literal for the '<em><b>Id Persona</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY_PERSONA__ID_PERSONA = eINSTANCE.getFactoryPersona_IdPersona();

		/**
		 * The meta object literal for the '<em><b>Owened By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_PERSONA__OWENED_BY_DOMAIN = eINSTANCE.getFactoryPersona_OwenedByDomain();

		/**
		 * The meta object literal for the '<em><b>Lst Persona</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_PERSONA__LST_PERSONA = eINSTANCE.getFactoryPersona_LstPersona();

		/**
		 * The meta object literal for the '{@link den.domain.persona.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.persona.impl.PersonaImpl
		 * @see den.domain.persona.impl.PersonaPackageImpl#getPersona()
		 * @generated
		 */
		EClass PERSONA = eINSTANCE.getPersona();

		/**
		 * The meta object literal for the '<em><b>Lst Cliente</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__LST_CLIENTE = eINSTANCE.getPersona_LstCliente();

		/**
		 * The meta object literal for the '<em><b>Lst Conductor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__LST_CONDUCTOR = eINSTANCE.getPersona_LstConductor();

		/**
		 * The meta object literal for the '<em><b>Lst Empleado</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__LST_EMPLEADO = eINSTANCE.getPersona_LstEmpleado();

		/**
		 * The meta object literal for the '<em><b>Id Persona</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__ID_PERSONA = eINSTANCE.getPersona_IdPersona();

		/**
		 * The meta object literal for the '<em><b>Numero Documento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__NUMERO_DOCUMENTO = eINSTANCE.getPersona_NumeroDocumento();

		/**
		 * The meta object literal for the '<em><b>Tipo Documento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__TIPO_DOCUMENTO = eINSTANCE.getPersona_TipoDocumento();

		/**
		 * The meta object literal for the '<em><b>Edad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__EDAD = eINSTANCE.getPersona_Edad();

		/**
		 * The meta object literal for the '<em><b>Fecha Nacimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__FECHA_NACIMIENTO = eINSTANCE.getPersona_FechaNacimiento();

		/**
		 * The meta object literal for the '<em><b>Genero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__GENERO = eINSTANCE.getPersona_Genero();

		/**
		 * The meta object literal for the '<em><b>Direccion Residencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__DIRECCION_RESIDENCIA = eINSTANCE.getPersona_DireccionResidencia();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__EMAIL = eINSTANCE.getPersona_Email();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__TELEFONO = eINSTANCE.getPersona_Telefono();

		/**
		 * The meta object literal for the '<em><b>Lugar Residencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__LUGAR_RESIDENCIA = eINSTANCE.getPersona_LugarResidencia();

		/**
		 * The meta object literal for the '<em><b>Lst Pedido</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__LST_PEDIDO = eINSTANCE.getPersona_LstPedido();

		/**
		 * The meta object literal for the '<em><b>Lst Transporte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__LST_TRANSPORTE = eINSTANCE.getPersona_LstTransporte();

		/**
		 * The meta object literal for the '<em><b>Owened By Factory Persona</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__OWENED_BY_FACTORY_PERSONA = eINSTANCE.getPersona_OwenedByFactoryPersona();

	}

} //PersonaPackage
