package com.corejava;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public void printPerson() {
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old");
    }

    public void growOlder() {
        this.age++;
    }

    public boolean isOfLegalAge() {
        if (this.age > 17) {
            return true;
        }

        return false;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double bmi() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    @Override
    public String toString() {
        return this.name + ", age: " + this.age;
    }
}
