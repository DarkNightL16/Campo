/**
 */
package den.domain.producto.impl;

import den.domain.Domain;
import den.domain.DomainPackage;

import den.domain.producto.FactoryProducto;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factory Producto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.producto.impl.FactoryProductoImpl#getIdProducto <em>Id Producto</em>}</li>
 *   <li>{@link den.domain.producto.impl.FactoryProductoImpl#getOwenedByDomain <em>Owened By Domain</em>}</li>
 *   <li>{@link den.domain.producto.impl.FactoryProductoImpl#getLstProducto <em>Lst Producto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryProductoImpl extends EObjectImpl implements FactoryProducto {
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
	 * The cached value of the '{@link #getLstProducto() <em>Lst Producto</em>}' containment reference list.
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
	protected FactoryProductoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductoPackage.Literals.FACTORY_PRODUCTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductoPackage.FACTORY_PRODUCTO__ID_PRODUCTO, oldIdProducto, idProducto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getOwenedByDomain() {
		if (eContainerFeatureID() != ProductoPackage.FACTORY_PRODUCTO__OWENED_BY_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByDomain(Domain newOwenedByDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByDomain, ProductoPackage.FACTORY_PRODUCTO__OWENED_BY_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByDomain(Domain newOwenedByDomain) {
		if (newOwenedByDomain != eInternalContainer() || (eContainerFeatureID() != ProductoPackage.FACTORY_PRODUCTO__OWENED_BY_DOMAIN && newOwenedByDomain != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByDomain != null)
				msgs = ((InternalEObject)newOwenedByDomain).eInverseAdd(this, DomainPackage.DOMAIN__LST_FACTORY_PRODUCTO, Domain.class, msgs);
			msgs = basicSetOwenedByDomain(newOwenedByDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductoPackage.FACTORY_PRODUCTO__OWENED_BY_DOMAIN, newOwenedByDomain, newOwenedByDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Producto> getLstProducto() {
		if (lstProducto == null) {
			lstProducto = new EObjectContainmentWithInverseEList<Producto>(Producto.class, this, ProductoPackage.FACTORY_PRODUCTO__LST_PRODUCTO, ProductoPackage.PRODUCTO__OWENED_FACTORY_PRODUCTO);
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
			case ProductoPackage.FACTORY_PRODUCTO__OWENED_BY_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByDomain((Domain)otherEnd, msgs);
			case ProductoPackage.FACTORY_PRODUCTO__LST_PRODUCTO:
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
			case ProductoPackage.FACTORY_PRODUCTO__OWENED_BY_DOMAIN:
				return basicSetOwenedByDomain(null, msgs);
			case ProductoPackage.FACTORY_PRODUCTO__LST_PRODUCTO:
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
			case ProductoPackage.FACTORY_PRODUCTO__OWENED_BY_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LST_FACTORY_PRODUCTO, Domain.class, msgs);
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
			case ProductoPackage.FACTORY_PRODUCTO__ID_PRODUCTO:
				return getIdProducto();
			case ProductoPackage.FACTORY_PRODUCTO__OWENED_BY_DOMAIN:
				return getOwenedByDomain();
			case ProductoPackage.FACTORY_PRODUCTO__LST_PRODUCTO:
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
			case ProductoPackage.FACTORY_PRODUCTO__ID_PRODUCTO:
				setIdProducto((String)newValue);
				return;
			case ProductoPackage.FACTORY_PRODUCTO__OWENED_BY_DOMAIN:
				setOwenedByDomain((Domain)newValue);
				return;
			case ProductoPackage.FACTORY_PRODUCTO__LST_PRODUCTO:
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
			case ProductoPackage.FACTORY_PRODUCTO__ID_PRODUCTO:
				setIdProducto(ID_PRODUCTO_EDEFAULT);
				return;
			case ProductoPackage.FACTORY_PRODUCTO__OWENED_BY_DOMAIN:
				setOwenedByDomain((Domain)null);
				return;
			case ProductoPackage.FACTORY_PRODUCTO__LST_PRODUCTO:
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
			case ProductoPackage.FACTORY_PRODUCTO__ID_PRODUCTO:
				return ID_PRODUCTO_EDEFAULT == null ? idProducto != null : !ID_PRODUCTO_EDEFAULT.equals(idProducto);
			case ProductoPackage.FACTORY_PRODUCTO__OWENED_BY_DOMAIN:
				return getOwenedByDomain() != null;
			case ProductoPackage.FACTORY_PRODUCTO__LST_PRODUCTO:
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
		result.append(" (idProducto: ");
		result.append(idProducto);
		result.append(')');
		return result.toString();
	}

} //FactoryProductoImpl
