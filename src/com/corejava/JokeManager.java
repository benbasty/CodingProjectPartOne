package com.corejava;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    public String drawJoke() {
        int index = 0;
        if (jokes.isEmpty()) {
            System.out.println("Jokes are in short supply.");
        } else {
                Random jokesList = new Random();
                index = jokesList.nextInt(jokes.size());
        }
        return jokes.get(index);
    }

    public void printJokes() {
        for (String joke: jokes) {
            System.out.println(joke);
        }
    }

}
