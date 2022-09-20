/**
 */
package den.domain.ubicacion.impl;

import den.domain.ubicacion.Departamento;
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
 * An implementation of the model object '<em><b>Pais</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.ubicacion.impl.PaisImpl#getLstDepartamento <em>Lst Departamento</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.PaisImpl#getIdPais <em>Id Pais</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.PaisImpl#getCapital <em>Capital</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.PaisImpl#getCodigoInternacional <em>Codigo Internacional</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.PaisImpl#getIdioma <em>Idioma</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.PaisImpl#getCoordenadas <em>Coordenadas</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.PaisImpl#getOwenedByUbicacion <em>Owened By Ubicacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaisImpl extends EObjectImpl implements Pais {
	/**
	 * The cached value of the '{@link #getLstDepartamento() <em>Lst Departamento</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstDepartamento()
	 * @generated
	 * @ordered
	 */
	protected EList<Departamento> lstDepartamento;

	/**
	 * The default value of the '{@link #getIdPais() <em>Id Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPais()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_PAIS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdPais() <em>Id Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPais()
	 * @generated
	 * @ordered
	 */
	protected String idPais = ID_PAIS_EDEFAULT;

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
	 * The default value of the '{@link #getCodigoInternacional() <em>Codigo Internacional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoInternacional()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_INTERNACIONAL_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getCodigoInternacional() <em>Codigo Internacional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoInternacional()
	 * @generated
	 * @ordered
	 */
	protected String codigoInternacional = CODIGO_INTERNACIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdioma() <em>Idioma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdioma()
	 * @generated
	 * @ordered
	 */
	protected static final String IDIOMA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdioma() <em>Idioma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdioma()
	 * @generated
	 * @ordered
	 */
	protected String idioma = IDIOMA_EDEFAULT;

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
	protected PaisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbicacionPackage.Literals.PAIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Departamento> getLstDepartamento() {
		if (lstDepartamento == null) {
			lstDepartamento = new EObjectContainmentWithInverseEList<Departamento>(Departamento.class, this, UbicacionPackage.PAIS__LST_DEPARTAMENTO, UbicacionPackage.DEPARTAMENTO__OWENED_BY_PAIS);
		}
		return lstDepartamento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdPais() {
		return idPais;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPais(String newIdPais) {
		String oldIdPais = idPais;
		idPais = newIdPais;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.PAIS__ID_PAIS, oldIdPais, idPais));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.PAIS__CAPITAL, oldCapital, capital));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigoInternacional() {
		return codigoInternacional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigoInternacional(String newCodigoInternacional) {
		String oldCodigoInternacional = codigoInternacional;
		codigoInternacional = newCodigoInternacional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.PAIS__CODIGO_INTERNACIONAL, oldCodigoInternacional, codigoInternacional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdioma() {
		return idioma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdioma(String newIdioma) {
		String oldIdioma = idioma;
		idioma = newIdioma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.PAIS__IDIOMA, oldIdioma, idioma));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.PAIS__COORDENADAS, oldCoordenadas, coordenadas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryUbicacion getOwenedByUbicacion() {
		if (eContainerFeatureID() != UbicacionPackage.PAIS__OWENED_BY_UBICACION) return null;
		return (FactoryUbicacion)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByUbicacion(FactoryUbicacion newOwenedByUbicacion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByUbicacion, UbicacionPackage.PAIS__OWENED_BY_UBICACION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByUbicacion(FactoryUbicacion newOwenedByUbicacion) {
		if (newOwenedByUbicacion != eInternalContainer() || (eContainerFeatureID() != UbicacionPackage.PAIS__OWENED_BY_UBICACION && newOwenedByUbicacion != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByUbicacion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByUbicacion != null)
				msgs = ((InternalEObject)newOwenedByUbicacion).eInverseAdd(this, UbicacionPackage.FACTORY_UBICACION__LST_PAIS, FactoryUbicacion.class, msgs);
			msgs = basicSetOwenedByUbicacion(newOwenedByUbicacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.PAIS__OWENED_BY_UBICACION, newOwenedByUbicacion, newOwenedByUbicacion));
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
			case UbicacionPackage.PAIS__LST_DEPARTAMENTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstDepartamento()).basicAdd(otherEnd, msgs);
			case UbicacionPackage.PAIS__OWENED_BY_UBICACION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByUbicacion((FactoryUbicacion)otherEnd, msgs);
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
			case UbicacionPackage.PAIS__LST_DEPARTAMENTO:
				return ((InternalEList<?>)getLstDepartamento()).basicRemove(otherEnd, msgs);
			case UbicacionPackage.PAIS__OWENED_BY_UBICACION:
				return basicSetOwenedByUbicacion(null, msgs);
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
			case UbicacionPackage.PAIS__OWENED_BY_UBICACION:
				return eInternalContainer().eInverseRemove(this, UbicacionPackage.FACTORY_UBICACION__LST_PAIS, FactoryUbicacion.class, msgs);
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
			case UbicacionPackage.PAIS__LST_DEPARTAMENTO:
				return getLstDepartamento();
			case UbicacionPackage.PAIS__ID_PAIS:
				return getIdPais();
			case UbicacionPackage.PAIS__CAPITAL:
				return getCapital();
			case UbicacionPackage.PAIS__CODIGO_INTERNACIONAL:
				return getCodigoInternacional();
			case UbicacionPackage.PAIS__IDIOMA:
				return getIdioma();
			case UbicacionPackage.PAIS__COORDENADAS:
				return getCoordenadas();
			case UbicacionPackage.PAIS__OWENED_BY_UBICACION:
				return getOwenedByUbicacion();
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
			case UbicacionPackage.PAIS__LST_DEPARTAMENTO:
				getLstDepartamento().clear();
				getLstDepartamento().addAll((Collection<? extends Departamento>)newValue);
				return;
			case UbicacionPackage.PAIS__ID_PAIS:
				setIdPais((String)newValue);
				return;
			case UbicacionPackage.PAIS__CAPITAL:
				setCapital((String)newValue);
				return;
			case UbicacionPackage.PAIS__CODIGO_INTERNACIONAL:
				setCodigoInternacional((String)newValue);
				return;
			case UbicacionPackage.PAIS__IDIOMA:
				setIdioma((String)newValue);
				return;
			case UbicacionPackage.PAIS__COORDENADAS:
				setCoordenadas((String)newValue);
				return;
			case UbicacionPackage.PAIS__OWENED_BY_UBICACION:
				setOwenedByUbicacion((FactoryUbicacion)newValue);
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
			case UbicacionPackage.PAIS__LST_DEPARTAMENTO:
				getLstDepartamento().clear();
				return;
			case UbicacionPackage.PAIS__ID_PAIS:
				setIdPais(ID_PAIS_EDEFAULT);
				return;
			case UbicacionPackage.PAIS__CAPITAL:
				setCapital(CAPITAL_EDEFAULT);
				return;
			case UbicacionPackage.PAIS__CODIGO_INTERNACIONAL:
				setCodigoInternacional(CODIGO_INTERNACIONAL_EDEFAULT);
				return;
			case UbicacionPackage.PAIS__IDIOMA:
				setIdioma(IDIOMA_EDEFAULT);
				return;
			case UbicacionPackage.PAIS__COORDENADAS:
				setCoordenadas(COORDENADAS_EDEFAULT);
				return;
			case UbicacionPackage.PAIS__OWENED_BY_UBICACION:
				setOwenedByUbicacion((FactoryUbicacion)null);
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
			case UbicacionPackage.PAIS__LST_DEPARTAMENTO:
				return lstDepartamento != null && !lstDepartamento.isEmpty();
			case UbicacionPackage.PAIS__ID_PAIS:
				return ID_PAIS_EDEFAULT == null ? idPais != null : !ID_PAIS_EDEFAULT.equals(idPais);
			case UbicacionPackage.PAIS__CAPITAL:
				return CAPITAL_EDEFAULT == null ? capital != null : !CAPITAL_EDEFAULT.equals(capital);
			case UbicacionPackage.PAIS__CODIGO_INTERNACIONAL:
				return CODIGO_INTERNACIONAL_EDEFAULT == null ? codigoInternacional != null : !CODIGO_INTERNACIONAL_EDEFAULT.equals(codigoInternacional);
			case UbicacionPackage.PAIS__IDIOMA:
				return IDIOMA_EDEFAULT == null ? idioma != null : !IDIOMA_EDEFAULT.equals(idioma);
			case UbicacionPackage.PAIS__COORDENADAS:
				return COORDENADAS_EDEFAULT == null ? coordenadas != null : !COORDENADAS_EDEFAULT.equals(coordenadas);
			case UbicacionPackage.PAIS__OWENED_BY_UBICACION:
				return getOwenedByUbicacion() != null;
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
		result.append(" (idPais: ");
		result.append(idPais);
		result.append(", capital: ");
		result.append(capital);
		result.append(", codigoInternacional: ");
		result.append(codigoInternacional);
		result.append(", idioma: ");
		result.append(idioma);
		result.append(", coordenadas: ");
		result.append(coordenadas);
		result.append(')');
		return result.toString();
	}

} //PaisImpl
