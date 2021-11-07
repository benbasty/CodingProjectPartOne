package com.corejava;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        System.out.println("Search for:");
        String searchFor = scanner.nextLine();

        try (Scanner readFile = new Scanner(Paths.get(fileName))) {
            while (readFile.hasNextLine()) {
                String wholeFile = readFile.nextLine();
                if (wholeFile.contains(searchFor)) {
                    System.out.println("Found!");
                } else {
                    System.out.println("Not Found.");
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }
    }
}
