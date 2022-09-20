/**
 */
package den.domain.ubicacion;

import den.domain.Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Ubicacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.ubicacion.FactoryUbicacion#getId <em>Id</em>}</li>
 *   <li>{@link den.domain.ubicacion.FactoryUbicacion#getOwenedByDomain <em>Owened By Domain</em>}</li>
 *   <li>{@link den.domain.ubicacion.FactoryUbicacion#getLstPais <em>Lst Pais</em>}</li>
 * </ul>
 *
 * @see den.domain.ubicacion.UbicacionPackage#getFactoryUbicacion()
 * @model
 * @generated
 */
public interface FactoryUbicacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see den.domain.ubicacion.UbicacionPackage#getFactoryUbicacion_Id()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.FactoryUbicacion#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.Domain#getLstFactoryUbicacion <em>Lst Factory Ubicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Domain</em>' container reference.
	 * @see #setOwenedByDomain(Domain)
	 * @see den.domain.ubicacion.UbicacionPackage#getFactoryUbicacion_OwenedByDomain()
	 * @see den.domain.Domain#getLstFactoryUbicacion
	 * @model opposite="lstFactoryUbicacion" transient="false"
	 * @generated
	 */
	Domain getOwenedByDomain();

	/**
	 * Sets the value of the '{@link den.domain.ubicacion.FactoryUbicacion#getOwenedByDomain <em>Owened By Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Domain</em>' container reference.
	 * @see #getOwenedByDomain()
	 * @generated
	 */
	void setOwenedByDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Lst Pais</b></em>' containment reference list.
	 * The list contents are of type {@link den.domain.ubicacion.Pais}.
	 * It is bidirectional and its opposite is '{@link den.domain.ubicacion.Pais#getOwenedByUbicacion <em>Owened By Ubicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Pais</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Pais</em>' containment reference list.
	 * @see den.domain.ubicacion.UbicacionPackage#getFactoryUbicacion_LstPais()
	 * @see den.domain.ubicacion.Pais#getOwenedByUbicacion
	 * @model opposite="owenedByUbicacion" containment="true"
	 * @generated
	 */
	EList<Pais> getLstPais();

} // FactoryUbicacion
