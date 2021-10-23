package com.corejava;

import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
