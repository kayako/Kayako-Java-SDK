package com.kayako.sdk.messenger.attachment;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ThumbnailTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: Thumbnail */
    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void init() throws Throwable {
        Thumbnail instance;
        {
            /* Arrange */
            String name = null;
            Long size = null;
            Long width = null;
            Long height = null;
            String type = null;
            String url = null;
            Long createdAt = null;
            /* Act */
            /* Creating object to test constructor */
            instance = new Thumbnail(name, size, width, height, type, url, createdAt);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void getCreatedAt() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            Thumbnail param6 = (Thumbnail) Reflector.getInstance("com.kayako.sdk.messenger.attachment.Thumbnail");
            Reflector.setField(param6, "createdAt", null);
            Reflector.setField(param6, "url", param1);
            Reflector.setField(param6, "name", param5);
            Reflector.setField(param6, "width", null);
            Reflector.setField(param6, "type", param3);
            Reflector.setField(param6, "size", null);
            Reflector.setField(param6, "height", null);
            /* Act */
            retval = param6.getCreatedAt();
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
    public void getHeight() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            Thumbnail param6 = (Thumbnail) Reflector.getInstance("com.kayako.sdk.messenger.attachment.Thumbnail");
            Reflector.setField(param6, "createdAt", null);
            Reflector.setField(param6, "url", param1);
            Reflector.setField(param6, "name", param5);
            Reflector.setField(param6, "width", null);
            Reflector.setField(param6, "type", param3);
            Reflector.setField(param6, "size", null);
            Reflector.setField(param6, "height", null);
            /* Act */
            retval = param6.getHeight();
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
    public void getName() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            Thumbnail param4 = (Thumbnail) Reflector.getInstance("com.kayako.sdk.messenger.attachment.Thumbnail");
            Reflector.setField(param4, "createdAt", null);
            Reflector.setField(param4, "url", param1);
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "width", null);
            Reflector.setField(param4, "type", param3);
            Reflector.setField(param4, "size", null);
            Reflector.setField(param4, "height", null);
            /* Act */
            retval = param4.getName();
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
    public void getSize() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            Thumbnail param6 = (Thumbnail) Reflector.getInstance("com.kayako.sdk.messenger.attachment.Thumbnail");
            Reflector.setField(param6, "createdAt", null);
            Reflector.setField(param6, "url", param1);
            Reflector.setField(param6, "name", param5);
            Reflector.setField(param6, "width", null);
            Reflector.setField(param6, "type", param3);
            Reflector.setField(param6, "size", null);
            Reflector.setField(param6, "height", null);
            /* Act */
            retval = param6.getSize();
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
    public void getType() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            Thumbnail param4 = (Thumbnail) Reflector.getInstance("com.kayako.sdk.messenger.attachment.Thumbnail");
            Reflector.setField(param4, "createdAt", null);
            Reflector.setField(param4, "url", param1);
            Reflector.setField(param4, "name", param3);
            Reflector.setField(param4, "width", null);
            Reflector.setField(param4, "type", null);
            Reflector.setField(param4, "size", null);
            Reflector.setField(param4, "height", null);
            /* Act */
            retval = param4.getType();
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
    public void getUrl() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            Thumbnail param4 = (Thumbnail) Reflector.getInstance("com.kayako.sdk.messenger.attachment.Thumbnail");
            Reflector.setField(param4, "createdAt", null);
            Reflector.setField(param4, "url", null);
            Reflector.setField(param4, "name", param3);
            Reflector.setField(param4, "width", null);
            Reflector.setField(param4, "type", param1);
            Reflector.setField(param4, "size", null);
            Reflector.setField(param4, "height", null);
            /* Act */
            retval = param4.getUrl();
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
    public void getWidth() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            Thumbnail param6 = (Thumbnail) Reflector.getInstance("com.kayako.sdk.messenger.attachment.Thumbnail");
            Reflector.setField(param6, "createdAt", null);
            Reflector.setField(param6, "url", param1);
            Reflector.setField(param6, "name", param5);
            Reflector.setField(param6, "width", null);
            Reflector.setField(param6, "type", param3);
            Reflector.setField(param6, "size", null);
            Reflector.setField(param6, "height", null);
            /* Act */
            retval = param6.getWidth();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }
}