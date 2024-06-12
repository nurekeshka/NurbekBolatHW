package org.nurbek.shipping.application.initialization;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.google.inject.Guice;

public class BasicModuleTest {
    @Test
    public void applicationTest() {
        try {
            Guice.createInjector(new BasicModule());
        } catch (Exception exception) {
            fail();
        }
    }
}
