package com.squeezer.designpatterns.strategy;

public class OperationContext {
    private Strategy mStrategy;

    public OperationContext(Strategy strategy) {
        mStrategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        mStrategy = strategy;
    }

    /*
     * delegate operation to strategy
     */
    public void operation() {
        mStrategy.strategyOperation();
    }
}
