/**
 */
package den.domain.persona.provider;


import den.domain.persona.Persona;
import den.domain.persona.PersonaFactory;
import den.domain.persona.PersonaPackage;

import den.provider.ModelEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link den.domain.persona.Persona} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonaItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonaItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPersonaPropertyDescriptor(object);
			addNumeroDocumentoPropertyDescriptor(object);
			addTipoDocumentoPropertyDescriptor(object);
			addEdadPropertyDescriptor(object);
			addFechaNacimientoPropertyDescriptor(object);
			addGeneroPropertyDescriptor(object);
			addDireccionResidenciaPropertyDescriptor(object);
			addEmailPropertyDescriptor(object);
			addTelefonoPropertyDescriptor(object);
			addLugarResidenciaPropertyDescriptor(object);
			addLstPedidoPropertyDescriptor(object);
			addLstTransportePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id Persona feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPersonaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persona_idPersona_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persona_idPersona_feature", "_UI_Persona_type"),
				 PersonaPackage.Literals.PERSONA__ID_PERSONA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Numero Documento feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumeroDocumentoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persona_numeroDocumento_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persona_numeroDocumento_feature", "_UI_Persona_type"),
				 PersonaPackage.Literals.PERSONA__NUMERO_DOCUMENTO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tipo Documento feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipoDocumentoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persona_tipoDocumento_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persona_tipoDocumento_feature", "_UI_Persona_type"),
				 PersonaPackage.Literals.PERSONA__TIPO_DOCUMENTO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edad feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persona_edad_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persona_edad_feature", "_UI_Persona_type"),
				 PersonaPackage.Literals.PERSONA__EDAD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fecha Nacimiento feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFechaNacimientoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persona_fechaNacimiento_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persona_fechaNacimiento_feature", "_UI_Persona_type"),
				 PersonaPackage.Literals.PERSONA__FECHA_NACIMIENTO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Genero feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneroPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persona_genero_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persona_genero_feature", "_UI_Persona_type"),
				 PersonaPackage.Literals.PERSONA__GENERO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Direccion Residencia feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDireccionResidenciaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persona_direccionResidencia_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persona_direccionResidencia_feature", "_UI_Persona_type"),
				 PersonaPackage.Literals.PERSONA__DIRECCION_RESIDENCIA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persona_email_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persona_email_feature", "_UI_Persona_type"),
				 PersonaPackage.Literals.PERSONA__EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Telefono feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTelefonoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persona_telefono_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persona_telefono_feature", "_UI_Persona_type"),
				 PersonaPackage.Literals.PERSONA__TELEFONO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lugar Residencia feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLugarResidenciaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persona_lugarResidencia_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persona_lugarResidencia_feature", "_UI_Persona_type"),
				 PersonaPackage.Literals.PERSONA__LUGAR_RESIDENCIA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lst Pedido feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLstPedidoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persona_lstPedido_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persona_lstPedido_feature", "_UI_Persona_type"),
				 PersonaPackage.Literals.PERSONA__LST_PEDIDO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lst Transporte feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLstTransportePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Persona_lstTransporte_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Persona_lstTransporte_feature", "_UI_Persona_type"),
				 PersonaPackage.Literals.PERSONA__LST_TRANSPORTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PersonaPackage.Literals.PERSONA__LST_CLIENTE);
			childrenFeatures.add(PersonaPackage.Literals.PERSONA__LST_CONDUCTOR);
			childrenFeatures.add(PersonaPackage.Literals.PERSONA__LST_EMPLEADO);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Persona.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Persona"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Persona)object).getIdPersona();
		return label == null || label.length() == 0 ?
			getString("_UI_Persona_type") :
			getString("_UI_Persona_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Persona.class)) {
			case PersonaPackage.PERSONA__ID_PERSONA:
			case PersonaPackage.PERSONA__NUMERO_DOCUMENTO:
			case PersonaPackage.PERSONA__TIPO_DOCUMENTO:
			case PersonaPackage.PERSONA__EDAD:
			case PersonaPackage.PERSONA__FECHA_NACIMIENTO:
			case PersonaPackage.PERSONA__GENERO:
			case PersonaPackage.PERSONA__DIRECCION_RESIDENCIA:
			case PersonaPackage.PERSONA__EMAIL:
			case PersonaPackage.PERSONA__TELEFONO:
			case PersonaPackage.PERSONA__LUGAR_RESIDENCIA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PersonaPackage.PERSONA__LST_CLIENTE:
			case PersonaPackage.PERSONA__LST_CONDUCTOR:
			case PersonaPackage.PERSONA__LST_EMPLEADO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PersonaPackage.Literals.PERSONA__LST_CLIENTE,
				 PersonaFactory.eINSTANCE.createCliente()));

		newChildDescriptors.add
			(createChildParameter
				(PersonaPackage.Literals.PERSONA__LST_CONDUCTOR,
				 PersonaFactory.eINSTANCE.createConductor()));

		newChildDescriptors.add
			(createChildParameter
				(PersonaPackage.Literals.PERSONA__LST_EMPLEADO,
				 PersonaFactory.eINSTANCE.createEmpleado()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelEditPlugin.INSTANCE;
	}

}
