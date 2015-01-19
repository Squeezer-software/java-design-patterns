package com.squeezer.designpatterns.prototype;

public class ConcretePrototypeA extends Prototype {

    public ConcretePrototypeA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("ConcretePrototypeA with text : " + mText);

    }

}