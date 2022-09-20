/**
 */
package den.domain.ruta.impl;

import den.domain.ruta.*;

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
public class RutaFactoryImpl extends EFactoryImpl implements RutaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RutaFactory init() {
		try {
			RutaFactory theRutaFactory = (RutaFactory)EPackage.Registry.INSTANCE.getEFactory(RutaPackage.eNS_URI);
			if (theRutaFactory != null) {
				return theRutaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RutaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RutaFactoryImpl() {
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
			case RutaPackage.FACTORY_RUTA: return createFactoryRuta();
			case RutaPackage.RUTA: return createRuta();
			case RutaPackage.TARIFA: return createTarifa();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryRuta createFactoryRuta() {
		FactoryRutaImpl factoryRuta = new FactoryRutaImpl();
		return factoryRuta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruta createRuta() {
		RutaImpl ruta = new RutaImpl();
		return ruta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarifa createTarifa() {
		TarifaImpl tarifa = new TarifaImpl();
		return tarifa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RutaPackage getRutaPackage() {
		return (RutaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RutaPackage getPackage() {
		return RutaPackage.eINSTANCE;
	}

} //RutaFactoryImpl
