/**
 */
package den.domain.ubicacion.impl;

import den.domain.ubicacion.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UbicacionFactoryImpl extends EFactoryImpl implements UbicacionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UbicacionFactory init() {
		try {
			UbicacionFactory theUbicacionFactory = (UbicacionFactory)EPackage.Registry.INSTANCE.getEFactory(UbicacionPackage.eNS_URI);
			if (theUbicacionFactory != null) {
				return theUbicacionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UbicacionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbicacionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UbicacionPackage.CIUDAD: return createCiudad();
			case UbicacionPackage.DEPARTAMENTO: return createDepartamento();
			case UbicacionPackage.FACTORY_UBICACION: return createFactoryUbicacion();
			case UbicacionPackage.PAIS: return createPais();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ciudad createCiudad() {
		CiudadImpl ciudad = new CiudadImpl();
		return ciudad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departamento createDepartamento() {
		DepartamentoImpl departamento = new DepartamentoImpl();
		return departamento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryUbicacion createFactoryUbicacion() {
		FactoryUbicacionImpl factoryUbicacion = new FactoryUbicacionImpl();
		return factoryUbicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pais createPais() {
		PaisImpl pais = new PaisImpl();
		return pais;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbicacionPackage getUbicacionPackage() {
		return (UbicacionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UbicacionPackage getPackage() {
		return UbicacionPackage.eINSTANCE;
	}

} //UbicacionFactoryImpl
