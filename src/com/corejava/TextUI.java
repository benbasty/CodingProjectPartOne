package com.corejava;

import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word,translation);
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                String translatedWord = dictionary.translate(toBeTranslated);
                if (translatedWord == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    System.out.println("Translation: " + translatedWord);
                }

            } else {
                System.out.println("Unknown command");
            }


        }
    }
}
