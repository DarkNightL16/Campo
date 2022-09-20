/**
 */
package den.domain.ruta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarifa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.ruta.Tarifa#getId <em>Id</em>}</li>
 *   <li>{@link den.domain.ruta.Tarifa#getPrecio <em>Precio</em>}</li>
 *   <li>{@link den.domain.ruta.Tarifa#getOwenedByRuta <em>Owened By Ruta</em>}</li>
 * </ul>
 *
 * @see den.domain.ruta.RutaPackage#getTarifa()
 * @model
 * @generated
 */
public interface Tarifa extends EObject {
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
	 * @see den.domain.ruta.RutaPackage#getTarifa_Id()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link den.domain.ruta.Tarifa#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Precio</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precio</em>' attribute.
	 * @see #setPrecio(String)
	 * @see den.domain.ruta.RutaPackage#getTarifa_Precio()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getPrecio();

	/**
	 * Sets the value of the '{@link den.domain.ruta.Tarifa#getPrecio <em>Precio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precio</em>' attribute.
	 * @see #getPrecio()
	 * @generated
	 */
	void setPrecio(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Ruta</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.ruta.Ruta#getLstTarifa <em>Lst Tarifa</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Ruta</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Ruta</em>' container reference.
	 * @see #setOwenedByRuta(Ruta)
	 * @see den.domain.ruta.RutaPackage#getTarifa_OwenedByRuta()
	 * @see den.domain.ruta.Ruta#getLstTarifa
	 * @model opposite="lstTarifa" transient="false"
	 * @generated
	 */
	Ruta getOwenedByRuta();

	/**
	 * Sets the value of the '{@link den.domain.ruta.Tarifa#getOwenedByRuta <em>Owened By Ruta</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Ruta</em>' container reference.
	 * @see #getOwenedByRuta()
	 * @generated
	 */
	void setOwenedByRuta(Ruta value);

} // Tarifa
