package org.nurbek.shipping.domain.models;

public interface Size {
    public double getVolume();

    public double getLength();

    public void setLength(double value);

    public double getHeight();

    public void setHeight(double value);

    public double getWidth();

    public void setWidth(double value);

    public String toString();

}
