package org.nurbek.shipping.infrastructure.managers;

import org.nurbek.shipping.domain.models.Order;

public interface ShippingManager {
    public void bestShipping();

    public double totalVolume();

    public double totalWeight();

    public Order getOrder();

    public void setOrder(Order order);

}
