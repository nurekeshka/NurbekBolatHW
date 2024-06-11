package org.nurbek.shipping.domain.models;

public class Item {
    private String name;
    private Size size;
    private double weight;

    public Item(String name, Size size, double weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public double getVolume() {
        return this.size.getVolume();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return this.name;
    }
}
