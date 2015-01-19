package com.squeezer.designpatterns.interpreter;

public interface Expression {
    public boolean interpret(String context);
}