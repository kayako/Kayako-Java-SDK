package com.kayako.sdk.base.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DataNodeParserTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: DataNodeParser */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void init() throws Throwable {
        DataNodeParser instance;
        {
            /* Arrange */
            Parser parser = null;
            /* Act */
            /* Creating object to test constructor */
            instance = new DataNodeParser(parser);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }
}
