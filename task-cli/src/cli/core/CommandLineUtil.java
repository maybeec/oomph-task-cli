/**
 *
 */
package cli.core;

import cli.core.exceptions.CommandLineUtilException;

/**
 * @author sholzer
 *
 */
public interface CommandLineUtil
{
  public void execute(Iterable<String> cmdLine) throws CommandLineUtilException;
}
