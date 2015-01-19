package com.squeezer.designpatterns.state;

public class Context {
    private State mState;

    public Context() {
        mState = null;
    }

    public void requestState(State state) {
        this.mState = state;
        mState.doAction();
    }

    public State getState() {
        return mState;
    }
}