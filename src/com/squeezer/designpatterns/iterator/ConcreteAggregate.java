package com.squeezer.designpatterns.iterator;

public class ConcreteAggregate implements Aggregate {

    private String[] elements = { "hello", "IIT", "GLID", "3" };

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(elements);
    }

}
