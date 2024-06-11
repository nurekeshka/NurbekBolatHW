package org.nurbek.shipping.domain.models;

public interface Order {
    public void addItem(Item item, int quantity);

    public double totalVolume();

    public double totalWeight();

    public String toString();

}
