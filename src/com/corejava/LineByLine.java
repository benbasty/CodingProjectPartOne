package com.corejava;

import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] parts = word.split(" ");
        for (String st: parts) {
            System.out.println(st);
        }

    }
}
