/**
 */
package com.github.maybee.oomph.task.cli;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.maybee.oomph.task.cli.cliPackage
 * @generated
 */
public interface cliFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    cliFactory eINSTANCE = com.github.maybee.oomph.task.cli.impl.cliFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Task</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Task</em>'.
     * @generated
     */
    cliTask createcliTask();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    cliPackage getcliPackage();

} //cliFactory
