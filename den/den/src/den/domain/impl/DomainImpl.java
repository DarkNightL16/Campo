/**
 */
package den.domain.impl;

import den.ModelFactory;
import den.denPackage;

import den.domain.Domain;
import den.domain.DomainPackage;

import den.domain.envio.EnvioPackage;
import den.domain.envio.FactoryEnvio;

import den.domain.pedido.FactoryPedido;
import den.domain.pedido.PedidoPackage;

import den.domain.persona.FactoryPersona;
import den.domain.persona.PersonaPackage;

import den.domain.producto.FactoryProducto;
import den.domain.producto.ProductoPackage;

import den.domain.ruta.FactoryRuta;
import den.domain.ruta.RutaPackage;

import den.domain.transporte.FactoryTransporte;
import den.domain.transporte.TransportePackage;

import den.domain.ubicacion.FactoryUbicacion;
import den.domain.ubicacion.UbicacionPackage;

import den.ui.UI;
import den.ui.UiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.impl.DomainImpl#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link den.domain.impl.DomainImpl#getLstFactoryUbicacion <em>Lst Factory Ubicacion</em>}</li>
 *   <li>{@link den.domain.impl.DomainImpl#getLstFactoryPedido <em>Lst Factory Pedido</em>}</li>
 *   <li>{@link den.domain.impl.DomainImpl#getLstFactoryTransporte <em>Lst Factory Transporte</em>}</li>
 *   <li>{@link den.domain.impl.DomainImpl#getLstFactoryPersona <em>Lst Factory Persona</em>}</li>
 *   <li>{@link den.domain.impl.DomainImpl#getLstFactoryProducto <em>Lst Factory Producto</em>}</li>
 *   <li>{@link den.domain.impl.DomainImpl#getLstFactoryEnvio <em>Lst Factory Envio</em>}</li>
 *   <li>{@link den.domain.impl.DomainImpl#getLstFactoryRuta <em>Lst Factory Ruta</em>}</li>
 *   <li>{@link den.domain.impl.DomainImpl#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends EObjectImpl implements Domain {
	/**
	 * The cached value of the '{@link #getLstFactoryUbicacion() <em>Lst Factory Ubicacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstFactoryUbicacion()
	 * @generated
	 * @ordered
	 */
	protected FactoryUbicacion lstFactoryUbicacion;

	/**
	 * The cached value of the '{@link #getLstFactoryPedido() <em>Lst Factory Pedido</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstFactoryPedido()
	 * @generated
	 * @ordered
	 */
	protected FactoryPedido lstFactoryPedido;

	/**
	 * The cached value of the '{@link #getLstFactoryTransporte() <em>Lst Factory Transporte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstFactoryTransporte()
	 * @generated
	 * @ordered
	 */
	protected FactoryTransporte lstFactoryTransporte;

	/**
	 * The cached value of the '{@link #getLstFactoryPersona() <em>Lst Factory Persona</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstFactoryPersona()
	 * @generated
	 * @ordered
	 */
	protected FactoryPersona lstFactoryPersona;

	/**
	 * The cached value of the '{@link #getLstFactoryProducto() <em>Lst Factory Producto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstFactoryProducto()
	 * @generated
	 * @ordered
	 */
	protected FactoryProducto lstFactoryProducto;

	/**
	 * The cached value of the '{@link #getLstFactoryEnvio() <em>Lst Factory Envio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstFactoryEnvio()
	 * @generated
	 * @ordered
	 */
	protected FactoryEnvio lstFactoryEnvio;

	/**
	 * The cached value of the '{@link #getLstFactoryRuta() <em>Lst Factory Ruta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstFactoryRuta()
	 * @generated
	 * @ordered
	 */
	protected FactoryRuta lstFactoryRuta;

	/**
	 * The cached value of the '{@link #getTheUI() <em>The UI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheUI()
	 * @generated
	 * @ordered
	 */
	protected UI theUI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getTheModelFactory() {
		if (eContainerFeatureID() != DomainPackage.DOMAIN__THE_MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheModelFactory(ModelFactory newTheModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheModelFactory, DomainPackage.DOMAIN__THE_MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheModelFactory(ModelFactory newTheModelFactory) {
		if (newTheModelFactory != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DOMAIN__THE_MODEL_FACTORY && newTheModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newTheModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheModelFactory != null)
				msgs = ((InternalEObject)newTheModelFactory).eInverseAdd(this, denPackage.MODEL_FACTORY__THE_DOMAIN, ModelFactory.class, msgs);
			msgs = basicSetTheModelFactory(newTheModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_MODEL_FACTORY, newTheModelFactory, newTheModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryUbicacion getLstFactoryUbicacion() {
		return lstFactoryUbicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstFactoryUbicacion(FactoryUbicacion newLstFactoryUbicacion, NotificationChain msgs) {
		FactoryUbicacion oldLstFactoryUbicacion = lstFactoryUbicacion;
		lstFactoryUbicacion = newLstFactoryUbicacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__LST_FACTORY_UBICACION, oldLstFactoryUbicacion, newLstFactoryUbicacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstFactoryUbicacion(FactoryUbicacion newLstFactoryUbicacion) {
		if (newLstFactoryUbicacion != lstFactoryUbicacion) {
			NotificationChain msgs = null;
			if (lstFactoryUbicacion != null)
				msgs = ((InternalEObject)lstFactoryUbicacion).eInverseRemove(this, UbicacionPackage.FACTORY_UBICACION__OWENED_BY_DOMAIN, FactoryUbicacion.class, msgs);
			if (newLstFactoryUbicacion != null)
				msgs = ((InternalEObject)newLstFactoryUbicacion).eInverseAdd(this, UbicacionPackage.FACTORY_UBICACION__OWENED_BY_DOMAIN, FactoryUbicacion.class, msgs);
			msgs = basicSetLstFactoryUbicacion(newLstFactoryUbicacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__LST_FACTORY_UBICACION, newLstFactoryUbicacion, newLstFactoryUbicacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryPedido getLstFactoryPedido() {
		return lstFactoryPedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstFactoryPedido(FactoryPedido newLstFactoryPedido, NotificationChain msgs) {
		FactoryPedido oldLstFactoryPedido = lstFactoryPedido;
		lstFactoryPedido = newLstFactoryPedido;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__LST_FACTORY_PEDIDO, oldLstFactoryPedido, newLstFactoryPedido);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstFactoryPedido(FactoryPedido newLstFactoryPedido) {
		if (newLstFactoryPedido != lstFactoryPedido) {
			NotificationChain msgs = null;
			if (lstFactoryPedido != null)
				msgs = ((InternalEObject)lstFactoryPedido).eInverseRemove(this, PedidoPackage.FACTORY_PEDIDO__OWENED_BY_DOMAIN, FactoryPedido.class, msgs);
			if (newLstFactoryPedido != null)
				msgs = ((InternalEObject)newLstFactoryPedido).eInverseAdd(this, PedidoPackage.FACTORY_PEDIDO__OWENED_BY_DOMAIN, FactoryPedido.class, msgs);
			msgs = basicSetLstFactoryPedido(newLstFactoryPedido, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__LST_FACTORY_PEDIDO, newLstFactoryPedido, newLstFactoryPedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryTransporte getLstFactoryTransporte() {
		return lstFactoryTransporte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstFactoryTransporte(FactoryTransporte newLstFactoryTransporte, NotificationChain msgs) {
		FactoryTransporte oldLstFactoryTransporte = lstFactoryTransporte;
		lstFactoryTransporte = newLstFactoryTransporte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__LST_FACTORY_TRANSPORTE, oldLstFactoryTransporte, newLstFactoryTransporte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstFactoryTransporte(FactoryTransporte newLstFactoryTransporte) {
		if (newLstFactoryTransporte != lstFactoryTransporte) {
			NotificationChain msgs = null;
			if (lstFactoryTransporte != null)
				msgs = ((InternalEObject)lstFactoryTransporte).eInverseRemove(this, TransportePackage.FACTORY_TRANSPORTE__OWENED_BY_DOMAIN, FactoryTransporte.class, msgs);
			if (newLstFactoryTransporte != null)
				msgs = ((InternalEObject)newLstFactoryTransporte).eInverseAdd(this, TransportePackage.FACTORY_TRANSPORTE__OWENED_BY_DOMAIN, FactoryTransporte.class, msgs);
			msgs = basicSetLstFactoryTransporte(newLstFactoryTransporte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__LST_FACTORY_TRANSPORTE, newLstFactoryTransporte, newLstFactoryTransporte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryPersona getLstFactoryPersona() {
		return lstFactoryPersona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstFactoryPersona(FactoryPersona newLstFactoryPersona, NotificationChain msgs) {
		FactoryPersona oldLstFactoryPersona = lstFactoryPersona;
		lstFactoryPersona = newLstFactoryPersona;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__LST_FACTORY_PERSONA, oldLstFactoryPersona, newLstFactoryPersona);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstFactoryPersona(FactoryPersona newLstFactoryPersona) {
		if (newLstFactoryPersona != lstFactoryPersona) {
			NotificationChain msgs = null;
			if (lstFactoryPersona != null)
				msgs = ((InternalEObject)lstFactoryPersona).eInverseRemove(this, PersonaPackage.FACTORY_PERSONA__OWENED_BY_DOMAIN, FactoryPersona.class, msgs);
			if (newLstFactoryPersona != null)
				msgs = ((InternalEObject)newLstFactoryPersona).eInverseAdd(this, PersonaPackage.FACTORY_PERSONA__OWENED_BY_DOMAIN, FactoryPersona.class, msgs);
			msgs = basicSetLstFactoryPersona(newLstFactoryPersona, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__LST_FACTORY_PERSONA, newLstFactoryPersona, newLstFactoryPersona));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryProducto getLstFactoryProducto() {
		return lstFactoryProducto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstFactoryProducto(FactoryProducto newLstFactoryProducto, NotificationChain msgs) {
		FactoryProducto oldLstFactoryProducto = lstFactoryProducto;
		lstFactoryProducto = newLstFactoryProducto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__LST_FACTORY_PRODUCTO, oldLstFactoryProducto, newLstFactoryProducto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstFactoryProducto(FactoryProducto newLstFactoryProducto) {
		if (newLstFactoryProducto != lstFactoryProducto) {
			NotificationChain msgs = null;
			if (lstFactoryProducto != null)
				msgs = ((InternalEObject)lstFactoryProducto).eInverseRemove(this, ProductoPackage.FACTORY_PRODUCTO__OWENED_BY_DOMAIN, FactoryProducto.class, msgs);
			if (newLstFactoryProducto != null)
				msgs = ((InternalEObject)newLstFactoryProducto).eInverseAdd(this, ProductoPackage.FACTORY_PRODUCTO__OWENED_BY_DOMAIN, FactoryProducto.class, msgs);
			msgs = basicSetLstFactoryProducto(newLstFactoryProducto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__LST_FACTORY_PRODUCTO, newLstFactoryProducto, newLstFactoryProducto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryEnvio getLstFactoryEnvio() {
		return lstFactoryEnvio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstFactoryEnvio(FactoryEnvio newLstFactoryEnvio, NotificationChain msgs) {
		FactoryEnvio oldLstFactoryEnvio = lstFactoryEnvio;
		lstFactoryEnvio = newLstFactoryEnvio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__LST_FACTORY_ENVIO, oldLstFactoryEnvio, newLstFactoryEnvio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstFactoryEnvio(FactoryEnvio newLstFactoryEnvio) {
		if (newLstFactoryEnvio != lstFactoryEnvio) {
			NotificationChain msgs = null;
			if (lstFactoryEnvio != null)
				msgs = ((InternalEObject)lstFactoryEnvio).eInverseRemove(this, EnvioPackage.FACTORY_ENVIO__OWENED_BY_DOMAIN, FactoryEnvio.class, msgs);
			if (newLstFactoryEnvio != null)
				msgs = ((InternalEObject)newLstFactoryEnvio).eInverseAdd(this, EnvioPackage.FACTORY_ENVIO__OWENED_BY_DOMAIN, FactoryEnvio.class, msgs);
			msgs = basicSetLstFactoryEnvio(newLstFactoryEnvio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__LST_FACTORY_ENVIO, newLstFactoryEnvio, newLstFactoryEnvio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryRuta getLstFactoryRuta() {
		return lstFactoryRuta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstFactoryRuta(FactoryRuta newLstFactoryRuta, NotificationChain msgs) {
		FactoryRuta oldLstFactoryRuta = lstFactoryRuta;
		lstFactoryRuta = newLstFactoryRuta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__LST_FACTORY_RUTA, oldLstFactoryRuta, newLstFactoryRuta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstFactoryRuta(FactoryRuta newLstFactoryRuta) {
		if (newLstFactoryRuta != lstFactoryRuta) {
			NotificationChain msgs = null;
			if (lstFactoryRuta != null)
				msgs = ((InternalEObject)lstFactoryRuta).eInverseRemove(this, RutaPackage.FACTORY_RUTA__OWENED_BY_DOMAIN, FactoryRuta.class, msgs);
			if (newLstFactoryRuta != null)
				msgs = ((InternalEObject)newLstFactoryRuta).eInverseAdd(this, RutaPackage.FACTORY_RUTA__OWENED_BY_DOMAIN, FactoryRuta.class, msgs);
			msgs = basicSetLstFactoryRuta(newLstFactoryRuta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__LST_FACTORY_RUTA, newLstFactoryRuta, newLstFactoryRuta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getTheUI() {
		if (theUI != null && theUI.eIsProxy()) {
			InternalEObject oldTheUI = (InternalEObject)theUI;
			theUI = (UI)eResolveProxy(oldTheUI);
			if (theUI != oldTheUI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DOMAIN__THE_UI, oldTheUI, theUI));
			}
		}
		return theUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI basicGetTheUI() {
		return theUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheUI(UI newTheUI, NotificationChain msgs) {
		UI oldTheUI = theUI;
		theUI = newTheUI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UI, oldTheUI, newTheUI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheUI(UI newTheUI) {
		if (newTheUI != theUI) {
			NotificationChain msgs = null;
			if (theUI != null)
				msgs = ((InternalEObject)theUI).eInverseRemove(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
			if (newTheUI != null)
				msgs = ((InternalEObject)newTheUI).eInverseAdd(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
			msgs = basicSetTheUI(newTheUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UI, newTheUI, newTheUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		//TODO implementarModelo
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheModelFactory((ModelFactory)otherEnd, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_UBICACION:
				if (lstFactoryUbicacion != null)
					msgs = ((InternalEObject)lstFactoryUbicacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__LST_FACTORY_UBICACION, null, msgs);
				return basicSetLstFactoryUbicacion((FactoryUbicacion)otherEnd, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_PEDIDO:
				if (lstFactoryPedido != null)
					msgs = ((InternalEObject)lstFactoryPedido).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__LST_FACTORY_PEDIDO, null, msgs);
				return basicSetLstFactoryPedido((FactoryPedido)otherEnd, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_TRANSPORTE:
				if (lstFactoryTransporte != null)
					msgs = ((InternalEObject)lstFactoryTransporte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__LST_FACTORY_TRANSPORTE, null, msgs);
				return basicSetLstFactoryTransporte((FactoryTransporte)otherEnd, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_PERSONA:
				if (lstFactoryPersona != null)
					msgs = ((InternalEObject)lstFactoryPersona).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__LST_FACTORY_PERSONA, null, msgs);
				return basicSetLstFactoryPersona((FactoryPersona)otherEnd, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_PRODUCTO:
				if (lstFactoryProducto != null)
					msgs = ((InternalEObject)lstFactoryProducto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__LST_FACTORY_PRODUCTO, null, msgs);
				return basicSetLstFactoryProducto((FactoryProducto)otherEnd, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_ENVIO:
				if (lstFactoryEnvio != null)
					msgs = ((InternalEObject)lstFactoryEnvio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__LST_FACTORY_ENVIO, null, msgs);
				return basicSetLstFactoryEnvio((FactoryEnvio)otherEnd, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_RUTA:
				if (lstFactoryRuta != null)
					msgs = ((InternalEObject)lstFactoryRuta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__LST_FACTORY_RUTA, null, msgs);
				return basicSetLstFactoryRuta((FactoryRuta)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_UI:
				if (theUI != null)
					msgs = ((InternalEObject)theUI).eInverseRemove(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
				return basicSetTheUI((UI)otherEnd, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return basicSetTheModelFactory(null, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_UBICACION:
				return basicSetLstFactoryUbicacion(null, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_PEDIDO:
				return basicSetLstFactoryPedido(null, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_TRANSPORTE:
				return basicSetLstFactoryTransporte(null, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_PERSONA:
				return basicSetLstFactoryPersona(null, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_PRODUCTO:
				return basicSetLstFactoryProducto(null, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_ENVIO:
				return basicSetLstFactoryEnvio(null, msgs);
			case DomainPackage.DOMAIN__LST_FACTORY_RUTA:
				return basicSetLstFactoryRuta(null, msgs);
			case DomainPackage.DOMAIN__THE_UI:
				return basicSetTheUI(null, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, denPackage.MODEL_FACTORY__THE_DOMAIN, ModelFactory.class, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return getTheModelFactory();
			case DomainPackage.DOMAIN__LST_FACTORY_UBICACION:
				return getLstFactoryUbicacion();
			case DomainPackage.DOMAIN__LST_FACTORY_PEDIDO:
				return getLstFactoryPedido();
			case DomainPackage.DOMAIN__LST_FACTORY_TRANSPORTE:
				return getLstFactoryTransporte();
			case DomainPackage.DOMAIN__LST_FACTORY_PERSONA:
				return getLstFactoryPersona();
			case DomainPackage.DOMAIN__LST_FACTORY_PRODUCTO:
				return getLstFactoryProducto();
			case DomainPackage.DOMAIN__LST_FACTORY_ENVIO:
				return getLstFactoryEnvio();
			case DomainPackage.DOMAIN__LST_FACTORY_RUTA:
				return getLstFactoryRuta();
			case DomainPackage.DOMAIN__THE_UI:
				if (resolve) return getTheUI();
				return basicGetTheUI();
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)newValue);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_UBICACION:
				setLstFactoryUbicacion((FactoryUbicacion)newValue);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_PEDIDO:
				setLstFactoryPedido((FactoryPedido)newValue);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_TRANSPORTE:
				setLstFactoryTransporte((FactoryTransporte)newValue);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_PERSONA:
				setLstFactoryPersona((FactoryPersona)newValue);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_PRODUCTO:
				setLstFactoryProducto((FactoryProducto)newValue);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_ENVIO:
				setLstFactoryEnvio((FactoryEnvio)newValue);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_RUTA:
				setLstFactoryRuta((FactoryRuta)newValue);
				return;
			case DomainPackage.DOMAIN__THE_UI:
				setTheUI((UI)newValue);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)null);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_UBICACION:
				setLstFactoryUbicacion((FactoryUbicacion)null);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_PEDIDO:
				setLstFactoryPedido((FactoryPedido)null);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_TRANSPORTE:
				setLstFactoryTransporte((FactoryTransporte)null);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_PERSONA:
				setLstFactoryPersona((FactoryPersona)null);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_PRODUCTO:
				setLstFactoryProducto((FactoryProducto)null);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_ENVIO:
				setLstFactoryEnvio((FactoryEnvio)null);
				return;
			case DomainPackage.DOMAIN__LST_FACTORY_RUTA:
				setLstFactoryRuta((FactoryRuta)null);
				return;
			case DomainPackage.DOMAIN__THE_UI:
				setTheUI((UI)null);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return getTheModelFactory() != null;
			case DomainPackage.DOMAIN__LST_FACTORY_UBICACION:
				return lstFactoryUbicacion != null;
			case DomainPackage.DOMAIN__LST_FACTORY_PEDIDO:
				return lstFactoryPedido != null;
			case DomainPackage.DOMAIN__LST_FACTORY_TRANSPORTE:
				return lstFactoryTransporte != null;
			case DomainPackage.DOMAIN__LST_FACTORY_PERSONA:
				return lstFactoryPersona != null;
			case DomainPackage.DOMAIN__LST_FACTORY_PRODUCTO:
				return lstFactoryProducto != null;
			case DomainPackage.DOMAIN__LST_FACTORY_ENVIO:
				return lstFactoryEnvio != null;
			case DomainPackage.DOMAIN__LST_FACTORY_RUTA:
				return lstFactoryRuta != null;
			case DomainPackage.DOMAIN__THE_UI:
				return theUI != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
