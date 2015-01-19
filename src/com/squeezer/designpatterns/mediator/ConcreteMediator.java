package com.squeezer.designpatterns.mediator;

public class ConcreteMediator implements Mediator {

    private ConcreteColleagueA mColleagueA;
    private ConcreteColleagueB mColleagueB;

    @Override
    public void setColleagueA(ConcreteColleagueA colleagueA) {
        mColleagueA = colleagueA;
    }

    @Override
    public void setColleagueB(ConcreteColleagueB colleagueB) {
        mColleagueB = colleagueB;
    }

    @Override
    public void sendMessageFromA(String message) {
        // if sent from A, receive it at B
        mColleagueB.receiveMessage(message);
    }

    @Override
    public void sendMessageFromB(String message) {
        // if sent from B, receive it at A
        mColleagueA.receiveMessage(message);
    }
}