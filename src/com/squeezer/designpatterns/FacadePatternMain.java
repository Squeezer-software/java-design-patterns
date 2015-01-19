package com.squeezer.designpatterns;

import com.squeezer.designpatterns.facade.Facade;

public class FacadePatternMain {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.operation2();
        facade.operation41();
    }

}
