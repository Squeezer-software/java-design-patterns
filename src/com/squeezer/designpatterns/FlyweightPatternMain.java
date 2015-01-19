package com.squeezer.designpatterns;

import com.squeezer.designpatterns.flyweight.Flyweight;
import com.squeezer.designpatterns.flyweight.FlyweightFactory;

public class FlyweightPatternMain {

    public static void main(String[] args) {

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight flyweight1 = flyweightFactory.getFlyweight("Hi");
        Flyweight flyweight1Bis = flyweightFactory.getFlyweight("Hi");

        // Affiche ces deux "PoidsMouche"
        flyweight1.operation("Context one");
        flyweight1Bis.operation("Context one Bis");

        Flyweight flyweight2 = flyweightFactory.getFlyweight("3");
        Flyweight flyweight2Bis = flyweightFactory.getFlyweight("3");

        flyweight2.operation("Contexte two");
        flyweight2Bis.operation("Contexte two Bis");

        // unshared flyweight
        Flyweight flyweight3 = flyweightFactory.getFlyweight("Value 1",
                "Value 2");
        flyweight3.operation(null);

    }
}