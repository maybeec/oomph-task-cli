/**
 */
package com.github.maybeec.oomph.task.cli.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.oomph.setup.SetupPackage;

import com.github.maybeec.oomph.task.cli.cliFactory;
import com.github.maybeec.oomph.task.cli.cliPackage;
import com.github.maybeec.oomph.task.cli.cliTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class cliPackageImpl extends EPackageImpl implements cliPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cliTaskEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see com.github.maybeec.oomph.task.cli.cliPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private cliPackageImpl() {
        super(eNS_URI, cliFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link cliPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static cliPackage init() {
        if (isInited) {
            return (cliPackage)EPackage.Registry.INSTANCE.getEPackage(cliPackage.eNS_URI);
        }

        // Obtain or create and register package
        cliPackageImpl thecliPackage = (cliPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof cliPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new cliPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        SetupPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        thecliPackage.createPackageContents();

        // Initialize created meta-data
        thecliPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thecliPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(cliPackage.eNS_URI, thecliPackage);
        return thecliPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getcliTask() {
        return cliTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getcliTask_Command() {
        return (EAttribute)cliTaskEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getcliTask_Argument() {
        return (EAttribute)cliTaskEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getcliTask_Priority() {
        return (EAttribute)cliTaskEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public cliFactory getcliFactory() {
        return (cliFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) {
            return;
        }
        isCreated = true;

        // Create classes and their features
        cliTaskEClass = createEClass(CLI_TASK);
        createEAttribute(cliTaskEClass, CLI_TASK__COMMAND);
        createEAttribute(cliTaskEClass, CLI_TASK__ARGUMENT);
        createEAttribute(cliTaskEClass, CLI_TASK__PRIORITY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) {
            return;
        }
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        SetupPackage theSetupPackage = (SetupPackage)EPackage.Registry.INSTANCE.getEPackage(SetupPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        cliTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

        // Initialize classes and features; add operations and parameters
        initEClass(cliTaskEClass, cliTask.class, "cliTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getcliTask_Command(), ecorePackage.getEString(), "command", null, 1, 1, cliTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getcliTask_Argument(), ecorePackage.getEString(), "argument", null, 0, -1, cliTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getcliTask_Priority(), ecorePackage.getEInt(), "priority", "500", 0, 1, cliTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource("https://raw.githubusercontent.com/maybeec/oomph-task-cli/master/task-cli-updatesite/model/Oomph-cli-task-1.0.ecore");

        // Create annotations
        // http://www.eclipse.org/emf/2002/Ecore
        createEcoreAnnotations();
        // http://www.eclipse.org/oomph/setup/Enablement
        createEnablementAnnotations();
        // http://www.eclipse.org/oomph/setup/ValidTriggers
        createValidTriggersAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createEcoreAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore";
        addAnnotation
          (this,
           source,
           new String[] {
             "schemaLocation", "https://raw.githubusercontent.com/maybeec/oomph-task-cli/master/task-cli-updatesite/model/Oomph-cli-task-1.0.ecore"
           });
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/Enablement</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createEnablementAnnotations() {
        String source = "http://www.eclipse.org/oomph/setup/Enablement";
        addAnnotation
          (cliTaskEClass,
           source,
           new String[] {
             "variableName", "p2.cli",
             "repository", "http://maybeec.github.io/oomph-task-cli/update",
             "installableUnits", "task-cli.feature.group"
           });
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/ValidTriggers</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createValidTriggersAnnotations() {
        String source = "http://www.eclipse.org/oomph/setup/ValidTriggers";
        addAnnotation
          (cliTaskEClass,
           source,
           new String[] {
             "triggers", "BOOTSTRAP STARTUP MANUAL"
           });
    }

} //cliPackageImpl
