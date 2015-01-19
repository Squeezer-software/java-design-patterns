package com.squeezer.designpatterns.mediator;

public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediateur) {
        super(mediateur);
        mediateur.setColleagueB(this);
    }

    public void sendMessageFromB(String message) {
        mMediator.sendMessageFromB(message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("ConcreteCollegueB received : " + message);
    }
}