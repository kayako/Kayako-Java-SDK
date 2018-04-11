package com.kayako.sdk.helpcenter.user;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UserMinimalTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: UserMinimal */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void init() throws Throwable {
        UserMinimal instance;
        {
            /* Arrange */
            Long id = null;
            String fullName = null;
            String avatarUrl = null;
            Long lastActiveAt = null;
            Long lastSeenAt = null;
            String presenceChannel = null;
            /* Act */
            /* Creating object to test constructor */
            instance = new UserMinimal(id, fullName, avatarUrl, lastActiveAt, lastSeenAt, presenceChannel);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getAvatarUrl() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            UserMinimal param4 = (UserMinimal) Reflector.getInstance("com.kayako.sdk.helpcenter.user.UserMinimal");
            Reflector.setField(param4, "presenceChannel", param1);
            param4.setFullName(param3);
            param4.setLastSeenAt(null);
            param4.setId(null);
            param4.setAvatarUrl(null);
            param4.setLastActiveAt(null);
            /* Act */
            retval = param4.getAvatarUrl();
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
    public void getFullName() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            UserMinimal param4 = (UserMinimal) Reflector.getInstance("com.kayako.sdk.helpcenter.user.UserMinimal");
            Reflector.setField(param4, "presenceChannel", param1);
            param4.setFullName(null);
            param4.setLastSeenAt(null);
            param4.setId(null);
            param4.setAvatarUrl(param3);
            param4.setLastActiveAt(null);
            /* Act */
            retval = param4.getFullName();
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
    public void getId() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            UserMinimal param6 = (UserMinimal) Reflector.getInstance("com.kayako.sdk.helpcenter.user.UserMinimal");
            Reflector.setField(param6, "presenceChannel", param1);
            param6.setFullName(param5);
            param6.setLastSeenAt(null);
            param6.setId(null);
            param6.setAvatarUrl(param3);
            param6.setLastActiveAt(null);
            /* Act */
            retval = param6.getId();
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
    public void getLastActiveAt() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            UserMinimal param6 = (UserMinimal) Reflector.getInstance("com.kayako.sdk.helpcenter.user.UserMinimal");
            Reflector.setField(param6, "presenceChannel", param1);
            param6.setFullName(param5);
            param6.setLastSeenAt(null);
            param6.setId(null);
            param6.setAvatarUrl(param3);
            param6.setLastActiveAt(null);
            /* Act */
            retval = param6.getLastActiveAt();
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
    public void getLastSeenAt() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            UserMinimal param6 = (UserMinimal) Reflector.getInstance("com.kayako.sdk.helpcenter.user.UserMinimal");
            Reflector.setField(param6, "presenceChannel", param1);
            param6.setFullName(param5);
            param6.setLastSeenAt(null);
            param6.setId(null);
            param6.setAvatarUrl(param3);
            param6.setLastActiveAt(null);
            /* Act */
            retval = param6.getLastSeenAt();
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
    public void getPresenceChannel() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            UserMinimal param4 = (UserMinimal) Reflector.getInstance("com.kayako.sdk.helpcenter.user.UserMinimal");
            Reflector.setField(param4, "presenceChannel", null);
            param4.setFullName(param3);
            param4.setLastSeenAt(null);
            param4.setId(null);
            param4.setAvatarUrl(param1);
            param4.setLastActiveAt(null);
            /* Act */
            retval = param4.getPresenceChannel();
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
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
}
