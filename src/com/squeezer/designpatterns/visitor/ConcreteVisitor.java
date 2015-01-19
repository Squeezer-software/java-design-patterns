package com.squeezer.designpatterns.visitor;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(ObjectStructure objectStructure) {
        System.out.println("visit whole structure");

    }

    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("visit element A");

    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("visit element B");

    }

}