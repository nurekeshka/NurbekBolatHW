package org.nurbek.shipping.domain.models;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private final Map<Item, Integer> items;

    public Order() {
        this.items = new HashMap<>();
    }

    public void addItem(Item item, int quantity) {
        int existingQuantity = 0;

        if (this.items.containsKey(item)) {
            existingQuantity = this.items.get(item) + quantity;
        }

        this.items.put(item, existingQuantity + quantity);
    }

    public double totalVolume() {
        double totalVolume = 0.0;

        for (Map.Entry<Item, Integer> entry : this.items.entrySet()) {
            totalVolume += entry.getKey().getVolume() * entry.getValue();
        }

        return totalVolume;
    }

    public double totalWeight() {
        double totalWeight = 0.0;

        for (Map.Entry<Item, Integer> entry : this.items.entrySet()) {
            totalWeight += entry.getKey().getWeight() * entry.getValue();
        }

        return totalWeight;
    }

    public String toString() {
        StringBuilder orderStringBuilder = new StringBuilder();

        for (Map.Entry<Item, Integer> entry : this.items.entrySet()) {
            orderStringBuilder.append(entry.getKey().getName() + ": " + entry.getValue() + "\n");
        }

        return orderStringBuilder.toString();
    }
}
