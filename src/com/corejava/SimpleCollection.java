package com.corejava;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String output = "";

        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";

        } else if (elements.size() == 1) {
            return "The collection " + this.name + " has " + elements.size() + " element:\n" + this.elements.get(0);

        } else {
            for (String element: elements) {
                output = output + element + "\n";
            }
            return "The collection " + this.name + " has " + elements.size() + " elements:\n" + output;
        }


    }

    public String longest() {
        if(this.elements.isEmpty()){
            return null;
        }
        String longestString = this.elements.get(0);
        for (String collection: elements) {
            if (longestString.length() < collection.length()) {
                longestString = collection;
            }
        }
        return longestString;
    }

}
