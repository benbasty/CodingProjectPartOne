package com.corejava;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> weights;
    public Package() {
        this.weights = new ArrayList<>();
    }
    public void addGift(Gift gift) {
        this.weights.add(gift);
    }
    int totalWeights = 0;
    public int totalWeight() {
        for (Gift gift: weights) {
            totalWeights += gift.getWeight();
        }
        return totalWeights;
    }
}
