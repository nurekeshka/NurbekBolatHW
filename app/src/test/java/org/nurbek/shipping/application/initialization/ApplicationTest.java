package org.nurbek.shipping.application.initialization;

import static org.junit.Assert.fail;

import org.junit.Test;

public class ApplicationTest {
    @Test
    public void applicationTest() {
        try {
            Application.run();
        } catch (Exception exception) {
            fail();
        }
    }
}
