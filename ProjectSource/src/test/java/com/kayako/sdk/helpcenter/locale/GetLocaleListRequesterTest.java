package com.kayako.sdk.helpcenter.locale;

import com.diffblue.deeptestutils.Reflector;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GetLocaleListRequesterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: GetLocaleListRequester */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void init() throws Throwable {
        GetLocaleListRequester instance;
        {
            /* Arrange */
            String helpCenterUrl = null;
            /* Act */
            /* Creating object to test constructor */
            instance = new GetLocaleListRequester(helpCenterUrl);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getEndpointUrl() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            GetLocaleListRequester param2 = (GetLocaleListRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.locale.GetLocaleListRequester");
            Reflector.setField(param2, "mHelpCenterUrl", param1);
            /* Act */
            retval = param2.getEndpointUrl();
        }
        {
            /* Assert result */
            assertNotNull(retval);
            assertEquals("/api/v1/locales.json", retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getHeaders() throws Throwable {
        Map<String, String> retval;
        {
            /* Arrange */
            String param1 = "";
            GetLocaleListRequester param2 = (GetLocaleListRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.locale.GetLocaleListRequester");
            Reflector.setField(param2, "mHelpCenterUrl", param1);
            /* Act */
            retval = param2.getHeaders();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getHelpCenterUrl() throws Throwable {
        String retval;
        {
            /* Arrange */
            GetLocaleListRequester param0 = (GetLocaleListRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.locale.GetLocaleListRequester");
            Reflector.setField(param0, "mHelpCenterUrl", null);
            /* Act */
            retval = param0.getHelpCenterUrl();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getQueryParameters() throws Throwable {
        Map<String, String> retval;
        {
            /* Arrange */
            String param1 = "";
            GetLocaleListRequester param2 = (GetLocaleListRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.locale.GetLocaleListRequester");
            Reflector.setField(param2, "mHelpCenterUrl", param1);
            /* Act */
            retval = param2.getQueryParameters();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }
}
