package com.corejava;

import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int sumPassing = 0;
        double average = 0;
        double averagePassing = 0;
        int count = 0;
        int countAllPoints = 0;
        double countPassing = 0;
        double passPercentage = 0;
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = scanner.nextInt();
            if (points == -1) {
                break;
            }
            countAllPoints++;
            if (points >= 0 && points <= 100) {
                count++;
                sum += points;
                average = (double) sum / count;
                if (points >= 50) {
                    countPassing++;
                    sumPassing += points;
                    averagePassing = (double) sumPassing / countPassing;
                    passPercentage = (double) 100 * (countPassing / count);

                }
            }

        }
        System.out.println("Point average (all): " + average);
        if (averagePassing == 0.0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + averagePassing);
        }
        System.out.println("Pass percentage: " + passPercentage);



    }
}
