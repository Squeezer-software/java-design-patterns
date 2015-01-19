package com.squeezer.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    protected List<Component> mList = new ArrayList<Component>();

    public Composite(final String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("Operation on Composite: " + mName);
        for (Component element : mList) {
            element.operation();
        }
    }

    @Override
    public void add(final Component component) {
        mList.add(component);
    }

    @Override
    public void remove(final Component component) {
        mList.remove(component);
    }

    @Override
    public Component getChild(int index) {
        Component result = null;
        if (index < mList.size()) {
            mList.get(index);
        }
        return result;
    }
}
