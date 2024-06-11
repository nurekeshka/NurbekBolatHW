package org.nurbek.shipping.domain.models;

public interface Item {
    public double getVolume();

    public String getName();

    public void setName(String name);

    public Size getSize();

    public void setSize(Size size);

    public double getWeight();

    public void setWeight(double weight);

    public String toString();

}
