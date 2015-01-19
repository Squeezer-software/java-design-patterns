package com.squeezer.designpatterns;

import com.squeezer.designpatterns.visitor.ConcreteVisitor;
import com.squeezer.designpatterns.visitor.ObjectStructure;

public class VisitorPatternMain {
    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.accept(new ConcreteVisitor());
    }
}