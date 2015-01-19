package com.squeezer.designpatterns.memento;

public class Originator {
    private String mState;

    public void setState(String state) {
        mState = state;
    }

    public String getState() {
        return mState;
    }

    public Memento createMemento() {
        return new Memento(mState);
    }

    public void setMemento(Memento memento) {
        mState = memento.getState();
    }
}