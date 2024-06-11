package org.nurbek.shipping.domain.models.impl;

import org.nurbek.shipping.domain.models.Size;

public class SizeImpl implements Size {
    private double height;
    private double width;
    private double length;

    public SizeImpl(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public double getVolume() {
        return this.height * this.length * this.width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double value) {
        this.height = value;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double value) {
        this.width = value;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public void setLength(double value) {
        this.length = value;
    }

    @Override
    public String toString() {
        return this.length + " x " + this.width + " x " + this.height;
    }

}
