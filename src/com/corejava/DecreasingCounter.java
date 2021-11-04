package com.corejava;

public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        this.value--;
        if (this.value < 0) {
            this.value = 0;
        }
    }

    public void reset() {
        this.value = 0;
    }

    // and the other methods go here
}
