package org.nurbek.shipping.domain.models;

public class Size {
    private double height;
    private double width;
    private double length;

    public Size(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getVolume() {
        return this.height * this.length * this.width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double value) {
        this.height = value;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double value) {
        this.width = value;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double value) {
        this.length = value;
    }

    public String toString() {
        return this.length + " x " + this.width + " x " + this.height;
    }

}
