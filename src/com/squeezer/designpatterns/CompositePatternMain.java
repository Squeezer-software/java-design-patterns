package com.squeezer.designpatterns;

import com.squeezer.designpatterns.composite.Composite;
import com.squeezer.designpatterns.composite.Leaf;

public class CompositePatternMain {

    public static void main(String argv[]) {

        final Composite composite1 = new Composite("Composite 1");
        final Composite composite2 = new Composite("Composite 2");
        final Composite composite3 = new Composite("Composite 3");
        final Composite composite4 = new Composite("Composite 4");
        final Composite composite5 = new Composite("Composite 5");

        final Leaf element1 = new Leaf("Leaf 1");
        final Leaf element2 = new Leaf("Leaf 2");
        final Leaf element3 = new Leaf("Leaf 3");
        final Leaf element4 = new Leaf("Leaf 4");
        final Leaf element5 = new Leaf("Leaf 5");

        composite1.add(element1);
        composite1.add(composite2);
        composite1.add(element2);

        composite2.add(composite3);
        composite2.add(composite4);

        composite3.add(element3);
        composite3.add(element4);

        composite4.add(composite5);

        composite5.add(element5);

        composite1.operation();

    }

}
