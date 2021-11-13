package com.corejava;

import java.util.ArrayList;

public class Rooms {
    private ArrayList<Persons> rooms;
    public Rooms() {
        this.rooms = new ArrayList<>();
    }


    public void add(Persons person) {
        // add the person passed as a parameter to the list
        this.rooms.add(person);
    }
    public boolean isEmpty() {
        // tells whether the room is empty or not.
        if (rooms.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Persons> getPersons() {
        // returns a list of the persons in the room.
        return this.rooms;
    }


    public Persons shortest() {
        // If the room is empty, a null reference is returned
        if (this.rooms.isEmpty()) {
            return null;
        }
        Persons shortest = this.rooms.get(0);
        for (Persons person: rooms) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Persons take() {
        if (this.rooms.isEmpty()) {
            return null;
        }
        Persons shortPerson = this.shortest();
        this.rooms.remove(shortPerson);
        return shortPerson;
    }



}
