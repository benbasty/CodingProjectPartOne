package com.corejava;

import java.util.Objects;

public class Persons {
    private String name;
    private int height;

    public Persons(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.height + " cm)";
    }

    // Created with the insert code functionality of NetBeans
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persons other = (Persons) obj;
        if (this.height != other.height) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}
