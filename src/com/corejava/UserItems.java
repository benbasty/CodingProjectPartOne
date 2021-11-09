package com.corejava;

import java.util.Objects;

public class UserItems {
    private String identifier;
    private String name;

    public UserItems(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (compared instanceof UserItems) {
            UserItems itemCompared = (UserItems) compared;
            if (this.identifier.equals(itemCompared.identifier)) {
                return true;
            }
        }

        return false;
    }
}
