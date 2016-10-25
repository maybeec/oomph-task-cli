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
    public void execute(String dir, String cmd, Iterable<String> args) throws CommandLineUtilException;
}
