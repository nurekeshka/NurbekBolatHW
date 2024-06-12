package org.nurbek.shipping.application.initialization;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import org.nurbek.shipping.domain.models.Order;
import org.nurbek.shipping.infrastructure.managers.ShippingManager;
import org.nurbek.shipping.mocks.MocksRepository;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ApplicationTest {
    private Order order = MocksRepository.getOrder();
    private Injector injector;

    @Before
    public void init() {
        this.injector = Guice.createInjector(new BasicModule());
    }

    @Test
    public void applicationTest() {
        ShippingManager shippingManager = this.injector.getInstance(ShippingManager.class);

        shippingManager.setOrder(order);
        assertEquals(0, 0, 0);
    }
}
