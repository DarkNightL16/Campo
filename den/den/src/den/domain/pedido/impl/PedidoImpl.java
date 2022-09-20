/**
 */
package den.domain.pedido.impl;

import den.domain.envio.Envio;
import den.domain.envio.EnvioPackage;

import den.domain.pedido.DetallePedido;
import den.domain.pedido.FactoryPedido;
import den.domain.pedido.Pedido;
import den.domain.pedido.PedidoPackage;

import den.domain.persona.Persona;
import den.domain.persona.PersonaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pedido</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.pedido.impl.PedidoImpl#getId <em>Id</em>}</li>
 *   <li>{@link den.domain.pedido.impl.PedidoImpl#getFecha <em>Fecha</em>}</li>
 *   <li>{@link den.domain.pedido.impl.PedidoImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link den.domain.pedido.impl.PedidoImpl#getSubTotal <em>Sub Total</em>}</li>
 *   <li>{@link den.domain.pedido.impl.PedidoImpl#getIva <em>Iva</em>}</li>
 *   <li>{@link den.domain.pedido.impl.PedidoImpl#getDescuento <em>Descuento</em>}</li>
 *   <li>{@link den.domain.pedido.impl.PedidoImpl#getLstDetallePedido <em>Lst Detalle Pedido</em>}</li>
 *   <li>{@link den.domain.pedido.impl.PedidoImpl#getOwenedByFactoryPedido <em>Owened By Factory Pedido</em>}</li>
 *   <li>{@link den.domain.pedido.impl.PedidoImpl#getLstPersona <em>Lst Persona</em>}</li>
 *   <li>{@link den.domain.pedido.impl.PedidoImpl#getTheEnvio <em>The Envio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PedidoImpl extends EObjectImpl implements Pedido {
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
	 * The default value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected String fecha = FECHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected String total = TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubTotal() <em>Sub Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTotal()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_TOTAL_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getSubTotal() <em>Sub Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTotal()
	 * @generated
	 * @ordered
	 */
	protected String subTotal = SUB_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIva() <em>Iva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIva()
	 * @generated
	 * @ordered
	 */
	protected static final String IVA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIva() <em>Iva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIva()
	 * @generated
	 * @ordered
	 */
	protected String iva = IVA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescuento() <em>Descuento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescuento()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCUENTO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDescuento() <em>Descuento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescuento()
	 * @generated
	 * @ordered
	 */
	protected String descuento = DESCUENTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstDetallePedido() <em>Lst Detalle Pedido</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstDetallePedido()
	 * @generated
	 * @ordered
	 */
	protected EList<DetallePedido> lstDetallePedido;

	/**
	 * The cached value of the '{@link #getLstPersona() <em>Lst Persona</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPersona()
	 * @generated
	 * @ordered
	 */
	protected Persona lstPersona;

	/**
	 * The cached value of the '{@link #getTheEnvio() <em>The Envio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheEnvio()
	 * @generated
	 * @ordered
	 */
	protected Envio theEnvio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedidoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PedidoPackage.Literals.PEDIDO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFecha(String newFecha) {
		String oldFecha = fecha;
		fecha = newFecha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__FECHA, oldFecha, fecha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(String newTotal) {
		String oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubTotal() {
		return subTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubTotal(String newSubTotal) {
		String oldSubTotal = subTotal;
		subTotal = newSubTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__SUB_TOTAL, oldSubTotal, subTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIva() {
		return iva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIva(String newIva) {
		String oldIva = iva;
		iva = newIva;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__IVA, oldIva, iva));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescuento() {
		return descuento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescuento(String newDescuento) {
		String oldDescuento = descuento;
		descuento = newDescuento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__DESCUENTO, oldDescuento, descuento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DetallePedido> getLstDetallePedido() {
		if (lstDetallePedido == null) {
			lstDetallePedido = new EObjectContainmentWithInverseEList<DetallePedido>(DetallePedido.class, this, PedidoPackage.PEDIDO__LST_DETALLE_PEDIDO, PedidoPackage.DETALLE_PEDIDO__OWENED_BY_PEDIDO);
		}
		return lstDetallePedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryPedido getOwenedByFactoryPedido() {
		if (eContainerFeatureID() != PedidoPackage.PEDIDO__OWENED_BY_FACTORY_PEDIDO) return null;
		return (FactoryPedido)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByFactoryPedido(FactoryPedido newOwenedByFactoryPedido, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByFactoryPedido, PedidoPackage.PEDIDO__OWENED_BY_FACTORY_PEDIDO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByFactoryPedido(FactoryPedido newOwenedByFactoryPedido) {
		if (newOwenedByFactoryPedido != eInternalContainer() || (eContainerFeatureID() != PedidoPackage.PEDIDO__OWENED_BY_FACTORY_PEDIDO && newOwenedByFactoryPedido != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByFactoryPedido))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByFactoryPedido != null)
				msgs = ((InternalEObject)newOwenedByFactoryPedido).eInverseAdd(this, PedidoPackage.FACTORY_PEDIDO__LST_PEDIDO, FactoryPedido.class, msgs);
			msgs = basicSetOwenedByFactoryPedido(newOwenedByFactoryPedido, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__OWENED_BY_FACTORY_PEDIDO, newOwenedByFactoryPedido, newOwenedByFactoryPedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona getLstPersona() {
		if (lstPersona != null && lstPersona.eIsProxy()) {
			InternalEObject oldLstPersona = (InternalEObject)lstPersona;
			lstPersona = (Persona)eResolveProxy(oldLstPersona);
			if (lstPersona != oldLstPersona) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PedidoPackage.PEDIDO__LST_PERSONA, oldLstPersona, lstPersona));
			}
		}
		return lstPersona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona basicGetLstPersona() {
		return lstPersona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstPersona(Persona newLstPersona, NotificationChain msgs) {
		Persona oldLstPersona = lstPersona;
		lstPersona = newLstPersona;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__LST_PERSONA, oldLstPersona, newLstPersona);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstPersona(Persona newLstPersona) {
		if (newLstPersona != lstPersona) {
			NotificationChain msgs = null;
			if (lstPersona != null)
				msgs = ((InternalEObject)lstPersona).eInverseRemove(this, PersonaPackage.PERSONA__LST_PEDIDO, Persona.class, msgs);
			if (newLstPersona != null)
				msgs = ((InternalEObject)newLstPersona).eInverseAdd(this, PersonaPackage.PERSONA__LST_PEDIDO, Persona.class, msgs);
			msgs = basicSetLstPersona(newLstPersona, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__LST_PERSONA, newLstPersona, newLstPersona));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Envio getTheEnvio() {
		if (theEnvio != null && theEnvio.eIsProxy()) {
			InternalEObject oldTheEnvio = (InternalEObject)theEnvio;
			theEnvio = (Envio)eResolveProxy(oldTheEnvio);
			if (theEnvio != oldTheEnvio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PedidoPackage.PEDIDO__THE_ENVIO, oldTheEnvio, theEnvio));
			}
		}
		return theEnvio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Envio basicGetTheEnvio() {
		return theEnvio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheEnvio(Envio newTheEnvio, NotificationChain msgs) {
		Envio oldTheEnvio = theEnvio;
		theEnvio = newTheEnvio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__THE_ENVIO, oldTheEnvio, newTheEnvio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheEnvio(Envio newTheEnvio) {
		if (newTheEnvio != theEnvio) {
			NotificationChain msgs = null;
			if (theEnvio != null)
				msgs = ((InternalEObject)theEnvio).eInverseRemove(this, EnvioPackage.ENVIO__LST_PEDIDO, Envio.class, msgs);
			if (newTheEnvio != null)
				msgs = ((InternalEObject)newTheEnvio).eInverseAdd(this, EnvioPackage.ENVIO__LST_PEDIDO, Envio.class, msgs);
			msgs = basicSetTheEnvio(newTheEnvio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.PEDIDO__THE_ENVIO, newTheEnvio, newTheEnvio));
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
			case PedidoPackage.PEDIDO__LST_DETALLE_PEDIDO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstDetallePedido()).basicAdd(otherEnd, msgs);
			case PedidoPackage.PEDIDO__OWENED_BY_FACTORY_PEDIDO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByFactoryPedido((FactoryPedido)otherEnd, msgs);
			case PedidoPackage.PEDIDO__LST_PERSONA:
				if (lstPersona != null)
					msgs = ((InternalEObject)lstPersona).eInverseRemove(this, PersonaPackage.PERSONA__LST_PEDIDO, Persona.class, msgs);
				return basicSetLstPersona((Persona)otherEnd, msgs);
			case PedidoPackage.PEDIDO__THE_ENVIO:
				if (theEnvio != null)
					msgs = ((InternalEObject)theEnvio).eInverseRemove(this, EnvioPackage.ENVIO__LST_PEDIDO, Envio.class, msgs);
				return basicSetTheEnvio((Envio)otherEnd, msgs);
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
			case PedidoPackage.PEDIDO__LST_DETALLE_PEDIDO:
				return ((InternalEList<?>)getLstDetallePedido()).basicRemove(otherEnd, msgs);
			case PedidoPackage.PEDIDO__OWENED_BY_FACTORY_PEDIDO:
				return basicSetOwenedByFactoryPedido(null, msgs);
			case PedidoPackage.PEDIDO__LST_PERSONA:
				return basicSetLstPersona(null, msgs);
			case PedidoPackage.PEDIDO__THE_ENVIO:
				return basicSetTheEnvio(null, msgs);
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
			case PedidoPackage.PEDIDO__OWENED_BY_FACTORY_PEDIDO:
				return eInternalContainer().eInverseRemove(this, PedidoPackage.FACTORY_PEDIDO__LST_PEDIDO, FactoryPedido.class, msgs);
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
			case PedidoPackage.PEDIDO__ID:
				return getId();
			case PedidoPackage.PEDIDO__FECHA:
				return getFecha();
			case PedidoPackage.PEDIDO__TOTAL:
				return getTotal();
			case PedidoPackage.PEDIDO__SUB_TOTAL:
				return getSubTotal();
			case PedidoPackage.PEDIDO__IVA:
				return getIva();
			case PedidoPackage.PEDIDO__DESCUENTO:
				return getDescuento();
			case PedidoPackage.PEDIDO__LST_DETALLE_PEDIDO:
				return getLstDetallePedido();
			case PedidoPackage.PEDIDO__OWENED_BY_FACTORY_PEDIDO:
				return getOwenedByFactoryPedido();
			case PedidoPackage.PEDIDO__LST_PERSONA:
				if (resolve) return getLstPersona();
				return basicGetLstPersona();
			case PedidoPackage.PEDIDO__THE_ENVIO:
				if (resolve) return getTheEnvio();
				return basicGetTheEnvio();
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
			case PedidoPackage.PEDIDO__ID:
				setId((String)newValue);
				return;
			case PedidoPackage.PEDIDO__FECHA:
				setFecha((String)newValue);
				return;
			case PedidoPackage.PEDIDO__TOTAL:
				setTotal((String)newValue);
				return;
			case PedidoPackage.PEDIDO__SUB_TOTAL:
				setSubTotal((String)newValue);
				return;
			case PedidoPackage.PEDIDO__IVA:
				setIva((String)newValue);
				return;
			case PedidoPackage.PEDIDO__DESCUENTO:
				setDescuento((String)newValue);
				return;
			case PedidoPackage.PEDIDO__LST_DETALLE_PEDIDO:
				getLstDetallePedido().clear();
				getLstDetallePedido().addAll((Collection<? extends DetallePedido>)newValue);
				return;
			case PedidoPackage.PEDIDO__OWENED_BY_FACTORY_PEDIDO:
				setOwenedByFactoryPedido((FactoryPedido)newValue);
				return;
			case PedidoPackage.PEDIDO__LST_PERSONA:
				setLstPersona((Persona)newValue);
				return;
			case PedidoPackage.PEDIDO__THE_ENVIO:
				setTheEnvio((Envio)newValue);
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
			case PedidoPackage.PEDIDO__ID:
				setId(ID_EDEFAULT);
				return;
			case PedidoPackage.PEDIDO__FECHA:
				setFecha(FECHA_EDEFAULT);
				return;
			case PedidoPackage.PEDIDO__TOTAL:
				setTotal(TOTAL_EDEFAULT);
				return;
			case PedidoPackage.PEDIDO__SUB_TOTAL:
				setSubTotal(SUB_TOTAL_EDEFAULT);
				return;
			case PedidoPackage.PEDIDO__IVA:
				setIva(IVA_EDEFAULT);
				return;
			case PedidoPackage.PEDIDO__DESCUENTO:
				setDescuento(DESCUENTO_EDEFAULT);
				return;
			case PedidoPackage.PEDIDO__LST_DETALLE_PEDIDO:
				getLstDetallePedido().clear();
				return;
			case PedidoPackage.PEDIDO__OWENED_BY_FACTORY_PEDIDO:
				setOwenedByFactoryPedido((FactoryPedido)null);
				return;
			case PedidoPackage.PEDIDO__LST_PERSONA:
				setLstPersona((Persona)null);
				return;
			case PedidoPackage.PEDIDO__THE_ENVIO:
				setTheEnvio((Envio)null);
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
			case PedidoPackage.PEDIDO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PedidoPackage.PEDIDO__FECHA:
				return FECHA_EDEFAULT == null ? fecha != null : !FECHA_EDEFAULT.equals(fecha);
			case PedidoPackage.PEDIDO__TOTAL:
				return TOTAL_EDEFAULT == null ? total != null : !TOTAL_EDEFAULT.equals(total);
			case PedidoPackage.PEDIDO__SUB_TOTAL:
				return SUB_TOTAL_EDEFAULT == null ? subTotal != null : !SUB_TOTAL_EDEFAULT.equals(subTotal);
			case PedidoPackage.PEDIDO__IVA:
				return IVA_EDEFAULT == null ? iva != null : !IVA_EDEFAULT.equals(iva);
			case PedidoPackage.PEDIDO__DESCUENTO:
				return DESCUENTO_EDEFAULT == null ? descuento != null : !DESCUENTO_EDEFAULT.equals(descuento);
			case PedidoPackage.PEDIDO__LST_DETALLE_PEDIDO:
				return lstDetallePedido != null && !lstDetallePedido.isEmpty();
			case PedidoPackage.PEDIDO__OWENED_BY_FACTORY_PEDIDO:
				return getOwenedByFactoryPedido() != null;
			case PedidoPackage.PEDIDO__LST_PERSONA:
				return lstPersona != null;
			case PedidoPackage.PEDIDO__THE_ENVIO:
				return theEnvio != null;
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
		result.append(", fecha: ");
		result.append(fecha);
		result.append(", total: ");
		result.append(total);
		result.append(", subTotal: ");
		result.append(subTotal);
		result.append(", iva: ");
		result.append(iva);
		result.append(", descuento: ");
		result.append(descuento);
		result.append(')');
		return result.toString();
	}

} //PedidoImpl
