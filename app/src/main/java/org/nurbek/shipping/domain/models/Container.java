package org.nurbek.shipping.domain.models;

public interface Container {
    public double getPrice();

    public void setPrice(double price);

    public Size getSize();

    public void setSize(Size size);

    public String toString();

}
