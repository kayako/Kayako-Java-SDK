package com.kayako.sdk.utils;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LocaleUtilsTest {

    @org.junit.Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: LocaleUtils */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * This test covers `String getLanguage(String)' block 2 (line 11)
     * This test covers `String getLanguage(String)' block 3 (line 11)
     * This test covers `String getLanguage(String)' block 4 (line 11)
     * This test covers `String getLanguage(String)' block 5 (line 11)
     * This test covers `String getLanguage(String)' block 6 (line 12)
     * This test covers `String getLanguage(String)' block 7 (line 12)
     * This test covers `String getLanguage(String)' block 8 (line 12)
     * This test covers `String getLanguage(String)' block 9 (line 12)
     * This test covers `String getLanguage(String)' block 11 (line 12)
     * This test covers `String getLanguage(String)' block 12 (line 13)
     */
    @Test
    public void com_kayako_sdk_utils_LocaleUtils_getLanguage_000_242e4ebfc55efe39() throws Throwable {
        String retval;
        {
            /* Arrange */
            String localeCode = null;
            /* Act */
            thrown.expect(NullPointerException.class);
            retval = LocaleUtils.getLanguage(localeCode);
        /* Method return type is void, or not expected to return */
        }
    }
}
