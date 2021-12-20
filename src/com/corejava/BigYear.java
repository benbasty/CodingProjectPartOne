package com.corejava;

import java.util.Scanner;

public class BigYear {
    private Scanner scanner;
    private BirdDatabase birds;

    public BigYear(Scanner scanner, BirdDatabase birds) {
        this.scanner = scanner;
        this.birds = birds;
    }
    public void startProgram() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("quit")) {
                break;
            }
            if (command.equalsIgnoreCase("add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin");
                String nameInLatin = scanner.nextLine();
                birds.add(name,nameInLatin);
            }
            if (command.equalsIgnoreCase("observation")) {
                System.out.print("Bird? ");
                String observation = scanner.nextLine();
                birds.observation(observation);
            }
            if (command.equalsIgnoreCase("all")) {
                birds.printAllBirds();
            }
            if (command.equalsIgnoreCase("One")) {
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                this.birds.printOneBird(birdName);
            }


        }
    }
}
