package com.squeezer.designpatterns;

import com.squeezer.designpatterns.abstractfactory.AbstractFactory;
import com.squeezer.designpatterns.abstractfactory.AbstractProductA;
import com.squeezer.designpatterns.abstractfactory.ConcreteFactory1;
import com.squeezer.designpatterns.abstractfactory.ConcreteFactory2;
import com.squeezer.designpatterns.abstractfactory.ProductB2;

public class AbstractFactoryPatternMain {

    public static void main(String argv[]) {

        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();

        AbstractProductA pa1 = factory1.createProductA();
        pa1.display();
        ProductB2 pb2 = (ProductB2) factory2.createProductB();
        pb2.doWork();
    }

}
