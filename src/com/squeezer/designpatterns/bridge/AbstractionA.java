package com.squeezer.designpatterns.bridge;

public class AbstractionA extends Abstraction {

    public AbstractionA(Implementor pImplementation) {
        super(pImplementation);
    }

    @Override
    public void operation() {
        System.out.println("--> operation() from AbstractionA");
        super.operation();
    }
}
