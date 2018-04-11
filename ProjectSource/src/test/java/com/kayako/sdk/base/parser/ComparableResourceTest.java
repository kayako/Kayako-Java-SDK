package com.kayako.sdk.base.parser;

import com.diffblue.deeptestutils.Reflector;
import com.kayako.sdk.helpcenter.articles.Article;
import com.kayako.sdk.helpcenter.section.Section;
import com.kayako.sdk.helpcenter.user.UserMinimal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ComparableResourceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();



    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 19 branch to line 19
   * conditional line 19 branch to line 21
   */
    @Test
    public void equals() throws Throwable {
        boolean retval;
        {
            /* Arrange */
            Long param11 = (Long) Reflector.getInstance("java.lang.Long");
            Reflector.setField(param11, "value", 0L);
            String param9 = "??????????????????";
            UserMinimal param8 = (UserMinimal) Reflector.getInstance("com.kayako.sdk.helpcenter.user.UserMinimal");
            Reflector.setField(param8, "presenceChannel", null);
            Reflector.setField(param8, "fullName", param9);
            Reflector.setField(param8, "lastSeenAt", null);
            Reflector.setField(param8, "id", null);
            Reflector.setField(param8, "avatarUrl", null);
            Reflector.setField(param8, "lastActiveAt", null);
            String param6 = "??????????????????";
            String param4 = "";
            String param2 = "";
            Article param1 = new Article();
            Reflector.setField(param1, "lastPosted", param11);
            Reflector.setField(param1, "lastUpdated", null);
            Reflector.setField(param1, "author", param8);
            Reflector.setField(param1, "section", null);
            Reflector.setField(param1, "id", null);
            Reflector.setField(param1, "title", param4);
            Reflector.setField(param1, "uuid", param2);
            Reflector.setField(param1, "contents", param6);
            Object obj = null;
            /* Act */
            retval = param1.equals(obj);
        }
        {
            /* Assert result */
            assertEquals(false, retval);
        }
    }

    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 19 branch to line 19
   */
    @Test
    public void equals1() throws Throwable {
        boolean retval;
        {
            /* Arrange */
            Long param13 = (Long) Reflector.getInstance("java.lang.Long");
            Reflector.setField(param13, "value", 0L);
            String param11 = "";
            String param9 = "";
            Long param8 = (Long) Reflector.getInstance("java.lang.Long");
            Reflector.setField(param8, "value", 0L);
            Section param7 = new Section();
            Reflector.setField(param7, "display_order", null);
            Reflector.setField(param7, "category", null);
            Reflector.setField(param7, "id", param8);
            Reflector.setField(param7, "title", param9);
            Reflector.setField(param7, "visibility", null);
            Reflector.setField(param7, "description", param11);
            String param5 = "";
            String param3 = "";
            Article param2 = new Article();
            Reflector.setField(param2, "lastPosted", param13);
            Reflector.setField(param2, "lastUpdated", null);
            Reflector.setField(param2, "author", null);
            Reflector.setField(param2, "section", param7);
            Reflector.setField(param2, "id", null);
            Reflector.setField(param2, "title", param3);
            Reflector.setField(param2, "uuid", null);
            Reflector.setField(param2, "contents", param5);
            Object param0 = new Object();
            Object obj = param0;
            /* Act */
            retval = param2.equals(obj);
        }
        {
            /* Assert result */
            assertEquals(false, retval);
        }
    }

}