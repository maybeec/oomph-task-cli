package com.github.maybeec.oomph.task.cli.core.impl;

/**
 * A class to provide the os type
 * @author sholzer (31.05.2016)
 */
public class OsUtil
{

  /**
   * The name of the current OS in lower cases
   */
  private final static String OS = System.getProperty("os.name").toLowerCase();

  /**
   * @return true iff the system property 'os.name' contains 'win'
   * @author sholzer (31.05.2016)
   */
  static boolean isWindows()
  {
    if (OS.contains("win"))
    {
      return true;
    }
    return false;
  }

  /**
   * @return the string representation of the system property 'os.name'
   * @author sholzer (31.05.2016)
   */
  static String getOsName()
  {
    return OS;
  }

}
