/**
 */
package com.github.maybeec.oomph.task.cli.impl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import com.github.maybeec.oomph.task.cli.cliPackage;
import com.github.maybeec.oomph.task.cli.cliTask;
import com.github.maybeec.oomph.task.cli.core.SetupTaskLogger;
import com.github.maybeec.oomph.task.cli.core.impl.CommandLineUtilImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Task</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.maybeec.oomph.task.cli.impl.cliTaskImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.cli.impl.cliTaskImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.cli.impl.cliTaskImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("restriction")
// Access to {org.eclipse.oomph.setup.SetupTaskContext} is actually needed for execution
public class cliTaskImpl extends SetupTaskImpl implements cliTask
{
  /**
     * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see #getCommand()
     * @generated
     * @ordered
     */
  protected static final String COMMAND_EDEFAULT = null;

  /**
     * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see #getCommand()
     * @generated
     * @ordered
     */
  protected String command = COMMAND_EDEFAULT;

  /**
     * The cached value of the '{@link #getArgument() <em>Argument</em>}' attribute list.
     * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
     * @see #getArgument()
     * @generated
     * @ordered
     */
  protected EList<String> argument;

  /**
     * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
  protected static final int PRIORITY_EDEFAULT = 500;

  /**
     * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
  protected int priority = PRIORITY_EDEFAULT;

  /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
  protected cliTaskImpl()
  {
        super();
    }

  /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
  @Override
  protected EClass eStaticClass()
  {
        return cliPackage.Literals.CLI_TASK;
    }

  /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
  public String getCommand()
  {
        return command;
    }

  /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
  public void setCommand(String newCommand)
  {
        String oldCommand = command;
        command = newCommand;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, cliPackage.CLI_TASK__COMMAND, oldCommand, command));
        }
    }

  /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
  public EList<String> getArgument()
  {
        if (argument == null) {
            argument = new EDataTypeUniqueEList<String>(String.class, this, cliPackage.CLI_TASK__ARGUMENT);
        }
        return argument;
    }

  /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
  @Override
  public int getPriority()
  {
        return priority;
    }

  /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
  public void setPriority(int newPriority)
  {
        int oldPriority = priority;
        priority = newPriority;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, cliPackage.CLI_TASK__PRIORITY, oldPriority, priority));
        }
    }

  /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
        switch (featureID) {
            case cliPackage.CLI_TASK__COMMAND:
                return getCommand();
            case cliPackage.CLI_TASK__ARGUMENT:
                return getArgument();
            case cliPackage.CLI_TASK__PRIORITY:
                return getPriority();
        }
        return super.eGet(featureID, resolve, coreType);
    }

  /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
        switch (featureID) {
            case cliPackage.CLI_TASK__COMMAND:
                setCommand((String)newValue);
                return;
            case cliPackage.CLI_TASK__ARGUMENT:
                getArgument().clear();
                getArgument().addAll((Collection<? extends String>)newValue);
                return;
            case cliPackage.CLI_TASK__PRIORITY:
                setPriority((Integer)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

  /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
  @Override
  public void eUnset(int featureID)
  {
        switch (featureID) {
            case cliPackage.CLI_TASK__COMMAND:
                setCommand(COMMAND_EDEFAULT);
                return;
            case cliPackage.CLI_TASK__ARGUMENT:
                getArgument().clear();
                return;
            case cliPackage.CLI_TASK__PRIORITY:
                setPriority(PRIORITY_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

  /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
  @Override
  public boolean eIsSet(int featureID)
  {
        switch (featureID) {
            case cliPackage.CLI_TASK__COMMAND:
                return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
            case cliPackage.CLI_TASK__ARGUMENT:
                return argument != null && !argument.isEmpty();
            case cliPackage.CLI_TASK__PRIORITY:
                return priority != PRIORITY_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

  /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
  @Override
  public String toString()
  {
        if (eIsProxy()) {
            return super.toString();
        }

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (command: ");
        result.append(command);
        result.append(", argument: ");
        result.append(argument);
        result.append(", priority: ");
        result.append(priority);
        result.append(')');
        return result.toString();
    }

  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    return true;
  }

  public void perform(SetupTaskContext context) throws Exception
  {
    SetupTaskLogger.getLogger().setContext(context);
    SetupTaskLogger.getLogger().logInfo("Execute CommandLineTask with Priority " + priority);
    List<String> cmdLine = new LinkedList<String>();
    cmdLine.add(command);
    cmdLine.addAll(argument);
    CommandLineUtilImpl.getInstance().execute(cmdLine);
  }

  @Override
  public void dispose()
  {

  }

}
