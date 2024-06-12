package org.nurbek.shipping.infrastructure.managers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import org.nurbek.shipping.application.initialization.BasicModule;
import org.nurbek.shipping.domain.models.Order;
import org.nurbek.shipping.mocks.MocksRepository;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ShippingManagerTest {
    private Injector injector;
    private ShippingManager shippingManager;
    private Order order = MocksRepository.getOrder();

    @Before
    public void init() {
        this.injector = Guice.createInjector(new BasicModule());
        this.shippingManager = injector.getInstance(ShippingManager.class);
        this.shippingManager.setOrder(order);
    }

    @Test
    public void bestShipping() {
        assertEquals(10200.0, this.shippingManager.shippingPrice(this.shippingManager.bestShipping()),
                0);
    }

    @Test
    public void totalVolume() {
        assertEquals(399.9, this.shippingManager.totalVolume(), 0);
    }

    @Test
    public void totalWeight() {
        assertEquals(4210.0, this.shippingManager.totalWeight(), 0);
    }
}
