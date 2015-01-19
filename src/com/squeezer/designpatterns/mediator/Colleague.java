package com.squeezer.designpatterns.mediator;

public abstract class Colleague {

    protected Mediator mMediator;

    public Colleague(Mediator mediateur) {
        mMediator = mediateur;
    }

    public abstract void receiveMessage(String message);
}