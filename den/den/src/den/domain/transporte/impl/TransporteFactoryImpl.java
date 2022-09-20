/**
 */
package den.domain.transporte.impl;

import den.domain.transporte.*;

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
public class TransporteFactoryImpl extends EFactoryImpl implements TransporteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransporteFactory init() {
		try {
			TransporteFactory theTransporteFactory = (TransporteFactory)EPackage.Registry.INSTANCE.getEFactory(TransportePackage.eNS_URI);
			if (theTransporteFactory != null) {
				return theTransporteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TransporteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransporteFactoryImpl() {
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
			case TransportePackage.FACTORY_TRANSPORTE: return createFactoryTransporte();
			case TransportePackage.TRANSPORTE: return createTransporte();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryTransporte createFactoryTransporte() {
		FactoryTransporteImpl factoryTransporte = new FactoryTransporteImpl();
		return factoryTransporte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transporte createTransporte() {
		TransporteImpl transporte = new TransporteImpl();
		return transporte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportePackage getTransportePackage() {
		return (TransportePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TransportePackage getPackage() {
		return TransportePackage.eINSTANCE;
	}

} //TransporteFactoryImpl
