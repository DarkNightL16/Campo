/**
 */
package den.domain.pedido;

import den.domain.Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory Pedido</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link den.domain.pedido.FactoryPedido#getIdPedido <em>Id Pedido</em>}</li>
 *   <li>{@link den.domain.pedido.FactoryPedido#getOwenedByDomain <em>Owened By Domain</em>}</li>
 *   <li>{@link den.domain.pedido.FactoryPedido#getLstPedido <em>Lst Pedido</em>}</li>
 * </ul>
 *
 * @see den.domain.pedido.PedidoPackage#getFactoryPedido()
 * @model
 * @generated
 */
public interface FactoryPedido extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Pedido</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Pedido</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Pedido</em>' attribute.
	 * @see #setIdPedido(String)
	 * @see den.domain.pedido.PedidoPackage#getFactoryPedido_IdPedido()
	 * @model default=" " dataType="den.String"
	 * @generated
	 */
	String getIdPedido();

	/**
	 * Sets the value of the '{@link den.domain.pedido.FactoryPedido#getIdPedido <em>Id Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Pedido</em>' attribute.
	 * @see #getIdPedido()
	 * @generated
	 */
	void setIdPedido(String value);

	/**
	 * Returns the value of the '<em><b>Owened By Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link den.domain.Domain#getLstFactoryPedido <em>Lst Factory Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened By Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened By Domain</em>' container reference.
	 * @see #setOwenedByDomain(Domain)
	 * @see den.domain.pedido.PedidoPackage#getFactoryPedido_OwenedByDomain()
	 * @see den.domain.Domain#getLstFactoryPedido
	 * @model opposite="lstFactoryPedido" transient="false"
	 * @generated
	 */
	Domain getOwenedByDomain();

	/**
	 * Sets the value of the '{@link den.domain.pedido.FactoryPedido#getOwenedByDomain <em>Owened By Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened By Domain</em>' container reference.
	 * @see #getOwenedByDomain()
	 * @generated
	 */
	void setOwenedByDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Lst Pedido</b></em>' containment reference list.
	 * The list contents are of type {@link den.domain.pedido.Pedido}.
	 * It is bidirectional and its opposite is '{@link den.domain.pedido.Pedido#getOwenedByFactoryPedido <em>Owened By Factory Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Pedido</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Pedido</em>' containment reference list.
	 * @see den.domain.pedido.PedidoPackage#getFactoryPedido_LstPedido()
	 * @see den.domain.pedido.Pedido#getOwenedByFactoryPedido
	 * @model opposite="owenedByFactoryPedido" containment="true"
	 * @generated
	 */
	EList<Pedido> getLstPedido();

} // FactoryPedido
