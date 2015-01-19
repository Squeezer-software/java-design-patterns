package com.squeezer.designpatterns.interpreter;

public class NonTerminalExpression implements Expression {

    private Expression mExpression1 = null;
    private Expression mExpression2 = null;

    public NonTerminalExpression(Expression expr1, Expression expr2) {
        this.mExpression1 = expr1;
        this.mExpression2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        // in this sample, use logical "and" for interpretation
        return mExpression1.interpret(context)
                && mExpression2.interpret(context);
    }
}