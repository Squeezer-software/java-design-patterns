package com.squeezer.designpatterns.factory;

public class Cabriolet extends Car {

    protected Cabriolet() {
        color = "RED";
        speedMax = "280km/h";
    }

    @Override
    public String getType() {

        return "Cabriolet";
    }

    @Override
    public String getMaxSpeed() {

        return speedMax;
    }

}
