package com.corejava;

import java.util.ArrayList;

public class Stack {
    // A stack is a data structure that you can add to and take from.
    // Always to the top of it or from the top.
    private ArrayList<String> values;
    public Stack() {
        this.values = new ArrayList<>();
    }
    public boolean isEmpty() {
        if (values.isEmpty()) {
            return true;
        }
        return false;
    }
    public void add(String value) {
        this.values.add(value);
    }
    public ArrayList<String> values() {
        return this.values;
    }
    public String take() {
        String topMostValue = this.values.remove(this.values.size() - 1);
        return topMostValue;
    }
}
