package com.corejava;

import java.util.Scanner;

public class SumOfSequence2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int firstNum = scanner.nextInt();
        System.out.print("Last number? ");
        int lastNum = scanner.nextInt();
        int sum = 0;
        for (int i = firstNum; i <= lastNum; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);



    }
}
