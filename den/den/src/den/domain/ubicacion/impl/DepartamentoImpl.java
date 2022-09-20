/**
 */
package den.domain.ubicacion.impl;

import den.domain.ubicacion.Ciudad;
import den.domain.ubicacion.Departamento;
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
 * An implementation of the model object '<em><b>Departamento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.ubicacion.impl.DepartamentoImpl#getLstCiudad <em>Lst Ciudad</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.DepartamentoImpl#getIdDepartamento <em>Id Departamento</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.DepartamentoImpl#getCapital <em>Capital</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.DepartamentoImpl#getPrefijoTelefonico <em>Prefijo Telefonico</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.DepartamentoImpl#getCoordenadas <em>Coordenadas</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.DepartamentoImpl#getOwenedByPais <em>Owened By Pais</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartamentoImpl extends EObjectImpl implements Departamento {
	/**
	 * The cached value of the '{@link #getLstCiudad() <em>Lst Ciudad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstCiudad()
	 * @generated
	 * @ordered
	 */
	protected EList<Ciudad> lstCiudad;

	/**
	 * The default value of the '{@link #getIdDepartamento() <em>Id Departamento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDepartamento()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_DEPARTAMENTO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdDepartamento() <em>Id Departamento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDepartamento()
	 * @generated
	 * @ordered
	 */
	protected String idDepartamento = ID_DEPARTAMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapital() <em>Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapital()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPITAL_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getCapital() <em>Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapital()
	 * @generated
	 * @ordered
	 */
	protected String capital = CAPITAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefijoTelefonico() <em>Prefijo Telefonico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefijoTelefonico()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIJO_TELEFONICO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getPrefijoTelefonico() <em>Prefijo Telefonico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefijoTelefonico()
	 * @generated
	 * @ordered
	 */
	protected String prefijoTelefonico = PREFIJO_TELEFONICO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordenadas() <em>Coordenadas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordenadas()
	 * @generated
	 * @ordered
	 */
	protected static final String COORDENADAS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getCoordenadas() <em>Coordenadas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordenadas()
	 * @generated
	 * @ordered
	 */
	protected String coordenadas = COORDENADAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartamentoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbicacionPackage.Literals.DEPARTAMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ciudad> getLstCiudad() {
		if (lstCiudad == null) {
			lstCiudad = new EObjectContainmentWithInverseEList<Ciudad>(Ciudad.class, this, UbicacionPackage.DEPARTAMENTO__LST_CIUDAD, UbicacionPackage.CIUDAD__OWENED_DEPARTAMENTO);
		}
		return lstCiudad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdDepartamento() {
		return idDepartamento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdDepartamento(String newIdDepartamento) {
		String oldIdDepartamento = idDepartamento;
		idDepartamento = newIdDepartamento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.DEPARTAMENTO__ID_DEPARTAMENTO, oldIdDepartamento, idDepartamento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapital() {
		return capital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapital(String newCapital) {
		String oldCapital = capital;
		capital = newCapital;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.DEPARTAMENTO__CAPITAL, oldCapital, capital));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefijoTelefonico() {
		return prefijoTelefonico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefijoTelefonico(String newPrefijoTelefonico) {
		String oldPrefijoTelefonico = prefijoTelefonico;
		prefijoTelefonico = newPrefijoTelefonico;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.DEPARTAMENTO__PREFIJO_TELEFONICO, oldPrefijoTelefonico, prefijoTelefonico));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoordenadas() {
		return coordenadas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordenadas(String newCoordenadas) {
		String oldCoordenadas = coordenadas;
		coordenadas = newCoordenadas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.DEPARTAMENTO__COORDENADAS, oldCoordenadas, coordenadas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pais getOwenedByPais() {
		if (eContainerFeatureID() != UbicacionPackage.DEPARTAMENTO__OWENED_BY_PAIS) return null;
		return (Pais)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByPais(Pais newOwenedByPais, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByPais, UbicacionPackage.DEPARTAMENTO__OWENED_BY_PAIS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByPais(Pais newOwenedByPais) {
		if (newOwenedByPais != eInternalContainer() || (eContainerFeatureID() != UbicacionPackage.DEPARTAMENTO__OWENED_BY_PAIS && newOwenedByPais != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByPais))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByPais != null)
				msgs = ((InternalEObject)newOwenedByPais).eInverseAdd(this, UbicacionPackage.PAIS__LST_DEPARTAMENTO, Pais.class, msgs);
			msgs = basicSetOwenedByPais(newOwenedByPais, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.DEPARTAMENTO__OWENED_BY_PAIS, newOwenedByPais, newOwenedByPais));
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
			case UbicacionPackage.DEPARTAMENTO__LST_CIUDAD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstCiudad()).basicAdd(otherEnd, msgs);
			case UbicacionPackage.DEPARTAMENTO__OWENED_BY_PAIS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByPais((Pais)otherEnd, msgs);
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
			case UbicacionPackage.DEPARTAMENTO__LST_CIUDAD:
				return ((InternalEList<?>)getLstCiudad()).basicRemove(otherEnd, msgs);
			case UbicacionPackage.DEPARTAMENTO__OWENED_BY_PAIS:
				return basicSetOwenedByPais(null, msgs);
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
			case UbicacionPackage.DEPARTAMENTO__OWENED_BY_PAIS:
				return eInternalContainer().eInverseRemove(this, UbicacionPackage.PAIS__LST_DEPARTAMENTO, Pais.class, msgs);
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
			case UbicacionPackage.DEPARTAMENTO__LST_CIUDAD:
				return getLstCiudad();
			case UbicacionPackage.DEPARTAMENTO__ID_DEPARTAMENTO:
				return getIdDepartamento();
			case UbicacionPackage.DEPARTAMENTO__CAPITAL:
				return getCapital();
			case UbicacionPackage.DEPARTAMENTO__PREFIJO_TELEFONICO:
				return getPrefijoTelefonico();
			case UbicacionPackage.DEPARTAMENTO__COORDENADAS:
				return getCoordenadas();
			case UbicacionPackage.DEPARTAMENTO__OWENED_BY_PAIS:
				return getOwenedByPais();
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
			case UbicacionPackage.DEPARTAMENTO__LST_CIUDAD:
				getLstCiudad().clear();
				getLstCiudad().addAll((Collection<? extends Ciudad>)newValue);
				return;
			case UbicacionPackage.DEPARTAMENTO__ID_DEPARTAMENTO:
				setIdDepartamento((String)newValue);
				return;
			case UbicacionPackage.DEPARTAMENTO__CAPITAL:
				setCapital((String)newValue);
				return;
			case UbicacionPackage.DEPARTAMENTO__PREFIJO_TELEFONICO:
				setPrefijoTelefonico((String)newValue);
				return;
			case UbicacionPackage.DEPARTAMENTO__COORDENADAS:
				setCoordenadas((String)newValue);
				return;
			case UbicacionPackage.DEPARTAMENTO__OWENED_BY_PAIS:
				setOwenedByPais((Pais)newValue);
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
			case UbicacionPackage.DEPARTAMENTO__LST_CIUDAD:
				getLstCiudad().clear();
				return;
			case UbicacionPackage.DEPARTAMENTO__ID_DEPARTAMENTO:
				setIdDepartamento(ID_DEPARTAMENTO_EDEFAULT);
				return;
			case UbicacionPackage.DEPARTAMENTO__CAPITAL:
				setCapital(CAPITAL_EDEFAULT);
				return;
			case UbicacionPackage.DEPARTAMENTO__PREFIJO_TELEFONICO:
				setPrefijoTelefonico(PREFIJO_TELEFONICO_EDEFAULT);
				return;
			case UbicacionPackage.DEPARTAMENTO__COORDENADAS:
				setCoordenadas(COORDENADAS_EDEFAULT);
				return;
			case UbicacionPackage.DEPARTAMENTO__OWENED_BY_PAIS:
				setOwenedByPais((Pais)null);
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
			case UbicacionPackage.DEPARTAMENTO__LST_CIUDAD:
				return lstCiudad != null && !lstCiudad.isEmpty();
			case UbicacionPackage.DEPARTAMENTO__ID_DEPARTAMENTO:
				return ID_DEPARTAMENTO_EDEFAULT == null ? idDepartamento != null : !ID_DEPARTAMENTO_EDEFAULT.equals(idDepartamento);
			case UbicacionPackage.DEPARTAMENTO__CAPITAL:
				return CAPITAL_EDEFAULT == null ? capital != null : !CAPITAL_EDEFAULT.equals(capital);
			case UbicacionPackage.DEPARTAMENTO__PREFIJO_TELEFONICO:
				return PREFIJO_TELEFONICO_EDEFAULT == null ? prefijoTelefonico != null : !PREFIJO_TELEFONICO_EDEFAULT.equals(prefijoTelefonico);
			case UbicacionPackage.DEPARTAMENTO__COORDENADAS:
				return COORDENADAS_EDEFAULT == null ? coordenadas != null : !COORDENADAS_EDEFAULT.equals(coordenadas);
			case UbicacionPackage.DEPARTAMENTO__OWENED_BY_PAIS:
				return getOwenedByPais() != null;
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
		result.append(" (idDepartamento: ");
		result.append(idDepartamento);
		result.append(", capital: ");
		result.append(capital);
		result.append(", prefijoTelefonico: ");
		result.append(prefijoTelefonico);
		result.append(", coordenadas: ");
		result.append(coordenadas);
		result.append(')');
		return result.toString();
	}

} //DepartamentoImpl
