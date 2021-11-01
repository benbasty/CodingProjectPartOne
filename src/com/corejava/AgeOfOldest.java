package com.corejava;

import java.util.Scanner;

public class AgeOfOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String nameAndAge = scanner.nextLine();
            if (nameAndAge.equals("")) {
                break;
            }
            String[] parts = nameAndAge.split(",");
            int age = Integer.valueOf(parts[1]);

            if (age > oldest) {
                oldest = age;
            }

        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
