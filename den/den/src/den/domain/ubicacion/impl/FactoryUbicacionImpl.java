/**
 */
package den.domain.ubicacion.impl;

import den.domain.Domain;
import den.domain.DomainPackage;

import den.domain.ubicacion.FactoryUbicacion;
import den.domain.ubicacion.Pais;
import den.domain.ubicacion.UbicacionPackage;

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
 * An implementation of the model object '<em><b>Factory Ubicacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.ubicacion.impl.FactoryUbicacionImpl#getId <em>Id</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.FactoryUbicacionImpl#getOwenedByDomain <em>Owened By Domain</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.FactoryUbicacionImpl#getLstPais <em>Lst Pais</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryUbicacionImpl extends EObjectImpl implements FactoryUbicacion {
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
	 * The cached value of the '{@link #getLstPais() <em>Lst Pais</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPais()
	 * @generated
	 * @ordered
	 */
	protected EList<Pais> lstPais;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryUbicacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbicacionPackage.Literals.FACTORY_UBICACION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.FACTORY_UBICACION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getOwenedByDomain() {
		if (eContainerFeatureID() != UbicacionPackage.FACTORY_UBICACION__OWENED_BY_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByDomain(Domain newOwenedByDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByDomain, UbicacionPackage.FACTORY_UBICACION__OWENED_BY_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByDomain(Domain newOwenedByDomain) {
		if (newOwenedByDomain != eInternalContainer() || (eContainerFeatureID() != UbicacionPackage.FACTORY_UBICACION__OWENED_BY_DOMAIN && newOwenedByDomain != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByDomain != null)
				msgs = ((InternalEObject)newOwenedByDomain).eInverseAdd(this, DomainPackage.DOMAIN__LST_FACTORY_UBICACION, Domain.class, msgs);
			msgs = basicSetOwenedByDomain(newOwenedByDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.FACTORY_UBICACION__OWENED_BY_DOMAIN, newOwenedByDomain, newOwenedByDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pais> getLstPais() {
		if (lstPais == null) {
			lstPais = new EObjectContainmentWithInverseEList<Pais>(Pais.class, this, UbicacionPackage.FACTORY_UBICACION__LST_PAIS, UbicacionPackage.PAIS__OWENED_BY_UBICACION);
		}
		return lstPais;
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
			case UbicacionPackage.FACTORY_UBICACION__OWENED_BY_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByDomain((Domain)otherEnd, msgs);
			case UbicacionPackage.FACTORY_UBICACION__LST_PAIS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstPais()).basicAdd(otherEnd, msgs);
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
			case UbicacionPackage.FACTORY_UBICACION__OWENED_BY_DOMAIN:
				return basicSetOwenedByDomain(null, msgs);
			case UbicacionPackage.FACTORY_UBICACION__LST_PAIS:
				return ((InternalEList<?>)getLstPais()).basicRemove(otherEnd, msgs);
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
			case UbicacionPackage.FACTORY_UBICACION__OWENED_BY_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LST_FACTORY_UBICACION, Domain.class, msgs);
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
			case UbicacionPackage.FACTORY_UBICACION__ID:
				return getId();
			case UbicacionPackage.FACTORY_UBICACION__OWENED_BY_DOMAIN:
				return getOwenedByDomain();
			case UbicacionPackage.FACTORY_UBICACION__LST_PAIS:
				return getLstPais();
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
			case UbicacionPackage.FACTORY_UBICACION__ID:
				setId((String)newValue);
				return;
			case UbicacionPackage.FACTORY_UBICACION__OWENED_BY_DOMAIN:
				setOwenedByDomain((Domain)newValue);
				return;
			case UbicacionPackage.FACTORY_UBICACION__LST_PAIS:
				getLstPais().clear();
				getLstPais().addAll((Collection<? extends Pais>)newValue);
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
			case UbicacionPackage.FACTORY_UBICACION__ID:
				setId(ID_EDEFAULT);
				return;
			case UbicacionPackage.FACTORY_UBICACION__OWENED_BY_DOMAIN:
				setOwenedByDomain((Domain)null);
				return;
			case UbicacionPackage.FACTORY_UBICACION__LST_PAIS:
				getLstPais().clear();
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
			case UbicacionPackage.FACTORY_UBICACION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UbicacionPackage.FACTORY_UBICACION__OWENED_BY_DOMAIN:
				return getOwenedByDomain() != null;
			case UbicacionPackage.FACTORY_UBICACION__LST_PAIS:
				return lstPais != null && !lstPais.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //FactoryUbicacionImpl
