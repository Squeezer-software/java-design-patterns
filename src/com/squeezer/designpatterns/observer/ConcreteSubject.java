package com.squeezer.designpatterns.observer;

public class ConcreteSubject extends Subject {

    private int mValue;

    public void setValue(int value) {
        mValue = value;
        notifyObservers(mValue);
    }

    public int getValue() {
        return mValue;
    }

}
