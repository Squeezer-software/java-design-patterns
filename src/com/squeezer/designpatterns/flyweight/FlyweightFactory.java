package com.squeezer.designpatterns.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

    private HashMap<String, ConcreteFlyweight> mFlyweightsMap = new HashMap<String, ConcreteFlyweight>();

    public FlyweightFactory() {
        mFlyweightsMap.put("Hi", new ConcreteFlyweight("Hi"));
        mFlyweightsMap.put("GLID", new ConcreteFlyweight("GLID"));
        mFlyweightsMap.put("IIT", new ConcreteFlyweight("IIT"));
    }

    public Flyweight getFlyweight(String value) {
        if (mFlyweightsMap.containsKey(value)) {
            System.out
                    .println("--> Returns existing flyweight (" + value + ")");
            return mFlyweightsMap.get(value);
        } else {
            System.out.println("--> Returns new flyweight (" + value + ")");
            final ConcreteFlyweight newFlyweight = new ConcreteFlyweight(value);
            mFlyweightsMap.put(value, newFlyweight);
            return newFlyweight;
        }
    }

    public Flyweight getFlyweight(String value1, String value2) {
        System.out.println("--> Returns unshared flyweight (" + value1 + ", "
                + value2 + ")");
        return new UnsharedConcreteFlyweight(value1, value2);
    }
}