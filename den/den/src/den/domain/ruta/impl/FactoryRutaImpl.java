/**
 */
package den.domain.ruta.impl;

import den.domain.Domain;
import den.domain.DomainPackage;

import den.domain.ruta.FactoryRuta;
import den.domain.ruta.Ruta;
import den.domain.ruta.RutaPackage;

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
 * An implementation of the model object '<em><b>Factory Ruta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.ruta.impl.FactoryRutaImpl#getIdRuta <em>Id Ruta</em>}</li>
 *   <li>{@link den.domain.ruta.impl.FactoryRutaImpl#getOwenedByDomain <em>Owened By Domain</em>}</li>
 *   <li>{@link den.domain.ruta.impl.FactoryRutaImpl#getLstRuta <em>Lst Ruta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryRutaImpl extends EObjectImpl implements FactoryRuta {
	/**
	 * The default value of the '{@link #getIdRuta() <em>Id Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRuta()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_RUTA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdRuta() <em>Id Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRuta()
	 * @generated
	 * @ordered
	 */
	protected String idRuta = ID_RUTA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstRuta() <em>Lst Ruta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstRuta()
	 * @generated
	 * @ordered
	 */
	protected EList<Ruta> lstRuta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryRutaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RutaPackage.Literals.FACTORY_RUTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdRuta() {
		return idRuta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdRuta(String newIdRuta) {
		String oldIdRuta = idRuta;
		idRuta = newIdRuta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RutaPackage.FACTORY_RUTA__ID_RUTA, oldIdRuta, idRuta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getOwenedByDomain() {
		if (eContainerFeatureID() != RutaPackage.FACTORY_RUTA__OWENED_BY_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByDomain(Domain newOwenedByDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByDomain, RutaPackage.FACTORY_RUTA__OWENED_BY_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByDomain(Domain newOwenedByDomain) {
		if (newOwenedByDomain != eInternalContainer() || (eContainerFeatureID() != RutaPackage.FACTORY_RUTA__OWENED_BY_DOMAIN && newOwenedByDomain != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByDomain != null)
				msgs = ((InternalEObject)newOwenedByDomain).eInverseAdd(this, DomainPackage.DOMAIN__LST_FACTORY_RUTA, Domain.class, msgs);
			msgs = basicSetOwenedByDomain(newOwenedByDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RutaPackage.FACTORY_RUTA__OWENED_BY_DOMAIN, newOwenedByDomain, newOwenedByDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ruta> getLstRuta() {
		if (lstRuta == null) {
			lstRuta = new EObjectContainmentWithInverseEList<Ruta>(Ruta.class, this, RutaPackage.FACTORY_RUTA__LST_RUTA, RutaPackage.RUTA__OWENED_BY_FACTORY_RUTA);
		}
		return lstRuta;
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
			case RutaPackage.FACTORY_RUTA__OWENED_BY_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByDomain((Domain)otherEnd, msgs);
			case RutaPackage.FACTORY_RUTA__LST_RUTA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstRuta()).basicAdd(otherEnd, msgs);
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
			case RutaPackage.FACTORY_RUTA__OWENED_BY_DOMAIN:
				return basicSetOwenedByDomain(null, msgs);
			case RutaPackage.FACTORY_RUTA__LST_RUTA:
				return ((InternalEList<?>)getLstRuta()).basicRemove(otherEnd, msgs);
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
			case RutaPackage.FACTORY_RUTA__OWENED_BY_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LST_FACTORY_RUTA, Domain.class, msgs);
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
			case RutaPackage.FACTORY_RUTA__ID_RUTA:
				return getIdRuta();
			case RutaPackage.FACTORY_RUTA__OWENED_BY_DOMAIN:
				return getOwenedByDomain();
			case RutaPackage.FACTORY_RUTA__LST_RUTA:
				return getLstRuta();
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
			case RutaPackage.FACTORY_RUTA__ID_RUTA:
				setIdRuta((String)newValue);
				return;
			case RutaPackage.FACTORY_RUTA__OWENED_BY_DOMAIN:
				setOwenedByDomain((Domain)newValue);
				return;
			case RutaPackage.FACTORY_RUTA__LST_RUTA:
				getLstRuta().clear();
				getLstRuta().addAll((Collection<? extends Ruta>)newValue);
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
			case RutaPackage.FACTORY_RUTA__ID_RUTA:
				setIdRuta(ID_RUTA_EDEFAULT);
				return;
			case RutaPackage.FACTORY_RUTA__OWENED_BY_DOMAIN:
				setOwenedByDomain((Domain)null);
				return;
			case RutaPackage.FACTORY_RUTA__LST_RUTA:
				getLstRuta().clear();
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
			case RutaPackage.FACTORY_RUTA__ID_RUTA:
				return ID_RUTA_EDEFAULT == null ? idRuta != null : !ID_RUTA_EDEFAULT.equals(idRuta);
			case RutaPackage.FACTORY_RUTA__OWENED_BY_DOMAIN:
				return getOwenedByDomain() != null;
			case RutaPackage.FACTORY_RUTA__LST_RUTA:
				return lstRuta != null && !lstRuta.isEmpty();
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
		result.append(" (idRuta: ");
		result.append(idRuta);
		result.append(')');
		return result.toString();
	}

} //FactoryRutaImpl
