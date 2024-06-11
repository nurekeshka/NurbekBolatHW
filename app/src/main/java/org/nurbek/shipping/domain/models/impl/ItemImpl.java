package org.nurbek.shipping.domain.models.impl;

import org.nurbek.shipping.domain.models.Size;
import org.nurbek.shipping.domain.models.Item;

public class ItemImpl implements Item {
    private String name;
    private Size size;
    private double weight;

    public ItemImpl(String name, Size size, double weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public double getVolume() {
        return this.size.getVolume();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
