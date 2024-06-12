package org.nurbek.shipping.domain.models;

public class Shipping {
    private int largeContainersNumber;
    private int smallContainersNumber;

    public Shipping(int bigContainersNumber, int smallContainersNumber) {
        this.largeContainersNumber = bigContainersNumber;
        this.smallContainersNumber = smallContainersNumber;
    }

    public int getLargeContainersNumber() {
        return largeContainersNumber;
    }

    public void setLargeContainersNumber(int bigContainersNumber) {
        this.largeContainersNumber = bigContainersNumber;
    }

    public int getSmallContainersNumber() {
        return smallContainersNumber;
    }

    public void setSmallContainersNumber(int smallContainersNumber) {
        this.smallContainersNumber = smallContainersNumber;
    }

}
