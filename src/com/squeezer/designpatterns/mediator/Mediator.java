package com.squeezer.designpatterns.mediator;

public interface Mediator {

    public void setColleagueA(ConcreteColleagueA pCollegueA);

    public void setColleagueB(ConcreteColleagueB pCollegueB);

    public void sendMessageFromA(String message);

    public void sendMessageFromB(String message);
}