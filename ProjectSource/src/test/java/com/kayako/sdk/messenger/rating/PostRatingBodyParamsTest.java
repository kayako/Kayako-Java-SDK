package com.kayako.sdk.messenger.rating;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Constructor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PostRatingBodyParamsTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: PostRatingBodyParams */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 27 branch to line 30
     */
    @Test
    public void init() throws Throwable {
        Object instance;
        {
            /* Arrange */
            Object param2 = Reflector.getInstance("com.kayako.sdk.messenger.rating.Rating$SCORE");
            Reflector.setField(param2, "name", null);
            Reflector.setField(param2, "ordinal", 0);
            Object score = param2;
            String comment = null;
            /* Act */
            /* Creating object to test constructor */
            Class<?> c = Reflector.forName("com.kayako.sdk.messenger.rating.PostRatingBodyParams");
            Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("com.kayako.sdk.messenger.rating.Rating$SCORE"), Reflector.forName("java.lang.String"));
            ctor.setAccessible(true);
            instance = ctor.newInstance(score, comment);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 18 branch to line 21
     */
    @Test
    public void init1() throws Throwable {
        Object instance;
        {
            /* Arrange */
            Object param0 = Reflector.getInstance("com.kayako.sdk.messenger.rating.Rating$SCORE");
            Reflector.setField(param0, "name", null);
            Reflector.setField(param0, "ordinal", 0);
            Object score = param0;
            /* Act */
            /* Creating object to test constructor */
            Class<?> c = Reflector.forName("com.kayako.sdk.messenger.rating.PostRatingBodyParams");
            Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("com.kayako.sdk.messenger.rating.Rating$SCORE"));
            ctor.setAccessible(true);
            instance = ctor.newInstance(score);
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
            PostRatingBodyParams param0 = (PostRatingBodyParams) Reflector.getInstance("com.kayako.sdk.messenger.rating.PostRatingBodyParams");
            Reflector.setField(param0, "comment", null);
            Reflector.setField(param0, "score", null);
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
    public void getScore() throws Throwable {
        Object retval;
        {
            /* Arrange */
            String param1 = "";
            PostRatingBodyParams param2 = (PostRatingBodyParams) Reflector.getInstance("com.kayako.sdk.messenger.rating.PostRatingBodyParams");
            Reflector.setField(param2, "comment", param1);
            Reflector.setField(param2, "score", null);
            /* Act */
            retval = param2.getScore();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }
}
