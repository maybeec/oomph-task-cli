package com.github.maybeec.oomph.task.cli.core.impl;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.github.maybeec.oomph.task.cli.core.CommandLineUtil;

/**
 *
 * @author sholzer (18.10.2016)
 */
public class CLIUtilTest {

    public CommandLineUtil test;

    public static final String resources = "./test/resources/";

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
            System.out.println("Skipped Linux dependant test");
            return;
        }

        List<String> commands = new LinkedList<String>();
        commands.add("cat");
        commands.add(">");
        commands.add("foo.txt");

        test.execute(commands);

        File footxt = new File(resources + "foo.txt");

        assertTrue("file not created", footxt.exists());

    }

    @AfterClass
    public static void afterClass() {
        File footxt = new File(resources + "foo.txt");
        if (footxt.exists()) {
            footxt.delete();
        }
    }

}
