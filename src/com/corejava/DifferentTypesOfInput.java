package com.corejava;

import java.util.Scanner;

public class DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String strng = scanner.nextLine();
        System.out.println("Give an integer:");
        int intger = scanner.nextInt();
        System.out.println("Give a double:");
        double dbl = scanner.nextDouble();
        System.out.println("Give a boolean:");
        boolean bln = scanner.nextBoolean();
        System.out.println("You gave the string " + strng);
        System.out.println("You gave the integer " + intger);
        System.out.println("You gave the double " + dbl);
        System.out.println("You gave the boolean " + bln);
    }
}
