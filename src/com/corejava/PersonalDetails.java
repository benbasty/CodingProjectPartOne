package com.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthDates = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            names.add(parts[0]);
            birthDates.add(Integer.valueOf(parts[1]));

        }
        String longest = names.get(0);
        for (String name: names) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        int sum = 0;
        double average = 0;
        for (Integer birthDate: birthDates) {
            sum += birthDate;
            average = (double) sum / birthDates.size();
        }

        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);
    }
}

