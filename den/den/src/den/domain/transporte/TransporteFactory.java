/**
 */
package den.domain.transporte;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see den.domain.transporte.TransportePackage
 * @generated
 */
public interface TransporteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransporteFactory eINSTANCE = den.domain.transporte.impl.TransporteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Factory Transporte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factory Transporte</em>'.
	 * @generated
	 */
	FactoryTransporte createFactoryTransporte();

	/**
	 * Returns a new object of class '<em>Transporte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transporte</em>'.
	 * @generated
	 */
	Transporte createTransporte();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TransportePackage getTransportePackage();

} //TransporteFactory
