package com.corejava;

import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = scanner.nextInt();
        System.out.print("Upper bound? ");
        int upperBound = scanner.nextInt();
        try (Scanner readFile = new Scanner(Paths.get(file))){
            int count = 0;
            while (readFile.hasNextLine()) {
                int numbers = readFile.nextInt();

                if (numbers >= lowerBound && numbers <= upperBound) {
                    count++;
                }

            }
            System.out.println("Numbers: " + count);

        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
