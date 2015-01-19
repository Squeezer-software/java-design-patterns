package com.squeezer.designpatterns.visitor;

public interface Element {
    public void accept(Visitor computerPartVisitor);
}