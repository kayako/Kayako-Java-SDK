package com.kayako.sdk.messenger.rating;

import com.diffblue.deeptestutils.Reflector;
import java.lang.reflect.Constructor;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Rating_SCORETest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: Rating_SCORE */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void $SCOREclinit() throws Throwable {
        Object constructed;
        {
            /* Act */
            /* Using constructor to test static initializer */
            constructed = Reflector.getInstance("com.kayako.sdk.messenger.rating.Rating$SCORE");
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
        Object instance;
        {
            /* Arrange */
            Long id = null;
            Object score = null;
            String comment = null;
            Long createdAt = null;
            Long updatedAt = null;
            /* Act */
            /* Creating object to test constructor */
            Class<?> c = Reflector.forName("com.kayako.sdk.messenger.rating.Rating");
            Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("java.lang.Long"), Reflector.forName("com.kayako.sdk.messenger.rating.Rating$SCORE"), Reflector.forName("java.lang.String"), Reflector.forName("java.lang.Long"), Reflector.forName("java.lang.Long"));
            ctor.setAccessible(true);
            instance = ctor.newInstance(id, score, comment, createdAt, updatedAt);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getComment() throws Throwable {
        String retval;
        {
            /* Arrange */
            Rating param0 = (Rating) Reflector.getInstance("com.kayako.sdk.messenger.rating.Rating");
            Reflector.setField(param0, "updatedAt", null);
            Reflector.setField(param0, "score", null);
            Reflector.setField(param0, "comment", null);
            Reflector.setField(param0, "id", null);
            Reflector.setField(param0, "createdAt", null);
            /* Act */
            retval = param0.getComment();
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
    public void getCreatedAt() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            Rating param2 = (Rating) Reflector.getInstance("com.kayako.sdk.messenger.rating.Rating");
            Reflector.setField(param2, "updatedAt", null);
            Reflector.setField(param2, "score", null);
            Reflector.setField(param2, "comment", param1);
            Reflector.setField(param2, "id", null);
            Reflector.setField(param2, "createdAt", null);
            /* Act */
            retval = param2.getCreatedAt();
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
            Rating param2 = (Rating) Reflector.getInstance("com.kayako.sdk.messenger.rating.Rating");
            Reflector.setField(param2, "updatedAt", null);
            Reflector.setField(param2, "score", null);
            Reflector.setField(param2, "comment", param1);
            Reflector.setField(param2, "id", null);
            Reflector.setField(param2, "createdAt", null);
            /* Act */
            retval = param2.getId();
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
    public void getScore() throws Throwable {
        Object retval;
        {
            /* Arrange */
            String param1 = "";
            Rating param2 = (Rating) Reflector.getInstance("com.kayako.sdk.messenger.rating.Rating");
            Reflector.setField(param2, "updatedAt", null);
            Reflector.setField(param2, "score", null);
            Reflector.setField(param2, "comment", param1);
            Reflector.setField(param2, "id", null);
            Reflector.setField(param2, "createdAt", null);
            /* Act */
            retval = param2.getScore();
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
    public void getUpdatedAt() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            Rating param2 = (Rating) Reflector.getInstance("com.kayako.sdk.messenger.rating.Rating");
            Reflector.setField(param2, "updatedAt", null);
            Reflector.setField(param2, "score", null);
            Reflector.setField(param2, "comment", param1);
            Reflector.setField(param2, "id", null);
            Reflector.setField(param2, "createdAt", null);
            /* Act */
            retval = param2.getUpdatedAt();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }
}
