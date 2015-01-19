package com.squeezer.designpatterns.builder;

public class DoubleBurger extends Burger {

    @Override
    public float price() {
        return 7.5f;
    }

    @Override
    public String name() {
        return "Double Burger";
    }
}