/**
 */
package den.domain.envio;

import den.domain.Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Envio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.envio.FactoryEnvio#getLstEnvio <em>Lst Envio</em>}</li>
 *   <li>{@link den.domain.envio.FactoryEnvio#getIdEnvio <em>Id Envio</em>}</li>
 *   <li>{@link den.domain.envio.FactoryEnvio#getOwenedByDomain <em>Owened By Domain</em>}</li>
 * </ul>
 *
 * @see den.domain.envio.EnvioPackage#getFactoryEnvio()
 * @model
 * @generated
 */
public interface FactoryEnvio extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Envio</b></em>' containment reference list.
	 * The list contents are of type {@link den.domain.envio.Envio}.
	 * It is bidirectional and its opposite is '{@link den.domain.envio.Envio#getOwenedByFactoryEnvio <em>Owened By Factory Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Envio</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Envio</em>' containment reference list.
	 * @see den.domain.envio.EnvioPackage#getFactoryEnvio_LstEnvio()
	 * @see den.domain.envio.Envio#getOwenedByFactoryEnvio
	 * @model opposite="owenedByFactoryEnvio" containment="true"
	 * @generated
	 */
	EList<Envio> getLstEnvio();

	/**
	 * Returns the value of the '<em><b>Id Envio</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Envio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Envio</em>' attribute.
	 * @see #setIdEnvio(String)
	 * @see den.domain.envio.EnvioPackage#getFactoryEnvio_IdEnvio()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdEnvio();

	/**
	 * Sets the value of the '{@link den.domain.envio.FactoryEnvio#getIdEnvio <em>Id Envio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Envio</em>' attribute.
	 * @see #getIdEnvio()
	 * @generated
	 */
	void setIdEnvio(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.Domain#getLstFactoryEnvio <em>Lst Factory Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Domain</em>' container reference.
	 * @see #setOwenedByDomain(Domain)
	 * @see den.domain.envio.EnvioPackage#getFactoryEnvio_OwenedByDomain()
	 * @see den.domain.Domain#getLstFactoryEnvio
	 * @model opposite="lstFactoryEnvio" transient="false"
	 * @generated
	 */
	Domain getOwenedByDomain();

	/**
	 * Sets the value of the '{@link den.domain.envio.FactoryEnvio#getOwenedByDomain <em>Owened By Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Domain</em>' container reference.
	 * @see #getOwenedByDomain()
	 * @generated
	 */
	void setOwenedByDomain(Domain value);

} // FactoryEnvio
