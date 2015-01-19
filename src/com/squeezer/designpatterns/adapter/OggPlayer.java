package com.squeezer.designpatterns.adapter;

public class OggPlayer implements AdvancedMediaPlayer {

    @Override
    public void playOgg(String fileName) {
        System.out.println("Playing ogg file. Name: " + fileName);

    }

    @Override
    public void playMp4(String fileName) {
        // do nothing

    }

}
