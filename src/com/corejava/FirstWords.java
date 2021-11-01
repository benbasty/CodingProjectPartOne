package com.corejava;

import java.util.Scanner;

public class FirstWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stce = scanner.nextLine();
        String[] parts = stce.split(" ");
        System.out.println(parts[0]);
    }
}
