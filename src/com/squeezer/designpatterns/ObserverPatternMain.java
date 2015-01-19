package com.squeezer.designpatterns;

import com.squeezer.designpatterns.observer.ConcreteObserverA;
import com.squeezer.designpatterns.observer.ConcreteObserverB;
import com.squeezer.designpatterns.observer.ConcreteSubject;

public class ObserverPatternMain {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserverA concreteObserverA = new ConcreteObserverA();
        ConcreteObserverB concreteObserverB = new ConcreteObserverB();

        // register for notifications
        subject.register(concreteObserverA);
        subject.register(concreteObserverB);

        subject.setValue(23);

        subject.unregister(concreteObserverA);

        subject.setValue(3);
    }
}
