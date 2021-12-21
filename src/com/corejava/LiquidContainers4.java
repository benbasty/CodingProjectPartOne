package com.corejava;

public class LiquidContainers4 {
    private int amount;
    private int maxAmount;

    public LiquidContainers4() {
        this.amount = 0;
        this.maxAmount = 100;
    }
    public int contains() {
        return this.amount;
    }
    public void add(int amount) {
        if (amount < 0) {
            this.amount = amount;
        } else {
            this.amount += amount;
            if (amount > 100) {
                this.amount = maxAmount;
            }
        }


    }
    public void removeAmount(int amount) {
        if (amount > 0) {
            this.amount -= amount;
            if (this.amount < 0) {
                this.amount = 0;
            }
        }
    }

    @Override
    public String toString() {
        return this.amount + "/" + this.maxAmount;
    }
}
