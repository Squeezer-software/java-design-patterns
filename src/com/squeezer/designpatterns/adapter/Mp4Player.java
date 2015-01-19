package com.squeezer.designpatterns.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playOgg(String fileName) {
        // do nothing

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);

    }

}
