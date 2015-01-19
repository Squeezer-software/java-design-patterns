package com.squeezer.designpatterns.factory;

public class MonospaceFactory extends CarFactory {

    @Override
    public Car createCar() {
        // some work
        Monospace monospace = new Monospace();
        // some other work
        return monospace;
    }

}
