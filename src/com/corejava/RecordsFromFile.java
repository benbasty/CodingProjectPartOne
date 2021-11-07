package com.corejava;

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:"); //dataa.txt
        String file = scanner.nextLine();
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                String lines = readFile.next();
                String[] parts = lines.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                if (age > 1) {
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
