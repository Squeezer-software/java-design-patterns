package com.squeezer.designpatterns;

import com.squeezer.designpatterns.prototype.ConcretePrototypeA;
import com.squeezer.designpatterns.prototype.ConcretePrototypeB;
import com.squeezer.designpatterns.prototype.Prototype;

public class PrototypePatternMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        long timestamp = System.nanoTime();
        Prototype originalPrototypeA = new ConcretePrototypeA("OriginalA");
        timestamp = System.nanoTime() - timestamp;

        System.out.println("creation duration = " + timestamp);
        Prototype originalPrototypeB = new ConcretePrototypeB("OriginalB");

        timestamp = System.nanoTime();
        Prototype prototypeAClone = originalPrototypeA.clone();
        timestamp = System.nanoTime() - timestamp;
        System.out.println("clone duration = " + timestamp);
        Prototype prototypeBClone = originalPrototypeB.clone();

        originalPrototypeA.display();
        prototypeAClone.display();
        originalPrototypeB.display();
        prototypeBClone.display();

        System.out.println("\n\n");

        // Modify the clones
        prototypeAClone.setText("Clone A in fact");
        prototypeBClone.setText("Clone B in fact");

        originalPrototypeA.display();
        prototypeAClone.display();
        originalPrototypeB.display();
        prototypeBClone.display();

    }
}