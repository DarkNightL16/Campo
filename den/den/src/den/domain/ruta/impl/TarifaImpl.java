/**
 */
package den.domain.ruta.impl;

import den.domain.ruta.Ruta;
import den.domain.ruta.RutaPackage;
import den.domain.ruta.Tarifa;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarifa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.ruta.impl.TarifaImpl#getId <em>Id</em>}</li>
 *   <li>{@link den.domain.ruta.impl.TarifaImpl#getPrecio <em>Precio</em>}</li>
 *   <li>{@link den.domain.ruta.impl.TarifaImpl#getOwenedByRuta <em>Owened By Ruta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TarifaImpl extends EObjectImpl implements Tarifa {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TarifaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RutaPackage.Literals.TARIFA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RutaPackage.TARIFA__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RutaPackage.TARIFA__PRECIO, oldPrecio, precio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruta getOwenedByRuta() {
		if (eContainerFeatureID() != RutaPackage.TARIFA__OWENED_BY_RUTA) return null;
		return (Ruta)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByRuta(Ruta newOwenedByRuta, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByRuta, RutaPackage.TARIFA__OWENED_BY_RUTA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByRuta(Ruta newOwenedByRuta) {
		if (newOwenedByRuta != eInternalContainer() || (eContainerFeatureID() != RutaPackage.TARIFA__OWENED_BY_RUTA && newOwenedByRuta != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByRuta))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByRuta != null)
				msgs = ((InternalEObject)newOwenedByRuta).eInverseAdd(this, RutaPackage.RUTA__LST_TARIFA, Ruta.class, msgs);
			msgs = basicSetOwenedByRuta(newOwenedByRuta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RutaPackage.TARIFA__OWENED_BY_RUTA, newOwenedByRuta, newOwenedByRuta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RutaPackage.TARIFA__OWENED_BY_RUTA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByRuta((Ruta)otherEnd, msgs);
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
			case RutaPackage.TARIFA__OWENED_BY_RUTA:
				return basicSetOwenedByRuta(null, msgs);
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
			case RutaPackage.TARIFA__OWENED_BY_RUTA:
				return eInternalContainer().eInverseRemove(this, RutaPackage.RUTA__LST_TARIFA, Ruta.class, msgs);
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
			case RutaPackage.TARIFA__ID:
				return getId();
			case RutaPackage.TARIFA__PRECIO:
				return getPrecio();
			case RutaPackage.TARIFA__OWENED_BY_RUTA:
				return getOwenedByRuta();
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
			case RutaPackage.TARIFA__ID:
				setId((String)newValue);
				return;
			case RutaPackage.TARIFA__PRECIO:
				setPrecio((String)newValue);
				return;
			case RutaPackage.TARIFA__OWENED_BY_RUTA:
				setOwenedByRuta((Ruta)newValue);
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
			case RutaPackage.TARIFA__ID:
				setId(ID_EDEFAULT);
				return;
			case RutaPackage.TARIFA__PRECIO:
				setPrecio(PRECIO_EDEFAULT);
				return;
			case RutaPackage.TARIFA__OWENED_BY_RUTA:
				setOwenedByRuta((Ruta)null);
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
			case RutaPackage.TARIFA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RutaPackage.TARIFA__PRECIO:
				return PRECIO_EDEFAULT == null ? precio != null : !PRECIO_EDEFAULT.equals(precio);
			case RutaPackage.TARIFA__OWENED_BY_RUTA:
				return getOwenedByRuta() != null;
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
		result.append(", precio: ");
		result.append(precio);
		result.append(')');
		return result.toString();
	}

} //TarifaImpl
