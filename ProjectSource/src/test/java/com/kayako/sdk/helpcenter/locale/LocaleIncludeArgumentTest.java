package com.kayako.sdk.helpcenter.locale;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertNotNull;

public class LocaleIncludeArgumentTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: LocaleIncludeArgument */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void clinit() throws Throwable {
        Object constructed;
        {
            /* Act */
            /* Using constructor to test static initializer */
            constructed = Reflector.getInstance("com.kayako.sdk.helpcenter.locale.LocaleIncludeArgument");
            assertNotNull(constructed);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 16 branch to line 16
     */
    @Test
    public void init() throws Throwable {
        LocaleIncludeArgument instance;
        {
            /* Act */
            /* Creating object to test constructor */
            instance = new LocaleIncludeArgument();
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }
}
