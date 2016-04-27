/*
 * Copyright (c) 2014 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package cli;

import org.eclipse.oomph.setup.SetupTask;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>cli Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cli.cliTask#getCommand <em>Command</em>}</li>
 *   <li>{@link cli.cliTask#getArgument <em>Argument</em>}</li>
 *   <li>{@link cli.cliTask#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see cli.cliPackage#getcliTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.cli' repository='http://download.example.org/task-cli/updates' installableUnits='task-cli.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='BOOTSTRAP STARTUP MANUAL'"
 * @generated
 */
public interface cliTask extends SetupTask
{

  /**
   * Returns the value of the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' attribute.
   * @see #setCommand(String)
   * @see cli.cliPackage#getcliTask_Command()
   * @model required="true"
   * @generated
   */
  String getCommand();

  /**
   * Sets the value of the '{@link cli.cliTask#getCommand <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' attribute.
   * @see #getCommand()
   * @generated
   */
  void setCommand(String value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' attribute list.
   * @see cli.cliPackage#getcliTask_Argument()
   * @model
   * @generated
   */
  EList<String> getArgument();

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * The default value is <code>"500"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see #setPriority(int)
   * @see cli.cliPackage#getcliTask_Priority()
   * @model default="500"
   * @generated
   */
  int getPriority();

  /**
   * Sets the value of the '{@link cli.cliTask#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(int value);

} // cliTask
