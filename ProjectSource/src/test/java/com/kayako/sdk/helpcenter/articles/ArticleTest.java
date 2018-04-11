package com.kayako.sdk.helpcenter.articles;

import com.diffblue.deeptestutils.Reflector;
import com.kayako.sdk.helpcenter.section.Section;
import com.kayako.sdk.helpcenter.user.UserMinimal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ArticleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: Article */
    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void init() throws Throwable {
        Article instance;
        {
            /* Act */
            /* Creating object to test constructor */
            instance = new Article();
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void getAuthor() throws Throwable {
        UserMinimal retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            Long param6 = (Long) Reflector.getInstance("java.lang.Long");
            Reflector.setField(param6, "value", 0L);
            Article param7 = new Article();
            Reflector.setField(param7, "lastPosted", null);
            Reflector.setField(param7, "lastUpdated", null);
            Reflector.setField(param7, "author", null);
            Reflector.setField(param7, "section", null);
            Reflector.setField(param7, "id", param6);
            Reflector.setField(param7, "title", param3);
            Reflector.setField(param7, "uuid", param5);
            Reflector.setField(param7, "contents", param1);
            /* Act */
            retval = param7.getAuthor();
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
    public void getContents() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            Article param4 = new Article();
            Reflector.setField(param4, "lastPosted", null);
            Reflector.setField(param4, "lastUpdated", null);
            Reflector.setField(param4, "author", null);
            Reflector.setField(param4, "section", null);
            Reflector.setField(param4, "id", null);
            Reflector.setField(param4, "title", param1);
            Reflector.setField(param4, "uuid", param3);
            Reflector.setField(param4, "contents", null);
            /* Act */
            retval = param4.getContents();
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
            Article param6 = new Article();
            Reflector.setField(param6, "lastPosted", null);
            Reflector.setField(param6, "lastUpdated", null);
            Reflector.setField(param6, "author", null);
            Reflector.setField(param6, "section", null);
            Reflector.setField(param6, "id", null);
            Reflector.setField(param6, "title", param3);
            Reflector.setField(param6, "uuid", param5);
            Reflector.setField(param6, "contents", param1);
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
    public void getLastPosted() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            Long param6 = (Long) Reflector.getInstance("java.lang.Long");
            Reflector.setField(param6, "value", 0L);
            Article param7 = new Article();
            Reflector.setField(param7, "lastPosted", null);
            Reflector.setField(param7, "lastUpdated", null);
            Reflector.setField(param7, "author", null);
            Reflector.setField(param7, "section", null);
            Reflector.setField(param7, "id", param6);
            Reflector.setField(param7, "title", param3);
            Reflector.setField(param7, "uuid", param5);
            Reflector.setField(param7, "contents", param1);
            /* Act */
            retval = param7.getLastPosted();
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
    public void getLastUpdated() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            Article param6 = new Article();
            Reflector.setField(param6, "lastPosted", null);
            Reflector.setField(param6, "lastUpdated", null);
            Reflector.setField(param6, "author", null);
            Reflector.setField(param6, "section", null);
            Reflector.setField(param6, "id", null);
            Reflector.setField(param6, "title", param3);
            Reflector.setField(param6, "uuid", param5);
            Reflector.setField(param6, "contents", param1);
            /* Act */
            retval = param6.getLastUpdated();
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
    public void getSection() throws Throwable {
        Section retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            Article param6 = new Article();
            Reflector.setField(param6, "lastPosted", null);
            Reflector.setField(param6, "lastUpdated", null);
            Reflector.setField(param6, "author", null);
            Reflector.setField(param6, "section", null);
            Reflector.setField(param6, "id", null);
            Reflector.setField(param6, "title", param3);
            Reflector.setField(param6, "uuid", param5);
            Reflector.setField(param6, "contents", param1);
            /* Act */
            retval = param6.getSection();
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
    public void getTitle() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            Article param4 = new Article();
            Reflector.setField(param4, "lastPosted", null);
            Reflector.setField(param4, "lastUpdated", null);
            Reflector.setField(param4, "author", null);
            Reflector.setField(param4, "section", null);
            Reflector.setField(param4, "id", null);
            Reflector.setField(param4, "title", null);
            Reflector.setField(param4, "uuid", param3);
            Reflector.setField(param4, "contents", param1);
            /* Act */
            retval = param4.getTitle();
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
    public void getUuid() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            Article param4 = new Article();
            Reflector.setField(param4, "lastPosted", null);
            Reflector.setField(param4, "lastUpdated", null);
            Reflector.setField(param4, "author", null);
            Reflector.setField(param4, "section", null);
            Reflector.setField(param4, "id", null);
            Reflector.setField(param4, "title", param3);
            Reflector.setField(param4, "uuid", null);
            Reflector.setField(param4, "contents", param1);
            /* Act */
            retval = param4.getUuid();
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