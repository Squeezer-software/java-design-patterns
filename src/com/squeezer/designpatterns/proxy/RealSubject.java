package com.squeezer.designpatterns.proxy;

class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("request in RealSubject");

    }

}
