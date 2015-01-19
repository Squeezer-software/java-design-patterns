package com.squeezer.designpatterns.facade;

public class Facade {

    private ClassA mClassA = new ClassA();
    private ClassB mClassB = new ClassB();

    public void operation2() {

        mClassA.operation2();
    }

    public void operation41() {

        mClassB.operation4();
        mClassA.operation1();
    }
}
