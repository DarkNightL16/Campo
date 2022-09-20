/**
 */
package den.domain.ruta.impl;

import den.domain.envio.Envio;
import den.domain.envio.EnvioPackage;

import den.domain.ruta.FactoryRuta;
import den.domain.ruta.Ruta;
import den.domain.ruta.RutaPackage;
import den.domain.ruta.Tarifa;

import den.domain.ubicacion.Ciudad;
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
 * An implementation of the model object '<em><b>Ruta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.ruta.impl.RutaImpl#getLstCiudadOrigen <em>Lst Ciudad Origen</em>}</li>
 *   <li>{@link den.domain.ruta.impl.RutaImpl#getLstCiudadDestino <em>Lst Ciudad Destino</em>}</li>
 *   <li>{@link den.domain.ruta.impl.RutaImpl#getId <em>Id</em>}</li>
 *   <li>{@link den.domain.ruta.impl.RutaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link den.domain.ruta.impl.RutaImpl#getKm <em>Km</em>}</li>
 *   <li>{@link den.domain.ruta.impl.RutaImpl#getOwenedByCiudad <em>Owened By Ciudad</em>}</li>
 *   <li>{@link den.domain.ruta.impl.RutaImpl#getLstEnvio <em>Lst Envio</em>}</li>
 *   <li>{@link den.domain.ruta.impl.RutaImpl#getOwenedByFactoryRuta <em>Owened By Factory Ruta</em>}</li>
 *   <li>{@link den.domain.ruta.impl.RutaImpl#getLstTarifa <em>Lst Tarifa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RutaImpl extends EObjectImpl implements Ruta {
	/**
	 * The cached value of the '{@link #getLstCiudadOrigen() <em>Lst Ciudad Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstCiudadOrigen()
	 * @generated
	 * @ordered
	 */
	protected Ciudad lstCiudadOrigen;

	/**
	 * The cached value of the '{@link #getLstCiudadDestino() <em>Lst Ciudad Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstCiudadDestino()
	 * @generated
	 * @ordered
	 */
	protected Ciudad lstCiudadDestino;

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
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKm() <em>Km</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKm()
	 * @generated
	 * @ordered
	 */
	protected static final String KM_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getKm() <em>Km</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKm()
	 * @generated
	 * @ordered
	 */
	protected String km = KM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstEnvio() <em>Lst Envio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstEnvio()
	 * @generated
	 * @ordered
	 */
	protected Envio lstEnvio;

	/**
	 * The cached value of the '{@link #getLstTarifa() <em>Lst Tarifa</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstTarifa()
	 * @generated
	 * @ordered
	 */
	protected EList<Tarifa> lstTarifa;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RutaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RutaPackage.Literals.RUTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ciudad getLstCiudadOrigen() {
		if (lstCiudadOrigen != null && lstCiudadOrigen.eIsProxy()) {
			InternalEObject oldLstCiudadOrigen = (InternalEObject)lstCiudadOrigen;
			lstCiudadOrigen = (Ciudad)eResolveProxy(oldLstCiudadOrigen);
			if (lstCiudadOrigen != oldLstCiudadOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RutaPackage.RUTA__LST_CIUDAD_ORIGEN, oldLstCiudadOrigen, lstCiudadOrigen));
			}
		}
		return lstCiudadOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ciudad basicGetLstCiudadOrigen() {
		return lstCiudadOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstCiudadOrigen(Ciudad newLstCiudadOrigen, NotificationChain msgs) {
		Ciudad oldLstCiudadOrigen = lstCiudadOrigen;
		lstCiudadOrigen = newLstCiudadOrigen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RutaPackage.RUTA__LST_CIUDAD_ORIGEN, oldLstCiudadOrigen, newLstCiudadOrigen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstCiudadOrigen(Ciudad newLstCiudadOrigen) {
		if (newLstCiudadOrigen != lstCiudadOrigen) {
			NotificationChain msgs = null;
			if (lstCiudadOrigen != null)
				msgs = ((InternalEObject)lstCiudadOrigen).eInverseRemove(this, UbicacionPackage.CIUDAD__LST_RUTA_ORIGEN, Ciudad.class, msgs);
			if (newLstCiudadOrigen != null)
				msgs = ((InternalEObject)newLstCiudadOrigen).eInverseAdd(this, UbicacionPackage.CIUDAD__LST_RUTA_ORIGEN, Ciudad.class, msgs);
			msgs = basicSetLstCiudadOrigen(newLstCiudadOrigen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RutaPackage.RUTA__LST_CIUDAD_ORIGEN, newLstCiudadOrigen, newLstCiudadOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ciudad getLstCiudadDestino() {
		if (lstCiudadDestino != null && lstCiudadDestino.eIsProxy()) {
			InternalEObject oldLstCiudadDestino = (InternalEObject)lstCiudadDestino;
			lstCiudadDestino = (Ciudad)eResolveProxy(oldLstCiudadDestino);
			if (lstCiudadDestino != oldLstCiudadDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RutaPackage.RUTA__LST_CIUDAD_DESTINO, oldLstCiudadDestino, lstCiudadDestino));
			}
		}
		return lstCiudadDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ciudad basicGetLstCiudadDestino() {
		return lstCiudadDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstCiudadDestino(Ciudad newLstCiudadDestino, NotificationChain msgs) {
		Ciudad oldLstCiudadDestino = lstCiudadDestino;
		lstCiudadDestino = newLstCiudadDestino;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RutaPackage.RUTA__LST_CIUDAD_DESTINO, oldLstCiudadDestino, newLstCiudadDestino);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstCiudadDestino(Ciudad newLstCiudadDestino) {
		if (newLstCiudadDestino != lstCiudadDestino) {
			NotificationChain msgs = null;
			if (lstCiudadDestino != null)
				msgs = ((InternalEObject)lstCiudadDestino).eInverseRemove(this, UbicacionPackage.CIUDAD__LST_RUTA_DESTINO, Ciudad.class, msgs);
			if (newLstCiudadDestino != null)
				msgs = ((InternalEObject)newLstCiudadDestino).eInverseAdd(this, UbicacionPackage.CIUDAD__LST_RUTA_DESTINO, Ciudad.class, msgs);
			msgs = basicSetLstCiudadDestino(newLstCiudadDestino, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RutaPackage.RUTA__LST_CIUDAD_DESTINO, newLstCiudadDestino, newLstCiudadDestino));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RutaPackage.RUTA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RutaPackage.RUTA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKm() {
		return km;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKm(String newKm) {
		String oldKm = km;
		km = newKm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RutaPackage.RUTA__KM, oldKm, km));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ciudad getOwenedByCiudad() {
		if (eContainerFeatureID() != RutaPackage.RUTA__OWENED_BY_CIUDAD) return null;
		return (Ciudad)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByCiudad(Ciudad newOwenedByCiudad, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByCiudad, RutaPackage.RUTA__OWENED_BY_CIUDAD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByCiudad(Ciudad newOwenedByCiudad) {
		if (newOwenedByCiudad != eInternalContainer() || (eContainerFeatureID() != RutaPackage.RUTA__OWENED_BY_CIUDAD && newOwenedByCiudad != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByCiudad))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByCiudad != null)
				msgs = ((InternalEObject)newOwenedByCiudad).eInverseAdd(this, UbicacionPackage.CIUDAD__LST_RUTA, Ciudad.class, msgs);
			msgs = basicSetOwenedByCiudad(newOwenedByCiudad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RutaPackage.RUTA__OWENED_BY_CIUDAD, newOwenedByCiudad, newOwenedByCiudad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Envio getLstEnvio() {
		if (lstEnvio != null && lstEnvio.eIsProxy()) {
			InternalEObject oldLstEnvio = (InternalEObject)lstEnvio;
			lstEnvio = (Envio)eResolveProxy(oldLstEnvio);
			if (lstEnvio != oldLstEnvio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RutaPackage.RUTA__LST_ENVIO, oldLstEnvio, lstEnvio));
			}
		}
		return lstEnvio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Envio basicGetLstEnvio() {
		return lstEnvio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstEnvio(Envio newLstEnvio, NotificationChain msgs) {
		Envio oldLstEnvio = lstEnvio;
		lstEnvio = newLstEnvio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RutaPackage.RUTA__LST_ENVIO, oldLstEnvio, newLstEnvio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstEnvio(Envio newLstEnvio) {
		if (newLstEnvio != lstEnvio) {
			NotificationChain msgs = null;
			if (lstEnvio != null)
				msgs = ((InternalEObject)lstEnvio).eInverseRemove(this, EnvioPackage.ENVIO__LST_RUTA, Envio.class, msgs);
			if (newLstEnvio != null)
				msgs = ((InternalEObject)newLstEnvio).eInverseAdd(this, EnvioPackage.ENVIO__LST_RUTA, Envio.class, msgs);
			msgs = basicSetLstEnvio(newLstEnvio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RutaPackage.RUTA__LST_ENVIO, newLstEnvio, newLstEnvio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryRuta getOwenedByFactoryRuta() {
		if (eContainerFeatureID() != RutaPackage.RUTA__OWENED_BY_FACTORY_RUTA) return null;
		return (FactoryRuta)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByFactoryRuta(FactoryRuta newOwenedByFactoryRuta, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByFactoryRuta, RutaPackage.RUTA__OWENED_BY_FACTORY_RUTA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByFactoryRuta(FactoryRuta newOwenedByFactoryRuta) {
		if (newOwenedByFactoryRuta != eInternalContainer() || (eContainerFeatureID() != RutaPackage.RUTA__OWENED_BY_FACTORY_RUTA && newOwenedByFactoryRuta != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByFactoryRuta))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByFactoryRuta != null)
				msgs = ((InternalEObject)newOwenedByFactoryRuta).eInverseAdd(this, RutaPackage.FACTORY_RUTA__LST_RUTA, FactoryRuta.class, msgs);
			msgs = basicSetOwenedByFactoryRuta(newOwenedByFactoryRuta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RutaPackage.RUTA__OWENED_BY_FACTORY_RUTA, newOwenedByFactoryRuta, newOwenedByFactoryRuta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tarifa> getLstTarifa() {
		if (lstTarifa == null) {
			lstTarifa = new EObjectContainmentWithInverseEList<Tarifa>(Tarifa.class, this, RutaPackage.RUTA__LST_TARIFA, RutaPackage.TARIFA__OWENED_BY_RUTA);
		}
		return lstTarifa;
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
			case RutaPackage.RUTA__LST_CIUDAD_ORIGEN:
				if (lstCiudadOrigen != null)
					msgs = ((InternalEObject)lstCiudadOrigen).eInverseRemove(this, UbicacionPackage.CIUDAD__LST_RUTA_ORIGEN, Ciudad.class, msgs);
				return basicSetLstCiudadOrigen((Ciudad)otherEnd, msgs);
			case RutaPackage.RUTA__LST_CIUDAD_DESTINO:
				if (lstCiudadDestino != null)
					msgs = ((InternalEObject)lstCiudadDestino).eInverseRemove(this, UbicacionPackage.CIUDAD__LST_RUTA_DESTINO, Ciudad.class, msgs);
				return basicSetLstCiudadDestino((Ciudad)otherEnd, msgs);
			case RutaPackage.RUTA__OWENED_BY_CIUDAD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByCiudad((Ciudad)otherEnd, msgs);
			case RutaPackage.RUTA__LST_ENVIO:
				if (lstEnvio != null)
					msgs = ((InternalEObject)lstEnvio).eInverseRemove(this, EnvioPackage.ENVIO__LST_RUTA, Envio.class, msgs);
				return basicSetLstEnvio((Envio)otherEnd, msgs);
			case RutaPackage.RUTA__OWENED_BY_FACTORY_RUTA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByFactoryRuta((FactoryRuta)otherEnd, msgs);
			case RutaPackage.RUTA__LST_TARIFA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstTarifa()).basicAdd(otherEnd, msgs);
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
			case RutaPackage.RUTA__LST_CIUDAD_ORIGEN:
				return basicSetLstCiudadOrigen(null, msgs);
			case RutaPackage.RUTA__LST_CIUDAD_DESTINO:
				return basicSetLstCiudadDestino(null, msgs);
			case RutaPackage.RUTA__OWENED_BY_CIUDAD:
				return basicSetOwenedByCiudad(null, msgs);
			case RutaPackage.RUTA__LST_ENVIO:
				return basicSetLstEnvio(null, msgs);
			case RutaPackage.RUTA__OWENED_BY_FACTORY_RUTA:
				return basicSetOwenedByFactoryRuta(null, msgs);
			case RutaPackage.RUTA__LST_TARIFA:
				return ((InternalEList<?>)getLstTarifa()).basicRemove(otherEnd, msgs);
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
			case RutaPackage.RUTA__OWENED_BY_CIUDAD:
				return eInternalContainer().eInverseRemove(this, UbicacionPackage.CIUDAD__LST_RUTA, Ciudad.class, msgs);
			case RutaPackage.RUTA__OWENED_BY_FACTORY_RUTA:
				return eInternalContainer().eInverseRemove(this, RutaPackage.FACTORY_RUTA__LST_RUTA, FactoryRuta.class, msgs);
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
			case RutaPackage.RUTA__LST_CIUDAD_ORIGEN:
				if (resolve) return getLstCiudadOrigen();
				return basicGetLstCiudadOrigen();
			case RutaPackage.RUTA__LST_CIUDAD_DESTINO:
				if (resolve) return getLstCiudadDestino();
				return basicGetLstCiudadDestino();
			case RutaPackage.RUTA__ID:
				return getId();
			case RutaPackage.RUTA__NOMBRE:
				return getNombre();
			case RutaPackage.RUTA__KM:
				return getKm();
			case RutaPackage.RUTA__OWENED_BY_CIUDAD:
				return getOwenedByCiudad();
			case RutaPackage.RUTA__LST_ENVIO:
				if (resolve) return getLstEnvio();
				return basicGetLstEnvio();
			case RutaPackage.RUTA__OWENED_BY_FACTORY_RUTA:
				return getOwenedByFactoryRuta();
			case RutaPackage.RUTA__LST_TARIFA:
				return getLstTarifa();
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
			case RutaPackage.RUTA__LST_CIUDAD_ORIGEN:
				setLstCiudadOrigen((Ciudad)newValue);
				return;
			case RutaPackage.RUTA__LST_CIUDAD_DESTINO:
				setLstCiudadDestino((Ciudad)newValue);
				return;
			case RutaPackage.RUTA__ID:
				setId((String)newValue);
				return;
			case RutaPackage.RUTA__NOMBRE:
				setNombre((String)newValue);
				return;
			case RutaPackage.RUTA__KM:
				setKm((String)newValue);
				return;
			case RutaPackage.RUTA__OWENED_BY_CIUDAD:
				setOwenedByCiudad((Ciudad)newValue);
				return;
			case RutaPackage.RUTA__LST_ENVIO:
				setLstEnvio((Envio)newValue);
				return;
			case RutaPackage.RUTA__OWENED_BY_FACTORY_RUTA:
				setOwenedByFactoryRuta((FactoryRuta)newValue);
				return;
			case RutaPackage.RUTA__LST_TARIFA:
				getLstTarifa().clear();
				getLstTarifa().addAll((Collection<? extends Tarifa>)newValue);
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
			case RutaPackage.RUTA__LST_CIUDAD_ORIGEN:
				setLstCiudadOrigen((Ciudad)null);
				return;
			case RutaPackage.RUTA__LST_CIUDAD_DESTINO:
				setLstCiudadDestino((Ciudad)null);
				return;
			case RutaPackage.RUTA__ID:
				setId(ID_EDEFAULT);
				return;
			case RutaPackage.RUTA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case RutaPackage.RUTA__KM:
				setKm(KM_EDEFAULT);
				return;
			case RutaPackage.RUTA__OWENED_BY_CIUDAD:
				setOwenedByCiudad((Ciudad)null);
				return;
			case RutaPackage.RUTA__LST_ENVIO:
				setLstEnvio((Envio)null);
				return;
			case RutaPackage.RUTA__OWENED_BY_FACTORY_RUTA:
				setOwenedByFactoryRuta((FactoryRuta)null);
				return;
			case RutaPackage.RUTA__LST_TARIFA:
				getLstTarifa().clear();
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
			case RutaPackage.RUTA__LST_CIUDAD_ORIGEN:
				return lstCiudadOrigen != null;
			case RutaPackage.RUTA__LST_CIUDAD_DESTINO:
				return lstCiudadDestino != null;
			case RutaPackage.RUTA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RutaPackage.RUTA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case RutaPackage.RUTA__KM:
				return KM_EDEFAULT == null ? km != null : !KM_EDEFAULT.equals(km);
			case RutaPackage.RUTA__OWENED_BY_CIUDAD:
				return getOwenedByCiudad() != null;
			case RutaPackage.RUTA__LST_ENVIO:
				return lstEnvio != null;
			case RutaPackage.RUTA__OWENED_BY_FACTORY_RUTA:
				return getOwenedByFactoryRuta() != null;
			case RutaPackage.RUTA__LST_TARIFA:
				return lstTarifa != null && !lstTarifa.isEmpty();
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
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", km: ");
		result.append(km);
		result.append(')');
		return result.toString();
	}

} //RutaImpl
