package com.kayako.sdk.messenger.conversation.fields.team;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TeamParserTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: TeamParser */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void init() throws Throwable {
        TeamParser instance;
        {
            /* Act */
            /* Creating object to test constructor */
            instance = new TeamParser();
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }
}
