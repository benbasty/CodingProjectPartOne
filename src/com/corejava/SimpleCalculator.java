package com.corejava;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNum = scanner.nextInt();
        System.out.println("Give the second number:");
        int secondNum = scanner.nextInt();
        int add = firstNum + secondNum;
        int minus = firstNum - secondNum;
        int multiply = firstNum * secondNum;
        double div = firstNum / secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + add);
        System.out.println(firstNum + " - " + secondNum + " = " + minus);
        System.out.println(firstNum + " * " + secondNum + " = " + multiply);
        System.out.println(firstNum + " / " + secondNum + " = " + div);
    }
}
