package com.corejava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int num = scanner.nextInt();
        int factorial = 1;
        if (num == 0) {
            factorial = 1;
            System.out.println("Factorial: " + factorial);
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
        }

    }
}
