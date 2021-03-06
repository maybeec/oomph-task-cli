package com.github.maybeec.oomph.task.cli.core.impl;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.maybeec.oomph.task.cli.core.CommandLineUtil;

/**
 *
 * @author sholzer (18.10.2016)
 */
public class CLIUtilTest {

    public CommandLineUtil test;

    public static final String resources = "test/resources/";

    public static final String linuxResources = resources + "linux/";

    public static final String winResources = resources + "win/";

    public static final String executeOnLinux = linuxResources + "folder";

    public static final String executeOnWin = winResources + "folder";

    @BeforeClass
    public static void beforeClass() {
        new File(linuxResources).mkdirs();
        new File(winResources).mkdirs();
        afterClass();
    }

    /**
     * @throws java.lang.Exception
     * @author sholzer (18.10.2016)
     */
    @Before
    public void setUp() throws Exception {
        test = new CommandLineUtilImpl();
    }

    /**
     * Test method for
     * {@link com.github.maybeec.oomph.task.cli.core.impl.CommandLineUtilImpl#execute(java.lang.Iterable)}.
     * @throws Exception
     */
    @Test
    public void testExecuteOnLinux() throws Exception {

        if (OsUtil.isWindows()) {
            System.out.println("----------Skipped Linux dependent test-------------");
            return;
        }

        List<String> commands = new LinkedList<String>();
        commands.add("folder");

        test.execute(linuxResources, "mkdir", commands);

        File footxt = new File(executeOnLinux);

        assertTrue("file not created", footxt.exists());

    }

    @Test
    public void testExecuteOnWin() throws Exception {
        if (!OsUtil.isWindows()) {
            System.out.println("----------Skipped Windows dependent test-------------");
            return;
        }

        List<String> commands = new LinkedList<String>();
        commands.add("folder");
        test.execute(new File(winResources).getAbsolutePath(), "mkdir", commands);

        File folder = new File(executeOnWin);
        assertTrue("file not created", folder.exists());
    }

    @Test
    public void testWinWhiteSpacePath() throws Exception {
        if (!OsUtil.isWindows()) {
            System.out.println("----------Skipped Windows dependent test-------------");
            return;
        }
        Path target = Paths.get(winResources + "new folder");
        Files.createDirectories(target);

    }

    @AfterClass
    public static void afterClass() {
        delFile(executeOnLinux);
        delFile(executeOnWin);
    }

    public static void delFile(String path) {
        File testExecuteOnLinux = new File(path);
        if (testExecuteOnLinux.exists()) {
            testExecuteOnLinux.delete();
        }
    }

}
