package com.kayako.sdk.helpcenter.articles;

import com.diffblue.deeptestutils.Reflector;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GetArticleListRequesterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: GetArticleListRequester */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 28 branch to line 28
     * conditional line 29 branch to line 29
     * conditional line 30 branch to line 30
     */
    @Test
    public void init() throws Throwable {
        GetArticleListRequester instance;
        {
            /* Arrange */
            String helpCenterUrl = null;
            long sectionId = 7L;
            int offset = -9;
            int limit = 0;
            /* Act */
            /* Creating object to test constructor */
            instance = new GetArticleListRequester(helpCenterUrl, sectionId, offset, limit);
            /* Assert side effects */
            assertEquals(7L, Reflector.getInstanceField(instance, "mSectionId"));
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
            GetArticleListRequester param2 = (GetArticleListRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.articles.GetArticleListRequester");
            Reflector.setField(param2, "mQueryParams", null);
            Reflector.setField(param2, "mHelpCenterUrl", param1);
            Reflector.setField(param2, "mSectionId", 0L);
            /* Act */
            retval = param2.getEndpointUrl();
        }
        {
            /* Assert result */
            assertNotNull(retval);
            assertEquals("/api/v1/articles.json", retval);
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
            GetArticleListRequester param2 = (GetArticleListRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.articles.GetArticleListRequester");
            Reflector.setField(param2, "mQueryParams", null);
            Reflector.setField(param2, "mHelpCenterUrl", param1);
            Reflector.setField(param2, "mSectionId", 0L);
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
            GetArticleListRequester param0 = (GetArticleListRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.articles.GetArticleListRequester");
            Reflector.setField(param0, "mQueryParams", null);
            Reflector.setField(param0, "mHelpCenterUrl", null);
            Reflector.setField(param0, "mSectionId", 0L);
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
            GetArticleListRequester param2 = (GetArticleListRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.articles.GetArticleListRequester");
            Reflector.setField(param2, "mQueryParams", null);
            Reflector.setField(param2, "mHelpCenterUrl", param1);
            Reflector.setField(param2, "mSectionId", 0L);
            /* Act */
            retval = param2.getQueryParameters();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }
}
