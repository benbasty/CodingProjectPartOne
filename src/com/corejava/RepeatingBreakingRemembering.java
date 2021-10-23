package com.corejava;

import java.util.Scanner;

public class RepeatingBreakingRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int countEven = 0;
        int countOdd = 0;
        double average = 0;
        while(true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            count++;
            sum += num;
            average = (double) sum/count;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);

    }
}
