package com.corejava;

import java.util.Scanner;

public class LiquidContainers3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        int firstContainerFull = 100;
        int secondContainerFull = 100;
        while (true) {
            System.out.println("First: " + firstContainer + "/" + firstContainerFull);
            System.out.println("Second: " + secondContainer + "/" + secondContainerFull);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            // The container can't hold more than a hundred liters
            // and everything added past that will go to waste.
            if (command.equalsIgnoreCase("add")) {

                if (amount > 0) {
                    firstContainer += amount;
                }
                if (firstContainer > 100) {
                    firstContainer = 100;
                }
            }

            // If the program is requested to move more liquid
            // than than the first container currently holds,
            // move all the remaining liquid.
            // The second container can't hold more than one hundred liters of liquid
            // and everything past that will go to waste.

            if (command.equalsIgnoreCase("move")) {
                if (amount > firstContainer) {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                } else {
                    firstContainer -= amount;
                    secondContainer += amount;
                }
                if (secondContainer > 100) {
                    secondContainer = 100;
                }
            }

            // If the program is requested to remove more liquid
            // than the container currently holds,
            // remove all the remaining liquid.

            if (command.equalsIgnoreCase("remove")) {
                if (amount > 0) {
                    secondContainer -= amount;
                }
                if (secondContainer < 0) {
                    secondContainer = 0;
                }
            }



        }
    }
}
