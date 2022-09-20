/**
 */
package den.domain.producto.impl;

import den.domain.pedido.DetallePedido;
import den.domain.pedido.PedidoPackage;

import den.domain.producto.FactoryProducto;
import den.domain.producto.Producto;
import den.domain.producto.ProductoPackage;

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
 * An implementation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.producto.impl.ProductoImpl#getLstTransporte <em>Lst Transporte</em>}</li>
 *   <li>{@link den.domain.producto.impl.ProductoImpl#getIdProducto <em>Id Producto</em>}</li>
 *   <li>{@link den.domain.producto.impl.ProductoImpl#getCodigoProducto <em>Codigo Producto</em>}</li>
 *   <li>{@link den.domain.producto.impl.ProductoImpl#getPesoNeto <em>Peso Neto</em>}</li>
 *   <li>{@link den.domain.producto.impl.ProductoImpl#getMarca <em>Marca</em>}</li>
 *   <li>{@link den.domain.producto.impl.ProductoImpl#getFechaVencimiento <em>Fecha Vencimiento</em>}</li>
 *   <li>{@link den.domain.producto.impl.ProductoImpl#getFechaElaboracion <em>Fecha Elaboracion</em>}</li>
 *   <li>{@link den.domain.producto.impl.ProductoImpl#getPesoBruto <em>Peso Bruto</em>}</li>
 *   <li>{@link den.domain.producto.impl.ProductoImpl#getPrecio <em>Precio</em>}</li>
 *   <li>{@link den.domain.producto.impl.ProductoImpl#getLstDetallePedido <em>Lst Detalle Pedido</em>}</li>
 *   <li>{@link den.domain.producto.impl.ProductoImpl#getOwenedFactoryProducto <em>Owened Factory Producto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductoImpl extends EObjectImpl implements Producto {
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
	 * The default value of the '{@link #getIdProducto() <em>Id Producto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProducto()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_PRODUCTO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdProducto() <em>Id Producto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProducto()
	 * @generated
	 * @ordered
	 */
	protected String idProducto = ID_PRODUCTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodigoProducto() <em>Codigo Producto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoProducto()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_PRODUCTO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getCodigoProducto() <em>Codigo Producto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoProducto()
	 * @generated
	 * @ordered
	 */
	protected String codigoProducto = CODIGO_PRODUCTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPesoNeto() <em>Peso Neto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPesoNeto()
	 * @generated
	 * @ordered
	 */
	protected static final String PESO_NETO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getPesoNeto() <em>Peso Neto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPesoNeto()
	 * @generated
	 * @ordered
	 */
	protected String pesoNeto = PESO_NETO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarca() <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarca()
	 * @generated
	 * @ordered
	 */
	protected static final String MARCA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getMarca() <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarca()
	 * @generated
	 * @ordered
	 */
	protected String marca = MARCA_EDEFAULT;

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
	 * The default value of the '{@link #getFechaElaboracion() <em>Fecha Elaboracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaElaboracion()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_ELABORACION_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getFechaElaboracion() <em>Fecha Elaboracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaElaboracion()
	 * @generated
	 * @ordered
	 */
	protected String fechaElaboracion = FECHA_ELABORACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPesoBruto() <em>Peso Bruto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPesoBruto()
	 * @generated
	 * @ordered
	 */
	protected static final String PESO_BRUTO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getPesoBruto() <em>Peso Bruto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPesoBruto()
	 * @generated
	 * @ordered
	 */
	protected String pesoBruto = PESO_BRUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECIO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getPrecio() <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecio()
	 * @generated
	 * @ordered
	 */
	protected String precio = PRECIO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstDetallePedido() <em>Lst Detalle Pedido</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstDetallePedido()
	 * @generated
	 * @ordered
	 */
	protected EList<DetallePedido> lstDetallePedido;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductoPackage.Literals.PRODUCTO;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductoPackage.PRODUCTO__LST_TRANSPORTE, oldLstTransporte, lstTransporte));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductoPackage.PRODUCTO__LST_TRANSPORTE, oldLstTransporte, newLstTransporte);
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
				msgs = ((InternalEObject)lstTransporte).eInverseRemove(this, TransportePackage.TRANSPORTE__LST_PRODUCTO, Transporte.class, msgs);
			if (newLstTransporte != null)
				msgs = ((InternalEObject)newLstTransporte).eInverseAdd(this, TransportePackage.TRANSPORTE__LST_PRODUCTO, Transporte.class, msgs);
			msgs = basicSetLstTransporte(newLstTransporte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductoPackage.PRODUCTO__LST_TRANSPORTE, newLstTransporte, newLstTransporte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdProducto() {
		return idProducto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdProducto(String newIdProducto) {
		String oldIdProducto = idProducto;
		idProducto = newIdProducto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductoPackage.PRODUCTO__ID_PRODUCTO, oldIdProducto, idProducto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigoProducto() {
		return codigoProducto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigoProducto(String newCodigoProducto) {
		String oldCodigoProducto = codigoProducto;
		codigoProducto = newCodigoProducto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductoPackage.PRODUCTO__CODIGO_PRODUCTO, oldCodigoProducto, codigoProducto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPesoNeto() {
		return pesoNeto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPesoNeto(String newPesoNeto) {
		String oldPesoNeto = pesoNeto;
		pesoNeto = newPesoNeto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductoPackage.PRODUCTO__PESO_NETO, oldPesoNeto, pesoNeto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarca(String newMarca) {
		String oldMarca = marca;
		marca = newMarca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductoPackage.PRODUCTO__MARCA, oldMarca, marca));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductoPackage.PRODUCTO__FECHA_VENCIMIENTO, oldFechaVencimiento, fechaVencimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaElaboracion() {
		return fechaElaboracion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaElaboracion(String newFechaElaboracion) {
		String oldFechaElaboracion = fechaElaboracion;
		fechaElaboracion = newFechaElaboracion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductoPackage.PRODUCTO__FECHA_ELABORACION, oldFechaElaboracion, fechaElaboracion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPesoBruto() {
		return pesoBruto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPesoBruto(String newPesoBruto) {
		String oldPesoBruto = pesoBruto;
		pesoBruto = newPesoBruto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductoPackage.PRODUCTO__PESO_BRUTO, oldPesoBruto, pesoBruto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecio() {
		return precio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecio(String newPrecio) {
		String oldPrecio = precio;
		precio = newPrecio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductoPackage.PRODUCTO__PRECIO, oldPrecio, precio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DetallePedido> getLstDetallePedido() {
		if (lstDetallePedido == null) {
			lstDetallePedido = new EObjectWithInverseResolvingEList.ManyInverse<DetallePedido>(DetallePedido.class, this, ProductoPackage.PRODUCTO__LST_DETALLE_PEDIDO, PedidoPackage.DETALLE_PEDIDO__LST_PRODUCTO);
		}
		return lstDetallePedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryProducto getOwenedFactoryProducto() {
		if (eContainerFeatureID() != ProductoPackage.PRODUCTO__OWENED_FACTORY_PRODUCTO) return null;
		return (FactoryProducto)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedFactoryProducto(FactoryProducto newOwenedFactoryProducto, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedFactoryProducto, ProductoPackage.PRODUCTO__OWENED_FACTORY_PRODUCTO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedFactoryProducto(FactoryProducto newOwenedFactoryProducto) {
		if (newOwenedFactoryProducto != eInternalContainer() || (eContainerFeatureID() != ProductoPackage.PRODUCTO__OWENED_FACTORY_PRODUCTO && newOwenedFactoryProducto != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedFactoryProducto))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedFactoryProducto != null)
				msgs = ((InternalEObject)newOwenedFactoryProducto).eInverseAdd(this, ProductoPackage.FACTORY_PRODUCTO__LST_PRODUCTO, FactoryProducto.class, msgs);
			msgs = basicSetOwenedFactoryProducto(newOwenedFactoryProducto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductoPackage.PRODUCTO__OWENED_FACTORY_PRODUCTO, newOwenedFactoryProducto, newOwenedFactoryProducto));
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
			case ProductoPackage.PRODUCTO__LST_TRANSPORTE:
				if (lstTransporte != null)
					msgs = ((InternalEObject)lstTransporte).eInverseRemove(this, TransportePackage.TRANSPORTE__LST_PRODUCTO, Transporte.class, msgs);
				return basicSetLstTransporte((Transporte)otherEnd, msgs);
			case ProductoPackage.PRODUCTO__LST_DETALLE_PEDIDO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstDetallePedido()).basicAdd(otherEnd, msgs);
			case ProductoPackage.PRODUCTO__OWENED_FACTORY_PRODUCTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedFactoryProducto((FactoryProducto)otherEnd, msgs);
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
			case ProductoPackage.PRODUCTO__LST_TRANSPORTE:
				return basicSetLstTransporte(null, msgs);
			case ProductoPackage.PRODUCTO__LST_DETALLE_PEDIDO:
				return ((InternalEList<?>)getLstDetallePedido()).basicRemove(otherEnd, msgs);
			case ProductoPackage.PRODUCTO__OWENED_FACTORY_PRODUCTO:
				return basicSetOwenedFactoryProducto(null, msgs);
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
			case ProductoPackage.PRODUCTO__OWENED_FACTORY_PRODUCTO:
				return eInternalContainer().eInverseRemove(this, ProductoPackage.FACTORY_PRODUCTO__LST_PRODUCTO, FactoryProducto.class, msgs);
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
			case ProductoPackage.PRODUCTO__LST_TRANSPORTE:
				if (resolve) return getLstTransporte();
				return basicGetLstTransporte();
			case ProductoPackage.PRODUCTO__ID_PRODUCTO:
				return getIdProducto();
			case ProductoPackage.PRODUCTO__CODIGO_PRODUCTO:
				return getCodigoProducto();
			case ProductoPackage.PRODUCTO__PESO_NETO:
				return getPesoNeto();
			case ProductoPackage.PRODUCTO__MARCA:
				return getMarca();
			case ProductoPackage.PRODUCTO__FECHA_VENCIMIENTO:
				return getFechaVencimiento();
			case ProductoPackage.PRODUCTO__FECHA_ELABORACION:
				return getFechaElaboracion();
			case ProductoPackage.PRODUCTO__PESO_BRUTO:
				return getPesoBruto();
			case ProductoPackage.PRODUCTO__PRECIO:
				return getPrecio();
			case ProductoPackage.PRODUCTO__LST_DETALLE_PEDIDO:
				return getLstDetallePedido();
			case ProductoPackage.PRODUCTO__OWENED_FACTORY_PRODUCTO:
				return getOwenedFactoryProducto();
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
			case ProductoPackage.PRODUCTO__LST_TRANSPORTE:
				setLstTransporte((Transporte)newValue);
				return;
			case ProductoPackage.PRODUCTO__ID_PRODUCTO:
				setIdProducto((String)newValue);
				return;
			case ProductoPackage.PRODUCTO__CODIGO_PRODUCTO:
				setCodigoProducto((String)newValue);
				return;
			case ProductoPackage.PRODUCTO__PESO_NETO:
				setPesoNeto((String)newValue);
				return;
			case ProductoPackage.PRODUCTO__MARCA:
				setMarca((String)newValue);
				return;
			case ProductoPackage.PRODUCTO__FECHA_VENCIMIENTO:
				setFechaVencimiento((String)newValue);
				return;
			case ProductoPackage.PRODUCTO__FECHA_ELABORACION:
				setFechaElaboracion((String)newValue);
				return;
			case ProductoPackage.PRODUCTO__PESO_BRUTO:
				setPesoBruto((String)newValue);
				return;
			case ProductoPackage.PRODUCTO__PRECIO:
				setPrecio((String)newValue);
				return;
			case ProductoPackage.PRODUCTO__LST_DETALLE_PEDIDO:
				getLstDetallePedido().clear();
				getLstDetallePedido().addAll((Collection<? extends DetallePedido>)newValue);
				return;
			case ProductoPackage.PRODUCTO__OWENED_FACTORY_PRODUCTO:
				setOwenedFactoryProducto((FactoryProducto)newValue);
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
			case ProductoPackage.PRODUCTO__LST_TRANSPORTE:
				setLstTransporte((Transporte)null);
				return;
			case ProductoPackage.PRODUCTO__ID_PRODUCTO:
				setIdProducto(ID_PRODUCTO_EDEFAULT);
				return;
			case ProductoPackage.PRODUCTO__CODIGO_PRODUCTO:
				setCodigoProducto(CODIGO_PRODUCTO_EDEFAULT);
				return;
			case ProductoPackage.PRODUCTO__PESO_NETO:
				setPesoNeto(PESO_NETO_EDEFAULT);
				return;
			case ProductoPackage.PRODUCTO__MARCA:
				setMarca(MARCA_EDEFAULT);
				return;
			case ProductoPackage.PRODUCTO__FECHA_VENCIMIENTO:
				setFechaVencimiento(FECHA_VENCIMIENTO_EDEFAULT);
				return;
			case ProductoPackage.PRODUCTO__FECHA_ELABORACION:
				setFechaElaboracion(FECHA_ELABORACION_EDEFAULT);
				return;
			case ProductoPackage.PRODUCTO__PESO_BRUTO:
				setPesoBruto(PESO_BRUTO_EDEFAULT);
				return;
			case ProductoPackage.PRODUCTO__PRECIO:
				setPrecio(PRECIO_EDEFAULT);
				return;
			case ProductoPackage.PRODUCTO__LST_DETALLE_PEDIDO:
				getLstDetallePedido().clear();
				return;
			case ProductoPackage.PRODUCTO__OWENED_FACTORY_PRODUCTO:
				setOwenedFactoryProducto((FactoryProducto)null);
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
			case ProductoPackage.PRODUCTO__LST_TRANSPORTE:
				return lstTransporte != null;
			case ProductoPackage.PRODUCTO__ID_PRODUCTO:
				return ID_PRODUCTO_EDEFAULT == null ? idProducto != null : !ID_PRODUCTO_EDEFAULT.equals(idProducto);
			case ProductoPackage.PRODUCTO__CODIGO_PRODUCTO:
				return CODIGO_PRODUCTO_EDEFAULT == null ? codigoProducto != null : !CODIGO_PRODUCTO_EDEFAULT.equals(codigoProducto);
			case ProductoPackage.PRODUCTO__PESO_NETO:
				return PESO_NETO_EDEFAULT == null ? pesoNeto != null : !PESO_NETO_EDEFAULT.equals(pesoNeto);
			case ProductoPackage.PRODUCTO__MARCA:
				return MARCA_EDEFAULT == null ? marca != null : !MARCA_EDEFAULT.equals(marca);
			case ProductoPackage.PRODUCTO__FECHA_VENCIMIENTO:
				return FECHA_VENCIMIENTO_EDEFAULT == null ? fechaVencimiento != null : !FECHA_VENCIMIENTO_EDEFAULT.equals(fechaVencimiento);
			case ProductoPackage.PRODUCTO__FECHA_ELABORACION:
				return FECHA_ELABORACION_EDEFAULT == null ? fechaElaboracion != null : !FECHA_ELABORACION_EDEFAULT.equals(fechaElaboracion);
			case ProductoPackage.PRODUCTO__PESO_BRUTO:
				return PESO_BRUTO_EDEFAULT == null ? pesoBruto != null : !PESO_BRUTO_EDEFAULT.equals(pesoBruto);
			case ProductoPackage.PRODUCTO__PRECIO:
				return PRECIO_EDEFAULT == null ? precio != null : !PRECIO_EDEFAULT.equals(precio);
			case ProductoPackage.PRODUCTO__LST_DETALLE_PEDIDO:
				return lstDetallePedido != null && !lstDetallePedido.isEmpty();
			case ProductoPackage.PRODUCTO__OWENED_FACTORY_PRODUCTO:
				return getOwenedFactoryProducto() != null;
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
		result.append(" (idProducto: ");
		result.append(idProducto);
		result.append(", codigoProducto: ");
		result.append(codigoProducto);
		result.append(", pesoNeto: ");
		result.append(pesoNeto);
		result.append(", marca: ");
		result.append(marca);
		result.append(", fechaVencimiento: ");
		result.append(fechaVencimiento);
		result.append(", fechaElaboracion: ");
		result.append(fechaElaboracion);
		result.append(", pesoBruto: ");
		result.append(pesoBruto);
		result.append(", Precio: ");
		result.append(precio);
		result.append(')');
		return result.toString();
	}

} //ProductoImpl
