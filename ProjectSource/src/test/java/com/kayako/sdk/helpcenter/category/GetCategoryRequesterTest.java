package com.kayako.sdk.helpcenter.category;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GetCategoryRequesterTest {

    @org.junit.Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: GetCategoryRequester */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_helpcenter_category_GetCategoryRequester_getHeaders_000_1a5b034fa514e844() throws Throwable {
        java.util.Map<String, String> retval;
        {
            /* Arrange */
            String param_1 = "";
            GetCategoryRequester param_2 = (GetCategoryRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.category.GetCategoryRequester");
            Reflector.setField(param_2, "mCategoryId", 0L);
            Reflector.setField(param_2, "mHelpDeskUrl", param_1);
            /* Act */
            retval = param_2.getHeaders();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_helpcenter_category_GetCategoryRequester_getHelpCenterUrl_000_8df5763c29a1ff82() throws Throwable {
        String retval;
        {
            /* Arrange */
            GetCategoryRequester param_0 = (GetCategoryRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.category.GetCategoryRequester");
            Reflector.setField(param_0, "mCategoryId", 0L);
            Reflector.setField(param_0, "mHelpDeskUrl", null);
            /* Act */
            retval = param_0.getHelpCenterUrl();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_helpcenter_category_GetCategoryRequester_getQueryParameters_000_691e901cf7b492e6() throws Throwable {
        java.util.Map<String, String> retval;
        {
            /* Arrange */
            String param_1 = "";
            GetCategoryRequester param_2 = (GetCategoryRequester) Reflector.getInstance("com.kayako.sdk.helpcenter.category.GetCategoryRequester");
            Reflector.setField(param_2, "mCategoryId", 0L);
            Reflector.setField(param_2, "mHelpDeskUrl", param_1);
            /* Act */
            retval = param_2.getQueryParameters();
        }
        {
            /* Assert result */
            Assert.assertEquals(null, retval);
        }
    }
}
