package com.squeezer.designpatterns;

import com.squeezer.designpatterns.bridge.Abstraction;
import com.squeezer.designpatterns.bridge.AbstractionA;
import com.squeezer.designpatterns.bridge.AbstractionB;
import com.squeezer.designpatterns.bridge.ConcreteImplementorA;
import com.squeezer.designpatterns.bridge.ConcreteImplementorB;
import com.squeezer.designpatterns.bridge.Implementor;

public class BridgePatternMain {

    public static void main(String[] args) {

        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();

        Abstraction abstractionA = new AbstractionA(implementorA);
        Abstraction abstractionB = new AbstractionB(implementorB);

        abstractionA.operation();
        abstractionB.operation();

    }

}
