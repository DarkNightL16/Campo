/**
 */
package den.domain.transporte.impl;

import den.domain.Domain;
import den.domain.DomainPackage;

import den.domain.transporte.FactoryTransporte;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factory Transporte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.transporte.impl.FactoryTransporteImpl#getIdTransporte <em>Id Transporte</em>}</li>
 *   <li>{@link den.domain.transporte.impl.FactoryTransporteImpl#getOwenedByDomain <em>Owened By Domain</em>}</li>
 *   <li>{@link den.domain.transporte.impl.FactoryTransporteImpl#getLstTransporte <em>Lst Transporte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryTransporteImpl extends EObjectImpl implements FactoryTransporte {
	/**
	 * The default value of the '{@link #getIdTransporte() <em>Id Transporte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTransporte()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_TRANSPORTE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdTransporte() <em>Id Transporte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTransporte()
	 * @generated
	 * @ordered
	 */
	protected String idTransporte = ID_TRANSPORTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstTransporte() <em>Lst Transporte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstTransporte()
	 * @generated
	 * @ordered
	 */
	protected EList<Transporte> lstTransporte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryTransporteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportePackage.Literals.FACTORY_TRANSPORTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdTransporte() {
		return idTransporte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdTransporte(String newIdTransporte) {
		String oldIdTransporte = idTransporte;
		idTransporte = newIdTransporte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportePackage.FACTORY_TRANSPORTE__ID_TRANSPORTE, oldIdTransporte, idTransporte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getOwenedByDomain() {
		if (eContainerFeatureID() != TransportePackage.FACTORY_TRANSPORTE__OWENED_BY_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByDomain(Domain newOwenedByDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByDomain, TransportePackage.FACTORY_TRANSPORTE__OWENED_BY_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByDomain(Domain newOwenedByDomain) {
		if (newOwenedByDomain != eInternalContainer() || (eContainerFeatureID() != TransportePackage.FACTORY_TRANSPORTE__OWENED_BY_DOMAIN && newOwenedByDomain != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByDomain != null)
				msgs = ((InternalEObject)newOwenedByDomain).eInverseAdd(this, DomainPackage.DOMAIN__LST_FACTORY_TRANSPORTE, Domain.class, msgs);
			msgs = basicSetOwenedByDomain(newOwenedByDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportePackage.FACTORY_TRANSPORTE__OWENED_BY_DOMAIN, newOwenedByDomain, newOwenedByDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transporte> getLstTransporte() {
		if (lstTransporte == null) {
			lstTransporte = new EObjectContainmentWithInverseEList<Transporte>(Transporte.class, this, TransportePackage.FACTORY_TRANSPORTE__LST_TRANSPORTE, TransportePackage.TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE);
		}
		return lstTransporte;
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
			case TransportePackage.FACTORY_TRANSPORTE__OWENED_BY_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByDomain((Domain)otherEnd, msgs);
			case TransportePackage.FACTORY_TRANSPORTE__LST_TRANSPORTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstTransporte()).basicAdd(otherEnd, msgs);
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
			case TransportePackage.FACTORY_TRANSPORTE__OWENED_BY_DOMAIN:
				return basicSetOwenedByDomain(null, msgs);
			case TransportePackage.FACTORY_TRANSPORTE__LST_TRANSPORTE:
				return ((InternalEList<?>)getLstTransporte()).basicRemove(otherEnd, msgs);
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
			case TransportePackage.FACTORY_TRANSPORTE__OWENED_BY_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LST_FACTORY_TRANSPORTE, Domain.class, msgs);
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
			case TransportePackage.FACTORY_TRANSPORTE__ID_TRANSPORTE:
				return getIdTransporte();
			case TransportePackage.FACTORY_TRANSPORTE__OWENED_BY_DOMAIN:
				return getOwenedByDomain();
			case TransportePackage.FACTORY_TRANSPORTE__LST_TRANSPORTE:
				return getLstTransporte();
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
			case TransportePackage.FACTORY_TRANSPORTE__ID_TRANSPORTE:
				setIdTransporte((String)newValue);
				return;
			case TransportePackage.FACTORY_TRANSPORTE__OWENED_BY_DOMAIN:
				setOwenedByDomain((Domain)newValue);
				return;
			case TransportePackage.FACTORY_TRANSPORTE__LST_TRANSPORTE:
				getLstTransporte().clear();
				getLstTransporte().addAll((Collection<? extends Transporte>)newValue);
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
			case TransportePackage.FACTORY_TRANSPORTE__ID_TRANSPORTE:
				setIdTransporte(ID_TRANSPORTE_EDEFAULT);
				return;
			case TransportePackage.FACTORY_TRANSPORTE__OWENED_BY_DOMAIN:
				setOwenedByDomain((Domain)null);
				return;
			case TransportePackage.FACTORY_TRANSPORTE__LST_TRANSPORTE:
				getLstTransporte().clear();
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
			case TransportePackage.FACTORY_TRANSPORTE__ID_TRANSPORTE:
				return ID_TRANSPORTE_EDEFAULT == null ? idTransporte != null : !ID_TRANSPORTE_EDEFAULT.equals(idTransporte);
			case TransportePackage.FACTORY_TRANSPORTE__OWENED_BY_DOMAIN:
				return getOwenedByDomain() != null;
			case TransportePackage.FACTORY_TRANSPORTE__LST_TRANSPORTE:
				return lstTransporte != null && !lstTransporte.isEmpty();
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
		result.append(" (idTransporte: ");
		result.append(idTransporte);
		result.append(')');
		return result.toString();
	}

} //FactoryTransporteImpl
