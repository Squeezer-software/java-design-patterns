package com.squeezer.designpatterns;

import com.squeezer.designpatterns.singleton.Singleton;

public class SingletonPatternMain {

    public static void main(String argv[]) {

        Singleton instance1 = Singleton.getInstance();

        instance1.setMessage("IIT");
        System.out.println("instance 1 message: " + instance1.getMessage());

        Singleton instance2 = Singleton.getInstance();
        instance2.setMessage("GLID");
        System.out.println("instance 1 message after instance 2 change: "
                + instance1.getMessage());

    }

}
