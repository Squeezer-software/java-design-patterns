package com.squeezer.designpatterns.mediator;

public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediateur) {
        super(mediateur);
        mediateur.setColleagueA(this);
    }

    public void sendMessageFromA(String message) {
        mMediator.sendMessageFromA(message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("ConcreteCollegueA received : " + message);
    }
}