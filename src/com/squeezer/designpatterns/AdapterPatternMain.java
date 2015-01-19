package com.squeezer.designpatterns;

import com.squeezer.designpatterns.adapter.AudioPlayer;

public class AdapterPatternMain {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("ogg", "far far away.ogg");
        audioPlayer.play("avi", "mind me.avi");

    }

}
