package com.squeezer.designpatterns.observer;

public class ConcreteObserverB implements Observer {

    @Override
    public void update() {
        System.out.println("ConcreteObserverB notified");

    }

}
