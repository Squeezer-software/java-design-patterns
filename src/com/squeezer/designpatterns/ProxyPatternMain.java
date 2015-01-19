package com.squeezer.designpatterns;

import com.squeezer.designpatterns.proxy.Proxy;
import com.squeezer.designpatterns.proxy.Subject;

public class ProxyPatternMain {

    public static void main(String[] args) {

        Subject subject = new Proxy();

        subject.request(); // object will be created

        // if called 2nd time, object will be loaded form memory

    }

}
