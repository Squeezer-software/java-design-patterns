package com.squeezer.designpatterns.visitor;

public interface Visitor {

    public void visit(ObjectStructure objectStructure);

    public void visit(ConcreteElementA elementA);

    public void visit(ConcreteElementB elementB);
}