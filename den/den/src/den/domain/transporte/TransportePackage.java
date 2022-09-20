/**
 */
package den.domain.transporte;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see den.domain.transporte.TransporteFactory
 * @model kind="package"
 * @generated
 */
public interface TransportePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "transporte";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///den/domain/transporte.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "den.domain.transporte";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransportePackage eINSTANCE = den.domain.transporte.impl.TransportePackageImpl.init();

	/**
	 * The meta object id for the '{@link den.domain.transporte.impl.FactoryTransporteImpl <em>Factory Transporte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.transporte.impl.FactoryTransporteImpl
	 * @see den.domain.transporte.impl.TransportePackageImpl#getFactoryTransporte()
	 * @generated
	 */
	int FACTORY_TRANSPORTE = 0;

	/**
	 * The feature id for the '<em><b>Id Transporte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_TRANSPORTE__ID_TRANSPORTE = 0;

	/**
	 * The feature id for the '<em><b>Owened By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_TRANSPORTE__OWENED_BY_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Lst Transporte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_TRANSPORTE__LST_TRANSPORTE = 2;

	/**
	 * The number of structural features of the '<em>Factory Transporte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_TRANSPORTE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link den.domain.transporte.impl.TransporteImpl <em>Transporte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see den.domain.transporte.impl.TransporteImpl
	 * @see den.domain.transporte.impl.TransportePackageImpl#getTransporte()
	 * @generated
	 */
	int TRANSPORTE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE__ID = 0;

	/**
	 * The feature id for the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE__MARCA = 1;

	/**
	 * The feature id for the '<em><b>Numero Poliza</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE__NUMERO_POLIZA = 2;

	/**
	 * The feature id for the '<em><b>Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE__MATRICULA = 3;

	/**
	 * The feature id for the '<em><b>Tarjeta Propiedad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE__TARJETA_PROPIEDAD = 4;

	/**
	 * The feature id for the '<em><b>Owened By Factory Transporte</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE = 5;

	/**
	 * The feature id for the '<em><b>Lst Producto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE__LST_PRODUCTO = 6;

	/**
	 * The feature id for the '<em><b>Lst Envio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE__LST_ENVIO = 7;

	/**
	 * The feature id for the '<em><b>Lst Conductor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE__LST_CONDUCTOR = 8;

	/**
	 * The feature id for the '<em><b>Lst Persona</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE__LST_PERSONA = 9;

	/**
	 * The number of structural features of the '<em>Transporte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE_FEATURE_COUNT = 10;


	/**
	 * Returns the meta object for class '{@link den.domain.transporte.FactoryTransporte <em>Factory Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory Transporte</em>'.
	 * @see den.domain.transporte.FactoryTransporte
	 * @generated
	 */
	EClass getFactoryTransporte();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.transporte.FactoryTransporte#getIdTransporte <em>Id Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Transporte</em>'.
	 * @see den.domain.transporte.FactoryTransporte#getIdTransporte()
	 * @see #getFactoryTransporte()
	 * @generated
	 */
	EAttribute getFactoryTransporte_IdTransporte();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.transporte.FactoryTransporte#getOwenedByDomain <em>Owened By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Domain</em>'.
	 * @see den.domain.transporte.FactoryTransporte#getOwenedByDomain()
	 * @see #getFactoryTransporte()
	 * @generated
	 */
	EReference getFactoryTransporte_OwenedByDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link den.domain.transporte.FactoryTransporte#getLstTransporte <em>Lst Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Transporte</em>'.
	 * @see den.domain.transporte.FactoryTransporte#getLstTransporte()
	 * @see #getFactoryTransporte()
	 * @generated
	 */
	EReference getFactoryTransporte_LstTransporte();

	/**
	 * Returns the meta object for class '{@link den.domain.transporte.Transporte <em>Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transporte</em>'.
	 * @see den.domain.transporte.Transporte
	 * @generated
	 */
	EClass getTransporte();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.transporte.Transporte#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see den.domain.transporte.Transporte#getId()
	 * @see #getTransporte()
	 * @generated
	 */
	EAttribute getTransporte_Id();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.transporte.Transporte#getMarca <em>Marca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marca</em>'.
	 * @see den.domain.transporte.Transporte#getMarca()
	 * @see #getTransporte()
	 * @generated
	 */
	EAttribute getTransporte_Marca();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.transporte.Transporte#getNumeroPoliza <em>Numero Poliza</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Poliza</em>'.
	 * @see den.domain.transporte.Transporte#getNumeroPoliza()
	 * @see #getTransporte()
	 * @generated
	 */
	EAttribute getTransporte_NumeroPoliza();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.transporte.Transporte#getMatricula <em>Matricula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricula</em>'.
	 * @see den.domain.transporte.Transporte#getMatricula()
	 * @see #getTransporte()
	 * @generated
	 */
	EAttribute getTransporte_Matricula();

	/**
	 * Returns the meta object for the attribute '{@link den.domain.transporte.Transporte#getTarjetaPropiedad <em>Tarjeta Propiedad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tarjeta Propiedad</em>'.
	 * @see den.domain.transporte.Transporte#getTarjetaPropiedad()
	 * @see #getTransporte()
	 * @generated
	 */
	EAttribute getTransporte_TarjetaPropiedad();

	/**
	 * Returns the meta object for the container reference '{@link den.domain.transporte.Transporte#getOwenedByFactoryTransporte <em>Owened By Factory Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owened By Factory Transporte</em>'.
	 * @see den.domain.transporte.Transporte#getOwenedByFactoryTransporte()
	 * @see #getTransporte()
	 * @generated
	 */
	EReference getTransporte_OwenedByFactoryTransporte();

	/**
	 * Returns the meta object for the reference list '{@link den.domain.transporte.Transporte#getLstProducto <em>Lst Producto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst Producto</em>'.
	 * @see den.domain.transporte.Transporte#getLstProducto()
	 * @see #getTransporte()
	 * @generated
	 */
	EReference getTransporte_LstProducto();

	/**
	 * Returns the meta object for the reference '{@link den.domain.transporte.Transporte#getLstEnvio <em>Lst Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lst Envio</em>'.
	 * @see den.domain.transporte.Transporte#getLstEnvio()
	 * @see #getTransporte()
	 * @generated
	 */
	EReference getTransporte_LstEnvio();

	/**
	 * Returns the meta object for the reference '{@link den.domain.transporte.Transporte#getLstConductor <em>Lst Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lst Conductor</em>'.
	 * @see den.domain.transporte.Transporte#getLstConductor()
	 * @see #getTransporte()
	 * @generated
	 */
	EReference getTransporte_LstConductor();

	/**
	 * Returns the meta object for the reference '{@link den.domain.transporte.Transporte#getLstPersona <em>Lst Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lst Persona</em>'.
	 * @see den.domain.transporte.Transporte#getLstPersona()
	 * @see #getTransporte()
	 * @generated
	 */
	EReference getTransporte_LstPersona();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransporteFactory getTransporteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link den.domain.transporte.impl.FactoryTransporteImpl <em>Factory Transporte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.transporte.impl.FactoryTransporteImpl
		 * @see den.domain.transporte.impl.TransportePackageImpl#getFactoryTransporte()
		 * @generated
		 */
		EClass FACTORY_TRANSPORTE = eINSTANCE.getFactoryTransporte();

		/**
		 * The meta object literal for the '<em><b>Id Transporte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY_TRANSPORTE__ID_TRANSPORTE = eINSTANCE.getFactoryTransporte_IdTransporte();

		/**
		 * The meta object literal for the '<em><b>Owened By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_TRANSPORTE__OWENED_BY_DOMAIN = eINSTANCE.getFactoryTransporte_OwenedByDomain();

		/**
		 * The meta object literal for the '<em><b>Lst Transporte</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY_TRANSPORTE__LST_TRANSPORTE = eINSTANCE.getFactoryTransporte_LstTransporte();

		/**
		 * The meta object literal for the '{@link den.domain.transporte.impl.TransporteImpl <em>Transporte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see den.domain.transporte.impl.TransporteImpl
		 * @see den.domain.transporte.impl.TransportePackageImpl#getTransporte()
		 * @generated
		 */
		EClass TRANSPORTE = eINSTANCE.getTransporte();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTE__ID = eINSTANCE.getTransporte_Id();

		/**
		 * The meta object literal for the '<em><b>Marca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTE__MARCA = eINSTANCE.getTransporte_Marca();

		/**
		 * The meta object literal for the '<em><b>Numero Poliza</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTE__NUMERO_POLIZA = eINSTANCE.getTransporte_NumeroPoliza();

		/**
		 * The meta object literal for the '<em><b>Matricula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTE__MATRICULA = eINSTANCE.getTransporte_Matricula();

		/**
		 * The meta object literal for the '<em><b>Tarjeta Propiedad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTE__TARJETA_PROPIEDAD = eINSTANCE.getTransporte_TarjetaPropiedad();

		/**
		 * The meta object literal for the '<em><b>Owened By Factory Transporte</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTE__OWENED_BY_FACTORY_TRANSPORTE = eINSTANCE.getTransporte_OwenedByFactoryTransporte();

		/**
		 * The meta object literal for the '<em><b>Lst Producto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTE__LST_PRODUCTO = eINSTANCE.getTransporte_LstProducto();

		/**
		 * The meta object literal for the '<em><b>Lst Envio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTE__LST_ENVIO = eINSTANCE.getTransporte_LstEnvio();

		/**
		 * The meta object literal for the '<em><b>Lst Conductor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTE__LST_CONDUCTOR = eINSTANCE.getTransporte_LstConductor();

		/**
		 * The meta object literal for the '<em><b>Lst Persona</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTE__LST_PERSONA = eINSTANCE.getTransporte_LstPersona();

	}

} //TransportePackage
