package com.squeezer.designpatterns.bridge;

public class AbstractionB extends Abstraction {

    public AbstractionB(Implementor pImplementation) {
        super(pImplementation);
    }

    @Override
    public void operation() {
        System.out.println("--> operation() from AbstractionB");
        super.operation();
    }
}
