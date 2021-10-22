package com.corejava;

import java.util.Scanner;

public class AverageOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        double firstNum = scanner.nextDouble();
        System.out.println("Give the second number:");
        double secondNum = scanner.nextDouble();
        double average = (firstNum + secondNum) / 2;
        System.out.println("The average is " + average);
    }
}
