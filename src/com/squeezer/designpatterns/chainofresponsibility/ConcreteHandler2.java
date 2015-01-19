package com.squeezer.designpatterns.chainofresponsibility;

public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest() {
        System.out.println("concrete handler 2 request");
        super.handleRequest();

    }

}
