package com.kayako.sdk.error;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResponseMessagesTest {

    @org.junit.Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: ResponseMessages */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 59 branch to line 60
     */
    @Test
    public void com_kayako_sdk_error_ResponseMessages_getErrors_000_8e56a20718ed3565() throws Throwable {
        java.util.List<com.kayako.sdk.error.response.Error> retval;
        {
            /* Arrange */
            ResponseMessages param_0 = (ResponseMessages) Reflector.getInstance("com.kayako.sdk.error.ResponseMessages");
            Reflector.setField(param_0, "errors", null);
            Reflector.setField(param_0, "logs", null);
            Reflector.setField(param_0, "notifications", null);
            Reflector.setField(param_0, "statusCode", 0);
            /* Act */
            retval = param_0.getErrors();
        }
        {
            /* Assert result */
            Assert.assertNotNull(retval);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            Assert.assertEquals(arrayList, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 59 branch to line 62
     */
    @Test
    public void com_kayako_sdk_error_ResponseMessages_getErrors_001_5afea52966fb7d63() throws Throwable {
        java.util.List<com.kayako.sdk.error.response.Error> retval;
        {
            /* Arrange */
            com.kayako.sdk.error.response.Error[] dynamic_10_array = new com.kayako.sdk.error.response.Error[] {};
            com.kayako.sdk.error.response.Error[] param_1 = dynamic_10_array;
            java.util.ArrayList param_2 = new java.util.ArrayList();
            ResponseMessages param_3 = (ResponseMessages) Reflector.getInstance("com.kayako.sdk.error.ResponseMessages");
            Reflector.setField(param_3, "errors", param_2);
            Reflector.setField(param_3, "logs", null);
            Reflector.setField(param_3, "notifications", null);
            Reflector.setField(param_3, "statusCode", 0);
            /* Act */
            retval = param_3.getErrors();
        }
        {
            /* Assert result */
            Assert.assertNotNull(retval);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            Assert.assertEquals(arrayList, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 76 branch to line 79
     */
    @Test
    public void com_kayako_sdk_error_ResponseMessages_getLogs_000_2917f3101b704165() throws Throwable {
        java.util.List<com.kayako.sdk.error.response.Log> retval;
        {
            /* Arrange */
            com.kayako.sdk.error.response.Log[] dynamic_22_array = new com.kayako.sdk.error.response.Log[] {};
            com.kayako.sdk.error.response.Log[] param_1 = dynamic_22_array;
            java.util.ArrayList param_2 = new java.util.ArrayList();
            ResponseMessages param_3 = (ResponseMessages) Reflector.getInstance("com.kayako.sdk.error.ResponseMessages");
            Reflector.setField(param_3, "errors", null);
            Reflector.setField(param_3, "logs", param_2);
            Reflector.setField(param_3, "notifications", null);
            Reflector.setField(param_3, "statusCode", 0);
            /* Act */
            retval = param_3.getLogs();
        }
        {
            /* Assert result */
            Assert.assertNotNull(retval);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            Assert.assertEquals(arrayList, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 76 branch to line 77
     */
    @Test
    public void com_kayako_sdk_error_ResponseMessages_getLogs_001_7a9bca3153c711b1() throws Throwable {
        java.util.List<com.kayako.sdk.error.response.Log> retval;
        {
            /* Arrange */
            ResponseMessages param_0 = (ResponseMessages) Reflector.getInstance("com.kayako.sdk.error.ResponseMessages");
            Reflector.setField(param_0, "errors", null);
            Reflector.setField(param_0, "logs", null);
            Reflector.setField(param_0, "notifications", null);
            Reflector.setField(param_0, "statusCode", 0);
            /* Act */
            retval = param_0.getLogs();
        }
        {
            /* Assert result */
            Assert.assertNotNull(retval);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            Assert.assertEquals(arrayList, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 42 branch to line 45
     */
    @Test
    public void com_kayako_sdk_error_ResponseMessages_getNotifications_000_7be0e4295c364ab8() throws Throwable {
        java.util.List<com.kayako.sdk.error.response.Notification> retval;
        {
            /* Arrange */
            com.kayako.sdk.error.response.Notification[] dynamic_2_array = new com.kayako.sdk.error.response.Notification[] {};
            com.kayako.sdk.error.response.Notification[] param_1 = dynamic_2_array;
            java.util.ArrayList param_2 = new java.util.ArrayList();
            ResponseMessages param_3 = (ResponseMessages) Reflector.getInstance("com.kayako.sdk.error.ResponseMessages");
            Reflector.setField(param_3, "errors", null);
            Reflector.setField(param_3, "logs", null);
            Reflector.setField(param_3, "notifications", param_2);
            Reflector.setField(param_3, "statusCode", 0);
            /* Act */
            retval = param_3.getNotifications();
        }
        {
            /* Assert result */
            Assert.assertNotNull(retval);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            Assert.assertEquals(arrayList, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 42 branch to line 43
     */
    @Test
    public void com_kayako_sdk_error_ResponseMessages_getNotifications_001_15558048e795f5b2() throws Throwable {
        java.util.List<com.kayako.sdk.error.response.Notification> retval;
        {
            /* Arrange */
            ResponseMessages param_0 = (ResponseMessages) Reflector.getInstance("com.kayako.sdk.error.ResponseMessages");
            Reflector.setField(param_0, "errors", null);
            Reflector.setField(param_0, "logs", null);
            Reflector.setField(param_0, "notifications", null);
            Reflector.setField(param_0, "statusCode", 0);
            /* Act */
            retval = param_0.getNotifications();
        }
        {
            /* Assert result */
            Assert.assertNotNull(retval);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            Assert.assertEquals(arrayList, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void com_kayako_sdk_error_ResponseMessages_getStatusCode_000_6af5cf85c52fb921() throws Throwable {
        int retval;
        {
            /* Arrange */
            ResponseMessages param_0 = (ResponseMessages) Reflector.getInstance("com.kayako.sdk.error.ResponseMessages");
            Reflector.setField(param_0, "errors", null);
            Reflector.setField(param_0, "logs", null);
            Reflector.setField(param_0, "notifications", null);
            Reflector.setField(param_0, "statusCode", 0);
            /* Act */
            retval = param_0.getStatusCode();
        }
        {
            /* Assert result */
            Assert.assertEquals(0, retval);
        }
    }
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
}
