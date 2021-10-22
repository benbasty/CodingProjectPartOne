package com.corejava;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        double firstNum = scanner.nextDouble();
        System.out.println("Give the second number:");
        double secondNum = scanner.nextDouble();
        System.out.println("Give the third number:");
        double thirdNum = scanner.nextDouble();
        double average = (firstNum + secondNum + thirdNum) / 3;
        System.out.println("The average is " + average);
    }
}
