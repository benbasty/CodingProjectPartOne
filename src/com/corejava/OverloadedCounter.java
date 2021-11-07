package com.corejava;

public class OverloadedCounter {

    private int startValue;

    public OverloadedCounter(int startValue) {
        this.startValue = startValue;
    }
    public OverloadedCounter() {
        this.startValue = 0;
    }
    public int value() {
        return this.startValue;
    }
    public void increase() {
        this.startValue++;
    }

    public void decrease() {
        this.startValue--;
    }

    public void increase(int increaseBy) {
        this.startValue = this.startValue + increaseBy;
        if (increaseBy < 0) {
            this.startValue = startValue;
        }
    }

    public void decrease(int decreaseBy) {
        this.startValue -= decreaseBy;
        if (decreaseBy < 0) {
            this.startValue = startValue;
        }
    }

}
