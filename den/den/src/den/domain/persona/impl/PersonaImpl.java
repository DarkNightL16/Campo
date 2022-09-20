/**
 */
package den.domain.persona.impl;

import den.domain.pedido.Pedido;
import den.domain.pedido.PedidoPackage;

import den.domain.persona.Cliente;
import den.domain.persona.Conductor;
import den.domain.persona.Empleado;
import den.domain.persona.FactoryPersona;
import den.domain.persona.Persona;
import den.domain.persona.PersonaPackage;

import den.domain.transporte.Transporte;
import den.domain.transporte.TransportePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getLstCliente <em>Lst Cliente</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getLstConductor <em>Lst Conductor</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getLstEmpleado <em>Lst Empleado</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getIdPersona <em>Id Persona</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getNumeroDocumento <em>Numero Documento</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getTipoDocumento <em>Tipo Documento</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getEdad <em>Edad</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getFechaNacimiento <em>Fecha Nacimiento</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getGenero <em>Genero</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getDireccionResidencia <em>Direccion Residencia</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getLugarResidencia <em>Lugar Residencia</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getLstPedido <em>Lst Pedido</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getLstTransporte <em>Lst Transporte</em>}</li>
 *   <li>{@link den.domain.persona.impl.PersonaImpl#getOwenedByFactoryPersona <em>Owened By Factory Persona</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonaImpl extends EObjectImpl implements Persona {
	/**
	 * The cached value of the '{@link #getLstCliente() <em>Lst Cliente</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstCliente()
	 * @generated
	 * @ordered
	 */
	protected Cliente lstCliente;

	/**
	 * The cached value of the '{@link #getLstConductor() <em>Lst Conductor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstConductor()
	 * @generated
	 * @ordered
	 */
	protected Conductor lstConductor;

	/**
	 * The cached value of the '{@link #getLstEmpleado() <em>Lst Empleado</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstEmpleado()
	 * @generated
	 * @ordered
	 */
	protected Empleado lstEmpleado;

	/**
	 * The default value of the '{@link #getIdPersona() <em>Id Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPersona()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_PERSONA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdPersona() <em>Id Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPersona()
	 * @generated
	 * @ordered
	 */
	protected String idPersona = ID_PERSONA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroDocumento() <em>Numero Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroDocumento()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_DOCUMENTO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getNumeroDocumento() <em>Numero Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroDocumento()
	 * @generated
	 * @ordered
	 */
	protected String numeroDocumento = NUMERO_DOCUMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoDocumento() <em>Tipo Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDocumento()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_DOCUMENTO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getTipoDocumento() <em>Tipo Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDocumento()
	 * @generated
	 * @ordered
	 */
	protected String tipoDocumento = TIPO_DOCUMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdad() <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdad()
	 * @generated
	 * @ordered
	 */
	protected static final String EDAD_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getEdad() <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdad()
	 * @generated
	 * @ordered
	 */
	protected String edad = EDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaNacimiento() <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaNacimiento()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_NACIMIENTO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getFechaNacimiento() <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaNacimiento()
	 * @generated
	 * @ordered
	 */
	protected String fechaNacimiento = FECHA_NACIMIENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenero() <em>Genero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenero()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getGenero() <em>Genero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenero()
	 * @generated
	 * @ordered
	 */
	protected String genero = GENERO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDireccionResidencia() <em>Direccion Residencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccionResidencia()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECCION_RESIDENCIA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDireccionResidencia() <em>Direccion Residencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccionResidencia()
	 * @generated
	 * @ordered
	 */
	protected String direccionResidencia = DIRECCION_RESIDENCIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected String telefono = TELEFONO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLugarResidencia() <em>Lugar Residencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLugarResidencia()
	 * @generated
	 * @ordered
	 */
	protected static final String LUGAR_RESIDENCIA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getLugarResidencia() <em>Lugar Residencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLugarResidencia()
	 * @generated
	 * @ordered
	 */
	protected String lugarResidencia = LUGAR_RESIDENCIA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstPedido() <em>Lst Pedido</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPedido()
	 * @generated
	 * @ordered
	 */
	protected EList<Pedido> lstPedido;

	/**
	 * The cached value of the '{@link #getLstTransporte() <em>Lst Transporte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstTransporte()
	 * @generated
	 * @ordered
	 */
	protected Transporte lstTransporte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersonaPackage.Literals.PERSONA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente getLstCliente() {
		return lstCliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstCliente(Cliente newLstCliente, NotificationChain msgs) {
		Cliente oldLstCliente = lstCliente;
		lstCliente = newLstCliente;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__LST_CLIENTE, oldLstCliente, newLstCliente);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstCliente(Cliente newLstCliente) {
		if (newLstCliente != lstCliente) {
			NotificationChain msgs = null;
			if (lstCliente != null)
				msgs = ((InternalEObject)lstCliente).eInverseRemove(this, PersonaPackage.CLIENTE__OWENED_BY_PERSONA, Cliente.class, msgs);
			if (newLstCliente != null)
				msgs = ((InternalEObject)newLstCliente).eInverseAdd(this, PersonaPackage.CLIENTE__OWENED_BY_PERSONA, Cliente.class, msgs);
			msgs = basicSetLstCliente(newLstCliente, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__LST_CLIENTE, newLstCliente, newLstCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conductor getLstConductor() {
		return lstConductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstConductor(Conductor newLstConductor, NotificationChain msgs) {
		Conductor oldLstConductor = lstConductor;
		lstConductor = newLstConductor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__LST_CONDUCTOR, oldLstConductor, newLstConductor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstConductor(Conductor newLstConductor) {
		if (newLstConductor != lstConductor) {
			NotificationChain msgs = null;
			if (lstConductor != null)
				msgs = ((InternalEObject)lstConductor).eInverseRemove(this, PersonaPackage.CONDUCTOR__OWENED_BY_PERSONA, Conductor.class, msgs);
			if (newLstConductor != null)
				msgs = ((InternalEObject)newLstConductor).eInverseAdd(this, PersonaPackage.CONDUCTOR__OWENED_BY_PERSONA, Conductor.class, msgs);
			msgs = basicSetLstConductor(newLstConductor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__LST_CONDUCTOR, newLstConductor, newLstConductor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empleado getLstEmpleado() {
		return lstEmpleado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstEmpleado(Empleado newLstEmpleado, NotificationChain msgs) {
		Empleado oldLstEmpleado = lstEmpleado;
		lstEmpleado = newLstEmpleado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__LST_EMPLEADO, oldLstEmpleado, newLstEmpleado);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstEmpleado(Empleado newLstEmpleado) {
		if (newLstEmpleado != lstEmpleado) {
			NotificationChain msgs = null;
			if (lstEmpleado != null)
				msgs = ((InternalEObject)lstEmpleado).eInverseRemove(this, PersonaPackage.EMPLEADO__OWENED_BY_PERSONA, Empleado.class, msgs);
			if (newLstEmpleado != null)
				msgs = ((InternalEObject)newLstEmpleado).eInverseAdd(this, PersonaPackage.EMPLEADO__OWENED_BY_PERSONA, Empleado.class, msgs);
			msgs = basicSetLstEmpleado(newLstEmpleado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__LST_EMPLEADO, newLstEmpleado, newLstEmpleado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdPersona() {
		return idPersona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPersona(String newIdPersona) {
		String oldIdPersona = idPersona;
		idPersona = newIdPersona;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__ID_PERSONA, oldIdPersona, idPersona));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroDocumento(String newNumeroDocumento) {
		String oldNumeroDocumento = numeroDocumento;
		numeroDocumento = newNumeroDocumento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__NUMERO_DOCUMENTO, oldNumeroDocumento, numeroDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoDocumento(String newTipoDocumento) {
		String oldTipoDocumento = tipoDocumento;
		tipoDocumento = newTipoDocumento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__TIPO_DOCUMENTO, oldTipoDocumento, tipoDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdad(String newEdad) {
		String oldEdad = edad;
		edad = newEdad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__EDAD, oldEdad, edad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaNacimiento(String newFechaNacimiento) {
		String oldFechaNacimiento = fechaNacimiento;
		fechaNacimiento = newFechaNacimiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__FECHA_NACIMIENTO, oldFechaNacimiento, fechaNacimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenero(String newGenero) {
		String oldGenero = genero;
		genero = newGenero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__GENERO, oldGenero, genero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDireccionResidencia() {
		return direccionResidencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDireccionResidencia(String newDireccionResidencia) {
		String oldDireccionResidencia = direccionResidencia;
		direccionResidencia = newDireccionResidencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__DIRECCION_RESIDENCIA, oldDireccionResidencia, direccionResidencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefono(String newTelefono) {
		String oldTelefono = telefono;
		telefono = newTelefono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__TELEFONO, oldTelefono, telefono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLugarResidencia() {
		return lugarResidencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLugarResidencia(String newLugarResidencia) {
		String oldLugarResidencia = lugarResidencia;
		lugarResidencia = newLugarResidencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__LUGAR_RESIDENCIA, oldLugarResidencia, lugarResidencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pedido> getLstPedido() {
		if (lstPedido == null) {
			lstPedido = new EObjectWithInverseResolvingEList<Pedido>(Pedido.class, this, PersonaPackage.PERSONA__LST_PEDIDO, PedidoPackage.PEDIDO__LST_PERSONA);
		}
		return lstPedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transporte getLstTransporte() {
		if (lstTransporte != null && lstTransporte.eIsProxy()) {
			InternalEObject oldLstTransporte = (InternalEObject)lstTransporte;
			lstTransporte = (Transporte)eResolveProxy(oldLstTransporte);
			if (lstTransporte != oldLstTransporte) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersonaPackage.PERSONA__LST_TRANSPORTE, oldLstTransporte, lstTransporte));
			}
		}
		return lstTransporte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transporte basicGetLstTransporte() {
		return lstTransporte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstTransporte(Transporte newLstTransporte, NotificationChain msgs) {
		Transporte oldLstTransporte = lstTransporte;
		lstTransporte = newLstTransporte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__LST_TRANSPORTE, oldLstTransporte, newLstTransporte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstTransporte(Transporte newLstTransporte) {
		if (newLstTransporte != lstTransporte) {
			NotificationChain msgs = null;
			if (lstTransporte != null)
				msgs = ((InternalEObject)lstTransporte).eInverseRemove(this, TransportePackage.TRANSPORTE__LST_PERSONA, Transporte.class, msgs);
			if (newLstTransporte != null)
				msgs = ((InternalEObject)newLstTransporte).eInverseAdd(this, TransportePackage.TRANSPORTE__LST_PERSONA, Transporte.class, msgs);
			msgs = basicSetLstTransporte(newLstTransporte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__LST_TRANSPORTE, newLstTransporte, newLstTransporte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryPersona getOwenedByFactoryPersona() {
		if (eContainerFeatureID() != PersonaPackage.PERSONA__OWENED_BY_FACTORY_PERSONA) return null;
		return (FactoryPersona)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByFactoryPersona(FactoryPersona newOwenedByFactoryPersona, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByFactoryPersona, PersonaPackage.PERSONA__OWENED_BY_FACTORY_PERSONA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByFactoryPersona(FactoryPersona newOwenedByFactoryPersona) {
		if (newOwenedByFactoryPersona != eInternalContainer() || (eContainerFeatureID() != PersonaPackage.PERSONA__OWENED_BY_FACTORY_PERSONA && newOwenedByFactoryPersona != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByFactoryPersona))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByFactoryPersona != null)
				msgs = ((InternalEObject)newOwenedByFactoryPersona).eInverseAdd(this, PersonaPackage.FACTORY_PERSONA__LST_PERSONA, FactoryPersona.class, msgs);
			msgs = basicSetOwenedByFactoryPersona(newOwenedByFactoryPersona, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.PERSONA__OWENED_BY_FACTORY_PERSONA, newOwenedByFactoryPersona, newOwenedByFactoryPersona));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersonaPackage.PERSONA__LST_CLIENTE:
				if (lstCliente != null)
					msgs = ((InternalEObject)lstCliente).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PersonaPackage.PERSONA__LST_CLIENTE, null, msgs);
				return basicSetLstCliente((Cliente)otherEnd, msgs);
			case PersonaPackage.PERSONA__LST_CONDUCTOR:
				if (lstConductor != null)
					msgs = ((InternalEObject)lstConductor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PersonaPackage.PERSONA__LST_CONDUCTOR, null, msgs);
				return basicSetLstConductor((Conductor)otherEnd, msgs);
			case PersonaPackage.PERSONA__LST_EMPLEADO:
				if (lstEmpleado != null)
					msgs = ((InternalEObject)lstEmpleado).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PersonaPackage.PERSONA__LST_EMPLEADO, null, msgs);
				return basicSetLstEmpleado((Empleado)otherEnd, msgs);
			case PersonaPackage.PERSONA__LST_PEDIDO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstPedido()).basicAdd(otherEnd, msgs);
			case PersonaPackage.PERSONA__LST_TRANSPORTE:
				if (lstTransporte != null)
					msgs = ((InternalEObject)lstTransporte).eInverseRemove(this, TransportePackage.TRANSPORTE__LST_PERSONA, Transporte.class, msgs);
				return basicSetLstTransporte((Transporte)otherEnd, msgs);
			case PersonaPackage.PERSONA__OWENED_BY_FACTORY_PERSONA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByFactoryPersona((FactoryPersona)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersonaPackage.PERSONA__LST_CLIENTE:
				return basicSetLstCliente(null, msgs);
			case PersonaPackage.PERSONA__LST_CONDUCTOR:
				return basicSetLstConductor(null, msgs);
			case PersonaPackage.PERSONA__LST_EMPLEADO:
				return basicSetLstEmpleado(null, msgs);
			case PersonaPackage.PERSONA__LST_PEDIDO:
				return ((InternalEList<?>)getLstPedido()).basicRemove(otherEnd, msgs);
			case PersonaPackage.PERSONA__LST_TRANSPORTE:
				return basicSetLstTransporte(null, msgs);
			case PersonaPackage.PERSONA__OWENED_BY_FACTORY_PERSONA:
				return basicSetOwenedByFactoryPersona(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PersonaPackage.PERSONA__OWENED_BY_FACTORY_PERSONA:
				return eInternalContainer().eInverseRemove(this, PersonaPackage.FACTORY_PERSONA__LST_PERSONA, FactoryPersona.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersonaPackage.PERSONA__LST_CLIENTE:
				return getLstCliente();
			case PersonaPackage.PERSONA__LST_CONDUCTOR:
				return getLstConductor();
			case PersonaPackage.PERSONA__LST_EMPLEADO:
				return getLstEmpleado();
			case PersonaPackage.PERSONA__ID_PERSONA:
				return getIdPersona();
			case PersonaPackage.PERSONA__NUMERO_DOCUMENTO:
				return getNumeroDocumento();
			case PersonaPackage.PERSONA__TIPO_DOCUMENTO:
				return getTipoDocumento();
			case PersonaPackage.PERSONA__EDAD:
				return getEdad();
			case PersonaPackage.PERSONA__FECHA_NACIMIENTO:
				return getFechaNacimiento();
			case PersonaPackage.PERSONA__GENERO:
				return getGenero();
			case PersonaPackage.PERSONA__DIRECCION_RESIDENCIA:
				return getDireccionResidencia();
			case PersonaPackage.PERSONA__EMAIL:
				return getEmail();
			case PersonaPackage.PERSONA__TELEFONO:
				return getTelefono();
			case PersonaPackage.PERSONA__LUGAR_RESIDENCIA:
				return getLugarResidencia();
			case PersonaPackage.PERSONA__LST_PEDIDO:
				return getLstPedido();
			case PersonaPackage.PERSONA__LST_TRANSPORTE:
				if (resolve) return getLstTransporte();
				return basicGetLstTransporte();
			case PersonaPackage.PERSONA__OWENED_BY_FACTORY_PERSONA:
				return getOwenedByFactoryPersona();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersonaPackage.PERSONA__LST_CLIENTE:
				setLstCliente((Cliente)newValue);
				return;
			case PersonaPackage.PERSONA__LST_CONDUCTOR:
				setLstConductor((Conductor)newValue);
				return;
			case PersonaPackage.PERSONA__LST_EMPLEADO:
				setLstEmpleado((Empleado)newValue);
				return;
			case PersonaPackage.PERSONA__ID_PERSONA:
				setIdPersona((String)newValue);
				return;
			case PersonaPackage.PERSONA__NUMERO_DOCUMENTO:
				setNumeroDocumento((String)newValue);
				return;
			case PersonaPackage.PERSONA__TIPO_DOCUMENTO:
				setTipoDocumento((String)newValue);
				return;
			case PersonaPackage.PERSONA__EDAD:
				setEdad((String)newValue);
				return;
			case PersonaPackage.PERSONA__FECHA_NACIMIENTO:
				setFechaNacimiento((String)newValue);
				return;
			case PersonaPackage.PERSONA__GENERO:
				setGenero((String)newValue);
				return;
			case PersonaPackage.PERSONA__DIRECCION_RESIDENCIA:
				setDireccionResidencia((String)newValue);
				return;
			case PersonaPackage.PERSONA__EMAIL:
				setEmail((String)newValue);
				return;
			case PersonaPackage.PERSONA__TELEFONO:
				setTelefono((String)newValue);
				return;
			case PersonaPackage.PERSONA__LUGAR_RESIDENCIA:
				setLugarResidencia((String)newValue);
				return;
			case PersonaPackage.PERSONA__LST_PEDIDO:
				getLstPedido().clear();
				getLstPedido().addAll((Collection<? extends Pedido>)newValue);
				return;
			case PersonaPackage.PERSONA__LST_TRANSPORTE:
				setLstTransporte((Transporte)newValue);
				return;
			case PersonaPackage.PERSONA__OWENED_BY_FACTORY_PERSONA:
				setOwenedByFactoryPersona((FactoryPersona)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PersonaPackage.PERSONA__LST_CLIENTE:
				setLstCliente((Cliente)null);
				return;
			case PersonaPackage.PERSONA__LST_CONDUCTOR:
				setLstConductor((Conductor)null);
				return;
			case PersonaPackage.PERSONA__LST_EMPLEADO:
				setLstEmpleado((Empleado)null);
				return;
			case PersonaPackage.PERSONA__ID_PERSONA:
				setIdPersona(ID_PERSONA_EDEFAULT);
				return;
			case PersonaPackage.PERSONA__NUMERO_DOCUMENTO:
				setNumeroDocumento(NUMERO_DOCUMENTO_EDEFAULT);
				return;
			case PersonaPackage.PERSONA__TIPO_DOCUMENTO:
				setTipoDocumento(TIPO_DOCUMENTO_EDEFAULT);
				return;
			case PersonaPackage.PERSONA__EDAD:
				setEdad(EDAD_EDEFAULT);
				return;
			case PersonaPackage.PERSONA__FECHA_NACIMIENTO:
				setFechaNacimiento(FECHA_NACIMIENTO_EDEFAULT);
				return;
			case PersonaPackage.PERSONA__GENERO:
				setGenero(GENERO_EDEFAULT);
				return;
			case PersonaPackage.PERSONA__DIRECCION_RESIDENCIA:
				setDireccionResidencia(DIRECCION_RESIDENCIA_EDEFAULT);
				return;
			case PersonaPackage.PERSONA__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case PersonaPackage.PERSONA__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
				return;
			case PersonaPackage.PERSONA__LUGAR_RESIDENCIA:
				setLugarResidencia(LUGAR_RESIDENCIA_EDEFAULT);
				return;
			case PersonaPackage.PERSONA__LST_PEDIDO:
				getLstPedido().clear();
				return;
			case PersonaPackage.PERSONA__LST_TRANSPORTE:
				setLstTransporte((Transporte)null);
				return;
			case PersonaPackage.PERSONA__OWENED_BY_FACTORY_PERSONA:
				setOwenedByFactoryPersona((FactoryPersona)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PersonaPackage.PERSONA__LST_CLIENTE:
				return lstCliente != null;
			case PersonaPackage.PERSONA__LST_CONDUCTOR:
				return lstConductor != null;
			case PersonaPackage.PERSONA__LST_EMPLEADO:
				return lstEmpleado != null;
			case PersonaPackage.PERSONA__ID_PERSONA:
				return ID_PERSONA_EDEFAULT == null ? idPersona != null : !ID_PERSONA_EDEFAULT.equals(idPersona);
			case PersonaPackage.PERSONA__NUMERO_DOCUMENTO:
				return NUMERO_DOCUMENTO_EDEFAULT == null ? numeroDocumento != null : !NUMERO_DOCUMENTO_EDEFAULT.equals(numeroDocumento);
			case PersonaPackage.PERSONA__TIPO_DOCUMENTO:
				return TIPO_DOCUMENTO_EDEFAULT == null ? tipoDocumento != null : !TIPO_DOCUMENTO_EDEFAULT.equals(tipoDocumento);
			case PersonaPackage.PERSONA__EDAD:
				return EDAD_EDEFAULT == null ? edad != null : !EDAD_EDEFAULT.equals(edad);
			case PersonaPackage.PERSONA__FECHA_NACIMIENTO:
				return FECHA_NACIMIENTO_EDEFAULT == null ? fechaNacimiento != null : !FECHA_NACIMIENTO_EDEFAULT.equals(fechaNacimiento);
			case PersonaPackage.PERSONA__GENERO:
				return GENERO_EDEFAULT == null ? genero != null : !GENERO_EDEFAULT.equals(genero);
			case PersonaPackage.PERSONA__DIRECCION_RESIDENCIA:
				return DIRECCION_RESIDENCIA_EDEFAULT == null ? direccionResidencia != null : !DIRECCION_RESIDENCIA_EDEFAULT.equals(direccionResidencia);
			case PersonaPackage.PERSONA__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case PersonaPackage.PERSONA__TELEFONO:
				return TELEFONO_EDEFAULT == null ? telefono != null : !TELEFONO_EDEFAULT.equals(telefono);
			case PersonaPackage.PERSONA__LUGAR_RESIDENCIA:
				return LUGAR_RESIDENCIA_EDEFAULT == null ? lugarResidencia != null : !LUGAR_RESIDENCIA_EDEFAULT.equals(lugarResidencia);
			case PersonaPackage.PERSONA__LST_PEDIDO:
				return lstPedido != null && !lstPedido.isEmpty();
			case PersonaPackage.PERSONA__LST_TRANSPORTE:
				return lstTransporte != null;
			case PersonaPackage.PERSONA__OWENED_BY_FACTORY_PERSONA:
				return getOwenedByFactoryPersona() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (idPersona: ");
		result.append(idPersona);
		result.append(", numeroDocumento: ");
		result.append(numeroDocumento);
		result.append(", tipoDocumento: ");
		result.append(tipoDocumento);
		result.append(", edad: ");
		result.append(edad);
		result.append(", fechaNacimiento: ");
		result.append(fechaNacimiento);
		result.append(", genero: ");
		result.append(genero);
		result.append(", direccionResidencia: ");
		result.append(direccionResidencia);
		result.append(", email: ");
		result.append(email);
		result.append(", telefono: ");
		result.append(telefono);
		result.append(", lugarResidencia: ");
		result.append(lugarResidencia);
		result.append(')');
		return result.toString();
	}

} //PersonaImpl
