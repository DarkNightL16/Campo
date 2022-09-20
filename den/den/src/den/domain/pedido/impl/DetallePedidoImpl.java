/**
 */
package den.domain.pedido.impl;

import den.domain.pedido.DetallePedido;
import den.domain.pedido.Pedido;
import den.domain.pedido.PedidoPackage;

import den.domain.producto.Producto;
import den.domain.producto.ProductoPackage;

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
 * An implementation of the model object '<em><b>Detalle Pedido</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.pedido.impl.DetallePedidoImpl#getIdPedido <em>Id Pedido</em>}</li>
 *   <li>{@link den.domain.pedido.impl.DetallePedidoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link den.domain.pedido.impl.DetallePedidoImpl#getValorUnitario <em>Valor Unitario</em>}</li>
 *   <li>{@link den.domain.pedido.impl.DetallePedidoImpl#getValorTotal <em>Valor Total</em>}</li>
 *   <li>{@link den.domain.pedido.impl.DetallePedidoImpl#getIva <em>Iva</em>}</li>
 *   <li>{@link den.domain.pedido.impl.DetallePedidoImpl#getTotalPagar <em>Total Pagar</em>}</li>
 *   <li>{@link den.domain.pedido.impl.DetallePedidoImpl#getCantidadKilos <em>Cantidad Kilos</em>}</li>
 *   <li>{@link den.domain.pedido.impl.DetallePedidoImpl#getOwenedByPedido <em>Owened By Pedido</em>}</li>
 *   <li>{@link den.domain.pedido.impl.DetallePedidoImpl#getLstProducto <em>Lst Producto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetallePedidoImpl extends EObjectImpl implements DetallePedido {
	/**
	 * The default value of the '{@link #getIdPedido() <em>Id Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPedido()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_PEDIDO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdPedido() <em>Id Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPedido()
	 * @generated
	 * @ordered
	 */
	protected String idPedido = ID_PEDIDO_EDEFAULT;

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
	 * The default value of the '{@link #getValorTotal() <em>Valor Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorTotal()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_TOTAL_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getValorTotal() <em>Valor Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorTotal()
	 * @generated
	 * @ordered
	 */
	protected String valorTotal = VALOR_TOTAL_EDEFAULT;

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
	 * The default value of the '{@link #getTotalPagar() <em>Total Pagar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPagar()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_PAGAR_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getTotalPagar() <em>Total Pagar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPagar()
	 * @generated
	 * @ordered
	 */
	protected String totalPagar = TOTAL_PAGAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCantidadKilos() <em>Cantidad Kilos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantidadKilos()
	 * @generated
	 * @ordered
	 */
	protected static final String CANTIDAD_KILOS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getCantidadKilos() <em>Cantidad Kilos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantidadKilos()
	 * @generated
	 * @ordered
	 */
	protected String cantidadKilos = CANTIDAD_KILOS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstProducto() <em>Lst Producto</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstProducto()
	 * @generated
	 * @ordered
	 */
	protected EList<Producto> lstProducto;

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
		return PedidoPackage.Literals.DETALLE_PEDIDO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdPedido() {
		return idPedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPedido(String newIdPedido) {
		String oldIdPedido = idPedido;
		idPedido = newIdPedido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.DETALLE_PEDIDO__ID_PEDIDO, oldIdPedido, idPedido));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.DETALLE_PEDIDO__DESCRIPCION, oldDescripcion, descripcion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.DETALLE_PEDIDO__VALOR_UNITARIO, oldValorUnitario, valorUnitario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValorTotal() {
		return valorTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorTotal(String newValorTotal) {
		String oldValorTotal = valorTotal;
		valorTotal = newValorTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.DETALLE_PEDIDO__VALOR_TOTAL, oldValorTotal, valorTotal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.DETALLE_PEDIDO__IVA, oldIva, iva));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotalPagar() {
		return totalPagar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalPagar(String newTotalPagar) {
		String oldTotalPagar = totalPagar;
		totalPagar = newTotalPagar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.DETALLE_PEDIDO__TOTAL_PAGAR, oldTotalPagar, totalPagar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCantidadKilos() {
		return cantidadKilos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCantidadKilos(String newCantidadKilos) {
		String oldCantidadKilos = cantidadKilos;
		cantidadKilos = newCantidadKilos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.DETALLE_PEDIDO__CANTIDAD_KILOS, oldCantidadKilos, cantidadKilos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pedido getOwenedByPedido() {
		if (eContainerFeatureID() != PedidoPackage.DETALLE_PEDIDO__OWENED_BY_PEDIDO) return null;
		return (Pedido)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByPedido(Pedido newOwenedByPedido, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByPedido, PedidoPackage.DETALLE_PEDIDO__OWENED_BY_PEDIDO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByPedido(Pedido newOwenedByPedido) {
		if (newOwenedByPedido != eInternalContainer() || (eContainerFeatureID() != PedidoPackage.DETALLE_PEDIDO__OWENED_BY_PEDIDO && newOwenedByPedido != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByPedido))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByPedido != null)
				msgs = ((InternalEObject)newOwenedByPedido).eInverseAdd(this, PedidoPackage.PEDIDO__LST_DETALLE_PEDIDO, Pedido.class, msgs);
			msgs = basicSetOwenedByPedido(newOwenedByPedido, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.DETALLE_PEDIDO__OWENED_BY_PEDIDO, newOwenedByPedido, newOwenedByPedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Producto> getLstProducto() {
		if (lstProducto == null) {
			lstProducto = new EObjectWithInverseResolvingEList.ManyInverse<Producto>(Producto.class, this, PedidoPackage.DETALLE_PEDIDO__LST_PRODUCTO, ProductoPackage.PRODUCTO__LST_DETALLE_PEDIDO);
		}
		return lstProducto;
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
			case PedidoPackage.DETALLE_PEDIDO__OWENED_BY_PEDIDO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByPedido((Pedido)otherEnd, msgs);
			case PedidoPackage.DETALLE_PEDIDO__LST_PRODUCTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstProducto()).basicAdd(otherEnd, msgs);
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
			case PedidoPackage.DETALLE_PEDIDO__OWENED_BY_PEDIDO:
				return basicSetOwenedByPedido(null, msgs);
			case PedidoPackage.DETALLE_PEDIDO__LST_PRODUCTO:
				return ((InternalEList<?>)getLstProducto()).basicRemove(otherEnd, msgs);
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
			case PedidoPackage.DETALLE_PEDIDO__OWENED_BY_PEDIDO:
				return eInternalContainer().eInverseRemove(this, PedidoPackage.PEDIDO__LST_DETALLE_PEDIDO, Pedido.class, msgs);
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
			case PedidoPackage.DETALLE_PEDIDO__ID_PEDIDO:
				return getIdPedido();
			case PedidoPackage.DETALLE_PEDIDO__DESCRIPCION:
				return getDescripcion();
			case PedidoPackage.DETALLE_PEDIDO__VALOR_UNITARIO:
				return getValorUnitario();
			case PedidoPackage.DETALLE_PEDIDO__VALOR_TOTAL:
				return getValorTotal();
			case PedidoPackage.DETALLE_PEDIDO__IVA:
				return getIva();
			case PedidoPackage.DETALLE_PEDIDO__TOTAL_PAGAR:
				return getTotalPagar();
			case PedidoPackage.DETALLE_PEDIDO__CANTIDAD_KILOS:
				return getCantidadKilos();
			case PedidoPackage.DETALLE_PEDIDO__OWENED_BY_PEDIDO:
				return getOwenedByPedido();
			case PedidoPackage.DETALLE_PEDIDO__LST_PRODUCTO:
				return getLstProducto();
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
			case PedidoPackage.DETALLE_PEDIDO__ID_PEDIDO:
				setIdPedido((String)newValue);
				return;
			case PedidoPackage.DETALLE_PEDIDO__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case PedidoPackage.DETALLE_PEDIDO__VALOR_UNITARIO:
				setValorUnitario((String)newValue);
				return;
			case PedidoPackage.DETALLE_PEDIDO__VALOR_TOTAL:
				setValorTotal((String)newValue);
				return;
			case PedidoPackage.DETALLE_PEDIDO__IVA:
				setIva((String)newValue);
				return;
			case PedidoPackage.DETALLE_PEDIDO__TOTAL_PAGAR:
				setTotalPagar((String)newValue);
				return;
			case PedidoPackage.DETALLE_PEDIDO__CANTIDAD_KILOS:
				setCantidadKilos((String)newValue);
				return;
			case PedidoPackage.DETALLE_PEDIDO__OWENED_BY_PEDIDO:
				setOwenedByPedido((Pedido)newValue);
				return;
			case PedidoPackage.DETALLE_PEDIDO__LST_PRODUCTO:
				getLstProducto().clear();
				getLstProducto().addAll((Collection<? extends Producto>)newValue);
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
			case PedidoPackage.DETALLE_PEDIDO__ID_PEDIDO:
				setIdPedido(ID_PEDIDO_EDEFAULT);
				return;
			case PedidoPackage.DETALLE_PEDIDO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case PedidoPackage.DETALLE_PEDIDO__VALOR_UNITARIO:
				setValorUnitario(VALOR_UNITARIO_EDEFAULT);
				return;
			case PedidoPackage.DETALLE_PEDIDO__VALOR_TOTAL:
				setValorTotal(VALOR_TOTAL_EDEFAULT);
				return;
			case PedidoPackage.DETALLE_PEDIDO__IVA:
				setIva(IVA_EDEFAULT);
				return;
			case PedidoPackage.DETALLE_PEDIDO__TOTAL_PAGAR:
				setTotalPagar(TOTAL_PAGAR_EDEFAULT);
				return;
			case PedidoPackage.DETALLE_PEDIDO__CANTIDAD_KILOS:
				setCantidadKilos(CANTIDAD_KILOS_EDEFAULT);
				return;
			case PedidoPackage.DETALLE_PEDIDO__OWENED_BY_PEDIDO:
				setOwenedByPedido((Pedido)null);
				return;
			case PedidoPackage.DETALLE_PEDIDO__LST_PRODUCTO:
				getLstProducto().clear();
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
			case PedidoPackage.DETALLE_PEDIDO__ID_PEDIDO:
				return ID_PEDIDO_EDEFAULT == null ? idPedido != null : !ID_PEDIDO_EDEFAULT.equals(idPedido);
			case PedidoPackage.DETALLE_PEDIDO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case PedidoPackage.DETALLE_PEDIDO__VALOR_UNITARIO:
				return VALOR_UNITARIO_EDEFAULT == null ? valorUnitario != null : !VALOR_UNITARIO_EDEFAULT.equals(valorUnitario);
			case PedidoPackage.DETALLE_PEDIDO__VALOR_TOTAL:
				return VALOR_TOTAL_EDEFAULT == null ? valorTotal != null : !VALOR_TOTAL_EDEFAULT.equals(valorTotal);
			case PedidoPackage.DETALLE_PEDIDO__IVA:
				return IVA_EDEFAULT == null ? iva != null : !IVA_EDEFAULT.equals(iva);
			case PedidoPackage.DETALLE_PEDIDO__TOTAL_PAGAR:
				return TOTAL_PAGAR_EDEFAULT == null ? totalPagar != null : !TOTAL_PAGAR_EDEFAULT.equals(totalPagar);
			case PedidoPackage.DETALLE_PEDIDO__CANTIDAD_KILOS:
				return CANTIDAD_KILOS_EDEFAULT == null ? cantidadKilos != null : !CANTIDAD_KILOS_EDEFAULT.equals(cantidadKilos);
			case PedidoPackage.DETALLE_PEDIDO__OWENED_BY_PEDIDO:
				return getOwenedByPedido() != null;
			case PedidoPackage.DETALLE_PEDIDO__LST_PRODUCTO:
				return lstProducto != null && !lstProducto.isEmpty();
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
		result.append(" (idPedido: ");
		result.append(idPedido);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", valorUnitario: ");
		result.append(valorUnitario);
		result.append(", valorTotal: ");
		result.append(valorTotal);
		result.append(", iva: ");
		result.append(iva);
		result.append(", totalPagar: ");
		result.append(totalPagar);
		result.append(", cantidadKilos: ");
		result.append(cantidadKilos);
		result.append(')');
		return result.toString();
	}

} //DetallePedidoImpl
