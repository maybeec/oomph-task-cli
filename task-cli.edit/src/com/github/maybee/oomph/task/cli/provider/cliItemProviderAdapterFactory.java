/**
 */
package com.github.maybee.oomph.task.cli.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.oomph.base.Annotation;
import org.eclipse.oomph.base.BasePackage;
import org.eclipse.oomph.base.util.BaseSwitch;
import org.eclipse.oomph.setup.SetupPackage;
import org.eclipse.oomph.setup.SetupTaskContainer;
import org.eclipse.oomph.setup.util.SetupSwitch;

import com.github.maybee.oomph.task.cli.cliFactory;
import com.github.maybee.oomph.task.cli.cliPackage;
import com.github.maybee.oomph.task.cli.util.cliAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class cliItemProviderAdapterFactory extends cliAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
     * This helps manage the child creation extenders.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(cliEditPlugin.INSTANCE, cliPackage.eNS_URI);

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
    public cliItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link com.github.maybee.oomph.task.cli.cliTask} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected cliTaskItemProvider cliTaskItemProvider;

    /**
     * This creates an adapter for a {@link com.github.maybee.oomph.task.cli.cliTask}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createcliTaskAdapter() {
        if (cliTaskItemProvider == null) {
            cliTaskItemProvider = new cliTaskItemProvider(this);
        }

        return cliTaskItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<IChildCreationExtender> getChildCreationExtenders() {
        return childCreationExtenderManager.getChildCreationExtenders();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
        return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceLocator getResourceLocator() {
        return childCreationExtenderManager;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
    public void dispose() {
        if (cliTaskItemProvider != null) {
            cliTaskItemProvider.dispose();
        }
    }

    /**
     * A child creation extender for the {@link BasePackage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static class BaseChildCreationExtender implements IChildCreationExtender {
        /**
         * The switch for creating child descriptors specific to each extended class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static class CreationSwitch extends BaseSwitch<Object> {
            /**
             * The child descriptors being populated.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected List<Object> newChildDescriptors;

            /**
             * The domain in which to create the children.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected EditingDomain editingDomain;

            /**
             * Creates the a switch for populating child descriptors in the given domain.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
                this.newChildDescriptors = newChildDescriptors;
                this.editingDomain = editingDomain;
            }
            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            @Override
            public Object caseAnnotation(Annotation object) {
                newChildDescriptors.add
                    (createChildParameter
                        (BasePackage.Literals.ANNOTATION__CONTENTS,
                         cliFactory.eINSTANCE.createcliTask()));

                return null;
            }
 
            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected CommandParameter createChildParameter(Object feature, Object child) {
                return new CommandParameter(null, feature, child);
            }

        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
            ArrayList<Object> result = new ArrayList<Object>();
            new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
            return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ResourceLocator getResourceLocator() {
            return cliEditPlugin.INSTANCE;
        }
    }

    /**
     * A child creation extender for the {@link SetupPackage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static class SetupChildCreationExtender implements IChildCreationExtender {
        /**
         * The switch for creating child descriptors specific to each extended class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static class CreationSwitch extends SetupSwitch<Object> {
            /**
             * The child descriptors being populated.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected List<Object> newChildDescriptors;

            /**
             * The domain in which to create the children.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected EditingDomain editingDomain;

            /**
             * Creates the a switch for populating child descriptors in the given domain.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
                this.newChildDescriptors = newChildDescriptors;
                this.editingDomain = editingDomain;
            }
            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            @Override
            public Object caseSetupTaskContainer(SetupTaskContainer object) {
                newChildDescriptors.add
                    (createChildParameter
                        (SetupPackage.Literals.SETUP_TASK_CONTAINER__SETUP_TASKS,
                         cliFactory.eINSTANCE.createcliTask()));

                return null;
            }
 
            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected CommandParameter createChildParameter(Object feature, Object child) {
                return new CommandParameter(null, feature, child);
            }

        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
            ArrayList<Object> result = new ArrayList<Object>();
            new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
            return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ResourceLocator getResourceLocator() {
            return cliEditPlugin.INSTANCE;
        }
    }

}
