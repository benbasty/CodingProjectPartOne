package com.corejava;

import java.util.ArrayList;

public class Playlist {
    // The playlist contains songs: songs can be added, songs can be removed,
    // and the songs that the playlist contains can be printed.
    private ArrayList<String> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }
    public void addSongs(String song) {
        this.songs.add(song);
    }
    public void removeSongs(String song) {
        this.songs.remove(song);
    }
    public void printSong() {
        for (String song: songs) {
            System.out.println(song);
        }
    }

}
