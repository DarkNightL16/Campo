/**
 */
package den.domain.transporte.impl;

import den.domain.envio.Envio;
import den.domain.envio.EnvioPackage;

import den.domain.persona.Conductor;
import den.domain.persona.Persona;
import den.domain.persona.PersonaPackage;

import den.domain.producto.Producto;
import den.domain.producto.ProductoPackage;

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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transporte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.transporte.impl.TransporteImpl#getId <em>Id</em>}</li>
 *   <li>{@link den.domain.transporte.impl.TransporteImpl#getMarca <em>Marca</em>}</li>
 *   <li>{@link den.domain.transporte.impl.TransporteImpl#getNumeroPoliza <em>Numero Poliza</em>}</li>
 *   <li>{@link den.domain.transporte.impl.TransporteImpl#getMatricula <em>Matricula</em>}</li>
 *   <li>{@link den.domain.transporte.impl.TransporteImpl#getTarjetaPropiedad <em>Tarjeta Propiedad</em>}</li>
 *   <li>{@link den.domain.transporte.impl.TransporteImpl#getOwenedByFactoryTransporte <em>Owened By Factory Transporte</em>}</li>
 *   <li>{@link den.domain.transporte.impl.TransporteImpl#getLstProducto <em>Lst Producto</em>}</li>
 *   <li>{@link den.domain.transporte.impl.TransporteImpl#getLstEnvio <em>Lst Envio</em>}</li>
 *   <li>{@link den.domain.transporte.impl.TransporteImpl#getLstConductor <em>Lst Conductor</em>}</li>
 *   <li>{@link den.domain.transporte.impl.TransporteImpl#getLstPersona <em>Lst Persona</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransporteImpl extends EObjectImpl implements Transporte {
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
	 * The default value of the '{@link #getMarca() <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarca()
	 * @generated
	 * @ordered
	 */
	protected static final String MARCA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getMarca() <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarca()
	 * @generated
	 * @ordered
	 */
	protected String marca = MARCA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroPoliza() <em>Numero Poliza</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPoliza()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_POLIZA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getNumeroPoliza() <em>Numero Poliza</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPoliza()
	 * @generated
	 * @ordered
	 */
	protected String numeroPoliza = NUMERO_POLIZA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatricula() <em>Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricula()
	 * @generated
	 * @ordered
	 */
	protected static final String MATRICULA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getMatricula() <em>Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricula()
	 * @generated
	 * @ordered
	 */
	protected String matricula = MATRICULA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarjetaPropiedad() <em>Tarjeta Propiedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarjetaPropiedad()
	 * @generated
	 * @ordered
	 */
	protected static final String TARJETA_PROPIEDAD_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getTarjetaPropiedad() <em>Tarjeta Propiedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarjetaPropiedad()
	 * @generated
	 * @ordered
	 */
	protected String tarjetaPropiedad = TARJETA_PROPIEDAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstProducto() <em>Lst Producto</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstProducto()
	 * @generated
	 * @ordered
	 */
	protected EList<Producto> lstProducto;

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
	 * The cached value of the '{@link #getLstConductor() <em>Lst Conductor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstConductor()
	 * @generated
	 * @ordered
	 */
	protected Conductor lstConductor;

	/**
	 * The cached value of the '{@link #getLstPersona() <em>Lst Persona</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstPersona()
	 * @generated
	 * @ordered
	 */
	protected Persona lstPersona;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransporteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportePackage.Literals.TRANSPORTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransportePackage.TRANSPORTE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarca(String newMarca) {
		String oldMarca = marca;
		marca = newMarca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportePackage.TRANSPORTE__MARCA, oldMarca, marca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroPoliza() {
		return numeroPoliza;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroPoliza(String newNumeroPoliza) {
		String oldNumeroPoliza = numeroPoliza;
		numeroPoliza = newNumeroPoliza;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportePackage.TRANSPORTE__NUMERO_POLIZA, oldNumeroPoliza, numeroPoliza));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatricula(String newMatricula) {
		String oldMatricula = matricula;
		matricula = newMatricula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportePackage.TRANSPORTE__MATRICULA, oldMatricula, matricula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarjetaPropiedad() {
		return tarjetaPropiedad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarjetaPropiedad(String newTarjetaPropiedad) {
		String oldTarjetaPropiedad = tarjetaPropiedad;
		tarjetaPropiedad = newTarjetaPropiedad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportePackage.TRANSPORTE__TARJETA_PROPIEDAD, oldTarjetaPropiedad, tarjetaPropiedad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryTransporte getOwenedByFactoryTransporte() {
		if (eContainerFeatureID() != TransportePackage.TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE) return null;
		return (FactoryTransporte)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByFactoryTransporte(FactoryTransporte newOwenedByFactoryTransporte, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByFactoryTransporte, TransportePackage.TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByFactoryTransporte(FactoryTransporte newOwenedByFactoryTransporte) {
		if (newOwenedByFactoryTransporte != eInternalContainer() || (eContainerFeatureID() != TransportePackage.TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE && newOwenedByFactoryTransporte != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByFactoryTransporte))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByFactoryTransporte != null)
				msgs = ((InternalEObject)newOwenedByFactoryTransporte).eInverseAdd(this, TransportePackage.FACTORY_TRANSPORTE__LST_TRANSPORTE, FactoryTransporte.class, msgs);
			msgs = basicSetOwenedByFactoryTransporte(newOwenedByFactoryTransporte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportePackage.TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE, newOwenedByFactoryTransporte, newOwenedByFactoryTransporte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Producto> getLstProducto() {
		if (lstProducto == null) {
			lstProducto = new EObjectWithInverseResolvingEList<Producto>(Producto.class, this, TransportePackage.TRANSPORTE__LST_PRODUCTO, ProductoPackage.PRODUCTO__LST_TRANSPORTE);
		}
		return lstProducto;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransportePackage.TRANSPORTE__LST_ENVIO, oldLstEnvio, lstEnvio));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransportePackage.TRANSPORTE__LST_ENVIO, oldLstEnvio, newLstEnvio);
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
				msgs = ((InternalEObject)lstEnvio).eInverseRemove(this, EnvioPackage.ENVIO__LST_TRANSPORTE, Envio.class, msgs);
			if (newLstEnvio != null)
				msgs = ((InternalEObject)newLstEnvio).eInverseAdd(this, EnvioPackage.ENVIO__LST_TRANSPORTE, Envio.class, msgs);
			msgs = basicSetLstEnvio(newLstEnvio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportePackage.TRANSPORTE__LST_ENVIO, newLstEnvio, newLstEnvio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conductor getLstConductor() {
		if (lstConductor != null && lstConductor.eIsProxy()) {
			InternalEObject oldLstConductor = (InternalEObject)lstConductor;
			lstConductor = (Conductor)eResolveProxy(oldLstConductor);
			if (lstConductor != oldLstConductor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransportePackage.TRANSPORTE__LST_CONDUCTOR, oldLstConductor, lstConductor));
			}
		}
		return lstConductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conductor basicGetLstConductor() {
		return lstConductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstConductor(Conductor newLstConductor, NotificationChain msgs) {
		Conductor oldLstConductor = lstConductor;
		lstConductor = newLstConductor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransportePackage.TRANSPORTE__LST_CONDUCTOR, oldLstConductor, newLstConductor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstConductor(Conductor newLstConductor) {
		if (newLstConductor != lstConductor) {
			NotificationChain msgs = null;
			if (lstConductor != null)
				msgs = ((InternalEObject)lstConductor).eInverseRemove(this, PersonaPackage.CONDUCTOR__LST_TRANSPORTE, Conductor.class, msgs);
			if (newLstConductor != null)
				msgs = ((InternalEObject)newLstConductor).eInverseAdd(this, PersonaPackage.CONDUCTOR__LST_TRANSPORTE, Conductor.class, msgs);
			msgs = basicSetLstConductor(newLstConductor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportePackage.TRANSPORTE__LST_CONDUCTOR, newLstConductor, newLstConductor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona getLstPersona() {
		if (lstPersona != null && lstPersona.eIsProxy()) {
			InternalEObject oldLstPersona = (InternalEObject)lstPersona;
			lstPersona = (Persona)eResolveProxy(oldLstPersona);
			if (lstPersona != oldLstPersona) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransportePackage.TRANSPORTE__LST_PERSONA, oldLstPersona, lstPersona));
			}
		}
		return lstPersona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona basicGetLstPersona() {
		return lstPersona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLstPersona(Persona newLstPersona, NotificationChain msgs) {
		Persona oldLstPersona = lstPersona;
		lstPersona = newLstPersona;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransportePackage.TRANSPORTE__LST_PERSONA, oldLstPersona, newLstPersona);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLstPersona(Persona newLstPersona) {
		if (newLstPersona != lstPersona) {
			NotificationChain msgs = null;
			if (lstPersona != null)
				msgs = ((InternalEObject)lstPersona).eInverseRemove(this, PersonaPackage.PERSONA__LST_TRANSPORTE, Persona.class, msgs);
			if (newLstPersona != null)
				msgs = ((InternalEObject)newLstPersona).eInverseAdd(this, PersonaPackage.PERSONA__LST_TRANSPORTE, Persona.class, msgs);
			msgs = basicSetLstPersona(newLstPersona, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportePackage.TRANSPORTE__LST_PERSONA, newLstPersona, newLstPersona));
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
			case TransportePackage.TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwenedByFactoryTransporte((FactoryTransporte)otherEnd, msgs);
			case TransportePackage.TRANSPORTE__LST_PRODUCTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLstProducto()).basicAdd(otherEnd, msgs);
			case TransportePackage.TRANSPORTE__LST_ENVIO:
				if (lstEnvio != null)
					msgs = ((InternalEObject)lstEnvio).eInverseRemove(this, EnvioPackage.ENVIO__LST_TRANSPORTE, Envio.class, msgs);
				return basicSetLstEnvio((Envio)otherEnd, msgs);
			case TransportePackage.TRANSPORTE__LST_CONDUCTOR:
				if (lstConductor != null)
					msgs = ((InternalEObject)lstConductor).eInverseRemove(this, PersonaPackage.CONDUCTOR__LST_TRANSPORTE, Conductor.class, msgs);
				return basicSetLstConductor((Conductor)otherEnd, msgs);
			case TransportePackage.TRANSPORTE__LST_PERSONA:
				if (lstPersona != null)
					msgs = ((InternalEObject)lstPersona).eInverseRemove(this, PersonaPackage.PERSONA__LST_TRANSPORTE, Persona.class, msgs);
				return basicSetLstPersona((Persona)otherEnd, msgs);
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
			case TransportePackage.TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE:
				return basicSetOwenedByFactoryTransporte(null, msgs);
			case TransportePackage.TRANSPORTE__LST_PRODUCTO:
				return ((InternalEList<?>)getLstProducto()).basicRemove(otherEnd, msgs);
			case TransportePackage.TRANSPORTE__LST_ENVIO:
				return basicSetLstEnvio(null, msgs);
			case TransportePackage.TRANSPORTE__LST_CONDUCTOR:
				return basicSetLstConductor(null, msgs);
			case TransportePackage.TRANSPORTE__LST_PERSONA:
				return basicSetLstPersona(null, msgs);
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
			case TransportePackage.TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE:
				return eInternalContainer().eInverseRemove(this, TransportePackage.FACTORY_TRANSPORTE__LST_TRANSPORTE, FactoryTransporte.class, msgs);
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
			case TransportePackage.TRANSPORTE__ID:
				return getId();
			case TransportePackage.TRANSPORTE__MARCA:
				return getMarca();
			case TransportePackage.TRANSPORTE__NUMERO_POLIZA:
				return getNumeroPoliza();
			case TransportePackage.TRANSPORTE__MATRICULA:
				return getMatricula();
			case TransportePackage.TRANSPORTE__TARJETA_PROPIEDAD:
				return getTarjetaPropiedad();
			case TransportePackage.TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE:
				return getOwenedByFactoryTransporte();
			case TransportePackage.TRANSPORTE__LST_PRODUCTO:
				return getLstProducto();
			case TransportePackage.TRANSPORTE__LST_ENVIO:
				if (resolve) return getLstEnvio();
				return basicGetLstEnvio();
			case TransportePackage.TRANSPORTE__LST_CONDUCTOR:
				if (resolve) return getLstConductor();
				return basicGetLstConductor();
			case TransportePackage.TRANSPORTE__LST_PERSONA:
				if (resolve) return getLstPersona();
				return basicGetLstPersona();
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
			case TransportePackage.TRANSPORTE__ID:
				setId((String)newValue);
				return;
			case TransportePackage.TRANSPORTE__MARCA:
				setMarca((String)newValue);
				return;
			case TransportePackage.TRANSPORTE__NUMERO_POLIZA:
				setNumeroPoliza((String)newValue);
				return;
			case TransportePackage.TRANSPORTE__MATRICULA:
				setMatricula((String)newValue);
				return;
			case TransportePackage.TRANSPORTE__TARJETA_PROPIEDAD:
				setTarjetaPropiedad((String)newValue);
				return;
			case TransportePackage.TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE:
				setOwenedByFactoryTransporte((FactoryTransporte)newValue);
				return;
			case TransportePackage.TRANSPORTE__LST_PRODUCTO:
				getLstProducto().clear();
				getLstProducto().addAll((Collection<? extends Producto>)newValue);
				return;
			case TransportePackage.TRANSPORTE__LST_ENVIO:
				setLstEnvio((Envio)newValue);
				return;
			case TransportePackage.TRANSPORTE__LST_CONDUCTOR:
				setLstConductor((Conductor)newValue);
				return;
			case TransportePackage.TRANSPORTE__LST_PERSONA:
				setLstPersona((Persona)newValue);
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
			case TransportePackage.TRANSPORTE__ID:
				setId(ID_EDEFAULT);
				return;
			case TransportePackage.TRANSPORTE__MARCA:
				setMarca(MARCA_EDEFAULT);
				return;
			case TransportePackage.TRANSPORTE__NUMERO_POLIZA:
				setNumeroPoliza(NUMERO_POLIZA_EDEFAULT);
				return;
			case TransportePackage.TRANSPORTE__MATRICULA:
				setMatricula(MATRICULA_EDEFAULT);
				return;
			case TransportePackage.TRANSPORTE__TARJETA_PROPIEDAD:
				setTarjetaPropiedad(TARJETA_PROPIEDAD_EDEFAULT);
				return;
			case TransportePackage.TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE:
				setOwenedByFactoryTransporte((FactoryTransporte)null);
				return;
			case TransportePackage.TRANSPORTE__LST_PRODUCTO:
				getLstProducto().clear();
				return;
			case TransportePackage.TRANSPORTE__LST_ENVIO:
				setLstEnvio((Envio)null);
				return;
			case TransportePackage.TRANSPORTE__LST_CONDUCTOR:
				setLstConductor((Conductor)null);
				return;
			case TransportePackage.TRANSPORTE__LST_PERSONA:
				setLstPersona((Persona)null);
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
			case TransportePackage.TRANSPORTE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TransportePackage.TRANSPORTE__MARCA:
				return MARCA_EDEFAULT == null ? marca != null : !MARCA_EDEFAULT.equals(marca);
			case TransportePackage.TRANSPORTE__NUMERO_POLIZA:
				return NUMERO_POLIZA_EDEFAULT == null ? numeroPoliza != null : !NUMERO_POLIZA_EDEFAULT.equals(numeroPoliza);
			case TransportePackage.TRANSPORTE__MATRICULA:
				return MATRICULA_EDEFAULT == null ? matricula != null : !MATRICULA_EDEFAULT.equals(matricula);
			case TransportePackage.TRANSPORTE__TARJETA_PROPIEDAD:
				return TARJETA_PROPIEDAD_EDEFAULT == null ? tarjetaPropiedad != null : !TARJETA_PROPIEDAD_EDEFAULT.equals(tarjetaPropiedad);
			case TransportePackage.TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE:
				return getOwenedByFactoryTransporte() != null;
			case TransportePackage.TRANSPORTE__LST_PRODUCTO:
				return lstProducto != null && !lstProducto.isEmpty();
			case TransportePackage.TRANSPORTE__LST_ENVIO:
				return lstEnvio != null;
			case TransportePackage.TRANSPORTE__LST_CONDUCTOR:
				return lstConductor != null;
			case TransportePackage.TRANSPORTE__LST_PERSONA:
				return lstPersona != null;
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
		result.append(", marca: ");
		result.append(marca);
		result.append(", numeroPoliza: ");
		result.append(numeroPoliza);
		result.append(", matricula: ");
		result.append(matricula);
		result.append(", tarjetaPropiedad: ");
		result.append(tarjetaPropiedad);
		result.append(')');
		return result.toString();
	}

} //TransporteImpl
