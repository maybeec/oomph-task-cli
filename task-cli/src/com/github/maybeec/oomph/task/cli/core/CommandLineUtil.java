/**
 *
 */
package com.github.maybeec.oomph.task.cli.core;

import com.github.maybeec.oomph.task.cli.core.exceptions.CommandLineUtilException;

/**
 * @author sholzer
 *
 */
public interface CommandLineUtil
{
  public void execute(Iterable<String> cmdLine) throws CommandLineUtilException;
}
