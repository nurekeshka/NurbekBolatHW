package org.nurbek.shipping.domain.models;

public class Shipping {
    private int bigContainersNumber;
    private int smallContainersNumber;

    public Shipping(int bigContainersNumber, int smallContainersNumber) {
        this.bigContainersNumber = bigContainersNumber;
        this.smallContainersNumber = smallContainersNumber;
    }

    public int getBigContainersNumber() {
        return bigContainersNumber;
    }

    public void setBigContainersNumber(int bigContainersNumber) {
        this.bigContainersNumber = bigContainersNumber;
    }

    public int getSmallContainersNumber() {
        return smallContainersNumber;
    }

    public void setSmallContainersNumber(int smallContainersNumber) {
        this.smallContainersNumber = smallContainersNumber;
    }

}
