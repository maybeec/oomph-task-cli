/**
 */
package com.github.maybeec.oomph.task.cli;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.oomph.setup.SetupPackage;

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
 * @see com.github.maybeec.oomph.task.cli.cliFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='https://raw.githubusercontent.com/maybeec/oomph-task-cli/master/task-cli-updatesite/model/Oomph-cli-task-1.0.ecore'"
 * @generated
 */
public interface cliPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "cli";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://maybeec.github.io/oomph-task-cli/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "com.github.maybeec.oomph.task";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    cliPackage eINSTANCE = com.github.maybeec.oomph.task.cli.impl.cliPackageImpl.init();

    /**
     * The meta object id for the '{@link com.github.maybeec.oomph.task.cli.impl.cliTaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.maybeec.oomph.task.cli.impl.cliTaskImpl
     * @see com.github.maybeec.oomph.task.cli.impl.cliPackageImpl#getcliTask()
     * @generated
     */
    int CLI_TASK = 0;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK__ID = SetupPackage.SETUP_TASK__ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Scope Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

    /**
     * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

    /**
     * The feature id for the '<em><b>Disabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

    /**
     * The feature id for the '<em><b>Predecessors</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

    /**
     * The feature id for the '<em><b>Successors</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

    /**
     * The feature id for the '<em><b>Restrictions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

    /**
     * The feature id for the '<em><b>Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

    /**
     * The feature id for the '<em><b>Directory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK__DIRECTORY = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Command</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK__COMMAND = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Argument</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK__ARGUMENT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK__PRIORITY = SetupPackage.SETUP_TASK_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLI_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 4;


    /**
     * Returns the meta object for class '{@link com.github.maybeec.oomph.task.cli.cliTask <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Task</em>'.
     * @see com.github.maybeec.oomph.task.cli.cliTask
     * @generated
     */
    EClass getcliTask();

    /**
     * Returns the meta object for the attribute '{@link com.github.maybeec.oomph.task.cli.cliTask#getDirectory <em>Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Directory</em>'.
     * @see com.github.maybeec.oomph.task.cli.cliTask#getDirectory()
     * @see #getcliTask()
     * @generated
     */
    EAttribute getcliTask_Directory();

    /**
     * Returns the meta object for the attribute '{@link com.github.maybeec.oomph.task.cli.cliTask#getCommand <em>Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Command</em>'.
     * @see com.github.maybeec.oomph.task.cli.cliTask#getCommand()
     * @see #getcliTask()
     * @generated
     */
    EAttribute getcliTask_Command();

    /**
     * Returns the meta object for the attribute list '{@link com.github.maybeec.oomph.task.cli.cliTask#getArgument <em>Argument</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Argument</em>'.
     * @see com.github.maybeec.oomph.task.cli.cliTask#getArgument()
     * @see #getcliTask()
     * @generated
     */
    EAttribute getcliTask_Argument();

    /**
     * Returns the meta object for the attribute '{@link com.github.maybeec.oomph.task.cli.cliTask#getPriority <em>Priority</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Priority</em>'.
     * @see com.github.maybeec.oomph.task.cli.cliTask#getPriority()
     * @see #getcliTask()
     * @generated
     */
    EAttribute getcliTask_Priority();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    cliFactory getcliFactory();

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
         * The meta object literal for the '{@link com.github.maybeec.oomph.task.cli.impl.cliTaskImpl <em>Task</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see com.github.maybeec.oomph.task.cli.impl.cliTaskImpl
         * @see com.github.maybeec.oomph.task.cli.impl.cliPackageImpl#getcliTask()
         * @generated
         */
        EClass CLI_TASK = eINSTANCE.getcliTask();

        /**
         * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLI_TASK__DIRECTORY = eINSTANCE.getcliTask_Directory();

        /**
         * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLI_TASK__COMMAND = eINSTANCE.getcliTask_Command();

        /**
         * The meta object literal for the '<em><b>Argument</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLI_TASK__ARGUMENT = eINSTANCE.getcliTask_Argument();

        /**
         * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLI_TASK__PRIORITY = eINSTANCE.getcliTask_Priority();

    }

} //cliPackage
