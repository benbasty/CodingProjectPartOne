package com.corejava;

import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int sum = firstNum + secondNum;
        int squareRoot = (int) Math.sqrt(sum);
        System.out.println(squareRoot);
    }
}
