package com.squeezer.designpatterns.singleton;

public class Singleton {

    private static Singleton mInstance;
    private String mMessage;

    private Singleton() {

    }

    public static Singleton getInstance() {

        if (mInstance == null) {
            mInstance = new Singleton();
        }
        return mInstance;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

}
