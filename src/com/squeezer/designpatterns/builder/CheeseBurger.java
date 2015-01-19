package com.squeezer.designpatterns.builder;

public class CheeseBurger extends Burger {

    @Override
    public float price() {
        return 4.0f;
    }

    @Override
    public String name() {
        return "Cheese Burger";
    }
}