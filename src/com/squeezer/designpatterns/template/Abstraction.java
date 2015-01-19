package com.squeezer.designpatterns.template;

public abstract class Abstraction {

    public final void templateOperation() {
        operationAbs1();
        for (int i = 0; i < 5; i++) {
            operationAbs2(i);
        }
    }

    protected abstract void operationAbs1();

    protected abstract void operationAbs2(int index);
}