package com.corejava;

public class Unit {
    private String name;
    private int weight;

    public Unit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return this.name;
    }
    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
}
