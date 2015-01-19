package com.squeezer.designpatterns.bridge;

public abstract class Abstraction {

    private Implementor mImplementor;

    protected Abstraction(Implementor implementor) {
        mImplementor = implementor;
    }

    public void operation() {
        mImplementor.operationImpl();
    }

}
