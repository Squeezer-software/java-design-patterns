package com.squeezer.designpatterns.prototype;

public abstract class Prototype implements Cloneable {

    protected String mText;

    public Prototype(String text) {
        mText = text;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public void setText(String text) {
        mText = text;
    }

    public abstract void display();
}