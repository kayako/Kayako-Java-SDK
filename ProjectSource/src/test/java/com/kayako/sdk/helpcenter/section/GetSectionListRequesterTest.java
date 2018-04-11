package com.kayako.sdk.helpcenter.section;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Constructor;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GetSectionListRequesterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: GetSectionListRequester */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 29 branch to line 29
     * conditional line 30 branch to line 30
     * conditional line 31 branch to line 31
     */
    @Test
    public void init() throws Throwable {
        GetSectionListRequester instance;
        {
            /* Arrange */
            String helpCenterUrl = null;
            long categoryId = 0L;
            int offset = 9;
            int limit = 0;
            /* Act */
            /* Creating object to test constructor */
            instance = new GetSectionListRequester(helpCenterUrl, categoryId, offset, limit);
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
        Object instance;
        {
            /* Act */
            /* Creating object to test constructor */
            Class<?> c = Reflector.forName("com.kayako.sdk.helpcenter.section.GetSectionListRequester");
            Constructor<?> ctor = c.getDeclaredConstructor();
            ctor.setAccessible(true);
            instance = ctor.newInstance();
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
            GetSectionListRequester param2 = (GetSectionListRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.section.GetSectionListRequester");
            Reflector.setField(param2, "mQueryParams", null);
            Reflector.setField(param2, "mCategoryId", 0L);
            Reflector.setField(param2, "mHelpCenterUrl", param1);
            /* Act */
            retval = param2.getEndpointUrl();
        }
        {
            /* Assert result */
            assertNotNull(retval);
            assertEquals("/api/v1/sections.json", retval);
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
            GetSectionListRequester param2 = (GetSectionListRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.section.GetSectionListRequester");
            Reflector.setField(param2, "mQueryParams", null);
            Reflector.setField(param2, "mCategoryId", 0L);
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
            GetSectionListRequester param0 = (GetSectionListRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.section.GetSectionListRequester");
            Reflector.setField(param0, "mQueryParams", null);
            Reflector.setField(param0, "mCategoryId", 0L);
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
            GetSectionListRequester param2 = (GetSectionListRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.section.GetSectionListRequester");
            Reflector.setField(param2, "mQueryParams", null);
            Reflector.setField(param2, "mCategoryId", 0L);
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
