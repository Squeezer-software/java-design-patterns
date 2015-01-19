package com.squeezer.designpatterns.chainofresponsibility;

public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest() {
        System.out.println("concrete handler 1 request");
        super.handleRequest();

    }

}
