package com.kayako.sdk.utils;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertNotNull;

public class LogUtilsTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: LogUtils */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void clinit() throws Throwable {
        Object constructed;
        {
            /* Act */
            /* Using constructor to test static initializer */
            constructed = Reflector.getInstance("com.kayako.sdk.utils.LogUtils");
            assertNotNull(constructed);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void init() throws Throwable {
        LogUtils instance;
        {
            /* Act */
            /* Creating object to test constructor */
            instance = new LogUtils();
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

}
