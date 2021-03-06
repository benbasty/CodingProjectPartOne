package com.corejava;

public class HealthStation {
    private int countWeight;

    public HealthStation () {
        this.countWeight = 0;
    }
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.countWeight++;
        return person.getWeight();
    }
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.countWeight;
    }

}
