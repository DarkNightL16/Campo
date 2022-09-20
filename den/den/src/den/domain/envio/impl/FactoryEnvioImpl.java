/**
 */
package den.domain.envio.impl;

import den.domain.Domain;
import den.domain.DomainPackage;

import den.domain.envio.Envio;
import den.domain.envio.EnvioPackage;
import den.domain.envio.FactoryEnvio;

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
 * An implementation of the model object '<em><b>Factory Envio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.envio.impl.FactoryEnvioImpl#getLstEnvio <em>Lst Envio</em>}</li>
 *   <li>{@link den.domain.envio.impl.FactoryEnvioImpl#getIdEnvio <em>Id Envio</em>}</li>
 *   <li>{@link den.domain.envio.impl.FactoryEnvioImpl#getOwenedByDomain <em>Owened By Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryEnvioImpl extends EObjectImpl implements FactoryEnvio {
	/**
	 * The cached value of the '{@link #getLstEnvio() <em>Lst Envio</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstEnvio()
	 * @generated
	 * @ordered
	 */
	protected EList<Envio> lstEnvio;

	/**
	 * The default value of the '{@link #getIdEnvio() <em>Id Envio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdEnvio()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_ENVIO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdEnvio() <em>Id Envio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdEnvio()
	 * @generated
	 * @ordered
	 */
	protected String idEnvio = ID_ENVIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryEnvioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvioPackage.Literals.FACTORY_ENVIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Envio> getLstEnvio() {
		if (lstEnvio == null) {
			lstEnvio = new EObjectContainmentWithInverseEList<Envio>(Envio.class, this, EnvioPackage.FACTORY_ENVIO__LST_ENVIO, EnvioPackage.ENVIO__OWENED_BY_FACTORY_ENVIO);
		}
		return lstEnvio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdEnvio() {
		return idEnvio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdEnvio(String newIdEnvio) {
		String oldIdEnvio = idEnvio;
		idEnvio = newIdEnvio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.FACTORY_ENVIO__ID_ENVIO, oldIdEnvio, idEnvio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getOwenedByDomain() {
		if (eContainerFeatureID() != EnvioPackage.FACTORY_ENVIO__OWENED_BY_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByDomain(Domain newOwenedByDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByDomain, EnvioPackage.FACTORY_ENVIO__OWENED_BY_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByDomain(Domain newOwenedByDomain) {
		if (newOwenedByDomain != eInternalContainer() || (eContainerFeatureID() != EnvioPackage.FACTORY_ENVIO__OWENED_BY_DOMAIN && newOwenedByDomain != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByDomain != null)
				msgs = ((InternalEObject)newOwenedByDomain).eInverseAdd(this, DomainPackage.DOMAIN__LST_FACTORY_ENVIO, Domain.class, msgs);
			msgs = basicSetOwenedByDomain(newOwenedByDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvioPackage.FACTORY_ENVIO__OWENED_BY_DOMAIN, newOwenedByDomain, newOwenedByDomain));
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
			case EnvioPackage.FACTORY_ENVIO__LST_ENVIO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstEnvio()).basicAdd(otherEnd, msgs);
			case EnvioPackage.FACTORY_ENVIO__OWENED_BY_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByDomain((Domain)otherEnd, msgs);
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
			case EnvioPackage.FACTORY_ENVIO__LST_ENVIO:
				return ((InternalEList<?>)getLstEnvio()).basicRemove(otherEnd, msgs);
			case EnvioPackage.FACTORY_ENVIO__OWENED_BY_DOMAIN:
				return basicSetOwenedByDomain(null, msgs);
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
			case EnvioPackage.FACTORY_ENVIO__OWENED_BY_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LST_FACTORY_ENVIO, Domain.class, msgs);
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
			case EnvioPackage.FACTORY_ENVIO__LST_ENVIO:
				return getLstEnvio();
			case EnvioPackage.FACTORY_ENVIO__ID_ENVIO:
				return getIdEnvio();
			case EnvioPackage.FACTORY_ENVIO__OWENED_BY_DOMAIN:
				return getOwenedByDomain();
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
			case EnvioPackage.FACTORY_ENVIO__LST_ENVIO:
				getLstEnvio().clear();
				getLstEnvio().addAll((Collection<? extends Envio>)newValue);
				return;
			case EnvioPackage.FACTORY_ENVIO__ID_ENVIO:
				setIdEnvio((String)newValue);
				return;
			case EnvioPackage.FACTORY_ENVIO__OWENED_BY_DOMAIN:
				setOwenedByDomain((Domain)newValue);
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
			case EnvioPackage.FACTORY_ENVIO__LST_ENVIO:
				getLstEnvio().clear();
				return;
			case EnvioPackage.FACTORY_ENVIO__ID_ENVIO:
				setIdEnvio(ID_ENVIO_EDEFAULT);
				return;
			case EnvioPackage.FACTORY_ENVIO__OWENED_BY_DOMAIN:
				setOwenedByDomain((Domain)null);
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
			case EnvioPackage.FACTORY_ENVIO__LST_ENVIO:
				return lstEnvio != null && !lstEnvio.isEmpty();
			case EnvioPackage.FACTORY_ENVIO__ID_ENVIO:
				return ID_ENVIO_EDEFAULT == null ? idEnvio != null : !ID_ENVIO_EDEFAULT.equals(idEnvio);
			case EnvioPackage.FACTORY_ENVIO__OWENED_BY_DOMAIN:
				return getOwenedByDomain() != null;
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
		result.append(" (idEnvio: ");
		result.append(idEnvio);
		result.append(')');
		return result.toString();
	}

} //FactoryEnvioImpl
