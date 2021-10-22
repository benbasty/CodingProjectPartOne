package com.corejava;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int count = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num < 0) {
                continue;
            }
            count++;
            sum += num;
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            average = (double) sum/count;
            System.out.println(average);
        }

    }
}
