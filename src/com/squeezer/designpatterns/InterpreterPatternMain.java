package com.squeezer.designpatterns;

import com.squeezer.designpatterns.interpreter.Expression;
import com.squeezer.designpatterns.interpreter.NonTerminalExpression;
import com.squeezer.designpatterns.interpreter.TerminalExpression;

public class InterpreterPatternMain {

    public static Expression getExpressionInContext1() {

        return new TerminalExpression("exp1");
    }

    public static Expression getExpressionInContext2() {
        Expression exp1 = new TerminalExpression("exp1");
        Expression exp2 = new TerminalExpression("exp2");
        return new NonTerminalExpression(exp1, exp2);
    }

    public static void main(String[] args) {
        Expression exp1 = getExpressionInContext1();
        Expression exp2 = getExpressionInContext2();

        System.out.println("test of context 1 " + exp1.interpret("exp1"));
        System.out.println("test of context 2 " + exp2.interpret("exp3"));
    }
}