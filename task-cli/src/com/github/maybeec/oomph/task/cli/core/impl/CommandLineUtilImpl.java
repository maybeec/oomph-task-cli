/**
 *
 */
package com.github.maybeec.oomph.task.cli.core.impl;

import com.github.maybeec.oomph.task.cli.core.CommandLineUtil;
import com.github.maybeec.oomph.task.cli.core.SetupTaskLogger;
import com.github.maybeec.oomph.task.cli.core.exceptions.CommandLineUtilException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * @author sholzer
 *
 */
public class CommandLineUtilImpl implements CommandLineUtil
{

  static CommandLineUtil instance;

  public static CommandLineUtil getInstance()
  {
    if (instance == null)
    {
      instance = new CommandLineUtilImpl();
    }
    return instance;
  }

  /**
   *
   */
  private CommandLineUtilImpl()
  {
    SetupTaskLogger.getLogger().logInfo("Operating on " + OsUtil.getOsName());
  }

  /*
   * (non-Javadoc)
   * @see cmd.core.CommandLineUtil#execute(java.lang.String)
   */
  public void execute(Iterable<String> cmdLine) throws CommandLineUtilException
  {
    SetupTaskLogger.getLogger().logInfo("Execute: " + stringListToLine(cmdLine));

    List<String> commands = new LinkedList<String>();

    if (OsUtil.isWindows())
    {
      commands.add("CMD");
      commands.add("/C");
    }
    else
    {
      // I haven't found a necessary prefix as it is needed for windows. Maybe this just magically works
    }

    for (String s : cmdLine)
    {
      commands.add(s);
    }

    try
    {
      SetupTaskLogger.getLogger().log("Passing '" + stringListToLine(commands) + "' to ProcessBuilder");
      ProcessBuilder pb = new ProcessBuilder(commands);
      pb.redirectErrorStream(true);

      Process process = pb.start();
      BufferedReader inStreamReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

      String line;
      while ((line = inStreamReader.readLine()) != null)
      {
        SetupTaskLogger.getLogger().log(line);
      }
    }
    catch (Exception ex)
    {
      throw new CommandLineUtilException(ex.getMessage());
    }

  }

  public static String stringListToLine(Iterable<String> list)
  {
    String result = "";
    for (String s : list)
    {
      result = result + " " + s;
    }
    return result;
  }

}
