package com.squeezer.designpatterns;

import com.squeezer.designpatterns.strategy.ConcreteStrategyA;
import com.squeezer.designpatterns.strategy.ConcreteStrategyB;
import com.squeezer.designpatterns.strategy.OperationContext;
import com.squeezer.designpatterns.strategy.Strategy;

public class StrategyPatternMain {

    public static void main(String[] args) {

        Strategy strategyA = new ConcreteStrategyA();
        Strategy strategyB = new ConcreteStrategyB();

        OperationContext operationContext = new OperationContext(strategyA);

        operationContext.operation();

        operationContext.setStrategy(strategyB);
        operationContext.operation();

        operationContext.setStrategy(strategyA);
        operationContext.operation();

    }

}
