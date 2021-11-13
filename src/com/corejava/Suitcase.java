package com.corejava;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Unit> items;
    private int maxWeight;
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    public void addItem(Unit item) {
        int suitCaseWeight = 0;
        for (Unit i : items) {
            suitCaseWeight += i.getWeight();
        }
        if ((this.maxWeight - suitCaseWeight) >= item.getWeight()) {
            this.items.add(item);
        }
    }
    public String toString() {
        int suitCaseWeight = 0;
        for (Unit i : items) {
            suitCaseWeight += i.getWeight();
        }
        if (this.items.isEmpty()) {
            return "0 items (" + suitCaseWeight + " kg)";
        }
        if (this.items.size() == 1) {
            return "1 item (" + suitCaseWeight + " kg)";
        }
        return items.size() + " items (" + suitCaseWeight + " kg)";
    }

    public void printItems() {
        for (Unit item: items) {
            System.out.println(item);
        }
    }
    public int totalWeight() {
        int totalWeight = 0;
        for (Unit item: items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Unit heaviestItem() {
        if(this.items.isEmpty()){
            return null;
        }
        Unit heaviest = items.get(0);
        for (Unit item: items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;

    }

}
