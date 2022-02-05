package com.squeezer.designpatterns.observer;

public class ConcreteObserverB implements Observer {

    @Override
    public void update(int value) {
        System.out.println("ConcreteObserverB notified with value "+value);

    }

}
