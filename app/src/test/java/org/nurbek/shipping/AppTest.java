package org.nurbek.shipping;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void appRuns() {
        String[] args = new String[0];

        try {
            App.main(args);

        } catch (Exception exception) {
            fail();
        }
    }
}
