package org.nurbek.shipping.infrastructure.managers.impl;

import org.nurbek.shipping.domain.enums.ContainerType;
import org.nurbek.shipping.domain.models.Order;
import org.nurbek.shipping.domain.models.Shipping;
import org.nurbek.shipping.domain.repositories.ContainerRepository;
import org.nurbek.shipping.infrastructure.managers.ShippingManager;

public class ShippingManagerImpl implements ShippingManager {
    private final ContainerRepository containerRepository;

    private Order order;

    public ShippingManagerImpl(ContainerRepository containerRepository) {
        this.containerRepository = containerRepository;
    }

    @Override
    public Shipping bestShipping() {
        double largeContainerVolume = this.containerRepository.getContainer(ContainerType.LARGE).totalVolume();
        double smallContainerVolume = this.containerRepository.getContainer(ContainerType.SMALL).totalVolume();

        double totalVolume = this.totalVolume();

        long maxLargeContainersNumber = Math.round(totalVolume / largeContainerVolume);
        long maxSmallContainersNumber = Math.round(totalVolume / smallContainerVolume);

        Shipping bestShipping = new Shipping(maxLargeContainersNumber, maxSmallContainersNumber);
        Shipping nextShipping;

        for (int largesNumber = 0; largesNumber <= maxLargeContainersNumber; largesNumber++) {
            for (int smallsNumber = 0; smallsNumber <= maxSmallContainersNumber; smallsNumber++) {
                if (largeContainerVolume * largesNumber + smallContainerVolume * smallsNumber >= totalVolume) {
                    nextShipping = new Shipping(largesNumber, smallsNumber);

                    if (this.shippingPrice(bestShipping) > this.shippingPrice(nextShipping)) {
                        bestShipping = nextShipping;
                    }
                }
            }
        }

        return bestShipping;
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

    @Override
    public double shippingPrice(Shipping shipping) {
        double smallContainerPrice = 1000;
        double largeContainerPrice = 1800;

        if (order.totalWeight() > 500) {
            smallContainerPrice = 1200;
        }

        return smallContainerPrice * shipping.getSmallContainersNumber()
                + largeContainerPrice * shipping.getLargeContainersNumber();
    }

}
