package com.squeezer.designpatterns.observer;

public class ConcreteSubject extends Subject {

    private int mValue = 0;

    public void setValue(int value) {
        mValue = value;
        notifyObservers();
    }

    public int getValue() {
        return mValue;
    }

}
