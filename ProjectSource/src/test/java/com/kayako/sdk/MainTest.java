package com.kayako.sdk;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertNotNull;

public class MainTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: Main */
    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void init() throws Throwable {
        Main instance;
        {
            /* Act */
            /* Creating object to test constructor */
            instance = new Main();
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

}