package org.nurbek.shipping.domain.models;

public class Shipping {
    private long largeContainersNumber;
    private long smallContainersNumber;

    public Shipping(long largeContainersNumber, long smallContainersNumber) {
        this.largeContainersNumber = largeContainersNumber;
        this.smallContainersNumber = smallContainersNumber;
    }

    public long getLargeContainersNumber() {
        return largeContainersNumber;
    }

    public void setLargeContainersNumber(int bigContainersNumber) {
        this.largeContainersNumber = bigContainersNumber;
    }

    public long getSmallContainersNumber() {
        return smallContainersNumber;
    }

    public void setSmallContainersNumber(int smallContainersNumber) {
        this.smallContainersNumber = smallContainersNumber;
    }

}
