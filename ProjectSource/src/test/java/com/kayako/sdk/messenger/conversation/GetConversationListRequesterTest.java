package com.kayako.sdk.messenger.conversation;

import com.diffblue.deeptestutils.Reflector;
import com.kayako.sdk.auth.FingerprintAuth;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GetConversationListRequesterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: GetConversationListRequester */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 29 branch to line 29
     * conditional line 30 branch to line 30
     */
    @Test
    public void init() throws Throwable {
        GetConversationListRequester instance;
        {
            /* Arrange */
            String param3 = "??????????";
            String helpdeskUrl = param3;
            FingerprintAuth fingerprintAuth = null;
            int offset = 7;
            int limit = 0;
            /* Act */
            /* Creating object to test constructor */
            instance = new GetConversationListRequester(helpdeskUrl, fingerprintAuth, offset, limit);
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
            GetConversationListRequester param2 = (GetConversationListRequester) Reflector.getInstance("com.kayako.sdk.messenger.conversation.GetConversationListRequester");
            Reflector.setField(param2, "mQueryParameters", null);
            Reflector.setField(param2, "mFingerprintAuth", null);
            Reflector.setField(param2, "mHelpdeskUrl", param1);
            /* Act */
            retval = param2.getEndpointUrl();
        }
        {
            /* Assert result */
            assertNotNull(retval);
            assertEquals("api/v1/conversations", retval);
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
            FingerprintAuth param0 = (FingerprintAuth) Reflector.getInstance("com.kayako.sdk.auth.FingerprintAuth");
            param0.setFingerprintId(null);
            GetConversationListRequester param1 = (GetConversationListRequester) Reflector.getInstance("com.kayako.sdk.messenger.conversation.GetConversationListRequester");
            Reflector.setField(param1, "mQueryParameters", null);
            Reflector.setField(param1, "mFingerprintAuth", param0);
            Reflector.setField(param1, "mHelpdeskUrl", null);
            /* Act */
            retval = param1.getHeaders();
        }
        {
            /* Assert result */
            assertNotNull(retval);
            HashMap hashMap = new HashMap();
            hashMap.put("X-Fingerprint-ID", null);
            assertEquals(hashMap, retval);
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
            GetConversationListRequester param0 = (GetConversationListRequester) Reflector.getInstance("com.kayako.sdk.messenger.conversation.GetConversationListRequester");
            Reflector.setField(param0, "mQueryParameters", null);
            Reflector.setField(param0, "mFingerprintAuth", null);
            Reflector.setField(param0, "mHelpdeskUrl", null);
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
            GetConversationListRequester param2 = (GetConversationListRequester) Reflector.getInstance("com.kayako.sdk.messenger.conversation.GetConversationListRequester");
            Reflector.setField(param2, "mQueryParameters", null);
            Reflector.setField(param2, "mFingerprintAuth", null);
            Reflector.setField(param2, "mHelpdeskUrl", param1);
            /* Act */
            retval = param2.getQueryParameters();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }
}
