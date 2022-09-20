/**
 */
package den.domain.ruta;

import den.domain.Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Ruta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.ruta.FactoryRuta#getIdRuta <em>Id Ruta</em>}</li>
 *   <li>{@link den.domain.ruta.FactoryRuta#getOwenedByDomain <em>Owened By Domain</em>}</li>
 *   <li>{@link den.domain.ruta.FactoryRuta#getLstRuta <em>Lst Ruta</em>}</li>
 * </ul>
 *
 * @see den.domain.ruta.RutaPackage#getFactoryRuta()
 * @model
 * @generated
 */
public interface FactoryRuta extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Ruta</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Ruta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Ruta</em>' attribute.
	 * @see #setIdRuta(String)
	 * @see den.domain.ruta.RutaPackage#getFactoryRuta_IdRuta()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdRuta();

	/**
	 * Sets the value of the '{@link den.domain.ruta.FactoryRuta#getIdRuta <em>Id Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Ruta</em>' attribute.
	 * @see #getIdRuta()
	 * @generated
	 */
	void setIdRuta(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.Domain#getLstFactoryRuta <em>Lst Factory Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Domain</em>' container reference.
	 * @see #setOwenedByDomain(Domain)
	 * @see den.domain.ruta.RutaPackage#getFactoryRuta_OwenedByDomain()
	 * @see den.domain.Domain#getLstFactoryRuta
	 * @model opposite="lstFactoryRuta" transient="false"
	 * @generated
	 */
	Domain getOwenedByDomain();

	/**
	 * Sets the value of the '{@link den.domain.ruta.FactoryRuta#getOwenedByDomain <em>Owened By Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Domain</em>' container reference.
	 * @see #getOwenedByDomain()
	 * @generated
	 */
	void setOwenedByDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Lst Ruta</b></em>' containment reference list.
	 * The list contents are of type {@link den.domain.ruta.Ruta}.
	 * It is bidirectional and its opposite is '{@link den.domain.ruta.Ruta#getOwenedByFactoryRuta <em>Owened By Factory Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Ruta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Ruta</em>' containment reference list.
	 * @see den.domain.ruta.RutaPackage#getFactoryRuta_LstRuta()
	 * @see den.domain.ruta.Ruta#getOwenedByFactoryRuta
	 * @model opposite="owenedByFactoryRuta" containment="true"
	 * @generated
	 */
	EList<Ruta> getLstRuta();

} // FactoryRuta
