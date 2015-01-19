package com.squeezer.designpatterns.proxy;

public class Proxy implements Subject {

    private Subject mRealSubject;

    @Override
    public void request() {

        if (mRealSubject == null) {
            mRealSubject = new RealSubject();
        }

        // Do what you want
        mRealSubject.request();
        // Do what you want
    }

}
