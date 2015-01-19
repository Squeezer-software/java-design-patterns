package com.squeezer.designpatterns;

import com.squeezer.designpatterns.chainofresponsibility.ConcreteHandler1;
import com.squeezer.designpatterns.chainofresponsibility.ConcreteHandler2;
import com.squeezer.designpatterns.chainofresponsibility.Handler;

public class ChainOfResponsibilityPatternMain {

    public static void main(String[] args) {

        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler1.setSuccessor(handler2);

        handler1.handleRequest();

    }

}
