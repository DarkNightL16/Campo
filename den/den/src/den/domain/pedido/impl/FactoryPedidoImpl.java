/**
 */
package den.domain.pedido.impl;

import den.domain.Domain;
import den.domain.DomainPackage;

import den.domain.pedido.FactoryPedido;
import den.domain.pedido.Pedido;
import den.domain.pedido.PedidoPackage;

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
 * An implementation of the model object '<em><b>Factory Pedido</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.pedido.impl.FactoryPedidoImpl#getIdPedido <em>Id Pedido</em>}</li>
 *   <li>{@link den.domain.pedido.impl.FactoryPedidoImpl#getOwenedByDomain <em>Owened By Domain</em>}</li>
 *   <li>{@link den.domain.pedido.impl.FactoryPedidoImpl#getLstPedido <em>Lst Pedido</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryPedidoImpl extends EObjectImpl implements FactoryPedido {
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
	 * The cached value of the '{@link #getLstPedido() <em>Lst Pedido</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPedido()
	 * @generated
	 * @ordered
	 */
	protected EList<Pedido> lstPedido;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryPedidoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PedidoPackage.Literals.FACTORY_PEDIDO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.FACTORY_PEDIDO__ID_PEDIDO, oldIdPedido, idPedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getOwenedByDomain() {
		if (eContainerFeatureID() != PedidoPackage.FACTORY_PEDIDO__OWENED_BY_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByDomain(Domain newOwenedByDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByDomain, PedidoPackage.FACTORY_PEDIDO__OWENED_BY_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByDomain(Domain newOwenedByDomain) {
		if (newOwenedByDomain != eInternalContainer() || (eContainerFeatureID() != PedidoPackage.FACTORY_PEDIDO__OWENED_BY_DOMAIN && newOwenedByDomain != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByDomain != null)
				msgs = ((InternalEObject)newOwenedByDomain).eInverseAdd(this, DomainPackage.DOMAIN__LST_FACTORY_PEDIDO, Domain.class, msgs);
			msgs = basicSetOwenedByDomain(newOwenedByDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PedidoPackage.FACTORY_PEDIDO__OWENED_BY_DOMAIN, newOwenedByDomain, newOwenedByDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pedido> getLstPedido() {
		if (lstPedido == null) {
			lstPedido = new EObjectContainmentWithInverseEList<Pedido>(Pedido.class, this, PedidoPackage.FACTORY_PEDIDO__LST_PEDIDO, PedidoPackage.PEDIDO__OWENED_BY_FACTORY_PEDIDO);
		}
		return lstPedido;
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
			case PedidoPackage.FACTORY_PEDIDO__OWENED_BY_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByDomain((Domain)otherEnd, msgs);
			case PedidoPackage.FACTORY_PEDIDO__LST_PEDIDO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstPedido()).basicAdd(otherEnd, msgs);
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
			case PedidoPackage.FACTORY_PEDIDO__OWENED_BY_DOMAIN:
				return basicSetOwenedByDomain(null, msgs);
			case PedidoPackage.FACTORY_PEDIDO__LST_PEDIDO:
				return ((InternalEList<?>)getLstPedido()).basicRemove(otherEnd, msgs);
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
			case PedidoPackage.FACTORY_PEDIDO__OWENED_BY_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LST_FACTORY_PEDIDO, Domain.class, msgs);
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
			case PedidoPackage.FACTORY_PEDIDO__ID_PEDIDO:
				return getIdPedido();
			case PedidoPackage.FACTORY_PEDIDO__OWENED_BY_DOMAIN:
				return getOwenedByDomain();
			case PedidoPackage.FACTORY_PEDIDO__LST_PEDIDO:
				return getLstPedido();
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
			case PedidoPackage.FACTORY_PEDIDO__ID_PEDIDO:
				setIdPedido((String)newValue);
				return;
			case PedidoPackage.FACTORY_PEDIDO__OWENED_BY_DOMAIN:
				setOwenedByDomain((Domain)newValue);
				return;
			case PedidoPackage.FACTORY_PEDIDO__LST_PEDIDO:
				getLstPedido().clear();
				getLstPedido().addAll((Collection<? extends Pedido>)newValue);
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
			case PedidoPackage.FACTORY_PEDIDO__ID_PEDIDO:
				setIdPedido(ID_PEDIDO_EDEFAULT);
				return;
			case PedidoPackage.FACTORY_PEDIDO__OWENED_BY_DOMAIN:
				setOwenedByDomain((Domain)null);
				return;
			case PedidoPackage.FACTORY_PEDIDO__LST_PEDIDO:
				getLstPedido().clear();
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
			case PedidoPackage.FACTORY_PEDIDO__ID_PEDIDO:
				return ID_PEDIDO_EDEFAULT == null ? idPedido != null : !ID_PEDIDO_EDEFAULT.equals(idPedido);
			case PedidoPackage.FACTORY_PEDIDO__OWENED_BY_DOMAIN:
				return getOwenedByDomain() != null;
			case PedidoPackage.FACTORY_PEDIDO__LST_PEDIDO:
				return lstPedido != null && !lstPedido.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //FactoryPedidoImpl
