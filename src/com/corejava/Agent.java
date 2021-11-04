package com.corejava;

public class Agent {
    private String firstName;
    private String secondName;

    public Agent (String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String toString() {
        return "My name is " + secondName + ", " + firstName + " " + secondName;
    }
}
