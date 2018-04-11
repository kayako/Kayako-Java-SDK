package com.kayako.sdk.error.response;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ErrorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: Error */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void init() throws Throwable {
        Error instance;
        {
            /* Arrange */
            String code = null;
            String message = null;
            String moreInfo = null;
            String parameter = null;
            /* Act */
            /* Creating object to test constructor */
            instance = new Error(code, message, moreInfo, parameter);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void init1() throws Throwable {
        Error instance;
        {
            /* Arrange */
            String code = null;
            String message = null;
            String moreInfo = null;
            /* Act */
            /* Creating object to test constructor */
            instance = new Error(code, message, moreInfo);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void init2() throws Throwable {
        Error instance;
        {
            /* Arrange */
            String code = null;
            String message = null;
            String moreInfo = null;
            List<String> parameters = null;
            /* Act */
            /* Creating object to test constructor */
            instance = new Error(code, message, moreInfo, parameters);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getResponseMessageType() throws Throwable {
        Type retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            String param7 = "";
            Error param8 = (Error) Reflector.getInstance("com.kayako.sdk.error.response.Error");
            param8.moreInfo = param1;
            ;
            param8.code = param7;
            ;
            param8.message = param3;
            ;
            param8.parameter = param5;
            ;
            param8.parameters = null;
            ;
            /* Act */
            retval = param8.getResponseMessageType();
        }
        {
            /* Assert result */
            assertNotNull(retval);
            assertNotNull(((String) Reflector.getInstanceField(retval, "name")));
            assertEquals("ERROR", ((String) Reflector.getInstanceField(retval, "name")));
            assertEquals(0, Reflector.getInstanceField(retval, "ordinal"));
        }
    }
}
