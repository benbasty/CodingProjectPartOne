package com.corejava;

import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liquidFirstContainer = 0;
        int liquidFirstContainerFull = 100;
        int liquidSecondContainer = 0;
        int liquidSecondContainerFull = 100;
        int numberTobeAdded = 5;

        while (true) {
            System.out.println("First: " + liquidFirstContainer + "/" + liquidFirstContainerFull);
            System.out.println("Second: " + liquidSecondContainer + "/" + liquidFirstContainerFull);
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                liquidFirstContainer += amount;
                if (liquidFirstContainer > liquidFirstContainerFull) {
                    liquidFirstContainer = liquidFirstContainerFull;
                }
                if (amount < 0) {
                    liquidFirstContainer = liquidFirstContainerFull;
                }
            }
            if (command.equals("move")) {
                if (amount > 0) {
                    if (amount > liquidFirstContainer) {
                        liquidSecondContainer += liquidFirstContainer;
                        liquidFirstContainer = 0;
                    } else {
                        liquidFirstContainer -= amount;
                        liquidSecondContainer += amount;
                    }

                }
                if (liquidSecondContainer > liquidSecondContainerFull) {
                    liquidSecondContainer = liquidSecondContainerFull;
                }
            }

            if (command.equals("remove")) {
                if (amount > 0) {

                    if (liquidFirstContainer < 0 && liquidSecondContainer < 0) {
                        liquidFirstContainer = 0;
                        liquidSecondContainer = 0;
                    } else {
                        liquidSecondContainer -= amount;
                    }
                    if (liquidSecondContainer < 0) {
                        liquidSecondContainer = 0;
                    }
                }

            }

        }

    }
}
