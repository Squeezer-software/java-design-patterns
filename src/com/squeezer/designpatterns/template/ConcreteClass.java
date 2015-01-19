package com.squeezer.designpatterns.template;

public class ConcreteClass extends Abstraction {

    @Override
    public void operationAbs1() {
        System.out.println("operationAbs1");
    }

    @Override
    public void operationAbs2(int index) {
        System.out.println("\toperationAbs2 : " + index);
    }
}