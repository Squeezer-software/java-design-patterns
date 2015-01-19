package com.squeezer.designpatterns.chainofresponsibility;

public abstract class Handler {

    private Handler mSuccessor;

    public void handleRequest() {
        if (mSuccessor != null) {
            mSuccessor.handleRequest();
        }
    }

    public void setSuccessor(Handler successor) {
        mSuccessor = successor;
    }
}
