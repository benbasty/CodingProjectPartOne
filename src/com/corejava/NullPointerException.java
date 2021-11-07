package com.corejava;

public class NullPointerException {
    public static void main(String[] args) {
        Person ben = new Person("Ben",0);
        System.out.println(ben);
        Person bigBen = ben;
        bigBen = null;
        System.out.println(bigBen);
        bigBen.getAge();
    }
}
