package com.corejava;

import java.util.Scanner;

public class NameOfOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        while (true) {
            String nameAndAge = scanner.nextLine();
            if (nameAndAge.equals("")) {
                break;
            }
            String[] parts = nameAndAge.split(",");
            int age = Integer.valueOf(parts[1]);

            if (age > oldest) {
                oldest = age;
                name = parts[0];
            }

        }
        System.out.println("Name of the oldest: " + name);
    }
}
