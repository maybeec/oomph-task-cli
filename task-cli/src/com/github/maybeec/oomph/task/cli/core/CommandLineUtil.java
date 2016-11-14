/**
 *
 */
package com.github.maybeec.oomph.task.cli.core;

import com.github.maybeec.oomph.task.cli.core.exceptions.CommandLineUtilException;

/**
 * @author sholzer
 *
 */
public interface CommandLineUtil {
    /**
     * @param dir
     *            {@link String} the directory in that the command will be executed
     * @param cmd
     *            {@link String} the command to be executed
     * @param args
     *            {@link Iterable}&lt;{@link String}> a collection of arguments
     * @throws CommandLineUtilException
     *             if a problem occurs
     * @author sholzer (14.11.2016)
     */
    public void execute(String dir, String cmd, Iterable<String> args) throws CommandLineUtilException;
}
