package com.squeezer.designpatterns.memento;

public class Memento {
    private String mState;

    public Memento(String state) {
        this.mState = state;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }
}