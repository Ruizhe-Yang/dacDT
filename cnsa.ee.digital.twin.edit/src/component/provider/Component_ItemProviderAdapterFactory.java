/**
 */
package component.provider;

import component.util.Component_AdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Component_ItemProviderAdapterFactory extends Component_AdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.ComponentPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPackageItemProvider componentPackageItemProvider;

	/**
	 * This creates an adapter for a {@link component.ComponentPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentPackageAdapter() {
		if (componentPackageItemProvider == null) {
			componentPackageItemProvider = new ComponentPackageItemProvider(this);
		}

		return componentPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.ComponentPackageInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPackageInterfaceItemProvider componentPackageInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link component.ComponentPackageInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentPackageInterfaceAdapter() {
		if (componentPackageInterfaceItemProvider == null) {
			componentPackageInterfaceItemProvider = new ComponentPackageInterfaceItemProvider(this);
		}

		return componentPackageInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.ComponentPackageBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPackageBindingItemProvider componentPackageBindingItemProvider;

	/**
	 * This creates an adapter for a {@link component.ComponentPackageBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentPackageBindingAdapter() {
		if (componentPackageBindingItemProvider == null) {
			componentPackageBindingItemProvider = new ComponentPackageBindingItemProvider(this);
		}

		return componentPackageBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link component.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.DirectedRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectedRelationshipItemProvider directedRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link component.DirectedRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDirectedRelationshipAdapter() {
		if (directedRelationshipItemProvider == null) {
			directedRelationshipItemProvider = new DirectedRelationshipItemProvider(this);
		}

		return directedRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.UndirectedRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UndirectedRelationshipItemProvider undirectedRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link component.UndirectedRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUndirectedRelationshipAdapter() {
		if (undirectedRelationshipItemProvider == null) {
			undirectedRelationshipItemProvider = new UndirectedRelationshipItemProvider(this);
		}

		return undirectedRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.Fork} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkItemProvider forkItemProvider;

	/**
	 * This creates an adapter for a {@link component.Fork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForkAdapter() {
		if (forkItemProvider == null) {
			forkItemProvider = new ForkItemProvider(this);
		}

		return forkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.Switch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchItemProvider switchItemProvider;

	/**
	 * This creates an adapter for a {@link component.Switch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSwitchAdapter() {
		if (switchItemProvider == null) {
			switchItemProvider = new SwitchItemProvider(this);
		}

		return switchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.Input} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputItemProvider inputItemProvider;

	/**
	 * This creates an adapter for a {@link component.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputAdapter() {
		if (inputItemProvider == null) {
			inputItemProvider = new InputItemProvider(this);
		}

		return inputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.Output} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputItemProvider outputItemProvider;

	/**
	 * This creates an adapter for a {@link component.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputAdapter() {
		if (outputItemProvider == null) {
			outputItemProvider = new OutputItemProvider(this);
		}

		return outputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.LPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPortItemProvider lPortItemProvider;

	/**
	 * This creates an adapter for a {@link component.LPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLPortAdapter() {
		if (lPortItemProvider == null) {
			lPortItemProvider = new LPortItemProvider(this);
		}

		return lPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.RPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPortItemProvider rPortItemProvider;

	/**
	 * This creates an adapter for a {@link component.RPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRPortAdapter() {
		if (rPortItemProvider == null) {
			rPortItemProvider = new RPortItemProvider(this);
		}

		return rPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.Function} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionItemProvider functionItemProvider;

	/**
	 * This creates an adapter for a {@link component.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionAdapter() {
		if (functionItemProvider == null) {
			functionItemProvider = new FunctionItemProvider(this);
		}

		return functionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.Reading} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadingItemProvider readingItemProvider;

	/**
	 * This creates an adapter for a {@link component.Reading}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReadingAdapter() {
		if (readingItemProvider == null) {
			readingItemProvider = new ReadingItemProvider(this);
		}

		return readingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.FailureMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureModeItemProvider failureModeItemProvider;

	/**
	 * This creates an adapter for a {@link component.FailureMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFailureModeAdapter() {
		if (failureModeItemProvider == null) {
			failureModeItemProvider = new FailureModeItemProvider(this);
		}

		return failureModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.SafetyMechanism} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyMechanismItemProvider safetyMechanismItemProvider;

	/**
	 * This creates an adapter for a {@link component.SafetyMechanism}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSafetyMechanismAdapter() {
		if (safetyMechanismItemProvider == null) {
			safetyMechanismItemProvider = new SafetyMechanismItemProvider(this);
		}

		return safetyMechanismItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.Cost} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostItemProvider costItemProvider;

	/**
	 * This creates an adapter for a {@link component.Cost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCostAdapter() {
		if (costItemProvider == null) {
			costItemProvider = new CostItemProvider(this);
		}

		return costItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.RegionalEffect} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionalEffectItemProvider regionalEffectItemProvider;

	/**
	 * This creates an adapter for a {@link component.RegionalEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegionalEffectAdapter() {
		if (regionalEffectItemProvider == null) {
			regionalEffectItemProvider = new RegionalEffectItemProvider(this);
		}

		return regionalEffectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.HigherLevelEffect} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HigherLevelEffectItemProvider higherLevelEffectItemProvider;

	/**
	 * This creates an adapter for a {@link component.HigherLevelEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHigherLevelEffectAdapter() {
		if (higherLevelEffectItemProvider == null) {
			higherLevelEffectItemProvider = new HigherLevelEffectItemProvider(this);
		}

		return higherLevelEffectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link component.FinalEffect} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalEffectItemProvider finalEffectItemProvider;

	/**
	 * This creates an adapter for a {@link component.FinalEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFinalEffectAdapter() {
		if (finalEffectItemProvider == null) {
			finalEffectItemProvider = new FinalEffectItemProvider(this);
		}

		return finalEffectItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (componentPackageItemProvider != null) componentPackageItemProvider.dispose();
		if (componentPackageInterfaceItemProvider != null) componentPackageInterfaceItemProvider.dispose();
		if (componentPackageBindingItemProvider != null) componentPackageBindingItemProvider.dispose();
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (directedRelationshipItemProvider != null) directedRelationshipItemProvider.dispose();
		if (undirectedRelationshipItemProvider != null) undirectedRelationshipItemProvider.dispose();
		if (forkItemProvider != null) forkItemProvider.dispose();
		if (switchItemProvider != null) switchItemProvider.dispose();
		if (inputItemProvider != null) inputItemProvider.dispose();
		if (outputItemProvider != null) outputItemProvider.dispose();
		if (lPortItemProvider != null) lPortItemProvider.dispose();
		if (rPortItemProvider != null) rPortItemProvider.dispose();
		if (functionItemProvider != null) functionItemProvider.dispose();
		if (readingItemProvider != null) readingItemProvider.dispose();
		if (failureModeItemProvider != null) failureModeItemProvider.dispose();
		if (safetyMechanismItemProvider != null) safetyMechanismItemProvider.dispose();
		if (costItemProvider != null) costItemProvider.dispose();
		if (regionalEffectItemProvider != null) regionalEffectItemProvider.dispose();
		if (higherLevelEffectItemProvider != null) higherLevelEffectItemProvider.dispose();
		if (finalEffectItemProvider != null) finalEffectItemProvider.dispose();
	}

}