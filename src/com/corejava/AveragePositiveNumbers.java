package com.corejava;

import java.util.Scanner;

public class AveragePositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int sum = 0;
        int count = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num > 0) {
                count++;
                sum += num;
                average = (double) sum / count;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            average = (double) sum / count;
            System.out.println(average);
        }
    }
}
