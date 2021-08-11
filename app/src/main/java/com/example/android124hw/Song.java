package com.example.android124hw;

public class Song {
    private String name;
    private String song;
    private String number;
    private String time;

    public Song(String name, String song, String number, String time) {
        this.name = name;
        this.song = song;
        this.number = number;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getSong() {
        return song;
    }

    public String getNumber() {
        return number;
    }

    public String getTime() {
        return time;
    }
}
