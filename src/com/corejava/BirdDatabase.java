package com.corejava;

import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;
    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    public void add(String name, String latinBirdName) {
        Bird bird = new Bird(name,latinBirdName);
        this.birds.add(bird);
    }
    public void observation(String name) {
        for (Bird bird: birds) {
            if (bird.getBirdName().equals(name)) {
                bird.Observation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    public void printAllBirds() {
        for (Bird bird: birds) {
            System.out.println(bird.toString());
        }
    }
    public void printOneBird(String name) {
        for (Bird bird: birds) {
            if (bird.getBirdName().equals(name) || bird.getLatinBirdName().equals(name)) {
                System.out.println(bird.toString());
            }
        }
        System.out.println("Not a bird!");
    }
}
