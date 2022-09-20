/**
 */
package den.domain.persona.impl;

import den.domain.persona.Conductor;
import den.domain.persona.Persona;
import den.domain.persona.PersonaPackage;

import den.domain.transporte.Transporte;
import den.domain.transporte.TransportePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conductor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.persona.impl.ConductorImpl#getLstTransporte <em>Lst Transporte</em>}</li>
 *   <li>{@link den.domain.persona.impl.ConductorImpl#getIdConductor <em>Id Conductor</em>}</li>
 *   <li>{@link den.domain.persona.impl.ConductorImpl#getCategoriaLicencia <em>Categoria Licencia</em>}</li>
 *   <li>{@link den.domain.persona.impl.ConductorImpl#getCodigoLicencia <em>Codigo Licencia</em>}</li>
 *   <li>{@link den.domain.persona.impl.ConductorImpl#getOwenedByPersona <em>Owened By Persona</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConductorImpl extends EObjectImpl implements Conductor {
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
	 * The default value of the '{@link #getIdConductor() <em>Id Conductor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdConductor()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_CONDUCTOR_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdConductor() <em>Id Conductor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdConductor()
	 * @generated
	 * @ordered
	 */
	protected String idConductor = ID_CONDUCTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategoriaLicencia() <em>Categoria Licencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoriaLicencia()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORIA_LICENCIA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getCategoriaLicencia() <em>Categoria Licencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoriaLicencia()
	 * @generated
	 * @ordered
	 */
	protected String categoriaLicencia = CATEGORIA_LICENCIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodigoLicencia() <em>Codigo Licencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoLicencia()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_LICENCIA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getCodigoLicencia() <em>Codigo Licencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoLicencia()
	 * @generated
	 * @ordered
	 */
	protected String codigoLicencia = CODIGO_LICENCIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConductorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersonaPackage.Literals.CONDUCTOR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersonaPackage.CONDUCTOR__LST_TRANSPORTE, oldLstTransporte, lstTransporte));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersonaPackage.CONDUCTOR__LST_TRANSPORTE, oldLstTransporte, newLstTransporte);
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
				msgs = ((InternalEObject)lstTransporte).eInverseRemove(this, TransportePackage.TRANSPORTE__LST_CONDUCTOR, Transporte.class, msgs);
			if (newLstTransporte != null)
				msgs = ((InternalEObject)newLstTransporte).eInverseAdd(this, TransportePackage.TRANSPORTE__LST_CONDUCTOR, Transporte.class, msgs);
			msgs = basicSetLstTransporte(newLstTransporte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.CONDUCTOR__LST_TRANSPORTE, newLstTransporte, newLstTransporte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdConductor() {
		return idConductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdConductor(String newIdConductor) {
		String oldIdConductor = idConductor;
		idConductor = newIdConductor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.CONDUCTOR__ID_CONDUCTOR, oldIdConductor, idConductor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategoriaLicencia() {
		return categoriaLicencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoriaLicencia(String newCategoriaLicencia) {
		String oldCategoriaLicencia = categoriaLicencia;
		categoriaLicencia = newCategoriaLicencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.CONDUCTOR__CATEGORIA_LICENCIA, oldCategoriaLicencia, categoriaLicencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigoLicencia() {
		return codigoLicencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigoLicencia(String newCodigoLicencia) {
		String oldCodigoLicencia = codigoLicencia;
		codigoLicencia = newCodigoLicencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.CONDUCTOR__CODIGO_LICENCIA, oldCodigoLicencia, codigoLicencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona getOwenedByPersona() {
		if (eContainerFeatureID() != PersonaPackage.CONDUCTOR__OWENED_BY_PERSONA) return null;
		return (Persona)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByPersona(Persona newOwenedByPersona, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByPersona, PersonaPackage.CONDUCTOR__OWENED_BY_PERSONA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByPersona(Persona newOwenedByPersona) {
		if (newOwenedByPersona != eInternalContainer() || (eContainerFeatureID() != PersonaPackage.CONDUCTOR__OWENED_BY_PERSONA && newOwenedByPersona != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByPersona))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByPersona != null)
				msgs = ((InternalEObject)newOwenedByPersona).eInverseAdd(this, PersonaPackage.PERSONA__LST_CONDUCTOR, Persona.class, msgs);
			msgs = basicSetOwenedByPersona(newOwenedByPersona, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.CONDUCTOR__OWENED_BY_PERSONA, newOwenedByPersona, newOwenedByPersona));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersonaPackage.CONDUCTOR__LST_TRANSPORTE:
				if (lstTransporte != null)
					msgs = ((InternalEObject)lstTransporte).eInverseRemove(this, TransportePackage.TRANSPORTE__LST_CONDUCTOR, Transporte.class, msgs);
				return basicSetLstTransporte((Transporte)otherEnd, msgs);
			case PersonaPackage.CONDUCTOR__OWENED_BY_PERSONA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByPersona((Persona)otherEnd, msgs);
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
			case PersonaPackage.CONDUCTOR__LST_TRANSPORTE:
				return basicSetLstTransporte(null, msgs);
			case PersonaPackage.CONDUCTOR__OWENED_BY_PERSONA:
				return basicSetOwenedByPersona(null, msgs);
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
			case PersonaPackage.CONDUCTOR__OWENED_BY_PERSONA:
				return eInternalContainer().eInverseRemove(this, PersonaPackage.PERSONA__LST_CONDUCTOR, Persona.class, msgs);
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
			case PersonaPackage.CONDUCTOR__LST_TRANSPORTE:
				if (resolve) return getLstTransporte();
				return basicGetLstTransporte();
			case PersonaPackage.CONDUCTOR__ID_CONDUCTOR:
				return getIdConductor();
			case PersonaPackage.CONDUCTOR__CATEGORIA_LICENCIA:
				return getCategoriaLicencia();
			case PersonaPackage.CONDUCTOR__CODIGO_LICENCIA:
				return getCodigoLicencia();
			case PersonaPackage.CONDUCTOR__OWENED_BY_PERSONA:
				return getOwenedByPersona();
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
			case PersonaPackage.CONDUCTOR__LST_TRANSPORTE:
				setLstTransporte((Transporte)newValue);
				return;
			case PersonaPackage.CONDUCTOR__ID_CONDUCTOR:
				setIdConductor((String)newValue);
				return;
			case PersonaPackage.CONDUCTOR__CATEGORIA_LICENCIA:
				setCategoriaLicencia((String)newValue);
				return;
			case PersonaPackage.CONDUCTOR__CODIGO_LICENCIA:
				setCodigoLicencia((String)newValue);
				return;
			case PersonaPackage.CONDUCTOR__OWENED_BY_PERSONA:
				setOwenedByPersona((Persona)newValue);
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
			case PersonaPackage.CONDUCTOR__LST_TRANSPORTE:
				setLstTransporte((Transporte)null);
				return;
			case PersonaPackage.CONDUCTOR__ID_CONDUCTOR:
				setIdConductor(ID_CONDUCTOR_EDEFAULT);
				return;
			case PersonaPackage.CONDUCTOR__CATEGORIA_LICENCIA:
				setCategoriaLicencia(CATEGORIA_LICENCIA_EDEFAULT);
				return;
			case PersonaPackage.CONDUCTOR__CODIGO_LICENCIA:
				setCodigoLicencia(CODIGO_LICENCIA_EDEFAULT);
				return;
			case PersonaPackage.CONDUCTOR__OWENED_BY_PERSONA:
				setOwenedByPersona((Persona)null);
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
			case PersonaPackage.CONDUCTOR__LST_TRANSPORTE:
				return lstTransporte != null;
			case PersonaPackage.CONDUCTOR__ID_CONDUCTOR:
				return ID_CONDUCTOR_EDEFAULT == null ? idConductor != null : !ID_CONDUCTOR_EDEFAULT.equals(idConductor);
			case PersonaPackage.CONDUCTOR__CATEGORIA_LICENCIA:
				return CATEGORIA_LICENCIA_EDEFAULT == null ? categoriaLicencia != null : !CATEGORIA_LICENCIA_EDEFAULT.equals(categoriaLicencia);
			case PersonaPackage.CONDUCTOR__CODIGO_LICENCIA:
				return CODIGO_LICENCIA_EDEFAULT == null ? codigoLicencia != null : !CODIGO_LICENCIA_EDEFAULT.equals(codigoLicencia);
			case PersonaPackage.CONDUCTOR__OWENED_BY_PERSONA:
				return getOwenedByPersona() != null;
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
		result.append(" (idConductor: ");
		result.append(idConductor);
		result.append(", categoriaLicencia: ");
		result.append(categoriaLicencia);
		result.append(", codigoLicencia: ");
		result.append(codigoLicencia);
		result.append(')');
		return result.toString();
	}

} //ConductorImpl
