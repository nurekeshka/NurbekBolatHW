package org.nurbek.shipping.domain.models.impl;

import org.nurbek.shipping.domain.models.Size;
import org.nurbek.shipping.domain.models.Container;

public class ContainerImpl implements Container {
    private Size size;
    private double price;

    public ContainerImpl(Size size, double price) {
        this.size = size;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

}
