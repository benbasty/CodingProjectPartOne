package com.corejava;

public class ConstructorOverload {
    public static void main(String[] args) {
        Product2 tapeMeasure = new Product2("Tape measure");
        Product2 plaster = new Product2("Plaster", "home improvement section");
        Product2 tyre = new Product2("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}
