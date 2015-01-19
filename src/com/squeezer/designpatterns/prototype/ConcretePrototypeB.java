package com.squeezer.designpatterns.prototype;

public class ConcretePrototypeB extends Prototype {

    public ConcretePrototypeB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("ConcretePrototypeB with text : " + mText);

    }

}