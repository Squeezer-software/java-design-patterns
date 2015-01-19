package com.squeezer.designpatterns;

import com.squeezer.designpatterns.mediator.ConcreteColleagueA;
import com.squeezer.designpatterns.mediator.ConcreteColleagueB;
import com.squeezer.designpatterns.mediator.ConcreteMediator;
import com.squeezer.designpatterns.mediator.Mediator;

public class MediatorPatternMain {

    public static void main(String[] args) {

        Mediator mediator = new ConcreteMediator();

        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        colleagueA.sendMessageFromA("Hiiii");
        colleagueB.sendMessageFromB("GLID");

    }
}