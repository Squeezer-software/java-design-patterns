package com.squeezer.designpatterns.factory;

public abstract class Car {

    protected String color;
    protected String vitesseMax;

    public abstract String getType();

    public abstract String getMaxSpeed();

    public void setColor(String color) {
        this.color = color;
    }
}
