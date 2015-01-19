package com.squeezer.designpatterns.visitor;


public class ObjectStructure implements Element {

    private Element[] mParts;

    public ObjectStructure() {
        mParts = new Element[] { new ConcreteElementA(), new ConcreteElementB() };
    }

    @Override
    public void accept(Visitor visitor) {
        for (int i = 0; i < mParts.length; i++) {
            mParts[i].accept(visitor);
        }
        visitor.visit(this);
    }
}