package com.corejava;

import java.util.Scanner;

public class MultiplicationFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNum = scanner.nextInt();
        System.out.println("Give the second number:");
        int secondNum = scanner.nextInt();
        int multiply = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + multiply);

    }
}
