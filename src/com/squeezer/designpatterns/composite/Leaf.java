package com.squeezer.designpatterns.composite;

public class Leaf extends Component {

    public Leaf(final String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("Operation on Leaf: " + mName);
    }
}