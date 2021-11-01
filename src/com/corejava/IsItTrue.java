package com.corejava;

import java.util.Scanner;

public class IsItTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a string: ");
        String strg = sc.nextLine();
        if (strg.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
