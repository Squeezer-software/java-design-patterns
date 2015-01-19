package com.squeezer.designpatterns.iterator;

public class ConcreteIterator implements Iterator {

    private String[] mElements;
    private int index = 0;

    public ConcreteIterator(String[] elements) {
        mElements = elements;
    }

    @Override
    public String next() {
        return mElements[index++];
    }

    @Override
    public boolean finished() {
        return index >= mElements.length;
    }
}
