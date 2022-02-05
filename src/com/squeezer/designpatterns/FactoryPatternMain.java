package com.squeezer.designpatterns;

import com.squeezer.designpatterns.factory.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FactoryPatternMain {

    public static void main(String argv[]) {

        CarFactory cab = new CabrioletFactory();
        MonospaceFactory mono = new MonospaceFactory();

        Car c1 = cab.createCar();
        Car c2 = mono.createCar();
        Car c3 = cab.createCar();


        System.out.println("Car1 Type = " + c1.getType());
        System.out.println("Car2 Type = " + c2.getType());
        System.out.println("Car3 max speed = " + c3.getMaxSpeed());

    }

}
