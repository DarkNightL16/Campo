/**
 */
package den.domain.transporte;

import den.domain.Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Transporte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.transporte.FactoryTransporte#getIdTransporte <em>Id Transporte</em>}</li>
 *   <li>{@link den.domain.transporte.FactoryTransporte#getOwenedByDomain <em>Owened By Domain</em>}</li>
 *   <li>{@link den.domain.transporte.FactoryTransporte#getLstTransporte <em>Lst Transporte</em>}</li>
 * </ul>
 *
 * @see den.domain.transporte.TransportePackage#getFactoryTransporte()
 * @model
 * @generated
 */
public interface FactoryTransporte extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Transporte</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Transporte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Transporte</em>' attribute.
	 * @see #setIdTransporte(String)
	 * @see den.domain.transporte.TransportePackage#getFactoryTransporte_IdTransporte()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdTransporte();

	/**
	 * Sets the value of the '{@link den.domain.transporte.FactoryTransporte#getIdTransporte <em>Id Transporte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Transporte</em>' attribute.
	 * @see #getIdTransporte()
	 * @generated
	 */
	void setIdTransporte(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.Domain#getLstFactoryTransporte <em>Lst Factory Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Domain</em>' container reference.
	 * @see #setOwenedByDomain(Domain)
	 * @see den.domain.transporte.TransportePackage#getFactoryTransporte_OwenedByDomain()
	 * @see den.domain.Domain#getLstFactoryTransporte
	 * @model opposite="lstFactoryTransporte" transient="false"
	 * @generated
	 */
	Domain getOwenedByDomain();

	/**
	 * Sets the value of the '{@link den.domain.transporte.FactoryTransporte#getOwenedByDomain <em>Owened By Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Domain</em>' container reference.
	 * @see #getOwenedByDomain()
	 * @generated
	 */
	void setOwenedByDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Lst Transporte</b></em>' containment reference list.
	 * The list contents are of type {@link den.domain.transporte.Transporte}.
	 * It is bidirectional and its opposite is '{@link den.domain.transporte.Transporte#getOwenedByFactoryTransporte <em>Owened By Factory Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Transporte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Transporte</em>' containment reference list.
	 * @see den.domain.transporte.TransportePackage#getFactoryTransporte_LstTransporte()
	 * @see den.domain.transporte.Transporte#getOwenedByFactoryTransporte
	 * @model opposite="owenedByFactoryTransporte" containment="true"
	 * @generated
	 */
	EList<Transporte> getLstTransporte();

} // FactoryTransporte
