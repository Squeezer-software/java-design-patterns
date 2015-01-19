package com.squeezer.designpatterns.composite;

public abstract class Component {

    protected String mName;

    public Component(final String name) {
        mName = name;
    }

    public abstract void operation();

    public void add(final Component component) {
        // do nothing
    }

    public void remove(final Component component) {
        // do nothing
    }

    public Component getChild(int index) {

        return null;
    }
}
