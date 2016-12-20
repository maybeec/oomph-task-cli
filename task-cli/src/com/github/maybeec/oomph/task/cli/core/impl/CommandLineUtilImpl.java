/**
 *
 */
package com.github.maybeec.oomph.task.cli.core.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import com.github.maybeec.oomph.task.cli.core.CommandLineUtil;
import com.github.maybeec.oomph.task.cli.core.SetupTaskLogger;
import com.github.maybeec.oomph.task.cli.core.exceptions.CommandLineUtilException;

/**
 * @author sholzer
 *
 */
public class CommandLineUtilImpl implements CommandLineUtil {

  static CommandLineUtil instance;

  public static CommandLineUtil getInstance() {

    if (instance == null) {
      instance = new CommandLineUtilImpl();
    }
    return instance;
  }

  /**
  *
  */
  CommandLineUtilImpl() {
    SetupTaskLogger.getLogger().logInfo("Operating on " + OsUtil.getOsName());
  }

  /*
   * (non-Javadoc)
   *
   * @see cmd.core.CommandLineUtil#execute(java.lang.String)
   */
  public void execute(String dir, String cmd, Iterable<String> args) throws CommandLineUtilException {

    if (dir == null || !new File(dir).exists()) {
      throw new CommandLineUtilException("Please provide a valid working directory. " + dir + " is none");
    }

    if (!new File(dir).isDirectory()) {
      throw new CommandLineUtilException(dir + " is not a directory");
    }

    SetupTaskLogger.getLogger().logInfo("Execute: " + cmd + " " + stringListToLine(args) + " @ " + dir);

    List<String> commands = new LinkedList<String>();

    if (OsUtil.isWindows()) {
      commands.add("CMD");
      commands.add("/C");
    } else {
      // commands.add("sh");
      // commands.add("-c");
    }

    commands.add(cmd);

    for (String s : args) {
      commands.add(s);
    }

    try {
      ProcessBuilder pb = new ProcessBuilder(commands);
      pb.redirectErrorStream(true);
      pb.directory(new File(dir));
      Process process = pb.start();
      BufferedReader inStreamReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

      String line;
      while ((line = inStreamReader.readLine()) != null) {
        SetupTaskLogger.getLogger().log(line);
      }
    } catch (Exception ex) {
      throw new CommandLineUtilException(ex.getMessage(), ex);
    }

  }

  public static String stringListToLine(Iterable<String> list) {

    String result = "";
    for (String s : list) {
      if (result.equals("")) {
        result = s;
      } else {
        result = result + " " + s;
      }
    }
    return result;
  }

}
