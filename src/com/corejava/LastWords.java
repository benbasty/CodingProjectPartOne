package com.corejava;

import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stce = scanner.nextLine();
        String[] parts = stce.split(" ");
        System.out.println(parts[parts.length - 1]);
    }
}
