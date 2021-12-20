package com.corejava;

public class Bird {
    private String birdName;
    private String latinBirdName;
    private int observationCount;

    public Bird(String birdName, String latinBirdName) {
        this.birdName = birdName;
        this.latinBirdName = latinBirdName;
    }

    public String getBirdName() {
        return this.birdName;
    }

    public String getLatinBirdName() {
        return this.latinBirdName;
    }

    public int getObservationCount() {
        return this.observationCount;
    }
    public void Observation() {
        this.observationCount++;
    }
    @Override
    public String toString() {
        return this.birdName + ": (" + this.latinBirdName + "): " + this.observationCount + " observations";
    }

}
