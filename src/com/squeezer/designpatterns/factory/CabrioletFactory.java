package com.squeezer.designpatterns.factory;

public class CabrioletFactory extends CarFactory {

    @Override
    public Car createCar() {
        // some work
        Cabriolet cabriolet = new Cabriolet();
        // some other work
        return cabriolet;
    }

}
