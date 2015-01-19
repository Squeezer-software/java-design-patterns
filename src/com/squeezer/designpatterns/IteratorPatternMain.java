package com.squeezer.designpatterns;

import com.squeezer.designpatterns.iterator.Aggregate;
import com.squeezer.designpatterns.iterator.ConcreteAggregate;
import com.squeezer.designpatterns.iterator.Iterator;

public class IteratorPatternMain {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();

        Iterator iterator = aggregate.createIterator();

        while (!iterator.finished()) {
            System.out.println(iterator.next());
        }

    }

}
