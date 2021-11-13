package com.corejava;

import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();

    }

    public void addSuitcase(Suitcase suitcase) {
        int holdWeight = 0;
        for (Suitcase suitCase: suitcases) {
            holdWeight += suitCase.totalWeight();
        }
        if ((this.maxWeight - holdWeight) >= suitcase.totalWeight()) {
            this.suitcases.add(suitcase);
        }

    }
    @Override
    public String toString() {
        int holdWeight = 0;
        for (Suitcase suitCase: suitcases) {
            holdWeight += suitCase.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + holdWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }


}
