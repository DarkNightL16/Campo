/**
 */
package den.domain.persona.impl;

import den.domain.persona.Empleado;
import den.domain.persona.Persona;
import den.domain.persona.PersonaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empleado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link den.domain.persona.impl.EmpleadoImpl#getIdEmpleado <em>Id Empleado</em>}</li>
 *   <li>{@link den.domain.persona.impl.EmpleadoImpl#getFechaInicioContrato <em>Fecha Inicio Contrato</em>}</li>
 *   <li>{@link den.domain.persona.impl.EmpleadoImpl#getFechaTerminacionContrato <em>Fecha Terminacion Contrato</em>}</li>
 *   <li>{@link den.domain.persona.impl.EmpleadoImpl#getCargo <em>Cargo</em>}</li>
 *   <li>{@link den.domain.persona.impl.EmpleadoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link den.domain.persona.impl.EmpleadoImpl#getSalario <em>Salario</em>}</li>
 *   <li>{@link den.domain.persona.impl.EmpleadoImpl#getOwenedByPersona <em>Owened By Persona</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmpleadoImpl extends EObjectImpl implements Empleado {
	/**
	 * The default value of the '{@link #getIdEmpleado() <em>Id Empleado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdEmpleado()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EMPLEADO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdEmpleado() <em>Id Empleado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdEmpleado()
	 * @generated
	 * @ordered
	 */
	protected String idEmpleado = ID_EMPLEADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaInicioContrato() <em>Fecha Inicio Contrato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaInicioContrato()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_INICIO_CONTRATO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getFechaInicioContrato() <em>Fecha Inicio Contrato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaInicioContrato()
	 * @generated
	 * @ordered
	 */
	protected String fechaInicioContrato = FECHA_INICIO_CONTRATO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaTerminacionContrato() <em>Fecha Terminacion Contrato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaTerminacionContrato()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_TERMINACION_CONTRATO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getFechaTerminacionContrato() <em>Fecha Terminacion Contrato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaTerminacionContrato()
	 * @generated
	 * @ordered
	 */
	protected String fechaTerminacionContrato = FECHA_TERMINACION_CONTRATO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCargo() <em>Cargo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargo()
	 * @generated
	 * @ordered
	 */
	protected static final String CARGO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getCargo() <em>Cargo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargo()
	 * @generated
	 * @ordered
	 */
	protected String cargo = CARGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalario() <em>Salario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalario()
	 * @generated
	 * @ordered
	 */
	protected static final String SALARIO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getSalario() <em>Salario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalario()
	 * @generated
	 * @ordered
	 */
	protected String salario = SALARIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmpleadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersonaPackage.Literals.EMPLEADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdEmpleado() {
		return idEmpleado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdEmpleado(String newIdEmpleado) {
		String oldIdEmpleado = idEmpleado;
		idEmpleado = newIdEmpleado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.EMPLEADO__ID_EMPLEADO, oldIdEmpleado, idEmpleado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaInicioContrato() {
		return fechaInicioContrato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaInicioContrato(String newFechaInicioContrato) {
		String oldFechaInicioContrato = fechaInicioContrato;
		fechaInicioContrato = newFechaInicioContrato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.EMPLEADO__FECHA_INICIO_CONTRATO, oldFechaInicioContrato, fechaInicioContrato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaTerminacionContrato() {
		return fechaTerminacionContrato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaTerminacionContrato(String newFechaTerminacionContrato) {
		String oldFechaTerminacionContrato = fechaTerminacionContrato;
		fechaTerminacionContrato = newFechaTerminacionContrato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.EMPLEADO__FECHA_TERMINACION_CONTRATO, oldFechaTerminacionContrato, fechaTerminacionContrato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCargo(String newCargo) {
		String oldCargo = cargo;
		cargo = newCargo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.EMPLEADO__CARGO, oldCargo, cargo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.EMPLEADO__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSalario() {
		return salario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalario(String newSalario) {
		String oldSalario = salario;
		salario = newSalario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.EMPLEADO__SALARIO, oldSalario, salario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persona getOwenedByPersona() {
		if (eContainerFeatureID() != PersonaPackage.EMPLEADO__OWENED_BY_PERSONA) return null;
		return (Persona)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedByPersona(Persona newOwenedByPersona, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwenedByPersona, PersonaPackage.EMPLEADO__OWENED_BY_PERSONA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedByPersona(Persona newOwenedByPersona) {
		if (newOwenedByPersona != eInternalContainer() || (eContainerFeatureID() != PersonaPackage.EMPLEADO__OWENED_BY_PERSONA && newOwenedByPersona != null)) {
			if (EcoreUtil.isAncestor(this, newOwenedByPersona))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwenedByPersona != null)
				msgs = ((InternalEObject)newOwenedByPersona).eInverseAdd(this, PersonaPackage.PERSONA__LST_EMPLEADO, Persona.class, msgs);
			msgs = basicSetOwenedByPersona(newOwenedByPersona, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonaPackage.EMPLEADO__OWENED_BY_PERSONA, newOwenedByPersona, newOwenedByPersona));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersonaPackage.EMPLEADO__OWENED_BY_PERSONA:
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
			case PersonaPackage.EMPLEADO__OWENED_BY_PERSONA:
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
			case PersonaPackage.EMPLEADO__OWENED_BY_PERSONA:
				return eInternalContainer().eInverseRemove(this, PersonaPackage.PERSONA__LST_EMPLEADO, Persona.class, msgs);
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
			case PersonaPackage.EMPLEADO__ID_EMPLEADO:
				return getIdEmpleado();
			case PersonaPackage.EMPLEADO__FECHA_INICIO_CONTRATO:
				return getFechaInicioContrato();
			case PersonaPackage.EMPLEADO__FECHA_TERMINACION_CONTRATO:
				return getFechaTerminacionContrato();
			case PersonaPackage.EMPLEADO__CARGO:
				return getCargo();
			case PersonaPackage.EMPLEADO__DESCRIPCION:
				return getDescripcion();
			case PersonaPackage.EMPLEADO__SALARIO:
				return getSalario();
			case PersonaPackage.EMPLEADO__OWENED_BY_PERSONA:
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
			case PersonaPackage.EMPLEADO__ID_EMPLEADO:
				setIdEmpleado((String)newValue);
				return;
			case PersonaPackage.EMPLEADO__FECHA_INICIO_CONTRATO:
				setFechaInicioContrato((String)newValue);
				return;
			case PersonaPackage.EMPLEADO__FECHA_TERMINACION_CONTRATO:
				setFechaTerminacionContrato((String)newValue);
				return;
			case PersonaPackage.EMPLEADO__CARGO:
				setCargo((String)newValue);
				return;
			case PersonaPackage.EMPLEADO__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case PersonaPackage.EMPLEADO__SALARIO:
				setSalario((String)newValue);
				return;
			case PersonaPackage.EMPLEADO__OWENED_BY_PERSONA:
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
			case PersonaPackage.EMPLEADO__ID_EMPLEADO:
				setIdEmpleado(ID_EMPLEADO_EDEFAULT);
				return;
			case PersonaPackage.EMPLEADO__FECHA_INICIO_CONTRATO:
				setFechaInicioContrato(FECHA_INICIO_CONTRATO_EDEFAULT);
				return;
			case PersonaPackage.EMPLEADO__FECHA_TERMINACION_CONTRATO:
				setFechaTerminacionContrato(FECHA_TERMINACION_CONTRATO_EDEFAULT);
				return;
			case PersonaPackage.EMPLEADO__CARGO:
				setCargo(CARGO_EDEFAULT);
				return;
			case PersonaPackage.EMPLEADO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case PersonaPackage.EMPLEADO__SALARIO:
				setSalario(SALARIO_EDEFAULT);
				return;
			case PersonaPackage.EMPLEADO__OWENED_BY_PERSONA:
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
			case PersonaPackage.EMPLEADO__ID_EMPLEADO:
				return ID_EMPLEADO_EDEFAULT == null ? idEmpleado != null : !ID_EMPLEADO_EDEFAULT.equals(idEmpleado);
			case PersonaPackage.EMPLEADO__FECHA_INICIO_CONTRATO:
				return FECHA_INICIO_CONTRATO_EDEFAULT == null ? fechaInicioContrato != null : !FECHA_INICIO_CONTRATO_EDEFAULT.equals(fechaInicioContrato);
			case PersonaPackage.EMPLEADO__FECHA_TERMINACION_CONTRATO:
				return FECHA_TERMINACION_CONTRATO_EDEFAULT == null ? fechaTerminacionContrato != null : !FECHA_TERMINACION_CONTRATO_EDEFAULT.equals(fechaTerminacionContrato);
			case PersonaPackage.EMPLEADO__CARGO:
				return CARGO_EDEFAULT == null ? cargo != null : !CARGO_EDEFAULT.equals(cargo);
			case PersonaPackage.EMPLEADO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case PersonaPackage.EMPLEADO__SALARIO:
				return SALARIO_EDEFAULT == null ? salario != null : !SALARIO_EDEFAULT.equals(salario);
			case PersonaPackage.EMPLEADO__OWENED_BY_PERSONA:
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
		result.append(" (idEmpleado: ");
		result.append(idEmpleado);
		result.append(", fechaInicioContrato: ");
		result.append(fechaInicioContrato);
		result.append(", fechaTerminacionContrato: ");
		result.append(fechaTerminacionContrato);
		result.append(", cargo: ");
		result.append(cargo);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", salario: ");
		result.append(salario);
		result.append(')');
		return result.toString();
	}

} //EmpleadoImpl
