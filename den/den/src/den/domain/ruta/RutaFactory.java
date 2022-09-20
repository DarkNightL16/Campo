/**
 */
package den.domain.ruta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see den.domain.ruta.RutaPackage
 * @generated
 */
public interface RutaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RutaFactory eINSTANCE = den.domain.ruta.impl.RutaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Factory Ruta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factory Ruta</em>'.
	 * @generated
	 */
	FactoryRuta createFactoryRuta();

	/**
	 * Returns a new object of class '<em>Ruta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruta</em>'.
	 * @generated
	 */
	Ruta createRuta();

	/**
	 * Returns a new object of class '<em>Tarifa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarifa</em>'.
	 * @generated
	 */
	Tarifa createTarifa();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RutaPackage getRutaPackage();

} //RutaFactory
