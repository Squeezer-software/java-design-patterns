package com.squeezer.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> mObserversList = new ArrayList<Observer>();

    public void register(Observer observer) {
        mObserversList.add(observer);
    }

    public void unregister(Observer observer) {
        mObserversList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : mObserversList) {
            observer.update();
        }
    }

}
