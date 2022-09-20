/**
 */
package den.domain.ubicacion.impl;

import den.domain.envio.Envio;
import den.domain.envio.EnvioPackage;

import den.domain.ruta.Ruta;
import den.domain.ruta.RutaPackage;

import den.domain.ubicacion.Ciudad;
import den.domain.ubicacion.Departamento;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ciudad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.ubicacion.impl.CiudadImpl#getIdCiudad <em>Id Ciudad</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.CiudadImpl#getCoordenadas <em>Coordenadas</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.CiudadImpl#getOwenedDepartamento <em>Owened Departamento</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.CiudadImpl#getLstRutaOrigen <em>Lst Ruta Origen</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.CiudadImpl#getLstRutaDestino <em>Lst Ruta Destino</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.CiudadImpl#getTheEnvioOrigen <em>The Envio Origen</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.CiudadImpl#getTheEnvioDestino <em>The Envio Destino</em>}</li>
 *   <li>{@link den.domain.ubicacion.impl.CiudadImpl#getLstRuta <em>Lst Ruta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CiudadImpl extends EObjectImpl implements Ciudad {
	/**
	 * The default value of the '{@link #getIdCiudad() <em>Id Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCiudad()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_CIUDAD_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdCiudad() <em>Id Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCiudad()
	 * @generated
	 * @ordered
	 */
	protected String idCiudad = ID_CIUDAD_EDEFAULT;

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
	 * The cached value of the '{@link #getLstRutaOrigen() <em>Lst Ruta Origen</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstRutaOrigen()
	 * @generated
	 * @ordered
	 */
	protected EList<Ruta> lstRutaOrigen;

	/**
	 * The cached value of the '{@link #getLstRutaDestino() <em>Lst Ruta Destino</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstRutaDestino()
	 * @generated
	 * @ordered
	 */
	protected EList<Ruta> lstRutaDestino;

	/**
	 * The cached value of the '{@link #getTheEnvioOrigen() <em>The Envio Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheEnvioOrigen()
	 * @generated
	 * @ordered
	 */
	protected Envio theEnvioOrigen;

	/**
	 * The cached value of the '{@link #getTheEnvioDestino() <em>The Envio Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheEnvioDestino()
	 * @generated
	 * @ordered
	 */
	protected Envio theEnvioDestino;

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
	protected CiudadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbicacionPackage.Literals.CIUDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdCiudad() {
		return idCiudad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdCiudad(String newIdCiudad) {
		String oldIdCiudad = idCiudad;
		idCiudad = newIdCiudad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.CIUDAD__ID_CIUDAD, oldIdCiudad, idCiudad));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.CIUDAD__COORDENADAS, oldCoordenadas, coordenadas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departamento getOwenedDepartamento() {
		if (eContainerFeatureID() != UbicacionPackage.CIUDAD__OWENED_DEPARTAMENTO) return null;
		return (Departamento)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedDepartamento(Departamento newOwenedDepartamento, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedDepartamento, UbicacionPackage.CIUDAD__OWENED_DEPARTAMENTO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedDepartamento(Departamento newOwenedDepartamento) {
		if (newOwenedDepartamento != eInternalContainer() || (eContainerFeatureID() != UbicacionPackage.CIUDAD__OWENED_DEPARTAMENTO && newOwenedDepartamento != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedDepartamento))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedDepartamento != null)
				msgs = ((InternalEObject)newOwenedDepartamento).eInverseAdd(this, UbicacionPackage.DEPARTAMENTO__LST_CIUDAD, Departamento.class, msgs);
			msgs = basicSetOwenedDepartamento(newOwenedDepartamento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.CIUDAD__OWENED_DEPARTAMENTO, newOwenedDepartamento, newOwenedDepartamento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ruta> getLstRutaOrigen() {
		if (lstRutaOrigen == null) {
			lstRutaOrigen = new EObjectWithInverseResolvingEList<Ruta>(Ruta.class, this, UbicacionPackage.CIUDAD__LST_RUTA_ORIGEN, RutaPackage.RUTA__LST_CIUDAD_ORIGEN);
		}
		return lstRutaOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ruta> getLstRutaDestino() {
		if (lstRutaDestino == null) {
			lstRutaDestino = new EObjectWithInverseResolvingEList<Ruta>(Ruta.class, this, UbicacionPackage.CIUDAD__LST_RUTA_DESTINO, RutaPackage.RUTA__LST_CIUDAD_DESTINO);
		}
		return lstRutaDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Envio getTheEnvioOrigen() {
		if (theEnvioOrigen != null && theEnvioOrigen.eIsProxy()) {
			InternalEObject oldTheEnvioOrigen = (InternalEObject)theEnvioOrigen;
			theEnvioOrigen = (Envio)eResolveProxy(oldTheEnvioOrigen);
			if (theEnvioOrigen != oldTheEnvioOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UbicacionPackage.CIUDAD__THE_ENVIO_ORIGEN, oldTheEnvioOrigen, theEnvioOrigen));
			}
		}
		return theEnvioOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Envio basicGetTheEnvioOrigen() {
		return theEnvioOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheEnvioOrigen(Envio newTheEnvioOrigen, NotificationChain msgs) {
		Envio oldTheEnvioOrigen = theEnvioOrigen;
		theEnvioOrigen = newTheEnvioOrigen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbicacionPackage.CIUDAD__THE_ENVIO_ORIGEN, oldTheEnvioOrigen, newTheEnvioOrigen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheEnvioOrigen(Envio newTheEnvioOrigen) {
		if (newTheEnvioOrigen != theEnvioOrigen) {
			NotificationChain msgs = null;
			if (theEnvioOrigen != null)
				msgs = ((InternalEObject)theEnvioOrigen).eInverseRemove(this, EnvioPackage.ENVIO__THE_CIUDAD_ORIGEN, Envio.class, msgs);
			if (newTheEnvioOrigen != null)
				msgs = ((InternalEObject)newTheEnvioOrigen).eInverseAdd(this, EnvioPackage.ENVIO__THE_CIUDAD_ORIGEN, Envio.class, msgs);
			msgs = basicSetTheEnvioOrigen(newTheEnvioOrigen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.CIUDAD__THE_ENVIO_ORIGEN, newTheEnvioOrigen, newTheEnvioOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Envio getTheEnvioDestino() {
		if (theEnvioDestino != null && theEnvioDestino.eIsProxy()) {
			InternalEObject oldTheEnvioDestino = (InternalEObject)theEnvioDestino;
			theEnvioDestino = (Envio)eResolveProxy(oldTheEnvioDestino);
			if (theEnvioDestino != oldTheEnvioDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UbicacionPackage.CIUDAD__THE_ENVIO_DESTINO, oldTheEnvioDestino, theEnvioDestino));
			}
		}
		return theEnvioDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Envio basicGetTheEnvioDestino() {
		return theEnvioDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheEnvioDestino(Envio newTheEnvioDestino, NotificationChain msgs) {
		Envio oldTheEnvioDestino = theEnvioDestino;
		theEnvioDestino = newTheEnvioDestino;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbicacionPackage.CIUDAD__THE_ENVIO_DESTINO, oldTheEnvioDestino, newTheEnvioDestino);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheEnvioDestino(Envio newTheEnvioDestino) {
		if (newTheEnvioDestino != theEnvioDestino) {
			NotificationChain msgs = null;
			if (theEnvioDestino != null)
				msgs = ((InternalEObject)theEnvioDestino).eInverseRemove(this, EnvioPackage.ENVIO__THE_CIUDAD_DESTINO, Envio.class, msgs);
			if (newTheEnvioDestino != null)
				msgs = ((InternalEObject)newTheEnvioDestino).eInverseAdd(this, EnvioPackage.ENVIO__THE_CIUDAD_DESTINO, Envio.class, msgs);
			msgs = basicSetTheEnvioDestino(newTheEnvioDestino, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbicacionPackage.CIUDAD__THE_ENVIO_DESTINO, newTheEnvioDestino, newTheEnvioDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ruta> getLstRuta() {
		if (lstRuta == null) {
			lstRuta = new EObjectContainmentWithInverseEList<Ruta>(Ruta.class, this, UbicacionPackage.CIUDAD__LST_RUTA, RutaPackage.RUTA__OWENED_BY_CIUDAD);
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
			case UbicacionPackage.CIUDAD__OWENED_DEPARTAMENTO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedDepartamento((Departamento)otherEnd, msgs);
			case UbicacionPackage.CIUDAD__LST_RUTA_ORIGEN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstRutaOrigen()).basicAdd(otherEnd, msgs);
			case UbicacionPackage.CIUDAD__LST_RUTA_DESTINO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstRutaDestino()).basicAdd(otherEnd, msgs);
			case UbicacionPackage.CIUDAD__THE_ENVIO_ORIGEN:
				if (theEnvioOrigen != null)
					msgs = ((InternalEObject)theEnvioOrigen).eInverseRemove(this, EnvioPackage.ENVIO__THE_CIUDAD_ORIGEN, Envio.class, msgs);
				return basicSetTheEnvioOrigen((Envio)otherEnd, msgs);
			case UbicacionPackage.CIUDAD__THE_ENVIO_DESTINO:
				if (theEnvioDestino != null)
					msgs = ((InternalEObject)theEnvioDestino).eInverseRemove(this, EnvioPackage.ENVIO__THE_CIUDAD_DESTINO, Envio.class, msgs);
				return basicSetTheEnvioDestino((Envio)otherEnd, msgs);
			case UbicacionPackage.CIUDAD__LST_RUTA:
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
			case UbicacionPackage.CIUDAD__OWENED_DEPARTAMENTO:
				return basicSetOwenedDepartamento(null, msgs);
			case UbicacionPackage.CIUDAD__LST_RUTA_ORIGEN:
				return ((InternalEList<?>)getLstRutaOrigen()).basicRemove(otherEnd, msgs);
			case UbicacionPackage.CIUDAD__LST_RUTA_DESTINO:
				return ((InternalEList<?>)getLstRutaDestino()).basicRemove(otherEnd, msgs);
			case UbicacionPackage.CIUDAD__THE_ENVIO_ORIGEN:
				return basicSetTheEnvioOrigen(null, msgs);
			case UbicacionPackage.CIUDAD__THE_ENVIO_DESTINO:
				return basicSetTheEnvioDestino(null, msgs);
			case UbicacionPackage.CIUDAD__LST_RUTA:
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
			case UbicacionPackage.CIUDAD__OWENED_DEPARTAMENTO:
				return eInternalContainer().eInverseRemove(this, UbicacionPackage.DEPARTAMENTO__LST_CIUDAD, Departamento.class, msgs);
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
			case UbicacionPackage.CIUDAD__ID_CIUDAD:
				return getIdCiudad();
			case UbicacionPackage.CIUDAD__COORDENADAS:
				return getCoordenadas();
			case UbicacionPackage.CIUDAD__OWENED_DEPARTAMENTO:
				return getOwenedDepartamento();
			case UbicacionPackage.CIUDAD__LST_RUTA_ORIGEN:
				return getLstRutaOrigen();
			case UbicacionPackage.CIUDAD__LST_RUTA_DESTINO:
				return getLstRutaDestino();
			case UbicacionPackage.CIUDAD__THE_ENVIO_ORIGEN:
				if (resolve) return getTheEnvioOrigen();
				return basicGetTheEnvioOrigen();
			case UbicacionPackage.CIUDAD__THE_ENVIO_DESTINO:
				if (resolve) return getTheEnvioDestino();
				return basicGetTheEnvioDestino();
			case UbicacionPackage.CIUDAD__LST_RUTA:
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
			case UbicacionPackage.CIUDAD__ID_CIUDAD:
				setIdCiudad((String)newValue);
				return;
			case UbicacionPackage.CIUDAD__COORDENADAS:
				setCoordenadas((String)newValue);
				return;
			case UbicacionPackage.CIUDAD__OWENED_DEPARTAMENTO:
				setOwenedDepartamento((Departamento)newValue);
				return;
			case UbicacionPackage.CIUDAD__LST_RUTA_ORIGEN:
				getLstRutaOrigen().clear();
				getLstRutaOrigen().addAll((Collection<? extends Ruta>)newValue);
				return;
			case UbicacionPackage.CIUDAD__LST_RUTA_DESTINO:
				getLstRutaDestino().clear();
				getLstRutaDestino().addAll((Collection<? extends Ruta>)newValue);
				return;
			case UbicacionPackage.CIUDAD__THE_ENVIO_ORIGEN:
				setTheEnvioOrigen((Envio)newValue);
				return;
			case UbicacionPackage.CIUDAD__THE_ENVIO_DESTINO:
				setTheEnvioDestino((Envio)newValue);
				return;
			case UbicacionPackage.CIUDAD__LST_RUTA:
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
			case UbicacionPackage.CIUDAD__ID_CIUDAD:
				setIdCiudad(ID_CIUDAD_EDEFAULT);
				return;
			case UbicacionPackage.CIUDAD__COORDENADAS:
				setCoordenadas(COORDENADAS_EDEFAULT);
				return;
			case UbicacionPackage.CIUDAD__OWENED_DEPARTAMENTO:
				setOwenedDepartamento((Departamento)null);
				return;
			case UbicacionPackage.CIUDAD__LST_RUTA_ORIGEN:
				getLstRutaOrigen().clear();
				return;
			case UbicacionPackage.CIUDAD__LST_RUTA_DESTINO:
				getLstRutaDestino().clear();
				return;
			case UbicacionPackage.CIUDAD__THE_ENVIO_ORIGEN:
				setTheEnvioOrigen((Envio)null);
				return;
			case UbicacionPackage.CIUDAD__THE_ENVIO_DESTINO:
				setTheEnvioDestino((Envio)null);
				return;
			case UbicacionPackage.CIUDAD__LST_RUTA:
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
			case UbicacionPackage.CIUDAD__ID_CIUDAD:
				return ID_CIUDAD_EDEFAULT == null ? idCiudad != null : !ID_CIUDAD_EDEFAULT.equals(idCiudad);
			case UbicacionPackage.CIUDAD__COORDENADAS:
				return COORDENADAS_EDEFAULT == null ? coordenadas != null : !COORDENADAS_EDEFAULT.equals(coordenadas);
			case UbicacionPackage.CIUDAD__OWENED_DEPARTAMENTO:
				return getOwenedDepartamento() != null;
			case UbicacionPackage.CIUDAD__LST_RUTA_ORIGEN:
				return lstRutaOrigen != null && !lstRutaOrigen.isEmpty();
			case UbicacionPackage.CIUDAD__LST_RUTA_DESTINO:
				return lstRutaDestino != null && !lstRutaDestino.isEmpty();
			case UbicacionPackage.CIUDAD__THE_ENVIO_ORIGEN:
				return theEnvioOrigen != null;
			case UbicacionPackage.CIUDAD__THE_ENVIO_DESTINO:
				return theEnvioDestino != null;
			case UbicacionPackage.CIUDAD__LST_RUTA:
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
		result.append(" (idCiudad: ");
		result.append(idCiudad);
		result.append(", coordenadas: ");
		result.append(coordenadas);
		result.append(')');
		return result.toString();
	}

} //CiudadImpl
