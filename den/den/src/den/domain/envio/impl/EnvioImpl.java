/**
 */
package den.domain.envio.impl;

import den.domain.envio.DetallePedido;
import den.domain.envio.Envio;
import den.domain.envio.EnvioPackage;
import den.domain.envio.FactoryEnvio;

import den.domain.pedido.Pedido;
import den.domain.pedido.PedidoPackage;

import den.domain.ruta.Ruta;
import den.domain.ruta.RutaPackage;

import den.domain.transporte.Transporte;
import den.domain.transporte.TransportePackage;

import den.domain.ubicacion.Ciudad;
import den.domain.ubicacion.UbicacionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Envio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.envio.impl.EnvioImpl#getTheCiudadOrigen <em>The Ciudad Origen</em>}</li>
 *   <li>{@link den.domain.envio.impl.EnvioImpl#getLstTransporte <em>Lst Transporte</em>}</li>
 *   <li>{@link den.domain.envio.impl.EnvioImpl#getLstDetallePedido <em>Lst Detalle Pedido</em>}</li>
 *   <li>{@link den.domain.envio.impl.EnvioImpl#getId <em>Id</em>}</li>
 *   <li>{@link den.domain.envio.impl.EnvioImpl#getNitEmpresa <em>Nit Empresa</em>}</li>
 *   <li>{@link den.domain.envio.impl.EnvioImpl#getDireccionEmpresa <em>Direccion Empresa</em>}</li>
 *   <li>{@link den.domain.envio.impl.EnvioImpl#getIdFactura <em>Id Factura</em>}</li>
 *   <li>{@link den.domain.envio.impl.EnvioImpl#getFechaEnvio <em>Fecha Envio</em>}</li>
 *   <li>{@link den.domain.envio.impl.EnvioImpl#getFechaVencimiento <em>Fecha Vencimiento</em>}</li>
 *   <li>{@link den.domain.envio.impl.EnvioImpl#getTheCiudadDestino <em>The Ciudad Destino</em>}</li>
 *   <li>{@link den.domain.envio.impl.EnvioImpl#getLstPedido <em>Lst Pedido</em>}</li>
 *   <li>{@link den.domain.envio.impl.EnvioImpl#getOwenedByFactoryEnvio <em>Owened By Factory Envio</em>}</li>
 *   <li>{@link den.domain.envio.impl.EnvioImpl#getLstRuta <em>Lst Ruta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvioImpl extends EObjectImpl implements Envio {
	/**
	 * The cached value of the '{@link #getTheCiudadOrigen() <em>The Ciudad Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheCiudadOrigen()
	 * @generated
	 * @ordered
	 */
	protected Ciudad theCiudadOrigen;

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
	 * The cached value of the '{@link #getLstDetallePedido() <em>Lst Detalle Pedido</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstDetallePedido()
	 * @generated
	 * @ordered
	 */
	protected DetallePedido lstDetallePedido;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNitEmpresa() <em>Nit Empresa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNitEmpresa()
	 * @generated
	 * @ordered
	 */
	protected static final String NIT_EMPRESA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getNitEmpresa() <em>Nit Empresa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNitEmpresa()
	 * @generated
	 * @ordered
	 */
	protected String nitEmpresa = NIT_EMPRESA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDireccionEmpresa() <em>Direccion Empresa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccionEmpresa()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECCION_EMPRESA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDireccionEmpresa() <em>Direccion Empresa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccionEmpresa()
	 * @generated
	 * @ordered
	 */
	protected String direccionEmpresa = DIRECCION_EMPRESA_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdFactura() <em>Id Factura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdFactura()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_FACTURA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdFactura() <em>Id Factura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdFactura()
	 * @generated
	 * @ordered
	 */
	protected String idFactura = ID_FACTURA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaEnvio() <em>Fecha Envio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaEnvio()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_ENVIO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getFechaEnvio() <em>Fecha Envio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaEnvio()
	 * @generated
	 * @ordered
	 */
	protected String fechaEnvio = FECHA_ENVIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaVencimiento() <em>Fecha Vencimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaVencimiento()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_VENCIMIENTO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getFechaVencimiento() <em>Fecha Vencimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaVencimiento()
	 * @generated
	 * @ordered
	 */
	protected String fechaVencimiento = FECHA_VENCIMIENTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTheCiudadDestino() <em>The Ciudad Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheCiudadDestino()
	 * @generated
	 * @ordered
	 */
	protected Ciudad theCiudadDestino;

	/**
	 * The cached value of the '{@link #getLstPedido() <em>Lst Pedido</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPedido()
	 * @generated
	 * @ordered
	 */
	protected Pedido lstPedido;

	/**
	 * The cached value of the '{@link #getLstRuta() <em>Lst Ruta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstRuta()
	 * @generated
	 * @ordered
	 */
	protected Ruta lstRuta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvioPackage.Literals.ENVIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ciudad getTheCiudadOrigen() {
		if (theCiudadOrigen != null && theCiudadOrigen.eIsProxy()) {
			InternalEObject oldTheCiudadOrigen = (InternalEObject)theCiudadOrigen;
			theCiudadOrigen = (Ciudad)eResolveProxy(oldTheCiudadOrigen);
			if (theCiudadOrigen != oldTheCiudadOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnvioPackage.ENVIO__THE_CIUDAD_ORIGEN, oldTheCiudadOrigen, theCiudadOrigen));
			}
		}
		return theCiudadOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ciudad basicGetTheCiudadOrigen() {
		return theCiudadOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheCiudadOrigen(Ciudad newTheCiudadOrigen, NotificationChain msgs) {
		Ciudad oldTheCiudadOrigen = theCiudadOrigen;
		theCiudadOrigen = newTheCiudadOrigen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__THE_CIUDAD_ORIGEN, oldTheCiudadOrigen, newTheCiudadOrigen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheCiudadOrigen(Ciudad newTheCiudadOrigen) {
		if (newTheCiudadOrigen != theCiudadOrigen) {
			NotificationChain msgs = null;
			if (theCiudadOrigen != null)
				msgs = ((InternalEObject)theCiudadOrigen).eInverseRemove(this, UbicacionPackage.CIUDAD__THE_ENVIO_ORIGEN, Ciudad.class, msgs);
			if (newTheCiudadOrigen != null)
				msgs = ((InternalEObject)newTheCiudadOrigen).eInverseAdd(this, UbicacionPackage.CIUDAD__THE_ENVIO_ORIGEN, Ciudad.class, msgs);
			msgs = basicSetTheCiudadOrigen(newTheCiudadOrigen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__THE_CIUDAD_ORIGEN, newTheCiudadOrigen, newTheCiudadOrigen));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnvioPackage.ENVIO__LST_TRANSPORTE, oldLstTransporte, lstTransporte));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__LST_TRANSPORTE, oldLstTransporte, newLstTransporte);
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
				msgs = ((InternalEObject)lstTransporte).eInverseRemove(this, TransportePackage.TRANSPORTE__LST_ENVIO, Transporte.class, msgs);
			if (newLstTransporte != null)
				msgs = ((InternalEObject)newLstTransporte).eInverseAdd(this, TransportePackage.TRANSPORTE__LST_ENVIO, Transporte.class, msgs);
			msgs = basicSetLstTransporte(newLstTransporte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__LST_TRANSPORTE, newLstTransporte, newLstTransporte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetallePedido getLstDetallePedido() {
		return lstDetallePedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstDetallePedido(DetallePedido newLstDetallePedido, NotificationChain msgs) {
		DetallePedido oldLstDetallePedido = lstDetallePedido;
		lstDetallePedido = newLstDetallePedido;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__LST_DETALLE_PEDIDO, oldLstDetallePedido, newLstDetallePedido);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstDetallePedido(DetallePedido newLstDetallePedido) {
		if (newLstDetallePedido != lstDetallePedido) {
			NotificationChain msgs = null;
			if (lstDetallePedido != null)
				msgs = ((InternalEObject)lstDetallePedido).eInverseRemove(this, EnvioPackage.DETALLE_PEDIDO__OWENED_BY_ENVIO, DetallePedido.class, msgs);
			if (newLstDetallePedido != null)
				msgs = ((InternalEObject)newLstDetallePedido).eInverseAdd(this, EnvioPackage.DETALLE_PEDIDO__OWENED_BY_ENVIO, DetallePedido.class, msgs);
			msgs = basicSetLstDetallePedido(newLstDetallePedido, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__LST_DETALLE_PEDIDO, newLstDetallePedido, newLstDetallePedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNitEmpresa() {
		return nitEmpresa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNitEmpresa(String newNitEmpresa) {
		String oldNitEmpresa = nitEmpresa;
		nitEmpresa = newNitEmpresa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__NIT_EMPRESA, oldNitEmpresa, nitEmpresa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDireccionEmpresa(String newDireccionEmpresa) {
		String oldDireccionEmpresa = direccionEmpresa;
		direccionEmpresa = newDireccionEmpresa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__DIRECCION_EMPRESA, oldDireccionEmpresa, direccionEmpresa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdFactura() {
		return idFactura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdFactura(String newIdFactura) {
		String oldIdFactura = idFactura;
		idFactura = newIdFactura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__ID_FACTURA, oldIdFactura, idFactura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaEnvio() {
		return fechaEnvio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaEnvio(String newFechaEnvio) {
		String oldFechaEnvio = fechaEnvio;
		fechaEnvio = newFechaEnvio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__FECHA_ENVIO, oldFechaEnvio, fechaEnvio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaVencimiento(String newFechaVencimiento) {
		String oldFechaVencimiento = fechaVencimiento;
		fechaVencimiento = newFechaVencimiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__FECHA_VENCIMIENTO, oldFechaVencimiento, fechaVencimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ciudad getTheCiudadDestino() {
		if (theCiudadDestino != null && theCiudadDestino.eIsProxy()) {
			InternalEObject oldTheCiudadDestino = (InternalEObject)theCiudadDestino;
			theCiudadDestino = (Ciudad)eResolveProxy(oldTheCiudadDestino);
			if (theCiudadDestino != oldTheCiudadDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnvioPackage.ENVIO__THE_CIUDAD_DESTINO, oldTheCiudadDestino, theCiudadDestino));
			}
		}
		return theCiudadDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ciudad basicGetTheCiudadDestino() {
		return theCiudadDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheCiudadDestino(Ciudad newTheCiudadDestino, NotificationChain msgs) {
		Ciudad oldTheCiudadDestino = theCiudadDestino;
		theCiudadDestino = newTheCiudadDestino;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__THE_CIUDAD_DESTINO, oldTheCiudadDestino, newTheCiudadDestino);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheCiudadDestino(Ciudad newTheCiudadDestino) {
		if (newTheCiudadDestino != theCiudadDestino) {
			NotificationChain msgs = null;
			if (theCiudadDestino != null)
				msgs = ((InternalEObject)theCiudadDestino).eInverseRemove(this, UbicacionPackage.CIUDAD__THE_ENVIO_DESTINO, Ciudad.class, msgs);
			if (newTheCiudadDestino != null)
				msgs = ((InternalEObject)newTheCiudadDestino).eInverseAdd(this, UbicacionPackage.CIUDAD__THE_ENVIO_DESTINO, Ciudad.class, msgs);
			msgs = basicSetTheCiudadDestino(newTheCiudadDestino, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__THE_CIUDAD_DESTINO, newTheCiudadDestino, newTheCiudadDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pedido getLstPedido() {
		if (lstPedido != null && lstPedido.eIsProxy()) {
			InternalEObject oldLstPedido = (InternalEObject)lstPedido;
			lstPedido = (Pedido)eResolveProxy(oldLstPedido);
			if (lstPedido != oldLstPedido) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnvioPackage.ENVIO__LST_PEDIDO, oldLstPedido, lstPedido));
			}
		}
		return lstPedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pedido basicGetLstPedido() {
		return lstPedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstPedido(Pedido newLstPedido, NotificationChain msgs) {
		Pedido oldLstPedido = lstPedido;
		lstPedido = newLstPedido;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__LST_PEDIDO, oldLstPedido, newLstPedido);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstPedido(Pedido newLstPedido) {
		if (newLstPedido != lstPedido) {
			NotificationChain msgs = null;
			if (lstPedido != null)
				msgs = ((InternalEObject)lstPedido).eInverseRemove(this, PedidoPackage.PEDIDO__THE_ENVIO, Pedido.class, msgs);
			if (newLstPedido != null)
				msgs = ((InternalEObject)newLstPedido).eInverseAdd(this, PedidoPackage.PEDIDO__THE_ENVIO, Pedido.class, msgs);
			msgs = basicSetLstPedido(newLstPedido, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__LST_PEDIDO, newLstPedido, newLstPedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryEnvio getOwenedByFactoryEnvio() {
		if (eContainerFeatureID() != EnvioPackage.ENVIO__OWENED_BY_FACTORY_ENVIO) return null;
		return (FactoryEnvio)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByFactoryEnvio(FactoryEnvio newOwenedByFactoryEnvio, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByFactoryEnvio, EnvioPackage.ENVIO__OWENED_BY_FACTORY_ENVIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByFactoryEnvio(FactoryEnvio newOwenedByFactoryEnvio) {
		if (newOwenedByFactoryEnvio != eInternalContainer() || (eContainerFeatureID() != EnvioPackage.ENVIO__OWENED_BY_FACTORY_ENVIO && newOwenedByFactoryEnvio != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByFactoryEnvio))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByFactoryEnvio != null)
				msgs = ((InternalEObject)newOwenedByFactoryEnvio).eInverseAdd(this, EnvioPackage.FACTORY_ENVIO__LST_ENVIO, FactoryEnvio.class, msgs);
			msgs = basicSetOwenedByFactoryEnvio(newOwenedByFactoryEnvio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__OWENED_BY_FACTORY_ENVIO, newOwenedByFactoryEnvio, newOwenedByFactoryEnvio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruta getLstRuta() {
		if (lstRuta != null && lstRuta.eIsProxy()) {
			InternalEObject oldLstRuta = (InternalEObject)lstRuta;
			lstRuta = (Ruta)eResolveProxy(oldLstRuta);
			if (lstRuta != oldLstRuta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnvioPackage.ENVIO__LST_RUTA, oldLstRuta, lstRuta));
			}
		}
		return lstRuta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruta basicGetLstRuta() {
		return lstRuta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstRuta(Ruta newLstRuta, NotificationChain msgs) {
		Ruta oldLstRuta = lstRuta;
		lstRuta = newLstRuta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__LST_RUTA, oldLstRuta, newLstRuta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstRuta(Ruta newLstRuta) {
		if (newLstRuta != lstRuta) {
			NotificationChain msgs = null;
			if (lstRuta != null)
				msgs = ((InternalEObject)lstRuta).eInverseRemove(this, RutaPackage.RUTA__LST_ENVIO, Ruta.class, msgs);
			if (newLstRuta != null)
				msgs = ((InternalEObject)newLstRuta).eInverseAdd(this, RutaPackage.RUTA__LST_ENVIO, Ruta.class, msgs);
			msgs = basicSetLstRuta(newLstRuta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.ENVIO__LST_RUTA, newLstRuta, newLstRuta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnvioPackage.ENVIO__THE_CIUDAD_ORIGEN:
				if (theCiudadOrigen != null)
					msgs = ((InternalEObject)theCiudadOrigen).eInverseRemove(this, UbicacionPackage.CIUDAD__THE_ENVIO_ORIGEN, Ciudad.class, msgs);
				return basicSetTheCiudadOrigen((Ciudad)otherEnd, msgs);
			case EnvioPackage.ENVIO__LST_TRANSPORTE:
				if (lstTransporte != null)
					msgs = ((InternalEObject)lstTransporte).eInverseRemove(this, TransportePackage.TRANSPORTE__LST_ENVIO, Transporte.class, msgs);
				return basicSetLstTransporte((Transporte)otherEnd, msgs);
			case EnvioPackage.ENVIO__LST_DETALLE_PEDIDO:
				if (lstDetallePedido != null)
					msgs = ((InternalEObject)lstDetallePedido).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EnvioPackage.ENVIO__LST_DETALLE_PEDIDO, null, msgs);
				return basicSetLstDetallePedido((DetallePedido)otherEnd, msgs);
			case EnvioPackage.ENVIO__THE_CIUDAD_DESTINO:
				if (theCiudadDestino != null)
					msgs = ((InternalEObject)theCiudadDestino).eInverseRemove(this, UbicacionPackage.CIUDAD__THE_ENVIO_DESTINO, Ciudad.class, msgs);
				return basicSetTheCiudadDestino((Ciudad)otherEnd, msgs);
			case EnvioPackage.ENVIO__LST_PEDIDO:
				if (lstPedido != null)
					msgs = ((InternalEObject)lstPedido).eInverseRemove(this, PedidoPackage.PEDIDO__THE_ENVIO, Pedido.class, msgs);
				return basicSetLstPedido((Pedido)otherEnd, msgs);
			case EnvioPackage.ENVIO__OWENED_BY_FACTORY_ENVIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByFactoryEnvio((FactoryEnvio)otherEnd, msgs);
			case EnvioPackage.ENVIO__LST_RUTA:
				if (lstRuta != null)
					msgs = ((InternalEObject)lstRuta).eInverseRemove(this, RutaPackage.RUTA__LST_ENVIO, Ruta.class, msgs);
				return basicSetLstRuta((Ruta)otherEnd, msgs);
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
			case EnvioPackage.ENVIO__THE_CIUDAD_ORIGEN:
				return basicSetTheCiudadOrigen(null, msgs);
			case EnvioPackage.ENVIO__LST_TRANSPORTE:
				return basicSetLstTransporte(null, msgs);
			case EnvioPackage.ENVIO__LST_DETALLE_PEDIDO:
				return basicSetLstDetallePedido(null, msgs);
			case EnvioPackage.ENVIO__THE_CIUDAD_DESTINO:
				return basicSetTheCiudadDestino(null, msgs);
			case EnvioPackage.ENVIO__LST_PEDIDO:
				return basicSetLstPedido(null, msgs);
			case EnvioPackage.ENVIO__OWENED_BY_FACTORY_ENVIO:
				return basicSetOwenedByFactoryEnvio(null, msgs);
			case EnvioPackage.ENVIO__LST_RUTA:
				return basicSetLstRuta(null, msgs);
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
			case EnvioPackage.ENVIO__OWENED_BY_FACTORY_ENVIO:
				return eInternalContainer().eInverseRemove(this, EnvioPackage.FACTORY_ENVIO__LST_ENVIO, FactoryEnvio.class, msgs);
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
			case EnvioPackage.ENVIO__THE_CIUDAD_ORIGEN:
				if (resolve) return getTheCiudadOrigen();
				return basicGetTheCiudadOrigen();
			case EnvioPackage.ENVIO__LST_TRANSPORTE:
				if (resolve) return getLstTransporte();
				return basicGetLstTransporte();
			case EnvioPackage.ENVIO__LST_DETALLE_PEDIDO:
				return getLstDetallePedido();
			case EnvioPackage.ENVIO__ID:
				return getId();
			case EnvioPackage.ENVIO__NIT_EMPRESA:
				return getNitEmpresa();
			case EnvioPackage.ENVIO__DIRECCION_EMPRESA:
				return getDireccionEmpresa();
			case EnvioPackage.ENVIO__ID_FACTURA:
				return getIdFactura();
			case EnvioPackage.ENVIO__FECHA_ENVIO:
				return getFechaEnvio();
			case EnvioPackage.ENVIO__FECHA_VENCIMIENTO:
				return getFechaVencimiento();
			case EnvioPackage.ENVIO__THE_CIUDAD_DESTINO:
				if (resolve) return getTheCiudadDestino();
				return basicGetTheCiudadDestino();
			case EnvioPackage.ENVIO__LST_PEDIDO:
				if (resolve) return getLstPedido();
				return basicGetLstPedido();
			case EnvioPackage.ENVIO__OWENED_BY_FACTORY_ENVIO:
				return getOwenedByFactoryEnvio();
			case EnvioPackage.ENVIO__LST_RUTA:
				if (resolve) return getLstRuta();
				return basicGetLstRuta();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EnvioPackage.ENVIO__THE_CIUDAD_ORIGEN:
				setTheCiudadOrigen((Ciudad)newValue);
				return;
			case EnvioPackage.ENVIO__LST_TRANSPORTE:
				setLstTransporte((Transporte)newValue);
				return;
			case EnvioPackage.ENVIO__LST_DETALLE_PEDIDO:
				setLstDetallePedido((DetallePedido)newValue);
				return;
			case EnvioPackage.ENVIO__ID:
				setId((String)newValue);
				return;
			case EnvioPackage.ENVIO__NIT_EMPRESA:
				setNitEmpresa((String)newValue);
				return;
			case EnvioPackage.ENVIO__DIRECCION_EMPRESA:
				setDireccionEmpresa((String)newValue);
				return;
			case EnvioPackage.ENVIO__ID_FACTURA:
				setIdFactura((String)newValue);
				return;
			case EnvioPackage.ENVIO__FECHA_ENVIO:
				setFechaEnvio((String)newValue);
				return;
			case EnvioPackage.ENVIO__FECHA_VENCIMIENTO:
				setFechaVencimiento((String)newValue);
				return;
			case EnvioPackage.ENVIO__THE_CIUDAD_DESTINO:
				setTheCiudadDestino((Ciudad)newValue);
				return;
			case EnvioPackage.ENVIO__LST_PEDIDO:
				setLstPedido((Pedido)newValue);
				return;
			case EnvioPackage.ENVIO__OWENED_BY_FACTORY_ENVIO:
				setOwenedByFactoryEnvio((FactoryEnvio)newValue);
				return;
			case EnvioPackage.ENVIO__LST_RUTA:
				setLstRuta((Ruta)newValue);
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
			case EnvioPackage.ENVIO__THE_CIUDAD_ORIGEN:
				setTheCiudadOrigen((Ciudad)null);
				return;
			case EnvioPackage.ENVIO__LST_TRANSPORTE:
				setLstTransporte((Transporte)null);
				return;
			case EnvioPackage.ENVIO__LST_DETALLE_PEDIDO:
				setLstDetallePedido((DetallePedido)null);
				return;
			case EnvioPackage.ENVIO__ID:
				setId(ID_EDEFAULT);
				return;
			case EnvioPackage.ENVIO__NIT_EMPRESA:
				setNitEmpresa(NIT_EMPRESA_EDEFAULT);
				return;
			case EnvioPackage.ENVIO__DIRECCION_EMPRESA:
				setDireccionEmpresa(DIRECCION_EMPRESA_EDEFAULT);
				return;
			case EnvioPackage.ENVIO__ID_FACTURA:
				setIdFactura(ID_FACTURA_EDEFAULT);
				return;
			case EnvioPackage.ENVIO__FECHA_ENVIO:
				setFechaEnvio(FECHA_ENVIO_EDEFAULT);
				return;
			case EnvioPackage.ENVIO__FECHA_VENCIMIENTO:
				setFechaVencimiento(FECHA_VENCIMIENTO_EDEFAULT);
				return;
			case EnvioPackage.ENVIO__THE_CIUDAD_DESTINO:
				setTheCiudadDestino((Ciudad)null);
				return;
			case EnvioPackage.ENVIO__LST_PEDIDO:
				setLstPedido((Pedido)null);
				return;
			case EnvioPackage.ENVIO__OWENED_BY_FACTORY_ENVIO:
				setOwenedByFactoryEnvio((FactoryEnvio)null);
				return;
			case EnvioPackage.ENVIO__LST_RUTA:
				setLstRuta((Ruta)null);
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
			case EnvioPackage.ENVIO__THE_CIUDAD_ORIGEN:
				return theCiudadOrigen != null;
			case EnvioPackage.ENVIO__LST_TRANSPORTE:
				return lstTransporte != null;
			case EnvioPackage.ENVIO__LST_DETALLE_PEDIDO:
				return lstDetallePedido != null;
			case EnvioPackage.ENVIO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EnvioPackage.ENVIO__NIT_EMPRESA:
				return NIT_EMPRESA_EDEFAULT == null ? nitEmpresa != null : !NIT_EMPRESA_EDEFAULT.equals(nitEmpresa);
			case EnvioPackage.ENVIO__DIRECCION_EMPRESA:
				return DIRECCION_EMPRESA_EDEFAULT == null ? direccionEmpresa != null : !DIRECCION_EMPRESA_EDEFAULT.equals(direccionEmpresa);
			case EnvioPackage.ENVIO__ID_FACTURA:
				return ID_FACTURA_EDEFAULT == null ? idFactura != null : !ID_FACTURA_EDEFAULT.equals(idFactura);
			case EnvioPackage.ENVIO__FECHA_ENVIO:
				return FECHA_ENVIO_EDEFAULT == null ? fechaEnvio != null : !FECHA_ENVIO_EDEFAULT.equals(fechaEnvio);
			case EnvioPackage.ENVIO__FECHA_VENCIMIENTO:
				return FECHA_VENCIMIENTO_EDEFAULT == null ? fechaVencimiento != null : !FECHA_VENCIMIENTO_EDEFAULT.equals(fechaVencimiento);
			case EnvioPackage.ENVIO__THE_CIUDAD_DESTINO:
				return theCiudadDestino != null;
			case EnvioPackage.ENVIO__LST_PEDIDO:
				return lstPedido != null;
			case EnvioPackage.ENVIO__OWENED_BY_FACTORY_ENVIO:
				return getOwenedByFactoryEnvio() != null;
			case EnvioPackage.ENVIO__LST_RUTA:
				return lstRuta != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", nitEmpresa: ");
		result.append(nitEmpresa);
		result.append(", direccionEmpresa: ");
		result.append(direccionEmpresa);
		result.append(", idFactura: ");
		result.append(idFactura);
		result.append(", fechaEnvio: ");
		result.append(fechaEnvio);
		result.append(", fechaVencimiento: ");
		result.append(fechaVencimiento);
		result.append(')');
		return result.toString();
	}

} //EnvioImpl
