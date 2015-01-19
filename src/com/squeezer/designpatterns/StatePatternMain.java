package com.squeezer.designpatterns;

import com.squeezer.designpatterns.state.Context;
import com.squeezer.designpatterns.state.StartState;
import com.squeezer.designpatterns.state.StopState;

public class StatePatternMain {

    public static void main(String[] args) {

        Context context = new Context();
        context.requestState(new StartState());
        context.requestState(new StopState());

    }

}
