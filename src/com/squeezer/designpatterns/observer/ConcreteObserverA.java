package com.squeezer.designpatterns.observer;

public class ConcreteObserverA implements Observer {

    @Override
    public void update(int value) {
        System.out.println("ConcreteObserverA notified with value "+value);

    }

}
