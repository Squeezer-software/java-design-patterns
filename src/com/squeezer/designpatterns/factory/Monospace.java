package com.squeezer.designpatterns.factory;

public class Monospace extends Car {

    protected Monospace() {
        color = "green";
    }

    @Override
    public String getType() {

        return "Monospace";
    }

    @Override
    public String getMaxSpeed() {

        return "220km/h";
    }

}
