package com.corejava;

public class Container {
    private final int maxCapacity;
    private int currentCapacity;

    public Container() {
        this.maxCapacity = 0;
        this.currentCapacity = 0;
    }
    public int contains() {
        return this.currentCapacity;
    }
    public void add(int amount) {
        // adds the amount of liquid given as a parameter to the container

        if (amount > 0) {
            this.currentCapacity += amount;
            if (this.currentCapacity > 100) {
                this.currentCapacity = 100;
            }
        }
    }
    public void removeAmount(int amount) {
        if (amount > 0) {
            this.currentCapacity -= amount;
            if (this.currentCapacity == 0) {
                this.currentCapacity = 0;
            }
        }
    }

    @Override
    public String toString() {
        return this.currentCapacity + "/" + this.maxCapacity;
    }


}
