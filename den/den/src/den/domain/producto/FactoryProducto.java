/**
 */
package den.domain.producto;

import den.domain.Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Producto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.producto.FactoryProducto#getIdProducto <em>Id Producto</em>}</li>
 *   <li>{@link den.domain.producto.FactoryProducto#getOwenedByDomain <em>Owened By Domain</em>}</li>
 *   <li>{@link den.domain.producto.FactoryProducto#getLstProducto <em>Lst Producto</em>}</li>
 * </ul>
 *
 * @see den.domain.producto.ProductoPackage#getFactoryProducto()
 * @model
 * @generated
 */
public interface FactoryProducto extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Producto</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Producto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Producto</em>' attribute.
	 * @see #setIdProducto(String)
	 * @see den.domain.producto.ProductoPackage#getFactoryProducto_IdProducto()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdProducto();

	/**
	 * Sets the value of the '{@link den.domain.producto.FactoryProducto#getIdProducto <em>Id Producto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Producto</em>' attribute.
	 * @see #getIdProducto()
	 * @generated
	 */
	void setIdProducto(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.Domain#getLstFactoryProducto <em>Lst Factory Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Domain</em>' container reference.
	 * @see #setOwenedByDomain(Domain)
	 * @see den.domain.producto.ProductoPackage#getFactoryProducto_OwenedByDomain()
	 * @see den.domain.Domain#getLstFactoryProducto
	 * @model opposite="lstFactoryProducto" transient="false"
	 * @generated
	 */
	Domain getOwenedByDomain();

	/**
	 * Sets the value of the '{@link den.domain.producto.FactoryProducto#getOwenedByDomain <em>Owened By Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Domain</em>' container reference.
	 * @see #getOwenedByDomain()
	 * @generated
	 */
	void setOwenedByDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Lst Producto</b></em>' containment reference list.
	 * The list contents are of type {@link den.domain.producto.Producto}.
	 * It is bidirectional and its opposite is '{@link den.domain.producto.Producto#getOwenedFactoryProducto <em>Owened Factory Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Producto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Producto</em>' containment reference list.
	 * @see den.domain.producto.ProductoPackage#getFactoryProducto_LstProducto()
	 * @see den.domain.producto.Producto#getOwenedFactoryProducto
	 * @model opposite="owenedFactoryProducto" containment="true"
	 * @generated
	 */
	EList<Producto> getLstProducto();

} // FactoryProducto
