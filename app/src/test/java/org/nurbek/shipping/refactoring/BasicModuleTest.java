package org.nurbek.shipping.refactoring;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.nurbek.inject.Guice;
import org.nurbek.shipping.refactoring.initialization.BasicModule;

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
