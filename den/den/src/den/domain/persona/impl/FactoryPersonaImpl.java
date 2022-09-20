/**
 */
package den.domain.persona.impl;

import den.domain.Domain;
import den.domain.DomainPackage;

import den.domain.persona.FactoryPersona;
import den.domain.persona.Persona;
import den.domain.persona.PersonaPackage;

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
 * An implementation of the model object '<em><b>Factory Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.persona.impl.FactoryPersonaImpl#getIdPersona <em>Id Persona</em>}</li>
 *   <li>{@link den.domain.persona.impl.FactoryPersonaImpl#getOwenedByDomain <em>Owened By Domain</em>}</li>
 *   <li>{@link den.domain.persona.impl.FactoryPersonaImpl#getLstPersona <em>Lst Persona</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryPersonaImpl extends EObjectImpl implements FactoryPersona {
	/**
	 * The default value of the '{@link #getIdPersona() <em>Id Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPersona()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_PERSONA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdPersona() <em>Id Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPersona()
	 * @generated
	 * @ordered
	 */
	protected String idPersona = ID_PERSONA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstPersona() <em>Lst Persona</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPersona()
	 * @generated
	 * @ordered
	 */
	protected EList<Persona> lstPersona;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryPersonaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersonaPackage.Literals.FACTORY_PERSONA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdPersona() {
		return idPersona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPersona(String newIdPersona) {
		String oldIdPersona = idPersona;
		idPersona = newIdPersona;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.FACTORY_PERSONA__ID_PERSONA, oldIdPersona, idPersona));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getOwenedByDomain() {
		if (eContainerFeatureID() != PersonaPackage.FACTORY_PERSONA__OWENED_BY_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByDomain(Domain newOwenedByDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByDomain, PersonaPackage.FACTORY_PERSONA__OWENED_BY_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByDomain(Domain newOwenedByDomain) {
		if (newOwenedByDomain != eInternalContainer() || (eContainerFeatureID() != PersonaPackage.FACTORY_PERSONA__OWENED_BY_DOMAIN && newOwenedByDomain != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByDomain != null)
				msgs = ((InternalEObject)newOwenedByDomain).eInverseAdd(this, DomainPackage.DOMAIN__LST_FACTORY_PERSONA, Domain.class, msgs);
			msgs = basicSetOwenedByDomain(newOwenedByDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.FACTORY_PERSONA__OWENED_BY_DOMAIN, newOwenedByDomain, newOwenedByDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Persona> getLstPersona() {
		if (lstPersona == null) {
			lstPersona = new EObjectContainmentWithInverseEList<Persona>(Persona.class, this, PersonaPackage.FACTORY_PERSONA__LST_PERSONA, PersonaPackage.PERSONA__OWENED_BY_FACTORY_PERSONA);
		}
		return lstPersona;
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
			case PersonaPackage.FACTORY_PERSONA__OWENED_BY_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByDomain((Domain)otherEnd, msgs);
			case PersonaPackage.FACTORY_PERSONA__LST_PERSONA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstPersona()).basicAdd(otherEnd, msgs);
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
			case PersonaPackage.FACTORY_PERSONA__OWENED_BY_DOMAIN:
				return basicSetOwenedByDomain(null, msgs);
			case PersonaPackage.FACTORY_PERSONA__LST_PERSONA:
				return ((InternalEList<?>)getLstPersona()).basicRemove(otherEnd, msgs);
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
			case PersonaPackage.FACTORY_PERSONA__OWENED_BY_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LST_FACTORY_PERSONA, Domain.class, msgs);
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
			case PersonaPackage.FACTORY_PERSONA__ID_PERSONA:
				return getIdPersona();
			case PersonaPackage.FACTORY_PERSONA__OWENED_BY_DOMAIN:
				return getOwenedByDomain();
			case PersonaPackage.FACTORY_PERSONA__LST_PERSONA:
				return getLstPersona();
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
			case PersonaPackage.FACTORY_PERSONA__ID_PERSONA:
				setIdPersona((String)newValue);
				return;
			case PersonaPackage.FACTORY_PERSONA__OWENED_BY_DOMAIN:
				setOwenedByDomain((Domain)newValue);
				return;
			case PersonaPackage.FACTORY_PERSONA__LST_PERSONA:
				getLstPersona().clear();
				getLstPersona().addAll((Collection<? extends Persona>)newValue);
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
			case PersonaPackage.FACTORY_PERSONA__ID_PERSONA:
				setIdPersona(ID_PERSONA_EDEFAULT);
				return;
			case PersonaPackage.FACTORY_PERSONA__OWENED_BY_DOMAIN:
				setOwenedByDomain((Domain)null);
				return;
			case PersonaPackage.FACTORY_PERSONA__LST_PERSONA:
				getLstPersona().clear();
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
			case PersonaPackage.FACTORY_PERSONA__ID_PERSONA:
				return ID_PERSONA_EDEFAULT == null ? idPersona != null : !ID_PERSONA_EDEFAULT.equals(idPersona);
			case PersonaPackage.FACTORY_PERSONA__OWENED_BY_DOMAIN:
				return getOwenedByDomain() != null;
			case PersonaPackage.FACTORY_PERSONA__LST_PERSONA:
				return lstPersona != null && !lstPersona.isEmpty();
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
		result.append(" (idPersona: ");
		result.append(idPersona);
		result.append(')');
		return result.toString();
	}

} //FactoryPersonaImpl
