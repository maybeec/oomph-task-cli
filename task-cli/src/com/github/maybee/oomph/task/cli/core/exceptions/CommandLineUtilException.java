/**
 *
 */
package com.github.maybee.oomph.task.cli.core.exceptions;

/**
 * @author sholzer
 *
 */
public class CommandLineUtilException extends Exception
{

  /**
   *
   */
  private static final long serialVersionUID = -8113669110977647714L;

  /**
   *
   */
  public CommandLineUtilException()
  {

  }

  /**
   * @param message
   */
  public CommandLineUtilException(String message)
  {
    super(message);
  }

  /**
   * @param cause
   */
  public CommandLineUtilException(Throwable cause)
  {
    super(cause);
  }

  /**
   * @param message
   * @param cause
   */
  public CommandLineUtilException(String message, Throwable cause)
  {
    super(message, cause);
  }

  /**
   * @param message
   * @param cause
   * @param enableSuppression
   * @param writableStackTrace
   */
  public CommandLineUtilException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
  {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
