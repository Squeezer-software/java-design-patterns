package com.squeezer.designpatterns.flyweight;

public class ConcreteFlyweight implements Flyweight {

    private String mValue;

    public ConcreteFlyweight(String value) {
        mValue = value;
    }

    @Override
    public void operation(String context) {
        System.out.println("Flyweight with value: " + mValue
                + " and in context: " + context);

    }

}