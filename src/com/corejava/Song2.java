package com.corejava;

public class Song2 {
    private String artist;
    private String name;
    private int durationInSeconds;

    public Song2(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (! (compared instanceof Song2) ) {
            return false;
        }
        Song2 comparedSong = (Song2) compared;
        if (this.artist.equals(comparedSong.artist) && this.name.equals(comparedSong.name) && this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }
        return false;

    }
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
}
