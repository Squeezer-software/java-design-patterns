package com.squeezer.designpatterns.flyweight;

public class UnsharedConcreteFlyweight implements Flyweight {

    private String mValue1;
    private String mValue2;

    public UnsharedConcreteFlyweight(String value1, String value2) {
        mValue1 = value1;
        mValue2 = value2;
    }

    @Override
    public void operation(String context) {
        System.out.println("Flyweoght with value 1 : " + mValue1
                + " and value 2 : " + mValue2);
    }

}