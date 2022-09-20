/**
 */
package den.domain.envio.impl;

import den.domain.envio.DetallePedido;
import den.domain.envio.Envio;
import den.domain.envio.EnvioPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detalle Pedido</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.envio.impl.DetallePedidoImpl#getId <em>Id</em>}</li>
 *   <li>{@link den.domain.envio.impl.DetallePedidoImpl#getCantidad <em>Cantidad</em>}</li>
 *   <li>{@link den.domain.envio.impl.DetallePedidoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link den.domain.envio.impl.DetallePedidoImpl#getValorUnitario <em>Valor Unitario</em>}</li>
 *   <li>{@link den.domain.envio.impl.DetallePedidoImpl#getOwenedByEnvio <em>Owened By Envio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetallePedidoImpl extends EObjectImpl implements DetallePedido {
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
	 * The default value of the '{@link #getCantidad() <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantidad()
	 * @generated
	 * @ordered
	 */
	protected static final String CANTIDAD_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getCantidad() <em>Cantidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantidad()
	 * @generated
	 * @ordered
	 */
	protected String cantidad = CANTIDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorUnitario() <em>Valor Unitario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorUnitario()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_UNITARIO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getValorUnitario() <em>Valor Unitario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorUnitario()
	 * @generated
	 * @ordered
	 */
	protected String valorUnitario = VALOR_UNITARIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetallePedidoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvioPackage.Literals.DETALLE_PEDIDO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.DETALLE_PEDIDO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCantidad() {
		return cantidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCantidad(String newCantidad) {
		String oldCantidad = cantidad;
		cantidad = newCantidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.DETALLE_PEDIDO__CANTIDAD, oldCantidad, cantidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.DETALLE_PEDIDO__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValorUnitario() {
		return valorUnitario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorUnitario(String newValorUnitario) {
		String oldValorUnitario = valorUnitario;
		valorUnitario = newValorUnitario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.DETALLE_PEDIDO__VALOR_UNITARIO, oldValorUnitario, valorUnitario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Envio getOwenedByEnvio() {
		if (eContainerFeatureID() != EnvioPackage.DETALLE_PEDIDO__OWENED_BY_ENVIO) return null;
		return (Envio)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByEnvio(Envio newOwenedByEnvio, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByEnvio, EnvioPackage.DETALLE_PEDIDO__OWENED_BY_ENVIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByEnvio(Envio newOwenedByEnvio) {
		if (newOwenedByEnvio != eInternalContainer() || (eContainerFeatureID() != EnvioPackage.DETALLE_PEDIDO__OWENED_BY_ENVIO && newOwenedByEnvio != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByEnvio))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByEnvio != null)
				msgs = ((InternalEObject)newOwenedByEnvio).eInverseAdd(this, EnvioPackage.ENVIO__LST_DETALLE_PEDIDO, Envio.class, msgs);
			msgs = basicSetOwenedByEnvio(newOwenedByEnvio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.DETALLE_PEDIDO__OWENED_BY_ENVIO, newOwenedByEnvio, newOwenedByEnvio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnvioPackage.DETALLE_PEDIDO__OWENED_BY_ENVIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByEnvio((Envio)otherEnd, msgs);
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
			case EnvioPackage.DETALLE_PEDIDO__OWENED_BY_ENVIO:
				return basicSetOwenedByEnvio(null, msgs);
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
			case EnvioPackage.DETALLE_PEDIDO__OWENED_BY_ENVIO:
				return eInternalContainer().eInverseRemove(this, EnvioPackage.ENVIO__LST_DETALLE_PEDIDO, Envio.class, msgs);
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
			case EnvioPackage.DETALLE_PEDIDO__ID:
				return getId();
			case EnvioPackage.DETALLE_PEDIDO__CANTIDAD:
				return getCantidad();
			case EnvioPackage.DETALLE_PEDIDO__DESCRIPCION:
				return getDescripcion();
			case EnvioPackage.DETALLE_PEDIDO__VALOR_UNITARIO:
				return getValorUnitario();
			case EnvioPackage.DETALLE_PEDIDO__OWENED_BY_ENVIO:
				return getOwenedByEnvio();
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
			case EnvioPackage.DETALLE_PEDIDO__ID:
				setId((String)newValue);
				return;
			case EnvioPackage.DETALLE_PEDIDO__CANTIDAD:
				setCantidad((String)newValue);
				return;
			case EnvioPackage.DETALLE_PEDIDO__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case EnvioPackage.DETALLE_PEDIDO__VALOR_UNITARIO:
				setValorUnitario((String)newValue);
				return;
			case EnvioPackage.DETALLE_PEDIDO__OWENED_BY_ENVIO:
				setOwenedByEnvio((Envio)newValue);
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
			case EnvioPackage.DETALLE_PEDIDO__ID:
				setId(ID_EDEFAULT);
				return;
			case EnvioPackage.DETALLE_PEDIDO__CANTIDAD:
				setCantidad(CANTIDAD_EDEFAULT);
				return;
			case EnvioPackage.DETALLE_PEDIDO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case EnvioPackage.DETALLE_PEDIDO__VALOR_UNITARIO:
				setValorUnitario(VALOR_UNITARIO_EDEFAULT);
				return;
			case EnvioPackage.DETALLE_PEDIDO__OWENED_BY_ENVIO:
				setOwenedByEnvio((Envio)null);
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
			case EnvioPackage.DETALLE_PEDIDO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EnvioPackage.DETALLE_PEDIDO__CANTIDAD:
				return CANTIDAD_EDEFAULT == null ? cantidad != null : !CANTIDAD_EDEFAULT.equals(cantidad);
			case EnvioPackage.DETALLE_PEDIDO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case EnvioPackage.DETALLE_PEDIDO__VALOR_UNITARIO:
				return VALOR_UNITARIO_EDEFAULT == null ? valorUnitario != null : !VALOR_UNITARIO_EDEFAULT.equals(valorUnitario);
			case EnvioPackage.DETALLE_PEDIDO__OWENED_BY_ENVIO:
				return getOwenedByEnvio() != null;
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
		result.append(", cantidad: ");
		result.append(cantidad);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", valorUnitario: ");
		result.append(valorUnitario);
		result.append(')');
		return result.toString();
	}

} //DetallePedidoImpl
