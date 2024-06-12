package org.nurbek.shipping.infrastructure.managers;

import org.nurbek.shipping.domain.models.Order;
import org.nurbek.shipping.domain.models.Shipping;

public interface ShippingManager {
    public Shipping bestShipping();

    public double shippingPrice(Shipping shipping);

    public double totalVolume();

    public double totalWeight();

    public Order getOrder();

    public void setOrder(Order order);

}
