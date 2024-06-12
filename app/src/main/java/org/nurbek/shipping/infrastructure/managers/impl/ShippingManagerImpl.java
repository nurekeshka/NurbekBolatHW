package org.nurbek.shipping.infrastructure.managers.impl;

import org.nurbek.shipping.domain.models.Order;
import org.nurbek.shipping.infrastructure.managers.ShippingManager;

public class ShippingManagerImpl implements ShippingManager {
    private Order order;

    @Override
    public double bestShipping() {
        // Doing some crazy calculations
    }

    @Override
    public double totalVolume() {
        return this.order.totalVolume();
    }

    @Override
    public double totalWeight() {
        return this.order.totalWeight();
    }

    @Override
    public Order getOrder() {
        return order;
    }

    @Override
    public void setOrder(Order order) {
        this.order = order;
    }

}
